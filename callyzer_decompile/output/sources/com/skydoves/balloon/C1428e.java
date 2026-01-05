package com.skydoves.balloon;

import com.skydoves.balloon.Balloon;
import ex.InterfaceC2137a;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C1428e implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f7240a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f7241b;

    public /* synthetic */ C1428e(Runnable runnable, int i10) {
        this.f7240a = i10;
        this.f7241b = runnable;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f7240a) {
            case 0:
                return Balloon.Builder.runIfReachedShowCounts$lambda$165$lambda$164(this.f7241b);
            default:
                this.f7241b.run();
                return a0.f30746a;
        }
    }
}
