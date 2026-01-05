package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Node {
    private final String objectName;
    private final String propertyName;

    public interface BuildStep {
        Node build();

        BuildStep objectName(String str);

        BuildStep propertyName(String str);
    }

    public static class Builder implements BuildStep {
        private String objectName;
        private String propertyName;

        @Override // com.amplifyframework.datastore.generated.model.Node.BuildStep
        public Node build() {
            return new Node(this.objectName, this.propertyName);
        }

        @Override // com.amplifyframework.datastore.generated.model.Node.BuildStep
        public BuildStep objectName(String str) {
            this.objectName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Node.BuildStep
        public BuildStep propertyName(String str) {
            this.propertyName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.objectName = str;
            this.propertyName = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.Node.Builder, com.amplifyframework.datastore.generated.model.Node.BuildStep
        public CopyOfBuilder objectName(String str) {
            return (CopyOfBuilder) super.objectName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Node.Builder, com.amplifyframework.datastore.generated.model.Node.BuildStep
        public CopyOfBuilder propertyName(String str) {
            return (CopyOfBuilder) super.propertyName(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.objectName, this.propertyName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Node.class != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        return s6c.m47909a(getObjectName(), node.getObjectName()) && s6c.m47909a(getPropertyName(), node.getPropertyName());
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public int hashCode() {
        return (getObjectName() + getPropertyName()).hashCode();
    }

    private Node(String str, String str2) {
        this.objectName = str;
        this.propertyName = str2;
    }
}
