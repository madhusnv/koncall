package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r */
/* loaded from: classes.dex */
public final class C1328r extends AbstractC7149a {
    public static final Parcelable.Creator<C1328r> CREATOR = new C1316f(18);

    /* renamed from: a */
    public final String f6638a;

    /* renamed from: b */
    public final String f6639b;

    /* renamed from: c */
    public final int f6640c;

    public C1328r(String str, String str2, int i10) {
        this.f6638a = str;
        this.f6639b = str2;
        this.f6640c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f6638a);
        AbstractC5932m.m11778f(parcel, 2, this.f6639b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f6640c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
