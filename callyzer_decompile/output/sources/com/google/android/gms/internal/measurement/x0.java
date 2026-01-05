package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import cg.BinderC0969b;
import java.util.Objects;
import sf.AbstractC6840z;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6442e;

    /* renamed from: f */
    public final /* synthetic */ l1 f6443f;

    /* renamed from: g */
    public final /* synthetic */ Object f6444g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(l1 l1Var, Object obj, int i10) {
        super(l1Var, true);
        this.f6442e = i10;
        this.f6444g = obj;
        this.f6443f = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6442e) {
            case 0:
                l0 l0Var = this.f6443f.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.setUserProperty("fcm", "_ln", new BinderC0969b(this.f6444g), true, this.f6225a);
                break;
            case 1:
                l0 l0Var2 = this.f6443f.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.setConditionalUserProperty((Bundle) this.f6444g, this.f6225a);
                break;
            case 2:
                l0 l0Var3 = this.f6443f.f6281f;
                AbstractC6840z.m13036g(l0Var3);
                l0Var3.retrieveAndUploadBatches(new c1(this, (RunnableC8956c) this.f6444g));
                break;
            case 3:
                l0 l0Var4 = this.f6443f.f6281f;
                AbstractC6840z.m13036g(l0Var4);
                l0Var4.logHealthData(5, "Error with data collection. Data lost.", new BinderC0969b((Exception) this.f6444g), new BinderC0969b(null), new BinderC0969b(null));
                break;
            default:
                l0 l0Var5 = this.f6443f.f6281f;
                AbstractC6840z.m13036g(l0Var5);
                l0Var5.registerOnMeasurementEventListener((i1) this.f6444g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(l1 l1Var, Bundle bundle) {
        super(l1Var, true);
        this.f6442e = 1;
        this.f6444g = bundle;
        Objects.requireNonNull(l1Var);
        this.f6443f = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(l1 l1Var, Exception exc) {
        super(l1Var, false);
        this.f6442e = 3;
        this.f6444g = exc;
        this.f6443f = l1Var;
    }
}
