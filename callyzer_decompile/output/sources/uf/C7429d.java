package uf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import jg.AbstractC3763b;
import p020v.x0;
import pf.C5904d;
import rf.C6511p;
import sf.AbstractC6822h;
import sf.C6829o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uf.d */
/* loaded from: classes.dex */
public final class C7429d extends AbstractC6822h {

    /* renamed from: D */
    public final C6829o f35233D;

    public C7429d(Context context, Looper looper, x0 x0Var, C6829o c6829o, C6511p c6511p, C6511p c6511p2) {
        super(context, looper, 270, x0Var, c6511p, c6511p2, 0);
        this.f35233D = c6829o;
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 203400000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C7426a ? (C7426a) iInterfaceQueryLocalInterface : new C7426a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 2);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: q */
    public final C5904d[] mo7590q() {
        return AbstractC3763b.f19642b;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: r */
    public final Bundle mo7591r() {
        C6829o c6829o = this.f35233D;
        c6829o.getClass();
        Bundle bundle = new Bundle();
        String str = c6829o.f32477a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: w */
    public final boolean mo7594w() {
        return true;
    }
}
