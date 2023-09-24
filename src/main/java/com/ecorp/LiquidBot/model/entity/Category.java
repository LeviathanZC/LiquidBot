package com.ecorp.LiquidBot.model.entity;

public class Category {

    private long id;
    private String name;
    private String description;

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
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        String delimiter = "\n\t";
        final StringBuilder sb = new StringBuilder(
                this.getClass().getSimpleName().concat(" {")
        );
        sb.append(delimiter).append("id: ").append(this.getId()).append(',');
        sb.append(delimiter).append("name: ").append(this.getName()).append(',');
        sb.append(delimiter).append("description: ").append(this.getDescription());
        return sb.append("\n}").toString();
    }

}
