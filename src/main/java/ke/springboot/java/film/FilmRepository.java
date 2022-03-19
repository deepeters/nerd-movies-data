package ke.springboot.java.film;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, String> {
	
	
	//public List<Film> findByName (String name);
	//public List<Film> findByDescription (String description);
	
	public List<Film> findByTopicId (String topic);

}
