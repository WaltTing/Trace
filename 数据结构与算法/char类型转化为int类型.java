public class Shuzhizhuanhuan {
    public static void main(String[] args){
        char ch = '1';
        //将char类型转化为String类型，然后用Integer.parseInt()来转化成十进制
        int a = Integer.parseInt(String.valueOf(ch));
        int b = a + 1;
        System.out.println(b);
    }
}
