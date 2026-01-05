package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class BusinessDetail {
    private final String id;
    private final String industry;
    private final String name;
    private final String website;

    public interface BuildStep {
        BusinessDetail build();

        BuildStep industry(String str);

        BuildStep website(String str);
    }

    public static class Builder implements IdStep, NameStep, BuildStep {
        private String id;
        private String industry;
        private String name;
        private String website;

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.BuildStep
        public BusinessDetail build() {
            return new BusinessDetail(this.id, this.name, this.website, this.industry);
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.IdStep
        public NameStep id(String str) {
            Objects.requireNonNull(str);
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.BuildStep
        public BuildStep industry(String str) {
            this.industry = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.NameStep
        public BuildStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.BuildStep
        public BuildStep website(String str) {
            this.website = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4) {
            this.id = str;
            this.name = str2;
            this.website = str3;
            this.industry = str4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.Builder, com.amplifyframework.datastore.generated.model.BusinessDetail.IdStep
        public CopyOfBuilder id(String str) {
            return (CopyOfBuilder) super.id(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.Builder, com.amplifyframework.datastore.generated.model.BusinessDetail.BuildStep
        public CopyOfBuilder industry(String str) {
            return (CopyOfBuilder) super.industry(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.Builder, com.amplifyframework.datastore.generated.model.BusinessDetail.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BusinessDetail.Builder, com.amplifyframework.datastore.generated.model.BusinessDetail.BuildStep
        public CopyOfBuilder website(String str) {
            return (CopyOfBuilder) super.website(str);
        }
    }

    public interface IdStep {
        NameStep id(String str);
    }

    public interface NameStep {
        BuildStep name(String str);
    }

    public static IdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.name, this.website, this.industry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BusinessDetail.class != obj.getClass()) {
            return false;
        }
        BusinessDetail businessDetail = (BusinessDetail) obj;
        return s6c.m47909a(getId(), businessDetail.getId()) && s6c.m47909a(getName(), businessDetail.getName()) && s6c.m47909a(getWebsite(), businessDetail.getWebsite()) && s6c.m47909a(getIndustry(), businessDetail.getIndustry());
    }

    public String getId() {
        return this.id;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getName() {
        return this.name;
    }

    public String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return (getId() + getName() + getWebsite() + getIndustry()).hashCode();
    }

    private BusinessDetail(String str, String str2, String str3, String str4) {
        this.id = str;
        this.name = str2;
        this.website = str3;
        this.industry = str4;
    }
}
