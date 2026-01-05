package p001o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fed {

    /* renamed from: a */
    public final ArrayList f23195a = new ArrayList();

    /* renamed from: a */
    public final void m26517a(eed eedVar) {
        sq8.m48649h(eedVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23195a.add(eedVar);
    }

    /* renamed from: b */
    public final void m26518b() {
        for (int iM21248m = ch3.m21248m(this.f23195a); -1 < iM21248m; iM21248m--) {
            ((eed) this.f23195a.get(iM21248m)).mo5269b();
        }
    }

    /* renamed from: c */
    public final void m26519c(eed eedVar) {
        sq8.m48649h(eedVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23195a.remove(eedVar);
    }
}
