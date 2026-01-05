package com.amplifyframework.core.model;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class CustomTypeField {
    private final boolean isArray;
    private final boolean isCustomType;
    private final boolean isEnum;
    private final boolean isRequired;
    private final Class<?> javaClassForValue;
    private final String name;
    private final String targetType;

    public static class CustomTypeFieldBuilder {
        private Class<?> javaClassForValue;
        private String name;
        private String targetType;
        private boolean isRequired = false;
        private boolean isArray = false;
        private boolean isEnum = false;
        private boolean isCustomType = false;

        public CustomTypeField build() {
            return new CustomTypeField(this);
        }

        public CustomTypeFieldBuilder isArray(boolean z) {
            this.isArray = z;
            return this;
        }

        public CustomTypeFieldBuilder isCustomType(boolean z) {
            this.isCustomType = z;
            return this;
        }

        public CustomTypeFieldBuilder isEnum(boolean z) {
            this.isEnum = z;
            return this;
        }

        public CustomTypeFieldBuilder isRequired(boolean z) {
            this.isRequired = z;
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
        if (this.isRequired == customTypeField.isRequired && this.isArray == customTypeField.isArray && this.isEnum == customTypeField.isEnum && this.isCustomType == customTypeField.isCustomType && s6c.m47909a(this.name, customTypeField.name) && s6c.m47909a(this.javaClassForValue, customTypeField.javaClassForValue)) {
            return s6c.m47909a(this.targetType, customTypeField.targetType);
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
        return "CustomTypeField{name='" + this.name + "', javaClassForValue='" + this.javaClassForValue + "', targetType='" + this.targetType + "', isRequired=" + this.isRequired + ", isArray=" + this.isArray + ", isEnum=" + this.isEnum + ", isCustomType=" + this.isCustomType + '}';
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
