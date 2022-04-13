package com.sparta.mini2.repository;


import com.sparta.mini2.model.Likes;
import com.sparta.mini2.model.Post;
import com.sparta.mini2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Likes, Long> {
    List<Likes> findAllByPost(Post post);
    Optional<Likes> findByUser(User user);
    Optional<Likes> findByUserAndPost(User user, Post post);

    List<Likes> findAllByUser(User user);
}