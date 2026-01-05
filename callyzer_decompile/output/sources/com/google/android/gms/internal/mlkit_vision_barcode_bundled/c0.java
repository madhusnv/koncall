package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC7149a {
    public static final Parcelable.Creator<c0> CREATOR = new C1316f(12);

    /* renamed from: a */
    public final float[] f6511a;

    /* renamed from: b */
    public final int f6512b;

    /* renamed from: c */
    public final boolean f6513c;

    public c0(float[] fArr, int i10, boolean z6) {
        this.f6511a = fArr;
        this.f6512b = i10;
        this.f6513c = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        float[] fArr = this.f6511a;
        if (fArr != null) {
            int iM11783k2 = AbstractC5932m.m11783k(parcel, 1);
            parcel.writeFloatArray(fArr);
            AbstractC5932m.m11784l(parcel, iM11783k2);
        }
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f6512b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6513c ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
