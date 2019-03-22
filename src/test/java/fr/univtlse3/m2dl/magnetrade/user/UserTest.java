package fr.univtlse3.m2dl.magnetrade.user;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class UserTest {
    public User user;

    @Before
    public void setup() {
        user = new User("Louis", "JACQUES", "loulou@lou.lou", new Date(1995, 10, 29), "dank zoulou veineux", "lepetitbonhommenemousse", "+33628813045", "/resources/bigsmile.jpg");
    }

    @Test
    public void testGetFirstName() {
        assert (user.getFirstName().equals("Louis"));
    }

    @Test
    public void testGetLastName() {
        assert (user.getLastName().equals("JACQUES"));
    }

    @Test
    public void testGetEmail() {
        assert (user.getEmailName().equals("loulou@lou.lou"));
    }

    @Test
    public void testGetBirthDate() {
        assert (user.getBirthDate().equals(new Date(1995, 10, 29)));
    }

    @Test
    public void testGetNickName() {
        assert (user.getNickName().equals("dank zoulou veineux"));
    }

    @Test
    public void testGetPasswordName() {
        assert (user.getPassword().equals("lepetitbonhommenemousse"));
    }

    @Test
    public void testGetPhoneNumber() {
        assert (user.getPhoneNumber().equals("+33628813045"));
    }

    @Test
    public void testGetPicture() {
        assert (user.getPicture().equals("/resources/bigsmile.jpg"));
    }

    @Test
    public void testSetFirstName() {
        user.setFirstName("oh");
        assert (user.getFirstName().equals("oh"));
    }

    @Test
    public void testSetLastName() {
        user.setLastName("ah");
        assert (user.getLastName().equals("ah"));
    }

    @Test
    public void testSetEmail() {
        user.setEmailName("COUCOU@h.com");
        assert (user.getEmailName().equals("COUCOU@h.com"));
    }

    @Test
    public void testSetBirthDate() {
        user.setBirthDate(new Date());
        assert (user.getBirthDate().equals(new Date()));
    }

    @Test
    public void testSetNickName() {
        user.setNickName("nick");
        assert (user.getNickName().equals("nick"));
    }

    @Test
    public void testSetPasswordName() {
        user.setPassword("pwd123");
        assert (user.getPassword().equals("pwd123"));
    }

    @Test
    public void testSetPhoneNumber() {
        user.setPhoneNumber("0505050505");
        assert (user.getPhoneNumber().equals("0505050505"));
    }

    @Test
    public void testSetPicture() {
        user.setPicture("/void.jpg");
        assert (user.getPicture().equals("/void.jpg"));
    }

}