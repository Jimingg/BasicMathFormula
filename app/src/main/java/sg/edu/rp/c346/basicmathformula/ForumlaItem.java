package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17010144 on 17/7/2018.
 */

public class ForumlaItem {
    private String name;
    private String formula;
    private String type;

    public ForumlaItem(String name, String formula, String type) {
        this.name = name;
        this.formula = formula;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "ForumlaItem{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
