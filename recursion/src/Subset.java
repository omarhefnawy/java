import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
   int [] list={1,2,3};
        int [] list2={1,2,2};


        System.out.println(subset(list));
        System.out.println(subset(list2));
    }
    public static List<ArrayList<Integer>>subset(int [] list)
    {
        List<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        Arrays.sort(list);
        for(int num : list)
        {
            int size = outer.size();
            for(int i=0; i<size; i++)
            {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if (!outer.contains(inner)) {
                    outer.add(inner);
                }


            }
        }
        return outer;
    }
}
