package com.desafio.bancodigital;

public class Main {
    public static void main(String[] args) {

        Cliente primeiro = new Cliente();
        primeiro.setNome("Maicol");

        Conta cc = new ContaCorrente(primeiro);
        Conta cp = new ContaPoupanca(primeiro);

        cc.depositar(90);
        cc.transferir(20,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
