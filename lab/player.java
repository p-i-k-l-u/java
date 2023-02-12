
public class player {
    String name;
    int age;

    player(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Player name" + name);
        System.out.println("Age of the player" + age);
    }

}

class cricket_player extends player {
    String type;

    cricket_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void display() {
        super.display();
        System.out.println("Player type" + type);
    }
}

class football_player extends player {
    String type;

    football_player(String n, String t, int a) {
        super(n, a);
        type = t;

    }

    public void display() {
        super.display();
        System.out.println("Player type " + type);
    }
}

class hockey_player extends player {
    String type;

    hockey_player(String n, String t, int a) {
        super(n, a);
        type = t;
    }

    public void display() {
        super.display();
        System.out.println("Player type :" + type);
    }
}

// main class

class Main {
    public static void main(String[] args) {
        cricket_player cp = new cricket_player("Ram", "Cricket", 23);
        football_player fp = new football_player("Shyam", "Football", 22);
        hockey_player hp = new hockey_player("Aditya", "Hockey", 24);

        cp.display();
        fp.display();
        hp.display();
    }
}