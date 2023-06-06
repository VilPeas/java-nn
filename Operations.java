public class Operations {
    double[] biases;

    public Operations(double[] biases) {
        this.biases = biases;
    }

    protected double[][] invertMatrix(double[][] matrix){
        double[][] invertedMatrix = new double[matrix[0].length][matrix.length];
        for(int i=0 ; i<matrix[0].length ; i++){
            for(int j=0 ; j<matrix.length ; j++){
                invertedMatrix[i][j] = matrix[j][i];
            }
        }
        return invertedMatrix;
    }


    protected double[][] multiplyMatrices(double[][] matrixOne, double[][] matrixTwo) {
        double[][] result = new double[matrixOne.length][matrixTwo[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = multiplyMatricesCell(matrixOne, matrixTwo, i, j) + biases[i];
            }
        }
        return invertMatrix(result);
    }

    protected double multiplyMatricesCell(double[][] matrixOne, double[][] matrixTwo, int row, int col) {
        double cell = 0;
        for (int i = 0; i < matrixTwo.length; i++) {
            cell += matrixOne[row][i] * matrixTwo[i][col];
        }
        return cell;
    }

}
