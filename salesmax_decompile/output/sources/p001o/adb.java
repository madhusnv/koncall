package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.mo0;

/* loaded from: classes4.dex */
public final class adb implements o5f {

    /* renamed from: a */
    public final rcb f14534a;

    /* renamed from: b */
    public final k4i f14535b;

    /* renamed from: c */
    public final boolean f14536c;

    /* renamed from: d */
    public final sp6 f14537d;

    public adb(k4i k4iVar, sp6 sp6Var, rcb rcbVar) {
        this.f14535b = k4iVar;
        this.f14536c = sp6Var.mo48607e(rcbVar);
        this.f14537d = sp6Var;
        this.f14534a = rcbVar;
    }

    /* renamed from: m */
    public static adb m16903m(k4i k4iVar, sp6 sp6Var, rcb rcbVar) {
        return new adb(k4iVar, sp6Var, rcbVar);
    }

    @Override // p001o.o5f
    /* renamed from: a */
    public void mo16904a(Object obj, Object obj2) {
        z5f.m58786F(this.f14535b, obj, obj2);
        if (this.f14536c) {
            z5f.m58784D(this.f14537d, obj, obj2);
        }
    }

    @Override // p001o.o5f
    /* renamed from: b */
    public void mo16905b(Object obj) {
        this.f14535b.mo34980j(obj);
        this.f14537d.mo48608f(obj);
    }

    @Override // p001o.o5f
    /* renamed from: c */
    public final boolean mo16906c(Object obj) {
        return this.f14537d.mo48605c(obj).m29495e();
    }

    @Override // p001o.o5f
    /* renamed from: d */
    public int mo16907d(Object obj) {
        int iM16914k = m16914k(this.f14535b, obj) + 0;
        return this.f14536c ? iM16914k + this.f14537d.mo48605c(obj).m29492b() : iM16914k;
    }

    @Override // p001o.o5f
    /* renamed from: e */
    public Object mo16908e() {
        return this.f14534a.newBuilderForType().buildPartial();
    }

    @Override // p001o.o5f
    /* renamed from: f */
    public int mo16909f(Object obj) {
        int iHashCode = this.f14535b.mo34977g(obj).hashCode();
        return this.f14536c ? (iHashCode * 53) + this.f14537d.mo48605c(obj).hashCode() : iHashCode;
    }

    @Override // p001o.o5f
    /* renamed from: g */
    public boolean mo16910g(Object obj, Object obj2) {
        if (!this.f14535b.mo34977g(obj).equals(this.f14535b.mo34977g(obj2))) {
            return false;
        }
        if (this.f14536c) {
            return this.f14537d.mo48605c(obj).equals(this.f14537d.mo48605c(obj2));
        }
        return true;
    }

    @Override // p001o.o5f
    /* renamed from: h */
    public void mo16911h(Object obj, byte[] bArr, int i, int i2, mo0.C15370a c15370a) {
        vn7 vn7Var = (vn7) obj;
        if (vn7Var.unknownFields == m4i.m38362e()) {
            vn7Var.unknownFields = m4i.m38366l();
        }
        tq.m50332a(obj);
        throw null;
    }

    @Override // p001o.o5f
    /* renamed from: i */
    public void mo16912i(Object obj, bdj bdjVar) {
        Iterator itM29496f = this.f14537d.mo48605c(obj).m29496f();
        if (itM29496f.hasNext()) {
            tq.m50332a(((Map.Entry) itM29496f.next()).getKey());
            throw null;
        }
        m16917o(this.f14535b, obj, bdjVar);
    }

    @Override // p001o.o5f
    /* renamed from: j */
    public void mo16913j(Object obj, nce nceVar, pp6 pp6Var) {
        m16915l(this.f14535b, this.f14537d, obj, nceVar, pp6Var);
    }

    /* renamed from: k */
    public final int m16914k(k4i k4iVar, Object obj) {
        return k4iVar.mo34979i(k4iVar.mo34977g(obj));
    }

    /* renamed from: l */
    public final void m16915l(k4i k4iVar, sp6 sp6Var, Object obj, nce nceVar, pp6 pp6Var) {
        Object objMo34976f = k4iVar.mo34976f(obj);
        gu6 gu6VarMo48606d = sp6Var.mo48606d(obj);
        while (nceVar.mo37107z() != Integer.MAX_VALUE) {
            try {
                if (!m16916n(nceVar, pp6Var, sp6Var, gu6VarMo48606d, k4iVar, objMo34976f)) {
                    return;
                }
            } finally {
                k4iVar.mo34985o(obj, objMo34976f);
            }
        }
    }

    /* renamed from: n */
    public final boolean m16916n(nce nceVar, pp6 pp6Var, sp6 sp6Var, gu6 gu6Var, k4i k4iVar, Object obj) throws bt8 {
        int iMo37083b = nceVar.mo37083b();
        if (iMo37083b != ebj.f21345a) {
            if (ebj.m24742b(iMo37083b) != 2) {
                return nceVar.mo37064C();
            }
            Object objMo48604b = sp6Var.mo48604b(pp6Var, this.f14534a, ebj.m24741a(iMo37083b));
            if (objMo48604b == null) {
                return k4iVar.m34983m(obj, nceVar);
            }
            sp6Var.mo48610h(nceVar, objMo48604b, pp6Var, gu6Var);
            return true;
        }
        Object objMo48604b2 = null;
        int iMo37089h = 0;
        yq1 yq1VarMo37096o = null;
        while (nceVar.mo37107z() != Integer.MAX_VALUE) {
            int iMo37083b2 = nceVar.mo37083b();
            if (iMo37083b2 == ebj.f21347c) {
                iMo37089h = nceVar.mo37089h();
                objMo48604b2 = sp6Var.mo48604b(pp6Var, this.f14534a, iMo37089h);
            } else if (iMo37083b2 == ebj.f21348d) {
                if (objMo48604b2 != null) {
                    sp6Var.mo48610h(nceVar, objMo48604b2, pp6Var, gu6Var);
                } else {
                    yq1VarMo37096o = nceVar.mo37096o();
                }
            } else if (!nceVar.mo37064C()) {
                break;
            }
        }
        if (nceVar.mo37083b() != ebj.f21346b) {
            throw bt8.m19716a();
        }
        if (yq1VarMo37096o != null) {
            if (objMo48604b2 != null) {
                sp6Var.mo48611i(yq1VarMo37096o, objMo48604b2, pp6Var, gu6Var);
            } else {
                k4iVar.mo34974d(obj, iMo37089h, yq1VarMo37096o);
            }
        }
        return true;
    }

    /* renamed from: o */
    public final void m16917o(k4i k4iVar, Object obj, bdj bdjVar) {
        k4iVar.mo34989s(k4iVar.mo34977g(obj), bdjVar);
    }
}
