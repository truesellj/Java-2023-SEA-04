package Lab30331JavaStringMethods;

public class findString {
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;

        //getting index of character 's'
        result = str1.indexOf('s');
        System.out.println(result);

        result = str1.lastIndexOf('J');
        System.out.println(result);

        result = str1.lastIndexOf('a');
        System.out.println(result);

        result = str1.lastIndexOf('j');
        System.out.println(result);

        result = str1.lastIndexOf("ava");
        System.out.println(result);

        result = str1.lastIndexOf("java");
        System.out.println(result);
;    }
}
