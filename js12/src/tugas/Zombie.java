package tugas;

abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    
    abstract void heal();
    
    @Override
    abstract public void destroyed();
    
    public String getZombieInfo(){
        String info = "";
        info += "Health = " + health;
        info += "Level = " + level;
        return info;
    }
}
