package test.crud.blog.enums;

public enum UserEnum implements Indentify<UserEnum>{

    ACTIVO("ACTIVO"), DELETED("DELETED");
    private String description;

    UserEnum(final String description){
        this.description = description;
    }

    @Override
    public UserEnum getIdentifier() {
        return this;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
