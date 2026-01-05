package p001o;

import android.content.Context;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p001o.dz4;
import p001o.jd5;
import p001o.jnd;
import p001o.oq6;
import p001o.qbg;
import p001o.s2b;
import p001o.tuf;
import p001o.x8b;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class hf5 implements f9b {

    /* renamed from: c */
    public final C13928a f26759c;

    /* renamed from: d */
    public dz4.InterfaceC13064a f26760d;

    /* renamed from: e */
    public qbg.InterfaceC16329a f26761e;

    /* renamed from: f */
    public x8b.InterfaceC18075a f26762f;

    /* renamed from: g */
    public sga f26763g;

    /* renamed from: h */
    public long f26764h;

    /* renamed from: i */
    public long f26765i;

    /* renamed from: j */
    public long f26766j;

    /* renamed from: k */
    public float f26767k;

    /* renamed from: l */
    public float f26768l;

    /* renamed from: m */
    public boolean f26769m;

    /* renamed from: o.hf5$a */
    public static final class C13928a {

        /* renamed from: a */
        public final yq6 f26770a;

        /* renamed from: d */
        public dz4.InterfaceC13064a f26773d;

        /* renamed from: f */
        public qbg.InterfaceC16329a f26775f;

        /* renamed from: g */
        public pz5 f26776g;

        /* renamed from: h */
        public sga f26777h;

        /* renamed from: b */
        public final Map f26771b = new HashMap();

        /* renamed from: c */
        public final Map f26772c = new HashMap();

        /* renamed from: e */
        public boolean f26774e = true;

        public C13928a(yq6 yq6Var, qbg.InterfaceC16329a interfaceC16329a) {
            this.f26770a = yq6Var;
            this.f26775f = interfaceC16329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ x8b.InterfaceC18075a m30348k(dz4.InterfaceC13064a interfaceC13064a) {
            return new jnd.C14620b(interfaceC13064a, this.f26770a);
        }

        /* renamed from: f */
        public x8b.InterfaceC18075a m30349f(int i) {
            x8b.InterfaceC18075a interfaceC18075a = (x8b.InterfaceC18075a) this.f26772c.get(Integer.valueOf(i));
            if (interfaceC18075a != null) {
                return interfaceC18075a;
            }
            x8b.InterfaceC18075a interfaceC18075a2 = (x8b.InterfaceC18075a) m30350l(i).get();
            pz5 pz5Var = this.f26776g;
            if (pz5Var != null) {
                interfaceC18075a2.mo6939d(pz5Var);
            }
            sga sgaVar = this.f26777h;
            if (sgaVar != null) {
                interfaceC18075a2.mo6938c(sgaVar);
            }
            interfaceC18075a2.mo6936a(this.f26775f);
            interfaceC18075a2.mo6937b(this.f26774e);
            this.f26772c.put(Integer.valueOf(i), interfaceC18075a2);
            return interfaceC18075a2;
        }

        /* renamed from: l */
        public final hdg m30350l(int i) {
            hdg hdgVar;
            hdg hdgVar2;
            hdg hdgVar3 = (hdg) this.f26771b.get(Integer.valueOf(i));
            if (hdgVar3 != null) {
                return hdgVar3;
            }
            final dz4.InterfaceC13064a interfaceC13064a = (dz4.InterfaceC13064a) op0.m42515e(this.f26773d);
            if (i == 0) {
                int i2 = DashMediaSource.Factory.f8195k;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(x8b.InterfaceC18075a.class);
                hdgVar = new hdg() { // from class: o.cf5
                    @Override // p001o.hdg
                    public final Object get() {
                        return hf5.m30329h(clsAsSubclass, interfaceC13064a);
                    }
                };
            } else if (i == 1) {
                int i3 = SsMediaSource.Factory.f8533j;
                final Class clsAsSubclass2 = SsMediaSource.Factory.class.asSubclass(x8b.InterfaceC18075a.class);
                hdgVar = new hdg() { // from class: o.df5
                    @Override // p001o.hdg
                    public final Object get() {
                        return hf5.m30329h(clsAsSubclass2, interfaceC13064a);
                    }
                };
            } else {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(x8b.InterfaceC18075a.class);
                        hdgVar2 = new hdg() { // from class: o.ff5
                            @Override // p001o.hdg
                            public final Object get() {
                                return hf5.m30328g(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i);
                        }
                        hdgVar2 = new hdg() { // from class: o.gf5
                            @Override // p001o.hdg
                            public final Object get() {
                                return this.f25061a.m30348k(interfaceC13064a);
                            }
                        };
                    }
                    this.f26771b.put(Integer.valueOf(i), hdgVar2);
                    return hdgVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(x8b.InterfaceC18075a.class);
                hdgVar = new hdg() { // from class: o.ef5
                    @Override // p001o.hdg
                    public final Object get() {
                        return hf5.m30329h(clsAsSubclass4, interfaceC13064a);
                    }
                };
            }
            hdgVar2 = hdgVar;
            this.f26771b.put(Integer.valueOf(i), hdgVar2);
            return hdgVar2;
        }

        /* renamed from: m */
        public void m30351m(dz4.InterfaceC13064a interfaceC13064a) {
            if (interfaceC13064a != this.f26773d) {
                this.f26773d = interfaceC13064a;
                this.f26771b.clear();
                this.f26772c.clear();
            }
        }

        /* renamed from: n */
        public void m30352n(pz5 pz5Var) {
            this.f26776g = pz5Var;
            Iterator it = this.f26772c.values().iterator();
            while (it.hasNext()) {
                ((x8b.InterfaceC18075a) it.next()).mo6939d(pz5Var);
            }
        }

        /* renamed from: o */
        public void m30353o(int i) {
            yq6 yq6Var = this.f26770a;
            if (yq6Var instanceof be5) {
                ((be5) yq6Var).m18785n(i);
            }
        }

        /* renamed from: p */
        public void m30354p(sga sgaVar) {
            this.f26777h = sgaVar;
            Iterator it = this.f26772c.values().iterator();
            while (it.hasNext()) {
                ((x8b.InterfaceC18075a) it.next()).mo6938c(sgaVar);
            }
        }

        /* renamed from: q */
        public void m30355q(boolean z) {
            this.f26774e = z;
            this.f26770a.mo18780c(z);
            Iterator it = this.f26772c.values().iterator();
            while (it.hasNext()) {
                ((x8b.InterfaceC18075a) it.next()).mo6937b(z);
            }
        }

        /* renamed from: r */
        public void m30356r(qbg.InterfaceC16329a interfaceC16329a) {
            this.f26775f = interfaceC16329a;
            this.f26770a.mo18779a(interfaceC16329a);
            Iterator it = this.f26772c.values().iterator();
            while (it.hasNext()) {
                ((x8b.InterfaceC18075a) it.next()).mo6936a(interfaceC16329a);
            }
        }
    }

    /* renamed from: o.hf5$b */
    public static final class C13929b implements tq6 {

        /* renamed from: a */
        public final C2181a f26778a;

        public C13929b(C2181a c2181a) {
            this.f26778a = c2181a;
        }

        @Override // p001o.tq6
        /* renamed from: a */
        public void mo17261a(long j, long j2) {
        }

        @Override // p001o.tq6
        /* renamed from: c */
        public boolean mo17262c(uq6 uq6Var) {
            return true;
        }

        @Override // p001o.tq6
        /* renamed from: d */
        public void mo17263d(vq6 vq6Var) {
            uth uthVarMo32487f = vq6Var.mo32487f(0, 3);
            vq6Var.mo32490r(new zaf.C18604b(-9223372036854775807L));
            vq6Var.mo32489p();
            uthVarMo32487f.mo7072b(this.f26778a.m6707a().o0("text/x-unknown").m6752O(this.f26778a.f7943n).m6748K());
        }

        @Override // p001o.tq6
        /* renamed from: k */
        public int mo17264k(uq6 uq6Var, ued uedVar) {
            return uq6Var.mo40491d(Api.BaseClientBuilder.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // p001o.tq6
        public void release() {
        }
    }

    public hf5(Context context, yq6 yq6Var) {
        this(new jd5.C14503a(context), yq6Var);
    }

    /* renamed from: g */
    public static /* synthetic */ x8b.InterfaceC18075a m30328g(Class cls) {
        return m30332m(cls);
    }

    /* renamed from: h */
    public static /* synthetic */ x8b.InterfaceC18075a m30329h(Class cls, dz4.InterfaceC13064a interfaceC13064a) {
        return m30333n(cls, interfaceC13064a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ tq6[] m30330j(C2181a c2181a) {
        tq6[] tq6VarArr = new tq6[1];
        tq6VarArr[0] = this.f26761e.mo45062a(c2181a) ? new lbg(this.f26761e.mo45064c(c2181a), c2181a) : new C13929b(c2181a);
        return tq6VarArr;
    }

    /* renamed from: k */
    public static x8b m30331k(s2b s2bVar, x8b x8bVar) {
        s2b.C16719d c16719d = s2bVar.f44484f;
        if (c16719d.f44509b == 0 && c16719d.f44511d == Long.MIN_VALUE && !c16719d.f44513f) {
            return x8bVar;
        }
        s2b.C16719d c16719d2 = s2bVar.f44484f;
        return new gb3(x8bVar, c16719d2.f44509b, c16719d2.f44511d, !c16719d2.f44514g, c16719d2.f44512e, c16719d2.f44513f);
    }

    /* renamed from: m */
    public static x8b.InterfaceC18075a m30332m(Class cls) {
        try {
            return (x8b.InterfaceC18075a) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: n */
    public static x8b.InterfaceC18075a m30333n(Class cls, dz4.InterfaceC13064a interfaceC13064a) {
        try {
            return (x8b.InterfaceC18075a) cls.getConstructor(dz4.InterfaceC13064a.class).newInstance(interfaceC13064a);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p001o.x8b.InterfaceC18075a
    /* renamed from: e */
    public x8b mo6940e(s2b s2bVar) {
        op0.m42515e(s2bVar.f44480b);
        String scheme = s2bVar.f44480b.f44572a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((x8b.InterfaceC18075a) op0.m42515e(this.f26762f)).mo6940e(s2bVar);
        }
        if (Objects.equals(s2bVar.f44480b.f44573b, "application/x-image-uri")) {
            long jO0 = sqi.O0(s2bVar.f44480b.f44580i);
            tq.m50332a(op0.m42515e(null));
            return new oq6.C15868b(jO0, null).mo6940e(s2bVar);
        }
        s2b.C16723h c16723h = s2bVar.f44480b;
        int iZ0 = sqi.z0(c16723h.f44572a, c16723h.f44573b);
        if (s2bVar.f44480b.f44580i != -9223372036854775807L) {
            this.f26759c.m30353o(1);
        }
        try {
            x8b.InterfaceC18075a interfaceC18075aM30349f = this.f26759c.m30349f(iZ0);
            s2b.C16722g.a aVarM47497a = s2bVar.f44482d.m47497a();
            if (s2bVar.f44482d.f44554a == -9223372036854775807L) {
                aVarM47497a.m47508k(this.f26764h);
            }
            if (s2bVar.f44482d.f44557d == -3.4028235E38f) {
                aVarM47497a.m47507j(this.f26767k);
            }
            if (s2bVar.f44482d.f44558e == -3.4028235E38f) {
                aVarM47497a.m47505h(this.f26768l);
            }
            if (s2bVar.f44482d.f44555b == -9223372036854775807L) {
                aVarM47497a.m47506i(this.f26765i);
            }
            if (s2bVar.f44482d.f44556c == -9223372036854775807L) {
                aVarM47497a.m47504g(this.f26766j);
            }
            s2b.C16722g c16722gM47503f = aVarM47497a.m47503f();
            if (!c16722gM47503f.equals(s2bVar.f44482d)) {
                s2bVar = s2bVar.m47469a().m47471b(c16722gM47503f).m47470a();
            }
            x8b x8bVarMo6940e = interfaceC18075aM30349f.mo6940e(s2bVar);
            nf8 nf8Var = ((s2b.C16723h) sqi.m48729h(s2bVar.f44480b)).f44577f;
            if (!nf8Var.isEmpty()) {
                x8b[] x8bVarArr = new x8b[nf8Var.size() + 1];
                x8bVarArr[0] = x8bVarMo6940e;
                for (int i = 0; i < nf8Var.size(); i++) {
                    if (this.f26769m) {
                        final C2181a c2181aM6748K = new C2181a.b().o0(((s2b.C16726k) nf8Var.get(i)).f44592b).e0(((s2b.C16726k) nf8Var.get(i)).f44593c).q0(((s2b.C16726k) nf8Var.get(i)).f44594d).m0(((s2b.C16726k) nf8Var.get(i)).f44595e).c0(((s2b.C16726k) nf8Var.get(i)).f44596f).a0(((s2b.C16726k) nf8Var.get(i)).f44597g).m6748K();
                        jnd.C14620b c14620b = new jnd.C14620b(this.f26760d, new yq6() { // from class: o.bf5
                            @Override // p001o.yq6
                            /* renamed from: f */
                            public final tq6[] mo17519f() {
                                return this.f16085b.m30330j(c2181aM6748K);
                            }
                        });
                        sga sgaVar = this.f26763g;
                        if (sgaVar != null) {
                            c14620b.mo6938c(sgaVar);
                        }
                        x8bVarArr[i + 1] = c14620b.mo6940e(s2b.m47468b(((s2b.C16726k) nf8Var.get(i)).f44591a.toString()));
                    } else {
                        tuf.C17238b c17238b = new tuf.C17238b(this.f26760d);
                        sga sgaVar2 = this.f26763g;
                        if (sgaVar2 != null) {
                            c17238b.m50693b(sgaVar2);
                        }
                        x8bVarArr[i + 1] = c17238b.m50692a((s2b.C16726k) nf8Var.get(i), -9223372036854775807L);
                    }
                }
                x8bVarMo6940e = new mbb(x8bVarArr);
            }
            return m30335l(s2bVar, m30331k(s2bVar, x8bVarMo6940e));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p001o.x8b.InterfaceC18075a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public hf5 mo6937b(boolean z) {
        this.f26769m = z;
        this.f26759c.m30355q(z);
        return this;
    }

    /* renamed from: l */
    public final x8b m30335l(s2b s2bVar, x8b x8bVar) {
        op0.m42515e(s2bVar.f44480b);
        s2bVar.f44480b.getClass();
        return x8bVar;
    }

    @Override // p001o.x8b.InterfaceC18075a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public hf5 mo6939d(pz5 pz5Var) {
        this.f26759c.m30352n((pz5) op0.m42516f(pz5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // p001o.x8b.InterfaceC18075a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public hf5 mo6938c(sga sgaVar) {
        this.f26763g = (sga) op0.m42516f(sgaVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f26759c.m30354p(sgaVar);
        return this;
    }

    @Override // p001o.x8b.InterfaceC18075a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public hf5 mo6936a(qbg.InterfaceC16329a interfaceC16329a) {
        this.f26761e = (qbg.InterfaceC16329a) op0.m42515e(interfaceC16329a);
        this.f26759c.m30356r(interfaceC16329a);
        return this;
    }

    public hf5(dz4.InterfaceC13064a interfaceC13064a, yq6 yq6Var) {
        this.f26760d = interfaceC13064a;
        uh5 uh5Var = new uh5();
        this.f26761e = uh5Var;
        C13928a c13928a = new C13928a(yq6Var, uh5Var);
        this.f26759c = c13928a;
        c13928a.m30351m(interfaceC13064a);
        this.f26764h = -9223372036854775807L;
        this.f26765i = -9223372036854775807L;
        this.f26766j = -9223372036854775807L;
        this.f26767k = -3.4028235E38f;
        this.f26768l = -3.4028235E38f;
        this.f26769m = true;
    }
}
