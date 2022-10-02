import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)throws IOException {
        EPI epi=new EPI();
        Funcionario funcionario=new Funcionario();

        for (int i = 0; i < 3; i++) {

            String X= JOptionPane.showInputDialog("Nome " + i + ":");
            funcionario.retornoNome(X);
            funcionario.linhas.add(X);
            String Y= JOptionPane.showInputDialog("Registro " + i + ":");
            funcionario.retornoRegistro(Y);
            funcionario.linhas.add(Y);

            String Z= JOptionPane.showInputDialog("EPI " + i + ":");
            epi.retornoTipo(Z);
            epi.linhas.add(Z);
            String W= JOptionPane.showInputDialog("Codigo " + i + ":");
            epi.retornoCodigo(W);
            epi.linhas.add(W);
        }

        Path arquivo = Paths.get("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.2\\bin\\arquivo.txt");
        Files.write(arquivo,Comando.linhas);

        System.out.print("Fim...");
    }
}