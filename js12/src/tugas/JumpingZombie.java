package tugas;

public class JumpingZombie extends Zombie{
    
    JumpingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    
    @Override
    public void heal(){
        switch (super.level) {
            case 1:
                super.health = (super.health + (super.health * 30/100));
                break;
            case 2:
                super.health = (super.health + (super.health * 40/100));
                break;
            case 3:
                super.health = (super.health + (super.health * 50/100));
                break;
            default:
                break;
        }
    }
    
    @Override
    public void destroyed(){
        super.health = (super.health - (super.health * 10/100));
        if(super.health <= 0){
            super.health = 0;
            System.out.println("Jumping Zombie is dead");
        }
    }
    
    @Override
    public String getZombieInfo(){
        String info = "";
        System.out.println("Jumping Zombie Data");
        info += "Health = " + super.health+"\n";
        info += "Level = " + super.level+"\n";
        return info;
    }
}

