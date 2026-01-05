package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y4 extends z4 {

    /* renamed from: d */
    public final int f6456d;

    public y4(byte[] bArr, int i10) {
        super(bArr);
        z4.m3802g(0, i10, bArr.length);
        this.f6456d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    /* renamed from: a */
    public final byte mo3792a(int i10) {
        int i11 = this.f6456d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f6470b[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.z4
    /* renamed from: b */
    public final byte mo3793b(int i10) {
        return this.f6470b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.z4
    /* renamed from: c */
    public final int mo3794c() {
        return this.f6456d;
    }
}
