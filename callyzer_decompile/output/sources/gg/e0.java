package gg;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import mg.u0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC7149a {
    public static final Parcelable.Creator<e0> CREATOR = new b0(14);

    /* renamed from: a */
    public final boolean f14101a;

    /* renamed from: b */
    public final u0 f14102b;

    public e0(boolean z6, u0 u0Var) {
        this.f14101a = z6;
        this.f14102b = u0Var;
    }

    /* renamed from: b */
    public final JSONObject m6584b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f14101a) {
                jSONObject.put("enabled", true);
            }
            u0 u0Var = this.f14102b;
            byte[] bArrM9652m = u0Var == null ? null : u0Var.m9652m();
            if (bArrM9652m != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM9652m, 32), 11));
                if (bArrM9652m.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM9652m, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f14101a == e0Var.f14101a && AbstractC6840z.m13040k(this.f14102b, e0Var.f14102b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14101a), this.f14102b});
    }

    public final String toString() {
        return AbstractC5601a.m11238i("AuthenticationExtensionsPrfOutputs{", m6584b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f14101a ? 1 : 0);
        u0 u0Var = this.f14102b;
        AbstractC5932m.m11775c(parcel, 2, u0Var == null ? null : u0Var.m9652m());
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
