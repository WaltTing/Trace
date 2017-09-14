#不确定行数跨行输入
示例：
> 牛牛想尝试一些新的料理，每个料理需要一些不同的材料，问完成所有的料理需要准备多少种不同的材料。

输入：
> 每个输入包含 1 个测试用例。每个测试用例的第 i 行，表示完成第 i 件料理需要哪些材料，各个材料用空格隔开，输入只包含大写英文字母和空格，输入文件不超过 50 行，每一行不超过 50 个字符。

输出：
> 输出一行一个数字表示完成所有料理需要多少种不同的材料。

如输入：
> BUTTER FLOUR HONEY FLOUR EGG

输出：
> 4

这道题其实很简单，居然是网易的笔试题，但问题在于，输入不好控制。正确的解法如：

	import java.util.HashSet;
	import java.util.Scanner;
	 
	public class Main {
	     
	    //下厨房
	    public static void main(String[] args) {
	         
	        Scanner in = new Scanner(System.in);
	        HashSet<String> set = new HashSet<String>();
	         
	        while(in.hasNext()){
	            String str = in.nextLine();
	            String arr[] = str.split(" ");
	            for(int i=0; i<arr.length; i++){
	                set.add(arr[i]);
	            }
	        }
	         
	        System.out.println(set.size());
	        set.clear();
	    }
	}