import java.util.Scanner;
public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] perguntas = new String[3];
        String [][] itens = new String[3][3];
        int [] respostaCorreta = new int[3];
        int acertos = 0;

        perguntas[0] = "Carro tem?";
        itens[0][0] = "item 1:  4 Pneus";
        itens[0][1] = "item 2:  8 Pneus";
        itens[0][2] = "item 3:  98 Pneus";
        respostaCorreta[0] = 1;

        perguntas[1] = "Moto tem?";
        itens[1][0] = "item 1:  4 Pneus";
        itens[1][1] = "item 2:  2 Pneus";
        itens[1][2] = "item 3:  98 Pneus";
        respostaCorreta[1] = 2;

        perguntas[2] = "Bicicleta tem?";
        itens[2][0] = "item 1:  4 Pneus";
        itens[2][1] = "item 2:  8 Pneus";
        itens[2][2] = "item 3:  2 Pneus";
        respostaCorreta[2] = 3;

        for(int i=0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            for(int j=0; j < itens[i].length; j++){
                System.out.println(itens[i][j]);
            }
            int res = in.nextInt();
            if(res == respostaCorreta[i]){
                System.out.println("Resposta correta !");
                acertos=+1;
            }else{
                System.out.println("Resposta incorreta!");
            }
        }
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + (perguntas.length-acertos));
    }
}