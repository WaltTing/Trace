public class Shuzhizhuanhuan {
    public static void main(String[] args){
        char ch = '1';
        //��char����ת��ΪString���ͣ�Ȼ����Integer.parseInt()��ת����ʮ����
        int a = Integer.parseInt(String.valueOf(ch));
        int b = a + 1;
        System.out.println(b);
    }
}
