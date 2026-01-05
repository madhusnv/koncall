package com.google.api;

import com.google.api.LabelDescriptor;
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
public final class LogDescriptor extends wn7 implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER;
    private String name_ = "";
    private yn8.InterfaceC18446j labels_ = wn7.emptyProtobufList();
    private String description_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.LogDescriptor$1 */
    public static /* synthetic */ class C112141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13308xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13308xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13308xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements LogDescriptorOrBuilder {
        public /* synthetic */ Builder(C112141 c112141) {
            this();
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addAllLabels(iterable);
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearLabels();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearName();
            return this;
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDescription() {
            return ((LogDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public xq1 getDescriptionBytes() {
            return ((LogDescriptor) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDisplayName() {
            return ((LogDescriptor) this.instance).getDisplayName();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public xq1 getDisplayNameBytes() {
            return ((LogDescriptor) this.instance).getDisplayNameBytes();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            return ((LogDescriptor) this.instance).getLabels(i);
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public int getLabelsCount() {
            return ((LogDescriptor) this.instance).getLabelsCount();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((LogDescriptor) this.instance).getLabelsList());
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getName() {
            return ((LogDescriptor) this.instance).getName();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public xq1 getNameBytes() {
            return ((LogDescriptor) this.instance).getNameBytes();
        }

        public Builder removeLabels(int i) {
            copyOnWrite();
            ((LogDescriptor) this.instance).removeLabels(i);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDisplayNameBytes(xq1Var);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setLabels(i, labelDescriptor);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setNameBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setLabels(i, (LabelDescriptor) builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels((LabelDescriptor) builder.build());
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(i, (LabelDescriptor) builder.build());
            return this;
        }
    }

    static {
        LogDescriptor logDescriptor = new LogDescriptor();
        DEFAULT_INSTANCE = logDescriptor;
        wn7.registerDefaultInstance(LogDescriptor.class, logDescriptor);
    }

    private LogDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureLabelsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.labels_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.labels_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (LogDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
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
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.displayName_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
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

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112141 c112141 = null;
        switch (C112141.f13308xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new LogDescriptor();
            case 2:
                return new Builder(c112141);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", LabelDescriptor.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (LogDescriptor.class) {
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

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public xq1 getDisplayNameBytes() {
        return xq1.m56589q(this.displayName_);
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return (LabelDescriptor) this.labels_.get(i);
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return (LabelDescriptorOrBuilder) this.labels_.get(i);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    public static Builder newBuilder(LogDescriptor logDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(logDescriptor);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static LogDescriptor parseFrom(xq1 xq1Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static LogDescriptor parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static LogDescriptor parseFrom(byte[] bArr) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LogDescriptor parseFrom(byte[] bArr, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static LogDescriptor parseFrom(jf3 jf3Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static LogDescriptor parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (LogDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
