package controller;
// Importar bibliotecas:
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
// Classe e processos:
public class RedesController {
    // SuperClass:
    public RedesController(){
        super();
    }
    // Chamando Os:
    private String os(){
        String os = System.getProperty("os.name");
        return os;
    }
    // Chamada de IP:
    public void chamadaIp(){
        // Sistema é Windows
        if (os().contains("Windows")){
            try{ // tenta executar o comando de ver o IP
                Process proc = Runtime.getRuntime().exec("IPCONFIG");
                String adpt = "";
                // lê os processos:
                InputStream fluxo = proc.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);
                BufferedReader buffer = new BufferedReader(leitor);
                String linha = buffer.readLine();
                // tratamento de dados:
                System.out.println(" ");
                while (linha != null){
                    if (linha.contains("Adaptador")){
                        adpt = linha;
                    } if (linha.contains("IPv4")){
                        System.out.println(adpt);
                        System.out.println(linha);
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
        // Sistema é Linux
        } else if (os().contains("Linux")){
            try{ // tenta executar o comando de ver o IP
                Process proc = Runtime.getRuntime().exec("ip addr");
                // lê os processos:
                InputStream fluxo = proc.getInputStream();
                InputStreamReader leitor = new InputStreamReader(fluxo);
                BufferedReader buffer = new BufferedReader(leitor);
                String linha = buffer.readLine();
                // tratamento de dados:
                while (linha != null){
                    if (linha.contains("inet"))
                        System.out.println(linha);
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
    // Chamada de ping
    public void bigTesteIP(){
     // Sistema é Windows
        if (os().contains("Windows")){
            try{ // tenta executar o comando de ver o IP
                Process proc = Runtime.getRuntime().exec("ping -4 -n 10 www.google.com.br");
                // lê os processos:
                InputStream flux = proc.getInputStream();
                InputStreamReader leit = new InputStreamReader(flux);
                BufferedReader buff = new BufferedReader(leit);
                String linha = buff.readLine();
                // tratamento de dados:
                System.out.println(" ");
                while (linha != null){
                    System.out.println(linha);
                    linha = buff.readLine();
                }
                // fechamento:
                buff.close();
                leit.close();
                flux.close();
            } catch (Exception e){ // não conseguiu
                System.err.println(e.getMessage());
            }
        // Sistema é Linux
        } else if (os().contains("Linux")){
            try{ // tenta executar o comando de ver o IP
                Process proc = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
                // lê os processos:
                InputStream flux = proc.getInputStream();
                InputStreamReader leit = new InputStreamReader(flux);
                BufferedReader buff = new BufferedReader(leit);
                String linha = buff.readLine();
                // tratamento de dados:
                while (linha != null){
                    System.out.println(linha);
                    linha = buff.readLine();
                }
                // fechamento:
                buff.close();
                leit.close();
                flux.close();
            } catch (Exception e){ // não conseguiu
                System.err.println(e.getMessage());
            }
        }
    }
}
