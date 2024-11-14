package org.pgm.backend1.repository;

import org.pgm.backend1.domain.Board;
import org.pgm.backend1.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardAndParentIsNull(Board board);
}
