package Atividade1;

import javax.swing.*;

public class MeuIMC {
    public static void main(String[] args) {
        String pesoString = JOptionPane.showInputDialog("Digite o peso: ");
        double peso = Double.parseDouble(pesoString);
        String alturaStr = JOptionPane.showInputDialog("Digite a altura: ");
        double altura = Double.parseDouble(alturaStr);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null,"Meu IMC é:" + imc);
    }

}
