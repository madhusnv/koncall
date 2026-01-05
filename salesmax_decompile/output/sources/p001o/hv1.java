package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.WebInitiatedCallEvent;
import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.CallLog;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p001o.hv1;
import p001o.p69;

/* loaded from: classes.dex */
public final class hv1 implements PreferenceChangeEventListener, o3d {

    /* renamed from: f */
    public static final C14082a f27574f = new C14082a(null);

    /* renamed from: g */
    public static final int f27575g = 8;

    /* renamed from: h */
    public static hv1 f27576h = new hv1();

    /* renamed from: i */
    public static final jg2 f27577i;

    /* renamed from: j */
    public static final jg2 f27578j;

    /* renamed from: k */
    public static h84 f27579k;

    /* renamed from: l */
    public static final List f27580l;

    /* renamed from: m */
    public static final yu1 f27581m;

    /* renamed from: n */
    public static final dc3 f27582n;

    /* renamed from: o */
    public static final dkf f27583o;

    /* renamed from: p */
    public static final long f27584p;

    /* renamed from: q */
    public static p69 f27585q;

    /* renamed from: r */
    public static p69 f27586r;

    /* renamed from: a */
    public volatile C14083b f27587a = new C14083b(false, false, false, false, 7, null);

    /* renamed from: b */
    public volatile AtomicBoolean f27588b = new AtomicBoolean(false);

    /* renamed from: c */
    public volatile AtomicBoolean f27589c = new AtomicBoolean(false);

    /* renamed from: d */
    public volatile AtomicReference f27590d = new AtomicReference();

    /* renamed from: e */
    public final bv1 f27591e = bv1.f16849b.m19851a();

    /* renamed from: o.hv1$a */
    public static final class C14082a {
        public C14082a() {
        }

        public /* synthetic */ C14082a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final hv1 m31195a() {
            return hv1.f27576h;
        }
    }

    /* renamed from: o.hv1$b */
    public static final class C14083b {

        /* renamed from: a */
        public boolean f27592a;

        /* renamed from: b */
        public boolean f27593b;

        /* renamed from: c */
        public boolean f27594c;

        /* renamed from: d */
        public boolean f27595d;

        public C14083b(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f27592a = z;
            this.f27593b = z2;
            this.f27594c = z3;
            this.f27595d = z4;
        }

        /* renamed from: a */
        public final boolean m31196a() {
            return this.f27592a;
        }

        /* renamed from: b */
        public final boolean m31197b() {
            return this.f27595d;
        }

        /* renamed from: c */
        public final boolean m31198c() {
            return this.f27593b;
        }

        /* renamed from: d */
        public final boolean m31199d() {
            return this.f27594c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14083b)) {
                return false;
            }
            C14083b c14083b = (C14083b) obj;
            return this.f27592a == c14083b.f27592a && this.f27593b == c14083b.f27593b && this.f27594c == c14083b.f27594c && this.f27595d == c14083b.f27595d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        public int hashCode() {
            boolean z = this.f27592a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.f27593b;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r22 = this.f27594c;
            int i4 = r22;
            if (r22 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            boolean z2 = this.f27595d;
            return i5 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            return "Tracking(enable=" + this.f27592a + ", permission=" + this.f27593b + ", saveCallLog=" + this.f27594c + ", initialized=" + this.f27595d + ")";
        }

        public /* synthetic */ C14083b(boolean z, boolean z2, boolean z3, boolean z4, int i, id5 id5Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4);
        }
    }

    /* renamed from: o.hv1$c */
    public static final class C14084c extends jgg implements nl7 {

        /* renamed from: a */
        public int f27596a;

        /* renamed from: b */
        public /* synthetic */ Object f27597b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27598c;

        /* renamed from: d */
        public final /* synthetic */ hv1 f27599d;

        /* renamed from: o.hv1$c$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ AtomicBoolean f27600a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AtomicBoolean atomicBoolean) {
                super(1);
                this.f27600a = atomicBoolean;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y3i.f54824a;
            }

            public final void invoke(Throwable th) {
                this.f27600a.set(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14084c(CallEvent callEvent, hv1 hv1Var, n64 n64Var) {
            super(2, n64Var);
            this.f27598c = callEvent;
            this.f27599d = hv1Var;
        }

        /* renamed from: i */
        public static final CallEngagement m31203i(CallEvent callEvent) {
            return hv1.f27581m.m58308q(callEvent);
        }

        /* renamed from: k */
        public static final void m31204k(xk7 xk7Var, Object obj) {
            xk7Var.invoke(obj);
        }

        /* renamed from: l */
        public static final CallEngagement m31205l() {
            return null;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14084c c14084c = new C14084c(this.f27598c, this.f27599d, n64Var);
            c14084c.f27597b = obj;
            return c14084c;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            y3i y3iVar;
            uq8.m51918f();
            if (this.f27596a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            boolean zM58307o = hv1.f27581m.m58307o(this.f27598c);
            if (zM58307o) {
                CallEvent callEventM58305m = hv1.f27581m.m58305m(this.f27598c);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ayh ayhVarH1 = ayh.H1(new iv1(callEventM58305m));
                final a aVar = new a(atomicBoolean);
                CallEngagement callEngagement = (CallEngagement) ayhVarH1.q1(new Consumer() { // from class: o.jv1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        hv1.C14084c.m31204k(aVar, obj2);
                    }
                }).B2(new Supplier() { // from class: o.kv1
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return hv1.C14084c.m31205l();
                    }
                });
                if (callEngagement != null) {
                    hv1 hv1Var = this.f27599d;
                    CallEvent callEvent = this.f27598c;
                    hv1Var.m31176D(callEvent);
                    CallEngagement callEngagementM58314y = hv1.f27581m.m58314y(callEngagement);
                    if (callEngagementM58314y == null) {
                        callEngagementM58314y = callEngagement;
                    }
                    hv1Var.m31179G(callEvent, callEngagementM58314y);
                    y3iVar = y3i.f54824a;
                } else {
                    y3iVar = null;
                }
                if (y3iVar == null) {
                    this.f27599d.m31177E(this.f27598c, atomicBoolean.get());
                }
                uia.m51627b(uia.f48971a, "call-manager", "Resolved call: " + callEngagement, null, null, 12, null);
            } else {
                uia.m51627b(uia.f48971a, "call-manager", "Call uncompleted with the incoming event: " + this.f27598c, null, null, 12, null);
            }
            return ml1.m39301a(zM58307o);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14084c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$d */
    public static final class C14085d extends o64 {

        /* renamed from: a */
        public Object f27601a;

        /* renamed from: b */
        public Object f27602b;

        /* renamed from: c */
        public Object f27603c;

        /* renamed from: d */
        public /* synthetic */ Object f27604d;

        /* renamed from: f */
        public int f27606f;

        public C14085d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f27604d = obj;
            this.f27606f |= Integer.MIN_VALUE;
            return hv1.this.m31184p(this);
        }
    }

    /* renamed from: o.hv1$e */
    public static final class C14086e extends jgg implements nl7 {

        /* renamed from: a */
        public int f27607a;

        /* renamed from: c */
        public final /* synthetic */ gge f27609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14086e(gge ggeVar, n64 n64Var) {
            super(2, n64Var);
            this.f27609c = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return hv1.this.new C14086e(this.f27609c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27607a;
            if (i == 0) {
                wre.m54934b(obj);
                hv1 hv1Var = hv1.this;
                CallEvent callEvent = (CallEvent) this.f27609c.f25106a;
                this.f27607a = 1;
                if (hv1Var.m31192x(callEvent, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14086e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$f */
    public static final class C14087f extends o64 {

        /* renamed from: a */
        public Object f27610a;

        /* renamed from: b */
        public Object f27611b;

        /* renamed from: c */
        public Object f27612c;

        /* renamed from: d */
        public /* synthetic */ Object f27613d;

        /* renamed from: f */
        public int f27615f;

        public C14087f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f27613d = obj;
            this.f27615f |= Integer.MIN_VALUE;
            return hv1.this.m31185q(this);
        }
    }

    /* renamed from: o.hv1$g */
    public static final class C14088g extends jgg implements nl7 {

        /* renamed from: a */
        public int f27616a;

        /* renamed from: b */
        public final /* synthetic */ gge f27617b;

        /* renamed from: c */
        public final /* synthetic */ long f27618c;

        /* renamed from: d */
        public final /* synthetic */ hv1 f27619d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14088g(gge ggeVar, long j, hv1 hv1Var, n64 n64Var) {
            super(2, n64Var);
            this.f27617b = ggeVar;
            this.f27618c = j;
            this.f27619d = hv1Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14088g(this.f27617b, this.f27618c, this.f27619d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            boolean zM58306n = hv1.f27581m.m58306n((WebInitiatedCallEvent) this.f27617b.f25106a, this.f27618c);
            if (zM58306n) {
                uia.m51627b(uia.f48971a, "call-manager", "Invoking call for event: " + this.f27617b.f25106a, null, null, 12, null);
                this.f27619d.f27591e.m19850b((WebInitiatedCallEvent) this.f27617b.f25106a);
                hv1.f27581m.m58301h((WebInitiatedCallEvent) this.f27617b.f25106a);
            } else {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                gge ggeVar = this.f27617b;
                long j = this.f27618c;
                firebaseCrashlytics.setCustomKey(OutcomeConstants.OUTCOME_ID, ((WebInitiatedCallEvent) ggeVar.f25106a).getId());
                firebaseCrashlytics.setCustomKey("phoneNumber", ((WebInitiatedCallEvent) ggeVar.f25106a).getPhoneNumber());
                Long inCallRequestedAt = ((WebInitiatedCallEvent) ggeVar.f25106a).getInCallRequestedAt();
                if (inCallRequestedAt != null) {
                    firebaseCrashlytics.setCustomKey("inCallRequestedAt", inCallRequestedAt.longValue());
                }
                firebaseCrashlytics.setCustomKey("currentTime", j);
                firebaseCrashlytics.recordException(new RuntimeException("CallManager: WebCallingEvent skipped."));
            }
            uia.m51627b(uia.f48971a, "call-manager", "Consumed event: " + this.f27617b.f25106a + " for web initiated call validity: " + zM58306n, null, null, 12, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14088g) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$h */
    public static final class C14089h extends jgg implements nl7 {

        /* renamed from: a */
        public int f27620a;

        /* renamed from: b */
        public final /* synthetic */ hv1 f27621b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14089h(n64 n64Var, hv1 hv1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27621b = hv1Var;
            this.f27622c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14089h(n64Var, this.f27621b, this.f27622c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27620a;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            if (i == 0) {
                wre.m54934b(obj);
                this.f27621b.m31191w(this.f27622c);
                if (!this.f27621b.m31189u(this.f27622c.getContext())) {
                    uia.m51627b(uia.f48971a, "call-manager", "Tracking is disabled for event: " + this.f27622c, null, null, 12, null);
                    l07.f32907a.m36405b("call-manager: call tracking is false", isa.m32684k(vyh.m53620a("contactNumber", this.f27622c.getNumber()), vyh.m53620a("callId", this.f27622c.getCallId())));
                    return y3i.f54824a;
                }
                jg2 jg2Var = hv1.f27577i;
                CallEvent callEvent = this.f27622c;
                this.f27620a = 1;
                if (jg2Var.mo23475l(callEvent, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            uia.m51627b(uia.f48971a, "call-manager", "Queued event: " + this.f27622c, null, null, 12, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14089h) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$i */
    public static final class C14090i extends jgg implements nl7 {

        /* renamed from: a */
        public int f27623a;

        /* renamed from: b */
        public final /* synthetic */ WebInitiatedCallEvent f27624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14090i(n64 n64Var, WebInitiatedCallEvent webInitiatedCallEvent) {
            super(2, n64Var);
            this.f27624b = webInitiatedCallEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14090i(n64Var, this.f27624b);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27623a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    hv1.f27581m.m58302i(this.f27624b);
                    jg2 jg2Var = hv1.f27578j;
                    WebInitiatedCallEvent webInitiatedCallEvent = this.f27624b;
                    this.f27623a = 1;
                    if (jg2Var.mo23475l(webInitiatedCallEvent, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                uia.m51627b(uia.f48971a, "call-manager", "Queued web event: " + this.f27624b, null, null, 12, null);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14090i) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$j */
    public static final class C14091j extends jgg implements nl7 {

        /* renamed from: a */
        public int f27625a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27626b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27627c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14091j(n64 n64Var, av1 av1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27626b = av1Var;
            this.f27627c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14091j(n64Var, this.f27626b, this.f27627c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27625a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                this.f27626b.mo17862a(this.f27627c);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14091j) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$k */
    public static final class C14092k extends o64 {

        /* renamed from: a */
        public Object f27628a;

        /* renamed from: b */
        public Object f27629b;

        /* renamed from: c */
        public /* synthetic */ Object f27630c;

        /* renamed from: e */
        public int f27632e;

        public C14092k(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f27630c = obj;
            this.f27632e |= Integer.MIN_VALUE;
            return hv1.this.m31192x(null, this);
        }
    }

    /* renamed from: o.hv1$l */
    public static final class C14093l extends jgg implements nl7 {

        /* renamed from: a */
        public int f27633a;

        /* renamed from: b */
        public final /* synthetic */ CallEvent f27634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14093l(CallEvent callEvent, n64 n64Var) {
            super(2, n64Var);
            this.f27634b = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14093l(this.f27634b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27633a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            hv1.f27582n.m22787q(this.f27634b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14093l) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$m */
    public static final class C14094m extends jgg implements nl7 {

        /* renamed from: a */
        public int f27635a;

        /* renamed from: b */
        public final /* synthetic */ CallEvent f27636b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14094m(CallEvent callEvent, n64 n64Var) {
            super(2, n64Var);
            this.f27636b = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14094m(this.f27636b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27635a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            hv1.f27581m.m58303j(this.f27636b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14094m) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$n */
    public static final class C14095n extends jgg implements nl7 {

        /* renamed from: a */
        public int f27637a;

        /* renamed from: b */
        public final /* synthetic */ CallEvent f27638b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14095n(CallEvent callEvent, n64 n64Var) {
            super(2, n64Var);
            this.f27638b = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14095n(this.f27638b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return hv1.f27581m.m58300g(this.f27638b);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14095n) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$o */
    public static final class C14096o extends jgg implements nl7 {

        /* renamed from: a */
        public int f27639a;

        public C14096o(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return hv1.this.new C14096o(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27639a;
            if (i == 0) {
                wre.m54934b(obj);
                uia.m51627b(uia.f48971a, "call-manager", "consume() coroutine STARTED", null, null, 12, null);
                hv1 hv1Var = hv1.this;
                this.f27639a = 1;
                if (hv1Var.m31184p(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14096o) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$p */
    public static final class C14097p extends jgg implements nl7 {

        /* renamed from: a */
        public int f27641a;

        public C14097p(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return hv1.this.new C14097p(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27641a;
            if (i == 0) {
                wre.m54934b(obj);
                uia.m51627b(uia.f48971a, "call-manager", "consumeWeb coroutine STARTED", null, null, 12, null);
                hv1 hv1Var = hv1.this;
                this.f27641a = 1;
                if (hv1Var.m31185q(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14097p) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$q */
    public static final class C14098q extends jgg implements nl7 {

        /* renamed from: a */
        public int f27643a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27644b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27645c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14098q(n64 n64Var, av1 av1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27644b = av1Var;
            this.f27645c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14098q(n64Var, this.f27644b, this.f27645c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27643a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                ((bk6) this.f27644b).mo19286d(this.f27645c);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14098q) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$r */
    public static final class C14099r extends jgg implements nl7 {

        /* renamed from: a */
        public int f27646a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27647b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27648c;

        /* renamed from: d */
        public final /* synthetic */ boolean f27649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14099r(n64 n64Var, av1 av1Var, CallEvent callEvent, boolean z) {
            super(2, n64Var);
            this.f27647b = av1Var;
            this.f27648c = callEvent;
            this.f27649d = z;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14099r(n64Var, this.f27647b, this.f27648c, this.f27649d);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27646a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                ((bk6) this.f27647b).mo19285c(this.f27648c, this.f27649d);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14099r) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$s */
    public static final class C14100s extends jgg implements nl7 {

        /* renamed from: a */
        public int f27650a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27651b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14100s(n64 n64Var, av1 av1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27651b = av1Var;
            this.f27652c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14100s(n64Var, this.f27651b, this.f27652c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27650a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                this.f27651b.mo17863f(this.f27652c);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14100s) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$t */
    public static final class C14101t extends jgg implements nl7 {

        /* renamed from: a */
        public int f27653a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27654b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27655c;

        /* renamed from: d */
        public final /* synthetic */ CallEngagement f27656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14101t(n64 n64Var, av1 av1Var, CallEvent callEvent, CallEngagement callEngagement) {
            super(2, n64Var);
            this.f27654b = av1Var;
            this.f27655c = callEvent;
            this.f27656d = callEngagement;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14101t(n64Var, this.f27654b, this.f27655c, this.f27656d);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27653a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                ((dfd) this.f27654b).mo22988e(this.f27655c, this.f27656d);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14101t) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$u */
    public static final class C14102u extends jgg implements nl7 {

        /* renamed from: a */
        public int f27657a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27658b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14102u(n64 n64Var, av1 av1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27658b = av1Var;
            this.f27659c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14102u(n64Var, this.f27658b, this.f27659c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27657a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                ((bk6) this.f27658b).mo19287g(this.f27659c);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14102u) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.hv1$v */
    public static final class C14103v extends jgg implements nl7 {

        /* renamed from: a */
        public int f27660a;

        /* renamed from: b */
        public final /* synthetic */ av1 f27661b;

        /* renamed from: c */
        public final /* synthetic */ CallEvent f27662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14103v(n64 n64Var, av1 av1Var, CallEvent callEvent) {
            super(2, n64Var);
            this.f27661b = av1Var;
            this.f27662c = callEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14103v(n64Var, this.f27661b, this.f27662c);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f27660a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                ((bk6) this.f27661b).mo19288h(this.f27662c);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                uia.m51628d(uia.f48971a, "coroutine", "Execution failed", th, null, 8, null);
                p74.f39487a.m43076d(th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14103v) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    static {
        wl1 wl1Var = wl1.DROP_OLDEST;
        f27577i = tg2.m49824b(5000, wl1Var, null, 4, null);
        f27578j = tg2.m49824b(5000, wl1Var, null, 4, null);
        f27579k = p74.f39487a.m43082j();
        ArrayList arrayList = new ArrayList();
        f27580l = arrayList;
        f27581m = yu1.f56041h.m58316a();
        f27582n = dc3.f19548a.m22797a();
        dkf dkfVarM23376a = dkf.f20145a.m23376a();
        f27583o = dkfVarM23376a;
        f27584p = dkfVarM23376a.m23373e(sif.CALL_FLOW_MAX_WAIT_TIME);
        arrayList.add(zm.f57387b.m59602a());
        arrayList.add(im3.f28834b.m32317a());
        arrayList.add(zu1.f57710b.m59939a());
        f27576h.m31174B();
    }

    /* renamed from: A */
    public final void m31173A(Context context, Prefs prefs) {
        sq8.m48649h(context, "context");
        m31190v(context, prefs);
    }

    /* renamed from: B */
    public final void m31174B() {
        h84 h84VarM31188t = m31188t();
        p69 p69Var = f27585q;
        if (!(p69Var != null && p69Var.mo22428a())) {
            f27585q = rm1.m46952d(h84VarM31188t, null, null, new C14096o(null), 3, null);
        }
        p69 p69Var2 = f27586r;
        if (p69Var2 != null && p69Var2.mo22428a()) {
            return;
        }
        f27586r = rm1.m46952d(h84VarM31188t, null, null, new C14097p(null), 3, null);
    }

    /* renamed from: C */
    public final void m31175C(Context context) {
        sq8.m48649h(context, "context");
        this.f27587a = new C14083b(false, false, false, false, 15, null);
        this.f27588b.set(this.f27587a.m31196a());
        m31182J(context);
        p69 p69Var = f27585q;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        f27585q = null;
        p69 p69Var2 = f27586r;
        if (p69Var2 != null) {
            p69.C15966a.m42999a(p69Var2, null, 1, null);
        }
        f27586r = null;
        i84.m31710d(f27579k, null, 1, null);
        f27579k = p74.f39487a.m43082j();
        m31193y("Tracking stopped on sign out.");
    }

    /* renamed from: D */
    public final void m31176D(CallEvent callEvent) {
        for (av1 av1Var : f27580l) {
            if (av1Var instanceof bk6) {
                p74 p74Var = p74.f39487a;
                rm1.m46952d(f27579k, null, null, new C14098q(null, av1Var, callEvent), 3, null);
            }
        }
    }

    /* renamed from: E */
    public final void m31177E(CallEvent callEvent, boolean z) {
        for (av1 av1Var : f27580l) {
            if (av1Var instanceof bk6) {
                p74 p74Var = p74.f39487a;
                rm1.m46952d(f27579k, null, null, new C14099r(null, av1Var, callEvent, z), 3, null);
            }
        }
    }

    /* renamed from: F */
    public final void m31178F(CallEvent callEvent) {
        for (av1 av1Var : f27580l) {
            p74 p74Var = p74.f39487a;
            rm1.m46952d(f27579k, null, null, new C14100s(null, av1Var, callEvent), 3, null);
        }
    }

    /* renamed from: G */
    public final void m31179G(CallEvent callEvent, CallEngagement callEngagement) {
        for (av1 av1Var : f27580l) {
            if (av1Var instanceof dfd) {
                p74 p74Var = p74.f39487a;
                rm1.m46952d(f27579k, null, null, new C14101t(null, av1Var, callEvent, callEngagement), 3, null);
            }
        }
    }

    /* renamed from: H */
    public final void m31180H(CallEvent callEvent) {
        for (av1 av1Var : f27580l) {
            if (av1Var instanceof bk6) {
                p74 p74Var = p74.f39487a;
                rm1.m46952d(f27579k, null, null, new C14102u(null, av1Var, callEvent), 3, null);
            }
        }
    }

    /* renamed from: I */
    public final void m31181I(CallEvent callEvent) {
        for (av1 av1Var : f27580l) {
            if (av1Var instanceof bk6) {
                p74 p74Var = p74.f39487a;
                rm1.m46952d(f27579k, null, null, new C14103v(null, av1Var, callEvent), 3, null);
            }
        }
    }

    /* renamed from: J */
    public final void m31182J(Context context) {
        y3i y3iVar;
        if (!this.f27589c.get()) {
            uia.m51627b(uia.f48971a, "call-manager", "Content observer is not registered. not unregistering", null, null, 12, null);
            return;
        }
        l0f l0fVar = (l0f) this.f27590d.get();
        if (l0fVar != null) {
            context.getContentResolver().unregisterContentObserver(l0fVar);
            uia.m51627b(uia.f48971a, "call-manager", "unregistered content observer", null, null, 12, null);
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            uia.m51627b(uia.f48971a, "call-manager", "Content observer instance is null. not unregistering", null, null, 12, null);
        }
        this.f27589c.set(false);
    }

    @Override // p001o.o3d
    /* renamed from: a */
    public void mo19749a(Context context) {
        sq8.m48649h(context, "context");
        uia.m51627b(uia.f48971a, "call-manager", "Permission change triggered", null, null, 12, null);
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        if (prefsM127c != null) {
            Boolean boolValueOf = Boolean.valueOf(prefsM127c.m3236X());
            if (!boolValueOf.booleanValue()) {
                boolValueOf = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean zM48644c = sq8.m48644c(boolValueOf, bool);
            n3d n3dVar = n3d.f36317a;
            this.f27587a = new C14083b(zM48644c, n3dVar.m40043a(context), sq8.m48644c(boolValueOf, bool), false, 8, null);
            this.f27588b.set(this.f27587a.m31196a());
            if (this.f27588b.get() && n3dVar.m40043a(context)) {
                m31194z(context);
            } else {
                m31182J(context);
            }
        }
        m31193y("Tracking values on permission change.");
    }

    /* renamed from: o */
    public final Object m31183o(CallEvent callEvent, n64 n64Var) {
        return pm1.m43867g(eu5.m25611b(), new C14084c(callEvent, this, null), n64Var);
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0123 -> B:41:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0130 -> B:41:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x015e -> B:15:0x003e). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31184p(n64 n64Var) {
        C14085d c14085d;
        hv1 hv1Var;
        hv1 hv1Var2;
        gge ggeVar;
        yb3 yb3Var;
        hv1 hv1Var3;
        CancellationException cancellationException;
        hv1 hv1Var4;
        gge ggeVar2;
        CallEvent callEvent;
        long j;
        C14086e c14086e;
        if (n64Var instanceof C14085d) {
            c14085d = (C14085d) n64Var;
            int i = c14085d.f27606f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14085d.f27606f = i - Integer.MIN_VALUE;
                hv1Var = this;
            } else {
                hv1Var = this;
                c14085d = hv1Var.new C14085d(n64Var);
            }
        }
        Object objMo23476m = c14085d.f27604d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14085d.f27606f;
        int i3 = 4;
        if (i2 == 0) {
            wre.m54934b(objMo23476m);
            hv1Var2 = hv1Var;
        } else if (i2 == 1) {
            ggeVar = (gge) c14085d.f27603c;
            ggeVar2 = (gge) c14085d.f27602b;
            hv1Var4 = (hv1) c14085d.f27601a;
            try {
                wre.m54934b(objMo23476m);
            } catch (omh e) {
                e = e;
                ggeVar = ggeVar2;
                hv1Var2 = hv1Var4;
                uia.m51627b(uia.f48971a, "call-manager", "Timeout for " + ggeVar.f25106a, e, null, 8, null);
                l07 l07Var = l07.f32907a;
                callEvent = (CallEvent) ggeVar.f25106a;
                if (callEvent == null) {
                    l07Var.m36404a("CallManager: Processing timeout", e, hsa.m31056f(vyh.m53620a("callId", callEvent.getCallId())));
                    i3 = 4;
                } else {
                    l07Var.m36404a("CallManager: Processing timeout", e, hsa.m31056f(vyh.m53620a("callId", null)));
                    i3 = 4;
                }
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (CancellationException e2) {
                cancellationException = e2;
                hv1Var2 = hv1Var4;
                if (z69.m58849n(c14085d.getContext())) {
                    throw cancellationException;
                }
                uia.m51627b(uia.f48971a, "call-manager", "consume() inner cancellation, continue", cancellationException, null, 8, null);
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (yb3 e3) {
                yb3Var = e3;
                hv1Var3 = hv1Var4;
                uia.m51628d(uia.f48971a, "call-manager", "queue channel closed", yb3Var, null, 8, null);
                c14085d.f27601a = hv1Var3;
                c14085d.f27602b = null;
                c14085d.f27603c = null;
                c14085d.f27606f = 3;
                if (nk5.m40720b(1000L, c14085d) == objM51918f) {
                    return objM51918f;
                }
                hv1Var2 = hv1Var3;
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (Throwable th) {
                th = th;
                ggeVar = ggeVar2;
                hv1Var2 = hv1Var4;
                uia.m51628d(uia.f48971a, "call-manager", "Unexpected error", th, null, 8, null);
                l07 l07Var2 = l07.f32907a;
                CallEvent callEvent2 = (CallEvent) ggeVar.f25106a;
                l07Var2.m36404a("CallManager: Processing failure", th, hsa.m31056f(vyh.m53620a("callId", callEvent2 == null ? callEvent2.getCallId() : null)));
                c14085d.f27601a = hv1Var2;
                c14085d.f27602b = null;
                c14085d.f27603c = null;
                c14085d.f27606f = i3;
                if (nk5.m40720b(2000L, c14085d) == objM51918f) {
                    return objM51918f;
                }
                if (z69.m58849n(c14085d.getContext())) {
                }
            }
            ggeVar.f25106a = objMo23476m;
            j = f27584p;
            c14086e = hv1Var4.new C14086e(ggeVar2, null);
            c14085d.f27601a = hv1Var4;
            c14085d.f27602b = ggeVar2;
            c14085d.f27603c = null;
            c14085d.f27606f = 2;
            if (rmh.m46984c(j, c14086e, c14085d) != objM51918f) {
                return objM51918f;
            }
            gge ggeVar3 = ggeVar2;
            hv1Var2 = hv1Var4;
            uia.m51627b(uia.f48971a, "call-manager", "Processed " + ggeVar3.f25106a, null, null, 12, null);
        } else if (i2 == 2) {
            ggeVar = (gge) c14085d.f27602b;
            hv1Var2 = (hv1) c14085d.f27601a;
            try {
                wre.m54934b(objMo23476m);
                uia.m51627b(uia.f48971a, "call-manager", "Processed " + ggeVar.f25106a, null, null, 12, null);
            } catch (omh e4) {
                e = e4;
                uia.m51627b(uia.f48971a, "call-manager", "Timeout for " + ggeVar.f25106a, e, null, 8, null);
                l07 l07Var3 = l07.f32907a;
                callEvent = (CallEvent) ggeVar.f25106a;
                if (callEvent == null) {
                }
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (CancellationException e5) {
                cancellationException = e5;
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (yb3 e6) {
                yb3Var = e6;
                hv1Var3 = hv1Var2;
                uia.m51628d(uia.f48971a, "call-manager", "queue channel closed", yb3Var, null, 8, null);
                c14085d.f27601a = hv1Var3;
                c14085d.f27602b = null;
                c14085d.f27603c = null;
                c14085d.f27606f = 3;
                if (nk5.m40720b(1000L, c14085d) == objM51918f) {
                }
                hv1Var2 = hv1Var3;
                if (z69.m58849n(c14085d.getContext())) {
                }
            } catch (Throwable th2) {
                th = th2;
                uia.m51628d(uia.f48971a, "call-manager", "Unexpected error", th, null, 8, null);
                l07 l07Var22 = l07.f32907a;
                CallEvent callEvent22 = (CallEvent) ggeVar.f25106a;
                l07Var22.m36404a("CallManager: Processing failure", th, hsa.m31056f(vyh.m53620a("callId", callEvent22 == null ? callEvent22.getCallId() : null)));
                c14085d.f27601a = hv1Var2;
                c14085d.f27602b = null;
                c14085d.f27603c = null;
                c14085d.f27606f = i3;
                if (nk5.m40720b(2000L, c14085d) == objM51918f) {
                }
                if (z69.m58849n(c14085d.getContext())) {
                }
            }
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv1Var3 = (hv1) c14085d.f27601a;
            wre.m54934b(objMo23476m);
            hv1Var2 = hv1Var3;
        }
        if (z69.m58849n(c14085d.getContext())) {
            return y3i.f54824a;
        }
        ggeVar = new gge();
        jg2 jg2Var = f27577i;
        c14085d.f27601a = hv1Var2;
        c14085d.f27602b = ggeVar;
        c14085d.f27603c = ggeVar;
        c14085d.f27606f = 1;
        objMo23476m = jg2Var.mo23476m(c14085d);
        if (objMo23476m == objM51918f) {
            return objM51918f;
        }
        hv1Var4 = hv1Var2;
        ggeVar2 = ggeVar;
        ggeVar.f25106a = objMo23476m;
        j = f27584p;
        c14086e = hv1Var4.new C14086e(ggeVar2, null);
        c14085d.f27601a = hv1Var4;
        c14085d.f27602b = ggeVar2;
        c14085d.f27603c = null;
        c14085d.f27606f = 2;
        if (rmh.m46984c(j, c14086e, c14085d) != objM51918f) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:31|(2:94|32)|92|50|51|98|52|53|54|(1:56)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:31|94|32|92|50|51|98|52|53|54|(1:56)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0104, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ea -> B:43:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0142 -> B:43:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x014f -> B:43:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x017e -> B:16:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01cc -> B:43:0x009e). Please report as a decompilation issue!!! */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31185q(n64 n64Var) {
        C14087f c14087f;
        hv1 hv1Var;
        hv1 hv1Var2;
        gge ggeVar;
        hv1 hv1Var3;
        gge ggeVar2;
        yb3 yb3Var;
        hv1 hv1Var4;
        CancellationException cancellationException;
        long jM23373e;
        C14088g c14088g;
        if (n64Var instanceof C14087f) {
            c14087f = (C14087f) n64Var;
            int i = c14087f.f27615f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14087f.f27615f = i - Integer.MIN_VALUE;
                hv1Var = this;
            } else {
                hv1Var = this;
                c14087f = hv1Var.new C14087f(n64Var);
            }
        }
        Object objMo23476m = c14087f.f27613d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14087f.f27615f;
        if (i2 == 0) {
            wre.m54934b(objMo23476m);
            hv1Var2 = hv1Var;
        } else if (i2 == 1) {
            ggeVar = (gge) c14087f.f27612c;
            ggeVar2 = (gge) c14087f.f27611b;
            hv1Var3 = (hv1) c14087f.f27610a;
            try {
                try {
                    wre.m54934b(objMo23476m);
                } catch (omh e) {
                    e = e;
                    ggeVar = ggeVar2;
                    hv1Var2 = hv1Var3;
                    uia.m51627b(uia.f48971a, "call-manager", "Timeout processing web event " + ggeVar.f25106a, e, null, 8, null);
                    l07 l07Var = l07.f32907a;
                    WebInitiatedCallEvent webInitiatedCallEvent = (WebInitiatedCallEvent) ggeVar.f25106a;
                    l07Var.m36404a("CallManager: Web event timeout", e, hsa.m31056f(vyh.m53620a("eventId", webInitiatedCallEvent != null ? webInitiatedCallEvent.getId() : null)));
                    c14087f.f27610a = hv1Var2;
                    c14087f.f27611b = null;
                    c14087f.f27612c = null;
                    c14087f.f27615f = 3;
                    if (nk5.m40720b(1000L, c14087f) == objM51918f) {
                        return objM51918f;
                    }
                    if (!z69.m58849n(c14087f.getContext())) {
                    }
                } catch (Throwable th) {
                    th = th;
                    ggeVar = ggeVar2;
                    hv1Var2 = hv1Var3;
                    uia.m51628d(uia.f48971a, "call-manager", "Unexpected web consumer error", th, null, 8, null);
                    l07 l07Var2 = l07.f32907a;
                    WebInitiatedCallEvent webInitiatedCallEvent2 = (WebInitiatedCallEvent) ggeVar.f25106a;
                    l07Var2.m36404a("CallManager: Web processing failure", th, hsa.m31056f(vyh.m53620a("eventId", webInitiatedCallEvent2 != null ? webInitiatedCallEvent2.getId() : null)));
                    c14087f.f27610a = hv1Var2;
                    c14087f.f27611b = null;
                    c14087f.f27612c = null;
                    c14087f.f27615f = 5;
                    if (nk5.m40720b(2000L, c14087f) == objM51918f) {
                        return objM51918f;
                    }
                    if (!z69.m58849n(c14087f.getContext())) {
                    }
                }
            } catch (CancellationException e2) {
                cancellationException = e2;
                hv1Var2 = hv1Var3;
                if (!z69.m58849n(c14087f.getContext())) {
                    throw cancellationException;
                }
                uia.m51627b(uia.f48971a, "call-manager", "Web consumer inner cancellation", cancellationException, null, 8, null);
                if (!z69.m58849n(c14087f.getContext())) {
                }
            } catch (yb3 e3) {
                yb3Var = e3;
                hv1Var4 = hv1Var3;
                uia.m51628d(uia.f48971a, "call-manager", "Web queue channel closed", yb3Var, null, 8, null);
                c14087f.f27610a = hv1Var4;
                c14087f.f27611b = null;
                c14087f.f27612c = null;
                c14087f.f27615f = 4;
                if (nk5.m40720b(1000L, c14087f) == objM51918f) {
                    return objM51918f;
                }
                hv1Var2 = hv1Var4;
                if (!z69.m58849n(c14087f.getContext())) {
                }
            }
            ggeVar.f25106a = objMo23476m;
            long jCurrentTimeMillis = System.currentTimeMillis();
            jM23373e = f27583o.m23373e(sif.CALL_FLOW_MAX_WAIT_TIME);
            ggeVar = ggeVar2;
            hv1 hv1Var5 = hv1Var3;
            c14088g = new C14088g(ggeVar, jCurrentTimeMillis, hv1Var5, null);
            hv1Var2 = hv1Var5;
            c14087f.f27610a = hv1Var2;
            c14087f.f27611b = ggeVar;
            c14087f.f27612c = null;
            c14087f.f27615f = 2;
            if (rmh.m46984c(jM23373e, c14088g, c14087f) == objM51918f) {
                return objM51918f;
            }
        } else if (i2 == 2) {
            ggeVar = (gge) c14087f.f27611b;
            hv1Var2 = (hv1) c14087f.f27610a;
            try {
                wre.m54934b(objMo23476m);
            } catch (omh e4) {
                e = e4;
                uia.m51627b(uia.f48971a, "call-manager", "Timeout processing web event " + ggeVar.f25106a, e, null, 8, null);
                l07 l07Var3 = l07.f32907a;
                WebInitiatedCallEvent webInitiatedCallEvent3 = (WebInitiatedCallEvent) ggeVar.f25106a;
                l07Var3.m36404a("CallManager: Web event timeout", e, hsa.m31056f(vyh.m53620a("eventId", webInitiatedCallEvent3 != null ? webInitiatedCallEvent3.getId() : null)));
                c14087f.f27610a = hv1Var2;
                c14087f.f27611b = null;
                c14087f.f27612c = null;
                c14087f.f27615f = 3;
                if (nk5.m40720b(1000L, c14087f) == objM51918f) {
                }
                if (!z69.m58849n(c14087f.getContext())) {
                }
            } catch (CancellationException e5) {
                e = e5;
                cancellationException = e;
                if (!z69.m58849n(c14087f.getContext())) {
                }
            } catch (yb3 e6) {
                e = e6;
                yb3Var = e;
                hv1Var4 = hv1Var2;
                uia.m51628d(uia.f48971a, "call-manager", "Web queue channel closed", yb3Var, null, 8, null);
                c14087f.f27610a = hv1Var4;
                c14087f.f27611b = null;
                c14087f.f27612c = null;
                c14087f.f27615f = 4;
                if (nk5.m40720b(1000L, c14087f) == objM51918f) {
                }
                hv1Var2 = hv1Var4;
                if (!z69.m58849n(c14087f.getContext())) {
                }
            } catch (Throwable th2) {
                th = th2;
                uia.m51628d(uia.f48971a, "call-manager", "Unexpected web consumer error", th, null, 8, null);
                l07 l07Var22 = l07.f32907a;
                WebInitiatedCallEvent webInitiatedCallEvent22 = (WebInitiatedCallEvent) ggeVar.f25106a;
                l07Var22.m36404a("CallManager: Web processing failure", th, hsa.m31056f(vyh.m53620a("eventId", webInitiatedCallEvent22 != null ? webInitiatedCallEvent22.getId() : null)));
                c14087f.f27610a = hv1Var2;
                c14087f.f27611b = null;
                c14087f.f27612c = null;
                c14087f.f27615f = 5;
                if (nk5.m40720b(2000L, c14087f) == objM51918f) {
                }
                if (!z69.m58849n(c14087f.getContext())) {
                }
            }
        } else if (i2 == 3) {
            hv1 hv1Var6 = (hv1) c14087f.f27610a;
            wre.m54934b(objMo23476m);
            hv1Var2 = hv1Var6;
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv1Var4 = (hv1) c14087f.f27610a;
            wre.m54934b(objMo23476m);
            hv1Var2 = hv1Var4;
        }
        if (!z69.m58849n(c14087f.getContext())) {
            ggeVar = new gge();
            jg2 jg2Var = f27578j;
            c14087f.f27610a = hv1Var2;
            c14087f.f27611b = ggeVar;
            c14087f.f27612c = ggeVar;
            c14087f.f27615f = 1;
            objMo23476m = jg2Var.mo23476m(c14087f);
            if (objMo23476m == objM51918f) {
                return objM51918f;
            }
            hv1Var3 = hv1Var2;
            ggeVar2 = ggeVar;
            ggeVar.f25106a = objMo23476m;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            jM23373e = f27583o.m23373e(sif.CALL_FLOW_MAX_WAIT_TIME);
            ggeVar = ggeVar2;
            hv1 hv1Var52 = hv1Var3;
            c14088g = new C14088g(ggeVar, jCurrentTimeMillis2, hv1Var52, null);
            hv1Var2 = hv1Var52;
            c14087f.f27610a = hv1Var2;
            c14087f.f27611b = ggeVar;
            c14087f.f27612c = null;
            c14087f.f27615f = 2;
            if (rmh.m46984c(jM23373e, c14088g, c14087f) == objM51918f) {
            }
            if (!z69.m58849n(c14087f.getContext())) {
                return y3i.f54824a;
            }
        }
    }

    /* renamed from: r */
    public final void m31186r(CallEvent callEvent) {
        sq8.m48649h(callEvent, "callEvent");
        p74 p74Var = p74.f39487a;
        rm1.m46952d(f27579k, null, null, new C14089h(null, this, callEvent), 3, null);
    }

    /* renamed from: s */
    public final void m31187s(WebInitiatedCallEvent webInitiatedCallEvent) {
        sq8.m48649h(webInitiatedCallEvent, "webInitiatedCallEvent");
        p74 p74Var = p74.f39487a;
        rm1.m46952d(f27579k, null, null, new C14090i(null, webInitiatedCallEvent), 3, null);
    }

    /* renamed from: t */
    public final synchronized h84 m31188t() {
        if (!i84.m31713g(f27579k)) {
            p69 p69Var = f27585q;
            if (p69Var != null) {
                p69.C15966a.m42999a(p69Var, null, 1, null);
            }
            f27585q = null;
            p69 p69Var2 = f27586r;
            if (p69Var2 != null) {
                p69.C15966a.m42999a(p69Var2, null, 1, null);
            }
            f27586r = null;
            f27579k = p74.f39487a.m43082j();
        }
        return f27579k;
    }

    /* renamed from: u */
    public final boolean m31189u(Context context) {
        Context applicationContext;
        if (context != null && (applicationContext = context.getApplicationContext()) != null && !this.f27587a.m31197b()) {
            m31190v(applicationContext, SuperfoneApplication.f225c.m127c());
        }
        return this.f27587a.m31196a();
    }

    /* renamed from: v */
    public final void m31190v(Context context, Prefs prefs) {
        sq8.m48649h(context, "context");
        uia uiaVar = uia.f48971a;
        uia.m51627b(uiaVar, "call-manager", "Loading call tracking manager.", null, null, 12, null);
        y3i y3iVar = null;
        Boolean boolValueOf = prefs != null ? Boolean.valueOf(prefs.m3236X()) : null;
        n3d n3dVar = n3d.f36317a;
        boolean zM40043a = n3dVar.m40043a(context);
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            this.f27587a = new C14083b(zBooleanValue, zM40043a, zBooleanValue, false, 8, null);
            y3iVar = y3i.f54824a;
        }
        if (y3iVar == null) {
            this.f27587a = new C14083b(false, false, false, false, 14, null);
        }
        this.f27588b.set(this.f27587a.m31196a());
        if (this.f27588b.get() && n3dVar.m40043a(context)) {
            uia.m51627b(uiaVar, "call-manager", "Call Tracking is enabled.", null, null, 12, null);
            m31194z(context);
        } else {
            uia.m51627b(uiaVar, "call-manager", "Call Tracking is disabled.", null, null, 12, null);
        }
        m31193y("Tracking flags during initialization startup/profile change.");
        m31174B();
    }

    /* renamed from: w */
    public final void m31191w(CallEvent callEvent) {
        for (av1 av1Var : f27580l) {
            p74 p74Var = p74.f39487a;
            rm1.m46952d(f27579k, null, null, new C14091j(null, av1Var, callEvent), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31192x(CallEvent callEvent, n64 n64Var) {
        C14092k c14092k;
        hv1 hv1Var;
        hv1 hv1Var2;
        CallEvent callEvent2 = callEvent;
        if (n64Var instanceof C14092k) {
            c14092k = (C14092k) n64Var;
            int i = c14092k.f27632e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14092k.f27632e = i - Integer.MIN_VALUE;
            } else {
                c14092k = new C14092k(n64Var);
            }
        }
        Object objM31183o = c14092k.f27630c;
        Object objM51918f = uq8.m51918f();
        int i2 = c14092k.f27632e;
        if (i2 == 0) {
            wre.m54934b(objM31183o);
            if (f27582n.m22791u(callEvent2)) {
                uia.m51627b(uia.f48971a, "call-manager", "Routed to cloud call manager", null, null, 12, null);
                z74 z74VarM25611b = eu5.m25611b();
                C14093l c14093l = new C14093l(callEvent2, null);
                c14092k.f27632e = 1;
                if (pm1.m43867g(z74VarM25611b, c14093l, c14092k) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            if (f27581m.m58313x(callEvent2)) {
                m31181I(callEvent);
                l07.f32907a.m36405b("CallManager: stale event", isa.m32684k(vyh.m53620a("contactNumber", callEvent.getNumber()), vyh.m53620a("callId", callEvent.getCallId())));
                return y3i.f54824a;
            }
            z74 z74VarM25611b2 = eu5.m25611b();
            C14094m c14094m = new C14094m(callEvent2, null);
            c14092k.f27628a = this;
            c14092k.f27629b = callEvent2;
            c14092k.f27632e = 2;
            if (pm1.m43867g(z74VarM25611b2, c14094m, c14092k) == objM51918f) {
                return objM51918f;
            }
            hv1Var = this;
            c14092k.f27628a = hv1Var;
            c14092k.f27629b = callEvent2;
            c14092k.f27632e = 3;
            objM31183o = hv1Var.m31183o(callEvent2, c14092k);
            if (objM31183o == objM51918f) {
            }
        } else {
            if (i2 == 1) {
                wre.m54934b(objM31183o);
                return y3i.f54824a;
            }
            if (i2 == 2) {
                callEvent2 = (CallEvent) c14092k.f27629b;
                hv1Var = (hv1) c14092k.f27628a;
                wre.m54934b(objM31183o);
                c14092k.f27628a = hv1Var;
                c14092k.f27629b = callEvent2;
                c14092k.f27632e = 3;
                objM31183o = hv1Var.m31183o(callEvent2, c14092k);
                if (objM31183o == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    callEvent2 = (CallEvent) c14092k.f27629b;
                    hv1Var2 = (hv1) c14092k.f27628a;
                    wre.m54934b(objM31183o);
                    callEvent2.setInFlightCall((CallEngagement) objM31183o);
                    hv1Var2.m31178F(callEvent2);
                    hv1Var2.m31180H(callEvent2);
                    return y3i.f54824a;
                }
                callEvent2 = (CallEvent) c14092k.f27629b;
                hv1Var = (hv1) c14092k.f27628a;
                wre.m54934b(objM31183o);
            }
        }
        if (((Boolean) objM31183o).booleanValue()) {
            if (!sq8.m48644c(callEvent2.getSource(), "CALL_LOG_SYNC")) {
                hv1Var.m31178F(callEvent2);
            }
            return y3i.f54824a;
        }
        z74 z74VarM25611b3 = eu5.m25611b();
        C14095n c14095n = new C14095n(callEvent2, null);
        c14092k.f27628a = hv1Var;
        c14092k.f27629b = callEvent2;
        c14092k.f27632e = 4;
        objM31183o = pm1.m43867g(z74VarM25611b3, c14095n, c14092k);
        if (objM31183o == objM51918f) {
            return objM51918f;
        }
        hv1Var2 = hv1Var;
        callEvent2.setInFlightCall((CallEngagement) objM31183o);
        hv1Var2.m31178F(callEvent2);
        hv1Var2.m31180H(callEvent2);
        return y3i.f54824a;
    }

    /* renamed from: y */
    public final void m31193y(String str) {
        uia.m51627b(uia.f48971a, "call-manager", "invoking firebase with values " + this.f27587a, null, null, 12, null);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setCustomKey("Tracking_Enable", this.f27587a.m31196a());
        firebaseCrashlytics.setCustomKey("Tracking_saveCallLogPref", this.f27587a.m31199d());
        firebaseCrashlytics.setCustomKey("Tracking_saveCallLogPermission", this.f27587a.m31198c());
        if (str == null) {
            str = "Business call log tracking is " + this.f27587a.m31196a() + ".";
        }
        firebaseCrashlytics.recordException(new RuntimeException("CallLogEvent: " + str));
    }

    /* renamed from: z */
    public final void m31194z(Context context) {
        y3i y3iVar;
        if (this.f27589c.get()) {
            uia.m51627b(uia.f48971a, "call-manager", "Content observer already registered. not registering", null, null, 12, null);
            return;
        }
        this.f27590d.getAndSet(new l0f(new Handler(Looper.getMainLooper()), context));
        l0f l0fVar = (l0f) this.f27590d.get();
        if (l0fVar != null) {
            context.getContentResolver().registerContentObserver(CallLog.Calls.CONTENT_URI, true, l0fVar);
            uia.m51627b(uia.f48971a, "call-manager", "registered content observer", null, null, 12, null);
            this.f27589c.set(true);
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            uia.m51627b(uia.f48971a, "call-manager", "Content observer instance is null. not registering", null, null, 12, null);
        }
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(Context context, PreferenceChangeEvent preferenceChangeEvent) {
        sq8.m48649h(context, "context");
        if (preferenceChangeEvent == null || preferenceChangeEvent.getEventType() != PreferenceChangeEvent.EventType.PREF_SAVE_BUSINESS_CALL) {
            return;
        }
        this.f27587a = mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue()) ? new C14083b(true, n3d.f36317a.m40043a(context), true, false, 8, null) : new C14083b(false, false, false, false, 14, null);
        this.f27588b.set(this.f27587a.m31196a());
        if (this.f27587a.m31196a() && n3d.f36317a.m40043a(context)) {
            uia.m51627b(uia.f48971a, "call-manager", "Call Tracking is enabled.", null, null, 12, null);
            m31194z(context);
        } else {
            uia.m51627b(uia.f48971a, "call-manager", "Call Tracking is disabled.", null, null, 12, null);
            m31182J(context);
        }
        m31193y("Tracking change on preference.");
    }
}
