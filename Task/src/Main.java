import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        assignment();
    }
    public static void assignment(){
        Scanner in= new Scanner(System.in);
        boolean doesWantItAgain;
        do {

            System.out.print("Enter The Score : ");
            String scoreInput=in.next();
            if(isValidInput(scoreInput)){
                double score= Double.parseDouble(scoreInput);
                Grader instance=new Grader(score);
                if (instance.letterGrade() != null){
                    System.out.println("Your Grade : " + instance.letterGrade());
                }else {
                    System.out.println("It is invalid score");
                }
            }else {
                System.out.println("Invalid Input");
            }
            System.out.println("Do you want to use it again : (y/n)");
            String y= in.next();

            y=y.toLowerCase();

            doesWantItAgain= y.equals("y") || y.equals("yes");
            if(y.equals("n") || y.equals("no")){
                System.out.println("Thank You ");
            }

        }while (doesWantItAgain);
    }
    public static boolean isValidInput(String a){
        boolean t=true;
        for (int i=0; i<a.length();i++){
            if(!isNumber(a.charAt(i))){
                t=false;
                break;
            }
        }
        return t;
    }
    public static boolean isNumber(char a){
        return a<='9' && a>='0' || a=='.';
    }
}