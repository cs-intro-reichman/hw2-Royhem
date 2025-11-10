//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String first = args[0];
 		int num = Integer.parseInt(args[1]);
                int count = first.length();

                for(int i = 0;i<count;i++)       {
                     System.out.println("Give me an "+ first.charAt(i) + ": "+ first.charAt(i)+"!");

                }  
                        
                for(int z = 0;z<num;z++)       {

                     System.out.println(first+"!!!");


                }


        }
}
