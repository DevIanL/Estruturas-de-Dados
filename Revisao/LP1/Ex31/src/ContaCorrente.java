package Revisao.LP1.Ex31.src;

public class ContaCorrente extends ContaBancaria {
    private double cheque_especial;
    
    public ContaCorrente(){
        super();
        cheque_especial = 500;
    }

    public String sacar(double saque){  
        String retorno = "";
        if(saque<=saldo+cheque_especial){
            saldo = saldo - saque;
            retorno = "Valor sacado foi: " + saque;
        }else{
            retorno = "nao é possivel sacar este valor. ";
        }
        return retorno;
    }
}
