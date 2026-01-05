package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p001o.fbj;
import p001o.hxc;
import p001o.jf3;
import p001o.k9g;
import p001o.nra;
import p001o.ora;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class MonitoredResourceMetadata extends wn7 implements MonitoredResourceMetadataOrBuilder {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private k9g systemLabels_;
    private ora userLabels_ = ora.m42592g();

    /* renamed from: com.google.api.MonitoredResourceMetadata$1 */
    public static /* synthetic */ class C112231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13315xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13315xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13315xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MonitoredResourceMetadataOrBuilder {
        public /* synthetic */ Builder(C112231 c112231) {
            this();
        }

        public Builder clearSystemLabels() {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).clearSystemLabels();
            return this;
        }

        public Builder clearUserLabels() {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().clear();
            return this;
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public boolean containsUserLabels(String str) {
            str.getClass();
            return ((MonitoredResourceMetadata) this.instance).getUserLabelsMap().containsKey(str);
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public k9g getSystemLabels() {
            return ((MonitoredResourceMetadata) this.instance).getSystemLabels();
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        @Deprecated
        public Map<String, String> getUserLabels() {
            return getUserLabelsMap();
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public int getUserLabelsCount() {
            return ((MonitoredResourceMetadata) this.instance).getUserLabelsMap().size();
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public Map<String, String> getUserLabelsMap() {
            return Collections.unmodifiableMap(((MonitoredResourceMetadata) this.instance).getUserLabelsMap());
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public String getUserLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> userLabelsMap = ((MonitoredResourceMetadata) this.instance).getUserLabelsMap();
            return userLabelsMap.containsKey(str) ? userLabelsMap.get(str) : str2;
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public String getUserLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> userLabelsMap = ((MonitoredResourceMetadata) this.instance).getUserLabelsMap();
            if (userLabelsMap.containsKey(str)) {
                return userLabelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.api.MonitoredResourceMetadataOrBuilder
        public boolean hasSystemLabels() {
            return ((MonitoredResourceMetadata) this.instance).hasSystemLabels();
        }

        public Builder mergeSystemLabels(k9g k9gVar) {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).mergeSystemLabels(k9gVar);
            return this;
        }

        public Builder putAllUserLabels(Map<String, String> map) {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().putAll(map);
            return this;
        }

        public Builder putUserLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().put(str, str2);
            return this;
        }

        public Builder removeUserLabels(String str) {
            str.getClass();
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().remove(str);
            return this;
        }

        public Builder setSystemLabels(k9g k9gVar) {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).setSystemLabels(k9gVar);
            return this;
        }

        private Builder() {
            super(MonitoredResourceMetadata.DEFAULT_INSTANCE);
        }

        public Builder setSystemLabels(k9g.C14751b c14751b) {
            copyOnWrite();
            ((MonitoredResourceMetadata) this.instance).setSystemLabels((k9g) c14751b.build());
            return this;
        }
    }

    public static final class UserLabelsDefaultEntryHolder {
        static final nra defaultEntry;

        static {
            fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.STRING;
            defaultEntry = nra.m41005d(enumC13396b, "", enumC13396b, "");
        }

        private UserLabelsDefaultEntryHolder() {
        }
    }

    static {
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        wn7.registerDefaultInstance(MonitoredResourceMetadata.class, monitoredResourceMetadata);
    }

    private MonitoredResourceMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLabels() {
        this.systemLabels_ = null;
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableUserLabelsMap() {
        return internalGetMutableUserLabels();
    }

    private ora internalGetMutableUserLabels() {
        if (!this.userLabels_.m42597t()) {
            this.userLabels_ = this.userLabels_.m42595A();
        }
        return this.userLabels_;
    }

    private ora internalGetUserLabels() {
        return this.userLabels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemLabels(k9g k9gVar) {
        k9gVar.getClass();
        k9g k9gVar2 = this.systemLabels_;
        if (k9gVar2 == null || k9gVar2 == k9g.m35207h()) {
            this.systemLabels_ = k9gVar;
        } else {
            this.systemLabels_ = (k9g) ((k9g.C14751b) k9g.m35208i(this.systemLabels_).mergeFrom((wn7) k9gVar)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLabels(k9g k9gVar) {
        k9gVar.getClass();
        this.systemLabels_ = k9gVar;
    }

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public boolean containsUserLabels(String str) {
        str.getClass();
        return internalGetUserLabels().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112231 c112231 = null;
        switch (C112231.f13315xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new MonitoredResourceMetadata();
            case 2:
                return new Builder(c112231);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"systemLabels_", "userLabels_", UserLabelsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (MonitoredResourceMetadata.class) {
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

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public k9g getSystemLabels() {
        k9g k9gVar = this.systemLabels_;
        return k9gVar == null ? k9g.m35207h() : k9gVar;
    }

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    @Deprecated
    public Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public int getUserLabelsCount() {
        return internalGetUserLabels().size();
    }

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(internalGetUserLabels());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public String getUserLabelsOrDefault(String str, String str2) {
        str.getClass();
        ora oraVarInternalGetUserLabels = internalGetUserLabels();
        return oraVarInternalGetUserLabels.containsKey(str) ? (String) oraVarInternalGetUserLabels.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public String getUserLabelsOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetUserLabels = internalGetUserLabels();
        if (oraVarInternalGetUserLabels.containsKey(str)) {
            return (String) oraVarInternalGetUserLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.MonitoredResourceMetadataOrBuilder
    public boolean hasSystemLabels() {
        return this.systemLabels_ != null;
    }

    public static Builder newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static MonitoredResourceMetadata parseFrom(xq1 xq1Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static MonitoredResourceMetadata parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResourceMetadata parseFrom(jf3 jf3Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static MonitoredResourceMetadata parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (MonitoredResourceMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
