package view;
// Trazer bibliotecas e pacotes:
import controller.KillController;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Instancia de classe:
        KillController met = new KillController();
        // Definir variáveis:
        int valor = 0;
        String nome = "";
        int menu;
        // Entrada e Processamento de dados:
        while(true){
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Menu de opções: \n" +
                                    "[1] - Ver processos. \n" +
                                    "[2] - Matar por PiD. \n" +
                                    "[3] - Matar por nome. \n" +
                                    "[9] - Finalizar programa."
                                    ));
            switch (menu) {
                case 1:
                    met.processos();
                    break;
                case 2:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o PiD: "));
                    met.mataPID(valor);
                    break;
                case 3:
                    nome = JOptionPane.showInputDialog("Digite o PiD: ");
                    met.mataNome(nome);
                    break;
                case 9:
                    break;
                default:
                    break;
            }
            if (menu == 9)
                break;
        }
    }
}
