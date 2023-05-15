package TarefaComplementarArquivo;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException {
        String path = "C:/Users/chabe/Documents/Lp/Contas.txt";
        ManipularLeitor m = new ManipularLeitor();
        m.leitorConta(path);

        String nomeCliente = JOptionPane.showInputDialog("Escreva o nome do cliente");
        Cliente cliente= new Cliente();
        cliente.setNomeCliente(nomeCliente);
    }
}
