import java.util.*;

public class Permutation {
    // no element can not be ignored
    // you should add all
    public static void main(String[] args) {
        int[] list={1,2,3};
        int[] list2={1,2,3,4};
        int[] list3={1,2,3,4,5};
     // answer is size!
        System.out.println(helper(list));
        System.out.println("*******************************************************************");
        System.out.println(helper(list2));
        System.out.println("*******************************************************************");
        System.out.println(helper(list3));


    }

    private static List<ArrayList<Integer>> helper(int[] list) {
        List<ArrayList<Integer>> result= new ArrayList<>();
         permute (list,result, new ArrayList<>());
         return result;



    }

    private static void permute(int[] list, List<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if (temp.size()==list.length)
        {
           if(!result.contains(new ArrayList<>(temp)))
           {
               result.add(new ArrayList<>(temp));
               return;
           }

        }
        for(int i: list)
        {
            if(temp.contains(i))
            {
                continue;
            }
            temp.add(i);
            permute(list,result,temp);
            temp.remove(temp.size()-1);

        }
    }

}
