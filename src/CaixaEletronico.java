/****************************************************************************
 * Simula uma operação de solicitação de saque no terminal Eletônico
 * 
 */
public class CaixaEletronico {
    public static void main(String[] args) {

        //     Valor do saldo do cliente na conta.
        double nSaldo = 25.0;

        //     Valor Solicitado pelo cliente no terminal.
        double nVlrSlctdo = 17.0;
 
        // Se o valor solicitado for Menor que o valor de saldo na conta do cliente. realiza a oprração    
        if(nVlrSlctdo < nSaldo)
            nSaldo = nSaldo - nVlrSlctdo;
 
         System.out.println(nSaldo);
 
     }    
}
