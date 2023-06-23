import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends  Question
{
    List<String>choices;
    MultipleChoiceQuestion(String ques)
    {
        super(ques);
        choices=new ArrayList<>();

    }
    void addChoice(String choice,boolean correct)
    {
        choices.add(choice);
        if(correct)
        {
            String ans=""+choices.size();
            setAns(ans);
        }

    }

    void display()
    {
        super.display();
        for(int i=0;i<choices.size();++i)
        {
            System.out.println((i+1)+" "+choices.get(i));
        }
    }



}
