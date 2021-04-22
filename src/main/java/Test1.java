public class Test1 {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна буква

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 сивмолов до

            (x|y|z) - одна строка из множества строк

            [abc] = (a|b|c)
            [a-zA-Z] - все англиские буквы
            [0-9] - все цифры = \\d
            [^abc] - мы хотим все символы кроме [abc]

            . - любой символ

            {2} - 2 символа до (\\d{2})
            {2, } - 2 и более символа до (\\d{2,})
            {2, 4} - от 2 до 4 символов (\\d{2,4})
         */

        String a = "-32342";
        String b = "32131";
        String c = "+432432";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "da23141212";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));

        String e = "hellob";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.googel.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com||ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com||ru)"));

        String f = "12";
        System.out.println(f.matches("\\d{2}"));
    }
}
