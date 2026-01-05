package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class qvf extends s9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvf(vja vjaVar) {
        super(vjaVar);
        sq8.m48649h(vjaVar, "logger");
    }

    @Override // p001o.qja
    /* renamed from: a */
    public hja mo18184a(fja fjaVar) {
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        return mo18188e(fjaVar) ? new pvf(this, fjaVar) : rvf.f44137a;
    }
}
