package Array;

public class Abc {
    public static void main(String[] args) {
        int[] odata = {1,2,3,4,5};
        int[] values=getData(odata);
        sum(values);
    }

   static int[] getData(int[] array)
    {
        int[] ndata=new int[3];
        int j=0;
        for(int i=0;i<5;i++)
        {
            if (array[i]<4)
            {
                ndata[j]=array[i];
                j++;
            }
        }
        return ndata;
    }

  static  void sum(int[] farray)
    {
        int s=0;
        for (int x : farray) {
          s=s+x;
        }
        System.out.println(s);
    }
}
