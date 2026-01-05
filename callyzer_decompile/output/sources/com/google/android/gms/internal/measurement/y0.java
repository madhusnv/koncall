package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6451e;

    /* renamed from: f */
    public final /* synthetic */ String f6452f;

    /* renamed from: g */
    public final /* synthetic */ String f6453g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f6454h;

    /* renamed from: j */
    public final /* synthetic */ l1 f6455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l1 l1Var, String str, String str2, Bundle bundle, int i10) {
        super(l1Var, true);
        this.f6451e = i10;
        switch (i10) {
            case 1:
                this.f6452f = str;
                this.f6453g = str2;
                this.f6454h = bundle;
                Objects.requireNonNull(l1Var);
                this.f6455j = l1Var;
                super(l1Var, true);
                break;
            default:
                this.f6452f = str;
                this.f6453g = str2;
                this.f6454h = bundle;
                Objects.requireNonNull(l1Var);
                this.f6455j = l1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6451e) {
            case 0:
                l0 l0Var = this.f6455j.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.clearConditionalUserProperty(this.f6452f, this.f6453g, this.f6454h);
                break;
            default:
                long j6 = this.f6225a;
                l0 l0Var2 = this.f6455j.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.logEvent(this.f6452f, this.f6453g, this.f6454h, true, true, j6);
                break;
        }
    }
}
