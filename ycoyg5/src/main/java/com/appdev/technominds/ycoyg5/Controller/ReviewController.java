package com.appdev.technominds.ycoyg5.Controller;

import com.appdev.technominds.ycoyg5.Entity.Review;
import com.appdev.technominds.ycoyg5.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // Create or Update Review
    @PostMapping
    public Review createOrUpdateReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    // Get All Reviews
    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    // Get Review by ID
    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable UUID id) {
        return reviewService.getReviewById(id);
    }

    // Delete Review by ID
    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable UUID id) {
        reviewService.deleteReview(id);
        return "Review deleted successfully!";
    }
}
