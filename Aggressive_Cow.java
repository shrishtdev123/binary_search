public class Aggressive_Cow
{
    public int Koko_banana(int a[], int n, int k)
    {
        for (int i = 1; i <= n; i++) // Changed the loop to iterate from 1 to n inclusive
        {
            int sum = 0;
            for (int j = 0; j < n; j++) // Corrected the loop bounds
            {
                sum += a[j] / i;
            }
            if (sum <= k) // Changed the condition to sum >= k
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Aggressive_Cow t = new Aggressive_Cow();
        int[] a = {3, 6, 11, 7};
        int n = a.length;
        int k = 8;
        System.out.println(t.Koko_banana(a, n, k));
    }
}
