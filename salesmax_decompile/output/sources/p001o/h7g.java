package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001o.bhf;
import p001o.c9i;
import p001o.d16;
import p001o.g16;
import p001o.li5;
import p001o.rfg;

/* loaded from: classes2.dex */
public class h7g extends w8i {

    /* renamed from: A */
    public bhf.C12402b f26371A;

    /* renamed from: B */
    public bhf.C12402b f26372B;

    /* renamed from: C */
    public bhf.C12403c f26373C;

    /* renamed from: p */
    public final j7g f26374p;

    /* renamed from: q */
    public final q0j f26375q;

    /* renamed from: r */
    public final ei9 f26376r;

    /* renamed from: s */
    public final ei9 f26377s;

    /* renamed from: t */
    public rfg f26378t;

    /* renamed from: u */
    public rfg f26379u;

    /* renamed from: v */
    public g16 f26380v;

    /* renamed from: w */
    public hfg f26381w;

    /* renamed from: x */
    public hfg f26382x;

    /* renamed from: y */
    public hfg f26383y;

    /* renamed from: z */
    public hfg f26384z;

    /* renamed from: o.h7g$a */
    public interface InterfaceC13892a {
        /* renamed from: a */
        zfa mo26260a(int i, int i2);
    }

    public h7g(v92 v92Var, v92 v92Var2, ei9 ei9Var, ei9 ei9Var2, Set set, d9i d9iVar) {
        super(j0(set));
        this.f26374p = j0(set);
        this.f26376r = ei9Var;
        this.f26377s = ei9Var2;
        this.f26375q = new q0j(v92Var, v92Var2, set, d9iVar, new InterfaceC13892a() { // from class: o.f7g
            @Override // p001o.h7g.InterfaceC13892a
            /* renamed from: a */
            public final zfa mo26260a(int i, int i2) {
                return this.f22934a.p0(i, i2);
            }
        });
    }

    public static List f0(w8i w8iVar) {
        ArrayList arrayList = new ArrayList();
        if (n0(w8iVar)) {
            Iterator it = ((h7g) w8iVar).h0().iterator();
            while (it.hasNext()) {
                arrayList.add(((w8i) it.next()).m54090i().mo20533M());
            }
        } else {
            arrayList.add(w8iVar.m54090i().mo20533M());
        }
        return arrayList;
    }

    public static int g0(w8i w8iVar) {
        return w8iVar.m54090i().m20531I().m19036o();
    }

    public static j7g j0(Set set) {
        vob vobVarMo17073a = new i7g().mo17073a();
        vobVarMo17073a.mo45760N(kd8.f31942h, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            if (w8iVar.m54090i().mo36957c(c9i.f17561E)) {
                arrayList.add(w8iVar.m54090i().mo20533M());
            }
        }
        vobVarMo17073a.mo45760N(j7g.f29937I, arrayList);
        vobVarMo17073a.mo45760N(qd8.f41687m, 2);
        return new j7g(tec.m49792Y(vobVarMo17073a));
    }

    public static boolean n0(w8i w8iVar) {
        return w8iVar instanceof h7g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str, String str2, c9i c9iVar, k7g k7gVar, k7g k7gVar2, bhf bhfVar, bhf.EnumC12407g enumC12407g) {
        if (m54087f() == null) {
            return;
        }
        a0();
        m54079U(b0(str, str2, c9iVar, k7gVar, k7gVar2));
        m54073F();
        this.f26375q.m44660I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zfa p0(int i, int i2) {
        rfg rfgVar = this.f26379u;
        return rfgVar != null ? rfgVar.m46665e().mo37294c(i, i2) : bn7.m19428n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // p001o.w8i
    /* renamed from: H */
    public void mo29952H() {
        super.mo29952H();
        this.f26375q.m44663o();
    }

    @Override // p001o.w8i
    /* renamed from: J */
    public c9i mo17063J(u92 u92Var, c9i.InterfaceC12595a interfaceC12595a) {
        this.f26375q.m44657F(interfaceC12595a.mo17073a());
        return interfaceC12595a.mo17074b();
    }

    @Override // p001o.w8i
    /* renamed from: K */
    public void mo29953K() {
        super.mo29953K();
        this.f26375q.m44658G();
    }

    @Override // p001o.w8i
    /* renamed from: L */
    public void mo29954L() {
        super.mo29954L();
        this.f26375q.m44659H();
    }

    @Override // p001o.w8i
    /* renamed from: M */
    public k7g mo17064M(mq3 mq3Var) {
        this.f26371A.m19044g(mq3Var);
        m54079U(t3c.m49220a(new Object[]{this.f26371A.m19052o()}));
        return m54085d().mo35131g().mo35135d(mq3Var).mo35132a();
    }

    @Override // p001o.w8i
    /* renamed from: N */
    public k7g mo17065N(k7g k7gVar, k7g k7gVar2) {
        m54079U(b0(m54089h(), m54099s(), m54090i(), k7gVar, k7gVar2));
        m54071D();
        return k7gVar;
    }

    @Override // p001o.w8i
    /* renamed from: O */
    public void mo17066O() {
        super.mo17066O();
        a0();
        this.f26375q.m44662M();
    }

    /* renamed from: Z */
    public final void m29955Z(bhf.C12402b c12402b, final String str, final String str2, final c9i c9iVar, final k7g k7gVar, final k7g k7gVar2) {
        bhf.C12403c c12403c = this.f26373C;
        if (c12403c != null) {
            c12403c.m19063b();
        }
        bhf.C12403c c12403c2 = new bhf.C12403c(new bhf.InterfaceC12404d() { // from class: o.g7g
            @Override // p001o.bhf.InterfaceC12404d
            /* renamed from: a */
            public final void mo19062a(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
                this.f24697a.o0(str, str2, c9iVar, k7gVar, k7gVar2, bhfVar, enumC12407g);
            }
        });
        this.f26373C = c12403c2;
        c12402b.m19054r(c12403c2);
    }

    public final void a0() {
        bhf.C12403c c12403c = this.f26373C;
        if (c12403c != null) {
            c12403c.m19063b();
            this.f26373C = null;
        }
        hfg hfgVar = this.f26381w;
        if (hfgVar != null) {
            hfgVar.m30378i();
            this.f26381w = null;
        }
        hfg hfgVar2 = this.f26382x;
        if (hfgVar2 != null) {
            hfgVar2.m30378i();
            this.f26382x = null;
        }
        hfg hfgVar3 = this.f26383y;
        if (hfgVar3 != null) {
            hfgVar3.m30378i();
            this.f26383y = null;
        }
        hfg hfgVar4 = this.f26384z;
        if (hfgVar4 != null) {
            hfgVar4.m30378i();
            this.f26384z = null;
        }
        rfg rfgVar = this.f26379u;
        if (rfgVar != null) {
            rfgVar.m46666i();
            this.f26379u = null;
        }
        g16 g16Var = this.f26380v;
        if (g16Var != null) {
            g16Var.m27907f();
            this.f26380v = null;
        }
        rfg rfgVar2 = this.f26378t;
        if (rfgVar2 != null) {
            rfgVar2.m46666i();
            this.f26378t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List b0(String str, String str2, c9i c9iVar, k7g k7gVar, k7g k7gVar2) {
        elh.m25220a();
        if (k7gVar2 != null) {
            c0(str, str2, c9iVar, k7gVar, k7gVar2);
            d0(str, str2, c9iVar, k7gVar, k7gVar2);
            this.f26380v = k0(m54087f(), m54098r(), k7gVar, this.f26376r, this.f26377s);
            Map mapM44653A = this.f26375q.m44653A(this.f26383y, this.f26384z, m54103x(), m54104z() != null);
            g16.C13599c c13599cM27910i = this.f26380v.m27910i(g16.AbstractC13598b.m27913d(this.f26383y, this.f26384z, new ArrayList(mapM44653A.values())));
            HashMap map = new HashMap();
            for (Map.Entry entry : mapM44653A.entrySet()) {
                map.put((w8i) entry.getKey(), (hfg) c13599cM27910i.get(entry.getValue()));
            }
            this.f26375q.m44661K(map);
            return t3c.m49220a(new Object[]{this.f26371A.m19052o(), this.f26372B.m19052o()});
        }
        c0(str, str2, c9iVar, k7gVar, null);
        v92 v92VarM54087f = m54087f();
        Objects.requireNonNull(v92VarM54087f);
        this.f26379u = m0(v92VarM54087f, k7gVar);
        Map mapM44668z = this.f26375q.m44668z(this.f26383y, m54103x(), m54104z() != null);
        rfg.C16604c c16604cM46670m = this.f26379u.m46670m(rfg.AbstractC16603b.m46673c(this.f26383y, new ArrayList(mapM44668z.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry2 : mapM44668z.entrySet()) {
            map2.put((w8i) entry2.getKey(), (hfg) c16604cM46670m.get(entry2.getValue()));
        }
        this.f26375q.m44661K(map2);
        return t3c.m49220a(new Object[]{this.f26371A.m19052o()});
    }

    public final void c0(String str, String str2, c9i c9iVar, k7g k7gVar, k7g k7gVar2) {
        Matrix matrixM54101u = m54101u();
        v92 v92VarM54087f = m54087f();
        Objects.requireNonNull(v92VarM54087f);
        boolean zMo42848p = v92VarM54087f.mo42848p();
        Rect rectI0 = i0(k7gVar.mo35129e());
        Objects.requireNonNull(rectI0);
        v92 v92VarM54087f2 = m54087f();
        Objects.requireNonNull(v92VarM54087f2);
        int iM54096p = m54096p(v92VarM54087f2);
        v92 v92VarM54087f3 = m54087f();
        Objects.requireNonNull(v92VarM54087f3);
        hfg hfgVar = new hfg(3, 34, k7gVar, matrixM54101u, zMo42848p, rectI0, iM54096p, -1, m54069B(v92VarM54087f3));
        this.f26381w = hfgVar;
        v92 v92VarM54087f4 = m54087f();
        Objects.requireNonNull(v92VarM54087f4);
        this.f26383y = l0(hfgVar, v92VarM54087f4);
        bhf.C12402b c12402bE0 = e0(this.f26381w, c9iVar, k7gVar);
        this.f26371A = c12402bE0;
        m29955Z(c12402bE0, str, str2, c9iVar, k7gVar, k7gVar2);
    }

    public final void d0(String str, String str2, c9i c9iVar, k7g k7gVar, k7g k7gVar2) {
        Matrix matrixM54101u = m54101u();
        v92 v92VarM54098r = m54098r();
        Objects.requireNonNull(v92VarM54098r);
        boolean zMo42848p = v92VarM54098r.mo42848p();
        Rect rectI0 = i0(k7gVar2.mo35129e());
        Objects.requireNonNull(rectI0);
        v92 v92VarM54098r2 = m54098r();
        Objects.requireNonNull(v92VarM54098r2);
        int iM54096p = m54096p(v92VarM54098r2);
        v92 v92VarM54098r3 = m54098r();
        Objects.requireNonNull(v92VarM54098r3);
        hfg hfgVar = new hfg(3, 34, k7gVar2, matrixM54101u, zMo42848p, rectI0, iM54096p, -1, m54069B(v92VarM54098r3));
        this.f26382x = hfgVar;
        v92 v92VarM54098r4 = m54098r();
        Objects.requireNonNull(v92VarM54098r4);
        this.f26384z = l0(hfgVar, v92VarM54098r4);
        bhf.C12402b c12402bE0 = e0(this.f26382x, c9iVar, k7gVar2);
        this.f26372B = c12402bE0;
        m29955Z(c12402bE0, str, str2, c9iVar, k7gVar, k7gVar2);
    }

    public final bhf.C12402b e0(hfg hfgVar, c9i c9iVar, k7g k7gVar) {
        bhf.C12402b c12402bM19037p = bhf.C12402b.m19037p(c9iVar, k7gVar.mo35129e());
        r0(c12402bM19037p);
        q0(k7gVar.mo35129e(), c12402bM19037p);
        c12402bM19037p.m19050m(hfgVar.m30384o(), k7gVar.mo35126b(), null, -1);
        c12402bM19037p.m19047j(this.f26375q.m44654C());
        if (k7gVar.mo35128d() != null) {
            c12402bM19037p.m19044g(k7gVar.mo35128d());
        }
        return c12402bM19037p;
    }

    public Set h0() {
        return this.f26375q.m44667y();
    }

    public final Rect i0(Size size) {
        return m54104z() != null ? m54104z() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    @Override // p001o.w8i
    /* renamed from: j */
    public c9i mo17069j(boolean z, d9i d9iVar) {
        mq3 mq3VarMo22642a = d9iVar.mo22642a(this.f26374p.mo20533M(), 1);
        if (z) {
            mq3VarMo22642a = mq3.m39506z(mq3VarMo22642a, this.f26374p.getConfig());
        }
        if (mq3VarMo22642a == null) {
            return null;
        }
        return mo17071y(mq3VarMo22642a).mo17074b();
    }

    public final g16 k0(v92 v92Var, v92 v92Var2, k7g k7gVar, ei9 ei9Var, ei9 ei9Var2) {
        return new g16(v92Var, v92Var2, d16.C12779a.m22220a(k7gVar.mo35126b(), ei9Var, ei9Var2));
    }

    public final hfg l0(hfg hfgVar, v92 v92Var) {
        m54091k();
        return hfgVar;
    }

    public final rfg m0(v92 v92Var, k7g k7gVar) {
        m54091k();
        return new rfg(v92Var, li5.C15079a.m37301a(k7gVar.mo35126b()));
    }

    public final void q0(Size size, bhf.C12402b c12402b) {
        Iterator it = h0().iterator();
        while (it.hasNext()) {
            bhf bhfVarM19052o = bhf.C12402b.m19037p(((w8i) it.next()).m54090i(), size).m19052o();
            c12402b.m19040c(bhfVarM19052o.m19030i());
            c12402b.m19038a(bhfVarM19052o.m19034m());
            c12402b.m19041d(bhfVarM19052o.m19032k());
            c12402b.m19039b(bhfVarM19052o.m19025c());
            c12402b.m19044g(bhfVarM19052o.m19027f());
        }
    }

    public final void r0(bhf.C12402b c12402b) {
        Iterator it = h0().iterator();
        int iM19024e = -1;
        while (it.hasNext()) {
            iM19024e = bhf.m19024e(iM19024e, g0((w8i) it.next()));
        }
        if (iM19024e != -1) {
            c12402b.m19060x(iM19024e);
        }
    }

    @Override // p001o.w8i
    /* renamed from: w */
    public Set mo17070w() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // p001o.w8i
    /* renamed from: y */
    public c9i.InterfaceC12595a mo17071y(mq3 mq3Var) {
        return new i7g(qpb.b0(mq3Var));
    }
}
