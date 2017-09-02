import java.util.HashSet;
import java.util.Set;

public class quchong {
    public static void main(String[] args){
        int[] a = new int[]{23,3,2,35,3,4,5,23,6};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }

        Object[] result = set.toArray();
        for(int i=0; i<set.size(); i++){
            System.out.println(result[i]);  //输出的项没有重复，并且按字母的前后顺序来排列
        }
    }
}
