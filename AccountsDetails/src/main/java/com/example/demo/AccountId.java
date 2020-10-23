package com.example.demo;

import java.io.Serializable;
import java.util.Objects;

public class AccountId implements Serializable {

    private long branchNumber;
    private int acctNumber;

    public AccountId() {
    }

    public AccountId(long branchNumber, int acctNumber) {
        this.branchNumber = branchNumber;
        this.acctNumber = acctNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountId accountId = (AccountId) o;
        return branchNumber == accountId.branchNumber &&
        		acctNumber == accountId.acctNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchNumber, acctNumber);
    }
}
