class Main {
  public static void main(String[] args) {
    Cliente c1 = new Cliente("Vitor", "07898776545", 20);
    ContaCorrente cc = new ContaCorrente(9, 0001, 1000, c1, 2000);
    ContaCorrente cc1 = new ContaCorrente(5, 0001, 1000, c1, 3000);
    ContaPoupanca cp = new ContaPoupanca(1, 0001, 2000, c1);
    cc.exibirInformacoes();
    System.out.println(cc.sacar(3000));   
    System.out.println(cc.sacar(2000));
    cc.exibirInformacoes();   
    System.out.println(cc.sacar(2000));
    cc.exibirInformacoes(); 
    cc1.exibirInformacoes();
    cp.exibirInformacoes();
    System.out.println(cp.sacar(2000));
    cp.exibirInformacoes();
    System.out.println(cp.depositar(4000));
    cp.exibirInformacoes();
    System.out.println(cp.render());
    cp.exibirInformacoes();
  }
}