package db;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Jugadores")
public class Jugador {
	@Id
	@GeneratedValue
	Long id;
	
	@Column(length = 128)
	String nombre;

	@Column(length = 128)
	String apellido;

	@Column(length = 128)
	String domicilio;

	Calendar nacimiento;

	@OneToOne
	Paleta paleta;

}
