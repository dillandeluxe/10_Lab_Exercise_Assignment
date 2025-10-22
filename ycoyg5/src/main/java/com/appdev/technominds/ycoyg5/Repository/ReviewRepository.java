package com.appdev.technominds.ycoyg5.Repository;

import com.appdev.technominds.ycoyg5.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {
}