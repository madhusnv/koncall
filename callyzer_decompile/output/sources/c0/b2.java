package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import be.C0655j;
import d0.AbstractC1545b;
import f0.C2166a;
import f0.C2168c;
import f0.C2171f;
import f0.EnumC2170e;
import i0.C3076g;
import i0.C3082m;
import i0.g2;
import i0.v2;
import i0.w2;
import i0.z2;
import j0.AbstractC3506f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import m0.C4612f;
import m0.InterfaceC4617k;
import mm.AbstractC4801l;
import t0.C6974b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: d */
    public w2 f5049d;

    /* renamed from: e */
    public final Object f5050e;

    /* renamed from: f */
    public HashSet f5051f;

    /* renamed from: g */
    public w2 f5052g;

    /* renamed from: h */
    public C3082m f5053h;

    /* renamed from: i */
    public w2 f5054i;

    /* renamed from: j */
    public Rect f5055j;

    /* renamed from: l */
    public i0.g0 f5057l;

    /* renamed from: m */
    public i0.g0 f5058m;

    /* renamed from: a */
    public final HashSet f5046a = new HashSet();

    /* renamed from: b */
    public final Object f5047b = new Object();

    /* renamed from: c */
    public z1 f5048c = z1.INACTIVE;

    /* renamed from: k */
    public Matrix f5056k = new Matrix();

    /* renamed from: n */
    public g2 f5059n = g2.m7340a();

    /* renamed from: o */
    public g2 f5060o = g2.m7340a();

    public b2(w2 w2Var) {
        this.f5050e = w2Var;
        this.f5052g = w2Var;
    }

    /* renamed from: A */
    public void mo2147A(Rect rect) {
        this.f5055j = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [i0.w2, java.lang.Object] */
    /* renamed from: B */
    public final void m2148B(i0.g0 g0Var) {
        mo2174y();
        synchronized (this.f5047b) {
            try {
                i0.g0 g0Var2 = this.f5057l;
                if (g0Var == g0Var2) {
                    this.f5046a.remove(g0Var2);
                    this.f5057l = null;
                }
                i0.g0 g0Var3 = this.f5058m;
                if (g0Var == g0Var3) {
                    this.f5046a.remove(g0Var3);
                    this.f5058m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f5053h = null;
        this.f5055j = null;
        this.f5052g = this.f5050e;
        this.f5049d = null;
        this.f5054i = null;
    }

    /* renamed from: C */
    public final void m2149C(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f5059n = (g2) list.get(0);
        if (list.size() > 1) {
            this.f5060o = (g2) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (i0.v0 v0Var : ((g2) it.next()).m7341b()) {
                if (v0Var.f16609j == null) {
                    v0Var.f16609j = getClass();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2150a(i0.b2 b2Var, C3082m c3082m) {
        Range range = C3082m.f16521h;
        if (!range.equals(c3082m.f16526e)) {
            Range range2 = c3082m.f16526e;
            C0655j c0655j = b2Var.f16425b;
            c0655j.getClass();
            ((i0.j1) c0655j.f4194d).m7352n(i0.q0.f16564j, range2);
            return;
        }
        synchronized (this.f5047b) {
            try {
                i0.g0 g0Var = this.f5057l;
                g0Var.getClass();
                ArrayList arrayListM5730h = g0Var.mo7319q().mo7331n().m5730h(AeFpsRangeQuirk.class);
                boolean z6 = true;
                if (arrayListM5730h.size() > 1) {
                    z6 = false;
                }
                og.y0.m11051a("There should not have more than one AeFpsRangeQuirk.", z6);
                if (!arrayListM5730h.isEmpty()) {
                    Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListM5730h.get(0))).f1820a;
                    if (range3 != null) {
                        range = range3;
                    }
                    C0655j c0655j2 = b2Var.f16425b;
                    c0655j2.getClass();
                    ((i0.j1) c0655j2.f4194d).m7352n(i0.q0.f16564j, range);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m2151b(i0.g0 g0Var, i0.g0 g0Var2, w2 w2Var, w2 w2Var2) {
        synchronized (this.f5047b) {
            this.f5057l = g0Var;
            this.f5058m = g0Var2;
            this.f5046a.add(g0Var);
            if (g0Var2 != null) {
                this.f5046a.add(g0Var2);
            }
        }
        this.f5049d = w2Var;
        this.f5054i = w2Var2;
        this.f5052g = m2163n(g0Var.mo7319q(), this.f5049d, this.f5054i);
        mo2167r();
    }

    /* renamed from: c */
    public final i0.g0 m2152c() {
        i0.g0 g0Var;
        synchronized (this.f5047b) {
            g0Var = this.f5057l;
        }
        return g0Var;
    }

    /* renamed from: d */
    public final i0.d0 m2153d() {
        synchronized (this.f5047b) {
            try {
                i0.g0 g0Var = this.f5057l;
                if (g0Var == null) {
                    return i0.d0.f16442a;
                }
                return g0Var.mo7311h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final String m2154e() {
        i0.g0 g0VarM2152c = m2152c();
        og.y0.m11055e(g0VarM2152c, "No camera attached to use case: " + this);
        return g0VarM2152c.mo7319q().mo7323e();
    }

    /* renamed from: f */
    public abstract w2 mo2155f(boolean z6, z2 z2Var);

    /* renamed from: g */
    public final String m2156g() {
        String str = (String) this.f5052g.mo7401e(InterfaceC4617k.M0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    /* renamed from: h */
    public final int m2157h(i0.g0 g0Var, boolean z6) {
        int iMo7329l = g0Var.mo7319q().mo7329l(((i0.b1) this.f5052g).m7300C());
        return (g0Var.mo7317o() || !z6) ? iMo7329l : AbstractC3506f.m8072g(-iMo7329l);
    }

    /* renamed from: i */
    public final i0.g0 m2158i() {
        i0.g0 g0Var;
        synchronized (this.f5047b) {
            g0Var = this.f5058m;
        }
        return g0Var;
    }

    /* renamed from: j */
    public Set mo2159j(i0.e0 e0Var) {
        return null;
    }

    /* renamed from: k */
    public Set mo2160k() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: l */
    public abstract v2 mo2161l(i0.s0 s0Var);

    /* renamed from: m */
    public final boolean m2162m(i0.g0 g0Var) {
        int iIntValue = ((Integer) ((i0.b1) this.f5052g).mo7401e(i0.b1.f44335k0, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return g0Var.mo7310f();
        }
        throw new AssertionError(AbstractC4801l.m9730d(iIntValue, "Unknown mirrorMode: "));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i0.s0, i0.w1, java.lang.Object] */
    /* renamed from: n */
    public final w2 m2163n(i0.e0 e0Var, w2 w2Var, w2 w2Var2) {
        i0.j1 j1VarM7349b;
        if (w2Var2 != null) {
            j1VarM7349b = i0.j1.m7350g(w2Var2);
            j1VarM7349b.f16550a.remove(InterfaceC4617k.M0);
        } else {
            j1VarM7349b = i0.j1.m7349b();
        }
        TreeMap treeMap = j1VarM7349b.f16550a;
        C3076g c3076g = i0.b1.f44332g0;
        ?? r22 = this.f5050e;
        if (r22.mo7404i(c3076g) || r22.mo7404i(i0.b1.f44336l0)) {
            C3076g c3076g2 = i0.b1.f44340p0;
            if (treeMap.containsKey(c3076g2)) {
                treeMap.remove(c3076g2);
            }
        }
        C3076g c3076g3 = i0.b1.f44340p0;
        if (r22.mo7404i(c3076g3)) {
            C3076g c3076g4 = i0.b1.f44338n0;
            if (treeMap.containsKey(c3076g4) && ((C6974b) r22.mo7406k(c3076g3)).f33749b != null) {
                treeMap.remove(c3076g4);
            }
        }
        Iterator it = r22.mo7403h().iterator();
        while (it.hasNext()) {
            i0.s0.m7413H(j1VarM7349b, j1VarM7349b, r22, (C3076g) it.next());
        }
        if (w2Var != null) {
            for (C3076g c3076g5 : w2Var.mo7403h()) {
                if (!c3076g5.f16460a.equals(InterfaceC4617k.M0.f16460a)) {
                    i0.s0.m7413H(j1VarM7349b, j1VarM7349b, w2Var, c3076g5);
                }
            }
        }
        if (treeMap.containsKey(i0.b1.f44336l0)) {
            C3076g c3076g6 = i0.b1.f44332g0;
            if (treeMap.containsKey(c3076g6)) {
                treeMap.remove(c3076g6);
            }
        }
        C3076g c3076g7 = i0.b1.f44340p0;
        if (treeMap.containsKey(c3076g7)) {
            ((C6974b) j1VarM7349b.mo7406k(c3076g7)).getClass();
        }
        Objects.toString(this.f5051f);
        toString();
        og.u1.m10942a("UseCase");
        HashSet<AbstractC1545b> hashSet = this.f5051f;
        if (hashSet != null) {
            int i10 = C2166a.f10029c;
            Range range = C3082m.f16521h;
            EnumC2170e enumC2170e = C2171f.f10038c;
            a0 a0Var = a0.f5035d;
            for (AbstractC1545b abstractC1545b : hashSet) {
                if (abstractC1545b instanceof C2166a) {
                    a0Var = ((C2166a) abstractC1545b).f10030a;
                } else if (abstractC1545b instanceof C2168c) {
                    C2168c c2168c = (C2168c) abstractC1545b;
                    range = new Range(Integer.valueOf(c2168c.f10033a), Integer.valueOf(c2168c.f10034b));
                } else if (abstractC1545b instanceof C2171f) {
                    enumC2170e = ((C2171f) abstractC1545b).f10039a;
                }
            }
            if ((this instanceof k1) || C4612f.m9481B(this)) {
                j1VarM7349b.m7352n(i0.a1.f44331f0, a0Var);
            }
            j1VarM7349b.m7352n(w2.f44349y0, range);
            int i11 = y1.f5288a[enumC2170e.ordinal()];
            if (i11 == 1) {
                j1VarM7349b.m7352n(w2.D0, 1);
                j1VarM7349b.m7352n(w2.E0, 1);
            } else if (i11 == 2) {
                j1VarM7349b.m7352n(w2.D0, 0);
                j1VarM7349b.m7352n(w2.E0, 2);
            } else if (i11 == 3) {
                j1VarM7349b.m7352n(w2.D0, 2);
                j1VarM7349b.m7352n(w2.E0, 0);
            }
        }
        return mo2169t(e0Var, mo2161l(j1VarM7349b));
    }

    /* renamed from: o */
    public final void m2164o() {
        this.f5048c = z1.ACTIVE;
        m2166q();
    }

    /* renamed from: p */
    public final void m2165p() {
        Iterator it = this.f5046a.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).mo2144e(this);
        }
    }

    /* renamed from: q */
    public final void m2166q() {
        int iOrdinal = this.f5048c.ordinal();
        HashSet hashSet = this.f5046a;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((a2) it.next()).mo2143d(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((a2) it2.next()).mo2146r(this);
            }
        }
    }

    /* renamed from: t */
    public abstract w2 mo2169t(i0.e0 e0Var, v2 v2Var);

    /* renamed from: w */
    public abstract C3082m mo2172w(i0.s0 s0Var);

    /* renamed from: x */
    public abstract C3082m mo2173x(C3082m c3082m, C3082m c3082m2);

    /* renamed from: y */
    public abstract void mo2174y();

    /* renamed from: z */
    public void mo2175z(Matrix matrix) {
        this.f5056k = new Matrix(matrix);
    }

    /* renamed from: r */
    public void mo2167r() {
    }

    /* renamed from: s */
    public void mo2168s() {
    }

    /* renamed from: u */
    public void mo2170u() {
    }

    /* renamed from: v */
    public void mo2171v() {
    }
}
