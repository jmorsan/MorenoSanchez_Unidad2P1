package es.aad.MorenoSanchez_unidad2_p1.ejercicio2.match_utils;

public class MatchException extends Exception
{
    public MatchException()
    {
        super();
    }

    public MatchException(String message)
    {
        super(message);
    }

    public MatchException(String message, Throwable exception)
    {
        super(message,exception);
    }
}
