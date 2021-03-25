public class OnlineElectronicShop {
    private int amount;
    private String item;
    private int quantity;
    private int distance;

    public OnlineElectronicShop (String orderItem, int orderQuantity, int orderDistance){
        this.item = orderItem;
        this.quantity = orderQuantity;
        this.distance = orderDistance;
    }

    private int totalAmount(){
        switch (item){
            case "Bulb" :
                return 35 * quantity;
            case "Grinder" :
                return 2000 * quantity;
            case "Smartphone" :
                return 5000 * quantity;
            case "Headset" :
                return 250 * quantity;
            case "Speaker" :
                return 700 * quantity;
            case "Charger" :
                return 150 * quantity;
            case "Keyboard" :
                return 300 * quantity;
            case "Fan" :
                return 1500 * quantity;
            case "AC" :
                return 8000 * quantity;
            case "Fitband" :
                return 1000 * quantity;

        }
        return 999999999;
    }


    public String deliveryChargeDecision(){
        amount=this.totalAmount();
        if (amount!=999999999)
        {
            if (amount < 3000 || distance > 100)
            {return "No";}
            if (amount>=3000&& distance<100)
            {return "Yes";}
        }
        return "No";
    }
}
