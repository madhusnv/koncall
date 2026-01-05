package androidx.fragment.app;

import android.os.Bundle;
import d7.EnumC1644p;
import g8.InterfaceC2544d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements InterfaceC2544d {

    /* renamed from: a */
    public final /* synthetic */ int f2606a;

    /* renamed from: b */
    public final /* synthetic */ Object f2607b;

    public /* synthetic */ k0(int i10, Object obj) {
        this.f2606a = i10;
        this.f2607b = obj;
    }

    @Override // g8.InterfaceC2544d
    /* renamed from: a */
    public final Bundle mo1205a() {
        switch (this.f2606a) {
            case 0:
                o0 o0Var = (o0) this.f2607b;
                o0Var.markFragmentsCreated();
                o0Var.mFragmentLifecycleRegistry.m5355g(EnumC1644p.ON_STOP);
                return new Bundle();
            default:
                return ((j1) this.f2607b).m1173X();
        }
    }
}
