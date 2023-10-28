package com.ecorp.LiquidBot.model.entity.nomenclature;

public class Brand {

    private long id;
    private String name;
    private long viewCounter;

    public Brand() {
        this(-1);
    }

    public Brand(long id) {
        this(id, "");
    }

    public Brand(long id, String name) {
        this(id, name, 0L);
    }

    public Brand(long id, String name, long viewCounter) {
        this.id = id;
        this.name = name;
        this.viewCounter = viewCounter;
    }

    private void incrementCounter() {
        this.viewCounter++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(long viewCounter) {
        this.viewCounter = viewCounter;
    }

    @Override
    public String toString() {
        String delimiter = "\n\t";
        final StringBuilder sb = new StringBuilder(
                this.getClass().getSimpleName().concat(" {")
        );
        sb.append(delimiter).append("id: ").append(this.getId()).append(',');
        sb.append(delimiter).append("name: ").append(this.getName()).append(',');
        sb.append(delimiter).append("viewCounter: ").append(this.getViewCounter());
        return sb.append("\n}").toString();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = 1;

        result = (int) ((result * prime) + (id ^ (id >>> 32)));
        result = (result * prime) + name.hashCode();
        result = (int) ((result * prime) + (viewCounter ^ (viewCounter >>> 32)));

        return result;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        Brand that = (Brand) object;

        if (this.id != that.getId()) return false;
        if (!this.name.equals(that.getName())) return false;
        return this.viewCounter == that.getViewCounter();
    }

}
