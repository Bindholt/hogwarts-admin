package edu.hogwarts.model;

public class House {
    private HouseNames name;
    private String founder;
    private String[] colors;

    public House (HouseNames name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public House() {
        this.name = HouseNames.UNKNOWN;
        this.founder = "Unknown";
        this.colors = new String[0];
    }

    public HouseNames getName() {
        return name;
    }

    public void setName(HouseNames name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        StringBuilder colorString = new StringBuilder();
        if (colors.length > 0) {
            for (String color : colors) {
                colorString.append(color).append(", ");
            }
            colorString.replace(colorString.lastIndexOf(", "), colorString.length() - 1, ".");
        }
        return "House{\n" +
                " name: " + name + "\n" +
                " founder: " + founder + "\n" +
                " colors: " + colorString + "\n" +
                "}";
    }
}
