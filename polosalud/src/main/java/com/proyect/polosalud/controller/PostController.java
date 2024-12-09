package com.proyect.polosalud.controller;

import java.util.Optional;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.proyect.polosalud.entity.Post;
import com.proyect.polosalud.entity.User;
import com.proyect.polosalud.security.RoleEnum;
import com.proyect.polosalud.service.AuthService;
import com.proyect.polosalud.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  private AuthService authService;
  @Autowired
  private PostService postService;

  @GetMapping
  public ResponseEntity<?> getAllPosts(HttpServletRequest request) {
    Optional<User> userOptional = authService.getUserFromSession(request);

    if (userOptional.isPresent()) {
      User user = userOptional.get();
      List<Post> posts = postService.getAllPosts();

      if (user.getRoleId() == RoleEnum.ADMIN.getRoleId()) {
        posts.forEach(post -> post.setText("ADMIN - " + post.getText()));
      }

      return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
  }

  @GetMapping("/{id}")
  public Post getPostById(@PathVariable Long id) {
    return postService.getPostById(id);
  }

  @PostMapping
  public Post createPost(@RequestBody Post post) {
    return postService.createPost(post);
  }

  @PutMapping("/{id}")
  public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
    return postService.updatePost(id, updatedPost);
  }

  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id) {
    postService.deletePost(id);
  }
}
