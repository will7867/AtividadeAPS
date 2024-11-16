package edu.br.exercicio.models;

public class Turma {
  private Long codTurma;
  private String dataInicio;
  private int numeroVagas;
public Long getCodTurma() {
    return codTurma;
}
public void setCodTurma(Long codTurma) {
    this.codTurma = codTurma;
}
public String getDataInicio() {
    return dataInicio;
}
public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
}
public int getNumeroVagas() {
    return numeroVagas;
}
public void setNumeroVagas(int numeroVagas) {
    this.numeroVagas = numeroVagas;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codTurma == null) ? 0 : codTurma.hashCode());
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
    Turma other = (Turma) obj;
    if (codTurma == null) {
        if (other.codTurma != null)
            return false;
    } else if (!codTurma.equals(other.codTurma))
        return false;
    return true;
}


  
}
