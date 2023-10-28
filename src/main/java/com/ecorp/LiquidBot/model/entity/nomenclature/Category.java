package com.ecorp.LiquidBot.model.entity.nomenclature;

public class Category {

    private long id;
    private String name;
    private String description;
    private long viewCounter;

    private void incrementCounter() {
        this.viewCounter++;
    }

    public Category() {
        this(-1);
    }

    public Category(long id) {
        this(id, "");
    }

    public Category(long id, String name) {
        this(id, name, "");
    }

    public Category(long id, String name, String description) {
        this(id, name, description, 0L);
    }

    public Category(long id, String name, String description, long viewCounter) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.viewCounter = viewCounter;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        sb.append(delimiter).append("description: ").append(this.getDescription()).append(',');
        sb.append(delimiter).append("viewCounter: ").append(this.getViewCounter());
        return sb.append("\n}").toString();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = 1;

        result = (int) ((result * prime) + (id ^ (id >>> 32)));
        result = (result * prime) + name.hashCode();
        result = (result * prime) + description.hashCode();
        result = (int) ((result * prime) + (viewCounter ^ (viewCounter >>> 32)));

        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Category that = (Category) o;

        if (this.id != that.getId()) return false;
        if (!this.name.equals(that.getName())) return false;
        if (!this.description.equals(that.getDescription())) return false;
        return (this.viewCounter == that.getViewCounter());
    }

}
