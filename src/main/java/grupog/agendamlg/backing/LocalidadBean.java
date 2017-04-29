package grupog.agendamlg.backing;

import grupog.agendamlg.entities.Localidad;
import grupog.agendamlg.entities.Provincia;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author Jean Paul Beaudry
 */
@Named(value = "localidadBean")
@SessionScoped
public class LocalidadBean implements Serializable {

    /**
     * Creates a new instance of LocalidadBean
     */
    private List<Localidad> localidades;

    public LocalidadBean() {
    }
    
    @PostConstruct
    public void init() {
        localidades = new ArrayList<>();
        Provincia provincia = new Provincia();
        provincia.setNombre("Málaga");
        localidades.add(new Localidad("Alameda", provincia));
        localidades.add(new Localidad("Alora", provincia));
        localidades.add(new Localidad("Antequera", provincia));
        localidades.add(new Localidad("Ardales", provincia));
        localidades.add(new Localidad("Arena", provincia));
        localidades.add(new Localidad("Arriate", provincia));
        localidades.add(new Localidad("Atajate", provincia));
        localidades.add(new Localidad("Benadalid", provincia));
        localidades.add(new Localidad("Benahavis", provincia));
        localidades.add(new Localidad("Benalauria", provincia));
        localidades.add(new Localidad("Benalmadena", provincia));
        localidades.add(new Localidad("Benamargosa", provincia));
        localidades.add(new Localidad("Benamocarra", provincia));
        localidades.add(new Localidad("Benamorraca", provincia));
        localidades.add(new Localidad("Benaojan", provincia));
        localidades.add(new Localidad("Benarraba", provincia));
        localidades.add(new Localidad("Campillos", provincia));
        localidades.add(new Localidad("Canete la Real", provincia));
        localidades.add(new Localidad("Canillas de Aceituno", provincia));
        localidades.add(new Localidad("Canillas de Albaida", provincia));
        localidades.add(new Localidad("Carratraca", provincia));
        localidades.add(new Localidad("Cartajima", provincia));
        localidades.add(new Localidad("Casabermeja", provincia));
        localidades.add(new Localidad("Casarabonela", provincia));
        localidades.add(new Localidad("Coin", provincia));
        localidades.add(new Localidad("Colmenar", provincia));
        localidades.add(new Localidad("Comares", provincia));
        localidades.add(new Localidad("Competa", provincia));
        localidades.add(new Localidad("Cortes de la Frontera", provincia));
        localidades.add(new Localidad("Cuevas Bajas", provincia));
        localidades.add(new Localidad("Cuevas de San Marcos", provincia));
        localidades.add(new Localidad("Cuevas del Becerro", provincia));
        localidades.add(new Localidad("Cutar", provincia));
        localidades.add(new Localidad("El Borge", provincia));
        localidades.add(new Localidad("El Burgo", provincia));
        localidades.add(new Localidad("Estepona", provincia));
        localidades.add(new Localidad("Farajan", provincia));
        localidades.add(new Localidad("Frigiliana", provincia));
        localidades.add(new Localidad("Fuengirola", provincia));
        localidades.add(new Localidad("Fuente de Piedra", provincia));
        localidades.add(new Localidad("Gaucin", provincia));
        localidades.add(new Localidad("Guaro", provincia));
        localidades.add(new Localidad("Humilladero", provincia));
        localidades.add(new Localidad("Igualeja", provincia));
        localidades.add(new Localidad("Iznate", provincia));
        localidades.add(new Localidad("Jimena de Libar", provincia));
        localidades.add(new Localidad("Jubrique", provincia));
        localidades.add(new Localidad("Juzcar", provincia));
        localidades.add(new Localidad("Macharaviya", provincia));
        localidades.add(new Localidad("Marbella", provincia));
        localidades.add(new Localidad("Mijas", provincia));
        localidades.add(new Localidad("Moclinejo", provincia));
        localidades.add(new Localidad("Mollina", provincia));
        localidades.add(new Localidad("Monda", provincia));
        localidades.add(new Localidad("Montejaque", provincia));
        localidades.add(new Localidad("Nerja", provincia));
        localidades.add(new Localidad("Ojen", provincia));
        localidades.add(new Localidad("Parauta", provincia));
        localidades.add(new Localidad("Periana", provincia));
        localidades.add(new Localidad("Pizarra", provincia));
        localidades.add(new Localidad("Pujerra", provincia));
        localidades.add(new Localidad("Rincon de la Victoria", provincia));
        localidades.add(new Localidad("Riogordo", provincia));
        localidades.add(new Localidad("Ronda", provincia));
        localidades.add(new Localidad("Salares", provincia));
        localidades.add(new Localidad("Sayalonga", provincia));
        localidades.add(new Localidad("Sedella", provincia));
        localidades.add(new Localidad("Sierra de Yeguas", provincia));
        localidades.add(new Localidad("Teba", provincia));
        localidades.add(new Localidad("Tolox", provincia));
        localidades.add(new Localidad("Torremolinos", provincia));
        localidades.add(new Localidad("Torrox", provincia));
        localidades.add(new Localidad("Totalan", provincia));
        localidades.add(new Localidad("Valle de Abdalajis", provincia));
        localidades.add(new Localidad("Villanueva de Tapia", provincia));
        localidades.add(new Localidad("Villanueva del Rosario", provincia));
        localidades.add(new Localidad("Villanueva del Trabuco", provincia));
        localidades.add(new Localidad("Vinuela", provincia));
        localidades.add(new Localidad("Yunquera", provincia));
//        Localidad localidad = new Localidad();
//        localidad.setNombre("Málaga");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Benalmádena");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Alhaurín de la Torre");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Rincón de la Victoria");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Nerja");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
    }
    
    public List<Localidad> getLocalidades(){
        return localidades;
    }
}
