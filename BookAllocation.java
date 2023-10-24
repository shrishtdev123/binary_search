public class BookAllocation
{

    public int book(int a[], int size, int m)
    {
        int start = max(a, size);// maximum of array should be start
        int end = sum(a, size);// sum of array should be end
        int ans = -1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            int page = 0;
            int count = 1;
            for (int i = 0; i < size; i++)
            {
                page = page + a[i];
                if (page > mid)
                {
                    count++;
                    page = a[i];
                }
            }
            if (count <= m)
            {
                ans = mid;
                end = mid - 1;
            } else
            {
                start = mid + 1;
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

    public static void main(String[] args)
    {
        BookAllocation t = new BookAllocation();
        int[] a = {19, 9, 30, 7};
        int size = a.length;
        int m = 4;
        System.out.println(t.book(a, size, m));
    }
}
