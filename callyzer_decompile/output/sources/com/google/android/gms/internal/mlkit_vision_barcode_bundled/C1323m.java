package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m */
/* loaded from: classes.dex */
public final class C1323m extends AbstractC7149a {
    public static final Parcelable.Creator<C1323m> CREATOR = new C1316f(10);

    /* renamed from: a */
    public final double f6596a;

    /* renamed from: b */
    public final double f6597b;

    public C1323m(double d2, double d10) {
        this.f6596a = d2;
        this.f6597b = d10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 8);
        parcel.writeDouble(this.f6596a);
        AbstractC5932m.m11785m(parcel, 2, 8);
        parcel.writeDouble(this.f6597b);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
