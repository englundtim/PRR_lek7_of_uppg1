import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int points = 0;

        System.out.println("Fråga 1");
        System.out.println("Hur många heltal finns det mellan 1 och 3?");
        String q1 = in.nextLine();
        if(q1.equalsIgnoreCase("1")||q1.equalsIgnoreCase("ett"))
        {
            points=points+1;
        }
        System.out.println("Fråga 2");
        System.out.println("Vilket år blev Eritria självständigt?");
        String q2 = in.nextLine();
        if(q2.equalsIgnoreCase("1993"))
        {
            points=points+1;
        }

        System.out.println("Fråga 3");
        System.out.println("Fråga Vad är 38745*0?");
        String q3 = in.nextLine();
        if(q3.equalsIgnoreCase("0")||q3.equalsIgnoreCase("noll"))
        {
            points=points+1;
        }

        System.out.println("Fråga 4");
        System.out.println("Vad är 0^0?");
        String q4 = in.nextLine();
        if(q4.equalsIgnoreCase("1")||q4.equalsIgnoreCase("ett"))
        {
            points=points+1;
        }

        System.out.println("Fråga 5");
        System.out.println("Är luddekuddebiffebuffehuffeknuffe simp för Woofie?");
        String q5 = in.nextLine();
        if(q5.equalsIgnoreCase("Ja"))
        {
            points=points+1;
        }

        System.out.println("Din poäng blev:   "+points+"/5");
    }
    
}
