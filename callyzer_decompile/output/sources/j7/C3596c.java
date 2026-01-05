package j7;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import d7.h0;
import l1.C4327p;
import nf.C5042d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j7.c */
/* loaded from: classes.dex */
public final class C3596c implements h0 {

    /* renamed from: a */
    public final C4327p f19217a;

    /* renamed from: b */
    public boolean f19218b = false;

    public C3596c(C5042d c5042d, C4327p c4327p) {
        this.f19217a = c4327p;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        C4327p c4327p = this.f19217a;
        c4327p.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c4327p.f21788b;
        signInHubActivity.setResult(signInHubActivity.f5995d, signInHubActivity.f5996e);
        signInHubActivity.finish();
        this.f19218b = true;
    }

    public final String toString() {
        return this.f19217a.toString();
    }
}
