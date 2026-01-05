package p001o;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001o.bhf;
import p001o.h7g;
import p001o.w8i;
import p001o.yj5;

/* loaded from: classes2.dex */
public class q0j implements w8i.InterfaceC17799b {

    /* renamed from: a */
    public final Set f41070a;

    /* renamed from: e */
    public final d9i f41074e;

    /* renamed from: f */
    public final v92 f41075f;

    /* renamed from: g */
    public final v92 f41076g;

    /* renamed from: q */
    public final Set f41078q;

    /* renamed from: s */
    public final Map f41079s;

    /* renamed from: x */
    public final pne f41080x;

    /* renamed from: y */
    public pne f41081y;

    /* renamed from: b */
    public final Map f41071b = new HashMap();

    /* renamed from: c */
    public final Map f41072c = new HashMap();

    /* renamed from: d */
    public final Map f41073d = new HashMap();

    /* renamed from: h */
    public final j72 f41077h = m44665s();

    /* renamed from: o.q0j$a */
    public class C16269a extends j72 {
        public C16269a() {
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            super.mo4682b(i, u72Var);
            Iterator it = q0j.this.f41070a.iterator();
            while (it.hasNext()) {
                q0j.m44647J(u72Var, ((w8i) it.next()).m54102v(), i);
            }
        }
    }

    public q0j(v92 v92Var, v92 v92Var2, Set set, d9i d9iVar, h7g.InterfaceC13892a interfaceC13892a) {
        this.f41075f = v92Var;
        this.f41076g = v92Var2;
        this.f41074e = d9iVar;
        this.f41070a = set;
        Map mapM44648L = m44648L(v92Var, set, d9iVar);
        this.f41079s = mapM44648L;
        HashSet hashSet = new HashSet(mapM44648L.values());
        this.f41078q = hashSet;
        this.f41080x = new pne(v92Var, hashSet);
        if (v92Var2 != null) {
            this.f41081y = new pne(v92Var2, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            this.f41073d.put(w8iVar, Boolean.FALSE);
            this.f41072c.put(w8iVar, new p0j(v92Var, this, interfaceC13892a));
        }
    }

    /* renamed from: B */
    public static int m44646B(Set set) {
        Iterator it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((c9i) it.next()).m20540x(0));
        }
        return iMax;
    }

    /* renamed from: J */
    public static void m44647J(u72 u72Var, bhf bhfVar, int i) {
        Iterator it = bhfVar.m19030i().iterator();
        while (it.hasNext()) {
            ((j72) it.next()).mo4682b(i, new r0j(bhfVar.m19031j().m20888j(), u72Var));
        }
    }

    /* renamed from: L */
    public static Map m44648L(v92 v92Var, Set set, d9i d9iVar) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            map.put(w8iVar, w8iVar.m54070C(v92Var.mo26122j(), null, w8iVar.mo17069j(true, d9iVar)));
        }
        return map;
    }

    /* renamed from: t */
    public static void m44649t(hfg hfgVar, yj5 yj5Var, bhf bhfVar) {
        hfgVar.m30390u();
        try {
            hfgVar.m30372B(yj5Var);
        } catch (yj5.C18418a unused) {
            if (bhfVar.m19026d() != null) {
                bhfVar.m19026d().mo19062a(bhfVar, bhf.EnumC12407g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    /* renamed from: u */
    public static int m44650u(w8i w8iVar) {
        return w8iVar instanceof sc8 ? 256 : 34;
    }

    /* renamed from: w */
    public static yj5 m44651w(w8i w8iVar) {
        List listM19035n = w8iVar instanceof sc8 ? w8iVar.m54102v().m19035n() : w8iVar.m54102v().m19031j().m20887i();
        fgd.m26665i(listM19035n.size() <= 1);
        if (listM19035n.size() == 1) {
            return (yj5) listM19035n.get(0);
        }
        return null;
    }

    /* renamed from: x */
    public static int m44652x(w8i w8iVar) {
        if (w8iVar instanceof ahd) {
            return 1;
        }
        return w8iVar instanceof sc8 ? 4 : 2;
    }

    /* renamed from: A */
    public Map m44653A(hfg hfgVar, hfg hfgVar2, int i, boolean z) {
        HashMap map = new HashMap();
        for (w8i w8iVar : this.f41070a) {
            wfc wfcVarM44664r = m44664r(w8iVar, this.f41080x, this.f41075f, hfgVar, i, z);
            pne pneVar = this.f41081y;
            v92 v92Var = this.f41076g;
            Objects.requireNonNull(v92Var);
            map.put(w8iVar, s06.m47371c(wfcVarM44664r, m44664r(w8iVar, pneVar, v92Var, hfgVar2, i, z)));
        }
        return map;
    }

    /* renamed from: C */
    public j72 m44654C() {
        return this.f41077h;
    }

    /* renamed from: D */
    public final hfg m44655D(w8i w8iVar) {
        hfg hfgVar = (hfg) this.f41071b.get(w8iVar);
        Objects.requireNonNull(hfgVar);
        return hfgVar;
    }

    /* renamed from: E */
    public final boolean m44656E(w8i w8iVar) {
        Boolean bool = (Boolean) this.f41073d.get(w8iVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: F */
    public void m44657F(vob vobVar) {
        vobVar.mo45760N(qd8.f41693s, this.f41080x.m43944o(vobVar));
        vobVar.mo45760N(c9i.f17557A, Integer.valueOf(m44646B(this.f41078q)));
        y16 y16VarM20093d = c26.m20093d(this.f41078q);
        if (y16VarM20093d == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        vobVar.mo45760N(kd8.f31943i, y16VarM20093d);
        for (w8i w8iVar : this.f41070a) {
            if (w8iVar.m54090i().m20538t() != 0) {
                vobVar.mo45760N(c9i.f17563G, Integer.valueOf(w8iVar.m54090i().m20538t()));
            }
            if (w8iVar.m54090i().m20530B() != 0) {
                vobVar.mo45760N(c9i.f17562F, Integer.valueOf(w8iVar.m54090i().m20530B()));
            }
        }
    }

    /* renamed from: G */
    public void m44658G() {
        for (w8i w8iVar : this.f41070a) {
            w8iVar.mo29953K();
            w8iVar.mo48155I();
        }
    }

    /* renamed from: H */
    public void m44659H() {
        Iterator it = this.f41070a.iterator();
        while (it.hasNext()) {
            ((w8i) it.next()).mo29954L();
        }
    }

    /* renamed from: I */
    public void m44660I() {
        elh.m25220a();
        Iterator it = this.f41070a.iterator();
        while (it.hasNext()) {
            mo26124m((w8i) it.next());
        }
    }

    /* renamed from: K */
    public void m44661K(Map map) {
        this.f41071b.clear();
        this.f41071b.putAll(map);
        for (Map.Entry entry : this.f41071b.entrySet()) {
            w8i w8iVar = (w8i) entry.getKey();
            hfg hfgVar = (hfg) entry.getValue();
            w8iVar.mo17067S(hfgVar.m30383n());
            w8iVar.m54077R(hfgVar.m30386q());
            w8iVar.m54080V(hfgVar.m30387r(), null);
            w8iVar.m54074G();
        }
    }

    /* renamed from: M */
    public void m44662M() {
        for (w8i w8iVar : this.f41070a) {
            p0j p0jVar = (p0j) this.f41072c.get(w8iVar);
            Objects.requireNonNull(p0jVar);
            w8iVar.m54078T(p0jVar);
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: b */
    public void mo26114b(w8i w8iVar) {
        elh.m25220a();
        if (m44656E(w8iVar)) {
            return;
        }
        this.f41073d.put(w8iVar, Boolean.TRUE);
        yj5 yj5VarM44651w = m44651w(w8iVar);
        if (yj5VarM44651w != null) {
            m44649t(m44655D(w8iVar), yj5VarM44651w, w8iVar.m54102v());
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: e */
    public void mo26117e(w8i w8iVar) {
        elh.m25220a();
        if (m44656E(w8iVar)) {
            hfg hfgVarM44655D = m44655D(w8iVar);
            yj5 yj5VarM44651w = m44651w(w8iVar);
            if (yj5VarM44651w != null) {
                m44649t(hfgVarM44655D, yj5VarM44651w, w8iVar.m54102v());
            } else {
                hfgVarM44655D.m30382m();
            }
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: g */
    public void mo26119g(w8i w8iVar) {
        elh.m25220a();
        if (m44656E(w8iVar)) {
            this.f41073d.put(w8iVar, Boolean.FALSE);
            m44655D(w8iVar).m30382m();
        }
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: m */
    public void mo26124m(w8i w8iVar) {
        yj5 yj5VarM44651w;
        elh.m25220a();
        hfg hfgVarM44655D = m44655D(w8iVar);
        if (m44656E(w8iVar) && (yj5VarM44651w = m44651w(w8iVar)) != null) {
            m44649t(hfgVarM44655D, yj5VarM44651w, w8iVar.m54102v());
        }
    }

    /* renamed from: o */
    public void m44663o() {
        for (w8i w8iVar : this.f41070a) {
            p0j p0jVar = (p0j) this.f41072c.get(w8iVar);
            Objects.requireNonNull(p0jVar);
            w8iVar.m54083b(p0jVar, null, null, w8iVar.mo17069j(true, this.f41074e));
        }
    }

    /* renamed from: r */
    public final wfc m44664r(w8i w8iVar, pne pneVar, v92 v92Var, hfg hfgVar, int i, boolean z) {
        int iMo38387j = v92Var.mo28113a().mo38387j(i);
        boolean zM55043l = wuh.m55043l(hfgVar.m30386q());
        c9i c9iVar = (c9i) this.f41079s.get(w8iVar);
        Objects.requireNonNull(c9iVar);
        Pair pairM43947s = pneVar.m43947s(c9iVar, hfgVar.m30383n(), wuh.m55038g(hfgVar.m30386q()), z);
        Rect rect = (Rect) pairM43947s.first;
        Size size = (Size) pairM43947s.second;
        int iM44666v = m44666v(w8iVar, this.f41075f);
        p0j p0jVar = (p0j) this.f41072c.get(w8iVar);
        Objects.requireNonNull(p0jVar);
        p0jVar.m42847o(iM44666v);
        int iM55052u = wuh.m55052u((hfgVar.m30385p() + iM44666v) - iMo38387j);
        return wfc.m54332h(m44652x(w8iVar), m44650u(w8iVar), rect, wuh.m55046o(size, iM55052u), iM55052u, w8iVar.m54069B(v92Var) ^ zM55043l);
    }

    /* renamed from: s */
    public j72 m44665s() {
        return new C16269a();
    }

    /* renamed from: v */
    public final int m44666v(w8i w8iVar, v92 v92Var) {
        return v92Var.mo28113a().mo38387j(((qd8) w8iVar.m54090i()).m45154D(0));
    }

    /* renamed from: y */
    public Set m44667y() {
        return this.f41070a;
    }

    /* renamed from: z */
    public Map m44668z(hfg hfgVar, int i, boolean z) {
        HashMap map = new HashMap();
        for (w8i w8iVar : this.f41070a) {
            map.put(w8iVar, m44664r(w8iVar, this.f41080x, this.f41075f, hfgVar, i, z));
        }
        return map;
    }
}
