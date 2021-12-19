public class EjercicioBurbuja {

    public static void main(String[] args) {


        int[] numerous ={70,9,3,15, -9, 55,28,48,99,42};
        int aux;



        for (int i=0;i<(10-1);i++){

           for (int j=0;j<(10-1);j++){

               if (numerous[j]>numerous[j+1]){

                   aux=numerous[j];
                   numerous[j]=numerous[j+1];
                   numerous[j+1]=aux;
               }
           }
        }

        for (int i=0;i<10;i++){
            System.out.println(numerous[i]);
        }




    }
}
