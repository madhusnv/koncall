package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q3 extends a1 implements t1 {

    /* renamed from: c */
    public final /* synthetic */ int f6637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(int i10, e1 e1Var) {
        super(e1Var);
        this.f6637c = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ e1 mo3806c() {
        switch (this.f6637c) {
            case 0:
                return m3944g();
            default:
                return super.mo3806c();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1
    /* renamed from: d */
    public /* bridge */ /* synthetic */ j0 mo3807d() {
        switch (this.f6637c) {
            case 0:
                return m3944g();
            default:
                return super.mo3807d();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1
    /* renamed from: f */
    public void mo3809f() {
        switch (this.f6637c) {
            case 0:
                super.mo3809f();
                e1 e1Var = this.f6475b;
                if (((b1) e1Var).zzb != w0.f6690c) {
                    b1 b1Var = (b1) e1Var;
                    b1Var.zzb = b1Var.zzb.clone();
                    break;
                }
                break;
            default:
                super.mo3809f();
                break;
        }
    }

    /* renamed from: g */
    public b1 m3944g() {
        if (!((b1) this.f6475b).m3840k()) {
            return (b1) this.f6475b;
        }
        ((b1) this.f6475b).zzb.m4001d();
        return (b1) super.mo3806c();
    }
}
