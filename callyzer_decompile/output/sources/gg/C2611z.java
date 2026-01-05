package gg;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import java.util.Arrays;
import mg.u0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.z */
/* loaded from: classes.dex */
public final class C2611z extends AbstractC7149a {
    public static final Parcelable.Creator<C2611z> CREATOR = new C0220a(25);

    /* renamed from: a */
    public final u0 f14150a;

    /* renamed from: b */
    public final u0 f14151b;

    /* renamed from: c */
    public final u0 f14152c;

    /* renamed from: d */
    public final int f14153d;

    public C2611z(u0 u0Var, u0 u0Var2, u0 u0Var3, int i10) {
        this.f14150a = u0Var;
        this.f14151b = u0Var2;
        this.f14152c = u0Var3;
        this.f14153d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2611z)) {
            return false;
        }
        C2611z c2611z = (C2611z) obj;
        return AbstractC6840z.m13040k(this.f14150a, c2611z.f14150a) && AbstractC6840z.m13040k(this.f14151b, c2611z.f14151b) && AbstractC6840z.m13040k(this.f14152c, c2611z.f14152c) && this.f14153d == c2611z.f14153d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14150a, this.f14151b, this.f14152c, Integer.valueOf(this.f14153d)});
    }

    public final String toString() {
        u0 u0Var = this.f14150a;
        String strM16426c = AbstractC8947b.m16426c(u0Var == null ? null : u0Var.m9652m());
        u0 u0Var2 = this.f14151b;
        String strM16426c2 = AbstractC8947b.m16426c(u0Var2 == null ? null : u0Var2.m9652m());
        u0 u0Var3 = this.f14152c;
        String strM16426c3 = AbstractC8947b.m16426c(u0Var3 != null ? u0Var3.m9652m() : null);
        StringBuilder sbM127r = AbstractC0030c.m127r("HmacSecretExtension{coseKeyAgreement=", strM16426c, ", saltEnc=", strM16426c2, ", saltAuth=");
        sbM127r.append(strM16426c3);
        sbM127r.append(", getPinUvAuthProtocol=");
        return AbstractC5601a.m11233d(this.f14153d, "}", sbM127r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        u0 u0Var = this.f14150a;
        AbstractC5932m.m11775c(parcel, 1, u0Var == null ? null : u0Var.m9652m());
        u0 u0Var2 = this.f14151b;
        AbstractC5932m.m11775c(parcel, 2, u0Var2 == null ? null : u0Var2.m9652m());
        u0 u0Var3 = this.f14152c;
        AbstractC5932m.m11775c(parcel, 3, u0Var3 != null ? u0Var3.m9652m() : null);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f14153d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
