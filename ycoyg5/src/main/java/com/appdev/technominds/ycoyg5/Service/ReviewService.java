package com.appdev.technominds.ycoyg5.Service;

import com.appdev.technominds.ycoyg5.Entity.Review;
import com.appdev.technominds.ycoyg5.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // Create or Update a review
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // Get all reviews
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    // Get one review by ID
    public Optional<Review> getReviewById(UUID id) {
        return reviewRepository.findById(id);
    }

    // Delete a review
    public void deleteReview(UUID id) {
        reviewRepository.deleteById(id);
    }
}
