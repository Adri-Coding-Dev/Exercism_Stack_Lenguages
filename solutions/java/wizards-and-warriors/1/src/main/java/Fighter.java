class Fighter {
    private boolean vulnerable;
    private int damagePoints;

    public Fighter(){}

    public Fighter(boolean vulnerable, int damagePoints){
        this.damagePoints = damagePoints;
        this.vulnerable = vulnerable;
    }

    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 1;
    }

    public String toString(){
        return "[Vulnerable: " + this.vulnerable + ", DamagePoints: " + this.damagePoints + "]";
    }
}

// TODO: define the Warrior class

// TODO: define the Wizard class
