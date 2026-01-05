package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i */
/* loaded from: classes.dex */
public final class C1319i extends AbstractC7149a {
    public static final Parcelable.Creator<C1319i> CREATOR = new C1316f(6);

    /* renamed from: a */
    public final String f6554a;

    /* renamed from: b */
    public final String f6555b;

    /* renamed from: c */
    public final String f6556c;

    /* renamed from: d */
    public final String f6557d;

    /* renamed from: e */
    public final String f6558e;

    /* renamed from: f */
    public final C1318h f6559f;

    /* renamed from: g */
    public final C1318h f6560g;

    public C1319i(String str, String str2, String str3, String str4, String str5, C1318h c1318h, C1318h c1318h2) {
        this.f6554a = str;
        this.f6555b = str2;
        this.f6556c = str3;
        this.f6557d = str4;
        this.f6558e = str5;
        this.f6559f = c1318h;
        this.f6560g = c1318h2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f6554a);
        AbstractC5932m.m11778f(parcel, 2, this.f6555b);
        AbstractC5932m.m11778f(parcel, 3, this.f6556c);
        AbstractC5932m.m11778f(parcel, 4, this.f6557d);
        AbstractC5932m.m11778f(parcel, 5, this.f6558e);
        AbstractC5932m.m11777e(parcel, 6, this.f6559f, i10);
        AbstractC5932m.m11777e(parcel, 7, this.f6560g, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
