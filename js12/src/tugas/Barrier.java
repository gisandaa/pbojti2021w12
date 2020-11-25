package tugas;

public class Barrier implements Destroyable{
    private int strength;
    
    Barrier(int strength){
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public void destroyed(){
        strength = (int) (strength - (strength * 0.1));
        if(strength <= 0){
            System.out.println("Barrier Hancur!!");
        }
    }
    
    public String getBarrierInfo(){
        String info = "";
        info += "Barrier Strength = " + strength;
        return info;
    }

}

