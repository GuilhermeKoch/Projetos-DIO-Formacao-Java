package BancoDigital;

import BancoDigital.Contas.Conta;
import BancoDigital.Contas.contaCorrente;
import BancoDigital.Contas.contaPoupanca;

public class Main {
        public static void main(String[] args){

            Cliente guilherme = new Cliente();
            guilherme.setNome("Guilherme");

            
            Conta cc = new contaCorrente(guilherme);
            Conta cp = new contaPoupanca(guilherme);

            cc.depositar(200);

            cc.transferir(100, cp);

            cc.imprimirExtrato();
            cp.imprimirExtrato();
    }
}

