import java.util.Scanner;

public class LeadersArray {
    public static void SubLeader(int [] array)
    {
        int i=0,count=1;
        for(i=0;i<array.length && count<array.length;count++)
        {
            if(array[i]<array[count])
            {
                i++;
                count=i;
            }
            if(count==array.length-1)
            {
                System.out.println(array[i]+" ");
                count=i;
                i++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]=scanner.nextInt();
        }

        SubLeader(Array);

    }
}
