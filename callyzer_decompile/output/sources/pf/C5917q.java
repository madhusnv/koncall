package pf;

import android.os.Parcel;
import android.os.Parcelable;
import lf.C4462m;
import og.qb;
import og.rb;
import pg.AbstractC5932m;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.q */
/* loaded from: classes.dex */
public final class C5917q extends AbstractC7149a {
    public static final Parcelable.Creator<C5917q> CREATOR = new C4462m(14);

    /* renamed from: a */
    public final boolean f28776a;

    /* renamed from: b */
    public final String f28777b;

    /* renamed from: c */
    public final int f28778c;

    /* renamed from: d */
    public final int f28779d;

    public C5917q(String str, int i10, int i11, boolean z6) {
        this.f28776a = z6;
        this.f28777b = str;
        this.f28778c = rb.m10872b(i10) - 1;
        this.f28779d = qb.m10852a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f28776a ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 2, this.f28777b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f28778c);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f28779d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
