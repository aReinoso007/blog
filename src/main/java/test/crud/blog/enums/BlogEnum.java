package test.crud.blog.enums;

public enum BlogEnum implements Indentify<BlogEnum>{

    ACTIVE("ACTIVE"), DELETED("DELETED");

    private String description;

    BlogEnum(final String description){
        this.description = description;
    }

    @Override
    public BlogEnum getIdentifier() {
        return this;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
