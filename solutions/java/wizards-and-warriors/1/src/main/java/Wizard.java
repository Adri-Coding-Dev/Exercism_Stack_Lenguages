public class Wizard extends Fighter {
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
