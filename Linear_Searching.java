public class Linear_Searching {

     public int linear_search(int a[],int size,int item)
     {
         for(int i=0;i<size;i++)
         {
             if(a[i]==item)
                 return i;

         }
         return -1;
     }

    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int size=a.length;
        Linear_Searching linear=new Linear_Searching();
        System.out.println(linear.linear_search(a,size,10));

    }
}
