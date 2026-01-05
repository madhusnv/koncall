package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class ResourceReference extends wn7 implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    /* renamed from: com.google.api.ResourceReference$1 */
    public static /* synthetic */ class C112341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13324xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13324xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13324xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements ResourceReferenceOrBuilder {
        public /* synthetic */ Builder(C112341 c112341) {
            this();
        }

        public Builder clearChildType() {
            copyOnWrite();
            ((ResourceReference) this.instance).clearChildType();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ResourceReference) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getChildType() {
            return ((ResourceReference) this.instance).getChildType();
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public xq1 getChildTypeBytes() {
            return ((ResourceReference) this.instance).getChildTypeBytes();
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getType() {
            return ((ResourceReference) this.instance).getType();
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public xq1 getTypeBytes() {
            return ((ResourceReference) this.instance).getTypeBytes();
        }

        public Builder setChildType(String str) {
            copyOnWrite();
            ((ResourceReference) this.instance).setChildType(str);
            return this;
        }

        public Builder setChildTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceReference) this.instance).setChildTypeBytes(xq1Var);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((ResourceReference) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((ResourceReference) this.instance).setTypeBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(ResourceReference.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceReference resourceReference = new ResourceReference();
        DEFAULT_INSTANCE = resourceReference;
        wn7.registerDefaultInstance(ResourceReference.class, resourceReference);
    }

    private ResourceReference() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildType() {
        this.childType_ = getDefaultInstance().getChildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static ResourceReference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) {
        return (ResourceReference) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildType(String str) {
        str.getClass();
        this.childType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildTypeBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.childType_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.type_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112341 c112341 = null;
        switch (C112341.f13324xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new ResourceReference();
            case 2:
                return new Builder(c112341);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (ResourceReference.class) {
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

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getChildType() {
        return this.childType_;
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public xq1 getChildTypeBytes() {
        return xq1.m56589q(this.childType_);
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public xq1 getTypeBytes() {
        return xq1.m56589q(this.type_);
    }

    public static Builder newBuilder(ResourceReference resourceReference) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resourceReference);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (ResourceReference) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static ResourceReference parseFrom(xq1 xq1Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static ResourceReference parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static ResourceReference parseFrom(byte[] bArr) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceReference parseFrom(byte[] bArr, qp6 qp6Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static ResourceReference parseFrom(InputStream inputStream) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static ResourceReference parseFrom(jf3 jf3Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static ResourceReference parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (ResourceReference) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
