public class ArrayBidimensionalContador {


    int [][] myArray;

    public ArrayBidimensionalContador(int filas,int columnas){
        myArray=new int[filas][columnas];
    }

    public void rellenar(){

        int contador=0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j]=contador;
                contador++;
            }
        }
    }

    public void draw(){
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
