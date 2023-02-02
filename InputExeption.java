package Calculator;

class InputException extends Exception {
    public InputException(String message){
        super(message);
    }
}
class NumberInputException extends Exception {
    public NumberInputException(String message) {
        super(message);
    }
}