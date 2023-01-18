package com.jvision.domain.tools;

import java.util.Map;

public abstract class Tool {
    protected String name;
    protected Map<String, ToolParameter<Object>> parameters;

    public <T> void updateParametter(String parameterName, T value) {
        if (!parameters.containsKey(parameterName)) {
            return;
        }

        parameters.get(parameterName).setValue(value);
    }
}
