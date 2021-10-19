

public class Two_D_Araays {
    
    public static void main(String[] args) {
   

        String str  = "madam";
        int n = str.length();
    
    char [] strarray = str.toCharArray();
        
        int i =0 ;
        int j = n-1;
        boolean ispendrom  = true ;
    
        while(i<= j)
        {
            if(strarray[i] != strarray[j]){
    
              
    
                ispendrom = false;
    
                break ;
            } 
    
            else{
    
                
                i++;
                j--;
            }
        }
    if(ispendrom){
        System.out.println("Given String is pelendron");
    }
    else{
        System.out.println("Given String is not pelendron");
    
    }
    }}

