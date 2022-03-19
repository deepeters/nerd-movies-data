package ke.springboot.java.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepository;
	
	public List<Film> getAllFilms (String topicId) {
		List<Film> films = new ArrayList<>();
		filmRepository.findByTopicId(topicId).forEach(films::add); //get a film related to a particular topic
		return films;
	}
	
	public Optional<Film> getFilm(String id) {
		return filmRepository.findById(id);
	}
	
	public void addFilm(Film film) {
		filmRepository.save(film);
	}

	public void updateFilm(Film film) {
		filmRepository.save(film);
	}

	public void deleteFilm(String id) {
		filmRepository.deleteById(id);
	}

}
