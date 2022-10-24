class ContaCorrente extends Conta{
  private final double limite;
  private double montanteDevedor = 0;

  ContaCorrente(int numero, int agencia, double saldo, Cliente cliente, double limite){
    super(numero, agencia, saldo, cliente);
    this.limite = limite;
    tipo = "Conta Corrente";
  }

  boolean sacar(double qtd){
    if((montanteDevedor+qtd) <= limite){
      saldo -= qtd;
      if(saldo < 0) montanteDevedor = (saldo * (-1));
      return true;
    }else{
      return false;
    }
  }

  boolean depositar(double qtd){
    if(montanteDevedor < qtd){
      saldo += (qtd - montanteDevedor);
      montanteDevedor-= qtd;
      return true;
    }else{
      montanteDevedor -= qtd;
      return false;
    }
  }

  double getLimite(){
    return limite;
  }

  double getMontanteDevedor(){
    return montanteDevedor;
  }
}