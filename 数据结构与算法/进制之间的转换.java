public class shuzhi {
    public static void main(String[] args){
        int a = 234;
        String two = Integer.toBinaryString(a);  //十进制转二进制
        String eight = Integer.toOctalString(a); //十进制转八进制
        String Hex = Integer.toHexString(a);     //十进制转十六进制

        System.out.println(two);
        System.out.println(eight);
        System.out.println(Hex);

        int ten_one = Integer.valueOf(two);
        int ten_two = Integer.valueOf(eight);
        int ten_three = Integer.valueOf(Hex);

        System.out.println(ten_one);     //二进制转十进制
        System.out.println(ten_two);     //八进制转十进制
        System.out.println(ten_three);   //十六进制转十进制

    }
}
