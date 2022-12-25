package ma.ac.ensetmedia.etu.tpgenerocite.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import ma.ac.ensetmedia.etu.tpgenerocite.model.Produit;

public class MetierProduitImpl implements IMetier<Produit> {

  List<Produit> produits = new ArrayList<>();

  @Override
  public void add(Produit o) {
    produits.add(o);
  }

  @Override
  public List<Produit> getAll() {
    return produits;
  }

  @Override
  public Optional<Produit> findById(long id) {
    return produits.stream().filter(it -> it.getId().equals(id)).findFirst();
  }

  @Override
  public void delete(long id) {
    Optional<Produit> produit = findById(id);
    produit.ifPresent(value -> produits.remove(value));
  }
}
