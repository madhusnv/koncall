package p001o;

import java.util.Locale;

/* loaded from: classes6.dex */
public class vl1 extends pz4 {

    /* renamed from: p */
    public sl1 f50485p;

    /* renamed from: q */
    public String f50486q;

    public vl1(String str, Locale locale) {
        super(str, locale);
    }

    /* renamed from: g */
    public synchronized sl1 m52904g(long j) {
        String strM44356a = super.m44356a(j);
        if (strM44356a == this.f50486q) {
            return this.f50485p;
        }
        this.f50486q = strM44356a;
        pp1 pp1Var = new pp1(strM44356a);
        this.f50485p = pp1Var;
        return pp1Var;
    }
}
