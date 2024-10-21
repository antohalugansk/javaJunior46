package lesson7;

public class Shop {
    private String userName;
    private int level;
    private String pathToImage;

    public Shop() {
    }

    public Shop(String userName, int level, String pathToImage) {
        this.userName = userName;
        this.level = level;
        this.pathToImage = pathToImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

}
