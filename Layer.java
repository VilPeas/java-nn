import java.util.Arrays;

public class Layer {
    double[] biases = {2,3,0.5};
    double[][] weights = {{0.2, 0.8, -0.5, 1.0},
                            {0.5, -0.91, 0.26, -0.5},
                            {-0.26, -0.27, 0.17, 0.87}},
            inputs;
    int inputSize, layerSize;

    public Layer(int inputSize, int layerSize, double[][] inputs){
        this.inputSize = inputSize;
        this.layerSize = layerSize;
        this.inputs = inputs;
        Operations op = new Operations(biases);
        double[][] invertedMatrix = op.invertMatrix(inputs);
        double[][] newMatrix = op.multiplyMatrices(weights, invertedMatrix);
        System.out.println(Arrays.deepToString(newMatrix));
    }
}
