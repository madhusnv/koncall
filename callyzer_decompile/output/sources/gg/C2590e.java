package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.C4367l;
import mg.m0;
import mg.o0;
import mg.u0;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.e */
/* loaded from: classes.dex */
public final class C2590e extends AbstractC2592g {
    public static final Parcelable.Creator<C2590e> CREATOR = new b0(15);

    /* renamed from: a */
    public final u0 f14096a;

    /* renamed from: b */
    public final u0 f14097b;

    /* renamed from: c */
    public final u0 f14098c;

    /* renamed from: d */
    public final u0 f14099d;

    /* renamed from: e */
    public final u0 f14100e;

    public C2590e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC6840z.m13036g(bArr);
        u0 u0VarM9650k = u0.m9650k(bArr.length, bArr);
        AbstractC6840z.m13036g(bArr2);
        u0 u0VarM9650k2 = u0.m9650k(bArr2.length, bArr2);
        AbstractC6840z.m13036g(bArr3);
        u0 u0VarM9650k3 = u0.m9650k(bArr3.length, bArr3);
        AbstractC6840z.m13036g(bArr4);
        u0 u0VarM9650k4 = u0.m9650k(bArr4.length, bArr4);
        u0 u0VarM9650k5 = bArr5 == null ? null : u0.m9650k(bArr5.length, bArr5);
        this.f14096a = u0VarM9650k;
        this.f14097b = u0VarM9650k2;
        this.f14098c = u0VarM9650k3;
        this.f14099d = u0VarM9650k4;
        this.f14100e = u0VarM9650k5;
    }

    /* renamed from: b */
    public final JSONObject m6583b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", AbstractC8947b.m16426c(this.f14097b.m9652m()));
            jSONObject.put("authenticatorData", AbstractC8947b.m16426c(this.f14098c.m9652m()));
            jSONObject.put("signature", AbstractC8947b.m16426c(this.f14099d.m9652m()));
            u0 u0Var = this.f14100e;
            if (u0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", AbstractC8947b.m16426c(u0Var == null ? null : u0Var.m9652m()));
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2590e)) {
            return false;
        }
        C2590e c2590e = (C2590e) obj;
        return AbstractC6840z.m13040k(this.f14096a, c2590e.f14096a) && AbstractC6840z.m13040k(this.f14097b, c2590e.f14097b) && AbstractC6840z.m13040k(this.f14098c, c2590e.f14098c) && AbstractC6840z.m13040k(this.f14099d, c2590e.f14099d) && AbstractC6840z.m13040k(this.f14100e, c2590e.f14100e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f14096a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14097b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14098c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14099d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f14100e}))});
    }

    public final String toString() {
        C4367l c4367l = new C4367l(getClass().getSimpleName());
        m0 m0Var = o0.f23681d;
        byte[] bArrM9652m = this.f14096a.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m.length, bArrM9652m), "keyHandle");
        byte[] bArrM9652m2 = this.f14097b.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m2.length, bArrM9652m2), "clientDataJSON");
        byte[] bArrM9652m3 = this.f14098c.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m3.length, bArrM9652m3), "authenticatorData");
        byte[] bArrM9652m4 = this.f14099d.m9652m();
        c4367l.m9128O(m0Var.m9631c(bArrM9652m4.length, bArrM9652m4), "signature");
        u0 u0Var = this.f14100e;
        byte[] bArrM9652m5 = u0Var == null ? null : u0Var.m9652m();
        if (bArrM9652m5 != null) {
            c4367l.m9128O(m0Var.m9631c(bArrM9652m5.length, bArrM9652m5), "userHandle");
        }
        return c4367l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11775c(parcel, 2, this.f14096a.m9652m());
        AbstractC5932m.m11775c(parcel, 3, this.f14097b.m9652m());
        AbstractC5932m.m11775c(parcel, 4, this.f14098c.m9652m());
        AbstractC5932m.m11775c(parcel, 5, this.f14099d.m9652m());
        u0 u0Var = this.f14100e;
        AbstractC5932m.m11775c(parcel, 6, u0Var == null ? null : u0Var.m9652m());
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
