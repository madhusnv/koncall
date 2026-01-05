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
public final class CustomHttpPattern extends wn7 implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    /* renamed from: com.google.api.CustomHttpPattern$1 */
    public static /* synthetic */ class C112011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13298xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13298xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13298xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements CustomHttpPatternOrBuilder {
        public /* synthetic */ Builder(C112011 c112011) {
            this();
        }

        public Builder clearKind() {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).clearKind();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).clearPath();
            return this;
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public String getKind() {
            return ((CustomHttpPattern) this.instance).getKind();
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public xq1 getKindBytes() {
            return ((CustomHttpPattern) this.instance).getKindBytes();
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public String getPath() {
            return ((CustomHttpPattern) this.instance).getPath();
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public xq1 getPathBytes() {
            return ((CustomHttpPattern) this.instance).getPathBytes();
        }

        public Builder setKind(String str) {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).setKind(str);
            return this;
        }

        public Builder setKindBytes(xq1 xq1Var) {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).setKindBytes(xq1Var);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(xq1 xq1Var) {
            copyOnWrite();
            ((CustomHttpPattern) this.instance).setPathBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(CustomHttpPattern.DEFAULT_INSTANCE);
        }
    }

    static {
        CustomHttpPattern customHttpPattern = new CustomHttpPattern();
        DEFAULT_INSTANCE = customHttpPattern;
        wn7.registerDefaultInstance(CustomHttpPattern.class, customHttpPattern);
    }

    private CustomHttpPattern() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) {
        return (CustomHttpPattern) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.kind_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.path_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112011 c112011 = null;
        switch (C112011.f13298xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new CustomHttpPattern();
            case 2:
                return new Builder(c112011);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (CustomHttpPattern.class) {
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

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public String getKind() {
        return this.kind_;
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public xq1 getKindBytes() {
        return xq1.m56589q(this.kind_);
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public String getPath() {
        return this.path_;
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public xq1 getPathBytes() {
        return xq1.m56589q(this.path_);
    }

    public static Builder newBuilder(CustomHttpPattern customHttpPattern) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static CustomHttpPattern parseFrom(xq1 xq1Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static CustomHttpPattern parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static CustomHttpPattern parseFrom(jf3 jf3Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static CustomHttpPattern parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (CustomHttpPattern) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
