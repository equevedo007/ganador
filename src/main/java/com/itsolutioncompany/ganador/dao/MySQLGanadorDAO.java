package com.itsolutioncompany.ganador.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itsolutioncompany.ganador.bean.Numero01;
import com.itsolutioncompany.ganador.bean.Numero02;
import com.itsolutioncompany.ganador.bean.Numero03;
import com.itsolutioncompany.ganador.bean.Numero04;
import com.itsolutioncompany.ganador.bean.Numero05;
import com.itsolutioncompany.ganador.bean.Numero06;
import com.itsolutioncompany.ganador.bean.UltimaJugadaBean;
import com.itsolutioncompany.ganador.interfaces.GanadorDAO;
import com.itsolutioncompany.ganador.utils.ConexionBD;

public class MySQLGanadorDAO implements GanadorDAO {

	CallableStatement cs = null;
	ResultSet rs = null;;
	Connection cn = null;
	PreparedStatement pt = null;
	Numero01 objNumero01 = null;
	Numero02 objNumero02 = null;
	Numero03 objNumero03 = null;
	Numero04 objNumero04 = null;
	Numero05 objNumero05 = null;
	Numero06 objNumero06 = null;
	UltimaJugadaBean objUltimaJugadaBean=null;

	@Override
	public void BorrarSorteo() {

		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "call sp_borrarSorteo() ";
			cs = cn.prepareCall(sql);
			cs.execute();

		} catch (Exception e) {
			System.out.println("ERRROR : BorrarSorteo : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				cs.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :BorrarSorteo " + e.getMessage());
				e.printStackTrace();

			}
		}

	}

	@Override
	public void RealizarJugada() {

		try {
			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "call sp_insertBolilla()";
			cs = cn.prepareCall(sql);
			cs.executeUpdate();

		} catch (Exception e) {
			System.out.println("ERRROR : RealizarJugada" + e.getMessage());
		} finally {
			try {
				cs.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :RealizarJugada " + e.getMessage());
				e.printStackTrace();

			}
		}

	}

	@Override
	public Numero01 obtenerNumero01() {
		

		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero01, count(s.numero01) from sorteo s group by s.numero01 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero01 = new Numero01(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero01" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero01 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero01;

	}

	@Override
	public Numero02 obtenerNumero02() {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero02, count(s.numero02) from sorteo s group by s.numero02 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero02 = new Numero02(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero02" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero02 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero02;
	}

	@Override
	public Numero03 obtenerNumero03() {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero03, count(s.numero03) from sorteo s group by s.numero03 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero03 = new Numero03(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero03" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero03 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero03;
	}

	@Override
	public Numero04 obtenerNumero04() {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero04, count(s.numero04) from sorteo s group by s.numero04 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero04 = new Numero04(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero04" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero04 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero04;
	}

	@Override
	public Numero05 obtenerNumero05() {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero05, count(s.numero05) from sorteo s group by s.numero05 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero05 = new Numero05(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero05" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero05 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero05;
	}

	@Override
	public Numero06 obtenerNumero06() {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select s.numero06, count(s.numero06) from sorteo s group by s.numero06 order by 2 desc limit 1";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objNumero06 = new Numero06(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : obtenerNumero06" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :obtenerNumero06 " + e.getMessage());
				e.printStackTrace();

			}
		}
		return objNumero06;
	}

	@Override
	public UltimaJugadaBean UltimaJugada() {
		
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "select * from sorteo order by 1 desc";
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			if (rs.next()) {

				objUltimaJugadaBean = new UltimaJugadaBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}

		} catch (Exception e) {
			System.out.println("ERRROR : UltimaJugada" + e.getMessage());
		} finally {
			try {
				rs.close();
				pt.close();
				cn.close();

			} catch (SQLException e) {
				System.out.println("Error Cerrar Conexion :UltimaJugada " + e.getMessage());
				e.printStackTrace();

			}
		}
		
		return objUltimaJugadaBean;
	}


}
