class ContaPoupanca extends Conta{
  static final private double taxaJuros = 0.1375;

  ContaPoupanca(int numero, int agencia, double saldo, Cliente cliente){
    super(numero, agencia, saldo, cliente);
    tipo = "Conta Poupança";
  }

  boolean sacar(double qtd){
    if(saldo >= qtd){
      saldo -= qtd;
      return true;
    }
    return false;
  }

  double render(){
    saldo += (saldo * taxaJuros);
    return saldo;
  }
}