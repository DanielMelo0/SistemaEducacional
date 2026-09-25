package classes;

public class Aluno extends Pessoa{
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;


    private Disciplina disciplina = new Disciplina();
    
    public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
    
    public Disciplina getDisciplina() {
		return disciplina;
	}
    
	public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    
    public double getMediaNota() {
    	return (disciplina.getNota1() + disciplina.getNota2()+ disciplina.getNota3() + disciplina.getNota4()) / 4;    	
    	
    	
    }

	public boolean getAlunoAprovado(){
    	double media = this.getMediaNota();
    	if (media >= 70) {
    		return true;
    	} else {
    		return false;
    	} 
    }
    
    
    public String getAlunoAprovado2(){
    	double media = this.getMediaNota();
    	if (media >= 70) {
    		return "Aluno está Aprovado";
    	} else {
    		return "Aluno está Reprovado";
    	}
    }






}
