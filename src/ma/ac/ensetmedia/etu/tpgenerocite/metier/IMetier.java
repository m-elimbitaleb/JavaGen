package ma.ac.ensetmedia.etu.tpgenerocite.metier;

import java.util.List;
import java.util.Optional;

public interface IMetier<T> {

  void add(T o);

  List<T> getAll();

  Optional<T> findById(long id);

  void delete(long id);
}
