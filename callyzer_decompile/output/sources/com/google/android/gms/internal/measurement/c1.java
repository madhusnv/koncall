package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractBinderC1309y implements p0 {

    /* renamed from: e */
    public final /* synthetic */ RunnableC8956c f6094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(x0 x0Var, RunnableC8956c runnableC8956c) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f6094e = runnableC8956c;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    /* renamed from: a */
    public final void mo3184a() {
        this.f6094e.run();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        mo3184a();
        return true;
    }
}
