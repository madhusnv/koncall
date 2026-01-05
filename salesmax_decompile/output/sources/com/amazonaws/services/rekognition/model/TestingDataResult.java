package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class TestingDataResult implements Serializable {
    private TestingData input;
    private TestingData output;
    private ValidationData validation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TestingDataResult)) {
            return false;
        }
        TestingDataResult testingDataResult = (TestingDataResult) obj;
        if ((testingDataResult.getInput() == null) ^ (getInput() == null)) {
            return false;
        }
        if (testingDataResult.getInput() != null && !testingDataResult.getInput().equals(getInput())) {
            return false;
        }
        if ((testingDataResult.getOutput() == null) ^ (getOutput() == null)) {
            return false;
        }
        if (testingDataResult.getOutput() != null && !testingDataResult.getOutput().equals(getOutput())) {
            return false;
        }
        if ((testingDataResult.getValidation() == null) ^ (getValidation() == null)) {
            return false;
        }
        return testingDataResult.getValidation() == null || testingDataResult.getValidation().equals(getValidation());
    }

    public TestingData getInput() {
        return this.input;
    }

    public TestingData getOutput() {
        return this.output;
    }

    public ValidationData getValidation() {
        return this.validation;
    }

    public int hashCode() {
        return (((((getInput() == null ? 0 : getInput().hashCode()) + 31) * 31) + (getOutput() == null ? 0 : getOutput().hashCode())) * 31) + (getValidation() != null ? getValidation().hashCode() : 0);
    }

    public void setInput(TestingData testingData) {
        this.input = testingData;
    }

    public void setOutput(TestingData testingData) {
        this.output = testingData;
    }

    public void setValidation(ValidationData validationData) {
        this.validation = validationData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInput() != null) {
            sb.append("Input: " + getInput() + ",");
        }
        if (getOutput() != null) {
            sb.append("Output: " + getOutput() + ",");
        }
        if (getValidation() != null) {
            sb.append("Validation: " + getValidation());
        }
        sb.append("}");
        return sb.toString();
    }

    public TestingDataResult withInput(TestingData testingData) {
        this.input = testingData;
        return this;
    }

    public TestingDataResult withOutput(TestingData testingData) {
        this.output = testingData;
        return this;
    }

    public TestingDataResult withValidation(ValidationData validationData) {
        this.validation = validationData;
        return this;
    }
}
