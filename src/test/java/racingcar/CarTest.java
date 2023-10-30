package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car;
    @BeforeEach
    void setUp(){
        String givenName = "cho";
        car = Car.applyName(givenName);
    }
    @Test
    @DisplayName("자동차에 이름을 부여할 수 있다.")
    public void carNameApplyTest(){
        String givenName = "sung";
        Car car = Car.applyName(givenName);
        assertThat(car.toString()).isEqualTo(givenName);
    }
    @Test
    @DisplayName("숫자가 3일때 정지하는 상태를 반환한다.")
    public void carReturnStopWhenNumberIsThreeTest(){
        Integer targetNumber = 3;
        CarMovementStatus carMovementStatus = car.getMoveState(targetNumber);
        assertThat(CarMovementStatus.STOP).isEqualTo(carMovementStatus);
    }
    @Test
    @DisplayName("숫자가 4일때 전진하는 상태를 반환한다.")
    public void carReturnMoveWhenNumberIsFourTest(){
        Integer targetNumber = 4;
        CarMovementStatus carMovementStatus = car.getMoveState(targetNumber);
        assertThat(CarMovementStatus.MOVE_FORWARD).isEqualTo(carMovementStatus);
    }
    @Test
    @DisplayName("전진하는 상태를 반으면 위치가 1 증가한다.")
    public void carStopWhenNumberIsThreeTest(){
        Integer position = car.changePosition(CarMovementStatus.MOVE_FORWARD);
        Integer targetPosition = 1;
        assertThat(position).isEqualTo(targetPosition);
    }
    @Test
    @DisplayName("정지 상태를 반으면 위치가 변하지 않는다.")
    public void carMoveWhenNumberIsFourTest(){
        Integer position = car.changePosition(CarMovementStatus.STOP);
        Integer firstCarPosition = 0;
        assertThat(position).isEqualTo(firstCarPosition);
    }
}
