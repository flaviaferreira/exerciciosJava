package exercicios;

public class Aluno implements Comparable<Aluno>{
    private String ra;
    
    private String nome;
    
    private Double nota1;
    
    private Double nota2;

    public Aluno() {
    }

    public Aluno(String ra, String nome, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public Double getMedia() {
        return (nota1 + nota2) / 2;
    }
    
    public String getSituacao() {
        if (getMedia() >= 6) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }        
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return nome + " - " + getMedia() + " - " + getSituacao();
    }
    
    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }
    
}
