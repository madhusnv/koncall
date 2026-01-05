package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.p91;
import p001o.sgg;
import p001o.xia;

/* loaded from: classes5.dex */
public class v7i {

    /* renamed from: a */
    public final Context f49988a;

    /* renamed from: b */
    public final n91 f49989b;

    /* renamed from: c */
    public final nk6 f49990c;

    /* renamed from: d */
    public final qbj f49991d;

    /* renamed from: e */
    public final Executor f49992e;

    /* renamed from: f */
    public final sgg f49993f;

    /* renamed from: g */
    public final ib3 f49994g;

    /* renamed from: h */
    public final ib3 f49995h;

    /* renamed from: i */
    public final za3 f49996i;

    public v7i(Context context, n91 n91Var, nk6 nk6Var, qbj qbjVar, Executor executor, sgg sggVar, ib3 ib3Var, ib3 ib3Var2, za3 za3Var) {
        this.f49988a = context;
        this.f49989b = n91Var;
        this.f49990c = nk6Var;
        this.f49991d = qbjVar;
        this.f49992e = executor;
        this.f49993f = sggVar;
        this.f49994g = ib3Var;
        this.f49995h = ib3Var2;
        this.f49996i = za3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m52436l(qwh qwhVar) {
        return Boolean.valueOf(this.f49990c.b3(qwhVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m52437m(qwh qwhVar) {
        return this.f49990c.W2(qwhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m52438n(Iterable iterable, qwh qwhVar, long j) {
        this.f49990c.i1(iterable);
        this.f49990c.o1(qwhVar, this.f49994g.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m52439o(Iterable iterable) {
        this.f49990c.mo40724A(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m52440p() {
        this.f49996i.mo58526c();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m52441q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f49996i.mo58527d(((Integer) r0.getValue()).intValue(), xia.EnumC18167b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m52442r(qwh qwhVar, long j) {
        this.f49990c.o1(qwhVar, this.f49994g.getTime() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m52443s(qwh qwhVar, int i) {
        this.f49991d.mo45069b(qwhVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m52444t(final qwh qwhVar, final int i, Runnable runnable) {
        try {
            try {
                sgg sggVar = this.f49993f;
                final nk6 nk6Var = this.f49990c;
                Objects.requireNonNull(nk6Var);
                sggVar.mo48328a(new sgg.InterfaceC16841a() { // from class: o.u7i
                    @Override // p001o.sgg.InterfaceC16841a
                    public final Object execute() {
                        return Integer.valueOf(nk6Var.mo40726x());
                    }
                });
                if (m52446k()) {
                    m52447u(qwhVar, i);
                } else {
                    this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.l7i
                        @Override // p001o.sgg.InterfaceC16841a
                        public final Object execute() {
                            return this.f33389a.m52443s(qwhVar, i);
                        }
                    });
                }
            } catch (rgg unused) {
                this.f49991d.mo45069b(qwhVar, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public ak6 m52445j(pwh pwhVar) {
        sgg sggVar = this.f49993f;
        final za3 za3Var = this.f49996i;
        Objects.requireNonNull(za3Var);
        return pwhVar.mo44262b(ak6.m17306a().mo17326i(this.f49994g.getTime()).mo17328k(this.f49995h.getTime()).mo17327j("GDT_CLIENT_METRICS").mo17325h(new d76(n76.m40202b("proto"), ((bb3) sggVar.mo48328a(new sgg.InterfaceC16841a() { // from class: o.s7i
            @Override // p001o.sgg.InterfaceC16841a
            public final Object execute() {
                return za3Var.mo58528f();
            }
        })).m18526f())).mo17321d());
    }

    /* renamed from: k */
    public boolean m52446k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f49988a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public p91 m52447u(final qwh qwhVar, int i) {
        p91 p91VarMo44261a;
        pwh pwhVar = this.f49989b.get(qwhVar.mo45892b());
        long jMax = 0;
        p91 p91VarM43206e = p91.m43206e(0L);
        while (true) {
            final long j = jMax;
            while (((Boolean) this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.k7i
                @Override // p001o.sgg.InterfaceC16841a
                public final Object execute() {
                    return this.f31606a.m52436l(qwhVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.m7i
                    @Override // p001o.sgg.InterfaceC16841a
                    public final Object execute() {
                        return this.f34940a.m52437m(qwhVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return p91VarM43206e;
                }
                if (pwhVar == null) {
                    aka.m17333b("Uploader", "Unknown backend for %s, deleting event batch for it...", qwhVar);
                    p91VarMo44261a = p91.m43204a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((l4d) it.next()).mo24313b());
                    }
                    if (qwhVar.m45895e()) {
                        arrayList.add(m52445j(pwhVar));
                    }
                    p91VarMo44261a = pwhVar.mo44261a(o91.m41787a().mo41791b(arrayList).mo41792c(qwhVar.mo45893c()).mo41790a());
                }
                p91VarM43206e = p91VarMo44261a;
                if (p91VarM43206e.mo43209c() == p91.EnumC16032a.TRANSIENT_ERROR) {
                    this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.n7i
                        @Override // p001o.sgg.InterfaceC16841a
                        public final Object execute() {
                            return this.f36541a.m52438n(iterable, qwhVar, j);
                        }
                    });
                    this.f49991d.mo45068a(qwhVar, i + 1, true);
                    return p91VarM43206e;
                }
                this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.o7i
                    @Override // p001o.sgg.InterfaceC16841a
                    public final Object execute() {
                        return this.f37882a.m52439o(iterable);
                    }
                });
                if (p91VarM43206e.mo43209c() == p91.EnumC16032a.OK) {
                    jMax = Math.max(j, p91VarM43206e.mo43208b());
                    if (qwhVar.m45895e()) {
                        this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.p7i
                            @Override // p001o.sgg.InterfaceC16841a
                            public final Object execute() {
                                return this.f39571a.m52440p();
                            }
                        });
                    }
                } else if (p91VarM43206e.mo43209c() == p91.EnumC16032a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strMo17315j = ((l4d) it2.next()).mo24313b().mo17315j();
                        if (map.containsKey(strMo17315j)) {
                            map.put(strMo17315j, Integer.valueOf(((Integer) map.get(strMo17315j)).intValue() + 1));
                        } else {
                            map.put(strMo17315j, 1);
                        }
                    }
                    this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.q7i
                        @Override // p001o.sgg.InterfaceC16841a
                        public final Object execute() {
                            return this.f41446a.m52441q(map);
                        }
                    });
                }
            }
            this.f49993f.mo48328a(new sgg.InterfaceC16841a() { // from class: o.r7i
                @Override // p001o.sgg.InterfaceC16841a
                public final Object execute() {
                    return this.f43119a.m52442r(qwhVar, j);
                }
            });
            return p91VarM43206e;
        }
    }

    /* renamed from: v */
    public void m52448v(final qwh qwhVar, final int i, final Runnable runnable) {
        this.f49992e.execute(new Runnable() { // from class: o.t7i
            @Override // java.lang.Runnable
            public final void run() {
                this.f46603a.m52444t(qwhVar, i, runnable);
            }
        });
    }
}
