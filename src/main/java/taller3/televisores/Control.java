package taller3.televisores;

public class Control{
    private TV tv;

    public void turnOn(){
        tv.turnOn();
    }

    public void turnOff(){
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.turnOn();
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    public void enlazar(TV tv){
        tv.setControl(this);
        this.tv = tv;

    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }



    
}
