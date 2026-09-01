import javax.swing.JOptionPane;

public class Oi {

    public static void mostreMensagemBoasVindas(String nome){
        System.out.println("Oi "+ nome);
        System.out.println("Como vai você?");
    }

    public static void main(String [] args){
        String nomeLido = JOptionPane.showInputDialog("Diga seu nome");
        mostreMensagemBoasVindas(nomeLido);

        System.out.println(3+4);
        System.out.println(3*4);
        System.out.println(30.0/4);
        System.out.println(15%2);
        System.out.println(15-2);


        //char letra = 'c';
        //double altura = 1.75;
        //float numeroReal = 8.87f;
        //boolean toComFome = true;

    }

}