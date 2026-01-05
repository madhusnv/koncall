package com.amplifyframework.datastore.generated.model;

import java.util.List;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class DataExportTarget {
    private final List<String> exportFormat;
    private final Integer limit;
    private final List<Fields> projection;
    private final List<Recipient> recipientList;
    private final String recipientType;

    public interface BuildStep {
        DataExportTarget build();

        BuildStep exportFormat(List<String> list);

        BuildStep limit(Integer num);

        BuildStep projection(List<Fields> list);

        BuildStep recipientList(List<Recipient> list);

        BuildStep recipientType(String str);
    }

    public static class Builder implements BuildStep {
        private List<String> exportFormat;
        private Integer limit;
        private List<Fields> projection;
        private List<Recipient> recipientList;
        private String recipientType;

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public DataExportTarget build() {
            return new DataExportTarget(this.recipientType, this.recipientList, this.projection, this.exportFormat, this.limit);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public BuildStep exportFormat(List<String> list) {
            this.exportFormat = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public BuildStep limit(Integer num) {
            this.limit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public BuildStep projection(List<Fields> list) {
            this.projection = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public BuildStep recipientList(List<Recipient> list) {
            this.recipientList = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public BuildStep recipientType(String str) {
            this.recipientType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, List<Recipient> list, List<Fields> list2, List<String> list3, Integer num) {
            this.recipientType = str;
            this.recipientList = list;
            this.projection = list2;
            this.exportFormat = list3;
            this.limit = num;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public /* bridge */ /* synthetic */ BuildStep exportFormat(List list) {
            return exportFormat((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public /* bridge */ /* synthetic */ BuildStep projection(List list) {
            return projection((List<Fields>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public /* bridge */ /* synthetic */ BuildStep recipientList(List list) {
            return recipientList((List<Recipient>) list);
        }

        private CopyOfBuilder(String str, List<Recipient> list, List<Fields> list2, List<String> list3, Integer num) {
            super(str, list, list2, list3, num);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public CopyOfBuilder exportFormat(List<String> list) {
            return (CopyOfBuilder) super.exportFormat(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public CopyOfBuilder limit(Integer num) {
            return (CopyOfBuilder) super.limit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public CopyOfBuilder projection(List<Fields> list) {
            return (CopyOfBuilder) super.projection(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public CopyOfBuilder recipientList(List<Recipient> list) {
            return (CopyOfBuilder) super.recipientList(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DataExportTarget.Builder, com.amplifyframework.datastore.generated.model.DataExportTarget.BuildStep
        public CopyOfBuilder recipientType(String str) {
            return (CopyOfBuilder) super.recipientType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.recipientType, this.recipientList, this.projection, this.exportFormat, this.limit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DataExportTarget.class != obj.getClass()) {
            return false;
        }
        DataExportTarget dataExportTarget = (DataExportTarget) obj;
        return s6c.m47909a(getRecipientType(), dataExportTarget.getRecipientType()) && s6c.m47909a(getRecipientList(), dataExportTarget.getRecipientList()) && s6c.m47909a(getProjection(), dataExportTarget.getProjection()) && s6c.m47909a(getExportFormat(), dataExportTarget.getExportFormat()) && s6c.m47909a(getLimit(), dataExportTarget.getLimit());
    }

    public List<String> getExportFormat() {
        return this.exportFormat;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<Fields> getProjection() {
        return this.projection;
    }

    public List<Recipient> getRecipientList() {
        return this.recipientList;
    }

    public String getRecipientType() {
        return this.recipientType;
    }

    public int hashCode() {
        return (getRecipientType() + getRecipientList() + getProjection() + getExportFormat() + getLimit()).hashCode();
    }

    private DataExportTarget(String str, List<Recipient> list, List<Fields> list2, List<String> list3, Integer num) {
        this.recipientType = str;
        this.recipientList = list;
        this.projection = list2;
        this.exportFormat = list3;
        this.limit = num;
    }
}
