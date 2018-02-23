package modelo;

import java.sql.Date;

public class Matricula {
private Date fecha;
//Atributos heredados de la relacion
private int id_alumno;
private int id_asignatura;




//GETTERS AND SETTERS

public int getId_alumno() {
	return id_alumno;
}
public void setId_alumno(int id_alumno) {
	this.id_alumno = id_alumno;
}
public int getId_asignatura() {
	return id_asignatura;
}
public void setId_asignatura(int id_asignatura) {
	this.id_asignatura = id_asignatura;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}



}
