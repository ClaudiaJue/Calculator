package com.calculator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public interface UiEvents {
    class ReadNumber implements UiEvents {
    }

    class ReadOperation implements UiEvents {
    }

    class PrintResult implements UiEvents {
        private Double result;

        PrintResult(Double result) {
            this.result = result;
        }

        Double getResult() {
            return result;
        }
    }

    class NotSupported implements UiEvents {
    }
}
