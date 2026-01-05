package com.google.android.gms.internal.measurement;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6107e;

    /* renamed from: f */
    public final /* synthetic */ i0 f6108f;

    /* renamed from: g */
    public final /* synthetic */ l1 f6109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(l1 l1Var, i0 i0Var, int i10) {
        super(l1Var, true);
        this.f6107e = i10;
        this.f6108f = i0Var;
        this.f6109g = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6107e) {
            case 0:
                l0 l0Var = this.f6109g.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.getGmpAppId(this.f6108f);
                break;
            case 1:
                l0 l0Var2 = this.f6109g.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.getCachedAppInstanceId(this.f6108f);
                break;
            case 2:
                l0 l0Var3 = this.f6109g.f6281f;
                AbstractC6840z.m13036g(l0Var3);
                l0Var3.generateEventId(this.f6108f);
                break;
            case 3:
                l0 l0Var4 = this.f6109g.f6281f;
                AbstractC6840z.m13036g(l0Var4);
                l0Var4.getCurrentScreenName(this.f6108f);
                break;
            default:
                l0 l0Var5 = this.f6109g.f6281f;
                AbstractC6840z.m13036g(l0Var5);
                l0Var5.getCurrentScreenClass(this.f6108f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: b */
    public final void mo3101b() {
        switch (this.f6107e) {
            case 0:
                this.f6108f.mo3311E(null);
                break;
            case 1:
                this.f6108f.mo3311E(null);
                break;
            case 2:
                this.f6108f.mo3311E(null);
                break;
            case 3:
                this.f6108f.mo3311E(null);
                break;
            default:
                this.f6108f.mo3311E(null);
                break;
        }
    }
}
