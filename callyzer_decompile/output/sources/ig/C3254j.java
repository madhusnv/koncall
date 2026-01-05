package ig;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import kf.C4075b;
import p020v.x0;
import rf.C6511p;
import sf.AbstractC6822h;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.j */
/* loaded from: classes.dex */
public final class C3254j extends AbstractC6822h {

    /* renamed from: D */
    public final C4075b f17433D;

    public C3254j(Context context, Looper looper, x0 x0Var, C4075b c4075b, C6511p c6511p, C6511p c6511p2) {
        super(context, looper, 68, x0Var, c6511p, c6511p2, 0);
        c4075b = c4075b == null ? C4075b.f20943c : c4075b;
        C7105p c7105p = new C7105p(8, (char) 0);
        c7105p.f34290b = Boolean.FALSE;
        C4075b c4075b2 = C4075b.f20943c;
        c4075b.getClass();
        c7105p.f34290b = Boolean.valueOf(c4075b.f20944a);
        c7105p.f34291c = c4075b.f20945b;
        c7105p.f34291c = AbstractC3251g.m7596a();
        this.f17433D = new C4075b(c7105p);
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 12800000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C3255k ? (C3255k) iInterfaceQueryLocalInterface : new C3255k(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: r */
    public final Bundle mo7591r() {
        C4075b c4075b = this.f17433D;
        c4075b.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c4075b.f20944a);
        bundle.putString("log_session_id", c4075b.f20945b);
        return bundle;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
