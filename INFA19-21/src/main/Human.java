package main;

public class Human {

    private String name;

    protected Human(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    static class Hemulixa extends Human implements Walkable, Openable, Askable, Cryable, Drinkable {

        private static Hemulixa instance = null;

        private Hemulixa(String name) {
            super(name);
        }

        public static Hemulixa getHemulixa(){
            if (instance == null)
                instance = new Hemulixa("Хемулиха");
            return instance;
        }

        @Override
        public void walk() {
            System.out.println(getName() + " пошла к маленькой Хемулихе");
        }

        @Override
        public void ask() {
            System.out.println(getName() + " спросила");
        }

        @Override
        public void cry() {
            System.out.println("У " + getName() + " слезы навернулись");
            Handkerchief handkerchief = new Handkerchief();
            try {
                handkerchief.use();
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        @Override
        public void open() {
            System.out.println(getName() + " открыла клетку");
        }

        @Override
        public void drink() {
            System.out.println(getName() + " попила чаю");
        }

    }

    static class LittleHemulixa extends Human implements Bakeable, Treatable{

        private static LittleHemulixa instance = null;

        protected LittleHemulixa(String name) {
            super(name);
        }

        public static LittleHemulixa getInstance(){
            if (instance == null)
                instance = new LittleHemulixa("маленькая Хемулиха");
            return instance;
        }

        @Override
        public void bake() {
            System.out.println(getName() + " испекла гору пирожков");
        }

        @Override
        public void treat() {
            System.out.println(getName() + " угостила гостей чаем");
        }
    }

    static class Snork extends Human implements Walkable, StandUpable, Talkable {

        private static Snork instance;

        protected Snork(String name) {
            super(name);
        }

        public static Snork getInstance() {
            if (instance == null)
                instance = new Snork("фрекен Снорк");
            return instance;
        }

        @Override
        public void standUp() {
            System.out.println(getName() + " поднялась");
        }

        @Override
        public void talk() {
            System.out.println(getName() + " сказала");
        }

        @Override
        public void walk() {
            System.out.println(getName() + " пошла к маленькой Хемулихе");
        }
    }

    static class Baby extends Human implements Walkable {

        private static Baby instance = null;
        private Poster poster;

        protected Baby(String name) {
            super(name);
            poster = new Poster();
            poster.setIsWet(true);
        }

        public static Baby getInstance(){
            if (instance == null)
                instance = new Baby("24 малыша");
            return instance;
        }

        @Override
        public void walk() {
            System.out.println(getName() + " вскарабкались на крышу за афишей и отдали клочки Снусмумрику");
        }

        public void givePosterToSnusmumrik(Snusmumrik snus){
            try {
                poster.give(snus);
            } catch (PosterWetException e) {
                System.out.println("Афиша была мокрой!!! Снусмумрик получил мокрые клочки афиши");
            }
        }
    }

    static class Snusmumrik extends Human implements Walkable, Lookable, Understandable, Doingable, PosterCombining {

        private static Snusmumrik instance = null;

        protected Snusmumrik(String name) {
            super(name);
        }

        @Override
        public void doSomething() {
            System.out.println(getName() + " справился со всеми платьями и штанишками, хотя на нах еще остались следы смолы");
        }

        @Override
        public void look() {
            System.out.println(getName() + " посмотрел на них");
        }

        @Override
        public void understand() {
            System.out.println(getName() + " понял, что они далжны побывать в театре");
        }

        @Override
        public void walk() {
            System.out.println(getName() + " пошел к маленькой Хемулихе");
        }

        public static Snusmumrik getInstance(){
            if (instance == null)
                instance = new Snusmumrik("Снусмумрик");
            return instance;
        }

        @Override
        public void combine() {
            System.out.println(getName() + " разложил на траве оставшиеся клочки бумаги и попытался сложить их вместе");
        }
    }

}
