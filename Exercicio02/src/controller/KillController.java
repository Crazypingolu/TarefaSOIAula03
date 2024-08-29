package controller;
// Importar bibliotecas:
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
// Classe e processos:
public class KillController {
    public KillController(){
        super();
    }
    // Classe pra achar Os:
    private String os(){
        String os = System.getProperty("os.name");
        return os;
    }
    // Lista de processos
    public void processos (){
        if (os().contains("Windows")) {
            try {
                Process proc = Runtime.getRuntime().exec("TASKLIST /FO TABLE");
                // ler os processos:
                InputStream flux = proc.getInputStream();
                InputStreamReader read = new InputStreamReader(flux);
                BufferedReader leitor = new BufferedReader(read);
                String line = leitor.readLine();
                // Tratamento:
                while (line != null){
                    System.out.println(line);
                    line = leitor.readLine();
                }
                // Fechar tudo:
                flux.close();
                leitor.close();
                read.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        if (os().contains("Linux")) {
            try {
                Process proc = Runtime.getRuntime().exec("ps -ef");
                // ler os processos:
                InputStream flux = proc.getInputStream();
                InputStreamReader read = new InputStreamReader(flux);
                BufferedReader leitor = new BufferedReader(read);
                String line = leitor.readLine();
                // Tratamento:
                while (line != null){
                    System.out.println(line);
                    line = leitor.readLine();
                }
                // Fechar tudo:
                flux.close();
                leitor.close();
                read.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
