package lk.nsbm.dto;

public class SuitsDTO {

    private String suitid;
    private String suittype;
    private String material;
    private String measurement;
    private int qty;
    private String date;

    public SuitsDTO(){}

    public SuitsDTO(String id,String type,String material,String measurement,int qty,String date){
        this.suitid=id;
        this.suittype=type;
        this.material=material;
        this.measurement=measurement;
        this.qty=qty;
        this.date=date;
    }

    public String getSuitid() {
        return suitid;
    }

    public void setSuitid(String suitid) {
        this.suitid = suitid;
    }

    public String getSuittype() {
        return suittype;
    }

    public void setSuittype(String suittype) {
        this.suittype = suittype;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
