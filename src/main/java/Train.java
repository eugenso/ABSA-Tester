

public class Train {

    public static void main(String[] args) {
        String[] arg = new String[1];
        arg[0] = "configuration.txt";

        // inducing features from training set and background corpus
        uhh_lt.ABSA.ABSentiment.PreComputeFeatures.main(arg);

        // training model
        uhh_lt.ABSA.ABSentiment.TrainAllClassifiers.main(arg);

    }

}
