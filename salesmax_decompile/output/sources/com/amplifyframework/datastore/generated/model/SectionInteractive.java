package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class SectionInteractive {
    private final List<ProductWa> sectionProductItems;
    private final List<SectionRow> sectionRows;
    private final String sectionTitle;

    public interface BuildStep {
        SectionInteractive build();

        BuildStep sectionProductItems(List<ProductWa> list);

        BuildStep sectionRows(List<SectionRow> list);

        BuildStep sectionTitle(String str);
    }

    public static class Builder implements BuildStep {
        private List<ProductWa> sectionProductItems;
        private List<SectionRow> sectionRows;
        private String sectionTitle;

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public SectionInteractive build() {
            return new SectionInteractive(this.sectionProductItems, this.sectionRows, this.sectionTitle);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public BuildStep sectionProductItems(List<ProductWa> list) {
            this.sectionProductItems = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public BuildStep sectionRows(List<SectionRow> list) {
            this.sectionRows = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public BuildStep sectionTitle(String str) {
            this.sectionTitle = str;
            return this;
        }

        public Builder() {
        }

        private Builder(List<ProductWa> list, List<SectionRow> list2, String str) {
            this.sectionProductItems = list;
            this.sectionRows = list2;
            this.sectionTitle = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.Builder, com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public /* bridge */ /* synthetic */ BuildStep sectionProductItems(List list) {
            return sectionProductItems((List<ProductWa>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.Builder, com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public /* bridge */ /* synthetic */ BuildStep sectionRows(List list) {
            return sectionRows((List<SectionRow>) list);
        }

        private CopyOfBuilder(List<ProductWa> list, List<SectionRow> list2, String str) {
            super(list, list2, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.Builder, com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public CopyOfBuilder sectionProductItems(List<ProductWa> list) {
            return (CopyOfBuilder) super.sectionProductItems(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.Builder, com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public CopyOfBuilder sectionRows(List<SectionRow> list) {
            return (CopyOfBuilder) super.sectionRows(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SectionInteractive.Builder, com.amplifyframework.datastore.generated.model.SectionInteractive.BuildStep
        public CopyOfBuilder sectionTitle(String str) {
            return (CopyOfBuilder) super.sectionTitle(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.sectionProductItems, this.sectionRows, this.sectionTitle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SectionInteractive.class != obj.getClass()) {
            return false;
        }
        SectionInteractive sectionInteractive = (SectionInteractive) obj;
        return s6c.m47909a(getSectionProductItems(), sectionInteractive.getSectionProductItems()) && s6c.m47909a(getSectionRows(), sectionInteractive.getSectionRows()) && s6c.m47909a(getSectionTitle(), sectionInteractive.getSectionTitle());
    }

    public List<ProductWa> getSectionProductItems() {
        return this.sectionProductItems;
    }

    public List<SectionRow> getSectionRows() {
        return this.sectionRows;
    }

    public String getSectionTitle() {
        return this.sectionTitle;
    }

    public int hashCode() {
        return (getSectionProductItems() + getSectionRows() + getSectionTitle()).hashCode();
    }

    private SectionInteractive(List<ProductWa> list, List<SectionRow> list2, String str) {
        this.sectionProductItems = list;
        this.sectionRows = list2;
        this.sectionTitle = str;
    }
}
