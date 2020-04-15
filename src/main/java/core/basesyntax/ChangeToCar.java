package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChooseTypeInterface<AutoType> {
    private static final int WEIGHT_MAX = 1500;

    @Override
    public AutoType apply(int weight) {
        return weight < WEIGHT_MAX ? AutoType.CAR : AutoType.TRUCK;
    }
}
