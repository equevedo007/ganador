package com.itsolutioncompany.ganador.bean;

import java.io.Serializable;

public class sorteo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private int idsorteo; 
	private String numero01; 
	private String numero02; 
	private String numero03; 
	private String numero04; 
	private String numero05; 
	private String numero06;
	public sorteo(int idsorteo, String numero01, String numero02, String numero03, String numero04, String numero05,
			String numero06) {
		super();
		this.idsorteo = idsorteo;
		this.numero01 = numero01;
		this.numero02 = numero02;
		this.numero03 = numero03;
		this.numero04 = numero04;
		this.numero05 = numero05;
		this.numero06 = numero06;
	}
	public int getIdsorteo() {
		return idsorteo;
	}
	public void setIdsorteo(int idsorteo) {
		this.idsorteo = idsorteo;
	}
	public String getNumero01() {
		return numero01;
	}
	public void setNumero01(String numero01) {
		this.numero01 = numero01;
	}
	public String getNumero02() {
		return numero02;
	}
	public void setNumero02(String numero02) {
		this.numero02 = numero02;
	}
	public String getNumero03() {
		return numero03;
	}
	public void setNumero03(String numero03) {
		this.numero03 = numero03;
	}
	public String getNumero04() {
		return numero04;
	}
	public void setNumero04(String numero04) {
		this.numero04 = numero04;
	}
	public String getNumero05() {
		return numero05;
	}
	public void setNumero05(String numero05) {
		this.numero05 = numero05;
	}
	public String getNumero06() {
		return numero06;
	}
	public void setNumero06(String numero06) {
		this.numero06 = numero06;
	}
	
	

}
