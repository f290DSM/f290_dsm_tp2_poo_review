package domain;

/* 
Classe é uma estrutura que define atributos 
e comportamentos
*/
public abstract class Pokemon {
    // Atributos
    private String nick;
    private int cp;
    private int hp;

    // Comportamentos
    public Pokemon(String nick, int cp, int hp) {
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

    public int getCp() {
        return this.cp;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void iChooseYou();

    public void comeBack() {
        System.out.println("Come back...");
    }


    @Override
    public String toString() {
        return "Pikachu [nick=" + nick + ", cp=" + cp + ", hp=" + hp + "]";
    }
    
}
