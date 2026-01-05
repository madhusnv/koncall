package i9;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17163a;

    /* renamed from: b */
    public final /* synthetic */ d0 f17164b;

    /* renamed from: c */
    public final /* synthetic */ l0 f17165c;

    public /* synthetic */ f0(d0 d0Var, l0 l0Var, int i10) {
        this.f17163a = i10;
        this.f17164b = d0Var;
        this.f17165c = l0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17163a) {
            case 0:
                return "cached token is not refreshable but still valid until " + this.f17164b.f17145b + " for sso-session: " + this.f17165c.f17201a;
            default:
                StringBuilder sb2 = new StringBuilder("refresh token failed, original token is still valid until ");
                sb2.append(this.f17164b.f17145b);
                sb2.append(" for sso-session: ");
                return AbstractC1452a.m4564k(sb2, this.f17165c.f17201a, ", re-using");
        }
    }
}
