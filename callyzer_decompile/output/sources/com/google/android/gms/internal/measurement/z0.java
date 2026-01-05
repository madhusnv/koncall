package com.google.android.gms.internal.measurement;

import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ int f6462e = 1;

    /* renamed from: f */
    public final /* synthetic */ String f6463f;

    /* renamed from: g */
    public final /* synthetic */ String f6464g;

    /* renamed from: h */
    public final /* synthetic */ l1 f6465h;

    /* renamed from: j */
    public final /* synthetic */ Object f6466j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l1 l1Var, w0 w0Var, String str, String str2) {
        super(l1Var, true);
        this.f6466j = w0Var;
        this.f6463f = str;
        this.f6464g = str2;
        Objects.requireNonNull(l1Var);
        this.f6465h = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        switch (this.f6462e) {
            case 0:
                l0 l0Var = this.f6465h.f6281f;
                AbstractC6840z.m13036g(l0Var);
                l0Var.getConditionalUserProperties(this.f6463f, this.f6464g, (i0) this.f6466j);
                break;
            default:
                l0 l0Var2 = this.f6465h.f6281f;
                AbstractC6840z.m13036g(l0Var2);
                l0Var2.setCurrentScreenByScionActivityInfo((w0) this.f6466j, this.f6463f, this.f6464g, this.f6225a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: b */
    public void mo3101b() {
        switch (this.f6462e) {
            case 0:
                ((i0) this.f6466j).mo3311E(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l1 l1Var, String str, String str2, i0 i0Var) {
        super(l1Var, true);
        this.f6463f = str;
        this.f6464g = str2;
        this.f6466j = i0Var;
        Objects.requireNonNull(l1Var);
        this.f6465h = l1Var;
    }
}
