package course.api.spring.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	//Arrays.aslist is a immutable list so we can add a new list we have to create arraylist object
	private List<Topic>topics=new ArrayList<>(Arrays.asList(new Topic("spring","spring framewok","spring framework description"),
			new Topic("java","core java","java framework description"),
			new Topic("javascript","java script","javascript framework description")
			));

	public List<Topic> getAlltopic(){
		return topics;
	}
	public Topic gettopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void deletetopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}
}
