class Conta{
  protected final int id;
  protected final int numero;
  protected final int agencia;
  static protected int cont = 0;
  protected double saldo;
  protected static String tipo;
  protected final Cliente cliente;

  Conta(int numero, int agencia, double saldo, Cliente cliente){
    cont++;
    id = cont;
    this.numero = numero;
    this.agencia = agencia;
    this.saldo = saldo;
    this.cliente = cliente;
  }
  
  boolean sacar(double qtd){
    return true;
  } 
  
  boolean depositar(double qtd){
    saldo += qtd;
    return true;
  }

  int getId(){
    return id;
  }

  int getNumero(){
    return numero;
  }
  int getAgencia(){
    return agencia;
  }
  double getSaldo(){
    return saldo;
  }
  String getTipo(){
    return tipo;
  }
  Cliente getCliente(){
    return cliente;
  }
  void exibirInformacoes(){
    cliente.listar();
    System.out.println(tipo + "\nId: " + id + "\nNúmero da Conta: " + numero + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n");  
  }
  
}