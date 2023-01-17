package com.springrest.survey;

import java.util.List;

public class Question {
	
	public Question() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getCoorrectAnswer() {
		return coorrectAnswer;
	}

	public void setCoorrectAnswer(String coorrectAnswer) {
		this.coorrectAnswer = coorrectAnswer;
	}

	public Question(String id, String description, List<String> options, String coorrectAnswer) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.coorrectAnswer = coorrectAnswer;
	}
private String id;
private String description;
private List<String> options;
private String coorrectAnswer;
@Override
public String toString() {
	return "Question [id=" + id + ", description=" + description + ", options=" + options + ", coorrectAnswer="
			+ coorrectAnswer + "]";
}



}
