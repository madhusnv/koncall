package gg;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import com.google.android.gms.fido.fido2.api.common.C1275a;
import java.util.Arrays;
import mg.j1;
import mg.u0;
import p020v.a1;
import sf.AbstractC6840z;
import tf.AbstractC7149a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.l */
/* loaded from: classes.dex */
public final class C2597l extends AbstractC7149a {
    public static final Parcelable.Creator<C2597l> CREATOR = new C0220a(28);

    /* renamed from: a */
    public final String f14116a;

    /* renamed from: b */
    public final String f14117b;

    /* renamed from: c */
    public final u0 f14118c;

    /* renamed from: d */
    public final C2591f f14119d;

    /* renamed from: e */
    public final C2590e f14120e;

    /* renamed from: f */
    public final C1275a f14121f;

    /* renamed from: g */
    public final C2588c f14122g;

    /* renamed from: h */
    public final String f14123h;

    public C2597l(String str, String str2, byte[] bArr, C2591f c2591f, C2590e c2590e, C1275a c1275a, C2588c c2588c, String str3) {
        u0 u0VarM9650k = bArr == null ? null : u0.m9650k(bArr.length, bArr);
        boolean z6 = false;
        AbstractC6840z.m13030a("Must provide a response object.", (c2591f != null && c2590e == null && c1275a == null) || (c2591f == null && c2590e != null && c1275a == null) || (c2591f == null && c2590e == null && c1275a != null));
        if (c1275a != null || (str != null && u0VarM9650k != null)) {
            z6 = true;
        }
        AbstractC6840z.m13030a("Must provide id and rawId if not an error response.", z6);
        this.f14116a = str;
        this.f14117b = str2;
        this.f14118c = u0VarM9650k;
        this.f14119d = c2591f;
        this.f14120e = c2590e;
        this.f14121f = c1275a;
        this.f14122g = c2588c;
        this.f14123h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2597l)) {
            return false;
        }
        C2597l c2597l = (C2597l) obj;
        return AbstractC6840z.m13040k(this.f14116a, c2597l.f14116a) && AbstractC6840z.m13040k(this.f14117b, c2597l.f14117b) && AbstractC6840z.m13040k(this.f14118c, c2597l.f14118c) && AbstractC6840z.m13040k(this.f14119d, c2597l.f14119d) && AbstractC6840z.m13040k(this.f14120e, c2597l.f14120e) && AbstractC6840z.m13040k(this.f14121f, c2597l.f14121f) && AbstractC6840z.m13040k(this.f14122g, c2597l.f14122g) && AbstractC6840z.m13040k(this.f14123h, c2597l.f14123h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14116a, this.f14117b, this.f14118c, this.f14120e, this.f14119d, this.f14121f, this.f14122g, this.f14123h});
    }

    public final String toString() {
        u0 u0Var = this.f14118c;
        String strM16426c = AbstractC8947b.m16426c(u0Var == null ? null : u0Var.m9652m());
        String strValueOf = String.valueOf(this.f14119d);
        String strValueOf2 = String.valueOf(this.f14120e);
        String strValueOf3 = String.valueOf(this.f14121f);
        String strValueOf4 = String.valueOf(this.f14122g);
        StringBuilder sbM127r = AbstractC0030c.m127r("PublicKeyCredential{\n id='", this.f14116a, "', \n type='", this.f14117b, "', \n rawId=");
        a1.m14319B(sbM127r, strM16426c, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        a1.m14319B(sbM127r, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return AbstractC0030c.m124o(sbM127r, strValueOf4, ", \n authenticatorAttachment='", this.f14123h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j1.f23657a.m5281b();
        throw null;
    }
}
