package kg.megacom.models;

public class Products {
    private int id;
    private String name;
    private Categories category_id;
    private String barcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Categories category_id) {
        this.category_id = category_id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
