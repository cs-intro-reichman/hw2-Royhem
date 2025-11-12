public class CalcPi {
    public static void main(String [] args) { 
        
        int count = Integer.parseInt(args[0]); 
        
        double sum = 0.0;
        
        double denominator = 1.0; 
        
        boolean Positive = true;

        for(int i = 0; i < count; i++) {
            
            double term = 1.0 / denominator; 
            
            if (Positive) {
                sum = sum + term;
                Positive = false; 
            }
            else {
                sum = sum - term;
                Positive = true;
            }
            
            denominator = denominator + 2.0;
        }

        
        double pi = sum * 4.0; 

        System.out.println("pi according to Java: 3.141592653589793");
        System.out.println("pi, approximated:     " + pi);
    }
}
