package com.google.android.gms.internal.measurement;

import android.app.Activity;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6246e;

    /* renamed from: f */
    public final /* synthetic */ Activity f6247f;

    /* renamed from: g */
    public final /* synthetic */ k1 f6248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Activity activity, int i10) {
        super(k1Var.f6263a, true);
        this.f6246e = i10;
        switch (i10) {
            case 1:
                this.f6247f = activity;
                this.f6248g = k1Var;
                super(k1Var.f6263a, true);
                break;
            case 2:
                this.f6247f = activity;
                this.f6248g = k1Var;
                super(k1Var.f6263a, true);
                break;
            case 3:
                this.f6247f = activity;
                this.f6248g = k1Var;
                super(k1Var.f6263a, true);
                break;
            case 4:
                this.f6247f = activity;
                this.f6248g = k1Var;
                super(k1Var.f6263a, true);
                break;
            default:
                this.f6247f = activity;
                this.f6248g = k1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6246e) {
            case 0:
                l0 l0Var = this.f6248g.f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.onActivityStartedByScionActivityInfo(w0.m3730b(this.f6247f), this.f6226b);
                break;
            case 1:
                l0 l0Var2 = this.f6248g.f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.onActivityResumedByScionActivityInfo(w0.m3730b(this.f6247f), this.f6226b);
                break;
            case 2:
                l0 l0Var3 = this.f6248g.f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var3);
                l0Var3.onActivityPausedByScionActivityInfo(w0.m3730b(this.f6247f), this.f6226b);
                break;
            case 3:
                l0 l0Var4 = this.f6248g.f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var4);
                l0Var4.onActivityStoppedByScionActivityInfo(w0.m3730b(this.f6247f), this.f6226b);
                break;
            default:
                l0 l0Var5 = this.f6248g.f6263a.f6281f;
                AbstractC6840z.m13036g(l0Var5);
                l0Var5.onActivityDestroyedByScionActivityInfo(w0.m3730b(this.f6247f), this.f6226b);
                break;
        }
    }
}
