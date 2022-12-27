package com.meli.example.spring.bean;

public class FakeBeanProperty {

    private final String apiUrl;
    private final String authenticationType;

    public FakeBeanProperty(String apiUrl, String authenticationType) {
        this.apiUrl = apiUrl;
        this.authenticationType = authenticationType;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    @Override
    public String toString() {
        return "FakeBeanProperty{" +
                "apiUrl='" + apiUrl + '\'' +
                ", authenticationType='" + authenticationType + '\'' +
                '}';
    }
}
