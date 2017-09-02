# 数组排序
`Arrays.sort() `方法能改变原数组；该方法对char、String、int类型均适用。

	import java.util.Arrays;
	
	public class Main {
	    public static void main(String[] args){
	       int a[] = new int[]{23,3,6,8,4,5,13,1};
	        Arrays.sort(a);
	        System.out.println(Arrays.toString(a));
	    }
	}