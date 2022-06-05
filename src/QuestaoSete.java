import java.util.Scanner;
import java.util.Calendar;
    public class QuestaoSete{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String[][] usuarios = {
                    {"marcele1", "euadoroacompass"},
                    {"marcele2", "1234"}
            };

            System.out.println("Digite seu usuario:");
            String user = in.next();
            System.out.println("Digite sua senha:");
            String pass = in.next();

            boolean loged = isLogin(user, pass, usuarios);

            if(loged){
                message();
            }else{
                System.out.println("Usuario e/ou senha incorretos.");
            }
        }
        static boolean isLogin(String user, String pass,String[][] usuarios){
            for (String[] usuario : usuarios) {
                if (user.equals(usuario[0]) && pass.equals(usuario[1])) {
                    return true;
                }
            }
            return false;
        }
        static void message(){
            Calendar data = Calendar.getInstance();
            int hora = data.get(Calendar.HOUR_OF_DAY);
            if(hora<6){
                System.out.println("Boa madrugada, voce se logou ao nosso sistema.");
            }else if(hora<12){
                System.out.println("Bom dia, voce se logou ao nosso sistema.");
            }else if(hora<18){
                System.out.println("Boa tarde, voce se logou ao nosso sistema.");
            }else{
                System.out.println("Boa noite, voce se logou ao nosso sistema.");
            }
        }

    }
