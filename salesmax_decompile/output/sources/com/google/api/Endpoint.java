package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class Endpoint extends wn7 implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private boolean allowCors_;
    private String name_ = "";
    private yn8.InterfaceC18446j aliases_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j features_ = wn7.emptyProtobufList();
    private String target_ = "";

    /* renamed from: com.google.api.Endpoint$1 */
    public static /* synthetic */ class C112051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13302xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13302xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13302xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements EndpointOrBuilder {
        public /* synthetic */ Builder(C112051 c112051) {
            this();
        }

        @Deprecated
        public Builder addAliases(String str) {
            copyOnWrite();
            ((Endpoint) this.instance).addAliases(str);
            return this;
        }

        @Deprecated
        public Builder addAliasesBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Endpoint) this.instance).addAliasesBytes(xq1Var);
            return this;
        }

        @Deprecated
        public Builder addAllAliases(Iterable<String> iterable) {
            copyOnWrite();
            ((Endpoint) this.instance).addAllAliases(iterable);
            return this;
        }

        public Builder addAllFeatures(Iterable<String> iterable) {
            copyOnWrite();
            ((Endpoint) this.instance).addAllFeatures(iterable);
            return this;
        }

        public Builder addFeatures(String str) {
            copyOnWrite();
            ((Endpoint) this.instance).addFeatures(str);
            return this;
        }

        public Builder addFeaturesBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Endpoint) this.instance).addFeaturesBytes(xq1Var);
            return this;
        }

        @Deprecated
        public Builder clearAliases() {
            copyOnWrite();
            ((Endpoint) this.instance).clearAliases();
            return this;
        }

        public Builder clearAllowCors() {
            copyOnWrite();
            ((Endpoint) this.instance).clearAllowCors();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((Endpoint) this.instance).clearFeatures();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Endpoint) this.instance).clearName();
            return this;
        }

        public Builder clearTarget() {
            copyOnWrite();
            ((Endpoint) this.instance).clearTarget();
            return this;
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public String getAliases(int i) {
            return ((Endpoint) this.instance).getAliases(i);
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public xq1 getAliasesBytes(int i) {
            return ((Endpoint) this.instance).getAliasesBytes(i);
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public int getAliasesCount() {
            return ((Endpoint) this.instance).getAliasesCount();
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public List<String> getAliasesList() {
            return Collections.unmodifiableList(((Endpoint) this.instance).getAliasesList());
        }

        @Override // com.google.api.EndpointOrBuilder
        public boolean getAllowCors() {
            return ((Endpoint) this.instance).getAllowCors();
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getFeatures(int i) {
            return ((Endpoint) this.instance).getFeatures(i);
        }

        @Override // com.google.api.EndpointOrBuilder
        public xq1 getFeaturesBytes(int i) {
            return ((Endpoint) this.instance).getFeaturesBytes(i);
        }

        @Override // com.google.api.EndpointOrBuilder
        public int getFeaturesCount() {
            return ((Endpoint) this.instance).getFeaturesCount();
        }

        @Override // com.google.api.EndpointOrBuilder
        public List<String> getFeaturesList() {
            return Collections.unmodifiableList(((Endpoint) this.instance).getFeaturesList());
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getName() {
            return ((Endpoint) this.instance).getName();
        }

        @Override // com.google.api.EndpointOrBuilder
        public xq1 getNameBytes() {
            return ((Endpoint) this.instance).getNameBytes();
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getTarget() {
            return ((Endpoint) this.instance).getTarget();
        }

        @Override // com.google.api.EndpointOrBuilder
        public xq1 getTargetBytes() {
            return ((Endpoint) this.instance).getTargetBytes();
        }

        @Deprecated
        public Builder setAliases(int i, String str) {
            copyOnWrite();
            ((Endpoint) this.instance).setAliases(i, str);
            return this;
        }

        public Builder setAllowCors(boolean z) {
            copyOnWrite();
            ((Endpoint) this.instance).setAllowCors(z);
            return this;
        }

        public Builder setFeatures(int i, String str) {
            copyOnWrite();
            ((Endpoint) this.instance).setFeatures(i, str);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Endpoint) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Endpoint) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setTarget(String str) {
            copyOnWrite();
            ((Endpoint) this.instance).setTarget(str);
            return this;
        }

        public Builder setTargetBytes(xq1 xq1Var) {
            copyOnWrite();
            ((Endpoint) this.instance).setTargetBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(Endpoint.DEFAULT_INSTANCE);
        }
    }

    static {
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        wn7.registerDefaultInstance(Endpoint.class, endpoint);
    }

    private Endpoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliases(String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliasesBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureAliasesIsMutable();
        this.aliases_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeaturesBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        ensureFeaturesIsMutable();
        this.features_.add(xq1Var.m56593N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowCors() {
        this.allowCors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.aliases_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.aliases_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureFeaturesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.features_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.features_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) {
        return (Endpoint) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(int i, String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowCors(boolean z) {
        this.allowCors_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i, String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.set(i, str);
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
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.target_ = xq1Var.m56593N();
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112051 c112051 = null;
        switch (C112051.f13302xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Endpoint();
            case 2:
                return new Builder(c112051);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Endpoint.class) {
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

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public String getAliases(int i) {
        return (String) this.aliases_.get(i);
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public xq1 getAliasesBytes(int i) {
        return xq1.m56589q((String) this.aliases_.get(i));
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    @Override // com.google.api.EndpointOrBuilder
    public boolean getAllowCors() {
        return this.allowCors_;
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getFeatures(int i) {
        return (String) this.features_.get(i);
    }

    @Override // com.google.api.EndpointOrBuilder
    public xq1 getFeaturesBytes(int i) {
        return xq1.m56589q((String) this.features_.get(i));
    }

    @Override // com.google.api.EndpointOrBuilder
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // com.google.api.EndpointOrBuilder
    public List<String> getFeaturesList() {
        return this.features_;
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.EndpointOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getTarget() {
        return this.target_;
    }

    @Override // com.google.api.EndpointOrBuilder
    public xq1 getTargetBytes() {
        return xq1.m56589q(this.target_);
    }

    public static Builder newBuilder(Endpoint endpoint) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Endpoint) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Endpoint parseFrom(xq1 xq1Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static Endpoint parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Endpoint parseFrom(byte[] bArr) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Endpoint parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Endpoint parseFrom(InputStream inputStream) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Endpoint parseFrom(jf3 jf3Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Endpoint parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Endpoint) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
