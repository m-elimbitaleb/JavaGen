package ma.ac.ensetmedia.etu.tpgenerocite.model;

public class Produit {

  private Long id;
  private String nom;
  private String marque;
  private String description;
  private Double prix;
  private Long stock;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrix() {
    return prix;
  }

  public void setPrix(Double prix) {
    this.prix = prix;
  }

  public Long getStock() {
    return stock;
  }

  public void setStock(Long stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return String.format("Id=%d, nom=%s, marque=%s, prix=%f, stock=%d, description=%s%n", id, nom,
        marque, prix, stock, description);
  }

}
