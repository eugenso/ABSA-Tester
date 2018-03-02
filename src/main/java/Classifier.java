
import uhh_lt.ABSA.ABSentiment.AbSentiment;
import uhh_lt.ABSA.ABSentiment.type.Result;

public class Classifier {


        public static void main(String[] args) {
            AbSentiment analyzer = new AbSentiment("configuration.txt");

            Result result = analyzer.analyzeText("Die Revision wird zurückgewiesen");

            // get class of text
            System.out.println(result.getText());
            System.out.println(result.getRelevance());
            System.out.println(result.getRelevanceScore());

            result = analyzer.analyzeText("hat es wegen Beihilfe zur Untreue in 30 Fällen zu einer Gesamtfreiheitsstrafe von drei Jahren verurteilt. Außerdem hat es eine rechtsstaatswidrige Verfahrensverzögerung festgestellt. _");

            // get class of text
            System.out.println(result.getText());
            System.out.println(result.getRelevance());
            System.out.println(result.getRelevanceScore());

        }

}
