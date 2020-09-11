package db;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;



@Entity
@Table(name="Partidos")
public class Partido {
	@Id
	@GeneratedValue
	Long id;
	
	@ManyToOne
	Cancha cancha;

	@ManyToOne
	Color colorCancha;

	@OneToOne
	Reserva reserva;
	
	@ManyToMany
	@JoinTable(name = "Participacion")
	List<Jugador> jugadores = new ArrayList<Jugador>();
	@ManyToMany
	@JoinTable(name = "Participacion")
	
	List<Paleta> paletas = new ArrayList<Paleta>();

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cancha getCancha() {
		return cancha;
	}
	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}
	public Color getColorCancha() {
		return colorCancha;
	}
	public void setColorCancha(Color colorCancha) {
		this.colorCancha = colorCancha;
	}
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public List<Paleta> getPaletas() {
		return paletas;
	}
	public void setPaletas(List<Paleta> paletas) {
		this.paletas = paletas;
	}
}
