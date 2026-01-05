package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends q0 {

    /* renamed from: d */
    public final int f6627d;

    /* renamed from: e */
    public final int f6628e;

    public p0(byte[] bArr, int i10, int i11) {
        super(bArr);
        r0.m3946u(i10, i10 + i11, bArr.length);
        this.f6627d = i10;
        this.f6628e = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: a */
    public final byte mo3816a(int i10) {
        r0.m3949y(i10, this.f6628e);
        return this.f6634c[this.f6627d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: b */
    public final byte mo3817b(int i10) {
        return this.f6634c[this.f6627d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: e */
    public final int mo3818e() {
        return this.f6628e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0
    /* renamed from: g */
    public final void mo3819g(int i10, int i11, byte[] bArr, int i12) {
        System.arraycopy(this.f6634c, this.f6627d + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0
    /* renamed from: z */
    public final int mo3931z() {
        return this.f6627d;
    }
}
