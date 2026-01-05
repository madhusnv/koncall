package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w */
/* loaded from: classes.dex */
public final class C1333w extends AbstractC7149a {
    public static final Parcelable.Creator<C1333w> CREATOR = new C1316f(4);

    /* renamed from: a */
    public final b0 f6689a;

    public C1333w(b0 b0Var) {
        this.f6689a = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f6689a, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
