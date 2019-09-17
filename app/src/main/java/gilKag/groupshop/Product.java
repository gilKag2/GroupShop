package gilKag.groupshop;

public class Product {
    private int mImgResource;
    private String item;
    private String Category;

    public Product(int imgResource, String item) {
        mImgResource = imgResource;
        this.item = item;
    }

    public Product(String item) {
        this.item = item;
    }

    public int getImgResource() {
        return mImgResource;
    }

    public void setImgResource(int imgResource) {
        mImgResource = imgResource;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
