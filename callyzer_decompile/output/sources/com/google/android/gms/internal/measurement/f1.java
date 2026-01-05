package com.google.android.gms.internal.measurement;

import java.util.Objects;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends h1 {

    /* renamed from: e */
    public final /* synthetic */ String f6184e;

    /* renamed from: f */
    public final /* synthetic */ String f6185f;

    /* renamed from: g */
    public final /* synthetic */ boolean f6186g;

    /* renamed from: h */
    public final /* synthetic */ i0 f6187h;

    /* renamed from: j */
    public final /* synthetic */ l1 f6188j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l1 l1Var, String str, String str2, boolean z6, i0 i0Var) {
        super(l1Var, true);
        this.f6184e = str;
        this.f6185f = str2;
        this.f6186g = z6;
        this.f6187h = i0Var;
        Objects.requireNonNull(l1Var);
        this.f6188j = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: a */
    public final void mo3100a() {
        l0 l0Var = this.f6188j.f6281f;
        AbstractC6840z.m13036g(l0Var);
        l0Var.getUserProperties(this.f6184e, this.f6185f, this.f6186g, this.f6187h);
    }

    @Override // com.google.android.gms.internal.measurement.h1
    /* renamed from: b */
    public final void mo3101b() {
        this.f6187h.mo3311E(null);
    }
}
