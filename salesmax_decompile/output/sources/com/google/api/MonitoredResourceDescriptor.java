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
public final class MonitoredResourceDescriptor extends wn7 implements MonitoredResourceDescriptorOrBuilder {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile hxc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";
    private String displayName_ = "";
    private String description_ = "";
    private yn8.InterfaceC18446j labels_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.MonitoredResourceDescriptor$1 */
    public static /* synthetic */ class C112221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13314xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13314xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13314xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MonitoredResourceDescriptorOrBuilder {
        public /* synthetic */ Builder(C112221 c112221) {
            this();
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).addAllLabels(iterable);
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearLabels();
            return this;
        }

        public Builder clearLaunchStage() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearLaunchStage();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getDescription() {
            return ((MonitoredResourceDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public xq1 getDescriptionBytes() {
            return ((MonitoredResourceDescriptor) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getDisplayName() {
            return ((MonitoredResourceDescriptor) this.instance).getDisplayName();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public xq1 getDisplayNameBytes() {
            return ((MonitoredResourceDescriptor) this.instance).getDisplayNameBytes();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            return ((MonitoredResourceDescriptor) this.instance).getLabels(i);
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public int getLabelsCount() {
            return ((MonitoredResourceDescriptor) this.instance).getLabelsCount();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MonitoredResourceDescriptor) this.instance).getLabelsList());
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
            return ((MonitoredResourceDescriptor) this.instance).getLaunchStage();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public int getLaunchStageValue() {
            return ((MonitoredResourceDescriptor) this.instance).getLaunchStageValue();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getName() {
            return ((MonitoredResourceDescriptor) this.instance).getName();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public xq1 getNameBytes() {
            return ((MonitoredResourceDescriptor) this.instance).getNameBytes();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getType() {
            return ((MonitoredResourceDescriptor) this.instance).getType();
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public xq1 getTypeBytes() {
            return ((MonitoredResourceDescriptor) this.instance).getTypeBytes();
        }

        public Builder removeLabels(int i) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).removeLabels(i);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setDisplayNameBytes(xq1Var);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setLaunchStage(launchStage);
            return this;
        }

        public Builder setLaunchStageValue(int i) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setLaunchStageValue(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setTypeBytes(xq1Var);
            return this;
        }

        private Builder() {
            super(MonitoredResourceDescriptor.DEFAULT_INSTANCE);
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).addLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).setLabels(i, (LabelDescriptor) builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).addLabels((LabelDescriptor) builder.build());
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MonitoredResourceDescriptor) this.instance).addLabels(i, (LabelDescriptor) builder.build());
            return this;
        }
    }

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        DEFAULT_INSTANCE = monitoredResourceDescriptor;
        wn7.registerDefaultInstance(MonitoredResourceDescriptor.class, monitoredResourceDescriptor);
    }

    private MonitoredResourceDescriptor() {
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
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.labels_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.labels_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (MonitoredResourceDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setLaunchStage(LaunchStage launchStage) {
        this.launchStage_ = launchStage.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
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
        C112221 c112221 = null;
        switch (C112221.f13314xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new MonitoredResourceDescriptor();
            case 2:
                return new Builder(c112221);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", LabelDescriptor.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (MonitoredResourceDescriptor.class) {
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

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public xq1 getDisplayNameBytes() {
        return xq1.m56589q(this.displayName_);
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return (LabelDescriptor) this.labels_.get(i);
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return (LabelDescriptorOrBuilder) this.labels_.get(i);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
        LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
        return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public xq1 getTypeBytes() {
        return xq1.m56589q(this.type_);
    }

    public static Builder newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(monitoredResourceDescriptor);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static MonitoredResourceDescriptor parseFrom(xq1 xq1Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static MonitoredResourceDescriptor parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MonitoredResourceDescriptor parseFrom(jf3 jf3Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static MonitoredResourceDescriptor parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (MonitoredResourceDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
