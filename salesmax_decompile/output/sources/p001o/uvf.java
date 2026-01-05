package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class uvf extends s9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvf(vja vjaVar) {
        super(vjaVar);
        sq8.m48649h(vjaVar, "logger");
    }

    @Override // p001o.qja
    /* renamed from: a */
    public hja mo18184a(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        eka ekaVarMo20740m = m48029h().mo20740m(vvf.m53487b(fjaVar));
        sq8.m48648g(ekaVarMo20740m, "atLevel(...)");
        return new tvf(ekaVarMo20740m);
    }
}
