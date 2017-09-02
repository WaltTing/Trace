**题目描述**

> 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整> > 数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后> 再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。 

输入：

> 第一行输入数组的元素个数N，第二行输入n个随机数组成的数组。

输出：

> 输出处理后的数组。

样例输入：

> 11   
> 10   
> 20    
> 40    
> 32   
> 67   
> 40  
> 20  
> 89          
> 300  
> 400   
> 15

输出：

> 10   
15  
20   
32   
40   
67   
89   
300  
400

分析和解答：

	import java.util.*;
	
	public class Huawei {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	
	            TreeSet<Integer> set = new TreeSet<>();   //TreeSet是在HashSet的基础上产生的
	            int n = sc.nextInt();					  //具有排序作用									
	            if (n > 0) {
	                for (int i = 0; i < n; i++) {
	                    set.add(sc.nextInt());
	                }
	            }
	            for (Integer key : set) {
	                System.out.println(key);
	            }
	        }
	    }
	}