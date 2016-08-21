import java.util.Stack;

public class HelloWorld{

    public static void main(String []args){
        removeRatingFromFilter ("exp1 and exp2");
        removeRatingFromFilter ("(exp1) and (exp2)");
        removeRatingFromFilter ("exp1 and (exp2)");
        removeRatingFromFilter ("(exp1) and exp2");
        removeRatingFromFilter ("(exp1 and exp2)");
        removeRatingFromFilter ("(exp1 and exp2 and (exp3))");
    }
     
    private static String removeRatingFromFilter(String filter){
        //if(filter == null || filter.length == 0 || !filter.contains("rating")) return filter;


        // remove outer braces
        int openBracketCount = 0;
        if (filter.charAt(0) == '(' && filter.charAt(filter.length() - 1) == ')'){
            for (int i = 0; i < filter.length() - 1; i++){
                if (filter.charAt(i) == '('){
                    openBracketCount ++;
                }

                if (filter.charAt(i) == ')'){
                    openBracketCount --;
                }

                if (openBracketCount == 0){
                    break;
                }
            }
        }
        if (openBracketCount <= 0)
            System.out.println (String.format("%s expression do not have outer brackets", filter));
        else
            System.out.println (String.format("%s expression have outer brackets", filter));
        // Find all the expressions



        return "";
    }
}
