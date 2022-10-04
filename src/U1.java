public class U1 extends Rocket{
    public U1(){
        cost = 100; // 100 million dollar
        weight = 10000; // in kg, 10  tonnes
        maxWeight = 18000; // in kg, 18 tonnes
        launchExplosion = 0.0;
        landingCrush = 0.0;
        currentWeight = weight;
    }
    public boolean launch() {
        int random =(int) (Math.random()*100+1);
        this.launchExplosion = 5.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <=random;

    }

    public boolean land() {
        int random =(int) (Math.random()*100+1);
        this.landingCrush = 1.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.landingCrush <=random;
    }
}
