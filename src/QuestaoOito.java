import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidades de funcionarios:");
        int qtdFuncionarios = in.nextInt();
        String[][] funcionarios = new String[qtdFuncionarios][4];
        for(int i = 0; i<funcionarios.length;i++){
            System.out.println("Nome:");
            funcionarios[i][0]=in.next();
            System.out.println("Salario:");
            funcionarios[i][1]=in.next();
        }
        funcionarios = calcBons(funcionarios);
        for(int i = 0; i<funcionarios.length;i++){
            System.out.println();
            System.out.println("Nome: "+funcionarios[i][0]);
            System.out.println("Salário: "+funcionarios[i][1]);
            if(Double.parseDouble(funcionarios[i][1])>2000){
                System.out.println("Desconto: "+funcionarios[i][2]);
            }else{
                System.out.println("Bonus: "+funcionarios[i][2]);
            }
            System.out.println("Salario liquido: "+funcionarios[i][3]);
            System.out.println();
        }
    }
    static String[][] calcBons(String[][] funcionarios){
        for(int i = 0; i<funcionarios.length; i++){
            double salario = Double.parseDouble(funcionarios[i][1]);
            if(salario<1000){
                double bonus = salario * 0.2;
                funcionarios[i][2] = Double.toString(bonus);
                funcionarios[i][3] = Double.toString(bonus+salario);
            }else if(salario<2000){
                double bonus = salario * 0.1;
                funcionarios[i][2] = Double.toString(bonus);
                funcionarios[i][3] = Double.toString(bonus+salario);
            }else{
                double desconto = salario * 0.1;
                funcionarios[i][2] = Double.toString(desconto);
                funcionarios[i][3] = Double.toString(salario-desconto);
            }
        }

        return funcionarios;
    }
}