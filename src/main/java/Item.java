public class Item {

    private String name;
    private String price;
    private String type;
    private String expiration;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getType(){
        return type;
    }

    public void setType(String drink){
        this.type = type;
    }

    public void setExpiration(String expiration){
        this.expiration = expiration;
    }

    public String getExpiration() {
        return expiration;
    }
}
