package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v */
/* loaded from: classes.dex */
public final class C1332v extends AbstractC7149a {
    public static final Parcelable.Creator<C1332v> CREATOR = new C1316f(3);

    /* renamed from: a */
    public final c0 f6672a;

    /* renamed from: b */
    public final d0 f6673b;

    /* renamed from: c */
    public final boolean f6674c;

    public C1332v(c0 c0Var, d0 d0Var, boolean z6) {
        this.f6672a = c0Var;
        this.f6673b = d0Var;
        this.f6674c = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f6672a, i10);
        AbstractC5932m.m11777e(parcel, 2, this.f6673b, i10);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(1);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f6674c ? 1 : 0);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
