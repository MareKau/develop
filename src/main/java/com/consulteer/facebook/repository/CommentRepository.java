package com.consulteer.facebook.repository;

import com.consulteer.facebook.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
