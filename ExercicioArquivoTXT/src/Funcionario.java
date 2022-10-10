

class Funcionario extends Comando{
    String nome;
    String registro;

    public String retornoNome(String nome){
        this.nome=nome;
        return nome;
    }

    public String retornoRegistro(String registro){
        this.registro=registro;
        return registro;
    }
}
