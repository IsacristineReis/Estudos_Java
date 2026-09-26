package view;
import controller.QuickSortController;
public class QuickSort {
    public static void main(String[] args){
        int[] vetor = {5,10,1,4,7,34,2};
        QuickSortController quick = new QuickSortController();
        quick.ordenar(vetor);

        for(int i=0; i<vetor.length; i++)
            System.out.println("Vetor ["+i+"]: "+vetor[i]);
    }

}
