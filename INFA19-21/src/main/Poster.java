package main;

public class Poster {

    private boolean isWet = false;

    public void setIsWet(boolean b){
        isWet = b;
    }

    public void give(Human human) throws PosterWetException{
        if (isWet)
            throw new PosterWetException("Афиша мокрая");
        else
            System.out.println(human.getName() + " получил афишу");
    }

}
