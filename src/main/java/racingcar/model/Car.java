package racingcar.model;

public final class Car {
    private final String name;
    private Integer position;

    @Override
    public String toString() {
        return name;
    }

    private Car(final String givenName) {
        validateName(givenName);
        this.name = givenName;
        this.position = 0;
    }

    public static Car applyName(final String givenName) {
        return new Car(givenName);
    }

    public Integer changePosition(final CarMovementStatus movementStatus) {
        if (movementStatus.equals(CarMovementStatus.MOVE_FORWARD)) {
            return ++position;
        }
        if (movementStatus.equals(CarMovementStatus.STOP)) {
            return position;
        }
        throw new IllegalArgumentException();
    }

    public RoundResult getRoundResult() {
        return new RoundResult(name, position);
    }

    public boolean isWinner(Integer givenPosition) {
        return position.equals(givenPosition);
    }

    public static void validateName(String givenName) {
        if(givenName.split("").length < 6) return;
        throw new IllegalArgumentException("Wrong Size Of Name");
    }

}
