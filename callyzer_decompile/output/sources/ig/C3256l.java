package ig;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p020v.x0;
import pf.C5904d;
import rf.C6511p;
import sf.AbstractC6822h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.l */
/* loaded from: classes.dex */
public final class C3256l extends AbstractC6822h {

    /* renamed from: D */
    public final Bundle f17434D;

    public C3256l(Context context, Looper looper, x0 x0Var, C6511p c6511p, C6511p c6511p2) {
        super(context, looper, 223, x0Var, c6511p, c6511p2, 0);
        this.f17434D = new Bundle();
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 17895000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof C3257m ? (C3257m) iInterfaceQueryLocalInterface : new C3257m(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 1);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: q */
    public final C5904d[] mo7590q() {
        return AbstractC3250f.f17429d;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: r */
    public final Bundle mo7591r() {
        return this.f17434D;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: w */
    public final boolean mo7594w() {
        return true;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: x */
    public final boolean mo7595x() {
        return true;
    }
}
