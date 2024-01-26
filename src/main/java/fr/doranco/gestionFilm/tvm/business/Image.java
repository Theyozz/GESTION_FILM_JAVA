package fr.doranco.gestionFilm.tvm.business;

public class Image {
	
	private Long id;
	private String url;
	private Film film;
	
	public Image() {
		super();
	}
	
	public Image(String url, Film film) {
		this();
		this.url = url;
		this.film = film;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
}
