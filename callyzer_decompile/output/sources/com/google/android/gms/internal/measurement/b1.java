package com.google.android.gms.internal.measurement;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6072e;

    /* renamed from: f */
    public final /* synthetic */ String f6073f;

    /* renamed from: g */
    public final /* synthetic */ l1 f6074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(l1 l1Var, String str, int i10) {
        super(l1Var, true);
        this.f6072e = i10;
        this.f6073f = str;
        this.f6074g = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6072e) {
            case 0:
                l0 l0Var = this.f6074g.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.beginAdUnitExposure(this.f6073f, this.f6226b);
                break;
            default:
                l0 l0Var2 = this.f6074g.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.endAdUnitExposure(this.f6073f, this.f6226b);
                break;
        }
    }
}
