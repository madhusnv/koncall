package com.google.firebase.perf.v1;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class PerfSession extends wn7 implements PerfSessionOrBuilder {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile hxc PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final yn8.C18444h.a sessionVerbosity_converter_ = new yn8.C18444h.a() { // from class: com.google.firebase.perf.v1.PerfSession.1
        @Override // p001o.yn8.C18444h.a
        public SessionVerbosity convert(Integer num) {
            SessionVerbosity sessionVerbosityForNumber = SessionVerbosity.forNumber(num.intValue());
            return sessionVerbosityForNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityForNumber;
        }
    };
    private int bitField0_;
    private String sessionId_ = "";
    private yn8.InterfaceC18443g sessionVerbosity_ = wn7.emptyIntList();

    /* renamed from: com.google.firebase.perf.v1.PerfSession$2 */
    public static /* synthetic */ class C114632 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13439xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13439xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13439xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements PerfSessionOrBuilder {
        public Builder addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
            copyOnWrite();
            ((PerfSession) this.instance).addAllSessionVerbosity(iterable);
            return this;
        }

        public Builder addSessionVerbosity(SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(sessionVerbosity);
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((PerfSession) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSessionVerbosity() {
            copyOnWrite();
            ((PerfSession) this.instance).clearSessionVerbosity();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public String getSessionId() {
            return ((PerfSession) this.instance).getSessionId();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public xq1 getSessionIdBytes() {
            return ((PerfSession) this.instance).getSessionIdBytes();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public SessionVerbosity getSessionVerbosity(int i) {
            return ((PerfSession) this.instance).getSessionVerbosity(i);
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public int getSessionVerbosityCount() {
            return ((PerfSession) this.instance).getSessionVerbosityCount();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public List<SessionVerbosity> getSessionVerbosityList() {
            return ((PerfSession) this.instance).getSessionVerbosityList();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public boolean hasSessionId() {
            return ((PerfSession) this.instance).hasSessionId();
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionIdBytes(xq1Var);
            return this;
        }

        public Builder setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionVerbosity(i, sessionVerbosity);
            return this;
        }

        private Builder() {
            super(PerfSession.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        wn7.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        ensureSessionVerbosityIsMutable();
        Iterator<? extends SessionVerbosity> it = iterable.iterator();
        while (it.hasNext()) {
            this.sessionVerbosity_.R1(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.R1(sessionVerbosity.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = wn7.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        yn8.InterfaceC18443g interfaceC18443g = this.sessionVerbosity_;
        if (interfaceC18443g.mo28212k()) {
            return;
        }
        this.sessionVerbosity_ = wn7.mutableCopy(interfaceC18443g);
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) {
        return (PerfSession) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(xq1 xq1Var) {
        this.sessionId_ = xq1Var.m56593N();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i, SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.mo58022H(i, sessionVerbosity.getNumber());
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        switch (C114632.f13439xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new Builder();
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (PerfSession.class) {
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

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public xq1 getSessionIdBytes() {
        return xq1.m56589q(this.sessionId_);
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public SessionVerbosity getSessionVerbosity(int i) {
        return (SessionVerbosity) sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(i)));
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public List<SessionVerbosity> getSessionVerbosityList() {
        return new yn8.C18444h(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(PerfSession perfSession) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (PerfSession) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static PerfSession parseFrom(xq1 xq1Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    public static PerfSession parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static PerfSession parseFrom(byte[] bArr) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, qp6 qp6Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static PerfSession parseFrom(InputStream inputStream) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static PerfSession parseFrom(jf3 jf3Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static PerfSession parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (PerfSession) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
