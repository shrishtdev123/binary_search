public class Painter_partion
{
        public int painter_partion(int a[],int size,int m)
        {
            if(m>size)
            {
                return -1;
            }

            int start=max(a,size);
            int end=sum(a,size);
            int ans=-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                int page=0;
                int count=1;
                for(int i=0;i<size;i++)
                {
                    page=page+a[i];
                    if(page>mid)
                    {
                        count=count+1;
                        page=a[i];
                    }
                }
                if(count<=m)
                {
                     ans=mid;
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
             return ans;
        }

    public int max(int a[], int size)
    {
        int max = a[0];
        for (int i = 0; i < size; i++)
        {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int sum(int a[], int size)
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Painter_partion t = new Painter_partion();
        int[] a = {5, 10, 30, 20,15};
        int size = a.length;
        int m = 3;
        System.out.println(t.painter_partion(a, size, m));
    }

}
