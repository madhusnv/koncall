package p001o;

import p001o.bgc;

/* loaded from: classes2.dex */
public abstract class alf {
    /* renamed from: a */
    public static final boolean m17386a(bgc bgcVar, float f, float f2, xzc xzcVar, xzc xzcVar2) {
        sq8.m48649h(bgcVar, "outline");
        if (bgcVar instanceof bgc.C12381a) {
            return m17387b(((bgc.C12381a) bgcVar).m18882a(), f, f2);
        }
        throw new szb();
    }

    /* renamed from: b */
    public static final boolean m17387b(mfe mfeVar, float f, float f2) {
        return mfeVar.m38945f() <= f && f < mfeVar.m38946g() && mfeVar.m38948i() <= f2 && f2 < mfeVar.m38942c();
    }
}
