package p001o;

import androidx.compose.ui.node.C1939a;
import p001o.alb;

/* loaded from: classes2.dex */
public final class scf {

    /* renamed from: a */
    public final zh9 f45223a;

    public scf(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "rootNode");
        this.f45223a = zh9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[LOOP:0: B:5:0x0019->B:20:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[EDGE_INSN: B:25:0x0046->B:21:0x0046 BREAK  A[LOOP:0: B:5:0x0019->B:20:0x0041], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pcf m48206a() {
        C1939a c1939aM59428U = this.f45223a.m59428U();
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
        return new pcf(((ncf) obj).mo17377h(), false, this.f45223a, new kcf());
    }
}
