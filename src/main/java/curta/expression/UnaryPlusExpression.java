package curta.expression;

import curta.CurtaNode;
import curta.function.Function;

import java.util.Map;

public class UnaryPlusExpression extends Expression {

    @Override
    public Object eval(CurtaNode ast, Map<String, Object> vars, Map<String, Function> functions, Map<Integer, Expression> expressions) {

        return super.evalChildAsDouble(0, ast, vars, functions, expressions);
    }
}
