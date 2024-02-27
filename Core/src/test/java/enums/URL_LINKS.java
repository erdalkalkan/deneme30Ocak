package enums;

public enum URL_LINKS {
    HOMEPAGE("https://test.urbanicfarm.com/"),
    LOGIN_URL("https://test.urbanicfarm.com/auth/login"),
    REGISTERPAGE("https://test.urbanicfarm.com/auth/register");



    private final String getLink;

  URL_LINKS(String link) {
        this.getLink = link;
    }

    public String getLink() {
        return getLink;
    }

}
