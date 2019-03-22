package fr.univtlse3.m2dl.magnetrade.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/")
    public void createComment(@RequestBody Comment comment) {
        this.commentService.createComment(comment);
    }

}