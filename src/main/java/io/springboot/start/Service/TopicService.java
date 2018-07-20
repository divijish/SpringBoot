package io.springboot.start.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.springboot.start.Entity.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Maths"), new Topic("English") ,new Topic("Hindi"),
			new Topic("Economics")));

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String s) {
		System.out.println("Inside topic service");
		return topics.stream().filter(x->x.getName().equals(s)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
