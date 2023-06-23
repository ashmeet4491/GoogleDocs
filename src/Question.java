

public class Question
{
    private String ques;
    private String ans;

    Question()
    {
      ques="";
      ans="";

    }
    Question(String ques)
    {
      this.ques=ques;
      this.ans="";

    }
     String getText()
    {
      return ques;
    }

    String getAns()
    {
      return ans;
    }

    void setText(String Question)
    {
      this.ques=Question;

    }

    void setAns(String ans)
    {
      this.ans=ans;
     }

     boolean checkAnswer(String userResponse)
     {
         if(ans.equals(userResponse))
         {
             return true;
         }
         else
         {
             return false;
         }
     }

     void display()
     {
         System.out.println(ques);
     }


}
