package ru.netology.unit;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if ( amount <= 1000 ) {
            return boundary - amount;
        }
        else {
            return boundary - amount % boundary;
        }
    }
}
