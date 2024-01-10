package com.itsolutioncompany.ganador.principal;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;

import com.itsolutioncompany.ganador.bean.JugadaGanadoraBean;
import com.itsolutioncompany.ganador.servicio.ServicioJugadaGanadoraDAO;
import com.itsolutioncompany.ganador.test.CalcularTotalSorteos01;
import com.itsolutioncompany.ganador.test.CalcularTotalSorteos02;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class JFramePrincipal extends JFrame {
	
	public JTextField textNumero;
	

	public JFramePrincipal() {
		setResizable(false);
		setSize(600,700);
		setTitle("Edinson Ismael Quevedo Holguin");
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 564, 463);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 18));
		scrollPane.setViewportView(textArea);
		
		textNumero = new JTextField();
		textNumero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNumero.setBounds(161, 21, 119, 25);
		//textNumero.setDisabledTextColor();
		getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingresar Numero :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 21, 158, 27);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(e -> {

            ServicioJugadaGanadoraDAO servicio = new ServicioJugadaGanadoraDAO();

           int numero = CalcularTotalSorteos02.TotalDias();

            for (int i = 0; i < numero; i++) {
                servicio.RealizarJugada();
            }

            String numero01 = servicio.obtenerNumero01().getNumero01();
            String numero02 = servicio.obtenerNumero02().getNumero02();
            String numero03 = servicio.obtenerNumero03().getNumero03();
            String numero04 = servicio.obtenerNumero04().getNumero04();
            String numero05 = servicio.obtenerNumero05().getNumero05();
            String numero06 = servicio.obtenerNumero06().getNumero06();

            JugadaGanadoraBean ObjJugadaGanadoraBean = new JugadaGanadoraBean(numero01,numero02,numero03,numero04,numero05,numero06);

            ArrayList<JugadaGanadoraBean> lista = new ArrayList<>();
            lista.add(ObjJugadaGanadoraBean);


            textArea.setText("Total Numero de Registros -->>  "  + numero +"\n"+"\n") ;
            textArea.append("El Numero 01 es : " + numero01+"\n");
            textArea.append("El Numero 02 es : " + numero02+"\n");
            textArea.append("El Numero 03 es : " + numero03+"\n");
            textArea.append("El Numero 04 es : " + numero04+"\n");
            textArea.append("El Numero 05 es : " + numero05+"\n");
            textArea.append("El Numero 06 es : " + numero06+"\n"+"\n"+"\n");


            textArea.append("Ultima Jugada : "+
             servicio.UltimaJugada().getNumero01()+"-"+
             servicio.UltimaJugada().getNumero02()+"-"+
             servicio.UltimaJugada().getNumero03()+"-"+
             servicio.UltimaJugada().getNumero04()+"-"+
             servicio.UltimaJugada().getNumero05()+"-"+
             servicio.UltimaJugada().getNumero06()+"\n");

            for (JugadaGanadoraBean jugada : lista) {
                System.out.println("Numero 01: " + jugada.getNumero01());
                System.out.println("Numero 02: " + jugada.getNumero02());
                System.out.println("Numero 03: " + jugada.getNumero03());
                System.out.println("Numero 04: " + jugada.getNumero04());
                System.out.println("Numero 05: " + jugada.getNumero05());
                System.out.println("Numero 06: " + jugada.getNumero06());
                System.out.println("--------------------------------");
            }




        });
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(290, 21, 109, 27);
		getContentPane().add(btnNewButton);

		JButton btnBorrarSorteo = getBorrarSorteo(textArea);
		getContentPane().add(btnBorrarSorteo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private static JButton getBorrarSorteo(JTextArea textArea) {
		JButton btnBorrarSorteo = new JButton("Borrar Sorteo");
		btnBorrarSorteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ServicioJugadaGanadoraDAO servicio = new ServicioJugadaGanadoraDAO();
				servicio.BorrarSorte();
				System.out.println("Sorteo Borrado Correctamente");
				textArea.setText("Sorteo Borrado Correctamente...!!!");
			}
		});
		btnBorrarSorteo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBorrarSorteo.setBounds(422, 21, 152, 25);
		return btnBorrarSorteo;
	}
}
