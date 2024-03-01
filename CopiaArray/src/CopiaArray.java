public class CopiaArray {
    public static void main(String[] args) throws Exception {
    int []arrayOrigem;
    int[]arrayDestino;

    arrayOrigem = new int [20];
    for(int i = 0;i<arrayOrigem.length;i++){
        arrayOrigem[i]= i+1;

        System.out.println(arrayOrigem[i]);


    }

    arrayDestino = new int[arrayOrigem.length];

    System.out.println("depois");

    for(int i = 0; i<arrayOrigem.length;i++){

        arrayDestino[i]= arrayOrigem[i];

        }

        for(int i = 1; i<arrayOrigem.length;i+=2){

        arrayOrigem[i]=0;

        System.out.println(arrayDestino[i]);
    
        }

        
    







    }
}
