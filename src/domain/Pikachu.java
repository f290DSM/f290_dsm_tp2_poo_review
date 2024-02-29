package domain;

/* 
Classe é uma estrutura que define atributos 
e comportamentos
*/
public class Pikachu {
    // Atributos
    public String nick;
    private int cp;
    public int hp;

    // Comportamentos
    public Pikachu(String nick, int cp, int hp) {
        this.nick = nick;
        this.cp = cp;
        this.hp = hp;
    }

    public void setCp(int novoCp) {
        if (novoCp <= 0) {
            System.out.println("CP não pode ser menor ou igual a 0");
        } else {
            cp = novoCp;
        }
    }

    public void iChooseYou() {
        System.out.println("Pikachu eu escolho voce!");
    }

    public void comeBack() {
        System.out.println("Come back...");
    }


    @Override
    public String toString() {
        return "Pikachu [nick=" + nick + ", cp=" + cp + ", hp=" + hp + "]";
    }

    
}
