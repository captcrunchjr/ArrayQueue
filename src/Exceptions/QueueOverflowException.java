package Exceptions;

/**
 * A Queue overflow exception class.
 * Is thrown when a Queue is full, and cannot be added to.
 * 
 * @author dhruvdh
 */
public class QueueOverflowException extends Exception {

    public QueueOverflowException() {
        super("The Queue is full.");
    }
}
