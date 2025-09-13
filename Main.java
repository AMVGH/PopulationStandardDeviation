public class Main {
    public static void main(String[] args){
        int[] values = {10, 12, 23, 23, 16, 23, 21, 16};
        int N = values.length;

        //Population Mean
        float populationMean = 0;
        for (int i = 0; i < values.length; i++){
            populationMean += values[i];
        }
        populationMean = populationMean / N;

        //Summation
        float sumValue = 0;
        for (int i = 0; i < values.length; i++){
            float intermediateSum = (float) Math.pow(values[i] - populationMean, 2);
            sumValue += intermediateSum;
        }

        //Division
        sumValue = sumValue / N;

        //Square Root Last
        float populationStdDev = (float) Math.sqrt(sumValue);
        System.out.println(populationStdDev);
    }
}
