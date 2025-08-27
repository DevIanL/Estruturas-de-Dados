package Revisao.LP1.Ex31.src;

public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(){
       super();
    }

    public String render(double taxa){
        saldo += saldo*(taxa/100);
        return "Rendeu " + taxa + "%";
    }
}
