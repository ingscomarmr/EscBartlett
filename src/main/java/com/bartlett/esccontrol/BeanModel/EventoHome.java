package com.bartlett.esccontrol.BeanModel;

import java.io.Serializable;

import com.bartlett.esccontrol.domain.Evento;

public class EventoHome implements Serializable{
 static final long serialVersionUID = 1L;
 
	private long date;
	private String type;
	private String title;
	private String description;
	private String url;
	
	public EventoHome(){}
	
	public EventoHome(Evento e){
		this.date = e.getFechaEvento().getTime();
		this.type = "meeting";
		this.title = e.getTitulo();
		this.description = e.getMensaje();
		this.url = "";
	}
	
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "EventoHome [date=" + date + ", type=" + type + ", title=" + title + ", description=" + description
				+ ", url=" + url + "]";
	}
}
