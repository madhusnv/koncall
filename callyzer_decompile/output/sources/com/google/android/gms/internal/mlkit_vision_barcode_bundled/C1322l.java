package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l */
/* loaded from: classes.dex */
public final class C1322l extends AbstractC7149a {
    public static final Parcelable.Creator<C1322l> CREATOR = new C1316f(9);

    /* renamed from: a */
    public final int f6589a;

    /* renamed from: b */
    public final String f6590b;

    /* renamed from: c */
    public final String f6591c;

    /* renamed from: d */
    public final String f6592d;

    public C1322l(String str, int i10, String str2, String str3) {
        this.f6589a = i10;
        this.f6590b = str;
        this.f6591c = str2;
        this.f6592d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f6589a);
        AbstractC5932m.m11778f(parcel, 2, this.f6590b);
        AbstractC5932m.m11778f(parcel, 3, this.f6591c);
        AbstractC5932m.m11778f(parcel, 4, this.f6592d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
