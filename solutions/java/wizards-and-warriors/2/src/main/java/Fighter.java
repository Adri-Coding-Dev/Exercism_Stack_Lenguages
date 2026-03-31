class Fighter {
    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    private boolean vulnerable = false;
    private int damagePoints;

    public Warrior(){}

    public boolean isVulnerable(){
        return this.vulnerable;
    }

    public int getDamagePoints(Fighter f){
        if(f.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean vulnerable = true;
    private int damagePoints;


    public boolean isVulnerable(){
        return this.vulnerable;
    }

    public int getDamagePoints(Fighter f){
        if(this.vulnerable){
            return 3;
        }else{
            return 12;
        }
    }


    public void prepareSpell(){
        this.vulnerable = false;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}
