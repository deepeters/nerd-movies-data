package ke.springboot.java.film;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ke.springboot.java.topic.Topic;

@Entity
public class Film {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic; //each film is now tied to a particular topic as a foreign key
	
	public Film() {
		
	}
	
	public Film(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic (topicId, "", ""); //makes it easier to create new course objects with a given topic
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
