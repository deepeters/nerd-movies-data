package ke.springboot.java.film;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ke.springboot.java.topic.Topic;

@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping("/topics/{id}/films")
	public List<Film> getAllFilms(@PathVariable String id) {
		return filmService.getAllFilms(id);
	}
	
	@RequestMapping("/topics/{topicId}/films/{id}")
	public Optional<Film> getFilm(@PathVariable String id) {
		return filmService.getFilm(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/films")
	public void addFilm(@RequestBody Film film, @PathVariable String topicId) {
		film.setTopic(new Topic(topicId, "", ""));
		filmService.addFilm(film);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/films/{id}")
	public void updateFilm(@RequestBody Film film, @PathVariable String topicId, @PathVariable String id) {
		film.setTopic(new Topic(topicId, "", ""));
		filmService.updateFilm(film);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/films/{id}")
	public void deleteTopic(@PathVariable String id) {
		filmService.deleteFilm(id);
	}


}
