package com.amplifyframework.datastore.generated.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class PositionInput {
    private final Integer height;
    private final Integer minH;
    private final Integer minW;
    private final String selector;
    private final Integer width;

    /* renamed from: x */
    private final Integer f10643x;

    /* renamed from: y */
    private final Integer f10644y;

    public interface BuildStep {
        PositionInput build();

        BuildStep height(Integer num);

        BuildStep minH(Integer num);

        BuildStep minW(Integer num);

        BuildStep selector(String str);

        BuildStep width(Integer num);

        /* renamed from: x */
        BuildStep mo12185x(Integer num);

        /* renamed from: y */
        BuildStep mo12186y(Integer num);
    }

    public static class Builder implements BuildStep {
        private Integer height;
        private Integer minH;
        private Integer minW;
        private String selector;
        private Integer width;

        /* renamed from: x */
        private Integer f10645x;

        /* renamed from: y */
        private Integer f10646y;

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public PositionInput build() {
            return new PositionInput(this.f10645x, this.f10646y, this.width, this.height, this.minW, this.minH, this.selector);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public BuildStep height(Integer num) {
            this.height = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public BuildStep minH(Integer num) {
            this.minH = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public BuildStep minW(Integer num) {
            this.minW = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public BuildStep selector(String str) {
            this.selector = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public BuildStep width(Integer num) {
            this.width = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        /* renamed from: x */
        public BuildStep mo12185x(Integer num) {
            this.f10645x = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        /* renamed from: y */
        public BuildStep mo12186y(Integer num) {
            this.f10646y = num;
            return this;
        }

        public Builder() {
        }

        private Builder(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str) {
            this.f10645x = num;
            this.f10646y = num2;
            this.width = num3;
            this.height = num4;
            this.minW = num5;
            this.minH = num6;
            this.selector = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str) {
            super(num, num2, num3, num4, num5, num6, str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public CopyOfBuilder height(Integer num) {
            return (CopyOfBuilder) super.height(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public CopyOfBuilder minH(Integer num) {
            return (CopyOfBuilder) super.minH(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public CopyOfBuilder minW(Integer num) {
            return (CopyOfBuilder) super.minW(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public CopyOfBuilder selector(String str) {
            return (CopyOfBuilder) super.selector(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        public CopyOfBuilder width(Integer num) {
            return (CopyOfBuilder) super.width(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        /* renamed from: x */
        public CopyOfBuilder mo12185x(Integer num) {
            return (CopyOfBuilder) super.mo12185x(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.PositionInput.Builder, com.amplifyframework.datastore.generated.model.PositionInput.BuildStep
        /* renamed from: y */
        public CopyOfBuilder mo12186y(Integer num) {
            return (CopyOfBuilder) super.mo12186y(num);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.f10643x, this.f10644y, this.width, this.height, this.minW, this.minH, this.selector);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PositionInput.class != obj.getClass()) {
            return false;
        }
        PositionInput positionInput = (PositionInput) obj;
        return s6c.m47909a(getX(), positionInput.getX()) && s6c.m47909a(getY(), positionInput.getY()) && s6c.m47909a(getWidth(), positionInput.getWidth()) && s6c.m47909a(getHeight(), positionInput.getHeight()) && s6c.m47909a(getMinW(), positionInput.getMinW()) && s6c.m47909a(getMinH(), positionInput.getMinH()) && s6c.m47909a(getSelector(), positionInput.getSelector());
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getMinH() {
        return this.minH;
    }

    public Integer getMinW() {
        return this.minW;
    }

    public String getSelector() {
        return this.selector;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getX() {
        return this.f10643x;
    }

    public Integer getY() {
        return this.f10644y;
    }

    public int hashCode() {
        return (getX() + getY() + getWidth() + getHeight() + getMinW() + getMinH() + getSelector()).hashCode();
    }

    private PositionInput(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str) {
        this.f10643x = num;
        this.f10644y = num2;
        this.width = num3;
        this.height = num4;
        this.minW = num5;
        this.minH = num6;
        this.selector = str;
    }
}
