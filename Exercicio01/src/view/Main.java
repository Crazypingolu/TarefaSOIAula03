package view;
// Trazer bibliotecas e pacotes:
import controller.RedesController;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Instancia de classe:
        RedesController met = new RedesController();
        // Definir variáveis:
        int menu = 0;
        // Entrada de dados: 
        while(true){
        // Processamento de dados:
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha: 1-ipv4 2-teste, 9-sair"));
            switch (menu) {
                case 1:
                    met.chamadaIp();
                    break;
                case 2:
                    met.bigTesteIP();
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
