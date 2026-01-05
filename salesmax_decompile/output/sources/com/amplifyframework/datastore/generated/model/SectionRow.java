package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class SectionRow {
    private final String sectionRowDescription;
    private final String sectionRowId;
    private final String sectionRowTitle;

    public interface BuildStep {
        SectionRow build();

        BuildStep sectionRowDescription(String str);

        BuildStep sectionRowId(String str);

        BuildStep sectionRowTitle(String str);
    }

    public static class Builder implements BuildStep {
        private String sectionRowDescription;
        private String sectionRowId;
        private String sectionRowTitle;

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public SectionRow build() {
            return new SectionRow(this.sectionRowId, this.sectionRowTitle, this.sectionRowDescription);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public BuildStep sectionRowDescription(String str) {
            this.sectionRowDescription = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public BuildStep sectionRowId(String str) {
            this.sectionRowId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public BuildStep sectionRowTitle(String str) {
            this.sectionRowTitle = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3) {
            this.sectionRowId = str;
            this.sectionRowTitle = str2;
            this.sectionRowDescription = str3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.Builder, com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public CopyOfBuilder sectionRowDescription(String str) {
            return (CopyOfBuilder) super.sectionRowDescription(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.Builder, com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public CopyOfBuilder sectionRowId(String str) {
            return (CopyOfBuilder) super.sectionRowId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionRow.Builder, com.amplifyframework.datastore.generated.model.SectionRow.BuildStep
        public CopyOfBuilder sectionRowTitle(String str) {
            return (CopyOfBuilder) super.sectionRowTitle(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.sectionRowId, this.sectionRowTitle, this.sectionRowDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SectionRow.class != obj.getClass()) {
            return false;
        }
        SectionRow sectionRow = (SectionRow) obj;
        return s6c.m47909a(getSectionRowId(), sectionRow.getSectionRowId()) && s6c.m47909a(getSectionRowTitle(), sectionRow.getSectionRowTitle()) && s6c.m47909a(getSectionRowDescription(), sectionRow.getSectionRowDescription());
    }

    public String getSectionRowDescription() {
        return this.sectionRowDescription;
    }

    public String getSectionRowId() {
        return this.sectionRowId;
    }

    public String getSectionRowTitle() {
        return this.sectionRowTitle;
    }

    public int hashCode() {
        return (getSectionRowId() + getSectionRowTitle() + getSectionRowDescription()).hashCode();
    }

    private SectionRow(String str, String str2, String str3) {
        this.sectionRowId = str;
        this.sectionRowTitle = str2;
        this.sectionRowDescription = str3;
    }
}
