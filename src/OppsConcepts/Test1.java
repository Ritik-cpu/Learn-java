package OppsConcepts;


interface Vehicle{
    void  changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear=newGear;

    }

    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed =speed-decrement;
    }

    public  void  printState(){
        System.out.println("spped"+ speed + " gear" +gear);
    }
}


class Test1{
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.changeGear(4);
        bike.speedUp(10);
        bike.applyBrakes(5);

        bike.printState();
    }
}