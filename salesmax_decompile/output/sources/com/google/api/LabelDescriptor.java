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
public final class LabelDescriptor extends wn7 implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    /* renamed from: com.google.api.LabelDescriptor$1 */
    public static /* synthetic */ class C112111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13307xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13307xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13307xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements LabelDescriptorOrBuilder {
        public /* synthetic */ Builder(C112111 c112111) {
            this();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearKey();
            return this;
        }

        public Builder clearValueType() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearValueType();
            return this;
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getDescription() {
            return ((LabelDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public xq1 getDescriptionBytes() {
            return ((LabelDescriptor) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getKey() {
            return ((LabelDescriptor) this.instance).getKey();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public xq1 getKeyBytes() {
            return ((LabelDescriptor) this.instance).getKeyBytes();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ValueType getValueType() {
            return ((LabelDescriptor) this.instance).getValueType();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public int getValueTypeValue() {
            return ((LabelDescriptor) this.instance).getValueTypeValue();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(xq1 xq1Var) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setKeyBytes(xq1Var);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int i) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setValueTypeValue(i);
            return this;
        }

        private Builder() {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }
    }

    public enum ValueType implements yn8.InterfaceC18439c {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int INT64_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.LabelDescriptor.ValueType.1
            @Override // p001o.yn8.InterfaceC18440d
            public ValueType findValueByNumber(int i) {
                return ValueType.forNumber(i);
            }
        };
        private final int value;

        public static final class ValueTypeVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new ValueTypeVerifier();

            private ValueTypeVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return ValueType.forNumber(i) != null;
            }
        }

        ValueType(int i) {
            this.value = i;
        }

        public static ValueType forNumber(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return BOOL;
            }
            if (i != 2) {
                return null;
            }
            return INT64;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return ValueTypeVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ValueType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        wn7.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    private LabelDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (LabelDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.key_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112111 c112111 = null;
        switch (C112111.f13307xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new LabelDescriptor();
            case 2:
                return new Builder(c112111);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (LabelDescriptor.class) {
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

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public xq1 getKeyBytes() {
        return xq1.m56589q(this.key_);
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ValueType getValueType() {
        ValueType valueTypeForNumber = ValueType.forNumber(this.valueType_);
        return valueTypeForNumber == null ? ValueType.UNRECOGNIZED : valueTypeForNumber;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public int getValueTypeValue() {
        return this.valueType_;
    }

    public static Builder newBuilder(LabelDescriptor labelDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static LabelDescriptor parseFrom(xq1 xq1Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static LabelDescriptor parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static LabelDescriptor parseFrom(byte[] bArr) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelDescriptor parseFrom(byte[] bArr, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static LabelDescriptor parseFrom(jf3 jf3Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static LabelDescriptor parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (LabelDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
