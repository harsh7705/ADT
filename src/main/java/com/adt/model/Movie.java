package com.adt.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * This is model class for Movie entity
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Document("movie")
public class Movie {
	@Id
	private String id;
	private String name;
	private String description;
	private String release;
	private String category;
	private String type;
	private String stream;
	private String upvote;
	private String downvote;
	private List<Review> reviews;

	public Movie() {

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

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getUpvote() {
		return upvote;
	}

	public void setUpvote(String upvote) {
		this.upvote = upvote;
	}

	public String getDownvote() {
		return downvote;
	}

	public void setDownvote(String downvote) {
		this.downvote = downvote;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
