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
public final class Logging extends wn7 implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private yn8.InterfaceC18446j producerDestinations_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j consumerDestinations_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.Logging$1 */
    public static /* synthetic */ class C112151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13309xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13309xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13309xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements LoggingOrBuilder {
        public /* synthetic */ Builder(C112151 c112151) {
            this();
        }

        public Builder addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
            copyOnWrite();
            ((Logging) this.instance).addAllConsumerDestinations(iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
            copyOnWrite();
            ((Logging) this.instance).addAllProducerDestinations(iterable);
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(loggingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            copyOnWrite();
            ((Logging) this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            copyOnWrite();
            ((Logging) this.instance).clearProducerDestinations();
            return this;
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getConsumerDestinations(int i) {
            return ((Logging) this.instance).getConsumerDestinations(i);
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getConsumerDestinationsCount() {
            return ((Logging) this.instance).getConsumerDestinationsCount();
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.instance).getConsumerDestinationsList());
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getProducerDestinations(int i) {
            return ((Logging) this.instance).getProducerDestinations(i);
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getProducerDestinationsCount() {
            return ((Logging) this.instance).getProducerDestinationsCount();
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int i) {
            copyOnWrite();
            ((Logging) this.instance).removeConsumerDestinations(i);
            return this;
        }

        public Builder removeProducerDestinations(int i) {
            copyOnWrite();
            ((Logging) this.instance).removeProducerDestinations(i);
            return this;
        }

        public Builder setConsumerDestinations(int i, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).setConsumerDestinations(i, loggingDestination);
            return this;
        }

        public Builder setProducerDestinations(int i, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).setProducerDestinations(i, loggingDestination);
            return this;
        }

        private Builder() {
            super(Logging.DEFAULT_INSTANCE);
        }

        public Builder addConsumerDestinations(int i, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(i, loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(int i, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(i, loggingDestination);
            return this;
        }

        public Builder setConsumerDestinations(int i, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).setConsumerDestinations(i, (LoggingDestination) builder.build());
            return this;
        }

        public Builder setProducerDestinations(int i, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).setProducerDestinations(i, (LoggingDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations((LoggingDestination) builder.build());
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations((LoggingDestination) builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int i, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(i, (LoggingDestination) builder.build());
            return this;
        }

        public Builder addProducerDestinations(int i, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(i, (LoggingDestination) builder.build());
            return this;
        }
    }

    public static final class LoggingDestination extends wn7 implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile hxc PARSER;
        private String monitoredResource_ = "";
        private yn8.InterfaceC18446j logs_ = wn7.emptyProtobufList();

        public static final class Builder extends wn7.AbstractC17934a implements LoggingDestinationOrBuilder {
            public /* synthetic */ Builder(C112151 c112151) {
                this();
            }

            public Builder addAllLogs(Iterable<String> iterable) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addAllLogs(iterable);
                return this;
            }

            public Builder addLogs(String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addLogs(str);
                return this;
            }

            public Builder addLogsBytes(xq1 xq1Var) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addLogsBytes(xq1Var);
                return this;
            }

            public Builder clearLogs() {
                copyOnWrite();
                ((LoggingDestination) this.instance).clearLogs();
                return this;
            }

            public Builder clearMonitoredResource() {
                copyOnWrite();
                ((LoggingDestination) this.instance).clearMonitoredResource();
                return this;
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getLogs(int i) {
                return ((LoggingDestination) this.instance).getLogs(i);
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public xq1 getLogsBytes(int i) {
                return ((LoggingDestination) this.instance).getLogsBytes(i);
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public int getLogsCount() {
                return ((LoggingDestination) this.instance).getLogsCount();
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public List<String> getLogsList() {
                return Collections.unmodifiableList(((LoggingDestination) this.instance).getLogsList());
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getMonitoredResource() {
                return ((LoggingDestination) this.instance).getMonitoredResource();
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public xq1 getMonitoredResourceBytes() {
                return ((LoggingDestination) this.instance).getMonitoredResourceBytes();
            }

            public Builder setLogs(int i, String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setLogs(i, str);
                return this;
            }

            public Builder setMonitoredResource(String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setMonitoredResource(str);
                return this;
            }

            public Builder setMonitoredResourceBytes(xq1 xq1Var) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setMonitoredResourceBytes(xq1Var);
                return this;
            }

            private Builder() {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            wn7.registerDefaultInstance(LoggingDestination.class, loggingDestination);
        }

        private LoggingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            r8.addAll((Iterable) iterable, (List) this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogsBytes(xq1 xq1Var) {
            r8.checkByteStringIsUtf8(xq1Var);
            ensureLogsIsMutable();
            this.logs_.add(xq1Var.m56593N());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = wn7.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            yn8.InterfaceC18446j interfaceC18446j = this.logs_;
            if (interfaceC18446j.mo28212k()) {
                return;
            }
            this.logs_ = wn7.mutableCopy(interfaceC18446j);
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) {
            return (LoggingDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static hxc parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i, String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i, str);
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
            C112151 c112151 = null;
            switch (C112151.f13309xa1df5c61[enumC17940g.ordinal()]) {
                case 1:
                    return new LoggingDestination();
                case 2:
                    return new Builder(c112151);
                case 3:
                    return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hxc c17935b = PARSER;
                    if (c17935b == null) {
                        synchronized (LoggingDestination.class) {
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

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getLogs(int i) {
            return (String) this.logs_.get(i);
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public xq1 getLogsBytes(int i) {
            return xq1.m56589q((String) this.logs_.get(i));
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public List<String> getLogsList() {
            return this.logs_;
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public xq1 getMonitoredResourceBytes() {
            return xq1.m56589q(this.monitoredResource_);
        }

        public static Builder newBuilder(LoggingDestination loggingDestination) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
        }

        public static LoggingDestination parseFrom(xq1 xq1Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
        }

        public static LoggingDestination parseFrom(xq1 xq1Var, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
        }

        public static LoggingDestination parseFrom(byte[] bArr) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingDestination parseFrom(byte[] bArr, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
        }

        public static LoggingDestination parseFrom(jf3 jf3Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
        }

        public static LoggingDestination parseFrom(jf3 jf3Var, qp6 qp6Var) {
            return (LoggingDestination) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
        }
    }

    public interface LoggingDestinationOrBuilder extends tcb {
        @Override // p001o.tcb
        /* synthetic */ scb getDefaultInstanceForType();

        String getLogs(int i);

        xq1 getLogsBytes(int i);

        int getLogsCount();

        List<String> getLogsList();

        String getMonitoredResource();

        xq1 getMonitoredResourceBytes();

        @Override // p001o.tcb
        /* synthetic */ boolean isInitialized();
    }

    static {
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        wn7.registerDefaultInstance(Logging.class, logging);
    }

    private Logging() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(loggingDestination);
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

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) {
        return (Logging) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setConsumerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, loggingDestination);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C112151 c112151 = null;
        switch (C112151.f13309xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new Logging();
            case 2:
                return new Builder(c112151);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (Logging.class) {
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

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getConsumerDestinations(int i) {
        return (LoggingDestination) this.consumerDestinations_.get(i);
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
        return (LoggingDestinationOrBuilder) this.consumerDestinations_.get(i);
    }

    public List<? extends LoggingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getProducerDestinations(int i) {
        return (LoggingDestination) this.producerDestinations_.get(i);
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int i) {
        return (LoggingDestinationOrBuilder) this.producerDestinations_.get(i);
    }

    public List<? extends LoggingDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static Builder newBuilder(Logging logging) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (Logging) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static Logging parseFrom(xq1 xq1Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, loggingDestination);
    }

    public static Logging parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static Logging parseFrom(byte[] bArr) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Logging parseFrom(byte[] bArr, qp6 qp6Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static Logging parseFrom(InputStream inputStream) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static Logging parseFrom(jf3 jf3Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static Logging parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (Logging) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
