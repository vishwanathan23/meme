package com.kyubi.meme.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyubi.meme.model.Review;
import com.kyubi.meme.repository.ReviewRepo;

@Service
public class ReviewService {
@Autowired
ReviewRepo repo;

public ReviewService(ReviewRepo repo)
{
this.repo=repo;
}
public ReviewService() {
}


public Review create(Review j) {
return repo.save(j);
}

public Review find(int id) {
return this.repo.findById(id).orElse(null);
}

public List<Review> findA() {
return this.repo.findAll();
}

public Review update(int id, Review j) {
Review p1 = this.repo.findById(id).orElse(null);
if (p1 != null) {
p1.setDogBreed(j.getDogBreed());
p1.setPincode(j.getPincode());
this.repo.save(p1);
return p1;
} else {
return j;
}
}

public void delete(int id) {
this.repo.deleteById(id);
}
}