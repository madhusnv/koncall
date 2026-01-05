package p001o;

import com.bumptech.glide.C10726c;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.gjb;
import p001o.u75;

/* loaded from: classes5.dex */
public final class t75 {

    /* renamed from: a */
    public final List f46555a = new ArrayList();

    /* renamed from: b */
    public final List f46556b = new ArrayList();

    /* renamed from: c */
    public C10726c f46557c;

    /* renamed from: d */
    public Object f46558d;

    /* renamed from: e */
    public int f46559e;

    /* renamed from: f */
    public int f46560f;

    /* renamed from: g */
    public Class f46561g;

    /* renamed from: h */
    public u75.InterfaceC17317e f46562h;

    /* renamed from: i */
    public rec f46563i;

    /* renamed from: j */
    public Map f46564j;

    /* renamed from: k */
    public Class f46565k;

    /* renamed from: l */
    public boolean f46566l;

    /* renamed from: m */
    public boolean f46567m;

    /* renamed from: n */
    public ic9 f46568n;

    /* renamed from: o */
    public gid f46569o;

    /* renamed from: p */
    public qt5 f46570p;

    /* renamed from: q */
    public boolean f46571q;

    /* renamed from: r */
    public boolean f46572r;

    /* renamed from: a */
    public void m49501a() {
        this.f46557c = null;
        this.f46558d = null;
        this.f46568n = null;
        this.f46561g = null;
        this.f46565k = null;
        this.f46563i = null;
        this.f46569o = null;
        this.f46564j = null;
        this.f46570p = null;
        this.f46555a.clear();
        this.f46566l = false;
        this.f46556b.clear();
        this.f46567m = false;
    }

    /* renamed from: b */
    public wo0 m49502b() {
        return this.f46557c.m12669b();
    }

    /* renamed from: c */
    public List m49503c() {
        if (!this.f46567m) {
            this.f46567m = true;
            this.f46556b.clear();
            List listM49507g = m49507g();
            int size = listM49507g.size();
            for (int i = 0; i < size; i++) {
                gjb.C13758a c13758a = (gjb.C13758a) listM49507g.get(i);
                if (!this.f46556b.contains(c13758a.f25337a)) {
                    this.f46556b.add(c13758a.f25337a);
                }
                for (int i2 = 0; i2 < c13758a.f25338b.size(); i2++) {
                    if (!this.f46556b.contains(c13758a.f25338b.get(i2))) {
                        this.f46556b.add(c13758a.f25338b.get(i2));
                    }
                }
            }
        }
        return this.f46556b;
    }

    /* renamed from: d */
    public ot5 m49504d() {
        return this.f46562h.mo51116a();
    }

    /* renamed from: e */
    public qt5 m49505e() {
        return this.f46570p;
    }

    /* renamed from: f */
    public int m49506f() {
        return this.f46560f;
    }

    /* renamed from: g */
    public List m49507g() {
        if (!this.f46566l) {
            this.f46566l = true;
            this.f46555a.clear();
            List listM23126i = this.f46557c.m12676i().m23126i(this.f46558d);
            int size = listM23126i.size();
            for (int i = 0; i < size; i++) {
                gjb.C13758a c13758aMo18150b = ((gjb) listM23126i.get(i)).mo18150b(this.f46558d, this.f46559e, this.f46560f, this.f46563i);
                if (c13758aMo18150b != null) {
                    this.f46555a.add(c13758aMo18150b);
                }
            }
        }
        return this.f46555a;
    }

    /* renamed from: h */
    public uga m49508h(Class cls) {
        return this.f46557c.m12676i().m23125h(cls, this.f46561g, this.f46565k);
    }

    /* renamed from: i */
    public Class m49509i() {
        return this.f46558d.getClass();
    }

    /* renamed from: j */
    public List m49510j(File file) {
        return this.f46557c.m12676i().m23126i(file);
    }

    /* renamed from: k */
    public rec m49511k() {
        return this.f46563i;
    }

    /* renamed from: l */
    public gid m49512l() {
        return this.f46569o;
    }

    /* renamed from: m */
    public List m49513m() {
        return this.f46557c.m12676i().m23127j(this.f46558d.getClass(), this.f46561g, this.f46565k);
    }

    /* renamed from: n */
    public loe m49514n(zne zneVar) {
        return this.f46557c.m12676i().m23128k(zneVar);
    }

    /* renamed from: o */
    public InterfaceC10732a m49515o(Object obj) {
        return this.f46557c.m12676i().m23129l(obj);
    }

    /* renamed from: p */
    public ic9 m49516p() {
        return this.f46568n;
    }

    /* renamed from: q */
    public i76 m49517q(Object obj) {
        return this.f46557c.m12676i().m23130m(obj);
    }

    /* renamed from: r */
    public Class m49518r() {
        return this.f46565k;
    }

    /* renamed from: s */
    public xuh m49519s(Class cls) {
        xuh xuhVar = (xuh) this.f46564j.get(cls);
        if (xuhVar == null) {
            Iterator it = this.f46564j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    xuhVar = (xuh) entry.getValue();
                    break;
                }
            }
        }
        if (xuhVar != null) {
            return xuhVar;
        }
        if (!this.f46564j.isEmpty() || !this.f46571q) {
            return f4i.m26071c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int m49520t() {
        return this.f46559e;
    }

    /* renamed from: u */
    public boolean m49521u(Class cls) {
        return m49508h(cls) != null;
    }

    /* renamed from: v */
    public void m49522v(C10726c c10726c, Object obj, ic9 ic9Var, int i, int i2, qt5 qt5Var, Class cls, Class cls2, gid gidVar, rec recVar, Map map, boolean z, boolean z2, u75.InterfaceC17317e interfaceC17317e) {
        this.f46557c = c10726c;
        this.f46558d = obj;
        this.f46568n = ic9Var;
        this.f46559e = i;
        this.f46560f = i2;
        this.f46570p = qt5Var;
        this.f46561g = cls;
        this.f46562h = interfaceC17317e;
        this.f46565k = cls2;
        this.f46569o = gidVar;
        this.f46563i = recVar;
        this.f46564j = map;
        this.f46571q = z;
        this.f46572r = z2;
    }

    /* renamed from: w */
    public boolean m49523w(zne zneVar) {
        return this.f46557c.m12676i().m23131n(zneVar);
    }

    /* renamed from: x */
    public boolean m49524x() {
        return this.f46572r;
    }

    /* renamed from: y */
    public boolean m49525y(ic9 ic9Var) {
        List listM49507g = m49507g();
        int size = listM49507g.size();
        for (int i = 0; i < size; i++) {
            if (((gjb.C13758a) listM49507g.get(i)).f25337a.equals(ic9Var)) {
                return true;
            }
        }
        return false;
    }
}
