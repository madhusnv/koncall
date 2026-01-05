package com.google.api;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p001o.fbj;
import p001o.hxc;
import p001o.jf3;
import p001o.nra;
import p001o.ora;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;

/* loaded from: classes3.dex */
public final class MonitoredResource extends wn7 implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private ora labels_ = ora.m42592g();
    private String type_ = "";

    /* renamed from: com.google.api.MonitoredResource$1 */
    public static /* synthetic */ class C112211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13313xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13313xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13313xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MonitoredResourceOrBuilder {
        public /* synthetic */ Builder(C112211 c112211) {
            this();
        }

        public Builder clearLabels() {
            copyOnWrite();
            ((MonitoredResource) this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MonitoredResource) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public boolean containsLabels(String str) {
            str.getClass();
            return ((MonitoredResource) this.instance).getLabelsMap().containsKey(str);
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public int getLabelsCount() {
            return ((MonitoredResource) this.instance).getLabelsMap().size();
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((MonitoredResource) this.instance).getLabelsMap());
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> labelsMap = ((MonitoredResource) this.instance).getLabelsMap();
            return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> labelsMap = ((MonitoredResource) this.instance).getLabelsMap();
            if (labelsMap.containsKey(str)) {
                return labelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getType() {
            return ((MonitoredResource) this.instance).getType();
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public xq1 getTypeBytes() {
            return ((MonitoredResource) this.instance).getTypeBytes();
        }

        public Builder putAllLabels(Map<String, String> map) {
            copyOnWrite();
            ((MonitoredResource) this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((MonitoredResource) this.instance).getMutableLabelsMap().put(str, str2);
            return this;
        }

        public Builder removeLabels(String str) {
            str.getClass();
            copyOnWrite();
            ((MonitoredResource) this.instance).getMutableLabelsMap().remove(str);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((MonitoredResource) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MonitoredResource) this.instance).setTypeBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(MonitoredResource.DEFAULT_INSTANCE);
        }
    }

    public static final class LabelsDefaultEntryHolder {
        static final nra defaultEntry;

        static {
            fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.STRING;
            defaultEntry = nra.m41005d(enumC13396b, "", enumC13396b, "");
        }

        private LabelsDefaultEntryHolder() {
        }
    }

    static {
        MonitoredResource monitoredResource = new MonitoredResource();
        DEFAULT_INSTANCE = monitoredResource;
        wn7.registerDefaultInstance(MonitoredResource.class, monitoredResource);
    }

    private MonitoredResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static MonitoredResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    private ora internalGetLabels() {
        return this.labels_;
    }

    private ora internalGetMutableLabels() {
        if (!this.labels_.m42597t()) {
            this.labels_ = this.labels_.m42595A();
        }
        return this.labels_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResource) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // com.google.api.MonitoredResourceOrBuilder
    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112211 c112211 = null;
        switch (C112211.f13313xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new MonitoredResource();
            case 2:
                return new Builder(c112211);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", LabelsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (MonitoredResource.class) {
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

    @Override // com.google.api.MonitoredResourceOrBuilder
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        ora oraVarInternalGetLabels = internalGetLabels();
        return oraVarInternalGetLabels.containsKey(str) ? (String) oraVarInternalGetLabels.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getLabelsOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetLabels = internalGetLabels();
        if (oraVarInternalGetLabels.containsKey(str)) {
            return (String) oraVarInternalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public xq1 getTypeBytes() {
        return xq1.m56589q(this.type_);
    }

    public static Builder newBuilder(MonitoredResource monitoredResource) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(monitoredResource);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static MonitoredResource parseFrom(xq1 xq1Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static MonitoredResource parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static MonitoredResource parseFrom(byte[] bArr) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResource parseFrom(byte[] bArr, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static MonitoredResource parseFrom(InputStream inputStream) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResource parseFrom(jf3 jf3Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static MonitoredResource parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (MonitoredResource) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
