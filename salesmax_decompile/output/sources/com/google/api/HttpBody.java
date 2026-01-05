package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wh0;
import p001o.wn7;
import p001o.xh0;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class HttpBody extends wn7 implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile hxc PARSER;
    private String contentType_ = "";
    private xq1 data_ = xq1.f54049b;
    private yn8.InterfaceC18446j extensions_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.HttpBody$1 */
    public static /* synthetic */ class C112081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13304xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13304xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13304xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements HttpBodyOrBuilder {
        public /* synthetic */ Builder(C112081 c112081) {
            this();
        }

        public Builder addAllExtensions(Iterable<? extends wh0> iterable) {
            copyOnWrite();
            ((HttpBody) this.instance).addAllExtensions(iterable);
            return this;
        }

        public Builder addExtensions(wh0 wh0Var) {
            copyOnWrite();
            ((HttpBody) this.instance).addExtensions(wh0Var);
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((HttpBody) this.instance).clearContentType();
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((HttpBody) this.instance).clearData();
            return this;
        }

        public Builder clearExtensions() {
            copyOnWrite();
            ((HttpBody) this.instance).clearExtensions();
            return this;
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public String getContentType() {
            return ((HttpBody) this.instance).getContentType();
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public xq1 getContentTypeBytes() {
            return ((HttpBody) this.instance).getContentTypeBytes();
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public xq1 getData() {
            return ((HttpBody) this.instance).getData();
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public wh0 getExtensions(int i) {
            return ((HttpBody) this.instance).getExtensions(i);
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public int getExtensionsCount() {
            return ((HttpBody) this.instance).getExtensionsCount();
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public List<wh0> getExtensionsList() {
            return Collections.unmodifiableList(((HttpBody) this.instance).getExtensionsList());
        }

        public Builder removeExtensions(int i) {
            copyOnWrite();
            ((HttpBody) this.instance).removeExtensions(i);
            return this;
        }

        public Builder setContentType(String str) {
            copyOnWrite();
            ((HttpBody) this.instance).setContentType(str);
            return this;
        }

        public Builder setContentTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((HttpBody) this.instance).setContentTypeBytes(xq1Var);
            return this;
        }

        public Builder setData(xq1 xq1Var) {
            copyOnWrite();
            ((HttpBody) this.instance).setData(xq1Var);
            return this;
        }

        public Builder setExtensions(int i, wh0 wh0Var) {
            copyOnWrite();
            ((HttpBody) this.instance).setExtensions(i, wh0Var);
            return this;
        }

        private Builder() {
            super(HttpBody.DEFAULT_INSTANCE);
        }

        public Builder addExtensions(int i, wh0 wh0Var) {
            copyOnWrite();
            ((HttpBody) this.instance).addExtensions(i, wh0Var);
            return this;
        }

        public Builder setExtensions(int i, wh0.C17863b c17863b) {
            copyOnWrite();
            ((HttpBody) this.instance).setExtensions(i, (wh0) c17863b.build());
            return this;
        }

        public Builder addExtensions(wh0.C17863b c17863b) {
            copyOnWrite();
            ((HttpBody) this.instance).addExtensions((wh0) c17863b.build());
            return this;
        }

        public Builder addExtensions(int i, wh0.C17863b c17863b) {
            copyOnWrite();
            ((HttpBody) this.instance).addExtensions(i, (wh0) c17863b.build());
            return this;
        }
    }

    static {
        HttpBody httpBody = new HttpBody();
        DEFAULT_INSTANCE = httpBody;
        wn7.registerDefaultInstance(HttpBody.class, httpBody);
    }

    private HttpBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensions(Iterable<? extends wh0> iterable) {
        ensureExtensionsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.extensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(wh0 wh0Var) {
        wh0Var.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(wh0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = getDefaultInstance().getContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensions() {
        this.extensions_ = wn7.emptyProtobufList();
    }

    private void ensureExtensionsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.extensions_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.extensions_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) {
        return (HttpBody) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensions(int i) {
        ensureExtensionsIsMutable();
        this.extensions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentTypeBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.contentType_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(xq1 xq1Var) {
        xq1Var.getClass();
        this.data_ = xq1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensions(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.set(i, wh0Var);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112081 c112081 = null;
        switch (C112081.f13304xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new HttpBody();
            case 2:
                return new Builder(c112081);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", wh0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (HttpBody.class) {
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

    @Override // com.google.api.HttpBodyOrBuilder
    public String getContentType() {
        return this.contentType_;
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public xq1 getContentTypeBytes() {
        return xq1.m56589q(this.contentType_);
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public xq1 getData() {
        return this.data_;
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public wh0 getExtensions(int i) {
        return (wh0) this.extensions_.get(i);
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public List<wh0> getExtensionsList() {
        return this.extensions_;
    }

    public xh0 getExtensionsOrBuilder(int i) {
        return (xh0) this.extensions_.get(i);
    }

    public List<? extends xh0> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    public static Builder newBuilder(HttpBody httpBody) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (HttpBody) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static HttpBody parseFrom(xq1 xq1Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(int i, wh0 wh0Var) {
        wh0Var.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(i, wh0Var);
    }

    public static HttpBody parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static HttpBody parseFrom(byte[] bArr) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpBody parseFrom(byte[] bArr, qp6 qp6Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static HttpBody parseFrom(InputStream inputStream) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static HttpBody parseFrom(jf3 jf3Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static HttpBody parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (HttpBody) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
