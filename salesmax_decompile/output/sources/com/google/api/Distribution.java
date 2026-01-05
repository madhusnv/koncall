package com.google.api;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.scb;
import p001o.tcb;
import p001o.tmh;
import p001o.wh0;
import p001o.wn7;
import p001o.xh0;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class Distribution extends wn7 implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile hxc PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private BucketOptions bucketOptions_;
    private long count_;
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private yn8.InterfaceC18445i bucketCounts_ = wn7.emptyLongList();
    private yn8.InterfaceC18446j exemplars_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Distribution$1 */
    public static /* synthetic */ class C112021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13299xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13299xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13299xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BucketOptions extends wn7 implements BucketOptionsOrBuilder {
        private static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile hxc PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        public static final class Builder extends wn7.AbstractC17934a implements BucketOptionsOrBuilder {
            public /* synthetic */ Builder(C112021 c112021) {
                this();
            }

            public Builder clearExplicitBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearExplicitBuckets();
                return this;
            }

            public Builder clearExponentialBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearExponentialBuckets();
                return this;
            }

            public Builder clearLinearBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearLinearBuckets();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Explicit getExplicitBuckets() {
                return ((BucketOptions) this.instance).getExplicitBuckets();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Exponential getExponentialBuckets() {
                return ((BucketOptions) this.instance).getExponentialBuckets();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Linear getLinearBuckets() {
                return ((BucketOptions) this.instance).getLinearBuckets();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public OptionsCase getOptionsCase() {
                return ((BucketOptions) this.instance).getOptionsCase();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExplicitBuckets() {
                return ((BucketOptions) this.instance).hasExplicitBuckets();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExponentialBuckets() {
                return ((BucketOptions) this.instance).hasExponentialBuckets();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasLinearBuckets() {
                return ((BucketOptions) this.instance).hasLinearBuckets();
            }

            public Builder mergeExplicitBuckets(Explicit explicit) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeExplicitBuckets(explicit);
                return this;
            }

            public Builder mergeExponentialBuckets(Exponential exponential) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeExponentialBuckets(exponential);
                return this;
            }

            public Builder mergeLinearBuckets(Linear linear) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeLinearBuckets(linear);
                return this;
            }

            public Builder setExplicitBuckets(Explicit explicit) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExplicitBuckets(explicit);
                return this;
            }

            public Builder setExponentialBuckets(Exponential exponential) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExponentialBuckets(exponential);
                return this;
            }

            public Builder setLinearBuckets(Linear linear) {
                copyOnWrite();
                ((BucketOptions) this.instance).setLinearBuckets(linear);
                return this;
            }

            private Builder() {
                super(BucketOptions.DEFAULT_INSTANCE);
            }

            public Builder setExplicitBuckets(Explicit.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExplicitBuckets((Explicit) builder.build());
                return this;
            }

            public Builder setExponentialBuckets(Exponential.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExponentialBuckets((Exponential) builder.build());
                return this;
            }

            public Builder setLinearBuckets(Linear.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setLinearBuckets((Linear) builder.build());
                return this;
            }
        }

        public static final class Explicit extends wn7 implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE;
            private static volatile hxc PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private yn8.InterfaceC18438b bounds_ = wn7.emptyDoubleList();

            public static final class Builder extends wn7.AbstractC17934a implements ExplicitOrBuilder {
                public /* synthetic */ Builder(C112021 c112021) {
                    this();
                }

                public Builder addAllBounds(Iterable<? extends Double> iterable) {
                    copyOnWrite();
                    ((Explicit) this.instance).addAllBounds(iterable);
                    return this;
                }

                public Builder addBounds(double d) {
                    copyOnWrite();
                    ((Explicit) this.instance).addBounds(d);
                    return this;
                }

                public Builder clearBounds() {
                    copyOnWrite();
                    ((Explicit) this.instance).clearBounds();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public double getBounds(int i) {
                    return ((Explicit) this.instance).getBounds(i);
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public int getBoundsCount() {
                    return ((Explicit) this.instance).getBoundsCount();
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((Explicit) this.instance).getBoundsList());
                }

                public Builder setBounds(int i, double d) {
                    copyOnWrite();
                    ((Explicit) this.instance).setBounds(i, d);
                    return this;
                }

                private Builder() {
                    super(Explicit.DEFAULT_INSTANCE);
                }
            }

            static {
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                wn7.registerDefaultInstance(Explicit.class, explicit);
            }

            private Explicit() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                r8.addAll((Iterable) iterable, (List) this.bounds_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBounds(double d) {
                ensureBoundsIsMutable();
                this.bounds_.m2(d);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = wn7.emptyDoubleList();
            }

            private void ensureBoundsIsMutable() {
                yn8.InterfaceC18438b interfaceC18438b = this.bounds_;
                if (interfaceC18438b.mo28212k()) {
                    return;
                }
                this.bounds_ = wn7.mutableCopy(interfaceC18438b);
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) {
                return (Explicit) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static hxc parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBounds(int i, double d) {
                ensureBoundsIsMutable();
                this.bounds_.w1(i, d);
            }

            @Override // p001o.wn7
            public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
                C112021 c112021 = null;
                switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                    case 1:
                        return new Explicit();
                    case 2:
                        return new Builder(c112021);
                    case 3:
                        return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        hxc c17935b = PARSER;
                        if (c17935b == null) {
                            synchronized (Explicit.class) {
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

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public double getBounds(int i) {
                return this.bounds_.getDouble(i);
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public int getBoundsCount() {
                return this.bounds_.size();
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            public static Builder newBuilder(Explicit explicit) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(explicit);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
                return (Explicit) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
            }

            public static Explicit parseFrom(xq1 xq1Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
            }

            public static Explicit parseFrom(xq1 xq1Var, qp6 qp6Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
            }

            public static Explicit parseFrom(byte[] bArr) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Explicit parseFrom(byte[] bArr, qp6 qp6Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
            }

            public static Explicit parseFrom(InputStream inputStream) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, qp6 qp6Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Explicit parseFrom(jf3 jf3Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
            }

            public static Explicit parseFrom(jf3 jf3Var, qp6 qp6Var) {
                return (Explicit) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
            }
        }

        public interface ExplicitOrBuilder extends tcb {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();

            @Override // p001o.tcb
            /* synthetic */ scb getDefaultInstanceForType();

            @Override // p001o.tcb
            /* synthetic */ boolean isInitialized();
        }

        public static final class Exponential extends wn7 implements ExponentialOrBuilder {
            private static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile hxc PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            public static final class Builder extends wn7.AbstractC17934a implements ExponentialOrBuilder {
                public /* synthetic */ Builder(C112021 c112021) {
                    this();
                }

                public Builder clearGrowthFactor() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearGrowthFactor();
                    return this;
                }

                public Builder clearNumFiniteBuckets() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearScale() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearScale();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getGrowthFactor() {
                    return ((Exponential) this.instance).getGrowthFactor();
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public int getNumFiniteBuckets() {
                    return ((Exponential) this.instance).getNumFiniteBuckets();
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getScale() {
                    return ((Exponential) this.instance).getScale();
                }

                public Builder setGrowthFactor(double d) {
                    copyOnWrite();
                    ((Exponential) this.instance).setGrowthFactor(d);
                    return this;
                }

                public Builder setNumFiniteBuckets(int i) {
                    copyOnWrite();
                    ((Exponential) this.instance).setNumFiniteBuckets(i);
                    return this;
                }

                public Builder setScale(double d) {
                    copyOnWrite();
                    ((Exponential) this.instance).setScale(d);
                    return this;
                }

                private Builder() {
                    super(Exponential.DEFAULT_INSTANCE);
                }
            }

            static {
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                wn7.registerDefaultInstance(Exponential.class, exponential);
            }

            private Exponential() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGrowthFactor() {
                this.growthFactor_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) {
                return (Exponential) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static hxc parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScale(double d) {
                this.scale_ = d;
            }

            @Override // p001o.wn7
            public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
                C112021 c112021 = null;
                switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                    case 1:
                        return new Exponential();
                    case 2:
                        return new Builder(c112021);
                    case 3:
                        return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        hxc c17935b = PARSER;
                        if (c17935b == null) {
                            synchronized (Exponential.class) {
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

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getScale() {
                return this.scale_;
            }

            public static Builder newBuilder(Exponential exponential) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(exponential);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
                return (Exponential) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
            }

            public static Exponential parseFrom(xq1 xq1Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
            }

            public static Exponential parseFrom(xq1 xq1Var, qp6 qp6Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
            }

            public static Exponential parseFrom(byte[] bArr) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Exponential parseFrom(byte[] bArr, qp6 qp6Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
            }

            public static Exponential parseFrom(InputStream inputStream) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, qp6 qp6Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Exponential parseFrom(jf3 jf3Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
            }

            public static Exponential parseFrom(jf3 jf3Var, qp6 qp6Var) {
                return (Exponential) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
            }
        }

        public interface ExponentialOrBuilder extends tcb {
            @Override // p001o.tcb
            /* synthetic */ scb getDefaultInstanceForType();

            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();

            @Override // p001o.tcb
            /* synthetic */ boolean isInitialized();
        }

        public static final class Linear extends wn7 implements LinearOrBuilder {
            private static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile hxc PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            public static final class Builder extends wn7.AbstractC17934a implements LinearOrBuilder {
                public /* synthetic */ Builder(C112021 c112021) {
                    this();
                }

                public Builder clearNumFiniteBuckets() {
                    copyOnWrite();
                    ((Linear) this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearOffset() {
                    copyOnWrite();
                    ((Linear) this.instance).clearOffset();
                    return this;
                }

                public Builder clearWidth() {
                    copyOnWrite();
                    ((Linear) this.instance).clearWidth();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public int getNumFiniteBuckets() {
                    return ((Linear) this.instance).getNumFiniteBuckets();
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getOffset() {
                    return ((Linear) this.instance).getOffset();
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getWidth() {
                    return ((Linear) this.instance).getWidth();
                }

                public Builder setNumFiniteBuckets(int i) {
                    copyOnWrite();
                    ((Linear) this.instance).setNumFiniteBuckets(i);
                    return this;
                }

                public Builder setOffset(double d) {
                    copyOnWrite();
                    ((Linear) this.instance).setOffset(d);
                    return this;
                }

                public Builder setWidth(double d) {
                    copyOnWrite();
                    ((Linear) this.instance).setWidth(d);
                    return this;
                }

                private Builder() {
                    super(Linear.DEFAULT_INSTANCE);
                }
            }

            static {
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                wn7.registerDefaultInstance(Linear.class, linear);
            }

            private Linear() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) {
                return (Linear) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static hxc parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOffset(double d) {
                this.offset_ = d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWidth(double d) {
                this.width_ = d;
            }

            @Override // p001o.wn7
            public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
                C112021 c112021 = null;
                switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                    case 1:
                        return new Linear();
                    case 2:
                        return new Builder(c112021);
                    case 3:
                        return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        hxc c17935b = PARSER;
                        if (c17935b == null) {
                            synchronized (Linear.class) {
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

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getOffset() {
                return this.offset_;
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getWidth() {
                return this.width_;
            }

            public static Builder newBuilder(Linear linear) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(linear);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
                return (Linear) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
            }

            public static Linear parseFrom(xq1 xq1Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
            }

            public static Linear parseFrom(xq1 xq1Var, qp6 qp6Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
            }

            public static Linear parseFrom(byte[] bArr) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Linear parseFrom(byte[] bArr, qp6 qp6Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
            }

            public static Linear parseFrom(InputStream inputStream) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, qp6 qp6Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
            }

            public static Linear parseFrom(jf3 jf3Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
            }

            public static Linear parseFrom(jf3 jf3Var, qp6 qp6Var) {
                return (Linear) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
            }
        }

        public interface LinearOrBuilder extends tcb {
            @Override // p001o.tcb
            /* synthetic */ scb getDefaultInstanceForType();

            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();

            @Override // p001o.tcb
            /* synthetic */ boolean isInitialized();
        }

        public enum OptionsCase {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);

            private final int value;

            OptionsCase(int i) {
                this.value = i;
            }

            public static OptionsCase forNumber(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptionsCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            wn7.registerDefaultInstance(BucketOptions.class, bucketOptions);
        }

        private BucketOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            if (this.optionsCase_ != 3 || this.options_ == Explicit.getDefaultInstance()) {
                this.options_ = explicit;
            } else {
                this.options_ = ((Explicit.Builder) Explicit.newBuilder((Explicit) this.options_).mergeFrom((wn7) explicit)).buildPartial();
            }
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            if (this.optionsCase_ != 2 || this.options_ == Exponential.getDefaultInstance()) {
                this.options_ = exponential;
            } else {
                this.options_ = ((Exponential.Builder) Exponential.newBuilder((Exponential) this.options_).mergeFrom((wn7) exponential)).buildPartial();
            }
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLinearBuckets(Linear linear) {
            linear.getClass();
            if (this.optionsCase_ != 1 || this.options_ == Linear.getDefaultInstance()) {
                this.options_ = linear;
            } else {
                this.options_ = ((Linear.Builder) Linear.newBuilder((Linear) this.options_).mergeFrom((wn7) linear)).buildPartial();
            }
            this.optionsCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) {
            return (BucketOptions) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinearBuckets(Linear linear) {
            linear.getClass();
            this.options_ = linear;
            this.optionsCase_ = 1;
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            C112021 c112021 = null;
            switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new BucketOptions();
                case 2:
                    return new Builder(c112021);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (BucketOptions.class) {
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

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Explicit getExplicitBuckets() {
            return this.optionsCase_ == 3 ? (Explicit) this.options_ : Explicit.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Exponential getExponentialBuckets() {
            return this.optionsCase_ == 2 ? (Exponential) this.options_ : Exponential.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Linear getLinearBuckets() {
            return this.optionsCase_ == 1 ? (Linear) this.options_ : Linear.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public OptionsCase getOptionsCase() {
            return OptionsCase.forNumber(this.optionsCase_);
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bucketOptions);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (BucketOptions) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static BucketOptions parseFrom(xq1 xq1Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static BucketOptions parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static BucketOptions parseFrom(byte[] bArr) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, qp6 qp6Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static BucketOptions parseFrom(InputStream inputStream) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static BucketOptions parseFrom(jf3 jf3Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static BucketOptions parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (BucketOptions) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface BucketOptionsOrBuilder extends tcb {
        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        BucketOptions.Explicit getExplicitBuckets();

        BucketOptions.Exponential getExponentialBuckets();

        BucketOptions.Linear getLinearBuckets();

        BucketOptions.OptionsCase getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends wn7.AbstractC17934a implements DistributionOrBuilder {
        public /* synthetic */ Builder(C112021 c112021) {
            this();
        }

        public Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((Distribution) this.instance).addAllBucketCounts(iterable);
            return this;
        }

        public Builder addAllExemplars(Iterable<? extends Exemplar> iterable) {
            copyOnWrite();
            ((Distribution) this.instance).addAllExemplars(iterable);
            return this;
        }

        public Builder addBucketCounts(long j) {
            copyOnWrite();
            ((Distribution) this.instance).addBucketCounts(j);
            return this;
        }

        public Builder addExemplars(Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(exemplar);
            return this;
        }

        public Builder clearBucketCounts() {
            copyOnWrite();
            ((Distribution) this.instance).clearBucketCounts();
            return this;
        }

        public Builder clearBucketOptions() {
            copyOnWrite();
            ((Distribution) this.instance).clearBucketOptions();
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((Distribution) this.instance).clearCount();
            return this;
        }

        public Builder clearExemplars() {
            copyOnWrite();
            ((Distribution) this.instance).clearExemplars();
            return this;
        }

        public Builder clearMean() {
            copyOnWrite();
            ((Distribution) this.instance).clearMean();
            return this;
        }

        public Builder clearRange() {
            copyOnWrite();
            ((Distribution) this.instance).clearRange();
            return this;
        }

        public Builder clearSumOfSquaredDeviation() {
            copyOnWrite();
            ((Distribution) this.instance).clearSumOfSquaredDeviation();
            return this;
        }

        @Override // com.google.api.DistributionOrBuilder
        public long getBucketCounts(int i) {
            return ((Distribution) this.instance).getBucketCounts(i);
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getBucketCountsCount() {
            return ((Distribution) this.instance).getBucketCountsCount();
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((Distribution) this.instance).getBucketCountsList());
        }

        @Override // com.google.api.DistributionOrBuilder
        public BucketOptions getBucketOptions() {
            return ((Distribution) this.instance).getBucketOptions();
        }

        @Override // com.google.api.DistributionOrBuilder
        public long getCount() {
            return ((Distribution) this.instance).getCount();
        }

        @Override // com.google.api.DistributionOrBuilder
        public Exemplar getExemplars(int i) {
            return ((Distribution) this.instance).getExemplars(i);
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getExemplarsCount() {
            return ((Distribution) this.instance).getExemplarsCount();
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Exemplar> getExemplarsList() {
            return Collections.unmodifiableList(((Distribution) this.instance).getExemplarsList());
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getMean() {
            return ((Distribution) this.instance).getMean();
        }

        @Override // com.google.api.DistributionOrBuilder
        public Range getRange() {
            return ((Distribution) this.instance).getRange();
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getSumOfSquaredDeviation() {
            return ((Distribution) this.instance).getSumOfSquaredDeviation();
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasBucketOptions() {
            return ((Distribution) this.instance).hasBucketOptions();
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasRange() {
            return ((Distribution) this.instance).hasRange();
        }

        public Builder mergeBucketOptions(BucketOptions bucketOptions) {
            copyOnWrite();
            ((Distribution) this.instance).mergeBucketOptions(bucketOptions);
            return this;
        }

        public Builder mergeRange(Range range) {
            copyOnWrite();
            ((Distribution) this.instance).mergeRange(range);
            return this;
        }

        public Builder removeExemplars(int i) {
            copyOnWrite();
            ((Distribution) this.instance).removeExemplars(i);
            return this;
        }

        public Builder setBucketCounts(int i, long j) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketCounts(i, j);
            return this;
        }

        public Builder setBucketOptions(BucketOptions bucketOptions) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketOptions(bucketOptions);
            return this;
        }

        public Builder setCount(long j) {
            copyOnWrite();
            ((Distribution) this.instance).setCount(j);
            return this;
        }

        public Builder setExemplars(int i, Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).setExemplars(i, exemplar);
            return this;
        }

        public Builder setMean(double d) {
            copyOnWrite();
            ((Distribution) this.instance).setMean(d);
            return this;
        }

        public Builder setRange(Range range) {
            copyOnWrite();
            ((Distribution) this.instance).setRange(range);
            return this;
        }

        public Builder setSumOfSquaredDeviation(double d) {
            copyOnWrite();
            ((Distribution) this.instance).setSumOfSquaredDeviation(d);
            return this;
        }

        private Builder() {
            super(Distribution.DEFAULT_INSTANCE);
        }

        public Builder addExemplars(int i, Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(i, exemplar);
            return this;
        }

        public Builder setBucketOptions(BucketOptions.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketOptions((BucketOptions) builder.build());
            return this;
        }

        public Builder setExemplars(int i, Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setExemplars(i, (Exemplar) builder.build());
            return this;
        }

        public Builder setRange(Range.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setRange((Range) builder.build());
            return this;
        }

        public Builder addExemplars(Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars((Exemplar) builder.build());
            return this;
        }

        public Builder addExemplars(int i, Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(i, (Exemplar) builder.build());
            return this;
        }
    }

    public static final class Exemplar extends wn7 implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE;
        private static volatile hxc PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private yn8.InterfaceC18446j attachments_ = wn7.emptyProtobufList();
        private tmh timestamp_;
        private double value_;

        public static final class Builder extends wn7.AbstractC17934a implements ExemplarOrBuilder {
            public /* synthetic */ Builder(C112021 c112021) {
                this();
            }

            public Builder addAllAttachments(Iterable<? extends wh0> iterable) {
                copyOnWrite();
                ((Exemplar) this.instance).addAllAttachments(iterable);
                return this;
            }

            public Builder addAttachments(wh0 wh0Var) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(wh0Var);
                return this;
            }

            public Builder clearAttachments() {
                copyOnWrite();
                ((Exemplar) this.instance).clearAttachments();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Exemplar) this.instance).clearTimestamp();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Exemplar) this.instance).clearValue();
                return this;
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public wh0 getAttachments(int i) {
                return ((Exemplar) this.instance).getAttachments(i);
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public int getAttachmentsCount() {
                return ((Exemplar) this.instance).getAttachmentsCount();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public List<wh0> getAttachmentsList() {
                return Collections.unmodifiableList(((Exemplar) this.instance).getAttachmentsList());
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public tmh getTimestamp() {
                return ((Exemplar) this.instance).getTimestamp();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public double getValue() {
                return ((Exemplar) this.instance).getValue();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public boolean hasTimestamp() {
                return ((Exemplar) this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(tmh tmhVar) {
                copyOnWrite();
                ((Exemplar) this.instance).mergeTimestamp(tmhVar);
                return this;
            }

            public Builder removeAttachments(int i) {
                copyOnWrite();
                ((Exemplar) this.instance).removeAttachments(i);
                return this;
            }

            public Builder setAttachments(int i, wh0 wh0Var) {
                copyOnWrite();
                ((Exemplar) this.instance).setAttachments(i, wh0Var);
                return this;
            }

            public Builder setTimestamp(tmh tmhVar) {
                copyOnWrite();
                ((Exemplar) this.instance).setTimestamp(tmhVar);
                return this;
            }

            public Builder setValue(double d) {
                copyOnWrite();
                ((Exemplar) this.instance).setValue(d);
                return this;
            }

            private Builder() {
                super(Exemplar.DEFAULT_INSTANCE);
            }

            public Builder addAttachments(int i, wh0 wh0Var) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(i, wh0Var);
                return this;
            }

            public Builder setAttachments(int i, wh0.C17863b c17863b) {
                copyOnWrite();
                ((Exemplar) this.instance).setAttachments(i, (wh0) c17863b.build());
                return this;
            }

            public Builder setTimestamp(tmh.C17163b c17163b) {
                copyOnWrite();
                ((Exemplar) this.instance).setTimestamp((tmh) c17163b.build());
                return this;
            }

            public Builder addAttachments(wh0.C17863b c17863b) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments((wh0) c17863b.build());
                return this;
            }

            public Builder addAttachments(int i, wh0.C17863b c17863b) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(i, (wh0) c17863b.build());
                return this;
            }
        }

        static {
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            wn7.registerDefaultInstance(Exemplar.class, exemplar);
        }

        private Exemplar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends wh0> iterable) {
            ensureAttachmentsIsMutable();
            r8.addAll((Iterable) iterable, (List) this.attachments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(wh0 wh0Var) {
            wh0Var.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(wh0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = wn7.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        private void ensureAttachmentsIsMutable() {
            yn8.InterfaceC18446j interfaceC18446j = this.attachments_;
            if (interfaceC18446j.mo28212k()) {
                return;
            }
            this.attachments_ = wn7.mutableCopy(interfaceC18446j);
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(tmh tmhVar) {
            tmhVar.getClass();
            tmh tmhVar2 = this.timestamp_;
            if (tmhVar2 == null || tmhVar2 == tmh.m50207h()) {
                this.timestamp_ = tmhVar;
            } else {
                this.timestamp_ = (tmh) ((tmh.C17163b) tmh.m50208i(this.timestamp_).mergeFrom((wn7) tmhVar)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) {
            return (Exemplar) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttachments(int i) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttachments(int i, wh0 wh0Var) {
            wh0Var.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.set(i, wh0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(tmh tmhVar) {
            tmhVar.getClass();
            this.timestamp_ = tmhVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            C112021 c112021 = null;
            switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new Exemplar();
                case 2:
                    return new Builder(c112021);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", wh0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (Exemplar.class) {
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

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public wh0 getAttachments(int i) {
            return (wh0) this.attachments_.get(i);
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public List<wh0> getAttachmentsList() {
            return this.attachments_;
        }

        public xh0 getAttachmentsOrBuilder(int i) {
            return (xh0) this.attachments_.get(i);
        }

        public List<? extends xh0> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public tmh getTimestamp() {
            tmh tmhVar = this.timestamp_;
            return tmhVar == null ? tmh.m50207h() : tmhVar;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public static Builder newBuilder(Exemplar exemplar) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exemplar);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (Exemplar) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static Exemplar parseFrom(xq1 xq1Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(int i, wh0 wh0Var) {
            wh0Var.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(i, wh0Var);
        }

        public static Exemplar parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static Exemplar parseFrom(byte[] bArr) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, qp6 qp6Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static Exemplar parseFrom(InputStream inputStream) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static Exemplar parseFrom(jf3 jf3Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static Exemplar parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (Exemplar) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface ExemplarOrBuilder extends tcb {
        wh0 getAttachments(int i);

        int getAttachmentsCount();

        List<wh0> getAttachmentsList();

        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        tmh getTimestamp();

        double getValue();

        boolean hasTimestamp();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    public static final class Range extends wn7 implements RangeOrBuilder {
        private static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile hxc PARSER;
        private double max_;
        private double min_;

        public static final class Builder extends wn7.AbstractC17934a implements RangeOrBuilder {
            public /* synthetic */ Builder(C112021 c112021) {
                this();
            }

            public Builder clearMax() {
                copyOnWrite();
                ((Range) this.instance).clearMax();
                return this;
            }

            public Builder clearMin() {
                copyOnWrite();
                ((Range) this.instance).clearMin();
                return this;
            }

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMax() {
                return ((Range) this.instance).getMax();
            }

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMin() {
                return ((Range) this.instance).getMin();
            }

            public Builder setMax(double d) {
                copyOnWrite();
                ((Range) this.instance).setMax(d);
                return this;
            }

            public Builder setMin(double d) {
                copyOnWrite();
                ((Range) this.instance).setMin(d);
                return this;
            }

            private Builder() {
                super(Range.DEFAULT_INSTANCE);
            }
        }

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            wn7.registerDefaultInstance(Range.class, range);
        }

        private Range() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.max_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.min_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Range parseDelimitedFrom(InputStream inputStream) {
            return (Range) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(ByteBuffer byteBuffer) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(double d) {
            this.max_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(double d) {
            this.min_ = d;
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            C112021 c112021 = null;
            switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new Range();
                case 2:
                    return new Builder(c112021);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (Range.class) {
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

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMax() {
            return this.max_;
        }

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMin() {
            return this.min_;
        }

        public static Builder newBuilder(Range range) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(range);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (Range) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static Range parseFrom(xq1 xq1Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static Range parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static Range parseFrom(byte[] bArr) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Range parseFrom(byte[] bArr, qp6 qp6Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static Range parseFrom(InputStream inputStream) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static Range parseFrom(jf3 jf3Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static Range parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (Range) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface RangeOrBuilder extends tcb {
        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        double getMax();

        double getMin();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    static {
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        wn7.registerDefaultInstance(Distribution.class, distribution);
    }

    private Distribution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.bucketCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.Z1(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = wn7.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    private void ensureBucketCountsIsMutable() {
        yn8.InterfaceC18445i interfaceC18445i = this.bucketCounts_;
        if (interfaceC18445i.mo28212k()) {
            return;
        }
        this.bucketCounts_ = wn7.mutableCopy(interfaceC18445i);
    }

    private void ensureExemplarsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.exemplars_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.exemplars_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 == null || bucketOptions2 == BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = bucketOptions;
        } else {
            this.bucketOptions_ = (BucketOptions) ((BucketOptions.Builder) BucketOptions.newBuilder(this.bucketOptions_).mergeFrom((wn7) bucketOptions)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRange(Range range) {
        range.getClass();
        Range range2 = this.range_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.range_ = range;
        } else {
            this.range_ = (Range) ((Range.Builder) Range.newBuilder(this.range_).mergeFrom((wn7) range)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) {
        return (Distribution) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.G2(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        this.bucketOptions_ = bucketOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMean(double d) {
        this.mean_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(Range range) {
        range.getClass();
        this.range_ = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112021 c112021 = null;
        switch (C112021.f13299xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Distribution();
            case 2:
                return new Builder(c112021);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Distribution.class) {
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

    @Override // com.google.api.DistributionOrBuilder
    public long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    @Override // com.google.api.DistributionOrBuilder
    public long getCount() {
        return this.count_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public Exemplar getExemplars(int i) {
        return (Exemplar) this.exemplars_.get(i);
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public ExemplarOrBuilder getExemplarsOrBuilder(int i) {
        return (ExemplarOrBuilder) this.exemplars_.get(i);
    }

    public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getMean() {
        return this.mean_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public Range getRange() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasRange() {
        return this.range_ != null;
    }

    public static Builder newBuilder(Distribution distribution) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Distribution) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Distribution parseFrom(xq1 xq1Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, exemplar);
    }

    public static Distribution parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Distribution parseFrom(byte[] bArr) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Distribution parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Distribution parseFrom(InputStream inputStream) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Distribution parseFrom(jf3 jf3Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Distribution parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Distribution) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
