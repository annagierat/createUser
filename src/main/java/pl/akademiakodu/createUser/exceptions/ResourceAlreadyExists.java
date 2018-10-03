package pl.akademiakodu.createUser.exceptions;

public class ResourceAlreadyExists extends Exception{

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceAlreadyExists(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s already exist %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}


