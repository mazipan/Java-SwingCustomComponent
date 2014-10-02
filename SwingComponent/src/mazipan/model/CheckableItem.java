package mazipan.model;

public class CheckableItem {
    private Object obj;
    private boolean isSelected;

    public CheckableItem(Object obj) {
      this.obj = obj;
      isSelected = false;
    }

    public void setSelected(boolean b) {
      isSelected = b;
    }

    public boolean isSelected() {
      return isSelected;
    }

    @Override
    public String toString() {
      return obj.toString();
    }
}
