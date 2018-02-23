package modelo;

import java.util.ArrayList;

public class Asignatura {
private int id;
private String nombre;
private int horas;
//ArrayList de la relacion
private ArrayList<Matricula> matriculas;





//GETTERS AND SETTERS

public ArrayList<Matricula> getMatriculas() {
	return matriculas;
}
public void setMatriculas(ArrayList<Matricula> matriculas) {
	this.matriculas = matriculas;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}

}
