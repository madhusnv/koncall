package com.skydoves.balloon;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1427d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7238a;

    /* renamed from: b */
    public final /* synthetic */ Balloon f7239b;

    public /* synthetic */ RunnableC1427d(Balloon balloon, int i10) {
        this.f7238a = i10;
        this.f7239b = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7238a) {
            case 0:
                Balloon.startBalloonHighlightAnimation$lambda$28(this.f7239b);
                break;
            default:
                Balloon.startBalloonHighlightAnimation$lambda$28$lambda$27(this.f7239b);
                break;
        }
    }
}
