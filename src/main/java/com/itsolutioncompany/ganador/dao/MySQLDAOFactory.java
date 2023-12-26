package com.itsolutioncompany.ganador.dao;

import com.itsolutioncompany.ganador.interfaces.GanadorDAO;

public class MySQLDAOFactory extends DAOFactory{

	@Override
	public GanadorDAO getJugadaGanadoraDAO() {
		// TODO Auto-generated method stub
		return new MySQLGanadorDAO();
	}

}
