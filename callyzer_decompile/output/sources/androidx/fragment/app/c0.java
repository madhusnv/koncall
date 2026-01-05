package androidx.fragment.app;

import android.view.View;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ j0 f2482a;

    public c0(j0 j0Var) {
        this.f2482a = j0Var;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        View view;
        if (enumC1644p != EnumC1644p.ON_STOP || (view = this.f2482a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
