package datahandlers;

public abstract class RestAccessor {

  protected String apiKey;
  protected String secretApiKey;

  public String baseUrl;
  public String baseWapi3;
  public String webSocketUrl;

  public RestAccessor(String apiKey, String secretApiKey) {

    this.apiKey       = apiKey;
    this.secretApiKey = secretApiKey;

  }

  public void setUrls(String base, String wApi, String webSocket) {

    baseUrl      = base;
    baseWapi3    = wApi;
    webSocketUrl = webSocket;

  }

}
