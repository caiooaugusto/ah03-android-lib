package com.ahgora.ah03;

public class Response {
    Boolean error;
    String matricula;
    String bio;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean newError) {
        this.error = newError;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String newMatricula) {
        this.matricula = newMatricula;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String newBio) {
        this.bio = newBio;
    }
}
