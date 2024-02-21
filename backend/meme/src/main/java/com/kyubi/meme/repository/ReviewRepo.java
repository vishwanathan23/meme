package com.kyubi.meme.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyubi.meme.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
}