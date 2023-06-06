import java.util.Arrays;
import java.util.Random;

public class DenseLayer {
    int RANDOM_BOUND = 500;
    float[] forward, biases;
    float[][] weights;

    public DenseLayer(int inputSize, int layerSize){
        weights = generateRandomWeights(inputSize, layerSize);
        biases = new float[layerSize];
        System.out.println(Arrays.deepToString(weights));
        System.out.println(Arrays.toString(biases));
    }

    private float[] getForwardOutput(float[] inputs){
        float[] forward = new float[inputs.length];
        float[] dotProduct = dotProduct(inputs);
        for(int i=0 ; i<inputs.length ; i++){
            forward[i] = dotProduct[i] + biases[i];
        }
        return forward;
    }

    private float[] dotProduct(float[] inputs){
        float[] output = new float[inputs.length];
        for(int row=0 ; row<inputs.length ; row++){
            for(int col=0 ; col<inputs.length ; col++){
                output[row] += inputs[col] * weights[row][col];
            }
        }
        return output;
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
