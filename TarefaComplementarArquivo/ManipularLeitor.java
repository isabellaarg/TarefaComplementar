package TarefaComplementarArquivo;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManipularLeitor {

    public void leitorConta(String path) throws IOException {
        Banco banco = new Banco();

        String nomeArquivo = "C:/Users/chabe/Documents/Lp/Contas.txt";
        FileReader reader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha;

        while ((linha = bufferedReader.readLine()) != null) {
            String[] dadosConta = linha.split(",");
            String agencia = dadosConta[0]; //arrumar
            String numero = dadosConta[1];
            double saldo = Double.parseDouble(dadosConta[2]);
            Conta conta = new Conta(agencia, numero, saldo);

            banco.getContas().add(conta);
        }
        String nomeBanco = JOptionPane.showInputDialog("Escreva o nome do banco");
        banco.setNomeBanco(nomeBanco);
        banco.getNomeBanco();
        banco.calcularTotal();
        banco.imprimirSaldoGeral();




        bufferedReader.close();
    }

}
