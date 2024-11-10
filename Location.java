public record Location(String name, Plants plant) {
    public String toString() {
        return name + "с растением: " + plant;
    }
    public String getName() {
        return name;
    }
}

