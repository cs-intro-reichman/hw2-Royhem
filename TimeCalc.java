public class TimeCalc {
    public static void main(String[] args) {


        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMin = Integer.parseInt(args[1]);
		int addToMin = addMin % 60; 
        int addToH = addMin / 60; 
        
        hours=hours +addToH; 
        minutes=minutes+addToMin;


        if (minutes>59) { 
            minutes=minutes%60;
            hours ++;
        }

        if (hours>23) { 
            hours=hours%24;
        }

        


        System.out.println(hours + ":"+ minutes);
        

    }
}   
