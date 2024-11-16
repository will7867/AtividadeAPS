package edu.br.exercicio.models;

public class Curso {
private Long cod;
private String nome;
private int cargaHoraria;
private float valor;
public Long getCod() {
    return cod;
}
public void setCod(Long cod) {
    this.cod = cod;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getCargaHoraria() {
    return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
}
public float getValor() {
    return valor;
}
public void setValor(float valor) {
    this.valor = valor;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cod == null) ? 0 : cod.hashCode());
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
    Curso other = (Curso) obj;
    if (cod == null) {
        if (other.cod != null)
            return false;
    } else if (!cod.equals(other.cod))
        return false;
    return true;
}



}
