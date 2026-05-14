public class Warrior extends Fighter{
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
