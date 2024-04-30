public class Product{
    private String Name;
    private int Price;
    private byte Rating;  


public String getName(){
    return Name;
}

public int getPrice(){
    return Price;
}

public byte getRating(){
    return Rating;
}

public void setName(String Name){
    this.Name = Name;
}

public void setPrice(int Price){
    this.Price = Price;
}

public void setRating(byte Rating){
    this.Rating = Rating;
}
}