package p001o;

import java.util.List;
import p001o.alb;

/* loaded from: classes2.dex */
public final class ty7 {

    /* renamed from: a */
    public final mh9 f48040a;

    /* renamed from: b */
    public final c0c f48041b;

    public ty7(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "rootCoordinates");
        this.f48040a = mh9Var;
        this.f48041b = new c0c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m50778a(long j, List list) {
        Object obj;
        wzb wzbVar;
        sq8.m48649h(list, "pointerInputNodes");
        c0c c0cVar = this.f48041b;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            alb.AbstractC12216c abstractC12216c = (alb.AbstractC12216c) list.get(i);
            if (z) {
                fqb fqbVarM20013g = c0cVar.m20013g();
                int iM27354o = fqbVarM20013g.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVarM20013g.m27353n();
                    int i2 = 0;
                    do {
                        obj = objArrM27353n[i2];
                        if (sq8.m48644c(((wzb) obj).m55463j(), abstractC12216c)) {
                            break;
                        } else {
                            i2++;
                        }
                    } while (i2 < iM27354o);
                    obj = null;
                    wzbVar = (wzb) obj;
                    if (wzbVar == null) {
                        wzbVar.m55466m();
                        if (!wzbVar.m55464k().m27350j(ucd.m51363a(j))) {
                            wzbVar.m55464k().m27344c(ucd.m51363a(j));
                        }
                        c0cVar = wzbVar;
                    } else {
                        z = false;
                        wzb wzbVar2 = new wzb(abstractC12216c);
                        wzbVar2.m55464k().m27344c(ucd.m51363a(j));
                        c0cVar.m20013g().m27344c(wzbVar2);
                        c0cVar = wzbVar2;
                    }
                } else {
                    obj = null;
                    wzbVar = (wzb) obj;
                    if (wzbVar == null) {
                    }
                }
            } else {
                wzb wzbVar22 = new wzb(abstractC12216c);
                wzbVar22.m55464k().m27344c(ucd.m51363a(j));
                c0cVar.m20013g().m27344c(wzbVar22);
                c0cVar = wzbVar22;
            }
        }
    }

    /* renamed from: b */
    public final boolean m50779b(vp8 vp8Var, boolean z) {
        sq8.m48649h(vp8Var, "internalPointerEvent");
        if (this.f48041b.mo20007a(vp8Var.m53176a(), this.f48040a, vp8Var, z)) {
            return this.f48041b.mo20011e(vp8Var) || this.f48041b.mo20012f(vp8Var.m53176a(), this.f48040a, vp8Var, z);
        }
        return false;
    }

    /* renamed from: c */
    public final void m50780c() {
        this.f48041b.mo20010d();
        this.f48041b.m20009c();
    }

    /* renamed from: d */
    public final void m50781d() {
        this.f48041b.m20014h();
    }
}
