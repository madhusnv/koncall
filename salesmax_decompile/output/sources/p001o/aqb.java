package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001o.ywf;

/* loaded from: classes2.dex */
public class aqb extends xwf {

    /* renamed from: p */
    public static final C12235a f15130p = new C12235a(null);

    /* renamed from: q */
    public static final int f15131q = 8;

    /* renamed from: r */
    public static final int[] f15132r = new int[0];

    /* renamed from: g */
    public final xk7 f15133g;

    /* renamed from: h */
    public final xk7 f15134h;

    /* renamed from: i */
    public int f15135i;

    /* renamed from: j */
    public lb8 f15136j;

    /* renamed from: k */
    public List f15137k;

    /* renamed from: l */
    public axf f15138l;

    /* renamed from: m */
    public int[] f15139m;

    /* renamed from: n */
    public int f15140n;

    /* renamed from: o */
    public boolean f15141o;

    /* renamed from: o.aqb$a */
    public static final class C12235a {
        public C12235a() {
        }

        public /* synthetic */ C12235a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(int i, axf axfVar, xk7 xk7Var, xk7 xk7Var2) {
        super(i, axfVar, null);
        sq8.m48649h(axfVar, "invalid");
        this.f15133g = xk7Var;
        this.f15134h = xk7Var2;
        this.f15138l = axf.f15344e.m17959a();
        this.f15139m = f15132r;
        this.f15140n = 1;
    }

    /* renamed from: A */
    public final void m17661A() {
        lb8 lb8VarMo17665E = mo17665E();
        if (lb8VarMo17665E != null) {
            m17677Q();
            mo17675O(null);
            int iMo39744f = mo39744f();
            Object[] objArrM36856p = lb8VarMo17665E.m36856p();
            int size = lb8VarMo17665E.size();
            for (int i = 0; i < size; i++) {
                Object obj = objArrM36856p[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (f5g f5gVarMo22332n = ((d5g) obj).mo22332n(); f5gVarMo22332n != null; f5gVarMo22332n = f5gVarMo22332n.m26183e()) {
                    if (f5gVarMo22332n.m26184f() == iMo39744f || kh3.m35708X(this.f15138l, Integer.valueOf(f5gVarMo22332n.m26184f()))) {
                        f5gVarMo22332n.m26186h(0);
                    }
                }
            }
        }
        m56919b();
    }

    /* renamed from: B */
    public final void m17662B() {
        m17669I(mo39744f());
        y3i y3iVar = y3i.f54824a;
        if (m17664D() || m56920e()) {
            return;
        }
        int iMo39744f = mo39744f();
        synchronized (exf.m25775G()) {
            int i = exf.f22341e;
            exf.f22341e = i + 1;
            mo39746u(i);
            exf.f22340d = exf.f22340d.m17953A(mo39744f());
        }
        mo39747v(exf.m25818x(mo39745g(), iMo39744f + 1, mo39744f()));
    }

    /* renamed from: C */
    public ywf mo17663C() {
        Map mapM25784P;
        lb8 lb8VarMo17665E;
        lb8 lb8VarMo17665E2 = mo17665E();
        if (lb8VarMo17665E2 != null) {
            Object obj = exf.f22346j.get();
            sq8.m48648g(obj, "currentGlobalSnapshot.get()");
            mapM25784P = exf.m25784P((aqb) obj, this, exf.f22340d.m17955r(((rt7) exf.f22346j.get()).mo39744f()));
        } else {
            mapM25784P = null;
        }
        List listM21246k = ch3.m21246k();
        synchronized (exf.m25775G()) {
            exf.e0(this);
            boolean z = true;
            if (lb8VarMo17665E2 == null || lb8VarMo17665E2.size() == 0) {
                mo17679c();
                rt7 rt7Var = (rt7) exf.f22346j.get();
                sq8.m48648g(rt7Var, "previousGlobalSnapshot");
                exf.m25793Y(rt7Var, exf.f22337a);
                lb8VarMo17665E = rt7Var.mo17665E();
                if (lb8VarMo17665E == null || lb8VarMo17665E.isEmpty()) {
                    lb8VarMo17665E = null;
                } else {
                    listM21246k = kh3.T0(exf.f22344h);
                }
            } else {
                rt7 rt7Var2 = (rt7) exf.f22346j.get();
                ywf ywfVarM17668H = m17668H(exf.f22341e, mapM25784P, exf.f22340d.m17955r(rt7Var2.mo39744f()));
                if (!sq8.m48644c(ywfVarM17668H, ywf.C18517b.f56218a)) {
                    return ywfVarM17668H;
                }
                mo17679c();
                sq8.m48648g(rt7Var2, "previousGlobalSnapshot");
                exf.m25793Y(rt7Var2, exf.f22337a);
                lb8VarMo17665E = rt7Var2.mo17665E();
                mo17675O(null);
                rt7Var2.mo17675O(null);
                listM21246k = kh3.T0(exf.f22344h);
            }
            y3i y3iVar = y3i.f54824a;
            this.f15141o = true;
            if (!(lb8VarMo17665E == null || lb8VarMo17665E.isEmpty())) {
                sq8.m48646e(lb8VarMo17665E);
                int size = listM21246k.size();
                for (int i = 0; i < size; i++) {
                    ((nl7) listM21246k.get(i)).invoke(lb8VarMo17665E, this);
                }
            }
            if (lb8VarMo17665E2 != null && !lb8VarMo17665E2.isEmpty()) {
                z = false;
            }
            if (!z) {
                int size2 = listM21246k.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((nl7) listM21246k.get(i2)).invoke(lb8VarMo17665E2, this);
                }
            }
            synchronized (exf.m25775G()) {
                mo17689r();
                exf.m25769A();
                if (lb8VarMo17665E != null) {
                    Object[] objArrM36856p = lb8VarMo17665E.m36856p();
                    int size3 = lb8VarMo17665E.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        Object obj2 = objArrM36856p[i3];
                        sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        exf.m25787S((d5g) obj2);
                    }
                }
                if (lb8VarMo17665E2 != null) {
                    Object[] objArrM36856p2 = lb8VarMo17665E2.m36856p();
                    int size4 = lb8VarMo17665E2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj3 = objArrM36856p2[i4];
                        sq8.m48647f(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        exf.m25787S((d5g) obj3);
                    }
                }
                List list = this.f15137k;
                if (list != null) {
                    int size5 = list.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        exf.m25787S((d5g) list.get(i5));
                    }
                }
                this.f15137k = null;
                y3i y3iVar2 = y3i.f54824a;
            }
            return ywf.C18517b.f56218a;
        }
    }

    /* renamed from: D */
    public final boolean m17664D() {
        return this.f15141o;
    }

    /* renamed from: E */
    public lb8 mo17665E() {
        return this.f15136j;
    }

    /* renamed from: F */
    public final axf m17666F() {
        return this.f15138l;
    }

    /* renamed from: G */
    public final int[] m17667G() {
        return this.f15139m;
    }

    /* renamed from: H */
    public final ywf m17668H(int i, Map map, axf axfVar) {
        f5g f5gVarM25789U;
        f5g f5gVarMo22331d;
        axf axfVar2 = axfVar;
        sq8.m48649h(axfVar2, "invalidSnapshots");
        axf axfVarM17958y = mo39745g().m17953A(mo39744f()).m17958y(this.f15138l);
        lb8 lb8VarMo17665E = mo17665E();
        sq8.m48646e(lb8VarMo17665E);
        Object[] objArrM36856p = lb8VarMo17665E.m36856p();
        int size = lb8VarMo17665E.size();
        ArrayList arrayList = null;
        List listX0 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = objArrM36856p[i2];
            sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            d5g d5gVar = (d5g) obj;
            f5g f5gVarMo22332n = d5gVar.mo22332n();
            f5g f5gVarM25789U2 = exf.m25789U(f5gVarMo22332n, i, axfVar2);
            if (f5gVarM25789U2 != null && (f5gVarM25789U = exf.m25789U(f5gVarMo22332n, mo39744f(), axfVarM17958y)) != null && !sq8.m48644c(f5gVarM25789U2, f5gVarM25789U)) {
                f5g f5gVarM25789U3 = exf.m25789U(f5gVarMo22332n, mo39744f(), mo39745g());
                if (f5gVarM25789U3 == null) {
                    exf.m25788T();
                    throw new qe9();
                }
                if (map == null || (f5gVarMo22331d = (f5g) map.get(f5gVarM25789U2)) == null) {
                    f5gVarMo22331d = d5gVar.mo22331d(f5gVarM25789U, f5gVarM25789U2, f5gVarM25789U3);
                }
                if (f5gVarMo22331d == null) {
                    return new ywf.C18516a(this);
                }
                if (!sq8.m48644c(f5gVarMo22331d, f5gVarM25789U3)) {
                    if (sq8.m48644c(f5gVarMo22331d, f5gVarM25789U2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(vyh.m53620a(d5gVar, f5gVarM25789U2.mo26182d()));
                        if (listX0 == null) {
                            listX0 = new ArrayList();
                        }
                        listX0.add(d5gVar);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!sq8.m48644c(f5gVarMo22331d, f5gVarM25789U) ? vyh.m53620a(d5gVar, f5gVarMo22331d) : vyh.m53620a(d5gVar, f5gVarM25789U.mo26182d()));
                    }
                }
            }
            i2++;
            axfVar2 = axfVar;
        }
        if (arrayList != null) {
            m17662B();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                hwc hwcVar = (hwc) arrayList.get(i3);
                d5g d5gVar2 = (d5g) hwcVar.m31227a();
                f5g f5gVar = (f5g) hwcVar.m31228b();
                f5gVar.m26186h(mo39744f());
                synchronized (exf.m25775G()) {
                    f5gVar.m26185g(d5gVar2.mo22332n());
                    d5gVar2.mo22333r(f5gVar);
                    y3i y3iVar = y3i.f54824a;
                }
            }
        }
        if (listX0 != null) {
            int size3 = listX0.size();
            for (int i4 = 0; i4 < size3; i4++) {
                lb8VarMo17665E.remove((d5g) listX0.get(i4));
            }
            List list = this.f15137k;
            if (list != null) {
                listX0 = kh3.x0(list, listX0);
            }
            this.f15137k = listX0;
        }
        return ywf.C18517b.f56218a;
    }

    /* renamed from: I */
    public final void m17669I(int i) {
        synchronized (exf.m25775G()) {
            this.f15138l = this.f15138l.m17953A(i);
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: J */
    public final void m17670J(axf axfVar) {
        sq8.m48649h(axfVar, "snapshots");
        synchronized (exf.m25775G()) {
            this.f15138l = this.f15138l.m17958y(axfVar);
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: K */
    public final void m17671K(int i) {
        if (i >= 0) {
            this.f15139m = fp0.m27276y(this.f15139m, i);
        }
    }

    /* renamed from: L */
    public final void m17672L(int[] iArr) {
        sq8.m48649h(iArr, "handles");
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f15139m;
        if (!(iArr2.length == 0)) {
            iArr = fp0.m27277z(iArr2, iArr);
        }
        this.f15139m = iArr;
    }

    /* renamed from: M */
    public final void m17673M() {
        int length = this.f15139m.length;
        for (int i = 0; i < length; i++) {
            exf.m25791W(this.f15139m[i]);
        }
    }

    /* renamed from: N */
    public final void m17674N(boolean z) {
        this.f15141o = z;
    }

    /* renamed from: O */
    public void mo17675O(lb8 lb8Var) {
        this.f15136j = lb8Var;
    }

    /* renamed from: P */
    public aqb mo17676P(xk7 xk7Var, xk7 xk7Var2) {
        zsb zsbVar;
        m56926z();
        m17678R();
        m17669I(mo39744f());
        synchronized (exf.m25775G()) {
            int i = exf.f22341e;
            exf.f22341e = i + 1;
            exf.f22340d = exf.f22340d.m17953A(i);
            axf axfVarMo39745g = mo39745g();
            mo39747v(axfVarMo39745g.m17953A(i));
            zsbVar = new zsb(i, exf.m25818x(axfVarMo39745g, mo39744f() + 1, i), exf.m25778J(xk7Var, mo17681h(), false, 4, null), exf.m25779K(xk7Var2, mo17684k()), this);
        }
        if (!m17664D() && !m56920e()) {
            int iMo39744f = mo39744f();
            synchronized (exf.m25775G()) {
                int i2 = exf.f22341e;
                exf.f22341e = i2 + 1;
                mo39746u(i2);
                exf.f22340d = exf.f22340d.m17953A(mo39744f());
                y3i y3iVar = y3i.f54824a;
            }
            mo39747v(exf.m25818x(mo39745g(), iMo39744f + 1, mo39744f()));
        }
        return zsbVar;
    }

    /* renamed from: Q */
    public final void m17677Q() {
        if (!(!this.f15141o)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* renamed from: R */
    public final void m17678R() {
        boolean z = true;
        if (this.f15141o) {
            if (!(this.f54446d >= 0)) {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    @Override // p001o.xwf
    /* renamed from: c */
    public void mo17679c() {
        exf.f22340d = exf.f22340d.m17955r(mo39744f()).m17954p(this.f15138l);
    }

    @Override // p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        if (m56920e()) {
            return;
        }
        super.mo17680d();
        mo17686n(this);
    }

    @Override // p001o.xwf
    /* renamed from: h */
    public xk7 mo17681h() {
        return this.f15133g;
    }

    @Override // p001o.xwf
    /* renamed from: i */
    public boolean mo17682i() {
        return false;
    }

    @Override // p001o.xwf
    /* renamed from: j */
    public int mo17683j() {
        return this.f15135i;
    }

    @Override // p001o.xwf
    /* renamed from: k */
    public xk7 mo17684k() {
        return this.f15134h;
    }

    @Override // p001o.xwf
    /* renamed from: m */
    public void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        this.f15140n++;
    }

    @Override // p001o.xwf
    /* renamed from: n */
    public void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        int i = this.f15140n;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i - 1;
        this.f15140n = i2;
        if (i2 != 0 || this.f15141o) {
            return;
        }
        m17661A();
    }

    @Override // p001o.xwf
    /* renamed from: o */
    public void mo17687o() {
        if (this.f15141o || m56920e()) {
            return;
        }
        m17662B();
    }

    @Override // p001o.xwf
    /* renamed from: p */
    public void mo17688p(d5g d5gVar) {
        sq8.m48649h(d5gVar, "state");
        lb8 lb8VarMo17665E = mo17665E();
        if (lb8VarMo17665E == null) {
            lb8VarMo17665E = new lb8();
            mo17675O(lb8VarMo17665E);
        }
        lb8VarMo17665E.add(d5gVar);
    }

    @Override // p001o.xwf
    /* renamed from: r */
    public void mo17689r() {
        m17673M();
        super.mo17689r();
    }

    @Override // p001o.xwf
    /* renamed from: w */
    public void mo17690w(int i) {
        this.f15135i = i;
    }

    @Override // p001o.xwf
    /* renamed from: x */
    public xwf mo17691x(xk7 xk7Var) {
        atb atbVar;
        m56926z();
        m17678R();
        int iMo39744f = mo39744f();
        m17669I(mo39744f());
        synchronized (exf.m25775G()) {
            int i = exf.f22341e;
            exf.f22341e = i + 1;
            exf.f22340d = exf.f22340d.m17953A(i);
            atbVar = new atb(i, exf.m25818x(mo39745g(), iMo39744f + 1, i), xk7Var, this);
        }
        if (!m17664D() && !m56920e()) {
            int iMo39744f2 = mo39744f();
            synchronized (exf.m25775G()) {
                int i2 = exf.f22341e;
                exf.f22341e = i2 + 1;
                mo39746u(i2);
                exf.f22340d = exf.f22340d.m17953A(mo39744f());
                y3i y3iVar = y3i.f54824a;
            }
            mo39747v(exf.m25818x(mo39745g(), iMo39744f2 + 1, mo39744f()));
        }
        return atbVar;
    }
}
