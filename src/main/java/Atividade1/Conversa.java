package Atividade1;

import javax.swing.*;

public class Conversa {
        public static void main(String[] args) {
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            String cidade = JOptionPane.showInputDialog("Digite sua cidade");

            JOptionPane.showMessageDialog(null,"Oi " + nome + "! Que legal saber que você é da cidade " + cidade );

        }
    }

