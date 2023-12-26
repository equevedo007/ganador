package com.itsolutioncompany.ganador.dao;

import com.itsolutioncompany.ganador.interfaces.GanadorDAO;

public abstract class DAOFactory {
	
	public abstract GanadorDAO getJugadaGanadoraDAO();
	
	public static final int MYSQL=1;
	
public static DAOFactory getDAOFactory(int edinson){
		
		switch (MYSQL) {
		case 1:
			
			return new MySQLDAOFactory();

		default:
			return null;
		}
	}

}
