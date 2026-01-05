package sf;

import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.k */
/* loaded from: classes.dex */
public final class C6825k extends AbstractC7149a {
    public static final Parcelable.Creator<C6825k> CREATOR = new C4462m(25);

    /* renamed from: a */
    public final int f32447a;

    /* renamed from: b */
    public final int f32448b;

    /* renamed from: c */
    public final int f32449c;

    /* renamed from: d */
    public final long f32450d;

    /* renamed from: e */
    public final long f32451e;

    /* renamed from: f */
    public final String f32452f;

    /* renamed from: g */
    public final String f32453g;

    /* renamed from: h */
    public final int f32454h;

    /* renamed from: j */
    public final int f32455j;

    public C6825k(int i10, int i11, int i12, long j6, long j10, String str, String str2, int i13, int i14) {
        this.f32447a = i10;
        this.f32448b = i11;
        this.f32449c = i12;
        this.f32450d = j6;
        this.f32451e = j10;
        this.f32452f = str;
        this.f32453g = str2;
        this.f32454h = i13;
        this.f32455j = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f32447a);
        AbstractC5932m.m11785m(parcel, 2, 4);
        parcel.writeInt(this.f32448b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f32449c);
        AbstractC5932m.m11785m(parcel, 4, 8);
        parcel.writeLong(this.f32450d);
        AbstractC5932m.m11785m(parcel, 5, 8);
        parcel.writeLong(this.f32451e);
        AbstractC5932m.m11778f(parcel, 6, this.f32452f);
        AbstractC5932m.m11778f(parcel, 7, this.f32453g);
        AbstractC5932m.m11785m(parcel, 8, 4);
        parcel.writeInt(this.f32454h);
        AbstractC5932m.m11785m(parcel, 9, 4);
        parcel.writeInt(this.f32455j);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
