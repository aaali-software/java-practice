package problems;

public class TrailingString {

    public int isStringTrailing(String line) {
        String[] parts = line.split(",");
        
        if (parts.length != 2) return 0;
        
        String a = parts[0];
        String b = parts[1];
        
        return a.endsWith(b) ? 1 : 0;
    }

    public static void main(String[] args) {
        TrailingString ts = new TrailingString();
        System.out.println(ts.isStringTrailing("hello,lo")); // 1
        System.out.println(ts.isStringTrailing("hello,world")); // 0
        System.out.println(ts.isStringTrailing("abc,bc")); // 1
        System.out.println(ts.isStringTrailing("abc,abc")); // 1
        System.out.println(ts.isStringTrailing("abc,abcd")); // 0
    }

}
