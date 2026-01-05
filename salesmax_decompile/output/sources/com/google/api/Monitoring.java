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
public final class Monitoring extends wn7 implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j producerDestinations_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j consumerDestinations_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Monitoring$1 */
    public static /* synthetic */ class C112241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13316xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13316xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13316xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements MonitoringOrBuilder {
        public /* synthetic */ Builder(C112241 c112241) {
            this();
        }

        public Builder addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            copyOnWrite();
            ((Monitoring) this.instance).addAllConsumerDestinations(iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            copyOnWrite();
            ((Monitoring) this.instance).addAllProducerDestinations(iterable);
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).addConsumerDestinations(monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).addProducerDestinations(monitoringDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            copyOnWrite();
            ((Monitoring) this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            copyOnWrite();
            ((Monitoring) this.instance).clearProducerDestinations();
            return this;
        }

        @Override // com.google.api.MonitoringOrBuilder
        public MonitoringDestination getConsumerDestinations(int i) {
            return ((Monitoring) this.instance).getConsumerDestinations(i);
        }

        @Override // com.google.api.MonitoringOrBuilder
        public int getConsumerDestinationsCount() {
            return ((Monitoring) this.instance).getConsumerDestinationsCount();
        }

        @Override // com.google.api.MonitoringOrBuilder
        public List<MonitoringDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring) this.instance).getConsumerDestinationsList());
        }

        @Override // com.google.api.MonitoringOrBuilder
        public MonitoringDestination getProducerDestinations(int i) {
            return ((Monitoring) this.instance).getProducerDestinations(i);
        }

        @Override // com.google.api.MonitoringOrBuilder
        public int getProducerDestinationsCount() {
            return ((Monitoring) this.instance).getProducerDestinationsCount();
        }

        @Override // com.google.api.MonitoringOrBuilder
        public List<MonitoringDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring) this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int i) {
            copyOnWrite();
            ((Monitoring) this.instance).removeConsumerDestinations(i);
            return this;
        }

        public Builder removeProducerDestinations(int i) {
            copyOnWrite();
            ((Monitoring) this.instance).removeProducerDestinations(i);
            return this;
        }

        public Builder setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).setConsumerDestinations(i, monitoringDestination);
            return this;
        }

        public Builder setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).setProducerDestinations(i, monitoringDestination);
            return this;
        }

        private Builder() {
            super(Monitoring.DEFAULT_INSTANCE);
        }

        public Builder addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).addConsumerDestinations(i, monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
            copyOnWrite();
            ((Monitoring) this.instance).addProducerDestinations(i, monitoringDestination);
            return this;
        }

        public Builder setConsumerDestinations(int i, MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).setConsumerDestinations(i, (MonitoringDestination) builder.build());
            return this;
        }

        public Builder setProducerDestinations(int i, MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).setProducerDestinations(i, (MonitoringDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).addConsumerDestinations((MonitoringDestination) builder.build());
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).addProducerDestinations((MonitoringDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int i, MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).addConsumerDestinations(i, (MonitoringDestination) builder.build());
            return this;
        }

        public Builder addProducerDestinations(int i, MonitoringDestination.Builder builder) {
            copyOnWrite();
            ((Monitoring) this.instance).addProducerDestinations(i, (MonitoringDestination) builder.build());
            return this;
        }
    }

    public static final class MonitoringDestination extends wn7 implements MonitoringDestinationOrBuilder {
        private static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile hxc PARSER;
        private String monitoredResource_ = "";
        private yn8.InterfaceC18446j metrics_ = wn7.emptyProtobufList();

        public static final class Builder extends wn7.AbstractC17934a implements MonitoringDestinationOrBuilder {
            public /* synthetic */ Builder(C112241 c112241) {
                this();
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder addMetrics(String str) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).addMetrics(str);
                return this;
            }

            public Builder addMetricsBytes(xq1 xq1Var) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).addMetricsBytes(xq1Var);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((MonitoringDestination) this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                copyOnWrite();
                ((MonitoringDestination) this.instance).clearMonitoredResource();
                return this;
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public String getMetrics(int i) {
                return ((MonitoringDestination) this.instance).getMetrics(i);
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public xq1 getMetricsBytes(int i) {
                return ((MonitoringDestination) this.instance).getMetricsBytes(i);
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public int getMetricsCount() {
                return ((MonitoringDestination) this.instance).getMetricsCount();
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((MonitoringDestination) this.instance).getMetricsList());
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public String getMonitoredResource() {
                return ((MonitoringDestination) this.instance).getMonitoredResource();
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public xq1 getMonitoredResourceBytes() {
                return ((MonitoringDestination) this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int i, String str) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).setMetrics(i, str);
                return this;
            }

            public Builder setMonitoredResource(String str) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).setMonitoredResource(str);
                return this;
            }

            public Builder setMonitoredResourceBytes(xq1 xq1Var) {
                copyOnWrite();
                ((MonitoringDestination) this.instance).setMonitoredResourceBytes(xq1Var);
                return this;
            }

            private Builder() {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            wn7.registerDefaultInstance(MonitoringDestination.class, monitoringDestination);
        }

        private MonitoringDestination() {
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

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) {
            return (MonitoringDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            C112241 c112241 = null;
            switch (C112241.f13316xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new MonitoringDestination();
                case 2:
                    return new Builder(c112241);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (MonitoringDestination.class) {
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

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public String getMetrics(int i) {
            return (String) this.metrics_.get(i);
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public xq1 getMetricsBytes(int i) {
            return xq1.m56589q((String) this.metrics_.get(i));
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public xq1 getMonitoredResourceBytes() {
            return xq1.m56589q(this.monitoredResource_);
        }

        public static Builder newBuilder(MonitoringDestination monitoringDestination) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static MonitoringDestination parseFrom(xq1 xq1Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static MonitoringDestination parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static MonitoringDestination parseFrom(byte[] bArr) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringDestination parseFrom(byte[] bArr, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static MonitoringDestination parseFrom(jf3 jf3Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static MonitoringDestination parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (MonitoringDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface MonitoringDestinationOrBuilder extends tcb {
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

    static {
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        wn7.registerDefaultInstance(Monitoring.class, monitoring);
    }

    private Monitoring() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = wn7.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.consumerDestinations_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.consumerDestinations_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureProducerDestinationsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.producerDestinations_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.producerDestinations_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) {
        return (Monitoring) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeProducerDestinations(int i) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, monitoringDestination);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112241 c112241 = null;
        switch (C112241.f13316xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Monitoring();
            case 2:
                return new Builder(c112241);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Monitoring.class) {
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

    @Override // com.google.api.MonitoringOrBuilder
    public MonitoringDestination getConsumerDestinations(int i) {
        return (MonitoringDestination) this.consumerDestinations_.get(i);
    }

    @Override // com.google.api.MonitoringOrBuilder
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.api.MonitoringOrBuilder
    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
        return (MonitoringDestinationOrBuilder) this.consumerDestinations_.get(i);
    }

    public List<? extends MonitoringDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // com.google.api.MonitoringOrBuilder
    public MonitoringDestination getProducerDestinations(int i) {
        return (MonitoringDestination) this.producerDestinations_.get(i);
    }

    @Override // com.google.api.MonitoringOrBuilder
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override // com.google.api.MonitoringOrBuilder
    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int i) {
        return (MonitoringDestinationOrBuilder) this.producerDestinations_.get(i);
    }

    public List<? extends MonitoringDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static Builder newBuilder(Monitoring monitoring) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Monitoring) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Monitoring parseFrom(xq1 xq1Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, monitoringDestination);
    }

    public static Monitoring parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Monitoring parseFrom(byte[] bArr) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Monitoring parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Monitoring parseFrom(InputStream inputStream) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Monitoring parseFrom(jf3 jf3Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Monitoring parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Monitoring) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
