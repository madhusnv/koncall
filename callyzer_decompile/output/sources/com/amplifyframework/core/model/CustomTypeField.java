package com.amplifyframework.core.model;

import i0.m0;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CustomTypeField {
    private final boolean isArray;
    private final boolean isCustomType;
    private final boolean isEnum;
    private final boolean isRequired;
    private final Class<?> javaClassForValue;
    private final String name;
    private final String targetType;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class CustomTypeFieldBuilder {
        private Class<?> javaClassForValue;
        private String name;
        private String targetType;
        private boolean isRequired = false;
        private boolean isArray = false;
        private boolean isEnum = false;
        private boolean isCustomType = false;

        public CustomTypeField build() {
            return new CustomTypeField(this, 0);
        }

        public CustomTypeFieldBuilder isArray(boolean z6) {
            this.isArray = z6;
            return this;
        }

        public CustomTypeFieldBuilder isCustomType(boolean z6) {
            this.isCustomType = z6;
            return this;
        }

        public CustomTypeFieldBuilder isEnum(boolean z6) {
            this.isEnum = z6;
            return this;
        }

        public CustomTypeFieldBuilder isRequired(boolean z6) {
            this.isRequired = z6;
            return this;
        }

        public CustomTypeFieldBuilder javaClassForValue(Class<?> cls) {
            this.javaClassForValue = cls;
            return this;
        }

        public CustomTypeFieldBuilder name(String str) {
            this.name = str;
            return this;
        }

        public CustomTypeFieldBuilder targetType(String str) {
            this.targetType = str;
            return this;
        }
    }

    public /* synthetic */ CustomTypeField(CustomTypeFieldBuilder customTypeFieldBuilder, int i10) {
        this(customTypeFieldBuilder);
    }

    public static CustomTypeFieldBuilder builder() {
        return new CustomTypeFieldBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomTypeField.class != obj.getClass()) {
            return false;
        }
        CustomTypeField customTypeField = (CustomTypeField) obj;
        if (this.isRequired == customTypeField.isRequired && this.isArray == customTypeField.isArray && this.isEnum == customTypeField.isEnum && this.isCustomType == customTypeField.isCustomType && Objects.equals(this.name, customTypeField.name) && Objects.equals(this.javaClassForValue, customTypeField.javaClassForValue)) {
            return Objects.equals(this.targetType, customTypeField.targetType);
        }
        return false;
    }

    public Class<?> getJavaClassForValue() {
        return this.javaClassForValue;
    }

    public String getName() {
        return this.name;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Class<?> cls = this.javaClassForValue;
        int iHashCode2 = (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31;
        String str2 = this.targetType;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.isRequired ? 1 : 0)) * 31) + (this.isArray ? 1 : 0)) * 31) + (this.isEnum ? 1 : 0)) * 31) + (this.isCustomType ? 1 : 0);
    }

    public boolean isArray() {
        return this.isArray;
    }

    public boolean isCustomType() {
        return this.isCustomType;
    }

    public boolean isEnum() {
        return this.isEnum;
    }

    public boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomTypeField{name='");
        sb2.append(this.name);
        sb2.append("', javaClassForValue='");
        sb2.append(this.javaClassForValue);
        sb2.append("', targetType='");
        sb2.append(this.targetType);
        sb2.append("', isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", isArray=");
        sb2.append(this.isArray);
        sb2.append(", isEnum=");
        sb2.append(this.isEnum);
        sb2.append(", isCustomType=");
        return m0.m7382o(sb2, this.isCustomType, '}');
    }

    private CustomTypeField(CustomTypeFieldBuilder customTypeFieldBuilder) {
        this.name = customTypeFieldBuilder.name;
        this.javaClassForValue = customTypeFieldBuilder.javaClassForValue;
        this.targetType = customTypeFieldBuilder.targetType;
        this.isRequired = customTypeFieldBuilder.isRequired;
        this.isArray = customTypeFieldBuilder.isArray;
        this.isEnum = customTypeFieldBuilder.isEnum;
        this.isCustomType = customTypeFieldBuilder.isCustomType;
    }
}
