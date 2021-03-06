package curta.function;

public class Floor extends Function {

    public Floor() {
        super("floor");
    }

    @Override
    public Object eval(Object... params) {

        super.checkNumberOfParams(1, 1, params);

        return Math.floor(super.getDouble(0, params));
    }
}
