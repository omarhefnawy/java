import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] list={1,4,5,5,56,44,55,54,34,55,444,56};
        int [] list2={};
        int [] list3={10,-2,-54,1,4,5,5,56,44,55,54,34,55,44,4,56,-10};
        System.out.println(Arrays.toString(mergeSort(list)));
        System.out.println(Arrays.toString(mergeSort(list2)));
        System.out.println(Arrays.toString(mergeSort(list3)));
    }

    private static int[] mergeSort(int[] list) {
        int size=list.length;
        if(size<2)
        {return list;}
        int mid=size/2;

        int[] leftHalf=mergeSort(Arrays.copyOfRange(list,0,mid));
        int[] rightHalf=mergeSort(Arrays.copyOfRange(list,mid,size));
       return merge(leftHalf,rightHalf);

    }

    private static int[] merge(int[] leftHalf, int[] rightHalf) {
        int l=0,r=0,m=0;
        int []mix=new int [rightHalf.length+leftHalf.length];
        while (l<leftHalf.length&&r<rightHalf.length)
        {
          if(leftHalf[l]<rightHalf[r])
          {
              mix[m]=leftHalf[l];
              l++;
          }
          else {
              mix[m]=rightHalf[r];
              r++;
          }
          m++;
         }
        while (l<leftHalf.length){
            mix[m]=leftHalf[l];
            l++;
            m++;
        }
        while (r<rightHalf.length){
            mix[m]=rightHalf[r];
        r++;
        m++;
        }

        return mix;
}
}
