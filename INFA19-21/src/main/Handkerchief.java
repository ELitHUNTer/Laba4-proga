package main;

public class Handkerchief {

    private Handkerchief instance = null;

    public void use(){
        if (instance == null)
            throw new NoHandkerchiefException();
    }

    class NoHandkerchiefException extends RuntimeException{
        NoHandkerchiefException(){
            super("Платков нет");
        }
    }

}
