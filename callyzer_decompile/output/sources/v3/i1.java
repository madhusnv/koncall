package v3;

import a4.InterfaceC0051a;
import b3.C0575g;
import b3.C0576h;
import b3.C0585q;
import b3.InterfaceC0573e;
import b3.InterfaceC0590v;
import d4.InterfaceC1585m;
import m2.C4640e;
import n3.InterfaceC4950d;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p3.C5825w;
import r3.C6444a;
import s1.C6709d;
import s3.AbstractC6744a;
import t3.InterfaceC7035v;
import u3.InterfaceC7332c;
import u3.InterfaceC7334e;
import w2.AbstractC7878q;
import w2.InterfaceC7877p;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a */
    public static final e1.d0 f36919a;

    static {
        e1.d0 d0Var = e1.o0.f9033a;
        f36919a = new e1.d0();
    }

    /* renamed from: a */
    public static final void m14624a(AbstractC7878q abstractC7878q, int i10, int i11) {
        if (!(abstractC7878q instanceof AbstractC7642n)) {
            m14625b(abstractC7878q, i10 & abstractC7878q.f37672c, i11);
            return;
        }
        AbstractC7642n abstractC7642n = (AbstractC7642n) abstractC7878q;
        int i12 = abstractC7642n.f36952q;
        m14625b(abstractC7878q, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (AbstractC7878q abstractC7878q2 = abstractC7642n.f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
            m14624a(abstractC7878q2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final void m14625b(AbstractC7878q abstractC7878q, int i10, int i11) {
        if (i11 != 0 || abstractC7878q.A0()) {
            if ((i10 & 2) != 0 && (abstractC7878q instanceof InterfaceC7652x)) {
                AbstractC7634f.m14553n((InterfaceC7652x) abstractC7878q);
                if (i11 == 2) {
                    h1 h1VarM14561v = AbstractC7634f.m14561v(abstractC7878q, 2);
                    h1VarM14561v.f36905q = true;
                    h1VarM14561v.f36899H.invoke();
                    if (h1VarM14561v.f36901K != null) {
                        h1VarM14561v.p1(null, false);
                        h1VarM14561v.f36902m.m14590V(false);
                    }
                }
            }
            if ((i10 & 128) != 0 && (abstractC7878q instanceof InterfaceC7651w) && i11 != 2) {
                AbstractC7634f.m14563x(abstractC7878q).m14575E();
            }
            if ((i10 & 256) != 0 && (abstractC7878q instanceof InterfaceC7645q) && i11 != 2) {
                g0 g0VarM14563x = AbstractC7634f.m14563x(abstractC7878q);
                if (!g0VarM14563x.m14605r() && !g0VarM14563x.m14606s() && !g0VarM14563x.f36841Z) {
                    C7904v c7904v = (C7904v) j0.m14636a(g0VarM14563x);
                    ((C4640e) c7904v.f44844h0.f37032e.f5668b).m9506b(g0VarM14563x);
                    g0VarM14563x.f36841Z = true;
                    c7904v.m15025G(null);
                }
            }
            if ((i10 & 4) != 0 && (abstractC7878q instanceof InterfaceC7644p)) {
                AbstractC7634f.m14552m((InterfaceC7644p) abstractC7878q);
            }
            if ((i10 & 8) != 0 && (abstractC7878q instanceof w1)) {
                AbstractC7634f.m14563x(abstractC7878q).f36859t = true;
            }
            if ((i10 & 64) != 0 && (abstractC7878q instanceof s1)) {
                k0 k0Var = AbstractC7634f.m14563x((s1) abstractC7878q).f36833L;
                k0Var.f36943p.f37068s = true;
                s0 s0Var = k0Var.f36944q;
                if (s0Var != null) {
                    s0Var.f37008y = true;
                }
            }
            if ((i10 & NewHope.SENDB_BYTES) != 0 && (abstractC7878q instanceof InterfaceC0590v)) {
                InterfaceC0590v interfaceC0590v = (InterfaceC0590v) abstractC7878q;
                C7635g.f36823b = null;
                interfaceC0590v.mo1756D(C7635g.f36822a);
                if (C7635g.f36823b != null) {
                    AbstractC7878q abstractC7878q2 = (AbstractC7878q) interfaceC0590v;
                    if (!abstractC7878q2.f37670a.f37683p) {
                        AbstractC6744a.m12907b("visitChildren called on an unattached node");
                    }
                    C4640e c4640e = new C4640e(new AbstractC7878q[16]);
                    AbstractC7878q abstractC7878q3 = abstractC7878q2.f37670a;
                    AbstractC7878q abstractC7878q4 = abstractC7878q3.f37675f;
                    if (abstractC7878q4 == null) {
                        AbstractC7634f.m14541b(c4640e, abstractC7878q3);
                    } else {
                        c4640e.m9506b(abstractC7878q4);
                    }
                    while (true) {
                        int i12 = c4640e.f22886c;
                        if (i12 == 0) {
                            break;
                        }
                        AbstractC7878q abstractC7878qM14545f = (AbstractC7878q) c4640e.m9515m(i12 - 1);
                        if ((abstractC7878qM14545f.f37673d & 1024) == 0) {
                            AbstractC7634f.m14541b(c4640e, abstractC7878qM14545f);
                        } else {
                            while (true) {
                                if (abstractC7878qM14545f == null) {
                                    break;
                                }
                                if ((abstractC7878qM14545f.f37672c & 1024) != 0) {
                                    C4640e c4640e2 = null;
                                    while (abstractC7878qM14545f != null) {
                                        if (abstractC7878qM14545f instanceof b3.e0) {
                                            b3.e0 e0Var = (b3.e0) abstractC7878qM14545f;
                                            C0576h c0576h = ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3942g;
                                            if (c0576h.f3913d.m5581a(e0Var) && !c0576h.f3915f) {
                                                c0576h.f3910a.invoke(new C0575g(0, c0576h, C0576h.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
                                                c0576h.f3915f = true;
                                            }
                                        } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                            int i13 = 0;
                                            for (AbstractC7878q abstractC7878q5 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                                                if ((abstractC7878q5.f37672c & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        abstractC7878qM14545f = abstractC7878q5;
                                                    } else {
                                                        if (c4640e2 == null) {
                                                            c4640e2 = new C4640e(new AbstractC7878q[16]);
                                                        }
                                                        if (abstractC7878qM14545f != null) {
                                                            c4640e2.m9506b(abstractC7878qM14545f);
                                                            abstractC7878qM14545f = null;
                                                        }
                                                        c4640e2.m9506b(abstractC7878q5);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e2);
                                    }
                                } else {
                                    abstractC7878qM14545f = abstractC7878qM14545f.f37675f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(abstractC7878q instanceof InterfaceC0573e)) {
                return;
            }
            InterfaceC0573e interfaceC0573e = (InterfaceC0573e) abstractC7878q;
            C0576h c0576h2 = ((C0585q) ((C7904v) AbstractC7634f.m14564y(interfaceC0573e)).getFocusOwner()).f3942g;
            if (!c0576h2.f3914e.m5581a(interfaceC0573e) || c0576h2.f3915f) {
                return;
            }
            c0576h2.f3910a.invoke(new C0575g(0, c0576h2, C0576h.class, "invalidateNodes", "invalidateNodes()V", 0, 0));
            c0576h2.f3915f = true;
        }
    }

    /* renamed from: c */
    public static final void m14626c(AbstractC7878q abstractC7878q) {
        if (!abstractC7878q.f37683p) {
            AbstractC6744a.m12907b("autoInvalidateUpdatedNode called on unattached node");
        }
        m14624a(abstractC7878q, -1, 0);
    }

    /* renamed from: d */
    public static final int m14627d(InterfaceC7877p interfaceC7877p) {
        int i10 = interfaceC7877p instanceof InterfaceC7035v ? 3 : 1;
        if (interfaceC7877p instanceof i1.s0) {
            i10 |= 4;
        }
        if (interfaceC7877p instanceof InterfaceC1585m) {
            i10 |= 8;
        }
        if (interfaceC7877p instanceof C5825w) {
            i10 |= 16;
        }
        if ((interfaceC7877p instanceof InterfaceC7332c) || (interfaceC7877p instanceof o1.x0)) {
            i10 |= 32;
        }
        if (interfaceC7877p instanceof C6709d) {
            i10 |= 256;
        }
        if (interfaceC7877p instanceof t3.t0) {
            i10 |= 64;
        }
        return interfaceC7877p instanceof InterfaceC0051a ? 524288 | i10 : i10;
    }

    /* renamed from: e */
    public static final int m14628e(AbstractC7878q abstractC7878q) {
        int i10 = abstractC7878q.f37672c;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = abstractC7878q.getClass();
        e1.d0 d0Var = f36919a;
        int iM5535d = d0Var.m5535d(cls);
        if (iM5535d >= 0) {
            return d0Var.f8949c[iM5535d];
        }
        int i11 = abstractC7878q instanceof InterfaceC7652x ? 3 : 1;
        if (abstractC7878q instanceof InterfaceC7644p) {
            i11 |= 4;
        }
        if (abstractC7878q instanceof w1) {
            i11 |= 8;
        }
        if (abstractC7878q instanceof u1) {
            i11 |= 16;
        }
        if (abstractC7878q instanceof InterfaceC7334e) {
            i11 |= 32;
        }
        if (abstractC7878q instanceof s1) {
            i11 |= 64;
        }
        if (abstractC7878q instanceof InterfaceC7651w) {
            i11 |= 128;
        }
        if (abstractC7878q instanceof InterfaceC7645q) {
            i11 |= 256;
        }
        if (abstractC7878q instanceof b3.e0) {
            i11 |= 1024;
        }
        if (abstractC7878q instanceof InterfaceC0590v) {
            i11 |= NewHope.SENDB_BYTES;
        }
        if (abstractC7878q instanceof InterfaceC0573e) {
            i11 |= 4096;
        }
        if (abstractC7878q instanceof InterfaceC4950d) {
            i11 |= 8192;
        }
        if (abstractC7878q instanceof C6444a) {
            i11 |= 16384;
        }
        if (abstractC7878q instanceof InterfaceC7640l) {
            i11 |= 32768;
        }
        if (abstractC7878q instanceof a2) {
            i11 |= 262144;
        }
        if (abstractC7878q instanceof InterfaceC0051a) {
            i11 |= 524288;
        }
        d0Var.m5539h(i11, cls);
        return i11;
    }

    /* renamed from: f */
    public static final int m14629f(AbstractC7878q abstractC7878q) {
        if (!(abstractC7878q instanceof AbstractC7642n)) {
            return m14628e(abstractC7878q);
        }
        AbstractC7642n abstractC7642n = (AbstractC7642n) abstractC7878q;
        int iM14629f = abstractC7642n.f36952q;
        for (AbstractC7878q abstractC7878q2 = abstractC7642n.f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
            iM14629f |= m14629f(abstractC7878q2);
        }
        return iM14629f;
    }

    /* renamed from: g */
    public static final boolean m14630g(int i10) {
        return (i10 & 128) != 0;
    }
}
