package lf;

import android.os.Parcel;
import android.os.Parcelable;
import gg.b0;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.g */
/* loaded from: classes.dex */
public final class C4456g extends AbstractC7149a {
    public static final Parcelable.Creator<C4456g> CREATOR = new b0(29);

    /* renamed from: a */
    public final String f22204a;

    /* renamed from: b */
    public final String f22205b;

    /* renamed from: c */
    public final String f22206c;

    /* renamed from: d */
    public final String f22207d;

    /* renamed from: e */
    public final boolean f22208e;

    /* renamed from: f */
    public final int f22209f;

    public C4456g(String str, int i10, boolean z6, String str2, String str3, String str4) {
        AbstractC6840z.m13036g(str);
        this.f22204a = str;
        this.f22205b = str2;
        this.f22206c = str3;
        this.f22207d = str4;
        this.f22208e = z6;
        this.f22209f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4456g)) {
            return false;
        }
        C4456g c4456g = (C4456g) obj;
        return AbstractC6840z.m13040k(this.f22204a, c4456g.f22204a) && AbstractC6840z.m13040k(this.f22207d, c4456g.f22207d) && AbstractC6840z.m13040k(this.f22205b, c4456g.f22205b) && AbstractC6840z.m13040k(Boolean.valueOf(this.f22208e), Boolean.valueOf(c4456g.f22208e)) && this.f22209f == c4456g.f22209f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22204a, this.f22205b, this.f22207d, Boolean.valueOf(this.f22208e), Integer.valueOf(this.f22209f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11778f(parcel, 1, this.f22204a);
        AbstractC5932m.m11778f(parcel, 2, this.f22205b);
        AbstractC5932m.m11778f(parcel, 3, this.f22206c);
        AbstractC5932m.m11778f(parcel, 4, this.f22207d);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f22208e ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f22209f);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
