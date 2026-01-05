package gg;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import p020v.a1;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.b */
/* loaded from: classes.dex */
public final class C2587b extends AbstractC7149a {
    public static final Parcelable.Creator<C2587b> CREATOR = new b0(11);

    /* renamed from: a */
    public final C2595j f14074a;

    /* renamed from: b */
    public final g0 f14075b;

    /* renamed from: c */
    public final C2604s f14076c;

    /* renamed from: d */
    public final i0 f14077d;

    /* renamed from: e */
    public final C2608w f14078e;

    /* renamed from: f */
    public final C2609x f14079f;

    /* renamed from: g */
    public final h0 f14080g;

    /* renamed from: h */
    public final C2610y f14081h;

    /* renamed from: j */
    public final C2596k f14082j;

    /* renamed from: k */
    public final a0 f14083k;

    /* renamed from: l */
    public final c0 f14084l;

    /* renamed from: m */
    public final C2611z f14085m;

    public C2587b(C2595j c2595j, g0 g0Var, C2604s c2604s, i0 i0Var, C2608w c2608w, C2609x c2609x, h0 h0Var, C2610y c2610y, C2596k c2596k, a0 a0Var, c0 c0Var, C2611z c2611z) {
        this.f14074a = c2595j;
        this.f14076c = c2604s;
        this.f14075b = g0Var;
        this.f14077d = i0Var;
        this.f14078e = c2608w;
        this.f14079f = c2609x;
        this.f14080g = h0Var;
        this.f14081h = c2610y;
        this.f14082j = c2596k;
        this.f14083k = a0Var;
        this.f14084l = c0Var;
        this.f14085m = c2611z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2587b)) {
            return false;
        }
        C2587b c2587b = (C2587b) obj;
        return AbstractC6840z.m13040k(this.f14074a, c2587b.f14074a) && AbstractC6840z.m13040k(this.f14075b, c2587b.f14075b) && AbstractC6840z.m13040k(this.f14076c, c2587b.f14076c) && AbstractC6840z.m13040k(this.f14077d, c2587b.f14077d) && AbstractC6840z.m13040k(this.f14078e, c2587b.f14078e) && AbstractC6840z.m13040k(this.f14079f, c2587b.f14079f) && AbstractC6840z.m13040k(this.f14080g, c2587b.f14080g) && AbstractC6840z.m13040k(this.f14081h, c2587b.f14081h) && AbstractC6840z.m13040k(this.f14082j, c2587b.f14082j) && AbstractC6840z.m13040k(this.f14083k, c2587b.f14083k) && AbstractC6840z.m13040k(this.f14084l, c2587b.f14084l) && AbstractC6840z.m13040k(this.f14085m, c2587b.f14085m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14074a, this.f14075b, this.f14076c, this.f14077d, this.f14078e, this.f14079f, this.f14080g, this.f14081h, this.f14082j, this.f14083k, this.f14084l, this.f14085m});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14074a);
        String strValueOf2 = String.valueOf(this.f14075b);
        String strValueOf3 = String.valueOf(this.f14076c);
        String strValueOf4 = String.valueOf(this.f14077d);
        String strValueOf5 = String.valueOf(this.f14078e);
        String strValueOf6 = String.valueOf(this.f14079f);
        String strValueOf7 = String.valueOf(this.f14080g);
        String strValueOf8 = String.valueOf(this.f14081h);
        String strValueOf9 = String.valueOf(this.f14082j);
        String strValueOf10 = String.valueOf(this.f14083k);
        String strValueOf11 = String.valueOf(this.f14084l);
        StringBuilder sbM127r = AbstractC0030c.m127r("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        a1.m14319B(sbM127r, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        a1.m14319B(sbM127r, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        a1.m14319B(sbM127r, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        a1.m14319B(sbM127r, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return AbstractC1452a.m4564k(sbM127r, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 2, this.f14074a, i10);
        AbstractC5932m.m11777e(parcel, 3, this.f14075b, i10);
        AbstractC5932m.m11777e(parcel, 4, this.f14076c, i10);
        AbstractC5932m.m11777e(parcel, 5, this.f14077d, i10);
        AbstractC5932m.m11777e(parcel, 6, this.f14078e, i10);
        AbstractC5932m.m11777e(parcel, 7, this.f14079f, i10);
        AbstractC5932m.m11777e(parcel, 8, this.f14080g, i10);
        AbstractC5932m.m11777e(parcel, 9, this.f14081h, i10);
        AbstractC5932m.m11777e(parcel, 10, this.f14082j, i10);
        AbstractC5932m.m11777e(parcel, 11, this.f14083k, i10);
        AbstractC5932m.m11777e(parcel, 12, this.f14084l, i10);
        AbstractC5932m.m11777e(parcel, 13, this.f14085m, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
