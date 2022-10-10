class EPI extends Comando {
    String tipo;
    String codigo;

    public String retornoTipo(String tipo) {
        this.tipo = tipo;
        return tipo;
    }

    public String retornoCodigo(String codigo) {
        this.codigo = codigo;
        return codigo;
    }
}