package fr.univtlse3.m2dl.magnetrade.proposal;

import fr.univtlse3.m2dl.magnetrade.comment.Comment;
import fr.univtlse3.m2dl.magnetrade.magnet.Magnet;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class ProposalTest {

    private Date nowDate;
    private Proposal proposal;

    @Before
    public void setUp() throws Exception {
        nowDate = new Date();
        proposal = new Proposal(1L, true, "pic", "content", nowDate, new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testConstructor() throws Exception {
        Proposal proposal1 = new Proposal("pic", "content", nowDate, new ArrayList<>());
        assertThat(proposal1, IsEqual.equalTo(proposal));
    }

    @Test
    public void testGetId() throws Exception {
        assertThat(proposal.getId(), IsEqual.equalTo(1L));
    }

    @Test
    public void testSetId() throws Exception {
        proposal.setId(2L);
        assertThat(proposal.getId(), IsEqual.equalTo(2L));
    }

    @Test
    public void testGetActive() throws Exception {
        assertThat(proposal.getActive(), IsEqual.equalTo(true));
    }

    @Test
    public void testSetActive() throws Exception {
        proposal.setActive(false);
        assertThat(proposal.getActive(), IsEqual.equalTo(false));
    }

    @Test
    public void testGetPicture() throws Exception {
        assertThat(proposal.getPicture(), IsEqual.equalTo("pic"));
    }

    @Test
    public void testSetPicture() throws Exception {
        proposal.setPicture("new_pic");
        assertThat(proposal.getPicture(), IsEqual.equalTo("new_pic"));
    }

    @Test
    public void testGetText() throws Exception {
        assertThat(proposal.getText(), IsEqual.equalTo("content"));
    }

    @Test
    public void testSetText() throws Exception {
        proposal.setText("new_content");
        assertThat(proposal.getText(), IsEqual.equalTo("new_content"));
    }

    @Test
    public void testGetCreationDate() throws Exception {
        assertThat(proposal.getCreationDate(), IsEqual.equalTo(nowDate));
    }

    @Test
    public void testSetCreationDate() throws Exception {
        Date date = new Date();
        proposal.setCreationDate(date);
        assertThat(proposal.getCreationDate(), IsEqual.equalTo(date));
    }

    @Test
    public void testGetMagnets() throws Exception {
        assertThat(proposal.getMagnets(), IsEqual.equalTo(new ArrayList<>()));
    }

    @Test
    public void testSetMagnets() throws Exception {
        ArrayList<Magnet> magnets = new ArrayList<>();
        magnets.add(new Magnet());
        proposal.setMagnets(magnets);

        assertThat(proposal.getMagnets(), IsEqual.equalTo(magnets));
    }

    @Test
    public void testAddMagnet() throws Exception {
        ArrayList<Magnet> magnets = new ArrayList<>();
        Magnet m1 = new Magnet();
        magnets.add(m1);

        proposal.addMagnet(m1);

        assertThat(proposal.getMagnets(), IsEqual.equalTo(magnets));
    }

    @Test
    public void testRemoveMagnet() throws Exception {
        ArrayList<Magnet> magnets = new ArrayList<>();
        Magnet m1 = new Magnet();
        magnets.add(m1);

        proposal.setMagnets(magnets);
        assertThat(proposal.getMagnets(), IsEqual.equalTo(magnets));
        proposal.removeMagnet(m1);
        assertThat(proposal.getMagnets(), IsEqual.equalTo(new ArrayList<Magnet>()));
    }

    @Test
    public void testGetComments() throws Exception {
        assertThat(proposal.getComments(), IsEqual.equalTo(new ArrayList<>()));
    }

    @Test
    public void testSetComments() throws Exception {
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment());
        proposal.setComments(comments);

        assertThat(proposal.getComments(), IsEqual.equalTo(comments));
    }

    @Test
    public void testAddComment() throws Exception {
        ArrayList<Comment> comments = new ArrayList<>();
        Comment c1 = new Comment();
        comments.add(c1);

        proposal.addComment(c1);

        assertThat(proposal.getComments(), IsEqual.equalTo(comments));
    }

    @Test
    public void testRemoveComment() throws Exception {
        ArrayList<Comment> comments = new ArrayList<>();
        Comment c1 = new Comment();
        comments.add(c1);

        proposal.setComments(comments);
        assertThat(proposal.getComments(), IsEqual.equalTo(comments));
        proposal.removeComment(c1);
        assertThat(proposal.getComments(), IsEqual.equalTo(new ArrayList<Comment>()));
    }

    @Test
    public void testEquals() throws Exception {
        Date date = new Date(155409322);

        // same attributes
        Proposal prop = new Proposal(2L, true, "pic", "content", nowDate, new ArrayList<>(), new ArrayList<>());
        // different creationDate
        Proposal prop2 = new Proposal(3L, true, "pic", "content", date, new ArrayList<>(), new ArrayList<>());
        // different text
        Proposal prop3 = new Proposal(4L, true, "pic", "other", date, new ArrayList<>(), new ArrayList<>());
        // text null
        Proposal prop4 = new Proposal(5L, true, "pic", null, date, new ArrayList<>(), new ArrayList<>());
        // different picture
        Proposal prop5 = new Proposal(4L, true, "other", "content", date, new ArrayList<>(), new ArrayList<>());
        // picture null
        Proposal prop6 = new Proposal(5L, true, null, "content", date, new ArrayList<>(), new ArrayList<>());
        // different isActive
        Proposal prop7 = new Proposal(6L, false, "pic", "content", date, new ArrayList<>(), new ArrayList<>());

        assertTrue(proposal.equals(prop));
        assertTrue(proposal.equals(proposal));
        assertFalse(proposal.equals(null));
        assertFalse(proposal.equals(""));
        assertFalse(proposal.equals(prop2));
        assertFalse(proposal.equals(prop3));
        assertFalse(proposal.equals(prop4));
        assertFalse(proposal.equals(prop5));
        assertFalse(proposal.equals(prop6));
        assertFalse(proposal.equals(prop7));
    }

    @Test
    public void testToString() throws Exception {
        assertThat(proposal.toString(), IsEqual.equalTo("Proposal{" +
                "isActive=" + true +
                ", picture='" + "pic" + '\'' +
                ", text='" + "content" + '\'' +
                ", creationDate=" + nowDate +
                ", magnets=" + new ArrayList<>() +
                ", comments=" + new ArrayList<>() +
                '}'));
    }

    @Test
    public void testHashCode() throws Exception {
        Proposal req = new Proposal(2L, true, "pic", "content", nowDate, new ArrayList<>(), new ArrayList<>());

        assertThat(proposal.hashCode(), IsEqual.equalTo(req.hashCode()));
    }

}