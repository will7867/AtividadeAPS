package edu.br.exercicio.models;

public class Matricula {
  private Long codMatricula;
  private String dataMatricula;
  private int numeroPrestacoes;
public Long getCodMatricula() {
    return codMatricula;
}
public void setCodMatricula(Long codMatricula) {
    this.codMatricula = codMatricula;
}
public String getDataMatricula() {
    return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
    this.dataMatricula = dataMatricula;
}
public int getNumeroPrestacoes() {
    return numeroPrestacoes;
}
public void setNumeroPrestacoes(int numeroPrestacoes) {
    this.numeroPrestacoes = numeroPrestacoes;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codMatricula == null) ? 0 : codMatricula.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Matricula other = (Matricula) obj;
    if (codMatricula == null) {
        if (other.codMatricula != null)
            return false;
    } else if (!codMatricula.equals(other.codMatricula))
        return false;
    return true;
}


  
}
