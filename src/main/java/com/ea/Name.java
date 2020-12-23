package com.ea;

public final class Name implements Comparable<Name> {

    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalStateException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (!firstName.equals(name.firstName)) return false;
        return lastName.equals(name.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Name name) {
        int lastNameCompare = lastName.compareTo(name.lastName);
        return (lastNameCompare != 0 ? lastNameCompare : firstName.compareTo(name.firstName));
    }
}
