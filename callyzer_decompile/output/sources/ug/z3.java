package ug;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z3 extends AbstractC7149a {
    public static final Parcelable.Creator<z3> CREATOR = new sf.g0(20);

    /* renamed from: a */
    public final long f36038a;

    /* renamed from: b */
    public byte[] f36039b;

    /* renamed from: c */
    public final String f36040c;

    /* renamed from: d */
    public final Bundle f36041d;

    /* renamed from: e */
    public final int f36042e;

    /* renamed from: f */
    public final long f36043f;

    /* renamed from: g */
    public String f36044g;

    public z3(long j6, byte[] bArr, String str, Bundle bundle, int i10, long j10, String str2) {
        this.f36038a = j6;
        this.f36039b = bArr;
        this.f36040c = str;
        this.f36041d = bundle;
        this.f36042e = i10;
        this.f36043f = j10;
        this.f36044g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 8);
        parcel.writeLong(this.f36038a);
        AbstractC5932m.m11775c(parcel, 2, this.f36039b);
        AbstractC5932m.m11778f(parcel, 3, this.f36040c);
        AbstractC5932m.m11774b(parcel, 4, this.f36041d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f36042e);
        AbstractC5932m.m11785m(parcel, 6, 8);
        parcel.writeLong(this.f36043f);
        AbstractC5932m.m11778f(parcel, 7, this.f36044g);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
