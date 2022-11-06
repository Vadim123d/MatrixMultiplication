// ! класс неправильно считает матрицу
// ! Нужно сохранить этот класс в пакете, пакет тоже нужно создать - посмотреть как это делается в книге

public class MatrixMultiplication {

    // матрица 1 - первый множитель
    double [][] matrixOne_OneDimensional; // одномерная матрица 1
    double [][] matrixOne_TwoDimensional; // двумерная матрица 1
    int matrixOne_numberOfLine; // количество строк
    int matrixOne_numberOfColumns; // количество столбцов

    // матрица 2 - второй множитель

    double [][] matrixTwo_OneDimensional; // одномерная матрица 2
    double [][] matrixTwo_TwoDimensional; // двумерная матрица 2
    int matrixTwo_numberOfLine; // количество строк
    int matrixTwo_numberOfColumns; // количество столбцов

    // Матрица 3 - результат умножения
    double [][] matrixReturn_OneDimensional; // одномерная итоговая матрица
    double [][] matrixReturn_TwoDimensional; // двумерная итоговая матрица
    int matrixReturn_numberOfLine; // количество строк
    int matrixReturn_numberOfColumns; // количество столбцов

    // Промежуточная матрица для вычислений
    double [] matrixIntermediate_OneDimensional; // одномерная промежуточная матрица
    double [][] matrixIntermediate_TwoDimensional; // двумерная промежуточная матрица


    // ! Проверить возможность умножения перечисленных типов матриц:
    // умножение матриц 1х1
    // умножение матриц 2х1
    // умножение матриц 1х2
    // умножение матриц 2х2


    // конструктор для создания объекта для умножения матриц 2х2
    MatrixMultiplication (double [][] matrixOne_TwoDimensional, double [][] matrixTwo_TwoDimensional) {

        // переносим объекты-матрицы внутрь объекта вычисляющего эти матрицы
        this.matrixOne_TwoDimensional = matrixOne_TwoDimensional;
        this.matrixTwo_TwoDimensional = matrixTwo_TwoDimensional;

        // рассчитываем число строк и столбцов для матриц

        matrixOne_numberOfLine = matrixOne_TwoDimensional.length;
        matrixOne_numberOfColumns = matrixOne_TwoDimensional[0].length;  // кол-во столбцов матрицы 1

        matrixTwo_numberOfLine = matrixTwo_TwoDimensional.length;
        matrixTwo_numberOfColumns = matrixTwo_TwoDimensional[0].length; // кол-во столбцов матрицы 2

        matrixReturn_numberOfLine = matrixReturn_numberOfColumns = matrixOne_numberOfLine; // кол-во для итоговой матрицы

        matrixIntermediate_OneDimensional = new double[matrixOne_numberOfLine];
        matrixReturn_TwoDimensional = new double [matrixReturn_numberOfLine][matrixReturn_numberOfColumns];
    }



    // метод для умножения матриц 2х2
    double [][] matrixMultiplication_2x2 () {

        // Сначала итоговая матрица будет заполняться в рамках одной строки, затем перейдет на следующую и так далее
        for (int i = 0; i < matrixReturn_numberOfLine; i++) {  //выбирается строка ячейки итоговой матрицы
            for (int f = 0; f < matrixReturn_numberOfColumns; f++) { // выбирается столбец ячейки итоговой матрицы

                // далее идет перебирание столбцов матрицы 1 и строк матрицы 2 (индексы равны)
                for (int g =0; g < matrixOne_numberOfLine; g++) {
                    matrixIntermediate_OneDimensional [g] =
                            matrixOne_TwoDimensional [i][g] * matrixTwo_TwoDimensional [g][f];
                }

                    double sum = 0;
                    for (double a : matrixIntermediate_OneDimensional) { // все значения их промежуточного массива суммируются
                        sum = sum + a;
                    }

                    matrixReturn_TwoDimensional [i][f] = sum;
                }

            }
        return matrixReturn_TwoDimensional;
    }

}








