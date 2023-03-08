package test.crud.blog.enums;

public enum StatusEnum implements Indentify<StatusEnum>{

    SUCCESS("SUCESS"), FAILURE("FAILURE");

    private String description;

    StatusEnum(final String description){
        this.description = description;
    }

    @Override
    public StatusEnum getIdentifier() {
        return this;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
