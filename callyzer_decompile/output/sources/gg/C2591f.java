package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.C4367l;
import mg.m0;
import mg.o0;
import mg.u0;
import pg.AbstractC5932m;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.f */
/* loaded from: classes.dex */
public final class C2591f extends AbstractC2592g {
    public static final Parcelable.Creator<C2591f> CREATOR = new b0(16);

    /* renamed from: a */
    public final u0 f14103a;

    /* renamed from: b */
    public final u0 f14104b;

    /* renamed from: c */
    public final u0 f14105c;

    /* renamed from: d */
    public final String[] f14106d;

    public C2591f(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        AbstractC6840z.m13036g(bArr);
        u0 u0VarM9650k = u0.m9650k(bArr.length, bArr);
        AbstractC6840z.m13036g(bArr2);
        u0 u0VarM9650k2 = u0.m9650k(bArr2.length, bArr2);
        AbstractC6840z.m13036g(bArr3);
        u0 u0VarM9650k3 = u0.m9650k(bArr3.length, bArr3);
        this.f14103a = u0VarM9650k;
        this.f14104b = u0VarM9650k2;
        this.f14105c = u0VarM9650k3;
        AbstractC6840z.m13036g(strArr);
        this.f14106d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0149 A[Catch: JSONException -> 0x0021, zzho -> 0x01ad, TRY_LEAVE, TryCatch #3 {zzho -> 0x01ad, blocks: (B:41:0x0115, B:47:0x0138, B:49:0x0149, B:54:0x015f, B:57:0x017b, B:59:0x0190, B:61:0x0195, B:64:0x01b0, B:65:0x01b5, B:66:0x01b6, B:67:0x01bd, B:72:0x01ca, B:74:0x01d7, B:76:0x01e4, B:77:0x01f9, B:78:0x01fe, B:79:0x01ff, B:80:0x0204, B:86:0x0226, B:87:0x022b), top: B:123:0x0115, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject m6585b() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.C2591f.m6585b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2591f)) {
            return false;
        }
        C2591f c2591f = (C2591f) obj;
        return AbstractC6840z.m13040k(this.f14103a, c2591f.f14103a) && AbstractC6840z.m13040k(this.f14104b, c2591f.f14104b) && AbstractC6840z.m13040k(this.f14105c, c2591f.f14105c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f14103a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14104b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14105c}))});
    }

    public final String toString() {
        C4367l c4367l = new C4367l(getClass().getSimpleName());
        m0 m0Var = o0.f23681d;
        byte[] bArrM9652m = this.f14103a.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m.length, bArrM9652m), "keyHandle");
        byte[] bArrM9652m2 = this.f14104b.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m2.length, bArrM9652m2), "clientDataJSON");
        byte[] bArrM9652m3 = this.f14105c.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m3.length, bArrM9652m3), "attestationObject");
        c4367l.m9128O(Arrays.toString(this.f14106d), "transports");
        return c4367l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11775c(parcel, 2, this.f14103a.m9652m());
        AbstractC5932m.m11775c(parcel, 3, this.f14104b.m9652m());
        AbstractC5932m.m11775c(parcel, 4, this.f14105c.m9652m());
        AbstractC5932m.m11779g(parcel, 5, this.f14106d);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
