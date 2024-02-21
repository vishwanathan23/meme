package com.kyubi.meme.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kyubi.meme.model.Review;
import com.kyubi.meme.service.ReviewService;

@RestController
public class ReviewController {
@Autowired
ReviewService obj;

public ReviewController() {
}

public ReviewController(ReviewService obj)
{
this.obj=obj;
}

@PostMapping("/insert")
public Review insert(@RequestBody Review j) {
return obj.create(j);
}

@GetMapping("/get/{Pincode}")
public Review fin(@PathVariable int Pincode) {
return this.obj.find(Pincode);
}

@GetMapping("/find/all")
public List<Review> findA() {
return this.obj.findA();
}

@PutMapping("/update/{id}")
public Review update(@PathVariable int id, @RequestBody Review u) {
return this.obj.update(id, u);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable int id) {
this.obj.delete(id);
}
}