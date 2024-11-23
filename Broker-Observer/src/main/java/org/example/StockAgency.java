package org.example;

public class StockAgency implements Observer {

    private String name;
    private float fluctuation;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(float fluctuation) {
        this.fluctuation = fluctuation;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  name + " agency {" +
                " fluctiation=" + fluctuation +
                " }";
    }
}
