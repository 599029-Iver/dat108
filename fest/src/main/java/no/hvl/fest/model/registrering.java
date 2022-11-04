package no.hvl.fest.model;



public class registrering {
    String fornavn;
    String etternavn;
    String mobnr;
    String password;
    String passwordRepeat;
    String kjonn;


    public registrering(String fornavn, String etternavn, String mobnr, String password, String passwordRepeat, String kjonn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.mobnr = mobnr;
        this.password = password;
        this.passwordRepeat = passwordRepeat;
        this.kjonn = kjonn;
    }

    public String getFornavn() {
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public String getMobnr() {
        return mobnr;
    }
    public void setMobnr(String mobnr) {
        this.mobnr = mobnr;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPasswordRepeat() {
        return passwordRepeat;
    }
    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }
    public String getKjonn() {
        return kjonn;
    }
    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    @Override
    public String toString() {
        return "registrering [fornavn=" + fornavn + ", etternavn=" + etternavn + ", mobnr=" + mobnr + ", password="
                + password + ", passwordRepeat=" + passwordRepeat + ", kjonn=" + kjonn + "]";
    }
    
    
}
