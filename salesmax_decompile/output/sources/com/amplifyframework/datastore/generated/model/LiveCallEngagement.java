package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class LiveCallEngagement {
    private final Engagement engagement;

    public interface BuildStep {
        LiveCallEngagement build();

        BuildStep engagement(Engagement engagement);
    }

    public static class Builder implements BuildStep {
        private Engagement engagement;

        @Override // com.amplifyframework.datastore.generated.model.LiveCallEngagement.BuildStep
        public LiveCallEngagement build() {
            return new LiveCallEngagement(this.engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.LiveCallEngagement.BuildStep
        public BuildStep engagement(Engagement engagement) {
            this.engagement = engagement;
            return this;
        }

        public Builder() {
        }

        private Builder(Engagement engagement) {
            this.engagement = engagement;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Engagement engagement) {
            super(engagement);
        }

        @Override // com.amplifyframework.datastore.generated.model.LiveCallEngagement.Builder, com.amplifyframework.datastore.generated.model.LiveCallEngagement.BuildStep
        public CopyOfBuilder engagement(Engagement engagement) {
            return (CopyOfBuilder) super.engagement(engagement);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.engagement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LiveCallEngagement.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getEngagement(), ((LiveCallEngagement) obj).getEngagement());
    }

    public Engagement getEngagement() {
        return this.engagement;
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEngagement());
        return sb.toString().hashCode();
    }

    private LiveCallEngagement(Engagement engagement) {
        this.engagement = engagement;
    }
}
