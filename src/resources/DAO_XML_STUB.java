package resources;

import controller.Controlador;
import model.STUB;
import model.Serie;

/**
 * Data manager per StUB. Crea les estructures de dades necessaries
 * per a manegar la capa de persistència de STUB.
 *
 */
public class DAO_XML_STUB implements DAO_STUB {
	STUB dades;
	private String serie;
	private String temporada;
	private String admin;
	private String client;
	private String episodi;
	private String valoracio;
	private String productora;
	private String artista; //director i actor
	private String subscripcio;
	private String visualitzacio;

	/* -------------------------------------------------------------------
	 * Metodes a implementar per vosaltres. En aquests metodes creareu els
	 * vostres objectes a partir de la informacio obtinguda del fitxer XML
	 *
	 * Podeu esborrar els prints si voleu. Tambe podeu canviar el tipus de
	 * dades que retorna el metode, es a dir que sou lliures de
	 * modificar-ho al gust, excepte les crides inicials que es fan.
	 * -------------------------------------------------------------------
	 */

	public DAO_XML_STUB(String nomFitxer, STUB dades) {
        this.dades = dades;
	    STUBXMLParser parser = new STUBXMLParser(this);
		parser.parse(nomFitxer);
	}
	/**
	 * Obté les dades del fitxer XML passat per paràmetre
	 *
	 * @param nomFitxer ruta del fitxer XML del que obtenir les dades
	 */
	public void obtenirDades(String nomFitxer) {
		STUBXMLParser parser = new STUBXMLParser(this);
		parser.parse(nomFitxer);
	}

	/**
	 * Crea una nova serie a partir de la informacio obtinguda del fitxer XML
	 *
	 * @param id id de la serie. El podeu utilitzar o no
	 * @param title títol de la serie
	 * @param desc descripcio de la serie
	 */

	public void loadSerie(String id, String title, String desc) {
		dades.addSerie(id, title,desc);

	}

	/**
	 * Crea una nova temporada a partir de la informacio obtinguda del fitxer XML
	 *
	 * @param idSerie
	 * @param numTemporada numero de la temporada
	 * @param numEpisodis numero d'episodis
	 *
	 */

	public void loadTemporada(String idSerie, String numTemporada, String numEpisodis) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nova temporada.
		 */
		dades.addTemp(idSerie, numTemporada, numEpisodis);

	}

	/**
	 * Crea una nova temporada a partir de la informacio obtinguda del fitxer XML
	 * @param title titol de lepisodi
	 * @param duration duració de l'episodi
	 * @param idioma idioma de l'episodi V.O.
	 * @param description sinopsi de l'episodi
	 * @param data data d'estrena de l'episodi
	 * @param idSerie
	 * @param numTemporada
	 *
	 */

	public void loadEpisodi(String title, String duration, String idioma, String description, String data, String idSerie, String numTemporada) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nou episodi.
		 */
        dades.addEp(title,duration,idioma,description,data,idSerie,numTemporada);

	}

	/**
	 * Crea un nou artista a partir de la informacio obtinguda del fitxer XML
	 *
	 * @param id id del artista. El podeu utilitzar o no
	 * @param nom nom del artista
	 * @param tipus tipus (director\actor) del artista
	 * @param idSerie serie a la qual treballa. El podeu utilitzar o no
	 * @param nacionalitat
	 */

	public void loadArtista(String id, String nom, String tipus, String idSerie, String nacionalitat) {

		/* TODO: Aqui feu el necessari per a crear els artistes per a la serie
		 */

		this.artista=nom;
	}


	/**
	 * Crea productora del fitxer XML
	 *
	 * @param id id de la productora
	 * @param nom nom de la productora
	 * @param idSerie id de la serie que va fer. El podeu utilitzar o no
	 */
	public void loadProductora(String id, String nom, String idSerie) {

		/* TODO: Aqui feu el necessari per a crear les productores per a les series
		 */

		this.productora=nom;
	}

	/**
	 * Crea una valoracio a partir de la informacio obtinguda del fitxer XML
	 *  @param id id de la valoracio. El podeu utilitzar o no
	 * @param client identificador del client. El podeu utilitzar o no
	 * @param idSerie
	 * @param numTemporada
	 * @param puntuacio puntuacio donada al episodi
	 * @param data data en la que es va fer la puntuacio
	 */

	public void loadValoracio(String id, String client, String idSerie, String numTemporada, String episodi, String puntuacio, String data) {

		/* TODO: A partir d'aqui creeu la valoracio
		 */
		int ep = Integer.parseInt(episodi);
		int temp = Integer.parseInt(numTemporada);
		int punt = Integer.parseInt(puntuacio);
		dades.valorarEpisodi(client,punt,data,ep,temp,idSerie);
	}

	/**
	 * Crea un nou admin a partir de la informacio obtinguda del fitxer XML
	 *
	 * @param id id del administrador
	 * @param nom nom del administrador
	 * @param usuari usuari del administrador
	 * @param password password del administrador
	 */
	public void loadAdmin(String id, String nom, String usuari, String password) {

		/* TODO: Creeu aqui el vostre admin
		 */

		dades.registrarUsuari(id,nom,"","",usuari,password,"","",true);
	}

	/**
	 * Crea un nou client a partir de la informacio obtinguda del fitxer XML
	 *
	 * @param id id del client
	 * @param nom nom del client
	 * @param dni dni del client
	 * @param adreca adreça del client
	 * @param usuari usuari al sistema del client
	 * @param password password del client
	 *
	 */

	public void loadClient(String id, String nom, String dni, String adreca, String usuari, String password) {

		/* TODO: Creeu aqui el vostre client
		 */

		dades.registrarUsuari(id,nom,dni,adreca,usuari,password,"None","None",false);
	}



	/**
	 * Crea un nova subscripció a partir de la informació obtinguda del fitxer XML
	 *  @param id de la subscripció
	 * @param numTemporada
	 */
	@Override
	public void loadSubscripcio(String id, String client, String serie, String numTemporada, String episodi) {

		/* TODO: Creeu aqui la vostra subscripció
		 */

		int ep = Integer.parseInt(episodi);
		int temp = Integer.parseInt(numTemporada);
		dades.subscriureEpisodi(client,ep,temp,serie);
	}

	/**
	 * Crea un nova visualització a partir de la informació obtinguda del fitxer XML
	 *  @param id de la visualització
	 * @param numTemporada
	 * @param data de la visualització del episodi
	 */
	public void loadVisualització(String id, String client, String serie, String numTemporada, String episodi, String data) {

		/* TODO: Creeu aqui la vostra subscripció
		 */

		int ep = Integer.parseInt(episodi);
		int temp = Integer.parseInt(numTemporada);

		dades.visualitzarEpisodi(client,ep,temp,serie);
	}

	public String getSerie() {
		return serie;
	}

	public String getTemporada() {
		return temporada;
	}

	public String getClient() {
		return client;
	}

	public String getAdmin() {
		return admin;
	}

	public String getEpisodi() {
		return episodi;
	}

	public String getValoracio() {
		return valoracio;
	}

	public String getProductora() {
		return productora;
	}

	public String getArtista() {
		return artista;
	}

	public String getSubscripcio() {
		return subscripcio;
	}

	public String getVisualitzacio() {
		return visualitzacio;
	}
}
