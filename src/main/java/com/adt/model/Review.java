package com.adt.model;

/**
 * This class is a placeholder for individual review in Movie entity
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
public class Review {

	private String userId;
	private String review;

	public Review() {

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
