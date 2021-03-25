import fit.ColumnFixture;

public class DeliveryFixture extends ColumnFixture{
    private String itm;
    private int qty;
    private int dis;

    public void setItm(String item){
        this.itm = item;
    }
    public void setQuantity(int quantity){
        this.qty = quantity;
    }
    public void setDistance(int distance){
        this.dis = distance;
    }

    public String offersFreeDelivery(){
        OnlineElectronicShop systemUnderTest = new OnlineElectronicShop(itm,qty,dis);
        return systemUnderTest.deliveryChargeDecision();
    }


}
