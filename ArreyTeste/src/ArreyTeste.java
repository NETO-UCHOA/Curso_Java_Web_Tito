
public class ArreyTeste {
    public static void main(String[] args) throws Exception {
    int[]arrayUm;
    int[]arrayDois;

    arrayUm = new int[10];
    for(int i = 0; i<arrayUm.length;i++){
        arrayUm[i] = i+1;

        System.out.println("arrayUm: "+arrayUm[i]);

    }
    
    arrayDois = arrayUm;
    arrayDois[4] = arrayDois[4]*2;
    System.out.println("array depois");

    for(int i = 0;i<arrayUm.length;i++){
    
        System.out.println(arrayUm[i]);


    }

    }
}
