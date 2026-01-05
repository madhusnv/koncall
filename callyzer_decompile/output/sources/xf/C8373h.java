package xf;

import android.os.IBinder;
import android.os.IInterface;
import jg.AbstractC3763b;
import pf.C5904d;
import sf.AbstractC6822h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.h */
/* loaded from: classes.dex */
public final class C8373h extends AbstractC6822h {
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof C8370e ? (C8370e) iInterfaceQueryLocalInterface : new C8370e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 2);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: q */
    public final C5904d[] mo7590q() {
        return AbstractC3763b.f19644d;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: w */
    public final boolean mo7594w() {
        return true;
    }
}
