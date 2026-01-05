package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.fbj;
import p001o.fu6;
import p001o.ni9;
import p001o.no0;
import p001o.wn7;

/* loaded from: classes6.dex */
public final class zcb implements n5f {

    /* renamed from: a */
    public final scb f56932a;

    /* renamed from: b */
    public final j4i f56933b;

    /* renamed from: c */
    public final boolean f56934c;

    /* renamed from: d */
    public final rp6 f56935d;

    public zcb(j4i j4iVar, rp6 rp6Var, scb scbVar) {
        this.f56933b = j4iVar;
        this.f56934c = rp6Var.mo47058e(scbVar);
        this.f56935d = rp6Var;
        this.f56932a = scbVar;
    }

    /* renamed from: m */
    public static zcb m59184m(j4i j4iVar, rp6 rp6Var, scb scbVar) {
        return new zcb(j4iVar, rp6Var, scbVar);
    }

    @Override // p001o.n5f
    /* renamed from: a */
    public void mo40122a(Object obj, Object obj2) {
        y5f.m57248G(this.f56933b, obj, obj2);
        if (this.f56934c) {
            y5f.m57246E(this.f56935d, obj, obj2);
        }
    }

    @Override // p001o.n5f
    /* renamed from: b */
    public void mo40123b(Object obj) {
        this.f56933b.mo33251j(obj);
        this.f56935d.mo47059f(obj);
    }

    @Override // p001o.n5f
    /* renamed from: c */
    public final boolean mo40124c(Object obj) {
        return this.f56935d.mo47056c(obj).m27508p();
    }

    @Override // p001o.n5f
    /* renamed from: d */
    public int mo40125d(Object obj) {
        int iM59185k = m59185k(this.f56933b, obj) + 0;
        return this.f56934c ? iM59185k + this.f56935d.mo47056c(obj).m27503j() : iM59185k;
    }

    @Override // p001o.n5f
    /* renamed from: e */
    public Object mo40126e() {
        return this.f56932a.newBuilderForType().buildPartial();
    }

    @Override // p001o.n5f
    /* renamed from: f */
    public int mo40127f(Object obj) {
        int iHashCode = this.f56933b.mo33248g(obj).hashCode();
        return this.f56934c ? (iHashCode * 53) + this.f56935d.mo47056c(obj).hashCode() : iHashCode;
    }

    @Override // p001o.n5f
    /* renamed from: g */
    public boolean mo40128g(Object obj, Object obj2) {
        if (!this.f56933b.mo33248g(obj).equals(this.f56933b.mo33248g(obj2))) {
            return false;
        }
        if (this.f56934c) {
            return this.f56935d.mo47056c(obj).equals(this.f56935d.mo47056c(obj2));
        }
        return true;
    }

    @Override // p001o.n5f
    /* renamed from: h */
    public void mo40129h(Object obj, mce mceVar, qp6 qp6Var) {
        m59186l(this.f56933b, this.f56935d, obj, mceVar, qp6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // p001o.n5f
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo40130i(Object obj, byte[] bArr, int i, int i2, no0.C15617b c15617b) throws ct8 {
        wn7 wn7Var = (wn7) obj;
        l4i l4iVarM36566n = wn7Var.unknownFields;
        if (l4iVarM36566n == l4i.m36562c()) {
            l4iVarM36566n = l4i.m36566n();
            wn7Var.unknownFields = l4iVarM36566n;
        }
        fu6 fu6VarM54737g = ((wn7.AbstractC17937d) obj).m54737g();
        wn7.C17939f c17939f = null;
        while (i < i2) {
            int iM40825I = no0.m40825I(bArr, i, c15617b);
            int i3 = c15617b.f37086a;
            if (i3 == fbj.f23120a) {
                int i4 = 0;
                xq1 xq1Var = null;
                while (iM40825I < i2) {
                    iM40825I = no0.m40825I(bArr, iM40825I, c15617b);
                    int i5 = c15617b.f37086a;
                    int iM26425a = fbj.m26425a(i5);
                    int iM26426b = fbj.m26426b(i5);
                    if (iM26425a != 2) {
                        if (iM26425a == 3) {
                            if (c17939f != null) {
                                iM40825I = no0.m40846p(v1e.m52231a().m52234d(c17939f.m54742d().getClass()), bArr, iM40825I, i2, c15617b);
                                fu6VarM54737g.m27513x(c17939f.f52387d, c15617b.f37088c);
                            } else if (iM26426b == 2) {
                                iM40825I = no0.m40832b(bArr, iM40825I, c15617b);
                                xq1Var = (xq1) c15617b.f37088c;
                            }
                        }
                        if (i5 != fbj.f23121b) {
                            break;
                        } else {
                            iM40825I = no0.m40830N(i5, bArr, iM40825I, i2, c15617b);
                        }
                    } else if (iM26426b == 0) {
                        iM40825I = no0.m40825I(bArr, iM40825I, c15617b);
                        i4 = c15617b.f37086a;
                        c17939f = (wn7.C17939f) this.f56935d.mo47055b(c15617b.f37089d, this.f56932a, i4);
                    } else if (i5 != fbj.f23121b) {
                    }
                }
                if (xq1Var != null) {
                    l4iVarM36566n.m36580q(fbj.m26427c(i4, 2), xq1Var);
                }
                i = iM40825I;
            } else if (fbj.m26426b(i3) == 2) {
                wn7.C17939f c17939f2 = (wn7.C17939f) this.f56935d.mo47055b(c15617b.f37089d, this.f56932a, fbj.m26425a(i3));
                if (c17939f2 != null) {
                    i = no0.m40846p(v1e.m52231a().m52234d(c17939f2.m54742d().getClass()), bArr, iM40825I, i2, c15617b);
                    fu6VarM54737g.m27513x(c17939f2.f52387d, c15617b.f37088c);
                } else {
                    i = no0.m40823G(i3, bArr, iM40825I, i2, l4iVarM36566n, c15617b);
                }
                c17939f = c17939f2;
            } else {
                i = no0.m40830N(i3, bArr, iM40825I, i2, c15617b);
            }
        }
        if (i != i2) {
            throw ct8.m21770h();
        }
    }

    @Override // p001o.n5f
    /* renamed from: j */
    public void mo40131j(Object obj, cdj cdjVar) {
        Iterator itM27509s = this.f56935d.mo47056c(obj).m27509s();
        while (itM27509s.hasNext()) {
            Map.Entry entry = (Map.Entry) itM27509s.next();
            fu6.InterfaceC13557b interfaceC13557b = (fu6.InterfaceC13557b) entry.getKey();
            if (interfaceC13557b.mo27518q() != fbj.EnumC13397c.MESSAGE || interfaceC13557b.mo27516k() || interfaceC13557b.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ni9.C15587a) {
                interfaceC13557b.getNumber();
                ((ni9.C15587a) entry).m40631a();
                throw null;
            }
            cdjVar.mo21007b(interfaceC13557b.getNumber(), entry.getValue());
        }
        m59188o(this.f56933b, obj, cdjVar);
    }

    /* renamed from: k */
    public final int m59185k(j4i j4iVar, Object obj) {
        return j4iVar.mo33250i(j4iVar.mo33248g(obj));
    }

    /* renamed from: l */
    public final void m59186l(j4i j4iVar, rp6 rp6Var, Object obj, mce mceVar, qp6 qp6Var) {
        Object objMo33247f = j4iVar.mo33247f(obj);
        fu6 fu6VarMo47057d = rp6Var.mo47057d(obj);
        while (mceVar.mo35618z() != Integer.MAX_VALUE) {
            try {
                if (!m59187n(mceVar, qp6Var, rp6Var, fu6VarMo47057d, j4iVar, objMo33247f)) {
                    return;
                }
            } finally {
                j4iVar.mo33256o(obj, objMo33247f);
            }
        }
    }

    /* renamed from: n */
    public final boolean m59187n(mce mceVar, qp6 qp6Var, rp6 rp6Var, fu6 fu6Var, j4i j4iVar, Object obj) throws ct8 {
        int iMo35594b = mceVar.mo35594b();
        if (iMo35594b != fbj.f23120a) {
            if (fbj.m26426b(iMo35594b) != 2) {
                return mceVar.mo35572C();
            }
            Object objMo47055b = rp6Var.mo47055b(qp6Var, this.f56932a, fbj.m26425a(iMo35594b));
            if (objMo47055b == null) {
                return j4iVar.m33254m(obj, mceVar);
            }
            rp6Var.mo47061h(mceVar, objMo47055b, qp6Var, fu6Var);
            return true;
        }
        Object objMo47055b2 = null;
        int iMo35600h = 0;
        xq1 xq1VarMo35607o = null;
        while (mceVar.mo35618z() != Integer.MAX_VALUE) {
            int iMo35594b2 = mceVar.mo35594b();
            if (iMo35594b2 == fbj.f23122c) {
                iMo35600h = mceVar.mo35600h();
                objMo47055b2 = rp6Var.mo47055b(qp6Var, this.f56932a, iMo35600h);
            } else if (iMo35594b2 == fbj.f23123d) {
                if (objMo47055b2 != null) {
                    rp6Var.mo47061h(mceVar, objMo47055b2, qp6Var, fu6Var);
                } else {
                    xq1VarMo35607o = mceVar.mo35607o();
                }
            } else if (!mceVar.mo35572C()) {
                break;
            }
        }
        if (mceVar.mo35594b() != fbj.f23121b) {
            throw ct8.m21764b();
        }
        if (xq1VarMo35607o != null) {
            if (objMo47055b2 != null) {
                rp6Var.mo47062i(xq1VarMo35607o, objMo47055b2, qp6Var, fu6Var);
            } else {
                j4iVar.mo33245d(obj, iMo35600h, xq1VarMo35607o);
            }
        }
        return true;
    }

    /* renamed from: o */
    public final void m59188o(j4i j4iVar, Object obj, cdj cdjVar) {
        j4iVar.mo33260s(j4iVar.mo33248g(obj), cdjVar);
    }
}
