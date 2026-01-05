package p001o;

import ai.salesmax.model.CallEvent;
import ai.salesmax.model.CallStateEvent;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import p001o.u4g;
import p001o.zm;

/* loaded from: classes.dex */
public final class f02 {

    /* renamed from: a */
    public static final C13299a f22467a = new C13299a(null);

    /* renamed from: b */
    public static final f02 f22468b;

    /* renamed from: c */
    public static final jg2 f22469c;

    /* renamed from: d */
    public static final h84 f22470d;

    /* renamed from: e */
    public static final ConcurrentHashMap f22471e;

    /* renamed from: f */
    public static final Set f22472f;

    /* renamed from: g */
    public static final Set f22473g;

    /* renamed from: h */
    public static final yu1 f22474h;

    /* renamed from: i */
    public static final hv1 f22475i;

    /* renamed from: j */
    public static final dc3 f22476j;

    /* renamed from: o.f02$a */
    public static final class C13299a {
        public C13299a() {
        }

        public /* synthetic */ C13299a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final f02 m25914a() {
            return f02.f22468b;
        }
    }

    /* renamed from: o.f02$b */
    public static final class C13300b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f22477a;

        /* renamed from: b */
        public int f22478b;

        public C13300b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13300b(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            C13300b c13300b;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f22478b;
            if (i == 0) {
                wre.m54934b(obj);
                it = f02.f22469c.iterator();
                c13300b = this;
                c13300b.f22477a = it;
                c13300b.f22478b = 1;
                objMo23482a = it.mo23482a(c13300b);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f22477a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                C13300b c13300b2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    CallStateEvent callStateEvent = (CallStateEvent) sg2Var2.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Consumed event: ");
                    sb.append(callStateEvent);
                    f02.f22468b.m25909l(callStateEvent);
                    c13300b = c13300b2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    c13300b.f22477a = it;
                    c13300b.f22478b = 1;
                    objMo23482a = it.mo23482a(c13300b);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    c13300b2 = c13300b;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13300b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.f02$c */
    public static final class C13301c extends jgg implements nl7 {

        /* renamed from: a */
        public int f22479a;

        /* renamed from: b */
        public final /* synthetic */ CallStateEvent f22480b;

        /* renamed from: c */
        public final /* synthetic */ f02 f22481c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13301c(CallStateEvent callStateEvent, f02 f02Var, n64 n64Var) {
            super(2, n64Var);
            this.f22480b = callStateEvent;
            this.f22481c = f02Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13301c(this.f22480b, this.f22481c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f22479a;
            if (i == 0) {
                wre.m54934b(obj);
                if (!f02.f22475i.m31189u(this.f22480b.getContext())) {
                    CallStateEvent callStateEvent = this.f22480b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Tracking disabled for event: ");
                    sb.append(callStateEvent);
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    CallStateEvent callStateEvent2 = this.f22480b;
                    String number = callStateEvent2.getNumber();
                    if (number != null) {
                        firebaseCrashlytics.setCustomKey("contactNumber", number);
                    }
                    String state = callStateEvent2.getState();
                    if (state != null) {
                        firebaseCrashlytics.setCustomKey("state", state);
                    }
                    firebaseCrashlytics.recordException(new RuntimeException("CallStateManager: Tracking disabled for event"));
                    return y3i.f54824a;
                }
                this.f22481c.m25910o(this.f22480b);
                jg2 jg2Var = f02.f22469c;
                CallStateEvent callStateEvent3 = this.f22480b;
                this.f22479a = 1;
                if (jg2Var.mo23475l(callStateEvent3, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            CallStateEvent callStateEvent4 = this.f22480b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Received event: ");
            sb2.append(callStateEvent4);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13301c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.f02$d */
    public static final class C13302d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13302d f22482a = new C13302d();

        public C13302d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke(String str) {
            sq8.m48649h(str, "it");
            return new AtomicReference(new LinkedHashSet());
        }
    }

    /* renamed from: o.f02$e */
    public static final class C13303e extends jgg implements nl7 {

        /* renamed from: a */
        public int f22483a;

        /* renamed from: b */
        public final /* synthetic */ CallStateEvent f22484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13303e(CallStateEvent callStateEvent, n64 n64Var) {
            super(2, n64Var);
            this.f22484b = callStateEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13303e(this.f22484b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f22483a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            Set set = f02.f22472f;
            CallStateEvent callStateEvent = this.f22484b;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((zz1) it.next()).mo32313b(callStateEvent);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13303e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.f02$f */
    public static final class C13304f extends jgg implements nl7 {

        /* renamed from: a */
        public int f22485a;

        /* renamed from: b */
        public final /* synthetic */ av1 f22486b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f22487c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13304f(av1 av1Var, CallEvent callEvent, n64 n64Var) {
            super(2, n64Var);
            this.f22486b = av1Var;
            this.f22487c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13304f(this.f22486b, this.f22487c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f22485a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.f22486b.mo17863f(this.f22487c);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13304f) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    static {
        f02 f02Var = new f02();
        f22468b = f02Var;
        f22469c = tg2.m49824b(50, null, null, 6, null);
        f22470d = p74.f39487a.m43082j();
        f22471e = new ConcurrentHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f22472f = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        f22473g = linkedHashSet2;
        f22474h = yu1.f56041h.m58316a();
        f22475i = hv1.f27574f.m31195a();
        f22476j = dc3.f19548a.m22797a();
        zm.C18680a c18680a = zm.f57387b;
        linkedHashSet.add(c18680a.m59602a());
        linkedHashSet.add(im3.f28834b.m32317a());
        linkedHashSet2.add(c18680a.m59602a());
        f02Var.m25905h();
    }

    /* renamed from: m */
    public static final AtomicReference m25903m(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (AtomicReference) xk7Var.invoke(obj);
    }

    /* renamed from: n */
    public static final Set m25904n(CallStateEvent callStateEvent, Set set) {
        sq8.m48649h(callStateEvent, "$callStateEvent");
        u4g u4gVar = u4g.f48330a;
        sq8.m48646e(set);
        if (!u4gVar.m50944d(kh3.U0(set), callStateEvent)) {
            set.add(callStateEvent);
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(callStateEvent);
        return linkedHashSet;
    }

    /* renamed from: h */
    public final void m25905h() {
        rm1.m46952d(f22470d, null, null, new C13300b(null), 3, null);
    }

    /* renamed from: i */
    public final void m25906i(CallStateEvent callStateEvent) {
        sq8.m48649h(callStateEvent, "callStateEvent");
        rm1.m46952d(f22470d, null, null, new C13301c(callStateEvent, this, null), 3, null);
    }

    /* renamed from: j */
    public final CallEvent m25907j(Set set, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("get final event is done: ");
        sb.append(set);
        u4g u4gVar = u4g.f48330a;
        u4g.C17296b c17296bM50943c = u4gVar.m50943c(set);
        if (set != null) {
            return new CallEvent.Builder().number(((CallStateEvent) kh3.e0(set)).getNumber()).direction(c17296bM50943c.m50946b().name()).callStartTime(c17296bM50943c.m50945a()).source("CALL_STATE").isConnectedCall(Boolean.valueOf(u4gVar.m50942b(set))).context(context).callStatus(u4gVar.m50941a(set).name()).build();
        }
        return null;
    }

    /* renamed from: k */
    public final void m25908k(CallStateEvent callStateEvent) {
        AtomicReference atomicReference = (AtomicReference) f22471e.get(callStateEvent.getNumber());
        Set set = atomicReference != null ? (Set) atomicReference.get() : null;
        Context context = callStateEvent.getContext();
        sq8.m48646e(context);
        CallEvent callEventM25907j = m25907j(set, context);
        if (callEventM25907j != null) {
            callEventM25907j.setInFlightCall(f22474h.m58300g(callEventM25907j));
            dc3 dc3Var = f22476j;
            if (dc3Var.m22791u(callEventM25907j)) {
                dc3Var.m22787q(callEventM25907j);
            } else {
                m25913r(callEventM25907j);
            }
        }
    }

    /* renamed from: l */
    public void m25909l(final CallStateEvent callStateEvent) {
        sq8.m48649h(callStateEvent, "callStateEvent");
        if (callStateEvent.getNumber() == null || sq8.m48644c(callStateEvent.getNumber(), "")) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = f22471e;
        String number = callStateEvent.getNumber();
        final C13302d c13302d = C13302d.f22482a;
        ((AtomicReference) concurrentHashMap.computeIfAbsent(number, new Function() { // from class: o.d02
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f02.m25903m(c13302d, obj);
            }
        })).updateAndGet(new UnaryOperator() { // from class: o.e02
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return f02.m25904n(callStateEvent, (Set) obj);
            }
        });
        Object obj = concurrentHashMap.get(callStateEvent.getNumber());
        StringBuilder sb = new StringBuilder();
        sb.append("Events added to stack: ");
        sb.append(obj);
        AtomicReference atomicReference = (AtomicReference) concurrentHashMap.get(callStateEvent.getNumber());
        Set set = atomicReference != null ? (Set) atomicReference.get() : null;
        Context context = callStateEvent.getContext();
        sq8.m48646e(context);
        CallEvent callEventM25907j = m25907j(set, context);
        if (callEventM25907j != null) {
            if (!f22474h.m58313x(callEventM25907j)) {
                m25908k(callStateEvent);
                m25911p(callStateEvent);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Stale event received: ");
            sb2.append(callEventM25907j);
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.setCustomKey("contactNumber", callStateEvent.getNumber());
            firebaseCrashlytics.recordException(new RuntimeException("CallLogEvent: callStateManager OnReceive : Stale event received"));
            sq8.m48646e(firebaseCrashlytics);
        }
    }

    /* renamed from: o */
    public final void m25910o(CallStateEvent callStateEvent) {
        rm1.m46952d(f22470d, null, null, new C13303e(callStateEvent, null), 3, null);
    }

    /* renamed from: p */
    public final void m25911p(CallStateEvent callStateEvent) {
        if (sq8.m48644c(callStateEvent.getState(), TelephonyManager.EXTRA_STATE_IDLE)) {
            AtomicReference atomicReference = (AtomicReference) azh.m18051d(f22471e).remove(callStateEvent.getNumber());
            Set set = atomicReference != null ? (Set) atomicReference.get() : null;
            CallEvent.Builder builder = new CallEvent.Builder();
            builder.number(callStateEvent.getNumber());
            u4g u4gVar = u4g.f48330a;
            u4g.C17296b c17296bM50943c = u4gVar.m50943c(set);
            builder.direction(c17296bM50943c.m50946b().name());
            builder.callStartTime(c17296bM50943c.m50945a());
            builder.callEndTime(callStateEvent.getEventTime());
            builder.isConnectedCall(Boolean.valueOf(u4gVar.m50942b(set)));
            builder.source("CALL_STATE");
            builder.callStatus(u4gVar.m50941a(set).name());
            builder.context(callStateEvent.getContext());
            m25912q(builder.build());
        }
    }

    /* renamed from: q */
    public void m25912q(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        f22475i.m31186r(callEvent);
    }

    /* renamed from: r */
    public final void m25913r(CallEvent callEvent) {
        Iterator it = f22473g.iterator();
        while (it.hasNext()) {
            rm1.m46952d(f22470d, null, null, new C13304f((av1) it.next(), callEvent, null), 3, null);
        }
    }
}
