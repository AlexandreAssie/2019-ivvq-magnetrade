package fr.univtlse3.m2dl.magnetrade.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * Method to create or update a comment in the back-end.
     *
     * @param comment the comment to create or update
     */
    public Comment createOrUpdateComment(Comment comment) {
        return this.commentRepository.save(comment);
    }

}
