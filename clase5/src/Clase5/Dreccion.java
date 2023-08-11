package Clase5;

public class Dreccion {
    private int numeroCalle;
    String City;
    String Daparmen;
    String word;

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDaparmen() {
        return Daparmen;
    }

    public void setDaparmen(String daparmen) {
        Daparmen = daparmen;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Dreccion(int numeroCalle, String city, String daparmen, String word) {
        this.numeroCalle = numeroCalle;
        City = city;
        Daparmen = daparmen;
        this.word = word;



    }
}
