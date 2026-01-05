package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.PerfSession;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
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
import p001o.yn8;

/* loaded from: classes6.dex */
public final class TraceMetric extends wn7 implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile hxc PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private ora counters_ = ora.m42592g();
    private ora customAttributes_ = ora.m42592g();
    private String name_ = "";
    private yn8.InterfaceC18446j subtraces_ = wn7.emptyProtobufList();
    private yn8.InterfaceC18446j perfSessions_ = wn7.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$1 */
    public static /* synthetic */ class C114651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13440xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13440xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13440xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements TraceMetricOrBuilder {
        public /* synthetic */ Builder(C114651 c114651) {
            this();
        }

        public Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }

        public Builder addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllSubtraces(iterable);
            return this;
        }

        public Builder addPerfSessions(PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(perfSession);
            return this;
        }

        public Builder addSubtraces(TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(traceMetric);
            return this;
        }

        public Builder clearClientStartTimeUs() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearClientStartTimeUs();
            return this;
        }

        public Builder clearCounters() {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().clear();
            return this;
        }

        public Builder clearCustomAttributes() {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().clear();
            return this;
        }

        public Builder clearDurationUs() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearDurationUs();
            return this;
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearIsAuto();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearName();
            return this;
        }

        public Builder clearPerfSessions() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearPerfSessions();
            return this;
        }

        public Builder clearSubtraces() {
            copyOnWrite();
            ((TraceMetric) this.instance).clearSubtraces();
            return this;
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean containsCounters(String str) {
            str.getClass();
            return ((TraceMetric) this.instance).getCountersMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((TraceMetric) this.instance).getCustomAttributesMap().containsKey(str);
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getClientStartTimeUs() {
            return ((TraceMetric) this.instance).getClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, Long> getCounters() {
            return getCountersMap();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getCountersCount() {
            return ((TraceMetric) this.instance).getCountersMap().size();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public Map<String, Long> getCountersMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.instance).getCountersMap());
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getCountersOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.instance).getCountersMap();
            return countersMap.containsKey(str) ? countersMap.get(str).longValue() : j;
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getCountersOrThrow(String str) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.instance).getCountersMap();
            if (countersMap.containsKey(str)) {
                return countersMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getCustomAttributesCount() {
            return ((TraceMetric) this.instance).getCustomAttributesMap().size();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.instance).getCustomAttributesMap());
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.instance).getCustomAttributesMap();
            return customAttributesMap.containsKey(str) ? customAttributesMap.get(str) : str2;
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.instance).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getDurationUs() {
            return ((TraceMetric) this.instance).getDurationUs();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean getIsAuto() {
            return ((TraceMetric) this.instance).getIsAuto();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getName() {
            return ((TraceMetric) this.instance).getName();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public xq1 getNameBytes() {
            return ((TraceMetric) this.instance).getNameBytes();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public PerfSession getPerfSessions(int i) {
            return ((TraceMetric) this.instance).getPerfSessions(i);
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getPerfSessionsCount() {
            return ((TraceMetric) this.instance).getPerfSessionsCount();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public List<PerfSession> getPerfSessionsList() {
            return Collections.unmodifiableList(((TraceMetric) this.instance).getPerfSessionsList());
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public TraceMetric getSubtraces(int i) {
            return ((TraceMetric) this.instance).getSubtraces(i);
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getSubtracesCount() {
            return ((TraceMetric) this.instance).getSubtracesCount();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public List<TraceMetric> getSubtracesList() {
            return Collections.unmodifiableList(((TraceMetric) this.instance).getSubtracesList());
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasClientStartTimeUs() {
            return ((TraceMetric) this.instance).hasClientStartTimeUs();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasDurationUs() {
            return ((TraceMetric) this.instance).hasDurationUs();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasIsAuto() {
            return ((TraceMetric) this.instance).hasIsAuto();
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasName() {
            return ((TraceMetric) this.instance).hasName();
        }

        public Builder putAllCounters(Map<String, Long> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().putAll(map);
            return this;
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public Builder putCounters(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().put(str, Long.valueOf(j));
            return this;
        }

        public Builder putCustomAttributes(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        public Builder removeCounters(String str) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().remove(str);
            return this;
        }

        public Builder removeCustomAttributes(String str) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        public Builder removePerfSessions(int i) {
            copyOnWrite();
            ((TraceMetric) this.instance).removePerfSessions(i);
            return this;
        }

        public Builder removeSubtraces(int i) {
            copyOnWrite();
            ((TraceMetric) this.instance).removeSubtraces(i);
            return this;
        }

        public Builder setClientStartTimeUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setClientStartTimeUs(j);
            return this;
        }

        public Builder setDurationUs(long j) {
            copyOnWrite();
            ((TraceMetric) this.instance).setDurationUs(j);
            return this;
        }

        public Builder setIsAuto(boolean z) {
            copyOnWrite();
            ((TraceMetric) this.instance).setIsAuto(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(xq1 xq1Var) {
            copyOnWrite();
            ((TraceMetric) this.instance).setNameBytes(xq1Var);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).setPerfSessions(i, perfSession);
            return this;
        }

        public Builder setSubtraces(int i, TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).setSubtraces(i, traceMetric);
            return this;
        }

        private Builder() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }

        public Builder addPerfSessions(int i, PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(i, perfSession);
            return this;
        }

        public Builder addSubtraces(int i, TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(i, traceMetric);
            return this;
        }

        public Builder setPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).setPerfSessions(i, (PerfSession) builder.build());
            return this;
        }

        public Builder setSubtraces(int i, Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).setSubtraces(i, (TraceMetric) builder.build());
            return this;
        }

        public Builder addPerfSessions(PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions((PerfSession) builder.build());
            return this;
        }

        public Builder addSubtraces(Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces((TraceMetric) builder.build());
            return this;
        }

        public Builder addPerfSessions(int i, PerfSession.Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(i, (PerfSession) builder.build());
            return this;
        }

        public Builder addSubtraces(int i, Builder builder) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(i, (TraceMetric) builder.build());
            return this;
        }
    }

    public static final class CountersDefaultEntryHolder {
        static final nra defaultEntry = nra.m41005d(fbj.EnumC13396b.STRING, "", fbj.EnumC13396b.INT64, 0L);

        private CountersDefaultEntryHolder() {
        }
    }

    public static final class CustomAttributesDefaultEntryHolder {
        static final nra defaultEntry;

        static {
            fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.STRING;
            defaultEntry = nra.m41005d(enumC13396b, "", enumC13396b, "");
        }

        private CustomAttributesDefaultEntryHolder() {
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        wn7.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        r8.addAll((Iterable) iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = wn7.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = wn7.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.perfSessions_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.perfSessions_ = wn7.mutableCopy(interfaceC18446j);
    }

    private void ensureSubtracesIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.subtraces_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.subtraces_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private ora internalGetCounters() {
        return this.counters_;
    }

    private ora internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private ora internalGetMutableCounters() {
        if (!this.counters_.m42597t()) {
            this.counters_ = this.counters_.m42595A();
        }
        return this.counters_;
    }

    private ora internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.m42597t()) {
            this.customAttributes_ = this.customAttributes_.m42595A();
        }
        return this.customAttributes_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) {
        return (TraceMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtraces(int i) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(xq1 xq1Var) {
        this.name_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i, traceMetric);
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C114651 c114651 = null;
        switch (C114651.f13440xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new Builder(c114651);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", CountersDefaultEntryHolder.defaultEntry, "subtraces_", TraceMetric.class, "customAttributes_", CustomAttributesDefaultEntryHolder.defaultEntry, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (TraceMetric.class) {
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

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getCountersCount() {
        return internalGetCounters().size();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getCountersOrDefault(String str, long j) {
        str.getClass();
        ora oraVarInternalGetCounters = internalGetCounters();
        return oraVarInternalGetCounters.containsKey(str) ? ((Long) oraVarInternalGetCounters.get(str)).longValue() : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getCountersOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetCounters = internalGetCounters();
        if (oraVarInternalGetCounters.containsKey(str)) {
            return ((Long) oraVarInternalGetCounters.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        return oraVarInternalGetCustomAttributes.containsKey(str) ? (String) oraVarInternalGetCustomAttributes.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        ora oraVarInternalGetCustomAttributes = internalGetCustomAttributes();
        if (oraVarInternalGetCustomAttributes.containsKey(str)) {
            return (String) oraVarInternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getDurationUs() {
        return this.durationUs_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public xq1 getNameBytes() {
        return xq1.m56589q(this.name_);
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public PerfSession getPerfSessions(int i) {
        return (PerfSession) this.perfSessions_.get(i);
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
        return (PerfSessionOrBuilder) this.perfSessions_.get(i);
    }

    public List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public TraceMetric getSubtraces(int i) {
        return (TraceMetric) this.subtraces_.get(i);
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public TraceMetricOrBuilder getSubtracesOrBuilder(int i) {
        return (TraceMetricOrBuilder) this.subtraces_.get(i);
    }

    public List<? extends TraceMetricOrBuilder> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TraceMetric traceMetric) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (TraceMetric) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static TraceMetric parseFrom(xq1 xq1Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i, traceMetric);
    }

    public static TraceMetric parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static TraceMetric parseFrom(byte[] bArr) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, qp6 qp6Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static TraceMetric parseFrom(InputStream inputStream) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static TraceMetric parseFrom(jf3 jf3Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static TraceMetric parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (TraceMetric) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
