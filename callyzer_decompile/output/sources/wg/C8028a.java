package wg;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p020v.x0;
import qf.InterfaceC6204c;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;
import sf.AbstractC6822h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wg.a */
/* loaded from: classes.dex */
public final class C8028a extends AbstractC6822h implements InterfaceC6204c {

    /* renamed from: D */
    public final boolean f38547D;

    /* renamed from: E */
    public final x0 f38548E;

    /* renamed from: F */
    public final Bundle f38549F;

    /* renamed from: G */
    public final Integer f38550G;

    public C8028a(Context context, Looper looper, x0 x0Var, Bundle bundle, InterfaceC6207f interfaceC6207f, InterfaceC6208g interfaceC6208g) {
        super(context, looper, 44, x0Var, interfaceC6207f, interfaceC6208g, 0);
        this.f38547D = true;
        this.f38548E = x0Var;
        this.f38549F = bundle;
        this.f38550G = (Integer) x0Var.f36759g;
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 12451000;
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: m */
    public final boolean mo12221m() {
        return this.f38547D;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C8031d ? (C8031d) iInterfaceQueryLocalInterface : new C8031d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 2);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: r */
    public final Bundle mo7591r() {
        x0 x0Var = this.f38548E;
        boolean zEquals = this.f32382c.getPackageName().equals((String) x0Var.f36756d);
        Bundle bundle = this.f38549F;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) x0Var.f36756d);
        }
        return bundle;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.signin.service.START";
    }
}
