package com.skydoves.balloon;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1415b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f7210a;

    /* renamed from: b */
    public final /* synthetic */ Balloon f7211b;

    public /* synthetic */ C1415b(Balloon balloon, int i10) {
        this.f7210a = i10;
        this.f7211b = balloon;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f7210a) {
            case 0:
                return Balloon.dismiss$lambda$44(this.f7211b);
            case 1:
                return Balloon.autoDismissRunnable_delegate$lambda$1(this.f7211b);
            default:
                return Balloon.balloonPersistence_delegate$lambda$2(this.f7211b);
        }
    }
}
