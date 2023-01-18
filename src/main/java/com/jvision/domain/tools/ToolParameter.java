package com.jvision.domain.tools;

public abstract class ToolParameter<T> {
    private String name;

    private T value;

    public ToolParameter(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
