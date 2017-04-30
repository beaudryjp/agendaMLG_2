package grupog.agendamlg.beans;

import grupog.agendamlg.entities.Comentario;
import grupog.agendamlg.entities.Destinatario;
import grupog.agendamlg.entities.Etiqueta;
import grupog.agendamlg.entities.Evento;
import grupog.agendamlg.entities.Localidad;
import grupog.agendamlg.entities.Provincia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jean Paul Beaudry
 */
@ManagedBean
@RequestScoped
public class EventoBean implements Serializable {

    /**
     * Creates a new instance of EventoBean
     */
    private List<Evento> eventos;
    private List<Etiqueta> etiquetas;
    private List<Destinatario> destinatarios;
    private List<Destinatario> publico_evento;
    private List<Destinatario> publico_evento2;
    private List<Destinatario> publico_evento3;
    private List<Destinatario> publico_evento4;
    private List<Comentario> comen;
    private int evento;
    private Date fecha;

    public EventoBean() {
    }

    @PostConstruct
    public void init() {
        eventos = new ArrayList<>();
        etiquetas = new ArrayList<>();
        destinatarios = new ArrayList<>();
        publico_evento = new ArrayList<>();
        publico_evento2 = new ArrayList<>();
        publico_evento3 = new ArrayList<>();
        publico_evento4 = new ArrayList<>();
        comen = new ArrayList<>();
        Provincia provincia = new Provincia();
        
        provincia.setNombre("Málaga");

        Localidad localidad = new Localidad("Málaga", provincia);
        Localidad localidad2 = new Localidad("Benalmádena", provincia);
        Localidad localidad3 = new Localidad("Alhaurín de la Torre", provincia);
        Localidad localidad4 = new Localidad("Torremolinos", provincia);
        Localidad localidad5 = new Localidad("Rincón de la Victoria", provincia);
        Localidad localidad6 = new Localidad("Nerja", provincia);

        eventos.add(new Evento("Murakami", "Presentación del autor y su último libro: Kishi dancho koroshi",
                new Date(2017, 6, 1), new Date(2017, 6, 3), "10:00 - 11:00", "gratis", 36.7203713, -4.4248549, false, localidad));
        eventos.add(new Evento("El Bosco: Vida y Obra", "La exposición que conmemora el V centenario de la muerte del Bosco, una ocasión irrepetible "
                + "para disfrutar del  extraordinario grupo de las ocho pinturas de su mano que se conservan en España junto a excelentes obras procedentes "
                + "de colecciones y museos de todo el mundo. Se trata del repertorio más completo del Bosco, uno de los artistas más enigmáticos e influyentes "
                + "del Renacimiento, que invita al público a adentrarse en su personal visión del mundo a través de un montaje expositivo espectacular "
                + "que presenta exentos sus trípticos más relevantes para que se puedan contemplar tanto el anverso como el reverso.",
                new Date(2017, 6, 2), new Date(2017, 8, 2), "10:00 - 22:00", "5€", 36.7135979, -4.42488000000003, true, localidad));
        eventos.add(new Evento("Concierto: Reflets Trio", "Podremos disfrutar de un concierto de flauta travesera, viola y arpa, a cargo de Reflets Trio.",
                new Date(2017, 5, 28), new Date(2017, 5, 28), "19:00 - 20:00", "gratis", 36.7268091, -4.4261242, false, localidad));
        eventos.add(new Evento("Encuentros con el Autor. Andrés Neuman", "Uno de los escritores más interesantes y con mayor proyección de las "
                + "letras españolas visita la Biblioteca Pública arroyo de la Miel para charlar y compartir impresiones sobre sus obras. ",
                new Date(2017, 5, 30), new Date(2017, 5, 30), "20:00 - 22:00", "10€", 36.594771, -4.5320213, false, localidad2));
        eventos.add(new Evento("Taller de pintura de paisaje al aire libre", "Taller de pintura de paisaje al aire libre",
                new Date(2017, 6, 4), new Date(2017, 6, 3), "10:00 - 14:00", "3€", 36.661575, -4.5715127, false, localidad3));
        eventos.add(new Evento("El otro Bigas Luna: La seducción de lo tangible", " 'El otro Bigas Luna' ofrece por vez primera un recorrido multidisciplinar "
                + "por más de un centenar de obras que completan de una manera global la figura de este enigmático Artista y Cineasta. "
                + "La muestra ofrece la trayectoria vital de Bigas Luna a partir de su imaginario genuino, el cual cultivó en paralelo a su creación "
                + "cinematográfica y que ha permanecido en el territorio de lo íntimo hasta ahora. Una obra prácticamente inédita para la mayoría "
                + "y que junto al libro que la acompaña van a revelar al gran público ese 'otro' Bigas Luna que sin duda resulta imprescindible "
                + "para entender el controvertido y apasionante personaje en toda su dimensión vital y creativa. "
                + "Málaga se convierte en el punto de partida de esta exposición itinerante que mostrará al 'otro Bigas Luna'.",
                new Date(2017, 5, 5), new Date(2017, 6, 5), "10:00 - 14:00 y 17:00 - 20:00", "gratis", 36.7211581, -4.4147584, true, localidad));
        eventos.add(new Evento("Malaca y su pasado romano", "Sábado 6. Taller Pequeños Musivarios. Realizados a base de piezas cúbicas denominadas teselas, "
                + "los mosaicos eran uno de los elementos arquitectónicos más bellos y representativos del mundo romano. "
                + "Con este taller nos atreveremos a hacer uno de ellos con temática geométrica que hará las delicias de los más pequeños. "
                + "Sábado 13. Taller Policromía Romana. Aunque han llegado hasta nuestros días del color de la piedra o el metal en el que estaban hechas, "
                + "la mayoría de las estatuas romanas estaban pintadas con vivos colores cuidadosamente elegidos por los artesanos que las hicieron y decoraron. "
                + "Cómo los pintaban y qué colores elegían lo sabremos en el taller del día 8 de abril. Sábado 20. Pintando Frescos Romanos. "
                + "En la Antigua Roma, las paredes de las distintas estancias de las casas eran decoradas con frescos o pinturas que representaban variados temas. "
                + "En este taller realizaremos un fresco que podría decorar una de las villas más suntuosas. Sábado 27. Juegos en Roma. "
                + "Muchos de los juegos de mesa a los que estamos acostumbrados a jugar en la actualidad se crearon en la antigua Roma. "
                + "En este divertido taller los descubriremos y aprenderemos a jugar como los niños romanos lo hacían hace 2.000 años.",
                new Date(2017, 5, 22), new Date(2017, 5, 29), "11:00 - 12:30 y 12:30 - 14:00", "8€", 36.7211581, -4.4147584, true, localidad));
        eventos.add(new Evento("CUENTACUENTO EL MAGO DE OZ", "El MIMMA, junto con el grupo 'Donde viven los cuentos', "
                + "presentan esta adaptación musical basada en el primer de los libros de Oz, del escritor estadounidense Lyman Frank Baum. "
                + "Una de las historias más célebres y fascinantes de la literatura infantil de todos los tiempos, narrada a través de sus protagonistas.",
                new Date(2017, 5, 29), new Date(2017, 5, 29), "12:00 - 14:00", "5€", 36.7233145, -4.421965, false, localidad));
        eventos.add(new Evento("Arte contemporáneo para niños", "Queremos acercar de manera lúdica a los más pequeños el gusto por el arte actual con "
                + "ejemplos prácticos. Los artistas analizados serán Evrnesto Neto(Brasil), Annete Messager (Francia), Takashi Murakami (Japón), "
                + "RomeroBritto (Brasil) - duración: una sesión de 3h",
                new Date(2017, 5, 13), new Date(2017, 5, 13), "13:30 - 16:30", "5€", 36.6285609, -4.4999552, false, localidad4));
        eventos.add(new Evento("Cultura Urbana Hip Hop", "¿Te interesa el hip-hop y quieres saber más? "
                + "¿Sientes que la cultura urbana te rodea pero no acabas de entenderla ni disfrutarla por completo? "
                + "Descubre una nueva manera de mirar el arte y la vida, pues las calles por las que te mueves suelen tener tanto interés como el mejor museo.",
                new Date(2017, 5, 9), new Date(2017, 5, 9), "17:00 - 22:00", "5€", 36.7227918, -4.2866072, false, localidad5));
        eventos.add(new Evento("Robotix", "ROBOTIX es una actividad innovadora para desarrollar las habilidades y competencias del siglo XXI, "
                + "utilizando como plataforma la robótica de LEGO Education",
                new Date(2017, 5, 20), new Date(2017, 5, 20), "10:00 - 13:00", "gratis", 36.746682, -3.8804524, false, localidad6));
        
        etiquetas.add(new Etiqueta("Actos académicos"));
        etiquetas.add(new Etiqueta("Conciertos"));
        etiquetas.add(new Etiqueta("Espectáculos"));
        etiquetas.add(new Etiqueta("Cineclub"));
        etiquetas.add(new Etiqueta("Exposiciones"));
        etiquetas.add(new Etiqueta("Conferencias"));
        etiquetas.add(new Etiqueta("Libros"));
        etiquetas.add(new Etiqueta("Varios"));
        etiquetas.add(new Etiqueta("Festivales"));
        etiquetas.add(new Etiqueta("Teatro"));
        
        destinatarios.add(new Destinatario("Ancianos"));
        destinatarios.add(new Destinatario("Niños"));
        destinatarios.add(new Destinatario("Todos"));
        destinatarios.add(new Destinatario("Adultos"));
        destinatarios.add(new Destinatario("Jóvenes"));
        
        eventos.get(0).setImagen_url("img/eventos/murakami2.jpg");
        eventos.get(1).setImagen_url("img/eventos/elbosco.jpg");
        eventos.get(2).setImagen_url("img/eventos/concierto2.jpg");
        eventos.get(3).setImagen_url("img/eventos/encuentros2.jpg");
        eventos.get(4).setImagen_url("img/eventos/pintura.jpg");
        eventos.get(5).setImagen_url("img/eventos/bigas_luna.jpg");
        eventos.get(6).setImagen_url("img/eventos/malaca.jpg");
        eventos.get(7).setImagen_url("img/eventos/cuentacuentos2.jpg");
        eventos.get(8).setImagen_url("img/eventos/arteninios2.png");
        eventos.get(9).setImagen_url("img/eventos/hiphop.jpg");
        eventos.get(10).setImagen_url("img/eventos/robotix2.png");
        
        eventos.get(0).setId_evento(0L);
        eventos.get(1).setId_evento(1L);
        eventos.get(2).setId_evento(2L);
        eventos.get(3).setId_evento(3L);
        eventos.get(4).setId_evento(4L);
        eventos.get(5).setId_evento(5L);
        eventos.get(6).setId_evento(6L);
        eventos.get(7).setId_evento(7L);
        eventos.get(8).setId_evento(8L);
        eventos.get(9).setId_evento(9L);
        eventos.get(10).setId_evento(10L);
        
        publico_evento.add(destinatarios.get(3));
        publico_evento.add(destinatarios.get(4));
        publico_evento2.add(destinatarios.get(1));
        publico_evento2.add(destinatarios.get(4));
        publico_evento3.add(destinatarios.get(0));
        publico_evento3.add(destinatarios.get(3));
        publico_evento4.add(destinatarios.get(2));
        eventos.get(0).setDestinatario(publico_evento);
        eventos.get(1).setDestinatario(publico_evento4);
        eventos.get(2).setDestinatario(publico_evento4);
        eventos.get(3).setDestinatario(publico_evento);
        eventos.get(4).setDestinatario(publico_evento3);
        eventos.get(5).setDestinatario(publico_evento);
        eventos.get(6).setDestinatario(publico_evento4);
        eventos.get(7).setDestinatario(publico_evento2);
        eventos.get(8).setDestinatario(publico_evento2);
        eventos.get(9).setDestinatario(publico_evento2);
        eventos.get(10).setDestinatario(publico_evento2);
        
        eventos.get(0).setEtiqueta(etiquetas.subList(5, 7));
        eventos.get(1).setEtiqueta(etiquetas.subList(4, 5));
        eventos.get(2).setEtiqueta(etiquetas.subList(1, 3));
        eventos.get(3).setEtiqueta(etiquetas.subList(5, 7));
        eventos.get(4).setEtiqueta(etiquetas.subList(4, 5));
        eventos.get(5).setEtiqueta(etiquetas.subList(5, 7));
        eventos.get(6).setEtiqueta(etiquetas.subList(4, 5));
        eventos.get(7).setEtiqueta(etiquetas.subList(6, 8));
        eventos.get(8).setEtiqueta(etiquetas.subList(7, 8));
        eventos.get(9).setEtiqueta(etiquetas.subList(2, 3));
        eventos.get(10).setEtiqueta(etiquetas.subList(7, 8));
        
//        Comentario c1 = new Comentario();
//        Usuario usuario = new Usuario("Susana", "LJ", "SLJ@gmail.com");
//        usuario.setRol_usuario(Usuario.Tipo_Rol.REGISTRADO);
//        usuario.setPassword_hash("potato");
//        
//        Usuario usuario1 = new Usuario("Marie", "Poppo", "Poppo@gmail.com");
//        usuario1.setRol_usuario(Usuario.Tipo_Rol.REDACTOR);
//        usuario1.setPassword_hash("potato");
//        
//        usuarios.add(usuario);
//        usuarios.add(usuario1);
//        u.setPseudonimo("");
//        c1.setId_comentario(Long.MIN_VALUE);
//        
//        
//        c1.setUsuario(u);
//        comen.add(e)
//        eventos.get(0).setComentarios(new Comentario());
    }

    public List<Evento> getEventos() {
        Collections.sort(eventos, new Comparator<Evento>() {
            @Override
            public int compare(Evento o1, Evento o2) {
                return o1.getFecha_inicio().compareTo(o2.getFecha_inicio());
            }
        });
        /*
       List<Evento> first_events = eventos.stream().limit(4).collect(Collectors.toList());
       return first_events;
         */
        return eventos.subList(0, 3);
    }

    public List<Evento> getEventosDestacados() {
        List<Evento> evd = new ArrayList<>();
        for (Evento x : eventos) {
            if (x.isDestacado()) {
                evd.add(x);
            }
        }
        return evd;
    }
    
    public List<Evento> getEventosByFecha(){
        List<Evento> evf = new ArrayList<>();
        for (Evento x : eventos) {
            if (x.getFecha_inicio() == fecha) {
                evf.add(x);
            }
        }
        return evf;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public List<Destinatario> getDestinatarios() {
        return destinatarios;
    }

    public Evento getEvento(String e) {
        return eventos.get(Integer.parseInt(e));
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }
    
}
