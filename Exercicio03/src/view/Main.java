package view;
import controller.DistroController;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Instanciar classes:
        DistroController met = new DistroController();
        // Declarar variáveis:
        int menu;
        // Entrada e Processamento de dados:
        while(true){
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha:\n" + 
                "[1] - Verificar a versão do OS (Linux)\n" +
                "[9] - Fechar programa."));
                switch (menu) {
                    case 1:
                        met.tipoLinux();
                        break;
                    case 9:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida, digite novamente.");
                        break;
                }
                if (menu == 9)
                    break;
        }
    }
}
