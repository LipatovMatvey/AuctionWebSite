package ru.AuctionWebSite.Backend.Exception;

public class UserNotFoundException extends RuntimeException {
    /**
     * Конструктор исключения с сообщением об ошибке
     * @param message сообщение об ошибке
     */
    public UserNotFoundException(String message) { super(message); }
}