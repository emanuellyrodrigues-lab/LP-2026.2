package br.ufpb.dcx.emanuelly.biblioteca;
import javax.swing.*;

public class ProgramaBiblioteca {
    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            String opcao = JOptionPane.showInputDialog(
                    "Digite uma opção:\n"
                            + "1. Cadastrar livro\n"
                            + "2. Listar livros\n"
                            + "3. Sair"
            );

            if (opcao == null) {
                continuar = false;
                continue;
            }

            switch (opcao) {

                case "1":

                    JOptionPane.showMessageDialog(
                            null, "Vou cadastrar um livro..."
                    );

                    String titulo = JOptionPane.showInputDialog(
                            "Qual o título do livro?"
                    );

                    if (titulo == null) {
                        break;
                    }

                    String autor = JOptionPane.showInputDialog(
                            "Qual o nome do autor?"
                    );

                    if (autor == null) {
                        break;
                    }

                    Livro livro = new Livro(titulo, autor);

                    JOptionPane.showMessageDialog(
                            null,
                            "Livro criado:\n" + livro.toString()
                    );

                    break;

                    case "2":
                        JOptionPane.showMessageDialog(
                                null, "Listando livros..."
                        );

                        break;

                    case "3":

                        continuar = false;

                        break;

                    default:

                        JOptionPane.showMessageDialog(
                                null,
                                "Opção inválida. Tente novamente."
                        );

            }
        }

        System.out.println("FIM");

    }

}

