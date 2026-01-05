package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class Segment {
    private final String criteria;
    private final String defaultTableName;
    private final String joinStatement;
    private final Integer limit;
    private final String name;
    private final String template;

    public interface BuildStep {
        Segment build();

        BuildStep criteria(String str);

        BuildStep defaultTableName(String str);

        BuildStep joinStatement(String str);

        BuildStep limit(Integer num);

        BuildStep name(String str);

        BuildStep template(String str);
    }

    public static class Builder implements BuildStep {
        private String criteria;
        private String defaultTableName;
        private String joinStatement;
        private Integer limit;
        private String name;
        private String template;

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public Segment build() {
            return new Segment(this.name, this.template, this.joinStatement, this.criteria, this.defaultTableName, this.limit);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep criteria(String str) {
            this.criteria = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep defaultTableName(String str) {
            this.defaultTableName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep joinStatement(String str) {
            this.joinStatement = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep limit(Integer num) {
            this.limit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public BuildStep template(String str) {
            this.template = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Integer num) {
            this.name = str;
            this.template = str2;
            this.joinStatement = str3;
            this.criteria = str4;
            this.defaultTableName = str5;
            this.limit = num;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Integer num) {
            super(str, str2, str3, str4, str5, num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder criteria(String str) {
            return (CopyOfBuilder) super.criteria(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder defaultTableName(String str) {
            return (CopyOfBuilder) super.defaultTableName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder joinStatement(String str) {
            return (CopyOfBuilder) super.joinStatement(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder limit(Integer num) {
            return (CopyOfBuilder) super.limit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Segment.Builder, com.amplifyframework.datastore.generated.model.Segment.BuildStep
        public CopyOfBuilder template(String str) {
            return (CopyOfBuilder) super.template(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.name, this.template, this.joinStatement, this.criteria, this.defaultTableName, this.limit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Segment.class != obj.getClass()) {
            return false;
        }
        Segment segment = (Segment) obj;
        return s6c.m47909a(getName(), segment.getName()) && s6c.m47909a(getTemplate(), segment.getTemplate()) && s6c.m47909a(getJoinStatement(), segment.getJoinStatement()) && s6c.m47909a(getCriteria(), segment.getCriteria()) && s6c.m47909a(getDefaultTableName(), segment.getDefaultTableName()) && s6c.m47909a(getLimit(), segment.getLimit());
    }

    public String getCriteria() {
        return this.criteria;
    }

    public String getDefaultTableName() {
        return this.defaultTableName;
    }

    public String getJoinStatement() {
        return this.joinStatement;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getName() {
        return this.name;
    }

    public String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return (getName() + getTemplate() + getJoinStatement() + getCriteria() + getDefaultTableName() + getLimit()).hashCode();
    }

    private Segment(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.name = str;
        this.template = str2;
        this.joinStatement = str3;
        this.criteria = str4;
        this.defaultTableName = str5;
        this.limit = num;
    }
}
