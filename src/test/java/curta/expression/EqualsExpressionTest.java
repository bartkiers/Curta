package curta.expression;

import curta.CurtaNode;
import curta.Operator;
import curta.ParseException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EqualsExpressionTest extends ExpressionTestBase {

    @Test
    public void testEval() throws ParseException {

        Operator operator = Operator.Equals;
        Expression expression = super.expressions.get(operator.type);

        Object[][] tests = {
                {"2 == 6", 2 == 6},
                {"-2 == -2", -2 == -2},
                {"2.2 == 2.2", 2.2 == 2.2},
                {"false == true", false},
                {"false == false", true},
                {"true == true", true},
                {"null == false", false},
                {"null == null", true}
        };

        for(Object[] test : tests) {

            CurtaNode ast = super.getExpressionRoot((String)test[0]);
            assertThat(ast.treeType, is(operator.type));
            Object value = expression.eval(ast, super.variables, super.functions, super.expressions);

            assertEquals(value, test[1]);
        }
    }
}
