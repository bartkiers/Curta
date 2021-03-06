package curta.function;

public class Tan extends Function {

    public Tan() {
        super("tan");
    }

    @Override
    public Object eval(Object... params) {

        super.checkNumberOfParams(1, 1, params);

        return Math.tan(super.getDouble(0, params));
    }
}
