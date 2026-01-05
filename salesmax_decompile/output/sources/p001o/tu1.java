package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.AutoCallConfig;
import ai.salesmax.model.CallEngagement;
import ai.salesmax.model.CallEvent;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.Result;
import ai.salesmax.model.SubmittedFormValues;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.UploadedFileSummary;
import ai.salesmax.services.model.ActiveCall;
import ai.salesmax.util.C1670a;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.net.Uri;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import p001o.med;

/* loaded from: classes.dex */
public final class tu1 {

    /* renamed from: e */
    public static final C17209b f47778e = new C17209b(null);

    /* renamed from: f */
    public static final int f47779f = 8;

    /* renamed from: g */
    public static final tu1 f47780g;

    /* renamed from: h */
    public static final h84 f47781h;

    /* renamed from: i */
    public static final jg2 f47782i;

    /* renamed from: j */
    public static final jg2 f47783j;

    /* renamed from: k */
    public static final jg2 f47784k;

    /* renamed from: l */
    public static final jg2 f47785l;

    /* renamed from: m */
    public static final jg2 f47786m;

    /* renamed from: n */
    public static ConcurrentHashMap f47787n;

    /* renamed from: o */
    public static final uk7 f47788o;

    /* renamed from: p */
    public static final Object f47789p;

    /* renamed from: a */
    public final bt9 f47790a = bt9.f16783b.m19757a();

    /* renamed from: b */
    public ConcurrentHashMap f47791b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Set f47792c;

    /* renamed from: d */
    public final Prefs f47793d;

    /* renamed from: o.tu1$a */
    public static final class C17208a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C17208a f47794a = new C17208a();

        public C17208a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ke1 invoke() {
            return ke1.f32003i.m35525a();
        }
    }

    public static final class a0 implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ q7c f47796b;

        public a0(q7c q7cVar) {
            this.f47796b = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Optional optional) {
            CallEngagement callEngagement;
            sq8.m48649h(optional, "next");
            StringBuilder sb = new StringBuilder();
            sb.append("completing the flow: ");
            sb.append(optional);
            y3i y3iVar = null;
            if (!optional.isPresent()) {
                optional = null;
            }
            if (optional != null && (callEngagement = (CallEngagement) optional.get()) != null) {
                this.f47796b.mo16430e(callEngagement);
                y3iVar = y3i.f54824a;
            }
            if (y3iVar == null) {
                this.f47796b.onComplete();
            }
        }
    }

    /* renamed from: o.tu1$b */
    public static final class C17209b {
        public C17209b() {
        }

        public /* synthetic */ C17209b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final tu1 m50641a() {
            return tu1.f47780g;
        }
    }

    public static final class b0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f47797a;

        public b0(q7c q7cVar) {
            this.f47797a = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "throwable");
            this.f47797a.onError(th);
        }
    }

    /* renamed from: o.tu1$c */
    public static final class C17210c {

        /* renamed from: a */
        public String f47798a;

        /* renamed from: b */
        public boolean f47799b;

        /* renamed from: c */
        public Tasks f47800c;

        public C17210c(String str, boolean z, Tasks tasks) {
            this.f47798a = str;
            this.f47799b = z;
            this.f47800c = tasks;
        }

        /* renamed from: a */
        public final String m50643a() {
            return this.f47798a;
        }

        /* renamed from: b */
        public final Tasks m50644b() {
            return this.f47800c;
        }

        /* renamed from: c */
        public final boolean m50645c() {
            return this.f47799b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17210c)) {
                return false;
            }
            C17210c c17210c = (C17210c) obj;
            return sq8.m48644c(this.f47798a, c17210c.f47798a) && this.f47799b == c17210c.f47799b && sq8.m48644c(this.f47800c, c17210c.f47800c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f47798a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f47799b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (iHashCode + i) * 31;
            Tasks tasks = this.f47800c;
            return i2 + (tasks != null ? tasks.hashCode() : 0);
        }

        public String toString() {
            return "NotifyObserver(number=" + this.f47798a + ", isActiveCall=" + this.f47799b + ", tasks=" + this.f47800c + ")";
        }
    }

    public static final class c0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ Context f47801a;

        /* renamed from: b */
        public final /* synthetic */ rz1 f47802b;

        public c0(Context context, rz1 rz1Var) {
            this.f47801a = context;
            this.f47802b = rz1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            return gq9.m29278C(this.f47801a, this.f47802b.m47311i(), this.f47802b.m47306d(), this.f47802b.m47309g(), "CALL_RECORDING", "CALL_RECORDING");
        }
    }

    /* renamed from: o.tu1$d */
    public static final class C17211d implements jx0 {
        @Override // p001o.jx0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo34648a(String str, String str2, Object obj, Object obj2, Object obj3) {
            m50647b(str, str2, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), obj3);
        }

        /* renamed from: b */
        public void m50647b(String str, String str2, boolean z, boolean z2, Object obj) {
            sq8.m48649h(str, "fragment");
            sq8.m48649h(str2, "attribute");
            StringBuilder sb = new StringBuilder();
            sb.append("Event received for change in call state saved status: ");
            sb.append(z2);
            sb.append(" for lead: ");
            sb.append(obj);
            if (obj != null) {
                if (obj instanceof Leads) {
                    ConcurrentHashMap concurrentHashMap = tu1.f47787n;
                    String str3 = ((Leads) obj).getPhoneNumbers().get(0);
                    sq8.m48648g(str3, "get(...)");
                    concurrentHashMap.put(str3, Boolean.valueOf(z2));
                    return;
                }
                if (obj instanceof Tasks) {
                    Tasks tasks = (Tasks) obj;
                    if (tasks.getId() != null) {
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        ConcurrentHashMap concurrentHashMap2 = tu1.f47787n;
                        String id = tasks.getId();
                        sq8.m48646e(id);
                        concurrentHashMap2.put(id, boolValueOf);
                    }
                }
            }
        }
    }

    public static final class d0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47803a;

        /* renamed from: b */
        public final /* synthetic */ tu1 f47804b;

        public d0(CallEngagement callEngagement, tu1 tu1Var) {
            this.f47803a = callEngagement;
            this.f47804b = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(UploadedFileSummary uploadedFileSummary) {
            sq8.m48649h(uploadedFileSummary, "it");
            this.f47803a.setRecording(true);
            this.f47803a.setUploadedFile(uploadedFileSummary.getId());
            return this.f47804b.y0(this.f47803a);
        }
    }

    /* renamed from: o.tu1$e */
    public static final class C17212e extends jgg implements xk7 {

        /* renamed from: a */
        public int f47805a;

        /* renamed from: b */
        public final /* synthetic */ EngagementSummary f47806b;

        /* renamed from: c */
        public final /* synthetic */ Context f47807c;

        /* renamed from: d */
        public final /* synthetic */ xk7 f47808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17212e(EngagementSummary engagementSummary, Context context, xk7 xk7Var, n64 n64Var) {
            super(1, n64Var);
            this.f47806b = engagementSummary;
            this.f47807c = context;
            this.f47808d = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17212e(this.f47806b, this.f47807c, this.f47808d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47805a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = tu1.f47783j;
                rcj rcjVar = new rcj(this.f47806b, this.f47807c, "CREATE", this.f47808d);
                this.f47805a = 1;
                if (jg2Var.mo23475l(rcjVar, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17212e) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class e0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ EngagementSummary f47809a;

        public e0(EngagementSummary engagementSummary) {
            this.f47809a = engagementSummary;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            this.f47809a.setCallRecordingUrl(callEngagement.getUploadedFile());
            return jyg.e3(this.f47809a);
        }
    }

    /* renamed from: o.tu1$f */
    public static final class C17213f extends jgg implements xk7 {

        /* renamed from: a */
        public int f47810a;

        /* renamed from: b */
        public final /* synthetic */ rcj f47811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17213f(rcj rcjVar, n64 n64Var) {
            super(1, n64Var);
            this.f47811b = rcjVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17213f(this.f47811b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47810a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = tu1.f47783j;
                rcj rcjVar = this.f47811b;
                this.f47810a = 1;
                if (jg2Var.mo23475l(rcjVar, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17213f) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class f0 implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47812a;

        /* renamed from: b */
        public final /* synthetic */ tu1 f47813b;

        public f0(CallEngagement callEngagement, tu1 tu1Var) {
            this.f47812a = callEngagement;
            this.f47813b = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            this.f47812a.setMapping(true);
            return this.f47813b.y0(this.f47812a);
        }
    }

    /* renamed from: o.tu1$g */
    public static final class C17214g extends jgg implements xk7 {

        /* renamed from: a */
        public int f47814a;

        /* renamed from: b */
        public final /* synthetic */ C17210c f47815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17214g(C17210c c17210c, n64 n64Var) {
            super(1, n64Var);
            this.f47815b = c17210c;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17214g(this.f47815b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47814a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = tu1.f47786m;
                C17210c c17210c = this.f47815b;
                this.f47814a = 1;
                if (jg2Var.mo23475l(c17210c, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17214g) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class g0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f47816a;

        /* renamed from: b */
        public final /* synthetic */ EngagementSummary f47817b;

        public g0(xk7 xk7Var, EngagementSummary engagementSummary) {
            this.f47816a = xk7Var;
            this.f47817b = engagementSummary;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("Engagement updated: ");
            sb.append(callEngagement);
            this.f47816a.invoke(new Result.Success(this.f47817b));
        }
    }

    /* renamed from: o.tu1$h */
    public static final class C17215h extends jgg implements xk7 {

        /* renamed from: a */
        public int f47818a;

        /* renamed from: b */
        public final /* synthetic */ med f47819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17215h(med medVar, n64 n64Var) {
            super(1, n64Var);
            this.f47819b = medVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17215h(this.f47819b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47818a;
            if (i == 0) {
                wre.m54934b(obj);
                med medVar = this.f47819b;
                StringBuilder sb = new StringBuilder();
                sb.append("Queue sequence: ");
                sb.append(medVar);
                jg2 jg2Var = tu1.f47785l;
                med medVar2 = this.f47819b;
                this.f47818a = 1;
                if (jg2Var.mo23475l(medVar2, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17215h) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class h0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f47820a;

        public h0(xk7 xk7Var) {
            this.f47820a = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            this.f47820a.invoke(new Result.Failure(th));
        }
    }

    /* renamed from: o.tu1$i */
    public static final class C17216i extends jgg implements xk7 {

        /* renamed from: a */
        public int f47821a;

        /* renamed from: b */
        public final /* synthetic */ rcj f47822b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17216i(rcj rcjVar, n64 n64Var) {
            super(1, n64Var);
            this.f47822b = rcjVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17216i(this.f47822b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47821a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = tu1.f47784k;
                rcj rcjVar = this.f47822b;
                this.f47821a = 1;
                if (jg2Var.mo23475l(rcjVar, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17216i) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final class i0 extends jgg implements xk7 {

        /* renamed from: a */
        public int f47823a;

        /* renamed from: b */
        public final /* synthetic */ CallEvent f47824b;

        /* renamed from: c */
        public final /* synthetic */ boolean f47825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(CallEvent callEvent, boolean z, n64 n64Var) {
            super(1, n64Var);
            this.f47824b = callEvent;
            this.f47825c = z;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new i0(this.f47824b, this.f47825c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            String callId;
            uq8.m51918f();
            if (this.f47823a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            CallEvent callEvent = this.f47824b;
            if (callEvent == null || (callId = callEvent.getCallId()) == null) {
                return null;
            }
            boolean z = this.f47825c;
            StringBuilder sb = new StringBuilder();
            sb.append("Received request to update call log for id: ");
            sb.append(callId);
            sb.append(" with value: ");
            sb.append(z);
            ke1 ke1Var = (ke1) tu1.f47788o.invoke();
            if (ke1Var == null) {
                return null;
            }
            ke1Var.m35500D(callId, z);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((i0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$j */
    public static final class C17217j implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f47826a;

        public C17217j(xk7 xk7Var) {
            this.f47826a = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            this.f47826a.invoke(new Result.Failure(th));
        }
    }

    public static final class j0 extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(CallEngagement callEngagement) {
            super(1);
            this.f47827a = callEngagement;
        }

        /* renamed from: a */
        public final void m50654a(Long l) {
            this.f47827a.setDuplicate(false);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m50654a((Long) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.tu1$k */
    public static final class C17218k implements rl7 {

        /* renamed from: a */
        public static final C17218k f47828a = new C17218k();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            boolean duplicate = callEngagement.getDuplicate();
            StringBuilder sb = new StringBuilder();
            sb.append("Is call engagement duplicate: ");
            sb.append(duplicate);
            x6c x6cVarM55693G = (callEngagement.getDuplicate() && sq8.m48644c(callEngagement.getEngagementSource(), "PHONE_SYNC")) ? x6c.m55693G() : x6c.c0(callEngagement);
            sq8.m48646e(x6cVarM55693G);
            return x6cVarM55693G;
        }
    }

    public static final class k0 extends jgg implements xk7 {

        /* renamed from: a */
        public int f47829a;

        /* renamed from: b */
        public final /* synthetic */ ey3 f47830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ey3 ey3Var, n64 n64Var) {
            super(1, n64Var);
            this.f47830b = ey3Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new k0(this.f47830b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f47829a;
            if (i == 0) {
                wre.m54934b(obj);
                jg2 jg2Var = tu1.f47782i;
                ey3 ey3Var = this.f47830b;
                this.f47829a = 1;
                if (jg2Var.mo23475l(ey3Var, this) == objM51918f) {
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

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((k0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$l */
    public static final class C17219l implements rl7 {
        public C17219l() {
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            StringBuilder sb = new StringBuilder();
            sb.append("After saving Engagement: ");
            sb.append(callEngagement);
            return tu1.this.Q0(callEngagement);
        }
    }

    public static final class l0 extends jgg implements xk7 {

        /* renamed from: a */
        public Object f47832a;

        /* renamed from: b */
        public int f47833b;

        public l0(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return tu1.this.new l0(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            l0 l0Var;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f47833b;
            if (i == 0) {
                wre.m54934b(obj);
                it = tu1.f47782i.iterator();
                l0Var = this;
                l0Var.f47832a = it;
                l0Var.f47833b = 1;
                objMo23482a = it.mo23482a(l0Var);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f47832a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                l0 l0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    ey3 ey3Var = (ey3) sg2Var2.next();
                    if (ey3Var.m25836b().length() > 0) {
                        tu1.this.f47790a.m19753q(ey3Var);
                    }
                    l0Var = l0Var2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    l0Var.f47832a = it;
                    l0Var.f47833b = 1;
                    objMo23482a = it.mo23482a(l0Var);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    l0Var2 = l0Var;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((l0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$m */
    public static final class C17220m implements rl7 {

        /* renamed from: a */
        public static final C17220m f47835a = new C17220m();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("After attaching outcome: ");
            sb.append(callEngagement);
            boolean persisted = callEngagement.getPersisted();
            ta6 engagementOutcome = callEngagement.getEngagementOutcome();
            Boolean boolValueOf = engagementOutcome != null ? Boolean.valueOf(engagementOutcome.m49644s()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("processing mode with flags: (Engagement Persisted: ");
            sb2.append(persisted);
            sb2.append(", Engagement Outcome Persisted: ");
            sb2.append(boolValueOf);
            sb2.append(")");
            EngagementSummary engagementSummaryM49863o = th1.m49863o(callEngagement.toTasks(), null, 1, null);
            Gson gson = ja8.f30035c;
            ta6 engagementOutcome2 = callEngagement.getEngagementOutcome();
            engagementSummaryM49863o.setSubmittedFormValues((SubmittedFormValues) gson.fromJson(engagementOutcome2 != null ? engagementOutcome2.m49645t() : null, SubmittedFormValues.class));
            if (!callEngagement.getPersisted()) {
                ta6 engagementOutcome3 = callEngagement.getEngagementOutcome();
                if (!(engagementOutcome3 != null && engagementOutcome3.m49644s())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("processing in create mode as engagement is not yet persisted: ");
                    sb3.append(callEngagement);
                    return jyg.a1(engagementSummaryM49863o).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null));
                }
            }
            if (callEngagement.getPersisted()) {
                ta6 engagementOutcome4 = callEngagement.getEngagementOutcome();
                if (!(engagementOutcome4 != null && engagementOutcome4.m49644s())) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("processing in update mode as engagement is already saved and outcome come in after: ");
                    sb4.append(callEngagement);
                    return jyg.e3(engagementSummaryM49863o).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null));
                }
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("No processing as both the entities have persisted: ");
            sb5.append(callEngagement);
            return x6c.c0(th1.m49863o(callEngagement.toTasks(), null, 1, null));
        }
    }

    public static final class m0 extends jgg implements xk7 {

        /* renamed from: a */
        public Object f47836a;

        /* renamed from: b */
        public int f47837b;

        public m0(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return tu1.this.new m0(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            m0 m0Var;
            Object objMo23482a;
            Tasks tasks;
            EngagementSummary engagementSummaryM49863o;
            Object objM51918f = uq8.m51918f();
            int i = this.f47837b;
            if (i == 0) {
                wre.m54934b(obj);
                it = tu1.f47783j.iterator();
                m0Var = this;
                m0Var.f47836a = it;
                m0Var.f47837b = 1;
                objMo23482a = it.mo23482a(m0Var);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f47836a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                m0 m0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    rcj rcjVar = (rcj) sg2Var2.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Selected event for processing: ");
                    sb.append(rcjVar);
                    Object objM46535d = rcjVar.m46535d();
                    if (objM46535d instanceof CallEngagement) {
                        Object objM46535d2 = rcjVar.m46535d();
                        CallEngagement callEngagement = objM46535d2 instanceof CallEngagement ? (CallEngagement) objM46535d2 : null;
                        if (callEngagement != null && (tasks = callEngagement.toTasks()) != null && (engagementSummaryM49863o = th1.m49863o(tasks, null, 1, null)) != null) {
                            tu1 tu1Var = tu1.this;
                            String strM46532a = rcjVar.m46532a();
                            if (sq8.m48644c(strM46532a, "CREATE")) {
                                Context contextM46534c = rcjVar.m46534c();
                                sq8.m48646e(contextM46534c);
                                tu1Var.m50636U(contextM46534c, callEngagement, engagementSummaryM49863o, rcjVar.m46533b());
                            } else if (sq8.m48644c(strM46532a, "UPDATE")) {
                                Context contextM46534c2 = rcjVar.m46534c();
                                sq8.m48646e(contextM46534c2);
                                tu1Var.e0(contextM46534c2, callEngagement, engagementSummaryM49863o, rcjVar.m46533b());
                            }
                        }
                    } else if (objM46535d instanceof EngagementSummary) {
                        Object objM46535d3 = rcjVar.m46535d();
                        EngagementSummary engagementSummary = objM46535d3 instanceof EngagementSummary ? (EngagementSummary) objM46535d3 : null;
                        if (engagementSummary != null) {
                            tu1 tu1Var2 = tu1.this;
                            CallEngagement callEngagementFrom = CallEngagement.Companion.from(engagementSummary.toTask());
                            String strM46532a2 = rcjVar.m46532a();
                            if (sq8.m48644c(strM46532a2, "CREATE")) {
                                Context contextM46534c3 = rcjVar.m46534c();
                                sq8.m48646e(contextM46534c3);
                                tu1Var2.m50637W(contextM46534c3, callEngagementFrom, engagementSummary, rcjVar.m46533b());
                            } else if (sq8.m48644c(strM46532a2, "UPDATE")) {
                                Context contextM46534c4 = rcjVar.m46534c();
                                sq8.m48646e(contextM46534c4);
                                tu1Var2.e0(contextM46534c4, callEngagementFrom, engagementSummary, rcjVar.m46533b());
                            }
                        }
                    }
                    m0Var = m0Var2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    m0Var.f47836a = it;
                    m0Var.f47837b = 1;
                    objMo23482a = it.mo23482a(m0Var);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    m0Var2 = m0Var;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((m0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$n */
    public static final class C17221n implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47839a;

        /* renamed from: b */
        public final /* synthetic */ tu1 f47840b;

        public C17221n(CallEngagement callEngagement, tu1 tu1Var) {
            this.f47839a = callEngagement;
            this.f47840b = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("After saving engagement summary: ");
            sb.append(engagementSummary);
            this.f47839a.setPersisted(true);
            ta6 engagementOutcome = this.f47839a.getEngagementOutcome();
            if (engagementOutcome != null) {
                engagementOutcome.m49647v(true);
            }
            return this.f47840b.y0(this.f47839a);
        }
    }

    public static final class n0 extends jgg implements xk7 {

        /* renamed from: a */
        public Object f47841a;

        /* renamed from: b */
        public int f47842b;

        public n0(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return tu1.this.new n0(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            n0 n0Var;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f47842b;
            if (i == 0) {
                wre.m54934b(obj);
                it = tu1.f47786m.iterator();
                n0Var = this;
                n0Var.f47841a = it;
                n0Var.f47842b = 1;
                objMo23482a = it.mo23482a(n0Var);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f47841a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                n0 n0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    tu1.this.m50638Y((C17210c) sg2Var2.next());
                    n0Var = n0Var2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    n0Var.f47841a = it;
                    n0Var.f47842b = 1;
                    objMo23482a = it.mo23482a(n0Var);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    n0Var2 = n0Var;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((n0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$o */
    public static final class C17222o implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47844a;

        /* renamed from: b */
        public final /* synthetic */ Context f47845b;

        public C17222o(CallEngagement callEngagement, Context context) {
            this.f47844a = callEngagement;
            this.f47845b = context;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            Uri uriM47311i;
            String path;
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("After updating status of call engagement save: ");
            sb.append(callEngagement);
            if (this.f47844a.getCallRecording() != null && !this.f47844a.getRecording()) {
                rz1 callRecording = this.f47844a.getCallRecording();
                if ((callRecording != null ? callRecording.m47311i() : null) != null) {
                    rz1 callRecording2 = this.f47844a.getCallRecording();
                    if (((callRecording2 == null || (uriM47311i = callRecording2.m47311i()) == null || (path = uriM47311i.getPath()) == null) ? null : f9g.Z0(path).toString()) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("trying to upload recording file to server ");
                        sb2.append(callEngagement);
                        Context applicationContext = this.f47845b.getApplicationContext();
                        rz1 callRecording3 = this.f47844a.getCallRecording();
                        Uri uriM47311i2 = callRecording3 != null ? callRecording3.m47311i() : null;
                        rz1 callRecording4 = this.f47844a.getCallRecording();
                        String strM47306d = callRecording4 != null ? callRecording4.m47306d() : null;
                        rz1 callRecording5 = this.f47844a.getCallRecording();
                        return gq9.m29278C(applicationContext, uriM47311i2, strM47306d, callRecording5 != null ? callRecording5.m47309g() : null, "CALL_RECORDING", "CALL_RECORDING").m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null));
                    }
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("no recording available. completing the flow for: ");
            sb3.append(callEngagement);
            return x6c.m55693G();
        }
    }

    public static final class o0 extends jgg implements xk7 {

        /* renamed from: a */
        public Object f47846a;

        /* renamed from: b */
        public int f47847b;

        public o0(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return tu1.this.new o0(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            o0 o0Var;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f47847b;
            if (i == 0) {
                wre.m54934b(obj);
                it = tu1.f47785l.iterator();
                o0Var = this;
                o0Var.f47846a = it;
                o0Var.f47847b = 1;
                objMo23482a = it.mo23482a(o0Var);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f47846a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                o0 o0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    tu1.this.a0((med) sg2Var2.next());
                    o0Var = o0Var2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    o0Var.f47846a = it;
                    o0Var.f47847b = 1;
                    objMo23482a = it.mo23482a(o0Var);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    o0Var2 = o0Var;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((o0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$p */
    public static final class C17223p implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47849a;

        /* renamed from: b */
        public final /* synthetic */ tu1 f47850b;

        public C17223p(CallEngagement callEngagement, tu1 tu1Var) {
            this.f47849a = callEngagement;
            this.f47850b = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(UploadedFileSummary uploadedFileSummary) {
            sq8.m48649h(uploadedFileSummary, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("update document upload metadata to local db: ");
            sb.append(uploadedFileSummary);
            this.f47849a.setRecording(true);
            this.f47849a.setUploadedFile(uploadedFileSummary.getId());
            return this.f47850b.y0(this.f47849a);
        }
    }

    public static final class p0 extends jgg implements xk7 {

        /* renamed from: a */
        public Object f47851a;

        /* renamed from: b */
        public int f47852b;

        public p0(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return tu1.this.new p0(n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sg2 it;
            p0 p0Var;
            Object objMo23482a;
            Tasks tasks;
            EngagementSummary engagementSummaryM49863o;
            Object objM51918f = uq8.m51918f();
            int i = this.f47852b;
            if (i == 0) {
                wre.m54934b(obj);
                it = tu1.f47784k.iterator();
                p0Var = this;
                p0Var.f47851a = it;
                p0Var.f47852b = 1;
                objMo23482a = it.mo23482a(p0Var);
                if (objMo23482a != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var = (sg2) this.f47851a;
                wre.m54934b(obj);
                sg2 sg2Var2 = sg2Var;
                Object obj2 = objM51918f;
                p0 p0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    rcj rcjVar = (rcj) sg2Var2.next();
                    CallEngagement callEngagement = (CallEngagement) rcjVar.m46535d();
                    if (callEngagement != null && (tasks = callEngagement.toTasks()) != null && (engagementSummaryM49863o = th1.m49863o(tasks, null, 1, null)) != null) {
                        tu1 tu1Var = tu1.this;
                        String strM46532a = rcjVar.m46532a();
                        if (sq8.m48644c(strM46532a, "CREATE")) {
                            Context contextM46534c = rcjVar.m46534c();
                            sq8.m48646e(contextM46534c);
                            Object objM46535d = rcjVar.m46535d();
                            sq8.m48646e(objM46535d);
                            tu1Var.m50636U(contextM46534c, (CallEngagement) objM46535d, engagementSummaryM49863o, rcjVar.m46533b());
                        } else if (sq8.m48644c(strM46532a, "UPDATE")) {
                            Context contextM46534c2 = rcjVar.m46534c();
                            sq8.m48646e(contextM46534c2);
                            Object objM46535d2 = rcjVar.m46535d();
                            sq8.m48646e(objM46535d2);
                            tu1Var.e0(contextM46534c2, (CallEngagement) objM46535d2, engagementSummaryM49863o, rcjVar.m46533b());
                        }
                    }
                    p0Var = p0Var2;
                    objM51918f = obj2;
                    it = sg2Var2;
                    p0Var.f47851a = it;
                    p0Var.f47852b = 1;
                    objMo23482a = it.mo23482a(p0Var);
                    if (objMo23482a != objM51918f) {
                        return objM51918f;
                    }
                    Object obj3 = objM51918f;
                    p0Var2 = p0Var;
                    obj = objMo23482a;
                    sg2Var2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((p0) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.tu1$q */
    public static final class C17224q implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ EngagementSummary f47854a;

        public C17224q(EngagementSummary engagementSummary) {
            this.f47854a = engagementSummary;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("Attach uploaded document metadata reference to engagement: ");
            sb.append(callEngagement);
            this.f47854a.setCallRecordingUrl(callEngagement.getUploadedFile());
            return jyg.e3(this.f47854a);
        }
    }

    public static final class q0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f47855a;

        public q0(q7c q7cVar) {
            this.f47855a = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Optional optional) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value received from callable: ");
            sb.append(optional);
            this.f47855a.mo16430e(optional);
        }
    }

    /* renamed from: o.tu1$r */
    public static final class C17225r implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47856a;

        /* renamed from: b */
        public final /* synthetic */ tu1 f47857b;

        public C17225r(CallEngagement callEngagement, tu1 tu1Var) {
            this.f47856a = callEngagement;
            this.f47857b = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("update mapping metadata to local db: ");
            sb.append(engagementSummary);
            this.f47856a.setMapping(true);
            return this.f47857b.y0(this.f47856a);
        }
    }

    public static final class r0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f47858a;

        public r0(q7c q7cVar) {
            this.f47858a = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "throwable");
            this.f47858a.onError(th);
        }
    }

    /* renamed from: o.tu1$s */
    public static final class C17226s implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f47859a;

        /* renamed from: b */
        public final /* synthetic */ EngagementSummary f47860b;

        public C17226s(xk7 xk7Var, EngagementSummary engagementSummary) {
            this.f47859a = xk7Var;
            this.f47860b = engagementSummary;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("Engagement created: ");
            sb.append(callEngagement);
            this.f47859a.invoke(new Result.Success(this.f47860b));
        }
    }

    public static final class s0 implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ CallEngagement f47862b;

        /* renamed from: c */
        public final /* synthetic */ q7c f47863c;

        public s0(CallEngagement callEngagement, q7c q7cVar) {
            this.f47862b = callEngagement;
            this.f47863c = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Optional optional) {
            y3i y3iVar = null;
            if (optional != null) {
                if (!optional.isPresent()) {
                    optional = null;
                }
                if (optional != null) {
                    CallEngagement callEngagement = this.f47862b;
                    q7c q7cVar = this.f47863c;
                    if (callEngagement != null) {
                        callEngagement.setEngagementOutcome((ta6) optional.get());
                    }
                    sq8.m48646e(callEngagement);
                    q7cVar.mo16430e(callEngagement);
                    y3iVar = y3i.f54824a;
                }
            }
            if (y3iVar == null) {
                q7c q7cVar2 = this.f47863c;
                CallEngagement callEngagement2 = this.f47862b;
                sq8.m48646e(callEngagement2);
                q7cVar2.mo16430e(callEngagement2);
            }
        }
    }

    /* renamed from: o.tu1$t */
    public static final class C17227t implements rl7 {
        public C17227t() {
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            return tu1.this.M0(callEngagement.getEngagementOutcome());
        }
    }

    public static final class t0 implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ q7c f47865a;

        public t0(q7c q7cVar) {
            this.f47865a = q7cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "throwable");
            this.f47865a.onError(th);
        }
    }

    /* renamed from: o.tu1$u */
    public static final class C17228u implements rl7 {

        /* renamed from: b */
        public final /* synthetic */ ta6 f47867b;

        /* renamed from: c */
        public final /* synthetic */ EngagementSummary f47868c;

        /* renamed from: d */
        public final /* synthetic */ xk7 f47869d;

        public C17228u(ta6 ta6Var, EngagementSummary engagementSummary, xk7 xk7Var) {
            this.f47867b = ta6Var;
            this.f47868c = engagementSummary;
            this.f47869d = xk7Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(Optional optional) {
            sq8.m48649h(optional, "it");
            tu1 tu1Var = tu1.this;
            if (!optional.isPresent()) {
                optional = null;
            }
            return tu1Var.b0(optional != null ? (CallEngagement) optional.get() : null, this.f47867b, this.f47868c, this.f47869d);
        }
    }

    /* renamed from: o.tu1$v */
    public static final class C17229v implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ Context f47871b;

        /* renamed from: c */
        public final /* synthetic */ xk7 f47872c;

        public C17229v(Context context, xk7 xk7Var) {
            this.f47871b = context;
            this.f47872c = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(CallEngagement callEngagement) {
            sq8.m48649h(callEngagement, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("Going to process engagement save pipeline: ");
            sb.append(callEngagement);
            tu1.this.m50636U(this.f47871b, callEngagement, th1.m49863o(callEngagement.toTasks(), null, 1, null), this.f47872c);
        }
    }

    /* renamed from: o.tu1$w */
    public static final class C17230w implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f47873a;

        public C17230w(xk7 xk7Var) {
            this.f47873a = xk7Var;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "err");
            this.f47873a.invoke(new Result.Failure(th));
        }
    }

    /* renamed from: o.tu1$x */
    public static final class C17231x implements rl7 {

        /* renamed from: a */
        public static final C17231x f47874a = new C17231x();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            return Optional.ofNullable(engagementSummary);
        }
    }

    /* renamed from: o.tu1$y */
    public static final class C17232y implements rl7 {

        /* renamed from: a */
        public static final C17232y f47875a = new C17232y();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(EngagementSummary engagementSummary) {
            sq8.m48649h(engagementSummary, "it");
            return Optional.ofNullable(engagementSummary);
        }
    }

    /* renamed from: o.tu1$z */
    public static final class C17233z implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ CallEngagement f47876a;

        /* renamed from: b */
        public final /* synthetic */ ta6 f47877b;

        /* renamed from: c */
        public final /* synthetic */ tu1 f47878c;

        public C17233z(CallEngagement callEngagement, ta6 ta6Var, tu1 tu1Var) {
            this.f47876a = callEngagement;
            this.f47877b = ta6Var;
            this.f47878c = tu1Var;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Optional apply(Optional optional) {
            sq8.m48649h(optional, "summary");
            StringBuilder sb = new StringBuilder();
            sb.append("After updating engagement summary for outcome: ");
            sb.append(optional);
            if (!optional.isPresent()) {
                optional = null;
            }
            if (optional != null) {
                ta6 ta6Var = this.f47877b;
                tu1 tu1Var = this.f47878c;
                if (ta6Var != null) {
                    ta6Var.m49647v(true);
                }
                tu1Var.z0(ta6Var);
            }
            return Optional.ofNullable(this.f47876a);
        }
    }

    static {
        tu1 tu1Var = new tu1();
        f47780g = tu1Var;
        f47781h = p74.f39487a.m43082j();
        wl1 wl1Var = wl1.DROP_OLDEST;
        f47782i = tg2.m49824b(500, wl1Var, null, 4, null);
        f47783j = tg2.m49824b(5000, wl1Var, null, 4, null);
        f47784k = tg2.m49824b(5000, wl1Var, null, 4, null);
        f47785l = tg2.m49824b(500, wl1Var, null, 4, null);
        f47786m = tg2.m49824b(500, wl1Var, null, 4, null);
        f47787n = new ConcurrentHashMap();
        f47788o = C17208a.f47794a;
        f47789p = new Object();
        tu1Var.w0();
        tu1Var.x0();
        tu1Var.E0();
        tu1Var.D0();
        tu1Var.C0();
    }

    public tu1() {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        sq8.m48648g(keySetViewNewKeySet, "newKeySet(...)");
        this.f47792c = keySetViewNewKeySet;
        this.f47793d = SuperfoneApplication.f225c.m127c();
    }

    public static final CallEngagement A0(CallEngagement callEngagement) {
        ke1 ke1Var;
        if (callEngagement != null) {
            h96 engagement = callEngagement.toEngagement();
            uk7 uk7Var = f47788o;
            ke1 ke1Var2 = (ke1) uk7Var.invoke();
            if (ke1Var2 != null) {
                ke1Var2.m35504H(engagement);
            }
            ta6 engagementOutcome = callEngagement.getEngagementOutcome();
            if (engagementOutcome != null && (ke1Var = (ke1) uk7Var.invoke()) != null) {
                ke1Var.m35502F(engagementOutcome);
            }
        }
        return callEngagement;
    }

    public static final ta6 B0(ta6 ta6Var) {
        ke1 ke1Var;
        if (ta6Var != null && (ke1Var = (ke1) f47788o.invoke()) != null) {
            ke1Var.m35502F(ta6Var);
        }
        return ta6Var;
    }

    public static final void J0(med medVar) {
        sq8.m48649h(medVar, "$popupContext");
        C1670a c1670a = new C1670a();
        AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
        ConcurrentHashMap concurrentHashMap = f47787n;
        Tasks tasksM38843g = medVar.m38843g();
        Boolean bool = (Boolean) azh.m18051d(concurrentHashMap).remove(tasksM38843g != null ? tasksM38843g.getId() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("Is call outcome already saved: ");
        sb.append(bool);
        Boolean bool2 = Boolean.TRUE;
        if (sq8.m48644c(bool, bool2) && autoCallConfigM54443I != null && autoCallConfigM54443I.getAutoCallMode()) {
            C1670a c1670a2 = new C1670a();
            Context contextM38839c = medVar.m38839c();
            sq8.m48646e(contextM38839c);
            c1670a2.v0(contextM38839c, medVar.m38843g());
            return;
        }
        if (j4d.p0(medVar.m38839c()) || !(autoCallConfigM54443I == null || !autoCallConfigM54443I.getAutoCallMode() || autoCallConfigM54443I.isPaused())) {
            Tasks tasksM38843g2 = medVar.m38843g();
            sq8.m48646e(tasksM38843g2);
            Leads leadsM38840d = medVar.m38840d();
            Context contextM38839c2 = medVar.m38839c();
            sq8.m48646e(contextM38839c2);
            c1670a.m3315V(tasksM38843g2, leadsM38840d, "positive", contextM38839c2);
            return;
        }
        if (sq8.m48644c(bool, bool2)) {
            return;
        }
        Context contextM38839c3 = medVar.m38839c();
        sq8.m48646e(contextM38839c3);
        Leads leadsM38840d2 = medVar.m38840d();
        sq8.m48646e(leadsM38840d2);
        Tasks tasksM38843g3 = medVar.m38843g();
        sq8.m48646e(tasksM38843g3);
        c1670a.a0(contextM38839c3, leadsM38840d2, tasksM38843g3);
    }

    public static final void N0(final ta6 ta6Var, final q7c q7cVar) {
        sq8.m48649h(q7cVar, "emitter");
        final String strM49639n = ta6Var != null ? ta6Var.m49639n() : null;
        final String strM49640o = ta6Var != null ? ta6Var.m49640o() : null;
        if (strM49639n == null || strM49640o == null) {
            q7cVar.onError(new IllegalArgumentException("Engagement outcome missing id or type"));
            q7cVar.onComplete();
        } else {
            su5 su5VarW0 = x6c.m55697U(new Callable() { // from class: o.eu1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return tu1.O0(strM49639n, strM49640o, ta6Var);
                }
            }).y0(i5f.m31599c()).w0(new q0(q7cVar), new r0(q7cVar), new jm() { // from class: o.fu1
                @Override // p001o.jm
                public final void run() {
                    tu1.P0(q7cVar);
                }
            });
            sq8.m48648g(su5VarW0, "subscribe(...)");
            q7cVar.mo28141d(su5VarW0);
        }
    }

    public static final Optional O0(String str, String str2, ta6 ta6Var) {
        Optional optionalOfNullable;
        h96 h96VarM35515q;
        ke1 ke1Var = (ke1) f47788o.invoke();
        CallEngagement callEngagementM29996O = (ke1Var == null || (h96VarM35515q = ke1Var.m35515q(str, str2)) == null) ? null : h96VarM35515q.m29996O();
        if (callEngagementM29996O != null) {
            callEngagementM29996O.setEngagementOutcome(ta6Var);
        }
        return (callEngagementM29996O == null || (optionalOfNullable = Optional.ofNullable(callEngagementM29996O)) == null) ? Optional.empty() : optionalOfNullable;
    }

    public static final void P0(q7c q7cVar) {
        sq8.m48649h(q7cVar, "$emitter");
        q7cVar.onComplete();
    }

    public static final void R0(final CallEngagement callEngagement, final tu1 tu1Var, final q7c q7cVar) {
        sq8.m48649h(tu1Var, "this$0");
        sq8.m48649h(q7cVar, "emitter");
        final gge ggeVar = new gge();
        ggeVar.f25106a = callEngagement != null ? callEngagement.getId() : null;
        final gge ggeVar2 = new gge();
        ggeVar2.f25106a = "ENGAGEMENT_ID";
        if (callEngagement != null) {
            CallEngagement callEngagement2 = sq8.m48644c(callEngagement.getEngagementSourceType(), "CLOUDTELEPHONY") ? callEngagement : null;
            if (callEngagement2 != null) {
                String engagementSourceLevelTwo = callEngagement2.getEngagementSourceLevelTwo();
                if (engagementSourceLevelTwo != null) {
                    ggeVar.f25106a = engagementSourceLevelTwo;
                }
                String engagementSourceType = callEngagement2.getEngagementSourceType();
                if (engagementSourceType != null) {
                    ggeVar2.f25106a = engagementSourceType;
                }
            }
        }
        if (ggeVar.f25106a == null) {
            q7cVar.onError(new IllegalArgumentException("Engagement outcome missing id or type"));
            q7cVar.onComplete();
        } else {
            su5 su5VarW0 = x6c.m55697U(new Callable() { // from class: o.gu1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return tu1.S0(callEngagement, tu1Var, ggeVar, ggeVar2);
                }
            }).y0(i5f.m31599c()).w0(tu1Var.new s0(callEngagement, q7cVar), new t0(q7cVar), new jm() { // from class: o.hu1
                @Override // p001o.jm
                public final void run() {
                    tu1.T0(q7cVar);
                }
            });
            sq8.m48648g(su5VarW0, "subscribe(...)");
            q7cVar.mo28141d(su5VarW0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Optional S0(CallEngagement callEngagement, tu1 tu1Var, gge ggeVar, gge ggeVar2) {
        ta6 ta6VarM35516r;
        Optional optionalEmpty;
        ta6 engagementOutcome;
        sq8.m48649h(tu1Var, "this$0");
        sq8.m48649h(ggeVar, "$engagementId");
        sq8.m48649h(ggeVar2, "$engagementType");
        if (callEngagement == null || (engagementOutcome = callEngagement.getEngagementOutcome()) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Lookup call engagement from local repository: ");
            sb.append(callEngagement);
            ke1 ke1Var = (ke1) f47788o.invoke();
            if (ke1Var != null) {
                Object obj = ggeVar.f25106a;
                sq8.m48646e(obj);
                ta6VarM35516r = ke1Var.m35516r((String) obj, (String) ggeVar2.f25106a);
            } else {
                ta6VarM35516r = null;
            }
            if (ta6VarM35516r == null || (optionalEmpty = Optional.ofNullable(ta6VarM35516r)) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("no staged call outcome found: ");
                sb2.append(callEngagement);
                optionalEmpty = Optional.empty();
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Get outcome from call object only. ");
            sb3.append(engagementOutcome);
            optionalEmpty = Optional.ofNullable(engagementOutcome);
            if (optionalEmpty == null) {
            }
        }
        sq8.m48646e(optionalEmpty);
        return optionalEmpty;
    }

    public static final void T0(q7c q7cVar) {
        sq8.m48649h(q7cVar, "$emitter");
        q7cVar.onComplete();
    }

    /* renamed from: V */
    public static final void m50600V(CallEngagement callEngagement, tu1 tu1Var) {
        sq8.m48649h(callEngagement, "$callEngagement");
        sq8.m48649h(tu1Var, "this$0");
        String engagementSourceLevelTwo = callEngagement.getEngagementSourceLevelTwo();
        StringBuilder sb = new StringBuilder();
        sb.append("finally mark call log for this event: ");
        sb.append(engagementSourceLevelTwo);
        tu1Var.U0(callEngagement);
    }

    /* renamed from: X */
    public static final void m50601X(xk7 xk7Var, EngagementSummary engagementSummary) {
        sq8.m48649h(xk7Var, "$callback");
        sq8.m48649h(engagementSummary, "$engagementSummary");
        xk7Var.invoke(new Result.Success(engagementSummary));
    }

    /* renamed from: Z */
    public static final void m50602Z(ActiveCall activeCall) {
        lh8.m37214c().m37215a(activeCall);
    }

    public static final void c0(CallEngagement callEngagement, ta6 ta6Var, EngagementSummary engagementSummary, tu1 tu1Var, final q7c q7cVar) {
        sq8.m48649h(engagementSummary, "$engagementSummary");
        sq8.m48649h(tu1Var, "this$0");
        sq8.m48649h(q7cVar, "emitter");
        su5 su5VarW0 = ((callEngagement != null || ta6Var == null || engagementSummary.getInFlightCall()) ? x6c.c0(Optional.empty()) : sq8.m48644c(engagementSummary.getEngagementSource(), "MANUAL") ? jyg.a1(engagementSummary).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).d0(C17231x.f47874a) : jyg.e3(engagementSummary).m0(jwe.m34628c(jwe.f31197a, 0, 0, 3, null)).d0(C17232y.f47875a)).d0(new C17233z(callEngagement, ta6Var, tu1Var)).y0(i5f.m31599c()).w0(tu1Var.new a0(q7cVar), new b0(q7cVar), new jm() { // from class: o.iu1
            @Override // p001o.jm
            public final void run() {
                tu1.d0(q7cVar);
            }
        });
        sq8.m48648g(su5VarW0, "subscribe(...)");
        q7cVar.mo28141d(su5VarW0);
    }

    public static final void d0(q7c q7cVar) {
        sq8.m48649h(q7cVar, "$emitter");
        q7cVar.onComplete();
    }

    public static final void g0(med medVar) {
        sq8.m48649h(medVar, "$popupContext");
        C1670a c1670aM38838b = medVar.m38838b();
        C1670a.b bVar = C1670a.b.HIDE;
        Context contextM38839c = medVar.m38839c();
        sq8.m48646e(contextM38839c);
        c1670aM38838b.m3309J(new C1670a.a(bVar, contextM38839c, null, null, 12, null));
    }

    public static final void i0(med medVar, Leads leads) {
        sq8.m48649h(medVar, "$context");
        sq8.m48649h(leads, "$lead");
        Context contextM38839c = medVar.m38839c();
        if (contextM38839c != null) {
            medVar.m38838b().m3309J(new C1670a.a(C1670a.b.SHOW, contextM38839c, leads, medVar.m38843g()));
        }
    }

    public static final CallEngagement n0(final CallEngagement callEngagement, tu1 tu1Var) {
        Optional optionalEmpty;
        y3i y3iVar;
        sq8.m48649h(tu1Var, "this$0");
        if (callEngagement != null) {
            h96 engagement = callEngagement.toEngagement();
            uk7 uk7Var = f47788o;
            ke1 ke1Var = (ke1) uk7Var.invoke();
            if (ke1Var == null || (optionalEmpty = ke1Var.m35497A(engagement)) == null) {
                l07.m36403d(l07.f32907a, "Not able to get repository for local storage. trying to insert engagement", null, 2, null);
                optionalEmpty = Optional.empty();
                sq8.m48648g(optionalEmpty, "run(...)");
            }
            final j0 j0Var = new j0(callEngagement);
            yt1.m58188a(optionalEmpty, new Consumer() { // from class: o.zt1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    tu1.o0(j0Var, obj);
                }
            }, new Runnable() { // from class: o.au1
                @Override // java.lang.Runnable
                public final void run() {
                    tu1.p0(callEngagement);
                }
            });
            CallEngagement callEngagement2 = callEngagement.getEngagementOutcome() != null ? callEngagement : null;
            if (callEngagement2 != null) {
                ke1 ke1Var2 = (ke1) uk7Var.invoke();
                if (ke1Var2 != null) {
                    ta6 engagementOutcome = callEngagement2.getEngagementOutcome();
                    sq8.m48646e(engagementOutcome);
                    ke1Var2.m35523y(engagementOutcome);
                    y3iVar = y3i.f54824a;
                } else {
                    y3iVar = null;
                }
                if (y3iVar == null) {
                    l07.m36403d(l07.f32907a, "Not able to get repository for local storage. trying to insert callOutcome", null, 2, null);
                }
            }
        }
        return callEngagement;
    }

    public static final void o0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public static final void p0(CallEngagement callEngagement) {
        sq8.m48649h(callEngagement, "$call");
        callEngagement.setDuplicate(true);
    }

    public static final CallEngagement r0(CallEngagement callEngagement) {
        if (callEngagement != null) {
            CallEngagement callEngagement2 = callEngagement.getEngagementOutcome() != null ? callEngagement : null;
            if (callEngagement2 != null) {
                ta6 engagementOutcome = callEngagement2.getEngagementOutcome();
                StringBuilder sb = new StringBuilder();
                sb.append("Outcome received to be saved: ");
                sb.append(engagementOutcome);
                ke1 ke1Var = (ke1) f47788o.invoke();
                if (ke1Var != null) {
                    ta6 engagementOutcome2 = callEngagement2.getEngagementOutcome();
                    sq8.m48646e(engagementOutcome2);
                    ke1Var.m35523y(engagementOutcome2);
                }
            }
        }
        return callEngagement;
    }

    public final void C0() {
        p74.f39487a.m43078f(f47781h, new n0(null));
    }

    public final void D0() {
        p74.f39487a.m43078f(f47781h, new o0(null));
    }

    public final void E0() {
        p74.f39487a.m43078f(f47781h, new p0(null));
    }

    public final void F0(Context context, CallEngagement callEngagement) {
        sq8.m48649h(context, "context");
        if (callEngagement != null) {
            m50635T(new rcj(callEngagement, context, "CREATE", null, 8, null));
        }
    }

    public final void G0(Context context, CallEngagement callEngagement) {
        sq8.m48649h(context, "context");
        if (callEngagement != null) {
            m50635T(new rcj(callEngagement, context, "UPDATE", null, 8, null));
        }
    }

    public final void H0(med medVar) {
        String strM38841e = medVar.m38841e();
        if (strM38841e == null || this.f47791b.get(strM38841e) != medVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skipping stale showPopup for ");
            sb.append(strM38841e);
            return;
        }
        Prefs prefs = this.f47793d;
        boolean z = false;
        if (prefs != null && true == prefs.m3237Y()) {
            z = true;
        }
        if (!z) {
            Tasks tasksM38843g = medVar.m38843g();
            if (sq8.m48644c(tasksM38843g != null ? tasksM38843g.getEngagementSourceType() : null, "WEB")) {
                if (medVar.m38843g().getId() != null) {
                    x5j.m55675j(medVar.m38843g().getId(), "OFFHOOK");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected flow for a request to reach here without taskid with input: ");
                sb2.append(medVar);
                return;
            }
            return;
        }
        bt9 bt9Var = this.f47790a;
        String strM38841e2 = medVar.m38841e();
        sq8.m48646e(strM38841e2);
        LeadsSummary leadsSummaryM19753q = bt9Var.m19753q(new ey3(strM38841e2, null, null, null, false, null, null, 126, null));
        Leads leads = leadsSummaryM19753q != null ? leadsSummaryM19753q.toLeads() : null;
        if (leads != null) {
            AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
            if (autoCallConfigM54443I != null && autoCallConfigM54443I.getAutoCallMode() && !autoCallConfigM54443I.isPaused()) {
                h0(medVar, leads);
                return;
            }
            h0(medVar, leads);
            Tasks tasksM38843g2 = medVar.m38843g();
            if (sq8.m48644c(tasksM38843g2 != null ? tasksM38843g2.getEngagementSourceType() : null, "WEB")) {
                if (medVar.m38843g().getId() != null) {
                    x5j.m55675j(medVar.m38843g().getId(), "OFFHOOK");
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected flow for a request to reach here without taskid with input: ");
                sb3.append(medVar);
            }
        }
    }

    public final void I0(final med medVar) {
        j0f.m33008i(new Runnable() { // from class: o.ou1
            @Override // java.lang.Runnable
            public final void run() {
                tu1.J0(medVar);
            }
        });
    }

    public final void K0(Context context, String str, CallEngagement callEngagement) {
        synchronized (f47789p) {
            if (str != null) {
                L0(context, str, callEngagement);
                l0(str, true, callEngagement);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    public final void L0(Context context, String str, CallEngagement callEngagement) {
        if (this.f47792c.contains(str)) {
            return;
        }
        this.f47792c.add(str);
        this.f47791b.put(str, new med.C15299a().m38850g("SHOW_SCREENING").m38844a(new C1670a()).m38847d(context).m38849f(str).m38851h(callEngagement != null ? callEngagement.toTasks() : null).m38846c(callEngagement != null ? callEngagement.getCallStatus() : null).m38845b());
        med medVar = (med) this.f47791b.get(str);
        if (medVar != null) {
            m50634S(medVar);
        }
    }

    public final x6c M0(final ta6 ta6Var) {
        x6c x6cVarM55706q = x6c.m55706q(new m8c() { // from class: o.du1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                tu1.N0(ta6Var, q7cVar);
            }
        });
        sq8.m48648g(x6cVarM55706q, "create(...)");
        return x6cVarM55706q;
    }

    /* renamed from: N */
    public final void m50629N(String str) {
        if (kh3.m35708X(this.f47792c, str)) {
            azh.m18048a(this.f47792c).remove(str);
            med medVar = (med) azh.m18051d(this.f47791b).remove(str);
            Prefs prefs = this.f47793d;
            boolean z = false;
            if (prefs != null && true == prefs.m3237Y()) {
                z = true;
            }
            if (!z || medVar == null) {
                return;
            }
            m50634S(new med.C15299a(medVar).m38850g("HIDE_SCREENING").m38845b());
        }
    }

    /* renamed from: O */
    public final void m50630O(Context context, String str) {
        synchronized (f47789p) {
            if (str != null) {
                m50629N(str);
                l0(str, false, null);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    /* renamed from: P */
    public final void m50631P(Context context, EngagementSummary engagementSummary, xk7 xk7Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(engagementSummary, "engagementSummary");
        sq8.m48649h(xk7Var, "callback");
        p74.f39487a.m43078f(f47781h, new C17212e(engagementSummary, context, xk7Var, null));
    }

    /* renamed from: Q */
    public final void m50632Q(rcj rcjVar) {
        p74.f39487a.m43078f(f47781h, new C17213f(rcjVar, null));
    }

    public final x6c Q0(final CallEngagement callEngagement) {
        x6c x6cVarM55706q = x6c.m55706q(new m8c() { // from class: o.ru1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                tu1.R0(callEngagement, this, q7cVar);
            }
        });
        sq8.m48648g(x6cVarM55706q, "create(...)");
        return x6cVarM55706q;
    }

    /* renamed from: R */
    public final void m50633R(C17210c c17210c) {
        p74.f39487a.m43078f(f47781h, new C17214g(c17210c, null));
    }

    /* renamed from: S */
    public final void m50634S(med medVar) {
        p74.f39487a.m43078f(f47781h, new C17215h(medVar, null));
    }

    /* renamed from: T */
    public final void m50635T(rcj rcjVar) {
        p74.f39487a.m43078f(f47781h, new C17216i(rcjVar, null));
    }

    /* renamed from: U */
    public final void m50636U(Context context, final CallEngagement callEngagement, EngagementSummary engagementSummary, xk7 xk7Var) {
        sq8.m48648g(m0(callEngagement).m55717M(C17218k.f47828a).m55717M(new C17219l()).m55717M(C17220m.f47835a).m55717M(new C17221n(callEngagement, this)).m55717M(new C17222o(callEngagement, context)).m55717M(new C17223p(callEngagement, this)).m55717M(new C17224q(engagementSummary)).m55717M(new C17225r(callEngagement, this)).w0(new C17226s(xk7Var, engagementSummary), new C17217j(xk7Var), new jm() { // from class: o.ju1
            @Override // p001o.jm
            public final void run() {
                tu1.m50600V(callEngagement, this);
            }
        }), "subscribe(...)");
    }

    public final void U0(CallEngagement callEngagement) {
        String engagementSourceLevelTwo;
        if (callEngagement == null || (engagementSourceLevelTwo = callEngagement.getEngagementSourceLevelTwo()) == null) {
            return;
        }
        uk7 uk7Var = f47788o;
        ke1 ke1Var = (ke1) uk7Var.invoke();
        cv1 cv1VarM35511m = ke1Var != null ? ke1Var.m35511m(engagementSourceLevelTwo) : null;
        if (cv1VarM35511m != null) {
            cv1VarM35511m.m21860x(true);
            ke1 ke1Var2 = (ke1) uk7Var.invoke();
            if (ke1Var2 != null) {
                ke1Var2.m35501E(cv1VarM35511m);
            }
        }
    }

    /* renamed from: W */
    public final void m50637W(Context context, CallEngagement callEngagement, final EngagementSummary engagementSummary, final xk7 xk7Var) {
        String engagementSourceType;
        String id = callEngagement.getId();
        if (sq8.m48644c(callEngagement.getEngagementSourceType(), "CLOUDTELEPHONY")) {
            id = callEngagement.getEngagementSourceLevelTwo();
            sq8.m48646e(id);
            engagementSourceType = callEngagement.getEngagementSourceType();
            sq8.m48646e(engagementSourceType);
        } else {
            engagementSourceType = "ENGAGEMENT_ID";
        }
        ta6 ta6VarM49648a = ta6.f46712v.m49648a(id, engagementSourceType, engagementSummary);
        callEngagement.setEngagementOutcome(ta6VarM49648a);
        sq8.m48648g(q0(callEngagement).m55717M(new C17227t()).m55717M(new C17228u(ta6VarM49648a, engagementSummary, xk7Var)).w0(new C17229v(context, xk7Var), new C17230w(xk7Var), new jm() { // from class: o.nu1
            @Override // p001o.jm
            public final void run() {
                tu1.m50601X(xk7Var, engagementSummary);
            }
        }), "subscribe(...)");
    }

    /* renamed from: Y */
    public final void m50638Y(C17210c c17210c) {
        bt9 bt9Var = this.f47790a;
        String strM50643a = c17210c.m50643a();
        sq8.m48646e(strM50643a);
        LeadsSummary leadsSummaryM19753q = bt9Var.m19753q(new ey3(strM50643a, null, null, null, false, null, null, 126, null));
        final ActiveCall activeCallBuild = ActiveCall.builder().isActiveCall(Boolean.valueOf(c17210c.m50645c())).phoneNumber(c17210c.m50643a()).tasks(c17210c.m50644b()).leadSummary(leadsSummaryM19753q).build();
        boolean zM50645c = c17210c.m50645c();
        String strM50643a2 = c17210c.m50643a();
        Tasks tasksM50644b = c17210c.m50644b();
        StringBuilder sb = new StringBuilder();
        sb.append("notifying fragments with call state: ");
        sb.append(zM50645c);
        sb.append(" with number ");
        sb.append(strM50643a2);
        sb.append(", task: ");
        sb.append(tasksM50644b);
        sb.append(", leads: ");
        sb.append(leadsSummaryM19753q);
        j0f.m33008i(new Runnable() { // from class: o.mu1
            @Override // java.lang.Runnable
            public final void run() {
                tu1.m50602Z(activeCallBuild);
            }
        });
    }

    public final void a0(med medVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("received request for popup ");
        sb.append(medVar);
        String strM38842f = medVar.m38842f();
        int iHashCode = strM38842f.hashCode();
        if (iHashCode == -1642400492) {
            if (strM38842f.equals("SHOW_SCREENING")) {
                H0(medVar);
                return;
            }
            return;
        }
        if (iHashCode != -1544306632) {
            if (iHashCode == 190817561 && strM38842f.equals("HIDE_SCREENING")) {
                f0(medVar);
                return;
            }
            return;
        }
        if (strM38842f.equals("SHOW_CALL_DISPOSITION")) {
            I0(medVar);
            Tasks tasksM38843g = medVar.m38843g();
            if (sq8.m48644c(tasksM38843g != null ? tasksM38843g.getEngagementSourceType() : null, "WEB")) {
                if (medVar.m38843g().getId() != null) {
                    x5j.m55675j(medVar.m38843g().getId(), "COMPLETED");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected flow for a request to reach here without taskid with input: ");
                sb2.append(medVar);
            }
        }
    }

    public final x6c b0(final CallEngagement callEngagement, final ta6 ta6Var, final EngagementSummary engagementSummary, xk7 xk7Var) {
        x6c x6cVarM55706q = x6c.m55706q(new m8c() { // from class: o.su1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                tu1.c0(callEngagement, ta6Var, engagementSummary, this, q7cVar);
            }
        });
        sq8.m48648g(x6cVarM55706q, "create(...)");
        return x6cVarM55706q;
    }

    public final void e0(Context context, CallEngagement callEngagement, EngagementSummary engagementSummary, xk7 xk7Var) {
        rz1 callRecording = callEngagement.getCallRecording();
        if (callRecording != null) {
            sq8.m48648g(y0(callEngagement).m55717M(new c0(context, callRecording)).m55717M(new d0(callEngagement, this)).m55717M(new e0(engagementSummary)).m55717M(new f0(callEngagement, this)).v0(new g0(xk7Var, engagementSummary), new h0(xk7Var)), "subscribe(...)");
        }
    }

    public final void f0(final med medVar) {
        j0f.m33008i(new Runnable() { // from class: o.pu1
            @Override // java.lang.Runnable
            public final void run() {
                tu1.g0(medVar);
            }
        });
    }

    public final void h0(final med medVar, final Leads leads) {
        j0f.m33008i(new Runnable() { // from class: o.cu1
            @Override // java.lang.Runnable
            public final void run() {
                tu1.i0(medVar, leads);
            }
        });
    }

    public final boolean j0(Context context, CallConnectStatus callConnectStatus) {
        AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
        if (j4d.m33204K(context)) {
            return true;
        }
        if (j4d.o0(context) && callConnectStatus == CallConnectStatus.CONNECTED) {
            return true;
        }
        return autoCallConfigM54443I != null && autoCallConfigM54443I.getDisposeAllCalls();
    }

    public final void k0(CallEvent callEvent, boolean z) {
        p74.f39487a.m43079g(new i0(callEvent, z, null));
    }

    public final void l0(String str, boolean z, CallEngagement callEngagement) {
        m50633R(new C17210c(str, z, callEngagement != null ? callEngagement.toTasks() : null));
    }

    public final x6c m0(final CallEngagement callEngagement) {
        x6c x6cVarM55697U = x6c.m55697U(new Callable() { // from class: o.qu1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tu1.n0(callEngagement, this);
            }
        });
        sq8.m48648g(x6cVarM55697U, "fromCallable(...)");
        return x6cVarM55697U;
    }

    public final x6c q0(final CallEngagement callEngagement) {
        x6c x6cVarM55697U = x6c.m55697U(new Callable() { // from class: o.bu1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tu1.r0(callEngagement);
            }
        });
        sq8.m48648g(x6cVarM55697U, "fromCallable(...)");
        return x6cVarM55697U;
    }

    public final void s0(CallEvent callEvent, CallEngagement callEngagement) {
        if (callEngagement != null) {
            m50632Q(new rcj(callEngagement, callEvent != null ? callEvent.getContext() : null, "CREATE", null, 8, null));
        }
        if (sq8.m48644c(callEvent != null ? callEvent.getSource() : null, "CALL_LOG_SYNC")) {
            return;
        }
        t0(callEvent, callEngagement);
    }

    public final void t0(CallEvent callEvent, CallEngagement callEngagement) {
        if (!j0(callEvent != null ? callEvent.getContext() : null, callEvent != null ? callEvent.getCallConnectStatus() : null)) {
            if (callEvent != null) {
                AutoCallConfig autoCallConfigM54443I = wi0.m54443I();
                if (((Boolean) azh.m18051d(f47787n).remove(callEngagement != null ? callEngagement.getId() : null)) == null && autoCallConfigM54443I != null && autoCallConfigM54443I.getAutoCallMode()) {
                    C1670a c1670a = new C1670a();
                    Context context = callEvent.getContext();
                    sq8.m48646e(context);
                    c1670a.v0(context, callEngagement != null ? callEngagement.toTasks() : null);
                    return;
                }
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                String number = callEvent.getNumber();
                if (number != null) {
                    firebaseCrashlytics.setCustomKey("contactNumber", number);
                }
                firebaseCrashlytics.recordException(new RuntimeException("CallLogEvent: postCallPopup Lead Not Found"));
                sq8.m48646e(firebaseCrashlytics);
                return;
            }
            return;
        }
        Tasks tasks = callEngagement != null ? callEngagement.toTasks() : null;
        if (tasks != null) {
            String direction = callEvent != null ? callEvent.getDirection() : null;
            String number2 = callEvent != null ? callEvent.getNumber() : null;
            sq8.m48646e(number2);
            ey3 ey3Var = new ey3(number2, null, null, null, false, null, null, 126, null);
            if (sq8.m48644c(direction, CallDirection.INCOMING.name())) {
                ey3Var.m25842h(lw9.f34447b);
            } else {
                ey3Var.m25842h(lw9.f34448c);
            }
            ey3Var.m25843i(callEvent.getSubscriptionId());
            LeadsSummary leadsSummaryM19753q = this.f47790a.m19753q(ey3Var);
            Leads leads = leadsSummaryM19753q != null ? leadsSummaryM19753q.toLeads() : null;
            if (callEvent.getContext() != null && leads != null) {
                m50634S(new med.C15299a().m38850g("SHOW_CALL_DISPOSITION").m38847d(callEvent.getContext()).m38844a(new C1670a()).m38848e(leads).m38849f(callEvent.getNumber()).m38851h(tasks).m38845b());
                return;
            }
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics2.setCustomKey("contactNumber", ey3Var.m25836b());
            firebaseCrashlytics2.recordException(new RuntimeException("CallLogEvent: postCallPopup Lead Not Found"));
            sq8.m48646e(firebaseCrashlytics2);
        }
    }

    public final void u0(Context context, CallEngagement callEngagement) {
        sq8.m48649h(context, "context");
        if (callEngagement != null) {
            m50632Q(new rcj(callEngagement, context, "UPDATE", null, 8, null));
        }
    }

    public final void v0(ey3 ey3Var) {
        sq8.m48649h(ey3Var, "number");
        p74.f39487a.m43078f(f47781h, new k0(ey3Var, null));
    }

    public final void w0() {
        p74.f39487a.m43078f(f47781h, new l0(null));
    }

    public final void x0() {
        p74.f39487a.m43078f(f47781h, new m0(null));
    }

    public final x6c y0(final CallEngagement callEngagement) {
        x6c x6cVarM55697U = x6c.m55697U(new Callable() { // from class: o.lu1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tu1.A0(callEngagement);
            }
        });
        sq8.m48648g(x6cVarM55697U, "fromCallable(...)");
        return x6cVarM55697U;
    }

    public final x6c z0(final ta6 ta6Var) {
        x6c x6cVarM55697U = x6c.m55697U(new Callable() { // from class: o.ku1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tu1.B0(ta6Var);
            }
        });
        sq8.m48648g(x6cVarM55697U, "fromCallable(...)");
        return x6cVarM55697U;
    }
}
