public class StringB {
    public static void main(String[] args){
        String str1 = "hello Xiaochen";
        String str2 = "and XiaoHuang!";

        String str_one = str1 + str2;
        System.out.println(str_one);

        StringBuffer temp = new StringBuffer();   //效率要比String的拼接方式高很多
        String str_two = temp.append(str1).append(str2).toString();
        System.out.println(str_two);
    }
}
