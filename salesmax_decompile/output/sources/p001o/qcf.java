package p001o;

import androidx.compose.ui.node.C1939a;
import p001o.alb;

/* loaded from: classes2.dex */
public abstract class qcf {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[LOOP:0: B:5:0x001b->B:20:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[EDGE_INSN: B:25:0x0048->B:21:0x0048 BREAK  A[LOOP:0: B:5:0x001b->B:20:0x0043], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pcf m45097a(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        C1939a c1939aM59428U = zh9Var.m59428U();
        int iM60153a = zzb.m60153a(8);
        Object obj = null;
        if ((c1939aM59428U.m4985i() & iM60153a) != 0) {
            alb.AbstractC12216c abstractC12216cM4987k = c1939aM59428U.m4987k();
            loop0: while (true) {
                if (abstractC12216cM4987k == null) {
                    break;
                }
                if ((abstractC12216cM4987k.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4987k; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof ncf) {
                            obj = abstractC12216cM48434f;
                            break loop0;
                        }
                        if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                    if ((abstractC12216cM4987k.m17352A() & iM60153a) != 0) {
                        break;
                    }
                    abstractC12216cM4987k = abstractC12216cM4987k.m17353B();
                } else if ((abstractC12216cM4987k.m17352A() & iM60153a) != 0) {
                }
            }
        }
        sq8.m48646e(obj);
        alb.AbstractC12216c abstractC12216cMo17377h = ((ncf) obj).mo17377h();
        kcf kcfVarM59446x = zh9Var.m59446x();
        sq8.m48646e(kcfVarM59446x);
        return new pcf(abstractC12216cMo17377h, z, zh9Var, kcfVarM59446x);
    }

    /* renamed from: e */
    public static final int m45101e(pcf pcfVar) {
        return pcfVar.m43361m() + 2000000000;
    }

    /* renamed from: f */
    public static final zh9 m45102f(zh9 zh9Var, xk7 xk7Var) {
        sq8.m48649h(zh9Var, "<this>");
        sq8.m48649h(xk7Var, "selector");
        for (zh9 zh9VarM59431X = zh9Var.m59431X(); zh9VarM59431X != null; zh9VarM59431X = zh9VarM59431X.m59431X()) {
            if (((Boolean) xk7Var.invoke(zh9VarM59431X)).booleanValue()) {
                return zh9VarM59431X;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[LOOP:0: B:5:0x001b->B:22:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[EDGE_INSN: B:27:0x0051->B:23:0x0051 BREAK  A[LOOP:0: B:5:0x001b->B:22:0x004c], SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ncf m45103g(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "<this>");
        C1939a c1939aM59428U = zh9Var.m59428U();
        int iM60153a = zzb.m60153a(8);
        Object obj = null;
        if ((c1939aM59428U.m4985i() & iM60153a) != 0) {
            alb.AbstractC12216c abstractC12216cM4987k = c1939aM59428U.m4987k();
            loop0: while (true) {
                if (abstractC12216cM4987k == null) {
                    break;
                }
                if ((abstractC12216cM4987k.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4987k; abstractC12216cM48434f != null; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof ncf) {
                            if (((ncf) abstractC12216cM48434f).m40331z()) {
                                obj = abstractC12216cM48434f;
                                break loop0;
                            }
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                    if ((abstractC12216cM4987k.m17352A() & iM60153a) != 0) {
                        break;
                    }
                    abstractC12216cM4987k = abstractC12216cM4987k.m17353B();
                } else if ((abstractC12216cM4987k.m17352A() & iM60153a) != 0) {
                }
            }
        }
        return (ncf) obj;
    }

    /* renamed from: h */
    public static final hue m45104h(pcf pcfVar) {
        return (hue) lcf.m36963a(pcfVar.m43369u(), tcf.f46841a.m49730q());
    }

    /* renamed from: i */
    public static final int m45105i(pcf pcfVar) {
        return pcfVar.m43361m() + 1000000000;
    }
}
