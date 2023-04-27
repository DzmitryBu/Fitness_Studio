package by.it_academy.fitness.config.properites;


import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jwt")
@ConfigurationProperties(prefix = "jwt")
public class JWTProperty {
    private String secret;
    private String issuer;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
