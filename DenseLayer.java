import java.util.Arrays;
import java.util.Random;

public class DenseLayer {
    int RANDOM_BOUND = 500;

    public DenseLayer(int inputSize, int layerSize, int outputSize){
        float[][] weights = generateRandomWeights(inputSize, layerSize);
        System.out.println(Arrays.deepToString(weights));
    }

    private float[][] generateRandomWeights(int inputSize, int layerSize){
        float[][] weights = new float[inputSize][layerSize];
        for(int i=0 ; i<inputSize ; i++ ){
            for(int j=0 ; j<layerSize ; j++ ){
                Random rn = new Random();
                float result = (rn.nextInt(RANDOM_BOUND) + 1);
                weights[i][j] = result/1000;
            }
        }
        return weights;
    }
}
