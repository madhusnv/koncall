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
public final class JwtLocation extends wn7 implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    /* renamed from: com.google.api.JwtLocation$1 */
    public static /* synthetic */ class C112101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13306xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13306xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13306xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements JwtLocationOrBuilder {
        public /* synthetic */ Builder(C112101 c112101) {
            this();
        }

        public Builder clearHeader() {
            copyOnWrite();
            ((JwtLocation) this.instance).clearHeader();
            return this;
        }

        public Builder clearIn() {
            copyOnWrite();
            ((JwtLocation) this.instance).clearIn();
            return this;
        }

        public Builder clearQuery() {
            copyOnWrite();
            ((JwtLocation) this.instance).clearQuery();
            return this;
        }

        public Builder clearValuePrefix() {
            copyOnWrite();
            ((JwtLocation) this.instance).clearValuePrefix();
            return this;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getHeader() {
            return ((JwtLocation) this.instance).getHeader();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public xq1 getHeaderBytes() {
            return ((JwtLocation) this.instance).getHeaderBytes();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public InCase getInCase() {
            return ((JwtLocation) this.instance).getInCase();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getQuery() {
            return ((JwtLocation) this.instance).getQuery();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public xq1 getQueryBytes() {
            return ((JwtLocation) this.instance).getQueryBytes();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getValuePrefix() {
            return ((JwtLocation) this.instance).getValuePrefix();
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public xq1 getValuePrefixBytes() {
            return ((JwtLocation) this.instance).getValuePrefixBytes();
        }

        public Builder setHeader(String str) {
            copyOnWrite();
            ((JwtLocation) this.instance).setHeader(str);
            return this;
        }

        public Builder setHeaderBytes(xq1 xq1Var) {
            copyOnWrite();
            ((JwtLocation) this.instance).setHeaderBytes(xq1Var);
            return this;
        }

        public Builder setQuery(String str) {
            copyOnWrite();
            ((JwtLocation) this.instance).setQuery(str);
            return this;
        }

        public Builder setQueryBytes(xq1 xq1Var) {
            copyOnWrite();
            ((JwtLocation) this.instance).setQueryBytes(xq1Var);
            return this;
        }

        public Builder setValuePrefix(String str) {
            copyOnWrite();
            ((JwtLocation) this.instance).setValuePrefix(str);
            return this;
        }

        public Builder setValuePrefixBytes(xq1 xq1Var) {
            copyOnWrite();
            ((JwtLocation) this.instance).setValuePrefixBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(JwtLocation.DEFAULT_INSTANCE);
        }
    }

    public enum InCase {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);

        private final int value;

        InCase(int i) {
            this.value = i;
        }

        public static InCase forNumber(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static InCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        wn7.registerDefaultInstance(JwtLocation.class, jwtLocation);
    }

    private JwtLocation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValuePrefix() {
        this.valuePrefix_ = getDefaultInstance().getValuePrefix();
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) {
        return (JwtLocation) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.in_ = xq1Var.m56593N();
        this.inCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.in_ = xq1Var.m56593N();
        this.inCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefix(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefixBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.valuePrefix_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112101 c112101 = null;
        switch (C112101.f13306xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new JwtLocation();
            case 2:
                return new Builder(c112101);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (JwtLocation.class) {
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

    @Override // com.google.api.JwtLocationOrBuilder
    public String getHeader() {
        return this.inCase_ == 1 ? (String) this.in_ : "";
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public xq1 getHeaderBytes() {
        return xq1.m56589q(this.inCase_ == 1 ? (String) this.in_ : "");
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public InCase getInCase() {
        return InCase.forNumber(this.inCase_);
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getQuery() {
        return this.inCase_ == 2 ? (String) this.in_ : "";
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public xq1 getQueryBytes() {
        return xq1.m56589q(this.inCase_ == 2 ? (String) this.in_ : "");
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public xq1 getValuePrefixBytes() {
        return xq1.m56589q(this.valuePrefix_);
    }

    public static Builder newBuilder(JwtLocation jwtLocation) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(jwtLocation);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (JwtLocation) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static JwtLocation parseFrom(xq1 xq1Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static JwtLocation parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static JwtLocation parseFrom(byte[] bArr) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtLocation parseFrom(byte[] bArr, qp6 qp6Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static JwtLocation parseFrom(InputStream inputStream) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static JwtLocation parseFrom(jf3 jf3Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static JwtLocation parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (JwtLocation) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
