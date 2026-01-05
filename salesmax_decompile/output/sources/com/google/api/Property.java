package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class Property extends wn7 implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.Property$1 */
    public static /* synthetic */ class C112281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13320xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13320xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13320xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements PropertyOrBuilder {
        public /* synthetic */ Builder(C112281 c112281) {
            this();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((Property) this.instance).clearDescription();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Property) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Property) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getDescription() {
            return ((Property) this.instance).getDescription();
        }

        @Override // com.google.api.PropertyOrBuilder
        public xq1 getDescriptionBytes() {
            return ((Property) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getName() {
            return ((Property) this.instance).getName();
        }

        @Override // com.google.api.PropertyOrBuilder
        public xq1 getNameBytes() {
            return ((Property) this.instance).getNameBytes();
        }

        @Override // com.google.api.PropertyOrBuilder
        public PropertyType getType() {
            return ((Property) this.instance).getType();
        }

        @Override // com.google.api.PropertyOrBuilder
        public int getTypeValue() {
            return ((Property) this.instance).getTypeValue();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((Property) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Property) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Property) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Property) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setType(PropertyType propertyType) {
            copyOnWrite();
            ((Property) this.instance).setType(propertyType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((Property) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(Property.DEFAULT_INSTANCE);
        }
    }

    public enum PropertyType implements yn8.InterfaceC18439c {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 2;
        public static final int DOUBLE_VALUE = 4;
        public static final int INT64_VALUE = 1;
        public static final int STRING_VALUE = 3;
        public static final int UNSPECIFIED_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.Property.PropertyType.1
            @Override // p001o.yn8.InterfaceC18440d
            public PropertyType findValueByNumber(int i) {
                return PropertyType.forNumber(i);
            }
        };
        private final int value;

        public static final class PropertyTypeVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new PropertyTypeVerifier();

            private PropertyTypeVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return PropertyType.forNumber(i) != null;
            }
        }

        PropertyType(int i) {
            this.value = i;
        }

        public static PropertyType forNumber(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return INT64;
            }
            if (i == 2) {
                return BOOL;
            }
            if (i == 3) {
                return STRING;
            }
            if (i != 4) {
                return null;
            }
            return DOUBLE;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return PropertyTypeVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PropertyType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        wn7.registerDefaultInstance(Property.class, property);
    }

    private Property() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Property parseDelimitedFrom(InputStream inputStream) {
        return (Property) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(ByteBuffer byteBuffer) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.description_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.name_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(PropertyType propertyType) {
        this.type_ = propertyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112281 c112281 = null;
        switch (C112281.f13320xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Property();
            case 2:
                return new Builder(c112281);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Property.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.PropertyOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.PropertyOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.PropertyOrBuilder
    public PropertyType getType() {
        PropertyType propertyTypeForNumber = PropertyType.forNumber(this.type_);
        return propertyTypeForNumber == null ? PropertyType.UNRECOGNIZED : propertyTypeForNumber;
    }

    @Override // com.google.api.PropertyOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(Property property) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Property) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Property parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Property parseFrom(xq1 xq1Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static Property parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Property parseFrom(byte[] bArr) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Property parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Property parseFrom(InputStream inputStream) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Property parseFrom(jf3 jf3Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Property parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Property) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
