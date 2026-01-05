package com.google.api;

import com.google.api.LabelDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.j16;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.scb;
import p001o.tcb;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class MetricDescriptor extends wn7 implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private yn8.InterfaceC18446j labels_ = wn7.emptyProtobufList();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.MetricDescriptor$1 */
    public static /* synthetic */ class C112171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13311xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13311xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13311xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MetricDescriptorOrBuilder {
        public /* synthetic */ Builder(C112171 c112171) {
            this();
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).addAllLabels(iterable);
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearLabels();
            return this;
        }

        public Builder clearLaunchStage() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearLaunchStage();
            return this;
        }

        public Builder clearMetadata() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearMetadata();
            return this;
        }

        public Builder clearMetricKind() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearMetricKind();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearType();
            return this;
        }

        public Builder clearUnit() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearUnit();
            return this;
        }

        public Builder clearValueType() {
            copyOnWrite();
            ((MetricDescriptor) this.instance).clearValueType();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDescription() {
            return ((MetricDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public xq1 getDescriptionBytes() {
            return ((MetricDescriptor) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDisplayName() {
            return ((MetricDescriptor) this.instance).getDisplayName();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public xq1 getDisplayNameBytes() {
            return ((MetricDescriptor) this.instance).getDisplayNameBytes();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            return ((MetricDescriptor) this.instance).getLabels(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLabelsCount() {
            return ((MetricDescriptor) this.instance).getLabelsCount();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MetricDescriptor) this.instance).getLabelsList());
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
            return ((MetricDescriptor) this.instance).getLaunchStage();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLaunchStageValue() {
            return ((MetricDescriptor) this.instance).getLaunchStageValue();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadata getMetadata() {
            return ((MetricDescriptor) this.instance).getMetadata();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricKind getMetricKind() {
            return ((MetricDescriptor) this.instance).getMetricKind();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMetricKindValue() {
            return ((MetricDescriptor) this.instance).getMetricKindValue();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getName() {
            return ((MetricDescriptor) this.instance).getName();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public xq1 getNameBytes() {
            return ((MetricDescriptor) this.instance).getNameBytes();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getType() {
            return ((MetricDescriptor) this.instance).getType();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public xq1 getTypeBytes() {
            return ((MetricDescriptor) this.instance).getTypeBytes();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getUnit() {
            return ((MetricDescriptor) this.instance).getUnit();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public xq1 getUnitBytes() {
            return ((MetricDescriptor) this.instance).getUnitBytes();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ValueType getValueType() {
            return ((MetricDescriptor) this.instance).getValueType();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getValueTypeValue() {
            return ((MetricDescriptor) this.instance).getValueTypeValue();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public boolean hasMetadata() {
            return ((MetricDescriptor) this.instance).hasMetadata();
        }

        public Builder mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).mergeMetadata(metricDescriptorMetadata);
            return this;
        }

        public Builder removeLabels(int i) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).removeLabels(i);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setDescriptionBytes(xq1Var);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setDisplayNameBytes(xq1Var);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setLaunchStage(launchStage);
            return this;
        }

        public Builder setLaunchStageValue(int i) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setLaunchStageValue(i);
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setMetadata(metricDescriptorMetadata);
            return this;
        }

        public Builder setMetricKind(MetricKind metricKind) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setMetricKind(metricKind);
            return this;
        }

        public Builder setMetricKindValue(int i) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setMetricKindValue(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setTypeBytes(xq1Var);
            return this;
        }

        public Builder setUnit(String str) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setUnit(str);
            return this;
        }

        public Builder setUnitBytes(xq1 xq1Var) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setUnitBytes(xq1Var);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int i) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setValueTypeValue(i);
            return this;
        }

        private Builder() {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).addLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setLabels(i, (LabelDescriptor) builder.build());
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata.Builder builder) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).setMetadata((MetricDescriptorMetadata) builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).addLabels((LabelDescriptor) builder.build());
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((MetricDescriptor) this.instance).addLabels(i, (LabelDescriptor) builder.build());
            return this;
        }
    }

    public static final class MetricDescriptorMetadata extends wn7 implements MetricDescriptorMetadataOrBuilder {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile hxc PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private j16 ingestDelay_;
        private int launchStage_;
        private j16 samplePeriod_;

        public static final class Builder extends wn7.AbstractC17934a implements MetricDescriptorMetadataOrBuilder {
            public /* synthetic */ Builder(C112171 c112171) {
                this();
            }

            public Builder clearIngestDelay() {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).clearIngestDelay();
                return this;
            }

            @Deprecated
            public Builder clearLaunchStage() {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).clearLaunchStage();
                return this;
            }

            public Builder clearSamplePeriod() {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).clearSamplePeriod();
                return this;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public j16 getIngestDelay() {
                return ((MetricDescriptorMetadata) this.instance).getIngestDelay();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public LaunchStage getLaunchStage() {
                return ((MetricDescriptorMetadata) this.instance).getLaunchStage();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public int getLaunchStageValue() {
                return ((MetricDescriptorMetadata) this.instance).getLaunchStageValue();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public j16 getSamplePeriod() {
                return ((MetricDescriptorMetadata) this.instance).getSamplePeriod();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasIngestDelay() {
                return ((MetricDescriptorMetadata) this.instance).hasIngestDelay();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasSamplePeriod() {
                return ((MetricDescriptorMetadata) this.instance).hasSamplePeriod();
            }

            public Builder mergeIngestDelay(j16 j16Var) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).mergeIngestDelay(j16Var);
                return this;
            }

            public Builder mergeSamplePeriod(j16 j16Var) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).mergeSamplePeriod(j16Var);
                return this;
            }

            public Builder setIngestDelay(j16 j16Var) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setIngestDelay(j16Var);
                return this;
            }

            @Deprecated
            public Builder setLaunchStage(LaunchStage launchStage) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setLaunchStage(launchStage);
                return this;
            }

            @Deprecated
            public Builder setLaunchStageValue(int i) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setLaunchStageValue(i);
                return this;
            }

            public Builder setSamplePeriod(j16 j16Var) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setSamplePeriod(j16Var);
                return this;
            }

            private Builder() {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }

            public Builder setIngestDelay(j16.C14425b c14425b) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setIngestDelay((j16) c14425b.build());
                return this;
            }

            public Builder setSamplePeriod(j16.C14425b c14425b) {
                copyOnWrite();
                ((MetricDescriptorMetadata) this.instance).setSamplePeriod((j16) c14425b.build());
                return this;
            }
        }

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            wn7.registerDefaultInstance(MetricDescriptorMetadata.class, metricDescriptorMetadata);
        }

        private MetricDescriptorMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIngestDelay(j16 j16Var) {
            j16Var.getClass();
            j16 j16Var2 = this.ingestDelay_;
            if (j16Var2 == null || j16Var2 == j16.m33025h()) {
                this.ingestDelay_ = j16Var;
            } else {
                this.ingestDelay_ = (j16) ((j16.C14425b) j16.m33026i(this.ingestDelay_).mergeFrom((wn7) j16Var)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSamplePeriod(j16 j16Var) {
            j16Var.getClass();
            j16 j16Var2 = this.samplePeriod_;
            if (j16Var2 == null || j16Var2 == j16.m33025h()) {
                this.samplePeriod_ = j16Var;
            } else {
                this.samplePeriod_ = (j16) ((j16.C14425b) j16.m33026i(this.samplePeriod_).mergeFrom((wn7) j16Var)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) {
            return (MetricDescriptorMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIngestDelay(j16 j16Var) {
            j16Var.getClass();
            this.ingestDelay_ = j16Var;
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
        public void setSamplePeriod(j16 j16Var) {
            j16Var.getClass();
            this.samplePeriod_ = j16Var;
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            C112171 c112171 = null;
            switch (C112171.f13311xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new MetricDescriptorMetadata();
                case 2:
                    return new Builder(c112171);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (MetricDescriptorMetadata.class) {
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

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public j16 getIngestDelay() {
            j16 j16Var = this.ingestDelay_;
            return j16Var == null ? j16.m33025h() : j16Var;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public LaunchStage getLaunchStage() {
            LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
            return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public j16 getSamplePeriod() {
            j16 j16Var = this.samplePeriod_;
            return j16Var == null ? j16.m33025h() : j16Var;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasIngestDelay() {
            return this.ingestDelay_ != null;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasSamplePeriod() {
            return this.samplePeriod_ != null;
        }

        public static Builder newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static MetricDescriptorMetadata parseFrom(xq1 xq1Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static MetricDescriptorMetadata parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static MetricDescriptorMetadata parseFrom(jf3 jf3Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static MetricDescriptorMetadata parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (MetricDescriptorMetadata) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface MetricDescriptorMetadataOrBuilder extends tcb {
        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        j16 getIngestDelay();

        @Deprecated
        LaunchStage getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        j16 getSamplePeriod();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    public enum MetricKind implements yn8.InterfaceC18439c {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        public static final int CUMULATIVE_VALUE = 3;
        public static final int DELTA_VALUE = 2;
        public static final int GAUGE_VALUE = 1;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.MetricDescriptor.MetricKind.1
            @Override // p001o.yn8.InterfaceC18440d
            public MetricKind findValueByNumber(int i) {
                return MetricKind.forNumber(i);
            }
        };
        private final int value;

        public static final class MetricKindVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new MetricKindVerifier();

            private MetricKindVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return MetricKind.forNumber(i) != null;
            }
        }

        MetricKind(int i) {
            this.value = i;
        }

        public static MetricKind forNumber(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return MetricKindVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static MetricKind valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum ValueType implements yn8.InterfaceC18439c {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final int DOUBLE_VALUE = 3;
        public static final int INT64_VALUE = 2;
        public static final int MONEY_VALUE = 6;
        public static final int STRING_VALUE = 4;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final yn8.InterfaceC18440d internalValueMap = new yn8.InterfaceC18440d() { // from class: com.google.api.MetricDescriptor.ValueType.1
            @Override // p001o.yn8.InterfaceC18440d
            public ValueType findValueByNumber(int i) {
                return ValueType.forNumber(i);
            }
        };
        private final int value;

        public static final class ValueTypeVerifier implements yn8.InterfaceC18441e {
            static final yn8.InterfaceC18441e INSTANCE = new ValueTypeVerifier();

            private ValueTypeVerifier() {
            }

            @Override // p001o.yn8.InterfaceC18441e
            public boolean isInRange(int i) {
                return ValueType.forNumber(i) != null;
            }
        }

        ValueType(int i) {
            this.value = i;
        }

        public static ValueType forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        public static yn8.InterfaceC18440d internalGetValueMap() {
            return internalValueMap;
        }

        public static yn8.InterfaceC18441e internalGetVerifier() {
            return ValueTypeVerifier.INSTANCE;
        }

        @Override // p001o.yn8.InterfaceC18439c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ValueType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        wn7.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    private MetricDescriptor() {
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
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.labels_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.labels_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 == null || metricDescriptorMetadata2 == MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = metricDescriptorMetadata;
        } else {
            this.metadata_ = (MetricDescriptorMetadata) ((MetricDescriptorMetadata.Builder) MetricDescriptorMetadata.newBuilder(this.metadata_).mergeFrom((wn7) metricDescriptorMetadata)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (MetricDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptorMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKind(MetricKind metricKind) {
        this.metricKind_ = metricKind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKindValue(int i) {
        this.metricKind_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.unit_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112171 c112171 = null;
        switch (C112171.f13311xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new MetricDescriptor();
            case 2:
                return new Builder(c112171);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (MetricDescriptor.class) {
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

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public xq1 getDescriptionBytes() {
        return xq1.m56589q(this.description_);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public xq1 getDisplayNameBytes() {
        return xq1.m56589q(this.displayName_);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return (LabelDescriptor) this.labels_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return (LabelDescriptorOrBuilder) this.labels_.get(i);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
        LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
        return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricKind getMetricKind() {
        MetricKind metricKindForNumber = MetricKind.forNumber(this.metricKind_);
        return metricKindForNumber == null ? MetricKind.UNRECOGNIZED : metricKindForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMetricKindValue() {
        return this.metricKind_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public xq1 getTypeBytes() {
        return xq1.m56589q(this.type_);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getUnit() {
        return this.unit_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public xq1 getUnitBytes() {
        return xq1.m56589q(this.unit_);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ValueType getValueType() {
        ValueType valueTypeForNumber = ValueType.forNumber(this.valueType_);
        return valueTypeForNumber == null ? ValueType.UNRECOGNIZED : valueTypeForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static MetricDescriptor parseFrom(xq1 xq1Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static MetricDescriptor parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static MetricDescriptor parseFrom(jf3 jf3Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static MetricDescriptor parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (MetricDescriptor) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
