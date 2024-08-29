package controller;
// Importar bibliotecas:
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
public class DistroController {
    public DistroController(){
        super();
    }
    // Procedimento para reconhecer o sistema operacional: 
    private String os(){
        String os = System.getProperty("os.name");
        return os;
    }
    // Procedimento para ver a versão:
    public void chamadaIp(){
        // Sistema é Windows
        if (os().contains("Linux")){
            try{ // tenta executar o comando de ver o IP
                Process proc = Runtime.getRuntime().exec("cat /etc/os-release");
                // lê os processos:
                InputStream fluxo = proc.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);
                BufferedReader buffer = new BufferedReader(leitor);
                String linha = buffer.readLine();
                // tratamento de dados:
                System.out.println(" ");
                while (linha != null){
                    if (linha.contains("PRETTY")){
                        String[] array = linha.split("=");
                        System.out.println(array[1]);
                    }
                    linha = buffer.readLine();
                }
                // fechamento:
                buffer.close();
                leitor.close();
                fluxo.close();
            } catch (Exception e){ // não conseguiu
                System.err.println(e.getMessage());
            }
        }
    }
}
