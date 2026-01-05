package mg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import eg.AbstractC2053a;
import pf.C5904d;
import sf.AbstractC6822h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 extends AbstractC6822h {
    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 13000000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof l1 ? (l1) iInterfaceQueryLocalInterface : new l1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // sf.AbstractC6819e
    /* renamed from: q */
    public final C5904d[] mo7590q() {
        return new C5904d[]{AbstractC2053a.f9638b, AbstractC2053a.f9637a};
    }

    @Override // sf.AbstractC6819e
    /* renamed from: r */
    public final Bundle mo7591r() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: x */
    public final boolean mo7595x() {
        return true;
    }
}
