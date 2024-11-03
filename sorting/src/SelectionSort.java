import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    private static void swap(int[] list, int end, int max) {
        int temp=list[end];
        list[end]=list[max];
        list[max]=temp;
    }
    ////////////////////////////////// max in range  from zero to end
    private static int maxInd(int[] list, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(list[i]>list[max])
            {
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] list={5,4,6,8,9};
        int [] list2={};
        int [] list3={5,-2,-4,0,6};
        int [] list4={5,-2,-4,-90,-5,40,10,0,6};
        selection(list);
        System.out.println(Arrays.toString(list));
        selection(list2);
        System.out.println(Arrays.toString(list2));
        selection(list3);
        System.out.println(Arrays.toString(list3));
        selection(list4);
        System.out.println(Arrays.toString(list4));
    }

    private static void selection(int[] list) {
        for (int i =0; i<list.length;i++)
        {
            int end= list.length-1-i;
            int max = maxInd(list,0,end);
            swap(list,end,max);
        }
    }








}
