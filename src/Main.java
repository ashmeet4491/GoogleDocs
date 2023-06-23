import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Question q=new Question();
        q.setText("who discovered AC current");
        q.setAns("Nikola Tesla");
        q.display();
        System.out.println("Your ans");
        String response=sc.nextLine();
        System.out.println(q.checkAnswer(response));
        MultipleChoiceQuestion first=new MultipleChoiceQuestion("What is " +
                "the orginal name of the java Language?");
        first.addChoice("*7",false);
        first.addChoice("Duke",false);
        first.addChoice("Ook",true);
        first.addChoice("Gosling",false);

        MultipleChoiceQuestion second=new MultipleChoiceQuestion("What is " +
                "the orginal name of the  country where java was born?");
        second.addChoice("Australia",false);
        second.addChoice("Canada",true);
        second.addChoice("Denmark",false);
        second.addChoice("USA",false);


        askQuestion(first);
        askQuestion(second);






    }

   public static void askQuestion(Question q)
    {
        q.display();
        System.out.println("Your ans");
        Scanner sc=new Scanner(System.in);
        String response=sc.nextLine();
        System.out.println(q.checkAnswer(response));


    }

}