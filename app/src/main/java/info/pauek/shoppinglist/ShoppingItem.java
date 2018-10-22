package info.pauek.shoppinglist;

public class ShoppingItem {
    private String name;
    private boolean checker;

    public ShoppingItem(String name , boolean checker) {
        this.name = name;
        this.checker = checker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecker() {
        return checker;
    }

    public void setChecker(boolean checker) {
        this.checker = checker;
    }

    public void CheckerToggle()
    {
        this.checker = !checker;
    }
}
