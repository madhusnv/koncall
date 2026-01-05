package p001o;

import android.util.Log;
import com.bumptech.glide.C10726c;
import java.util.Map;
import java.util.concurrent.Executor;
import org.objectweb.asm.Opcodes;
import p001o.dab;
import p001o.ig6;
import p001o.ms6;
import p001o.ot5;
import p001o.u75;

/* loaded from: classes5.dex */
public class yf6 implements cg6, dab.InterfaceC12854a, ig6.InterfaceC14285a {

    /* renamed from: i */
    public static final boolean f55434i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final f79 f55435a;

    /* renamed from: b */
    public final eg6 f55436b;

    /* renamed from: c */
    public final dab f55437c;

    /* renamed from: d */
    public final C18396b f55438d;

    /* renamed from: e */
    public final ipe f55439e;

    /* renamed from: f */
    public final C18397c f55440f;

    /* renamed from: g */
    public final C18395a f55441g;

    /* renamed from: h */
    public final an f55442h;

    /* renamed from: o.yf6$a */
    public static class C18395a {

        /* renamed from: a */
        public final u75.InterfaceC17317e f55443a;

        /* renamed from: b */
        public final ged f55444b = ms6.m39603d(Opcodes.FCMPG, new a());

        /* renamed from: c */
        public int f55445c;

        /* renamed from: o.yf6$a$a */
        public class a implements ms6.InterfaceC15416d {
            public a() {
            }

            @Override // p001o.ms6.InterfaceC15416d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public u75 create() {
                C18395a c18395a = C18395a.this;
                return new u75(c18395a.f55443a, c18395a.f55444b);
            }
        }

        public C18395a(u75.InterfaceC17317e interfaceC17317e) {
            this.f55443a = interfaceC17317e;
        }

        /* renamed from: a */
        public u75 m57750a(C10726c c10726c, Object obj, dg6 dg6Var, ic9 ic9Var, int i, int i2, Class cls, Class cls2, gid gidVar, qt5 qt5Var, Map map, boolean z, boolean z2, boolean z3, rec recVar, u75.InterfaceC17314b interfaceC17314b) {
            u75 u75Var = (u75) bgd.m18886d((u75) this.f55444b.mo28526b());
            int i3 = this.f55445c;
            this.f55445c = i3 + 1;
            return u75Var.m51105u(c10726c, obj, dg6Var, ic9Var, i, i2, cls, cls2, gidVar, qt5Var, map, z, z2, z3, recVar, interfaceC17314b, i3);
        }
    }

    /* renamed from: o.yf6$b */
    public static class C18396b {

        /* renamed from: a */
        public final ys7 f55447a;

        /* renamed from: b */
        public final ys7 f55448b;

        /* renamed from: c */
        public final ys7 f55449c;

        /* renamed from: d */
        public final ys7 f55450d;

        /* renamed from: e */
        public final cg6 f55451e;

        /* renamed from: f */
        public final ig6.InterfaceC14285a f55452f;

        /* renamed from: g */
        public final ged f55453g = ms6.m39603d(Opcodes.FCMPG, new a());

        /* renamed from: o.yf6$b$a */
        public class a implements ms6.InterfaceC15416d {
            public a() {
            }

            @Override // p001o.ms6.InterfaceC15416d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public bg6 create() {
                C18396b c18396b = C18396b.this;
                return new bg6(c18396b.f55447a, c18396b.f55448b, c18396b.f55449c, c18396b.f55450d, c18396b.f55451e, c18396b.f55452f, c18396b.f55453g);
            }
        }

        public C18396b(ys7 ys7Var, ys7 ys7Var2, ys7 ys7Var3, ys7 ys7Var4, cg6 cg6Var, ig6.InterfaceC14285a interfaceC14285a) {
            this.f55447a = ys7Var;
            this.f55448b = ys7Var2;
            this.f55449c = ys7Var3;
            this.f55450d = ys7Var4;
            this.f55451e = cg6Var;
            this.f55452f = interfaceC14285a;
        }

        /* renamed from: a */
        public bg6 m57752a(ic9 ic9Var, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((bg6) bgd.m18886d((bg6) this.f55453g.mo28526b())).m18858l(ic9Var, z, z2, z3, z4);
        }
    }

    /* renamed from: o.yf6$c */
    public static class C18397c implements u75.InterfaceC17317e {

        /* renamed from: a */
        public final ot5.InterfaceC15889a f55455a;

        /* renamed from: b */
        public volatile ot5 f55456b;

        public C18397c(ot5.InterfaceC15889a interfaceC15889a) {
            this.f55455a = interfaceC15889a;
        }

        @Override // p001o.u75.InterfaceC17317e
        /* renamed from: a */
        public ot5 mo51116a() {
            if (this.f55456b == null) {
                synchronized (this) {
                    if (this.f55456b == null) {
                        this.f55456b = this.f55455a.build();
                    }
                    if (this.f55456b == null) {
                        this.f55456b = new pt5();
                    }
                }
            }
            return this.f55456b;
        }
    }

    /* renamed from: o.yf6$d */
    public class C18398d {

        /* renamed from: a */
        public final bg6 f55457a;

        /* renamed from: b */
        public final doe f55458b;

        public C18398d(doe doeVar, bg6 bg6Var) {
            this.f55458b = doeVar;
            this.f55457a = bg6Var;
        }

        /* renamed from: a */
        public void m57754a() {
            synchronized (yf6.this) {
                this.f55457a.m18864r(this.f55458b);
            }
        }
    }

    public yf6(dab dabVar, ot5.InterfaceC15889a interfaceC15889a, ys7 ys7Var, ys7 ys7Var2, ys7 ys7Var3, ys7 ys7Var4, boolean z) {
        this(dabVar, interfaceC15889a, ys7Var, ys7Var2, ys7Var3, ys7Var4, null, null, null, null, null, null, z);
    }

    /* renamed from: j */
    public static void m57742j(String str, long j, ic9 ic9Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(lja.m37349a(j));
        sb.append("ms, key: ");
        sb.append(ic9Var);
    }

    @Override // p001o.cg6
    /* renamed from: a */
    public synchronized void mo21183a(bg6 bg6Var, ic9 ic9Var, ig6 ig6Var) {
        if (ig6Var != null) {
            if (ig6Var.m32107d()) {
                this.f55442h.m17506a(ic9Var, ig6Var);
            }
            this.f55435a.m26229d(ic9Var, bg6Var);
        } else {
            this.f55435a.m26229d(ic9Var, bg6Var);
        }
    }

    @Override // p001o.ig6.InterfaceC14285a
    /* renamed from: b */
    public void mo32109b(ic9 ic9Var, ig6 ig6Var) {
        this.f55442h.m17509d(ic9Var);
        if (ig6Var.m32107d()) {
            this.f55437c.mo19444e(ic9Var, ig6Var);
        } else {
            this.f55439e.m32537a(ig6Var, false);
        }
    }

    @Override // p001o.dab.InterfaceC12854a
    /* renamed from: c */
    public void mo22702c(zne zneVar) {
        this.f55439e.m32537a(zneVar, true);
    }

    @Override // p001o.cg6
    /* renamed from: d */
    public synchronized void mo21184d(bg6 bg6Var, ic9 ic9Var) {
        this.f55435a.m26229d(ic9Var, bg6Var);
    }

    /* renamed from: e */
    public final ig6 m57743e(ic9 ic9Var) {
        zne zneVarMo19443d = this.f55437c.mo19443d(ic9Var);
        if (zneVarMo19443d == null) {
            return null;
        }
        return zneVarMo19443d instanceof ig6 ? (ig6) zneVarMo19443d : new ig6(zneVarMo19443d, true, true, ic9Var, this);
    }

    /* renamed from: f */
    public C18398d m57744f(C10726c c10726c, Object obj, ic9 ic9Var, int i, int i2, Class cls, Class cls2, gid gidVar, qt5 qt5Var, Map map, boolean z, boolean z2, rec recVar, boolean z3, boolean z4, boolean z5, boolean z6, doe doeVar, Executor executor) {
        long jM37350b = f55434i ? lja.m37350b() : 0L;
        dg6 dg6VarM24968a = this.f55436b.m24968a(obj, ic9Var, i, i2, map, cls, cls2, recVar);
        synchronized (this) {
            ig6 ig6VarM57747i = m57747i(dg6VarM24968a, z3, jM37350b);
            if (ig6VarM57747i == null) {
                return m57749l(c10726c, obj, ic9Var, i, i2, cls, cls2, gidVar, qt5Var, map, z, z2, recVar, z3, z4, z5, z6, doeVar, executor, dg6VarM24968a, jM37350b);
            }
            doeVar.mo23650b(ig6VarM57747i, ez4.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: g */
    public final ig6 m57745g(ic9 ic9Var) {
        ig6 ig6VarM17510e = this.f55442h.m17510e(ic9Var);
        if (ig6VarM17510e != null) {
            ig6VarM17510e.m32105a();
        }
        return ig6VarM17510e;
    }

    /* renamed from: h */
    public final ig6 m57746h(ic9 ic9Var) {
        ig6 ig6VarM57743e = m57743e(ic9Var);
        if (ig6VarM57743e != null) {
            ig6VarM57743e.m32105a();
            this.f55442h.m17506a(ic9Var, ig6VarM57743e);
        }
        return ig6VarM57743e;
    }

    /* renamed from: i */
    public final ig6 m57747i(dg6 dg6Var, boolean z, long j) {
        if (!z) {
            return null;
        }
        ig6 ig6VarM57745g = m57745g(dg6Var);
        if (ig6VarM57745g != null) {
            if (f55434i) {
                m57742j("Loaded resource from active resources", j, dg6Var);
            }
            return ig6VarM57745g;
        }
        ig6 ig6VarM57746h = m57746h(dg6Var);
        if (ig6VarM57746h == null) {
            return null;
        }
        if (f55434i) {
            m57742j("Loaded resource from cache", j, dg6Var);
        }
        return ig6VarM57746h;
    }

    /* renamed from: k */
    public void m57748k(zne zneVar) {
        if (!(zneVar instanceof ig6)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((ig6) zneVar).m32108e();
    }

    /* renamed from: l */
    public final C18398d m57749l(C10726c c10726c, Object obj, ic9 ic9Var, int i, int i2, Class cls, Class cls2, gid gidVar, qt5 qt5Var, Map map, boolean z, boolean z2, rec recVar, boolean z3, boolean z4, boolean z5, boolean z6, doe doeVar, Executor executor, dg6 dg6Var, long j) {
        bg6 bg6VarM26226a = this.f55435a.m26226a(dg6Var, z6);
        if (bg6VarM26226a != null) {
            bg6VarM26226a.m18847a(doeVar, executor);
            if (f55434i) {
                m57742j("Added to existing load", j, dg6Var);
            }
            return new C18398d(doeVar, bg6VarM26226a);
        }
        bg6 bg6VarM57752a = this.f55438d.m57752a(dg6Var, z3, z4, z5, z6);
        u75 u75VarM57750a = this.f55441g.m57750a(c10726c, obj, dg6Var, ic9Var, i, i2, cls, cls2, gidVar, qt5Var, map, z, z2, z6, recVar, bg6VarM57752a);
        this.f55435a.m26228c(dg6Var, bg6VarM57752a);
        bg6VarM57752a.m18847a(doeVar, executor);
        bg6VarM57752a.m18865s(u75VarM57750a);
        if (f55434i) {
            m57742j("Started new load", j, dg6Var);
        }
        return new C18398d(doeVar, bg6VarM57752a);
    }

    public yf6(dab dabVar, ot5.InterfaceC15889a interfaceC15889a, ys7 ys7Var, ys7 ys7Var2, ys7 ys7Var3, ys7 ys7Var4, f79 f79Var, eg6 eg6Var, an anVar, C18396b c18396b, C18395a c18395a, ipe ipeVar, boolean z) {
        this.f55437c = dabVar;
        C18397c c18397c = new C18397c(interfaceC15889a);
        this.f55440f = c18397c;
        an anVar2 = anVar == null ? new an(z) : anVar;
        this.f55442h = anVar2;
        anVar2.m17511f(this);
        this.f55436b = eg6Var == null ? new eg6() : eg6Var;
        this.f55435a = f79Var == null ? new f79() : f79Var;
        this.f55438d = c18396b == null ? new C18396b(ys7Var, ys7Var2, ys7Var3, ys7Var4, this, this) : c18396b;
        this.f55441g = c18395a == null ? new C18395a(c18397c) : c18395a;
        this.f55439e = ipeVar == null ? new ipe() : ipeVar;
        dabVar.mo19442c(this);
    }
}
