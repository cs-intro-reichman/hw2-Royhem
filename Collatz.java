public class Collatz {
    public static void main(String [] args) {
        
        
        int N = Integer.parseInt(args[0]); 
		String mode1= args[1];
        boolean allr = true;
        int x=1;

		if ((N >0)&& (mode1.equals("v")))
		 {
                System.out.println("1 4 2 1 (4)");
		}
            
		
        
        for(int i = 2; i <= N; i++)
        {
            
            long j = i; 
            int count = 1; 
            String word = "" + i; 
            
            
            while (j > 1) 
            {
                if (j % 2 == 0) 
                {
                    j = j / 2;
                } 
                else 
                {
                    
                    j = j * 3 + 1;
                }
                
                count++;
                
                if (mode1.equals("v")) {
                    word = word + " " + j; 
                }
            }
            
            if (mode1.equals("v")) {
                System.out.println(word + " (" + count + ")");
            }
            
        } 

        if (allr) { 
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}
