package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC7149a {
    public static final Parcelable.Creator<b0> CREATOR = new C1316f(11);

    /* renamed from: a */
    public final boolean f6480a;

    /* renamed from: b */
    public final byte[] f6481b;

    /* renamed from: c */
    public final boolean f6482c;

    /* renamed from: d */
    public final float f6483d;

    /* renamed from: e */
    public final boolean f6484e;

    public b0(boolean z6, byte[] bArr, boolean z10, float f6, boolean z11) {
        this.f6480a = z6;
        this.f6481b = bArr;
        this.f6482c = z10;
        this.f6483d = f6;
        this.f6484e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6480a ? 1 : 0);
        AbstractC5932m.m11775c(parcel, 2, this.f6481b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6482c ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeFloat(this.f6483d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f6484e ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
