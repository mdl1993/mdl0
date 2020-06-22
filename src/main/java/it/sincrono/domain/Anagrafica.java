package it.sincrono.domain;

import java.util.HashMap;
import java.util.Map;

public class Anagrafica {

	private Integer id = null;
	private String nome = null;
	private String cognome = null;
	private String codiceFiscale = null;
	private Provincia provinciaNascita = null;
	private Integer eta = null;
	private String sesso = null;
	private Boolean categoriaProtetta = null;
	private String curriculum = null;

	public Anagrafica() {
		super();
	}

	/**
	 * @param id
	 * @param nome
	 * @param cognome
	 */
	public Anagrafica(Integer id, String nome, String cognome) {

		super();

		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	/**
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param provinciaNascita
	 * @param eta
	 * @param sesso
	 * @param categoriaProtetta
	 * @param curriculum
	 */
	public Anagrafica(String nome, String cognome, String codiceFiscale, Provincia provinciaNascita, Integer eta, String sesso, Boolean categoriaProtetta, String curriculum) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.provinciaNascita = provinciaNascita;
		this.eta = eta;
		this.sesso = sesso;
		this.categoriaProtetta = categoriaProtetta;
		this.curriculum = curriculum;
	}

	/**
	 * @param id
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param provinciaNascita
	 * @param eta
	 * @param sesso
	 * @param categoriaProtetta
	 * @param curriculum
	 */
	public Anagrafica(Integer id, String nome, String cognome, String codiceFiscale, Provincia provinciaNascita, Integer eta, String sesso, Boolean categoriaProtetta, String curriculum) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.provinciaNascita = provinciaNascita;
		this.eta = eta;
		this.sesso = sesso;
		this.categoriaProtetta = categoriaProtetta;
		this.curriculum = curriculum;
	}
	
	

	public Anagrafica(Integer id, String nome, String cognome, String codiceFiscale) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * @return the provinciaNascita
	 */
	public Provincia getProvinciaNascita() {
		return provinciaNascita;
	}

	/**
	 * @param provinciaNascita the provinciaNascita to set
	 */
	public void setProvinciaNascita(Provincia provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	/**
	 * @return the eta
	 */
	public Integer getEta() {
		return eta;
	}

	/**
	 * @param eta the eta to set
	 */
	public void setEta(Integer eta) {
		this.eta = eta;
	}

	/**
	 * @return the sesso
	 */
	public String getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the categoriaProtetta
	 */
	public Boolean getCategoriaProtetta() {
		return categoriaProtetta;
	}

	/**
	 * @param categoriaProtetta the categoriaProtetta to set
	 */
	public void setCategoriaProtetta(Boolean categoriaProtetta) {
		this.categoriaProtetta = categoriaProtetta;
	}

	/**
	 * @return the curriculum
	 */
	public String getCurriculum() {
		return curriculum;
	}

	/**
	 * @param curriculum the curriculum to set
	 */
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	@Override
	public String toString() {
		return "Anagrafica [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale
				+ ", provinciaNascita=" + provinciaNascita + ", eta=" + eta + ", sesso=" + sesso
				+ ", categoriaProtetta=" + categoriaProtetta + ", curriculum=" + curriculum + "]";
	}

    /**
     * @return Map<String, Object>
     */
    public Map<String, Object> toMap() {
        
    	Map<String, Object> values = new HashMap<>();
        
    	values.put("id", id);
        values.put("nome", nome);
        values.put("cognome", cognome);
        values.put("codice_fiscale", codiceFiscale);
        values.put("id_provincia_nascita", provinciaNascita.getIdProvincia());
        values.put("eta", eta);
        values.put("sesso", sesso);
        values.put("categoria_protetta", categoriaProtetta);
        values.put("curriculum", curriculum);
        
        return values;
      }
}