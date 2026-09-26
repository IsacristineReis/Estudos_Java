package controller;

public class MergeSortController{

    public MergeSortController(){
        super();
    }

    // Chamada da recursiva
    public void ordenar(int[] vetor){
        merge(vetor, 0, vetor.length - 1);
    }

    // Dividir o vetor
    // Recursiva
    public void merge(int[] vetor, int inicio, int fim){
        int meio;
        if(inicio<fim){
            meio = (inicio+fim)/2;
            // Aqui Ocorre a recursiva
            merge(vetor, inicio, meio);
            merge(vetor, meio+1, fim);
            // faça a chamada da próxima recursiva
            intercala(vetor, inicio, fim, meio);
        }
    }

    // Ordena os "vetores"
    public void intercala(int[] vetor, int inicio, int fim, int meio){
        // 
        int poslivre, inicio_vetor1, inicio_vetor2;
        // Criação de um vetor auxiliar
        int aux[] = new int[vetor.length];
        //
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;
        while(inicio_vetor1 <= meio && inicio_vetor2 <= fim){
            if (vetor[inicio_vetor1] <= vetor[inicio_vetor2]){
                aux[poslivre++] = vetor[inicio_vetor1++];
            } else{
                aux[poslivre++] = vetor[inicio_vetor2++];
            }
        }
        for(int i=inicio_vetor1; i<=meio; i++)
            aux[poslivre++] = vetor[i];
        for(int i=inicio_vetor2; i<=fim; i++)
            aux[poslivre++] = vetor[i];
        for(int i=inicio; i<=fim; i++)
            vetor[i] = aux[i];
    }
}