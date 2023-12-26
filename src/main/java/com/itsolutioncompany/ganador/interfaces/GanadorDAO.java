package com.itsolutioncompany.ganador.interfaces;

import com.itsolutioncompany.ganador.bean.Numero01;
import com.itsolutioncompany.ganador.bean.Numero02;
import com.itsolutioncompany.ganador.bean.Numero03;
import com.itsolutioncompany.ganador.bean.Numero04;
import com.itsolutioncompany.ganador.bean.Numero05;
import com.itsolutioncompany.ganador.bean.Numero06;
import com.itsolutioncompany.ganador.bean.UltimaJugadaBean;


public interface GanadorDAO {
	
	public void BorrarSorteo();
	
	public void RealizarJugada();
	
	public Numero01 obtenerNumero01();
	
	public Numero02 obtenerNumero02();
	
	public Numero03 obtenerNumero03();
	
	public Numero04 obtenerNumero04();
	
	public Numero05 obtenerNumero05();
	
	public Numero06 obtenerNumero06();
	
	public UltimaJugadaBean UltimaJugada();
	


}
