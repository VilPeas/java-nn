import java.util.Arrays;

/**
 * @author Vil Pietersen
 * @version 06/06/2023
 */
public class NeuralNetwork {
    /**
     * Main function for Neural Network
     * @param args the command line arguments (not used).
     */
    public static void main(String[] args) {
        double[][] X = {{1, 2, 3, 2.5},
                        {2.0,5.0,-1.0,2.0},
                        {-1.5, 2.7, 3.3, -0.8}};
        Layer layer1 = new Layer(X.length,5, X);
        // System.out.println(Arrays.deepToString(inputs));
    }
}
