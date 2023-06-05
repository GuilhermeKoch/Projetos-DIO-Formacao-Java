package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.areaCliente.Cliente;

public class Estabelecimento {
    public static void main(String [] args){
            Cozinheiro cozinheiro = new Cozinheiro();
            //ações que estabelecimento precisa ter ciência
            cozinheiro.adicionarSucoNoBalcao();;
            cozinheiro.adicionarLancheNoBalcao();
            cozinheiro.adicionarComboNoBalcao();
            
            Almoxarife almoxarife = new Almoxarife();
            
            Atendente atendente = new Atendente();
            atendente.pegarLancheCozinha();
            atendente.receberPagamento();
            atendente.servindoMesa();
            
            Cliente cliente = new Cliente();
            cliente.escolherLanche();
            cliente.fazerPedido();
            cliente.pagarConta();
            
            //não deveria, mas o estabelecimento
            //ainda não definiu normas de atendimento
            cliente.pegarPedidoBalcao();
                       
    }
    
}
