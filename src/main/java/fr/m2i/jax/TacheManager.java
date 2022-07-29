package fr.m2i.jax;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.m2i.models.Tache;

@Path("/tache")
public class TacheManager {
	
	@Produces({MediaType.APPLICATION_JSON})
	@GET
	public List<Tache> listeTache() {
		
		List<Tache> taches = new ArrayList<Tache>();
		
		taches.add(new Tache("Cuisine", "Faire la cuisine", LocalDateTime.now()));
		taches.add(new Tache("Vaisselle", "Faire la vaisselle", LocalDateTime.now()));
		taches.add(new Tache("Jouer", "Jouer au foot", LocalDateTime.now()));
		taches.add(new Tache("Coder", "Faire un Jax", LocalDateTime.now()));
		
		return taches;
		
	}
	
}
