public class Binary_Search {
     public int binary_search(int a[],int low,int high,int item)
     {
         if(low<high)
         {
             int mid=(low+high)/2;
             if(a[mid]==item)
                 return mid;
             else if(item>a[mid])
                 return binary_search(a,mid+1,high,item);
             else  return binary_search(a,low,mid-1,item);

         }
         return -1;
     }

    public static void main(String[] args) {
        int a[]={10,2,30,40,50};
        int size=a.length;
        int item=50;
        Binary_Search search=new Binary_Search();

       int temp=search.binary_search(a,0,size,item);
        if(temp==-1)
        {
            System.out.println("Element is not present in the given list");
        }
        else
        {
            System.out.println("the Element is present at index no:"+temp);

        }
    }
}
