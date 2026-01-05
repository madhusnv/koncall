package v8;

import a1.RunnableC0025x;
import a9.C0073l;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import d9.AbstractC1667l;
import e9.InterfaceC1970a;
import ia.C3220l;
import j3.C3553g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4307g;
import og.ja;
import t8.C7056b;
import t8.C7059e;
import t8.C7062h;
import t8.C7077w;
import t8.e0;
import tb.C7105p;
import tx.AbstractC7262v;
import tx.e1;
import u8.C7356d;
import u8.C7361i;
import u8.InterfaceC7354b;
import u8.InterfaceC7358f;
import y8.AbstractC8594c;
import y8.AbstractC8600i;
import y8.C8592a;
import y8.C8593b;
import y8.InterfaceC8597f;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v8.c */
/* loaded from: classes.dex */
public final class C7691c implements InterfaceC7358f, InterfaceC8597f, InterfaceC7354b {

    /* renamed from: a */
    public final Context f37181a;

    /* renamed from: c */
    public final C7689a f37183c;

    /* renamed from: d */
    public boolean f37184d;

    /* renamed from: g */
    public final C7356d f37187g;

    /* renamed from: h */
    public final C8849i f37188h;

    /* renamed from: j */
    public final C7056b f37189j;

    /* renamed from: l */
    public Boolean f37191l;

    /* renamed from: m */
    public final C3553g f37192m;

    /* renamed from: n */
    public final InterfaceC1970a f37193n;

    /* renamed from: p */
    public final C3220l f37194p;

    /* renamed from: b */
    public final HashMap f37182b = new HashMap();

    /* renamed from: e */
    public final Object f37185e = new Object();

    /* renamed from: f */
    public final C7105p f37186f = new C7105p(new C7062h(1));

    /* renamed from: k */
    public final HashMap f37190k = new HashMap();

    static {
        C7077w.m13372b("GreedyScheduler");
    }

    public C7691c(Context context, C7056b c7056b, C0073l c0073l, C7356d c7356d, C8849i c8849i, InterfaceC1970a interfaceC1970a) {
        this.f37181a = context;
        C4001v runnableScheduler = c7056b.f34111g;
        this.f37183c = new C7689a(this, runnableScheduler, c7056b.f34108d);
        AbstractC4154l.m8923f(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        C3220l c3220l = new C3220l();
        c3220l.f17355b = runnableScheduler;
        c3220l.f17356c = c8849i;
        c3220l.f17354a = millis;
        c3220l.f17357d = new Object();
        c3220l.f17358e = new LinkedHashMap();
        this.f37194p = c3220l;
        this.f37193n = interfaceC1970a;
        this.f37192m = new C3553g(c0073l);
        this.f37189j = c7056b;
        this.f37187g = c7356d;
        this.f37188h = c8849i;
    }

    @Override // u8.InterfaceC7354b
    /* renamed from: a */
    public final void mo1381a(C0915j c0915j, boolean z6) {
        e1 e1Var;
        C7361i c7361iM13391q = this.f37186f.m13391q(c0915j);
        if (c7361iM13391q != null) {
            this.f37194p.m7562c(c7361iM13391q);
        }
        synchronized (this.f37185e) {
            e1Var = (e1) this.f37182b.remove(c0915j);
        }
        if (e1Var != null) {
            C7077w c7077wM13371a = C7077w.m13371a();
            Objects.toString(c0915j);
            c7077wM13371a.getClass();
            e1Var.mo13510j(null);
        }
        if (z6) {
            return;
        }
        synchronized (this.f37185e) {
            this.f37190k.remove(c0915j);
        }
    }

    @Override // y8.InterfaceC8597f
    /* renamed from: b */
    public final void mo1788b(C0922q c0922q, AbstractC8594c abstractC8594c) {
        C0915j c0915jM10706a = ja.m10706a(c0922q);
        boolean z6 = abstractC8594c instanceof C8592a;
        C8849i c8849i = this.f37188h;
        C3220l c3220l = this.f37194p;
        C7105p c7105p = this.f37186f;
        if (z6) {
            if (c7105p.m13380b(c0915jM10706a)) {
                return;
            }
            C7077w c7077wM13371a = C7077w.m13371a();
            c0915jM10706a.toString();
            c7077wM13371a.getClass();
            C7361i c7361iM13394u = c7105p.m13394u(c0915jM10706a);
            c3220l.m7564e(c7361iM13394u);
            ((InterfaceC1970a) c8849i.f42584c).m5712a(new RunnableC0025x(22, c8849i, c7361iM13394u, null));
            return;
        }
        C7077w c7077wM13371a2 = C7077w.m13371a();
        c0915jM10706a.toString();
        c7077wM13371a2.getClass();
        C7361i c7361iM13391q = c7105p.m13391q(c0915jM10706a);
        if (c7361iM13391q != null) {
            c3220l.m7562c(c7361iM13391q);
            int i10 = ((C8593b) abstractC8594c).f41840a;
            c8849i.getClass();
            c8849i.m16318K(c7361iM13391q, i10);
        }
    }

    @Override // u8.InterfaceC7358f
    /* renamed from: c */
    public final boolean mo13775c() {
        return false;
    }

    @Override // u8.InterfaceC7358f
    /* renamed from: d */
    public final void mo13776d(String str) {
        Runnable runnable;
        if (this.f37191l == null) {
            this.f37191l = Boolean.valueOf(AbstractC1667l.m5379a(this.f37181a, this.f37189j));
        }
        if (!this.f37191l.booleanValue()) {
            C7077w.m13371a().getClass();
            return;
        }
        if (!this.f37184d) {
            this.f37187g.m13769a(this);
            this.f37184d = true;
        }
        C7077w.m13371a().getClass();
        C7689a c7689a = this.f37183c;
        if (c7689a != null && (runnable = (Runnable) c7689a.f37178d.remove(str)) != null) {
            ((Handler) c7689a.f37176b.f20704b).removeCallbacks(runnable);
        }
        for (C7361i c7361i : this.f37186f.m13390p(str)) {
            this.f37194p.m7562c(c7361i);
            C8849i c8849i = this.f37188h;
            c8849i.getClass();
            c8849i.m16318K(c7361i, -512);
        }
    }

    @Override // u8.InterfaceC7358f
    /* renamed from: e */
    public final void mo13777e(C0922q... c0922qArr) {
        long jMax;
        if (this.f37191l == null) {
            this.f37191l = Boolean.valueOf(AbstractC1667l.m5379a(this.f37181a, this.f37189j));
        }
        if (!this.f37191l.booleanValue()) {
            C7077w.m13371a().getClass();
            return;
        }
        if (!this.f37184d) {
            this.f37187g.m13769a(this);
            this.f37184d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C0922q c0922q : c0922qArr) {
            if (!this.f37186f.m13380b(ja.m10706a(c0922q))) {
                synchronized (this.f37185e) {
                    try {
                        C0915j c0915jM10706a = ja.m10706a(c0922q);
                        C7690b c7690b = (C7690b) this.f37190k.get(c0915jM10706a);
                        if (c7690b == null) {
                            int i10 = c0922q.f5632k;
                            this.f37189j.f34108d.getClass();
                            c7690b = new C7690b(i10, System.currentTimeMillis());
                            this.f37190k.put(c0915jM10706a, c7690b);
                        }
                        jMax = (Math.max((c0922q.f5632k - c7690b.f37179a) - 5, 0) * 30000) + c7690b.f37180b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(c0922q.m2669a(), jMax);
                this.f37189j.f34108d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c0922q.f5623b == e0.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        C7689a c7689a = this.f37183c;
                        if (c7689a != null) {
                            C4001v c4001v = c7689a.f37176b;
                            HashMap map = c7689a.f37178d;
                            Runnable runnable = (Runnable) map.remove(c0922q.f5622a);
                            if (runnable != null) {
                                ((Handler) c4001v.f20704b).removeCallbacks(runnable);
                            }
                            RunnableC4307g runnableC4307g = new RunnableC4307g(24, c7689a, c0922q, false);
                            map.put(c0922q.f5622a, runnableC4307g);
                            c7689a.f37177c.getClass();
                            ((Handler) c4001v.f20704b).postDelayed(runnableC4307g, jMax2 - System.currentTimeMillis());
                        }
                    } else if (c0922q.m2670c()) {
                        C7059e c7059e = c0922q.f5631j;
                        if (c7059e.f34132d) {
                            C7077w c7077wM13371a = C7077w.m13371a();
                            c0922q.toString();
                            c7077wM13371a.getClass();
                        } else if (c7059e.m13352b()) {
                            C7077w c7077wM13371a2 = C7077w.m13371a();
                            c0922q.toString();
                            c7077wM13371a2.getClass();
                        } else {
                            hashSet.add(c0922q);
                            hashSet2.add(c0922q.f5622a);
                        }
                    } else if (!this.f37186f.m13380b(ja.m10706a(c0922q))) {
                        C7077w.m13371a().getClass();
                        C7105p c7105p = this.f37186f;
                        c7105p.getClass();
                        C7361i c7361iM13394u = c7105p.m13394u(ja.m10706a(c0922q));
                        this.f37194p.m7564e(c7361iM13394u);
                        C8849i c8849i = this.f37188h;
                        ((InterfaceC1970a) c8849i.f42584c).m5712a(new RunnableC0025x(22, c8849i, c7361iM13394u, null));
                    }
                }
            }
        }
        synchronized (this.f37185e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    C7077w.m13371a().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C0922q c0922q2 = (C0922q) it.next();
                        C0915j c0915jM10706a2 = ja.m10706a(c0922q2);
                        if (!this.f37182b.containsKey(c0915jM10706a2)) {
                            this.f37182b.put(c0915jM10706a2, AbstractC8600i.m15954a(this.f37192m, c0922q2, (AbstractC7262v) ((C0914i) this.f37193n).f5586b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
