package domein;

public class Tea extends CaffeineBeverage {

//    public void prepareRecipe() {
//        boilWater();
//        steepteaBag();
//        pourInCup();
//        addLemon();
//    }
    
//    private void boilWater() {
//        System.out.println("Boiling water");
//    }
//    
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
    
//    private void pourInCup() {
//        System.out.println("Pouring into cup");
//    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
  

