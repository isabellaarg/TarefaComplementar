package TarefaComplementarArquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
    public String nomeBanco;
    ArrayList<Conta> contas = new ArrayList<>();
    double saldoTotal = 0.0;


    public Banco(String nomeBanco, ArrayList<Conta> contas) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public Banco() {
    }
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }



    public double calcularTotal() {
        for(Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }
    public void imprimirSaldoGeral() throws IOException{
        String nomeArquivo = "C:/Users/chabe/Documents/Lp/saldo_geral.txt";
        FileWriter writer = new FileWriter(nomeArquivo, true);
        writer.write("Banco " + getNomeBanco() + " possui o saldo geral de contas de: " + saldoTotal + "\n");
        writer.close();

    }


}
