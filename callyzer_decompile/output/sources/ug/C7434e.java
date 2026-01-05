package ug;

import android.os.Parcel;
import android.os.Parcelable;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.e */
/* loaded from: classes.dex */
public final class C7434e extends AbstractC7149a {
    public static final Parcelable.Creator<C7434e> CREATOR = new sf.g0(15);

    /* renamed from: a */
    public String f35357a;

    /* renamed from: b */
    public String f35358b;

    /* renamed from: c */
    public j4 f35359c;

    /* renamed from: d */
    public long f35360d;

    /* renamed from: e */
    public boolean f35361e;

    /* renamed from: f */
    public String f35362f;

    /* renamed from: g */
    public final C7449t f35363g;

    /* renamed from: h */
    public long f35364h;

    /* renamed from: j */
    public C7449t f35365j;

    /* renamed from: k */
    public final long f35366k;

    /* renamed from: l */
    public final C7449t f35367l;

    public C7434e(String str, String str2, j4 j4Var, long j6, boolean z6, String str3, C7449t c7449t, long j10, C7449t c7449t2, long j11, C7449t c7449t3) {
        this.f35357a = str;
        this.f35358b = str2;
        this.f35359c = j4Var;
        this.f35360d = j6;
        this.f35361e = z6;
        this.f35362f = str3;
        this.f35363g = c7449t;
        this.f35364h = j10;
        this.f35365j = c7449t2;
        this.f35366k = j11;
        this.f35367l = c7449t3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 2, this.f35357a);
        AbstractC5932m.m11778f(parcel, 3, this.f35358b);
        AbstractC5932m.m11777e(parcel, 4, this.f35359c, i10);
        long j6 = this.f35360d;
        AbstractC5932m.m11785m(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean z6 = this.f35361e;
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 7, this.f35362f);
        AbstractC5932m.m11777e(parcel, 8, this.f35363g, i10);
        long j10 = this.f35364h;
        AbstractC5932m.m11785m(parcel, 9, 8);
        parcel.writeLong(j10);
        AbstractC5932m.m11777e(parcel, 10, this.f35365j, i10);
        AbstractC5932m.m11785m(parcel, 11, 8);
        parcel.writeLong(this.f35366k);
        AbstractC5932m.m11777e(parcel, 12, this.f35367l, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    public C7434e(C7434e c7434e) {
        AbstractC6840z.m13036g(c7434e);
        this.f35357a = c7434e.f35357a;
        this.f35358b = c7434e.f35358b;
        this.f35359c = c7434e.f35359c;
        this.f35360d = c7434e.f35360d;
        this.f35361e = c7434e.f35361e;
        this.f35362f = c7434e.f35362f;
        this.f35363g = c7434e.f35363g;
        this.f35364h = c7434e.f35364h;
        this.f35365j = c7434e.f35365j;
        this.f35366k = c7434e.f35366k;
        this.f35367l = c7434e.f35367l;
    }
}
