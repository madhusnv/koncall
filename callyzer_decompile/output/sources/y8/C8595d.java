package y8;

import android.net.ConnectivityManager;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7059e;
import uw.C7565i;
import vx.EnumC7799a;
import wx.C8202c;
import xx.C8498d;
import z8.InterfaceC8902e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y8.d */
/* loaded from: classes.dex */
public final class C8595d implements InterfaceC8902e {

    /* renamed from: a */
    public final ConnectivityManager f41841a;

    public C8595d(ConnectivityManager connectivityManager) {
        this.f41841a = connectivityManager;
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: a */
    public final boolean mo15950a(C0922q workSpec) {
        AbstractC4154l.m8923f(workSpec, "workSpec");
        return workSpec.f5631j.m13351a() != null;
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: b */
    public final C8202c mo15951b(C7059e constraints) {
        AbstractC4154l.m8923f(constraints, "constraints");
        return new C8202c(new C8498d(constraints, this, null, 3), C7565i.f36440a, -2, EnumC7799a.SUSPEND);
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: c */
    public final boolean mo15952c(C0922q c0922q) {
        if (mo15950a(c0922q)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
