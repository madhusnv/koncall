package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class HumanLoopConfig implements Serializable {
    private HumanLoopDataAttributes dataAttributes;
    private String flowDefinitionArn;
    private String humanLoopName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HumanLoopConfig)) {
            return false;
        }
        HumanLoopConfig humanLoopConfig = (HumanLoopConfig) obj;
        if ((humanLoopConfig.getHumanLoopName() == null) ^ (getHumanLoopName() == null)) {
            return false;
        }
        if (humanLoopConfig.getHumanLoopName() != null && !humanLoopConfig.getHumanLoopName().equals(getHumanLoopName())) {
            return false;
        }
        if ((humanLoopConfig.getFlowDefinitionArn() == null) ^ (getFlowDefinitionArn() == null)) {
            return false;
        }
        if (humanLoopConfig.getFlowDefinitionArn() != null && !humanLoopConfig.getFlowDefinitionArn().equals(getFlowDefinitionArn())) {
            return false;
        }
        if ((humanLoopConfig.getDataAttributes() == null) ^ (getDataAttributes() == null)) {
            return false;
        }
        return humanLoopConfig.getDataAttributes() == null || humanLoopConfig.getDataAttributes().equals(getDataAttributes());
    }

    public HumanLoopDataAttributes getDataAttributes() {
        return this.dataAttributes;
    }

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    public String getHumanLoopName() {
        return this.humanLoopName;
    }

    public int hashCode() {
        return (((((getHumanLoopName() == null ? 0 : getHumanLoopName().hashCode()) + 31) * 31) + (getFlowDefinitionArn() == null ? 0 : getFlowDefinitionArn().hashCode())) * 31) + (getDataAttributes() != null ? getDataAttributes().hashCode() : 0);
    }

    public void setDataAttributes(HumanLoopDataAttributes humanLoopDataAttributes) {
        this.dataAttributes = humanLoopDataAttributes;
    }

    public void setFlowDefinitionArn(String str) {
        this.flowDefinitionArn = str;
    }

    public void setHumanLoopName(String str) {
        this.humanLoopName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHumanLoopName() != null) {
            sb.append("HumanLoopName: " + getHumanLoopName() + ",");
        }
        if (getFlowDefinitionArn() != null) {
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn() + ",");
        }
        if (getDataAttributes() != null) {
            sb.append("DataAttributes: " + getDataAttributes());
        }
        sb.append("}");
        return sb.toString();
    }

    public HumanLoopConfig withDataAttributes(HumanLoopDataAttributes humanLoopDataAttributes) {
        this.dataAttributes = humanLoopDataAttributes;
        return this;
    }

    public HumanLoopConfig withFlowDefinitionArn(String str) {
        this.flowDefinitionArn = str;
        return this;
    }

    public HumanLoopConfig withHumanLoopName(String str) {
        this.humanLoopName = str;
        return this;
    }
}
