package lf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lf.c */
/* loaded from: classes.dex */
public final class C4452c extends AbstractC7149a {
    public static final Parcelable.Creator<C4452c> CREATOR = new C4462m(2);

    /* renamed from: a */
    public final boolean f22191a;

    /* renamed from: b */
    public final byte[] f22192b;

    /* renamed from: c */
    public final String f22193c;

    public C4452c(String str, boolean z6, byte[] bArr) {
        if (z6) {
            AbstractC6840z.m13036g(bArr);
            AbstractC6840z.m13036g(str);
        }
        this.f22191a = z6;
        this.f22192b = bArr;
        this.f22193c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4452c)) {
            return false;
        }
        C4452c c4452c = (C4452c) obj;
        return this.f22191a == c4452c.f22191a && Arrays.equals(this.f22192b, c4452c.f22192b) && Objects.equals(this.f22193c, c4452c.f22193c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22192b) + (Objects.hash(Boolean.valueOf(this.f22191a), this.f22193c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f22191a ? 1 : 0);
        AbstractC5932m.m11775c(parcel, 2, this.f22192b);
        AbstractC5932m.m11778f(parcel, 3, this.f22193c);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
