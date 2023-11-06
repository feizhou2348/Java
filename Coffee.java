/*
 * Fei Z
 */

public class Coffee {
    private String name;
    private Double caffeineContent;
//constructors 
    public Coffee(){
        this.name = "none";
        this.caffeineContent=50.0;
    }

    public Coffee(String aN, Double acC){
        this.setName(aN);
        this.setCC(acC);
    }
///getters
    public String getName(){
        return this.name;
    }

    public Double getCC(){
        return this.caffeineContent;
    }
//mutators
    public void setName(String aN){
        if (aN != null) {
            this.name = aN;
        }
        else{
            this.name = "none";
        }
    }

    public void setCC(Double cC){
        if (cC >=50.0 & cC <= 300.0) {
            this.caffeineContent = cC;
        }
        else{
            this.caffeineContent = 50.0;
        }
    }
//other methods
    public String toString(){
        return "Coffe name: " + this.name +" Caffeine Amount: " + this.caffeineContent;
    }

    @Override
    public boolean equals(Object C){
    
        if (C == this) {
            return true;
        }
    
        if (!(C instanceof Coffee)) {
            return false;
        }
    
        Coffee aC = (Coffee)C;
    
        return this.name.equalsIgnoreCase(aC.getName()) && this.caffeineContent.equals(aC.getCC());
    }

    public String risky(Coffee aC){
        Double riskyA = 180.0 / ((aC.getCC()/ 100.0)*6.0);
        return "It would be a heath risk if one consumes " + riskyA + " cups of " + aC.getName() + " within an hour.";

    }

    public void p(String s){
        System.out.println(s);
    }

}
