package com.google.api;

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
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class Billing extends wn7 implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile hxc PARSER;
    private yn8.InterfaceC18446j consumerDestinations_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Billing$1 */
    public static /* synthetic */ class C111951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13293xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13293xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13293xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BillingDestination extends wn7 implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile hxc PARSER;
        private String monitoredResource_ = "";
        private yn8.InterfaceC18446j metrics_ = wn7.emptyProtobufList();

        public static final class Builder extends wn7.AbstractC17934a implements BillingDestinationOrBuilder {
            public /* synthetic */ Builder(C111951 c111951) {
                this();
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                copyOnWrite();
                ((BillingDestination) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder addMetrics(String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).addMetrics(str);
                return this;
            }

            public Builder addMetricsBytes(xq1 xq1Var) {
                copyOnWrite();
                ((BillingDestination) this.instance).addMetricsBytes(xq1Var);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((BillingDestination) this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                copyOnWrite();
                ((BillingDestination) this.instance).clearMonitoredResource();
                return this;
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMetrics(int i) {
                return ((BillingDestination) this.instance).getMetrics(i);
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public xq1 getMetricsBytes(int i) {
                return ((BillingDestination) this.instance).getMetricsBytes(i);
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public int getMetricsCount() {
                return ((BillingDestination) this.instance).getMetricsCount();
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((BillingDestination) this.instance).getMetricsList());
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMonitoredResource() {
                return ((BillingDestination) this.instance).getMonitoredResource();
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public xq1 getMonitoredResourceBytes() {
                return ((BillingDestination) this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int i, String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMetrics(i, str);
                return this;
            }

            public Builder setMonitoredResource(String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMonitoredResource(str);
                return this;
            }

            public Builder setMonitoredResourceBytes(xq1 xq1Var) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMonitoredResourceBytes(xq1Var);
                return this;
            }

            private Builder() {
                super(BillingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            wn7.registerDefaultInstance(BillingDestination.class, billingDestination);
        }

        private BillingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            r8.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetricsBytes(xq1 xq1Var) {
            r8.checkByteStringIsUtf8(xq1Var);
            ensureMetricsIsMutable();
            this.metrics_.add(xq1Var.m56593N());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = wn7.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            yn8.InterfaceC18446j interfaceC18446j = this.metrics_;
            if (interfaceC18446j.mo28212k()) {
                return;
            }
            this.metrics_ = wn7.mutableCopy(interfaceC18446j);
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) {
            return (BillingDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(xq1 xq1Var) {
            r8.checkByteStringIsUtf8(xq1Var);
            this.monitoredResource_ = xq1Var.m56593N();
        }

        @Override // p001o.wn7
        public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
            C111951 c111951 = null;
            switch (C111951.f13293xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new BillingDestination();
                case 2:
                    return new Builder(c111951);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (BillingDestination.class) {
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

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMetrics(int i) {
            return (String) this.metrics_.get(i);
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public xq1 getMetricsBytes(int i) {
            return xq1.m56589q((String) this.metrics_.get(i));
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public xq1 getMonitoredResourceBytes() {
            return xq1.m56589q(this.monitoredResource_);
        }

        public static Builder newBuilder(BillingDestination billingDestination) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (BillingDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static BillingDestination parseFrom(xq1 xq1Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static BillingDestination parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static BillingDestination parseFrom(byte[] bArr) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BillingDestination parseFrom(byte[] bArr, qp6 qp6Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static BillingDestination parseFrom(InputStream inputStream) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static BillingDestination parseFrom(jf3 jf3Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static BillingDestination parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (BillingDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface BillingDestinationOrBuilder extends tcb {
        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        String getMetrics(int i);

        xq1 getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        xq1 getMonitoredResourceBytes();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends wn7.AbstractC17934a implements BillingOrBuilder {
        public /* synthetic */ Builder(C111951 c111951) {
            this();
        }

        public Builder addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
            copyOnWrite();
            ((Billing) this.instance).addAllConsumerDestinations(iterable);
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(billingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            copyOnWrite();
            ((Billing) this.instance).clearConsumerDestinations();
            return this;
        }

        @Override // com.google.api.BillingOrBuilder
        public BillingDestination getConsumerDestinations(int i) {
            return ((Billing) this.instance).getConsumerDestinations(i);
        }

        @Override // com.google.api.BillingOrBuilder
        public int getConsumerDestinationsCount() {
            return ((Billing) this.instance).getConsumerDestinationsCount();
        }

        @Override // com.google.api.BillingOrBuilder
        public List<BillingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Billing) this.instance).getConsumerDestinationsList());
        }

        public Builder removeConsumerDestinations(int i) {
            copyOnWrite();
            ((Billing) this.instance).removeConsumerDestinations(i);
            return this;
        }

        public Builder setConsumerDestinations(int i, BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).setConsumerDestinations(i, billingDestination);
            return this;
        }

        private Builder() {
            super(Billing.DEFAULT_INSTANCE);
        }

        public Builder addConsumerDestinations(int i, BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(i, billingDestination);
            return this;
        }

        public Builder setConsumerDestinations(int i, BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).setConsumerDestinations(i, (BillingDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations((BillingDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int i, BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(i, (BillingDestination) builder.build());
            return this;
        }
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        wn7.registerDefaultInstance(Billing.class, billing);
    }

    private Billing() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = wn7.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.consumerDestinations_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.consumerDestinations_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) {
        return (Billing) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, billingDestination);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111951 c111951 = null;
        switch (C111951.f13293xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Billing();
            case 2:
                return new Builder(c111951);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Billing.class) {
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

    @Override // com.google.api.BillingOrBuilder
    public BillingDestination getConsumerDestinations(int i) {
        return (BillingDestination) this.consumerDestinations_.get(i);
    }

    @Override // com.google.api.BillingOrBuilder
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.api.BillingOrBuilder
    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
        return (BillingDestinationOrBuilder) this.consumerDestinations_.get(i);
    }

    public List<? extends BillingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public static Builder newBuilder(Billing billing) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Billing) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Billing parseFrom(xq1 xq1Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, billingDestination);
    }

    public static Billing parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Billing parseFrom(byte[] bArr) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Billing parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Billing parseFrom(InputStream inputStream) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Billing parseFrom(jf3 jf3Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Billing parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Billing) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
