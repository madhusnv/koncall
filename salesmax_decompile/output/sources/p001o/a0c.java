package p001o;

import androidx.compose.ui.focus.C1932f;
import org.objectweb.asm.Opcodes;
import p001o.alb;

/* loaded from: classes2.dex */
public abstract class a0c {
    /* renamed from: a */
    public static final void m16298a(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "node");
        if (!abstractC12216c.m17361J()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m16299b(abstractC12216c, -1, 1);
    }

    /* renamed from: b */
    public static final void m16299b(alb.AbstractC12216c abstractC12216c, int i, int i2) {
        sq8.m48649h(abstractC12216c, "node");
        m16300c(abstractC12216c, i & abstractC12216c.m17356E(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final void m16300c(alb.AbstractC12216c abstractC12216c, int i, int i2) {
        if (i2 != 0 || abstractC12216c.m17359H()) {
            if (((zzb.m60153a(2) & i) != 0) && (abstractC12216c instanceof uh9)) {
                xh9.m56315b((uh9) abstractC12216c);
                if (i2 == 2) {
                    sk5.m48435g(abstractC12216c, zzb.m60153a(2)).l1();
                }
            }
            if (((zzb.m60153a(256) & i) != 0) && (abstractC12216c instanceof it7)) {
                sk5.m48436h(abstractC12216c).o0();
            }
            if (((zzb.m60153a(4) & i) != 0) && (abstractC12216c instanceof yx5)) {
                zx5.m60064a((yx5) abstractC12216c);
            }
            if (((zzb.m60153a(8) & i) != 0) && (abstractC12216c instanceof ncf)) {
                ocf.m41990b((ncf) abstractC12216c);
            }
            if (((zzb.m60153a(64) & i) != 0) && (abstractC12216c instanceof uwc)) {
                vwc.m53508a((uwc) abstractC12216c);
            }
            if (((zzb.m60153a(1024) & i) != 0) && (abstractC12216c instanceof C1932f)) {
                if (i2 == 2) {
                    abstractC12216c.mo4912O();
                } else {
                    sk5.m48437i(abstractC12216c).getFocusOwner().mo4853h((C1932f) abstractC12216c);
                }
            }
            if (((zzb.m60153a(2048) & i) != 0) && (abstractC12216c instanceof d77)) {
                d77 d77Var = (d77) abstractC12216c;
                if (m16308k(d77Var)) {
                    if (i2 == 2) {
                        m16307j(d77Var);
                    } else {
                        e77.m24473a(d77Var);
                    }
                }
            }
            if (((i & zzb.m60153a(4096)) != 0) && (abstractC12216c instanceof r67)) {
                s67.m47903b((r67) abstractC12216c);
            }
        }
    }

    /* renamed from: d */
    public static final void m16301d(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "node");
        if (!abstractC12216c.m17361J()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m16299b(abstractC12216c, -1, 2);
    }

    /* renamed from: e */
    public static final void m16302e(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "node");
        if (!abstractC12216c.m17361J()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m16299b(abstractC12216c, -1, 0);
    }

    /* renamed from: f */
    public static final int m16303f(alb.InterfaceC12215b interfaceC12215b) {
        sq8.m48649h(interfaceC12215b, "element");
        return zzb.m60153a(1);
    }

    /* renamed from: g */
    public static final int m16304g(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "node");
        if (abstractC12216c.m17356E() != 0) {
            return abstractC12216c.m17356E();
        }
        int iM60153a = zzb.m60153a(1);
        if (abstractC12216c instanceof uh9) {
            iM60153a |= zzb.m60153a(2);
        }
        if (abstractC12216c instanceof yx5) {
            iM60153a |= zzb.m60153a(4);
        }
        if (abstractC12216c instanceof ncf) {
            iM60153a |= zzb.m60153a(8);
        }
        if (abstractC12216c instanceof bdd) {
            iM60153a |= zzb.m60153a(16);
        }
        if (abstractC12216c instanceof flb) {
            iM60153a |= zzb.m60153a(32);
        }
        if (abstractC12216c instanceof uwc) {
            iM60153a |= zzb.m60153a(64);
        }
        if (abstractC12216c instanceof lh9) {
            iM60153a |= zzb.m60153a(128);
        }
        if (abstractC12216c instanceof it7) {
            iM60153a |= zzb.m60153a(256);
        }
        if (abstractC12216c instanceof C1932f) {
            iM60153a |= zzb.m60153a(1024);
        }
        if (abstractC12216c instanceof d77) {
            iM60153a |= zzb.m60153a(2048);
        }
        if (abstractC12216c instanceof r67) {
            iM60153a |= zzb.m60153a(4096);
        }
        if (abstractC12216c instanceof uc9) {
            iM60153a |= zzb.m60153a(8192);
        }
        return abstractC12216c instanceof pue ? iM60153a | zzb.m60153a(Opcodes.ACC_ENUM) : iM60153a;
    }

    /* renamed from: h */
    public static final int m16305h(alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(abstractC12216c, "node");
        return m16304g(abstractC12216c);
    }

    /* renamed from: i */
    public static final boolean m16306i(int i) {
        return (i & zzb.m60153a(128)) != 0;
    }

    /* renamed from: j */
    public static final void m16307j(d77 d77Var) {
        int iM60153a = zzb.m60153a(1024);
        if (!d77Var.mo17377h().m17361J()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        fqb fqbVar = new fqb(new alb.AbstractC12216c[16], 0);
        alb.AbstractC12216c abstractC12216cM17353B = d77Var.mo17377h().m17353B();
        if (abstractC12216cM17353B == null) {
            sk5.m48431c(fqbVar, d77Var.mo17377h());
        } else {
            fqbVar.m27344c(abstractC12216cM17353B);
        }
        while (fqbVar.m27357r()) {
            alb.AbstractC12216c abstractC12216cM48434f = (alb.AbstractC12216c) fqbVar.m27361v(fqbVar.m27354o() - 1);
            if ((abstractC12216cM48434f.m17352A() & iM60153a) == 0) {
                sk5.m48431c(fqbVar, abstractC12216cM48434f);
            } else {
                while (true) {
                    if (abstractC12216cM48434f == null) {
                        break;
                    }
                    if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        while (abstractC12216cM48434f != null) {
                            if (abstractC12216cM48434f instanceof C1932f) {
                                j77.m33360a((C1932f) abstractC12216cM48434f);
                            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                            }
                            abstractC12216cM48434f = sk5.m48434f(null);
                        }
                    } else {
                        abstractC12216cM48434f = abstractC12216cM48434f.m17353B();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static final boolean m16308k(d77 d77Var) {
        rb2 rb2Var = rb2.f43337a;
        rb2Var.m46481c();
        d77Var.mo22407p(rb2Var);
        return rb2Var.m46480b();
    }
}
