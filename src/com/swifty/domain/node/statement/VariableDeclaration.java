package com.swifty.domain.node.statement;


import com.swifty.bytecodegeneration.statement.StatementGenerator;
import com.swifty.domain.node.expression.Expression;

/**
 * Created by Alex
 */
public class VariableDeclaration implements Statement {
    private final String name;
    private final Expression expression;

    public VariableDeclaration(String name, Expression expression) {
        this.expression = expression;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
