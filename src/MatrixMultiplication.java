// ! ����� ����������� ������� �������
// ! ����� ��������� ���� ����� � ������, ����� ���� ����� ������� - ���������� ��� ��� �������� � �����

public class MatrixMultiplication {

    // ������� 1 - ������ ���������
    double [][] matrixOne_OneDimensional; // ���������� ������� 1
    double [][] matrixOne_TwoDimensional; // ��������� ������� 1
    int matrixOne_numberOfLine; // ���������� �����
    int matrixOne_numberOfColumns; // ���������� ��������

    // ������� 2 - ������ ���������

    double [][] matrixTwo_OneDimensional; // ���������� ������� 2
    double [][] matrixTwo_TwoDimensional; // ��������� ������� 2
    int matrixTwo_numberOfLine; // ���������� �����
    int matrixTwo_numberOfColumns; // ���������� ��������

    // ������� 3 - ��������� ���������
    double [][] matrixReturn_OneDimensional; // ���������� �������� �������
    double [][] matrixReturn_TwoDimensional; // ��������� �������� �������
    int matrixReturn_numberOfLine; // ���������� �����
    int matrixReturn_numberOfColumns; // ���������� ��������

    // ������������� ������� ��� ����������
    double [] matrixIntermediate_OneDimensional; // ���������� ������������� �������
    double [][] matrixIntermediate_TwoDimensional; // ��������� ������������� �������


    // ! ��������� ����������� ��������� ������������� ����� ������:
    // ��������� ������ 1�1
    // ��������� ������ 2�1
    // ��������� ������ 1�2
    // ��������� ������ 2�2


    // ����������� ��� �������� ������� ��� ��������� ������ 2�2
    MatrixMultiplication (double [][] matrixOne_TwoDimensional, double [][] matrixTwo_TwoDimensional) {

        // ��������� �������-������� ������ ������� ������������ ��� �������
        this.matrixOne_TwoDimensional = matrixOne_TwoDimensional;
        this.matrixTwo_TwoDimensional = matrixTwo_TwoDimensional;

        // ������������ ����� ����� � �������� ��� ������

        matrixOne_numberOfLine = matrixOne_TwoDimensional.length;
        matrixOne_numberOfColumns = matrixOne_TwoDimensional[0].length;  // ���-�� �������� ������� 1

        matrixTwo_numberOfLine = matrixTwo_TwoDimensional.length;
        matrixTwo_numberOfColumns = matrixTwo_TwoDimensional[0].length; // ���-�� �������� ������� 2

        matrixReturn_numberOfLine = matrixReturn_numberOfColumns = matrixOne_numberOfLine; // ���-�� ��� �������� �������

        matrixIntermediate_OneDimensional = new double[matrixOne_numberOfLine];
        matrixReturn_TwoDimensional = new double [matrixReturn_numberOfLine][matrixReturn_numberOfColumns];
    }



    // ����� ��� ��������� ������ 2�2
    double [][] matrixMultiplication_2x2 () {

        // ������� �������� ������� ����� ����������� � ������ ����� ������, ����� �������� �� ��������� � ��� �����
        for (int i = 0; i < matrixReturn_numberOfLine; i++) {  //���������� ������ ������ �������� �������
            for (int f = 0; f < matrixReturn_numberOfColumns; f++) { // ���������� ������� ������ �������� �������

                // ����� ���� ����������� �������� ������� 1 � ����� ������� 2 (������� �����)
                for (int g =0; g < matrixOne_numberOfLine; g++) {
                    matrixIntermediate_OneDimensional [g] =
                            matrixOne_TwoDimensional [i][g] * matrixTwo_TwoDimensional [g][f];
                }

                    double sum = 0;
                    for (double a : matrixIntermediate_OneDimensional) { // ��� �������� �� �������������� ������� �����������
                        sum = sum + a;
                    }

                    matrixReturn_TwoDimensional [i][f] = sum;
                }

            }
        return matrixReturn_TwoDimensional;
    }

}








