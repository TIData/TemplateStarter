package domein;

public class Coffee extends CaffeineBeverage{
 
//    public void prepareRecipe() {
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMilk();
//    }
//    
//    private void boilWater() {
//        System.out.println("Boiling water");
//    }
//    
    @Override
    protected void brew() {
       System.out.println("Dripping coffee through filter");
    }
//    
//    private void pourInCup() {
//       System.out.println("Pouring into cup");
//    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

