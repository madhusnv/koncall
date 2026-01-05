package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.onesignal.OneSignalSubscriptionManager;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AbstractC2145n;
import androidx.work.ExistingPeriodicWorkPolicy;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserStatus;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import com.onesignal.OneSignal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class uni implements ni, bl, qpi {

    /* renamed from: z */
    public static uni f49243z;

    /* renamed from: f */
    public String f49244f;

    /* renamed from: g */
    public String f49245g;

    /* renamed from: h */
    public final hpb f49246h = new hpb();

    /* renamed from: i */
    public final z9b f49247i;

    /* renamed from: j */
    public cz4 f49248j;

    /* renamed from: k */
    public em f49249k;

    /* renamed from: l */
    public jq2 f49250l;

    /* renamed from: m */
    public n9c f49251m;

    /* renamed from: n */
    public n9c f49252n;

    /* renamed from: o */
    public PropertyDefinitionRepository f49253o;

    /* renamed from: p */
    public fg f49254p;

    /* renamed from: q */
    public List f49255q;

    /* renamed from: r */
    public hpb f49256r;

    /* renamed from: s */
    public Context f49257s;

    /* renamed from: t */
    public mii f49258t;

    /* renamed from: u */
    public gi9 f49259u;

    /* renamed from: v */
    public pif f49260v;

    /* renamed from: w */
    public final List f49261w;

    /* renamed from: x */
    public final mi8 f49262x;

    /* renamed from: y */
    public static final ReentrantReadWriteLock f49242y = new ReentrantReadWriteLock();

    /* renamed from: A */
    public static final tji f49240A = tji.f47295d.m50080a();

    /* renamed from: B */
    public static final gci f49241B = gci.f24985b.m28455a();

    /* renamed from: o.uni$a */
    public class C17415a implements m9c {
        public C17415a() {
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
        }

        @Override // p001o.m9c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo16560e(mii miiVar) {
            uni.this.fC(miiVar);
        }

        @Override // p001o.m9c
        public void onComplete() {
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
        }
    }

    /* renamed from: o.uni$b */
    public class C17416b implements m9c {

        /* renamed from: a */
        public final /* synthetic */ AuthorizationLevel f49264a;

        public C17416b(AuthorizationLevel authorizationLevel) {
            this.f49264a = authorizationLevel;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
        }

        @Override // p001o.m9c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo16560e(mii miiVar) {
            if (miiVar.m39162l() != this.f49264a) {
                Optional.ofNullable(uni.this.f49249k).ifPresent(new lmi());
            }
        }

        @Override // p001o.m9c
        public void onComplete() {
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
        }
    }

    /* renamed from: o.uni$c */
    public class C17417c implements m9c {
        public C17417c() {
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
        }

        @Override // p001o.m9c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo16560e(mii miiVar) {
        }

        @Override // p001o.m9c
        public void onComplete() {
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
        }
    }

    public uni() {
        z9b z9bVar = new z9b();
        this.f49247i = z9bVar;
        this.f49255q = new ArrayList();
        this.f49256r = new hpb();
        this.f49259u = si9.m48360a(new uk7() { // from class: o.sli
            @Override // p001o.uk7
            public final Object invoke() {
                return Collections.emptyList();
            }
        });
        this.f49260v = pif.m43749s();
        this.f49261w = t3c.m49220a(new Object[]{new ja1()});
        this.f49262x = new mi8();
        this.f49253o = PropertyDefinitionRepository.o0();
        this.f49254p = new fg();
        this.f49260v = pif.m43749s();
        this.f49248j = new cz4(z9bVar);
    }

    public static /* synthetic */ x6c AC(mpi mpiVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error in creating instance");
        sb.append(mpiVar);
        return x6c.m55694H(new nmd(mpiVar));
    }

    public static /* synthetic */ void AD(Context context) {
        hv1.f27574f.m31195a().m31175C(context);
        ife.f28606f.m32075a().m32073m(context);
        fia.f23398f.m26768a().m26766p(context);
    }

    public static /* synthetic */ x8c BC(final mpi mpiVar, Optional optional) {
        if (hq9.m30994a(optional)) {
            mpiVar.m39501b(Boolean.FALSE);
            mpiVar.m39500a("Not able to get the instance.");
        }
        return (x8c) optional.map(new Function() { // from class: o.nki
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x6c.c0((uni) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.oki
            @Override // java.util.function.Supplier
            public final Object get() {
                return uni.AC(mpiVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void BD(final AbstractC2145n abstractC2145n, FirebaseCrashlytics firebaseCrashlytics, AppCompatActivity appCompatActivity) {
        Optional optionalOfNullable = Optional.ofNullable(this.f49252n);
        Objects.requireNonNull(abstractC2145n);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.tmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                abstractC2145n.removeObserver((n9c) obj);
            }
        });
        n9c n9cVarJB = JB(firebaseCrashlytics);
        this.f49252n = n9cVarJB;
        abstractC2145n.observe(appCompatActivity, n9cVarJB);
    }

    public static /* synthetic */ void CC(final mpi mpiVar, final q7c q7cVar) {
        x6c x6cVarY0 = x6c.c0(UD()).m55717M(new rl7() { // from class: o.mmi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return uni.BC(mpiVar, (Optional) obj);
            }
        }).h0(i5f.m31599c()).y0(i5f.m31599c());
        Objects.requireNonNull(q7cVar);
        q7cVar.mo28141d(x6cVarY0.w0(new gu3() { // from class: o.xmi
            @Override // p001o.gu3
            public final void accept(Object obj) {
                q7cVar.mo16430e((uni) obj);
            }
        }, new gu3() { // from class: o.ini
            @Override // p001o.gu3
            public final void accept(Object obj) {
                q7cVar.onError((Throwable) obj);
            }
        }, new jm() { // from class: o.tni
            @Override // p001o.jm
            public final void run() {
                q7cVar.onComplete();
            }
        }));
    }

    public static /* synthetic */ void CD(String str, OneSignalSubscriptionManager oneSignalSubscriptionManager) {
        try {
            oneSignalSubscriptionManager.subscribe(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Subscription successful for userId: ");
            sb.append(str);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Subscription failed for userId: ");
            sb2.append(str);
        }
    }

    public static /* synthetic */ void DC(Context context) {
        wee.f51856a.m54267a().m54264c(context);
    }

    public static /* synthetic */ void DD(final String str) {
        OneSignalSubscriptionManager.getInstance().ifPresent(new Consumer() { // from class: o.vji
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.CD(str, (OneSignalSubscriptionManager) obj);
            }
        });
    }

    public static /* synthetic */ void EC() {
    }

    public static /* synthetic */ void FC(uni uniVar, w60 w60Var) {
        w60Var.m53999e(uniVar.f49257s);
    }

    public static /* synthetic */ void GC(final uni uniVar) {
        Optional.ofNullable(uniVar.f49249k).ifPresent(new Consumer() { // from class: o.dki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((em) obj).m25251z();
            }
        });
        Optional.ofNullable(uniVar.f49250l).ifPresent(new Consumer() { // from class: o.eki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((jq2) obj).j0();
            }
        });
        Optional.ofNullable(uniVar.f49248j).ifPresent(new Consumer() { // from class: o.fki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cz4) obj).d1();
            }
        });
        Optional optionalOfNullable = Optional.ofNullable(uniVar.f49251m);
        final z9b z9bVar = uniVar.f49247i;
        Objects.requireNonNull(z9bVar);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.gki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z9bVar.removeObserver((n9c) obj);
            }
        });
        Optional.ofNullable(uniVar.f49254p).ifPresent(new Consumer() { // from class: o.hki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((fg) obj).m26632q();
            }
        });
        Optional.ofNullable(uniVar.f49253o).ifPresent(new Consumer() { // from class: o.iki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PropertyDefinitionRepository) obj).m222V();
            }
        });
        Optional optionalOfNullable2 = Optional.ofNullable(uniVar.f49252n);
        hpb hpbVar = uniVar.f49246h;
        Objects.requireNonNull(hpbVar);
        optionalOfNullable2.ifPresent(new kki(hpbVar));
        Optional.ofNullable(w60.m53996b()).ifPresent(new Consumer() { // from class: o.lki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.FC(this.f33978a, (w60) obj);
            }
        });
        MB();
        uniVar.f49256r = null;
        uniVar.f49255q = null;
        uniVar.f49248j = null;
        uniVar.f49249k = null;
        uniVar.f49250l = null;
        uniVar.f49254p = null;
        uniVar.f49252n = null;
        uniVar.f49247i.removeSource(uniVar.f49246h);
        uniVar.f49246h.setValue(null);
        uniVar.f49247i.setValue(null);
        uniVar.f49253o = null;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        tji tjiVar = f49240A;
        Objects.requireNonNull(tjiVar);
        executorServiceNewSingleThreadExecutor.execute(new mki(tjiVar));
        uniVar.f49260v = pif.m43749s();
        cee.f18007d.mo30510f();
        cee.f18008e.mo30510f();
        tr.f47625d.mo30510f();
        swd.f46036b.mo30510f();
    }

    public static /* synthetic */ u91 HC(ryh ryhVar) {
        return new u91((String) ryhVar.f44265a, (String) ryhVar.f44266b);
    }

    public static /* synthetic */ RuntimeException IC() {
        return new RuntimeException("Couldn't find active user signed-in");
    }

    public static /* synthetic */ void JC() {
        if (f49243z == null) {
            uni uniVar = new uni();
            uniVar.jC();
            StringBuilder sb = new StringBuilder();
            sb.append("User profile repository initialization status: ");
            sb.append(uniVar.f49262x);
            if (uniVar.f49262x.m39112a()) {
                f49243z = uniVar;
            }
        }
    }

    public static synchronized void KB(final jm jmVar) {
        j01.f29455d.m32992a().m32990s(new uk7() { // from class: o.zli
            @Override // p001o.uk7
            public final Object invoke() {
                return uni.zC(jmVar);
            }
        });
    }

    public static /* synthetic */ void KC(Throwable th) {
        throw new RuntimeException(th);
    }

    public static x6c LB() {
        final mpi mpiVar = new mpi(Boolean.TRUE, null);
        return x6c.m55706q(new m8c() { // from class: o.uki
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                uni.CC(mpiVar, q7cVar);
            }
        }).h0(i5f.m31599c()).y0(i5f.m31599c());
    }

    public static /* synthetic */ void LC() {
        f49242y.writeLock().unlock();
    }

    public static void MB() {
        o4h.m41543G();
        daa.m22690g();
        lpi.m37613N();
        lyi.m38109d();
    }

    public static /* synthetic */ void MC() {
        if (f49243z == null) {
            f49242y.writeLock().lock();
            ayh.Z2(new o83() { // from class: o.pki
                @Override // p001o.o83
                public final void run() {
                    uni.JC();
                }
            }).q1(new Consumer() { // from class: o.qki
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    uni.KC((Throwable) obj);
                }
            }).h3(new Runnable() { // from class: o.rki
                @Override // java.lang.Runnable
                public final void run() {
                    uni.LC();
                }
            });
        }
    }

    public static /* synthetic */ void NC(Throwable th) {
        throw new RuntimeException(th);
    }

    public static synchronized void OB() {
        uni uniVar = f49243z;
        f49243z = null;
        Optional.ofNullable(uniVar).ifPresent(new Consumer() { // from class: o.jki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.GC((uni) obj);
            }
        });
    }

    public static /* synthetic */ ryh OC(ryh ryhVar) {
        return uyh.of((String) ryhVar.m47301h(), (String) ryhVar.m47300g());
    }

    public static String PB(String str) {
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        Objects.requireNonNull(prefsM127c);
        String strV0 = prefsM127c.v0();
        return StringUtils.isBlank(strV0) ? str : strV0;
    }

    public static /* synthetic */ RuntimeException PC() {
        return new RuntimeException("SimManager isn't instantiated");
    }

    public static boolean QB(AccountMembership accountMembership) {
        return UserStatus.ACTIVE.equals(accountMembership.getUserAccountStatus());
    }

    public static /* synthetic */ boolean QC(String str, mii miiVar) {
        return str.equals(miiVar.m39156f().getId());
    }

    public static boolean RB(AccountMembership accountMembership) {
        return UserStatus.ACTIVE.equals(accountMembership.getUserAccountStatus()) || UserStatus.APPROVED.equals(accountMembership.getUserAccountStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ mii RC(String str) {
        return new mii(this.f49244f, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void SC(l1 l1Var) {
        this.f49247i.setValue(l1Var);
    }

    public static void SD() {
        j0f.m33008i(new Runnable() { // from class: o.wmi
            @Override // java.lang.Runnable
            public final void run() {
                uni.OB();
            }
        });
    }

    public static u91 UB() {
        return (u91) YB().map(new Function() { // from class: o.qli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return uni.HC((ryh) obj);
            }
        }).orElseThrow(new Supplier() { // from class: o.bmi
            @Override // java.util.function.Supplier
            public final Object get() {
                return uni.IC();
            }
        });
    }

    public static /* synthetic */ void UC(mii miiVar) {
        tji.f47295d.m50080a().m50077N(miiVar.m39156f().getId());
    }

    public static Optional UD() {
        return Optional.ofNullable(XB());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x8c VC(List list) {
        return list.isEmpty() ? x6c.m55694H(new RuntimeException("No profile found.")) : x6c.c0(uyh.of(list, GB(Optional.of(list))));
    }

    public static void VD(String str) {
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        Objects.requireNonNull(prefsM127c);
        prefsM127c.Y1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void WC(m9c m9cVar, ryh ryhVar) {
        this.f49255q = (List) ryhVar.m47300g();
        IB((mii) ryhVar.m47301h());
        QD();
        m9cVar.mo16560e((mii) ryhVar.m47301h());
    }

    public static uni XB() {
        ayh.Z2(new o83() { // from class: o.bki
            @Override // p001o.o83
            public final void run() {
                uni.MC();
            }
        }).q1(new Consumer() { // from class: o.cki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.NC((Throwable) obj);
            }
        });
        return f49243z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void XC(m9c m9cVar, Throwable th) {
        this.f49260v.mo43750r(Boolean.FALSE);
        FirebaseCrashlytics.getInstance().recordException(th);
        m9cVar.onError(th);
    }

    public static Optional YB() {
        return Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.zji
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Prefs) obj).m3242d();
            }
        }).map(new Function() { // from class: o.aki
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return uni.OC((ryh) obj);
            }
        });
    }

    public static synchronized void YD(final jm jmVar) {
        yt1.m58188a(Optional.ofNullable(f49243z), new Consumer() { // from class: o.ski
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.yD(jmVar, (uni) obj);
            }
        }, new Runnable() { // from class: o.tki
            @Override // java.lang.Runnable
            public final void run() {
                uni.KB(jmVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List ZC() {
        return tji.f47295d.m50080a().m50079Y(this.f49244f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aD(FirebaseAnalytics firebaseAnalytics) {
        firebaseAnalytics.setUserId(this.f49244f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bD(l1 l1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("Active Service has changed");
        sb.append(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cD() {
        Optional.of(AnalyticsKt.getAnalytics(Firebase.INSTANCE)).ifPresent(new Consumer() { // from class: o.nni
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f37082a.aD((FirebaseAnalytics) obj);
            }
        });
        this.f49247i.observeForever(new n9c() { // from class: o.oni
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f38639a.bD((l1) obj);
            }
        });
        this.f49247i.addSource(this.f49246h, new n9c() { // from class: o.pni
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f40315a.fC((mii) obj);
            }
        });
    }

    public static ryh dC(String str) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) ja8.f30035c.fromJson(new String(Base64.decode(str.split("\\.")[1], 8), StandardCharsets.UTF_8), LinkedHashMap.class);
            return uyh.of((String) linkedHashMap.get("userId"), (String) linkedHashMap.get("phone_number"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dD() {
        j0f.m33008i(new Runnable() { // from class: o.mni
            @Override // java.lang.Runnable
            public final void run() {
                this.f35762a.cD();
            }
        });
        iC(new C17415a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eD(String str) {
        this.f49262x.m39114c(Boolean.TRUE);
        ryh ryhVarDC = dC(str);
        this.f49244f = (String) ryhVarDC.m47300g();
        this.f49245g = (String) ryhVarDC.m47301h();
        Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        Objects.requireNonNull(prefsM127c);
        prefsM127c.D0(this.f49244f);
        dE(this.f49244f);
        this.f49259u = si9.m48360a(new uk7() { // from class: o.eni
            @Override // p001o.uk7
            public final Object invoke() {
                return this.f21964a.ZC();
            }
        });
        i5f.m31599c().mo20302c(new Runnable() { // from class: o.fni
            @Override // java.lang.Runnable
            public final void run() {
                this.f23745a.dD();
            }
        });
        this.f49260v.get(1L, TimeUnit.MINUTES);
    }

    public static /* synthetic */ void fD(Throwable th) {
    }

    public static synchronized boolean gC() {
        return Optional.ofNullable(f49243z).isPresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gD(final String str) {
        ayh.Z2(new o83() { // from class: o.cmi
            @Override // p001o.o83
            public final void run() {
                this.f18360a.eD(str);
            }
        }).q1(new Consumer() { // from class: o.dmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.fD((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hD() {
        this.f49262x.m39114c(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ User iD() {
        StringBuilder sb = new StringBuilder();
        sb.append("User not found in cache, fetching from backend for userId: ");
        sb.append(this.f49244f);
        return (User) Os(this.f49244f).m47698c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ mii jD(User user, AccountMembership accountMembership) {
        return HD(accountMembership, (User) Optional.ofNullable(accountMembership.getUser()).orElse(user));
    }

    public static uni kC() {
        return (uni) p74.f39487a.m43081i(new uk7() { // from class: o.fli
            @Override // p001o.uk7
            public final Object invoke() {
                return uni.XB();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List kD() {
        long jNanoTime = System.nanoTime();
        final User user = (User) f49241B.m28449f(this.f49244f).orElseGet(new Supplier() { // from class: o.qni
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f42221a.iD();
            }
        });
        if (user == null) {
            throw new RuntimeException("User not found in the repository for userId: " + this.f49244f);
        }
        List list = (List) f49240A.m50079Y(this.f49244f).stream().filter(new Predicate() { // from class: o.rni
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.RB((AccountMembership) obj);
            }
        }).map(new Function() { // from class: o.sni
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45692a.jD(user, (AccountMembership) obj);
            }
        }).collect(Collectors.toList());
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        StringBuilder sb = new StringBuilder();
        sb.append("loadAllProfiles() took ");
        sb.append(millis);
        sb.append(" ms");
        return list;
    }

    public static /* synthetic */ boolean lC(AccountMembership accountMembership) {
        return accountMembership.getAccount().getAccountType() != AccountType.INDIVIDUAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lD(p01 p01Var) {
        p01Var.mo33434a(SB());
    }

    public static /* synthetic */ Optional mC(List list) {
        return list.stream().findAny();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mD(p01 p01Var, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception in delegating to listener: ");
        sb.append(p01Var.getClass().getCanonicalName());
    }

    public static /* synthetic */ Optional nC(Optional optional) {
        return optional;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nD(final p01 p01Var) {
        ayh.Z2(new o83() { // from class: o.xli
            @Override // p001o.o83
            public final void run() {
                this.f53906a.lD(p01Var);
            }
        }).q1(new Consumer() { // from class: o.yli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f55689a.mD(p01Var, (Throwable) obj);
            }
        });
    }

    public static /* synthetic */ boolean oC(String str, String str2) {
        return Objects.equals(str2, str);
    }

    public static /* synthetic */ boolean pC(Optional optional, final String str) {
        return !optional.filter(new Predicate() { // from class: o.kmi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.oC(str, (String) obj);
            }
        }).isPresent();
    }

    public static /* synthetic */ boolean qC(String str, String str2) {
        return Objects.equals(str2, str);
    }

    public static /* synthetic */ boolean rC(String str, AccountMembership accountMembership) {
        return str.equals(accountMembership.getAccount().getId());
    }

    public static /* synthetic */ boolean sC(AccountMembership accountMembership) {
        return accountMembership.getAccount().getAccountType() != AccountType.INDIVIDUAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sD(Account account) {
        wee.f51856a.m54267a().m54266f(this.f49257s.getApplicationContext(), account.getId(), this.f49244f, SuperfoneApplication.f225c.m127c(), ExistingPeriodicWorkPolicy.KEEP);
    }

    public static /* synthetic */ boolean tC(String str, mii miiVar) {
        return miiVar.m39156f().getId().equals(str);
    }

    public static /* synthetic */ mii uC(final String str, List list) {
        return (mii) list.stream().filter(new Predicate() { // from class: o.imi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.tC(str, (mii) obj);
            }
        }).findFirst().orElse((mii) list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uD() {
        this.f49256r.setValue(this.f49255q);
    }

    public static /* synthetic */ boolean vC(AccountMembership accountMembership) {
        return accountMembership.getAccount().getAccountType() == AccountType.INDIVIDUAL;
    }

    public static /* synthetic */ boolean vD(String str, mii miiVar) {
        return miiVar.m39156f().getId().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wC(mii miiVar, Prefs prefs) {
        prefs.E0(miiVar.m39171u().getId(), miiVar.m39156f().getId());
        prefs.W0(miiVar.m39156f().getDealMode());
        cC().f0();
        nt6.m41112f().m41120l(miiVar.m39161k().jB().booleanValue());
        nt6.m41112f().m41123o(miiVar.m39161k().zC().booleanValue());
        nt6.m41112f().m41122n(miiVar.m39161k().rC().booleanValue());
    }

    public static /* synthetic */ void wD(uni uniVar) {
        Optional optionalOfNullable = Optional.ofNullable(uniVar.f49245g);
        final Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
        Objects.requireNonNull(prefsM127c);
        optionalOfNullable.ifPresent(new Consumer() { // from class: o.gni
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                prefsM127c.k1((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xC(mii miiVar) {
        this.f49246h.setValue(miiVar);
    }

    public static /* synthetic */ void yC(FirebaseCrashlytics firebaseCrashlytics, mii miiVar) {
        if (miiVar == null || firebaseCrashlytics == null) {
            return;
        }
        User userM39171u = miiVar.m39171u();
        if (userM39171u != null) {
            firebaseCrashlytics.setCustomKey("userName", userM39171u.getName());
        }
        String strM39160j = miiVar.m39160j();
        if (strM39160j != null) {
            firebaseCrashlytics.setCustomKey("accountName", strM39160j);
        }
        if (miiVar.m39156f() == null || miiVar.m39156f().getId() == null) {
            return;
        }
        firebaseCrashlytics.setCustomKey("accountId", miiVar.m39156f().getId());
    }

    public static /* synthetic */ void yD(final jm jmVar, final uni uniVar) {
        ayh.Z2(new o83() { // from class: o.nmi
            @Override // p001o.o83
            public final void run() {
                uni.wD(this.f37053a);
            }
        }).h3(new Runnable() { // from class: o.omi
            @Override // java.lang.Runnable
            public final void run() {
                uni.KB(jmVar);
            }
        });
    }

    public static /* synthetic */ y3i zC(jm jmVar) {
        uni uniVar = f49243z;
        if (uniVar != null && uniVar.f49262x.m39112a()) {
            f49243z.gE();
            f49243z.fE();
            f49243z.NB();
            f49243z.bE();
        }
        SD();
        try {
            jmVar.run();
        } catch (Throwable unused) {
        }
        return y3i.f54824a;
    }

    public List ED() {
        return this.f49255q;
    }

    public AbstractC2145n FD() {
        return this.f49256r;
    }

    public mii GB(Optional optional) {
        final Set set = (Set) ((List) this.f49259u.getValue()).stream().filter(new vki()).filter(new Predicate() { // from class: o.cli
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.lC((AccountMembership) obj);
            }
        }).map(new zki()).map(new ali()).collect(Collectors.toSet());
        Optional optionalFindFirst = set.stream().findFirst();
        final Optional optionalHB = HB(optional);
        if (!optionalFindFirst.isPresent()) {
            optionalFindFirst = optionalHB;
        }
        if (!optionalFindFirst.isPresent()) {
            throw new RuntimeException("No Active Account Membership Found For The User");
        }
        String str = (String) optional.map(new Function() { // from class: o.dli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return uni.mC((List) obj);
            }
        }).flatMap(new Function() { // from class: o.eli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return uni.nC((Optional) obj);
            }
        }).map(new Function() { // from class: o.gli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((mii) obj).m39171u();
            }
        }).map(new Function() { // from class: o.hli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((User) obj).getLastSelectedAccountWeb();
            }
        }).filter(new Predicate() { // from class: o.ili
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.pC(optionalHB, (String) obj);
            }
        }).filter(new Predicate() { // from class: o.jli
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return set.contains((String) obj);
            }
        }).orElse((String) optionalFindFirst.get());
        final String strPB = PB("");
        final String str2 = optionalHB.filter(new Predicate() { // from class: o.wki
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.qC(strPB, (String) obj);
            }
        }).isPresent() ? (String) optionalFindFirst.orElse(strPB) : strPB;
        final String str3 = (String) ((List) this.f49259u.getValue()).stream().filter(new Predicate() { // from class: o.xki
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.rC(str2, (AccountMembership) obj);
            }
        }).filter(new vki()).filter(new Predicate() { // from class: o.yki
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.sC((AccountMembership) obj);
            }
        }).map(new zki()).map(new ali()).findFirst().orElse(str);
        if (!Objects.equals(str3, strPB)) {
            VD(str3);
        }
        return (mii) optional.map(new Function() { // from class: o.bli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return uni.uC(str3, (List) obj);
            }
        }).orElse(eC(str3));
    }

    public final x6c GD() {
        return x6c.m55697U(new Callable() { // from class: o.kni
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32490a.kD();
            }
        }).y0(i5f.m31599c());
    }

    public final Optional HB(Optional optional) {
        return ((List) this.f49259u.getValue()).stream().filter(new vki()).filter(new Predicate() { // from class: o.hmi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.vC((AccountMembership) obj);
            }
        }).map(new zki()).map(new ali()).findFirst();
    }

    public final mii HD(AccountMembership accountMembership, User user) {
        return new mii(accountMembership, accountMembership.getAccount(), user);
    }

    public final void IB(final mii miiVar) {
        this.f49258t = miiVar;
        miiVar.m39161k().qC();
        miiVar.m39161k().lB().m42068I();
        Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.pmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f40279a.wC(miiVar, (Prefs) obj);
            }
        });
        j0f.m33008i(new Runnable() { // from class: o.qmi
            @Override // java.lang.Runnable
            public final void run() {
                this.f42180a.xC(miiVar);
            }
        });
    }

    public void ID(final AppCompatActivity appCompatActivity) {
        XD(appCompatActivity.getApplicationContext());
        hE(appCompatActivity.getApplicationContext());
        ZD(appCompatActivity);
        aE(appCompatActivity);
        KD();
        OD();
        MD();
        ND();
        TD();
        LD();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        tji tjiVar = f49240A;
        Objects.requireNonNull(tjiVar);
        executorServiceNewSingleThreadExecutor.execute(new mki(tjiVar));
        this.f49261w.forEach(new Consumer() { // from class: o.mli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f35669a.nD((p01) obj);
            }
        });
        i5f.m31600d().mo20303d(new Runnable() { // from class: o.nli
            @Override // java.lang.Runnable
            public final void run() {
                this.f37025a.oD(appCompatActivity);
            }
        }, 1000L, TimeUnit.MILLISECONDS);
    }

    public final n9c JB(final FirebaseCrashlytics firebaseCrashlytics) {
        return new n9c() { // from class: o.hni
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                uni.yC(firebaseCrashlytics, (mii) obj);
            }
        };
    }

    public void JD() {
        synchronized (uni.class) {
            iC(new C17416b(SB().m39162l()));
        }
    }

    public final void KD() {
        final hv1 hv1VarM31195a = hv1.f27574f.m31195a();
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Optional.ofNullable(c0044a.m127c()).ifPresent(new Consumer() { // from class: o.jmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Prefs) obj).m3239a(hv1VarM31195a);
            }
        });
        hv1VarM31195a.m31190v(this.f49257s.getApplicationContext(), c0044a.m127c());
    }

    public final void LD() {
        final kc3 kc3VarM35385a = kc3.f31903e.m35385a();
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Optional.ofNullable(c0044a.m127c()).ifPresent(new Consumer() { // from class: o.vli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Prefs) obj).m3239a(kc3VarM35385a);
            }
        });
        kc3VarM35385a.m35378k(c0044a.m127c());
    }

    public final void MD() {
        final bt9 bt9VarM19757a = bt9.f16783b.m19757a();
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Optional.ofNullable(c0044a.m127c()).ifPresent(new Consumer() { // from class: o.ami
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Prefs) obj).m3239a(bt9VarM19757a);
            }
        });
        bt9VarM19757a.m19746C(c0044a.m127c(), c0044a.m128d(), this.f49257s.getApplicationContext());
    }

    public final void NB() {
        yt1.m58188a(Optional.ofNullable(this.f49257s).map(new umi()), new Consumer() { // from class: o.cni
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.DC((Context) obj);
            }
        }, new Runnable() { // from class: o.dni
            @Override // java.lang.Runnable
            public final void run() {
                uni.EC();
            }
        });
    }

    public final void ND() {
        Optional.ofNullable(SB()).map(new Function() { // from class: o.fmi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((mii) obj).m39156f();
            }
        }).ifPresent(new Consumer() { // from class: o.gmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f25508a.sD((Account) obj);
            }
        });
    }

    public final void OD() {
        final ife ifeVarM32075a = ife.f28606f.m32075a();
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Optional.ofNullable(c0044a.m127c()).ifPresent(new Consumer() { // from class: o.emi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Prefs) obj).m3239a(ifeVarM32075a);
            }
        });
        ifeVarM32075a.m32068g(this.f49257s.getApplicationContext(), c0044a.m127c());
    }

    public void PD(mii miiVar) {
        synchronized (uni.class) {
            hC();
            Optional.ofNullable(this.f49249k).ifPresent(new lmi());
        }
    }

    public final void QD() {
        j0f.m33008i(new Runnable() { // from class: o.lni
            @Override // java.lang.Runnable
            public final void run() {
                this.f34158a.uD();
            }
        });
    }

    public void RD() {
        Optional.ofNullable(this.f49254p).ifPresent(new Consumer() { // from class: o.lli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((fg) obj).m26627J();
            }
        });
    }

    public mii SB() {
        return (mii) Optional.ofNullable(this.f49258t).orElse((mii) ZB().getValue());
    }

    public l1 TB() {
        return (l1) this.f49247i.getValue();
    }

    public final void TD() {
        hv1 hv1VarM31195a = hv1.f27574f.m31195a();
        Context applicationContext = this.f49257s.getApplicationContext();
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        hv1VarM31195a.m31173A(applicationContext, c0044a.m127c());
        ife.f28606f.m32075a().m32072l(this.f49257s.getApplicationContext(), c0044a.m127c());
    }

    public jq2 VB() {
        return this.f49250l;
    }

    public Map WB() {
        return (Map) Optional.ofNullable(this.f49254p).map(new Function() { // from class: o.rli
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((fg) obj).m26633r();
            }
        }).orElse(Collections.emptyMap());
    }

    public void WD(final String str) {
        mii miiVarEC = eC(str);
        if (!UserStatus.ACTIVE.name().equals(miiVarEC.m39172v())) {
            throw new RuntimeException("Account membership is still pending confirmation from user");
        }
        MB();
        if (this.f49255q.stream().noneMatch(new Predicate() { // from class: o.kli
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.vD(str, (mii) obj);
            }
        })) {
            this.f49255q.add(miiVarEC);
        }
        miiVarEC.m39161k().wC(this.f49257s);
        IB(miiVarEC);
        VD(str);
    }

    public void XD(Context context) {
        this.f49257s = context;
        SB().m39161k().wC(context);
    }

    public AbstractC2145n ZB() {
        return this.f49246h;
    }

    public void ZD(AppCompatActivity appCompatActivity) {
        em emVarM25232n = em.m25232n(this);
        this.f49249k = emVarM25232n;
        emVarM25232n.m25249x(appCompatActivity);
    }

    public AbstractC2145n aC() {
        return this.f49247i;
    }

    public void aE(AppCompatActivity appCompatActivity) {
        jq2 jq2VarM34214E = jq2.m34214E(this);
        this.f49250l = jq2VarM34214E;
        jq2VarM34214E.h0(appCompatActivity);
    }

    public cz4 bC() {
        return this.f49248j;
    }

    public final void bE() {
        Optional.ofNullable(this.f49257s).map(new umi()).ifPresent(new Consumer() { // from class: o.vmi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uni.AD((Context) obj);
            }
        });
    }

    public itf cC() {
        return (itf) Optional.ofNullable(SuperfoneApplication.f225c.m128d()).orElseThrow(new Supplier() { // from class: o.oli
            @Override // java.util.function.Supplier
            public final Object get() {
                return uni.PC();
            }
        });
    }

    /* renamed from: cE, reason: merged with bridge method [inline-methods] */
    public final void oD(final AppCompatActivity appCompatActivity) {
        final AbstractC2145n abstractC2145nZB = ZB();
        final FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setUserId(this.f49244f);
        firebaseCrashlytics.setCustomKey("userId", this.f49244f);
        firebaseCrashlytics.setCustomKey("registeredNumber", this.f49245g);
        j0f.m33008i(new Runnable() { // from class: o.wli
            @Override // java.lang.Runnable
            public final void run() {
                this.f52320a.BD(abstractC2145nZB, firebaseCrashlytics, appCompatActivity);
            }
        });
    }

    public final void dE(final String str) {
        i5f.m31599c().mo20302c(new Runnable() { // from class: o.jni
            @Override // java.lang.Runnable
            public final void run() {
                uni.DD(str);
            }
        });
    }

    public final mii eC(final String str) {
        return (mii) this.f49255q.stream().filter(new Predicate() { // from class: o.rmi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return uni.QC(str, (mii) obj);
            }
        }).findFirst().orElseGet(new Supplier() { // from class: o.smi
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f45658a.RC(str);
            }
        });
    }

    public void eE() {
        Optional.ofNullable(this.f49254p).ifPresent(new Consumer() { // from class: o.pli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((fg) obj).m26631N();
            }
        });
    }

    public final void fC(final mii miiVar) {
        final l1 l1VarM39161k = miiVar.m39161k();
        j0f.m33008i(new Runnable() { // from class: o.wji
            @Override // java.lang.Runnable
            public final void run() {
                this.f52244a.SC(l1VarM39161k);
            }
        });
        l1VarM39161k.vC();
        this.f49253o.s1(l1VarM39161k);
        Optional.ofNullable(this.f49254p).ifPresent(new Consumer() { // from class: o.xji
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((fg) obj).m26630M(l1VarM39161k);
            }
        });
        i5f.m31600d().mo20302c(new Runnable() { // from class: o.yji
            @Override // java.lang.Runnable
            public final void run() {
                uni.UC(miiVar);
            }
        });
        this.f49262x.m39115d(l1VarM39161k.vB());
        mi8 mi8Var = this.f49262x;
        Boolean bool = Boolean.TRUE;
        mi8Var.m39113b(bool);
        this.f49260v.mo43750r(bool);
    }

    public final void fE() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setUserId("");
        firebaseCrashlytics.setCustomKey("registeredNumber", 0);
    }

    public final void gE() {
        OneSignal.logout();
    }

    public final void hC() {
        iC(new C17417c());
    }

    public void hE(Context context) {
        e60.f21028a.m24371a().m24370c(context);
    }

    public final synchronized void iC(final m9c m9cVar) {
        GD().m55717M(new rl7() { // from class: o.ymi
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f55712a.VC((List) obj);
            }
        }).w0(new gu3() { // from class: o.zmi
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f57421a.WC(m9cVar, (ryh) obj);
            }
        }, new gu3() { // from class: o.ani
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f15056a.XC(m9cVar, (Throwable) obj);
            }
        }, new jm() { // from class: o.bni
            @Override // p001o.jm
            public final void run() {
                m9cVar.onComplete();
            }
        });
    }

    public final void jC() {
        yt1.m58188a(j01.f29455d.m32992a().m32980g(), new Consumer() { // from class: o.tli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47403a.gD((String) obj);
            }
        }, new Runnable() { // from class: o.uli
            @Override // java.lang.Runnable
            public final void run() {
                this.f49097a.hD();
            }
        });
    }
}
