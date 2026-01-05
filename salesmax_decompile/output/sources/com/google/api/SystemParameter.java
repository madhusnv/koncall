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
public final class SystemParameter extends wn7 implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String name_ = "";
    private String httpHeader_ = "";
    private String urlQueryParameter_ = "";

    /* renamed from: com.google.api.SystemParameter$1 */
    public static /* synthetic */ class C112371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13327xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13327xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13327xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements SystemParameterOrBuilder {
        public /* synthetic */ Builder(C112371 c112371) {
            this();
        }

        public Builder clearHttpHeader() {
            copyOnWrite();
            ((SystemParameter) this.instance).clearHttpHeader();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((SystemParameter) this.instance).clearName();
            return this;
        }

        public Builder clearUrlQueryParameter() {
            copyOnWrite();
            ((SystemParameter) this.instance).clearUrlQueryParameter();
            return this;
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getHttpHeader() {
            return ((SystemParameter) this.instance).getHttpHeader();
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public xq1 getHttpHeaderBytes() {
            return ((SystemParameter) this.instance).getHttpHeaderBytes();
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getName() {
            return ((SystemParameter) this.instance).getName();
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public xq1 getNameBytes() {
            return ((SystemParameter) this.instance).getNameBytes();
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getUrlQueryParameter() {
            return ((SystemParameter) this.instance).getUrlQueryParameter();
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public xq1 getUrlQueryParameterBytes() {
            return ((SystemParameter) this.instance).getUrlQueryParameterBytes();
        }

        public Builder setHttpHeader(String str) {
            copyOnWrite();
            ((SystemParameter) this.instance).setHttpHeader(str);
            return this;
        }

        public Builder setHttpHeaderBytes(xq1 xq1Var) {
            copyOnWrite();
            ((SystemParameter) this.instance).setHttpHeaderBytes(xq1Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((SystemParameter) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((SystemParameter) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setUrlQueryParameter(String str) {
            copyOnWrite();
            ((SystemParameter) this.instance).setUrlQueryParameter(str);
            return this;
        }

        public Builder setUrlQueryParameterBytes(xq1 xq1Var) {
            copyOnWrite();
            ((SystemParameter) this.instance).setUrlQueryParameterBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(SystemParameter.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameter systemParameter = new SystemParameter();
        DEFAULT_INSTANCE = systemParameter;
        wn7.registerDefaultInstance(SystemParameter.class, systemParameter);
    }

    private SystemParameter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpHeader() {
        this.httpHeader_ = getDefaultInstance().getHttpHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlQueryParameter() {
        this.urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
    }

    public static SystemParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameter) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeader(String str) {
        str.getClass();
        this.httpHeader_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeaderBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.httpHeader_ = xq1Var.m56593N();
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
    public void setUrlQueryParameter(String str) {
        str.getClass();
        this.urlQueryParameter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlQueryParameterBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.urlQueryParameter_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112371 c112371 = null;
        switch (C112371.f13327xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new SystemParameter();
            case 2:
                return new Builder(c112371);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (SystemParameter.class) {
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

    @Override // com.google.api.SystemParameterOrBuilder
    public String getHttpHeader() {
        return this.httpHeader_;
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public xq1 getHttpHeaderBytes() {
        return xq1.m56589q(this.httpHeader_);
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public xq1 getUrlQueryParameterBytes() {
        return xq1.m56589q(this.urlQueryParameter_);
    }

    public static Builder newBuilder(SystemParameter systemParameter) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(systemParameter);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameter) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static SystemParameter parseFrom(xq1 xq1Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static SystemParameter parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static SystemParameter parseFrom(byte[] bArr) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameter parseFrom(byte[] bArr, qp6 qp6Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static SystemParameter parseFrom(InputStream inputStream) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static SystemParameter parseFrom(jf3 jf3Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static SystemParameter parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (SystemParameter) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
