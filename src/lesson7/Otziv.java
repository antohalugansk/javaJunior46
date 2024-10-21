package lesson7;

public class Otziv {

    private User user;
    private int reiting;
    private String dostoinstva;
    private String nedostatki;
    private String comments;

    public Otziv() {
    }

    public Otziv(int reiting, User user, String dostoinstva, String nedostatki, String comments) {
        this.reiting = reiting;
        this.user = user;
        this.dostoinstva = dostoinstva;
        this.nedostatki = nedostatki;
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    public String getDostoinstva() {
        return dostoinstva;
    }

    public void setDostoinstva(String dostoinstva) {
        this.dostoinstva = dostoinstva;
    }

    public String getNedostatki() {
        return nedostatki;
    }

    public void setNedostatki(String nedostatki) {
        this.nedostatki = nedostatki;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
