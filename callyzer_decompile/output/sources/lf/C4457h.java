package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.h */
/* loaded from: classes.dex */
public final class C4457h extends AbstractC7149a {
    public static final Parcelable.Creator<C4457h> CREATOR = new C4462m(4);

    /* renamed from: a */
    public final C4460k f22210a;

    /* renamed from: b */
    public final String f22211b;

    /* renamed from: c */
    public final int f22212c;

    public C4457h(C4460k c4460k, String str, int i10) {
        AbstractC6840z.m13036g(c4460k);
        this.f22210a = c4460k;
        this.f22211b = str;
        this.f22212c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4457h)) {
            return false;
        }
        C4457h c4457h = (C4457h) obj;
        return AbstractC6840z.m13040k(this.f22210a, c4457h.f22210a) && AbstractC6840z.m13040k(this.f22211b, c4457h.f22211b) && this.f22212c == c4457h.f22212c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22210a, this.f22211b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f22210a, i10);
        AbstractC5932m.m11778f(parcel, 2, this.f22211b);
        AbstractC5932m.m11785m(parcel, 3, 4);
        parcel.writeInt(this.f22212c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
