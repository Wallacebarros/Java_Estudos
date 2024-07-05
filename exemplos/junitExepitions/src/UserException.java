public class UserException extends Exception{
    private String name;
    
    public UserException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
