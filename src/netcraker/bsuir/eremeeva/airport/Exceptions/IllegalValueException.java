package netcraker.bsuir.eremeeva.airport.Exceptions;

public class IllegalValueException extends Exception{

    public IllegalValueException() {
        super(); // Вопрос, зачем super(); и в целом явно объявленный дефолтный конструктор
    }

    public IllegalValueException(String message) {
        super(message);
    }
}