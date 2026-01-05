package gg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.c */
/* loaded from: classes.dex */
public final class C2588c extends AbstractC7149a {
    public static final Parcelable.Creator<C2588c> CREATOR = new b0(10);

    /* renamed from: a */
    public final C2606u f14087a;

    /* renamed from: b */
    public final d0 f14088b;

    /* renamed from: c */
    public final C2589d f14089c;

    /* renamed from: d */
    public final e0 f14090d;

    /* renamed from: e */
    public final String f14091e;

    public C2588c(C2606u c2606u, d0 d0Var, C2589d c2589d, e0 e0Var, String str) {
        this.f14087a = c2606u;
        this.f14088b = d0Var;
        this.f14089c = c2589d;
        this.f14090d = e0Var;
        this.f14091e = str;
    }

    /* renamed from: b */
    public final JSONObject m6582b() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            C2589d c2589d = this.f14089c;
            if (c2589d != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", c2589d.f14093a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e2) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e2);
                }
            }
            C2606u c2606u = this.f14087a;
            if (c2606u != null) {
                jSONObject.put("uvm", c2606u.m6587b());
            }
            e0 e0Var = this.f14090d;
            if (e0Var != null) {
                jSONObject.put("prf", e0Var.m6584b());
            }
            String str = this.f14091e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2588c)) {
            return false;
        }
        C2588c c2588c = (C2588c) obj;
        return AbstractC6840z.m13040k(this.f14087a, c2588c.f14087a) && AbstractC6840z.m13040k(this.f14088b, c2588c.f14088b) && AbstractC6840z.m13040k(this.f14089c, c2588c.f14089c) && AbstractC6840z.m13040k(this.f14090d, c2588c.f14090d) && AbstractC6840z.m13040k(this.f14091e, c2588c.f14091e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14087a, this.f14088b, this.f14089c, this.f14090d, this.f14091e});
    }

    public final String toString() {
        return AbstractC5601a.m11238i("AuthenticationExtensionsClientOutputs{", m6582b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 1, this.f14087a, i10);
        AbstractC5932m.m11777e(parcel, 2, this.f14088b, i10);
        AbstractC5932m.m11777e(parcel, 3, this.f14089c, i10);
        AbstractC5932m.m11777e(parcel, 4, this.f14090d, i10);
        AbstractC5932m.m11778f(parcel, 5, this.f14091e);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
