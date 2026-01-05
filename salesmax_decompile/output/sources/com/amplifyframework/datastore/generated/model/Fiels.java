package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Fiels {
    private final Node node;
    private final String propertyAlias;

    public interface BuildStep {
        Fiels build();

        BuildStep node(Node node);

        BuildStep propertyAlias(String str);
    }

    public static class Builder implements BuildStep {
        private Node node;
        private String propertyAlias;

        @Override // com.amplifyframework.datastore.generated.model.Fiels.BuildStep
        public Fiels build() {
            return new Fiels(this.node, this.propertyAlias);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fiels.BuildStep
        public BuildStep node(Node node) {
            this.node = node;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Fiels.BuildStep
        public BuildStep propertyAlias(String str) {
            this.propertyAlias = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Node node, String str) {
            this.node = node;
            this.propertyAlias = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Node node, String str) {
            super(node, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fiels.Builder, com.amplifyframework.datastore.generated.model.Fiels.BuildStep
        public CopyOfBuilder node(Node node) {
            return (CopyOfBuilder) super.node(node);
        }

        @Override // com.amplifyframework.datastore.generated.model.Fiels.Builder, com.amplifyframework.datastore.generated.model.Fiels.BuildStep
        public CopyOfBuilder propertyAlias(String str) {
            return (CopyOfBuilder) super.propertyAlias(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.node, this.propertyAlias);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Fiels.class != obj.getClass()) {
            return false;
        }
        Fiels fiels = (Fiels) obj;
        return s6c.m47909a(getNode(), fiels.getNode()) && s6c.m47909a(getPropertyAlias(), fiels.getPropertyAlias());
    }

    public Node getNode() {
        return this.node;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public int hashCode() {
        return (getNode() + getPropertyAlias()).hashCode();
    }

    private Fiels(Node node, String str) {
        this.node = node;
        this.propertyAlias = str;
    }
}
