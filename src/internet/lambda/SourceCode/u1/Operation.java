package internet.lambda.SourceCode.u1;

import javax.annotation.PostConstruct;

public interface Operation {
    double getResult(double value1, double value2);
}

@FunctionalInterface
interface OperationInt {
    int getResult(double value1, double value2);
}
