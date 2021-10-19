

public class freq_Array {
    public static void main(String[] args) {
        int arr[] = new int [] {1,2,33,4,4,4,4,2};
        int frr[] = new int [arr.length];
        int visited = -1 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int count = 1;
            for(int j =i+1 ; j< arr.length ; j++)
            {
            if(arr[i] == arr[j])
        {
            count++;
            frr[j] = visited;
        }
    }


    if(frr[i] != visited)

        frr[i] = count ;
}
    System.out.println("------------------");
    System.out.println("Element | frequency");

    for(int i = 0 ; i < frr.length; i++)
    {
        if(frr[i] != visited)
        System.out.println(" " + arr[i] + "|" + frr[i]);
    }
System.out.println("-------------------");
    }
    }
    

