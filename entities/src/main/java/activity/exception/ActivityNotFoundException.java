package activity.exception;

public class ActivityNotFoundException extends RuntimeException {

    private String message;

    public ActivityNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public ActivityNotFoundException() {
    }

}
