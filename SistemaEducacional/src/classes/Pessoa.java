package classes;

public class Pessoa{

    protected String nome;
    protected int idade;
    protected String dataNascimento;
    protected String registroGeral;
    protected String numeroCpf;


    protected String nomePai;
    protected String nomeMae;




    /*Getters e Setters */

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) { this.nome = nome;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public String getDataNascimento(){return dataNascimento;}
    public void setDataNascimento(String dataNascimento){this.dataNascimento = dataNascimento;}

    public String getRegistroGeral(){return registroGeral;}
    public void setRegistroGeral(String registroGeral){ this.registroGeral = registroGeral;}

    public String getNomePai(){return nomePai;}
    public void setNomePai(String nomePai){this.nomePai = nomePai;}

    public String getNomeMae() { return nomeMae; }
    public void setNomeMae(String nomeMae){this.nomeMae = nomeMae;}

    public boolean pessoaMaiorIdade() {
        return idade >= 18;
    }
}
