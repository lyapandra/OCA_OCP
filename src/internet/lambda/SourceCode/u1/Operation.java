package internet.lambda.SourceCode.u1;

import javax.annotation.PostConstruct;

public interface Operation {
    double getResult(double value1, double value2);
}

interface OperationNoParameters {
    double getResult();
}

@FunctionalInterface
interface OperationDouble {
    double getResult(double value1, double value2);
}

interface OperationInt {
    int getResult(double value1, double value2);
}
