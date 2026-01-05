package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n */
/* loaded from: classes.dex */
public final class C1324n extends AbstractC7149a {
    public static final Parcelable.Creator<C1324n> CREATOR = new C1316f(14);

    /* renamed from: a */
    public final String f6604a;

    /* renamed from: b */
    public final String f6605b;

    /* renamed from: c */
    public final String f6606c;

    /* renamed from: d */
    public final String f6607d;

    /* renamed from: e */
    public final String f6608e;

    /* renamed from: f */
    public final String f6609f;

    /* renamed from: g */
    public final String f6610g;

    public C1324n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6604a = str;
        this.f6605b = str2;
        this.f6606c = str3;
        this.f6607d = str4;
        this.f6608e = str5;
        this.f6609f = str6;
        this.f6610g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f6604a);
        AbstractC5932m.m11778f(parcel, 2, this.f6605b);
        AbstractC5932m.m11778f(parcel, 3, this.f6606c);
        AbstractC5932m.m11778f(parcel, 4, this.f6607d);
        AbstractC5932m.m11778f(parcel, 5, this.f6608e);
        AbstractC5932m.m11778f(parcel, 6, this.f6609f);
        AbstractC5932m.m11778f(parcel, 7, this.f6610g);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
