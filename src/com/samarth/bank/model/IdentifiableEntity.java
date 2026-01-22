package com.samarth.bank.model;

/**
 * The {@code IdentifiableEntity} class provides a base model
 * for objects which need a unique identifier. This identifier is represented
 * as a {@code long}.
 */
public class IdentifiableEntity {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
