public class U2 extends Rocket{
    public U2(){
        cost = 120; // 100 million dolar
        weight = 18000; // 10  tonnes
        maxWeight = 29000;
        launchExplosion = 0.0;
        landingCrush = 0.0;
        currentWeight = weight;
    }
    public boolean launch() {
        int random =(int) (Math.random()*100+1);
        this.launchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <=random;

    }

    public boolean land() {
        int random =(int) (Math.random()*100+1);
        this.landingCrush = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.landingCrush <=random;
    }
}
