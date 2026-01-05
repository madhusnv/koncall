package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.Arrays;
import mg.u0;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.o */
/* loaded from: classes.dex */
public final class C2600o extends AbstractC7149a {
    public static final Parcelable.Creator<C2600o> CREATOR = new b0(2);

    /* renamed from: a */
    public final u0 f14136a;

    /* renamed from: b */
    public final String f14137b;

    /* renamed from: c */
    public final String f14138c;

    /* renamed from: d */
    public final String f14139d;

    public C2600o(String str, String str2, String str3, byte[] bArr) {
        AbstractC6840z.m13036g(bArr);
        this.f14136a = u0.m9650k(bArr.length, bArr);
        AbstractC6840z.m13036g(str);
        this.f14137b = str;
        this.f14138c = str2;
        AbstractC6840z.m13036g(str3);
        this.f14139d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2600o)) {
            return false;
        }
        C2600o c2600o = (C2600o) obj;
        return AbstractC6840z.m13040k(this.f14136a, c2600o.f14136a) && AbstractC6840z.m13040k(this.f14137b, c2600o.f14137b) && AbstractC6840z.m13040k(this.f14138c, c2600o.f14138c) && AbstractC6840z.m13040k(this.f14139d, c2600o.f14139d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14136a, this.f14137b, this.f14138c, this.f14139d});
    }

    public final String toString() {
        StringBuilder sbM7383p = m0.m7383p("PublicKeyCredentialUserEntity{\n id=", AbstractC8947b.m16426c(this.f14136a.m9652m()), ", \n name='");
        sbM7383p.append(this.f14137b);
        sbM7383p.append("', \n icon='");
        sbM7383p.append(this.f14138c);
        sbM7383p.append("', \n displayName='");
        return AbstractC1452a.m4564k(sbM7383p, this.f14139d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11775c(parcel, 2, this.f14136a.m9652m());
        AbstractC5932m.m11778f(parcel, 3, this.f14137b);
        AbstractC5932m.m11778f(parcel, 4, this.f14138c);
        AbstractC5932m.m11778f(parcel, 5, this.f14139d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
