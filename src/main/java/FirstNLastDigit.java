/**
 * Created by M.Kumar on 6/3/2017.
 */
import java.util.*;
import java.lang.*;
import static java.lang.Math.pow;

class FirstNLastDigit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int b,count=-1;
        int[]sum=new int[1000];
        Scanner S=new Scanner(System.in);
        int T=S.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=S.nextInt();
            b=N%10;
            for (int j=N;(j%10)!=0;j=j/10)
                count++;
            double a=N/(pow(10,count));
            int s=(int)a;
            sum[i]=s+b;

            count=-1;
        }
        for(int i=0;i<T;i++)
            System.out.println(""+sum[i]);
    }
}
