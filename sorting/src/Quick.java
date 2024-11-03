import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int [] list={1,3,6,9,-1,-50,70,700,80,5,10};
        int [] list2={};
        int [] list3={-40,9,90,89,70,-66,-45,-6,88,12,15};
        System.out.println(Arrays.toString(quick(list,0,list.length-1)));
        System.out.println(Arrays.toString(quick(list2,0,list.length-1)));
        System.out.println(Arrays.toString(quick(list3,0,list.length-1)));
    }

    private static int[] quick(int[] list, int s, int e) {
        if(list.length<1)
        {
            return list;
        }
        if(s>=e)
        {
            return list;
        }
        int pivot=list[e];
        int start=s;
        int end=e;
        while(start<end)
        {
            // shift when you you did not find element bigger than bivot
         while(start<end&&list[start]<=pivot)
         {
             start++;
         }
            while(start<end&&list[end]>=pivot)
            {
                end--;
            }
            swap(list,start,end);

        }
        swap(list,start,e);
          quick(list,s,start-1);
          quick(list,start+1,e);
          return list;
    }


    private static void swap(int[] list, int i, int e) {
        int temp=list[i];
        list[i]=list[e];
        list[e]=temp;
    }

}
