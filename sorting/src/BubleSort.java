import java.util.Arrays;



public class BubleSort {
    public static void main(String[] args) {
        int [] list={5,4,6,8,9};
        int [] list2={};
        int [] list3={5,-2,-4,0,6};
        bublesort(list);
        System.out.println(Arrays.toString(list));
        bublesort(list2);
        System.out.println(Arrays.toString(list2));
        bublesort(list3);
        System.out.println(Arrays.toString(list3));

    }

    private static void bublesort(int[] list) {
        for(int i=0 ; i<list.length;i++)
        {
            for(int j=1;j<list.length-i;j++)
            {
                if(list[j]<list[j-1])
                {
                    swap(list,j,j-1);
                }
            }

        }
    }

    private static void swap(int[] list, int j, int i) {
        int temp=list[i];
        list[i]=list[j];
        list[j]=temp;
    }

}
