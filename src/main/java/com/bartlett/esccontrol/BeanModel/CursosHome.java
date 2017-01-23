package com.bartlett.esccontrol.BeanModel;

import java.io.Serializable;

import com.bartlett.esccontrol.domain.Curso;
import com.bartlett.esccontrol.domain.Usuario;

public class CursosHome implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String asignatura;
	private int profesorId;
	private String profesorNombre;
	private String profesorImg;
	
	public CursosHome(Curso c){
		this.id = c.getCursoId();
		this.asignatura = c.getAsignatura();
		Usuario profe = c.getProfesor();
		this.profesorId = profe.getUsuarioId();
		this.profesorNombre = profe.getNombre() + " " + profe.getApellidoPaterno() + " " + profe.getApellidoMaterno();
		this.profesorImg = profe.getUrlImg();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getProfesorId() {
		return profesorId;
	}
	public void setProfesorId(int profesorId) {
		this.profesorId = profesorId;
	}
	public String getProfesorNombre() {
		return profesorNombre;
	}
	public void setProfesorNombre(String profesorNombre) {
		this.profesorNombre = profesorNombre;
	}
	public String getProfesorImg() {
		return profesorImg;
	}
	public void setProfesorImg(String profesorImg) {
		this.profesorImg = profesorImg;
	}

	@Override
	public String toString() {
		return "CursosHome [id=" + id + ", asignatura=" + asignatura + ", profesorId=" + profesorId
				+ ", profesorNombre=" + profesorNombre + ", profesorImg=" + profesorImg + "]";
	}

}
