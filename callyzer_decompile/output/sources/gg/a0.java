package gg;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import mg.AbstractC4723b;
import mg.j0;
import mg.k0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC7149a {
    public static final Parcelable.Creator<a0> CREATOR = new C0220a(26);

    /* renamed from: b */
    public static final byte[] f14072b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    public final byte[][] f14073a;

    public a0(byte[][] bArr) {
        AbstractC6840z.m13031b(bArr != null);
        AbstractC6840z.m13031b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            AbstractC6840z.m13031b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            AbstractC6840z.m13031b(bArr[i11] != null);
            int length = bArr[i11].length;
            AbstractC6840z.m13031b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f14073a = bArr;
    }

    /* renamed from: b */
    public static a0 m6577b(JSONObject jSONObject, boolean z6) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z6) {
                    arrayList.add(m6580g(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(m6581h(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(AbstractC8947b.m16425b(next));
                    if (z6) {
                        arrayList.add(m6580g(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(m6581h(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new a0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    /* renamed from: c */
    public static JSONObject m6578c(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* renamed from: e */
    public static byte[] m6579e(byte[] bArr) {
        j0 j0Var;
        mg.f0 f0Var;
        int i10 = mg.i0.f23650a;
        k0 k0Var = mg.h0.f23646a;
        int i11 = k0Var.f23660f;
        MessageDigest messageDigest = k0Var.f23659e;
        if (k0Var.f23661g) {
            try {
                j0Var = new j0((MessageDigest) messageDigest.clone(), i11);
            } catch (CloneNotSupportedException unused) {
            }
        } else {
            try {
                j0Var = new j0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
            } catch (NoSuchAlgorithmException e2) {
                throw new AssertionError(e2);
            }
        }
        MessageDigest messageDigest2 = (MessageDigest) j0Var.f23656c;
        byte[] bArr2 = f14072b;
        bArr2.getClass();
        int length = bArr2.length;
        if (j0Var.f23655b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (j0Var.f23655b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (j0Var.f23655b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        j0Var.f23655b = true;
        int i12 = j0Var.f23654a;
        if (i12 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = mg.g0.f23643a;
            f0Var = new mg.f0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i12);
            char[] cArr2 = mg.g0.f23643a;
            f0Var = new mg.f0(bArrCopyOf);
        }
        return (byte[]) f0Var.f23641b.clone();
    }

    /* renamed from: g */
    public static byte[] m6580g(JSONObject jSONObject) throws JSONException {
        byte[] bArrM16425b = AbstractC8947b.m16425b(jSONObject.getString("first"));
        if (bArrM16425b.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrM16425b;
        }
        byte[] bArrM16425b2 = AbstractC8947b.m16425b(jSONObject.getString("second"));
        if (bArrM16425b2.length == 32) {
            return AbstractC4723b.m9608j(bArrM16425b, bArrM16425b2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* renamed from: h */
    public static byte[] m6581h(JSONObject jSONObject) {
        byte[] bArrM6579e = m6579e(AbstractC8947b.m16425b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrM6579e : AbstractC4723b.m9608j(bArrM6579e, m6579e(AbstractC8947b.m16425b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return Arrays.deepEquals(this.f14073a, ((a0) obj).f14073a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f14073a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        byte[][] bArr = this.f14073a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", m6578c(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(AbstractC8947b.m16426c(bArr[i10]), m6578c(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e2) {
            return AbstractC5601a.m11238i("PrfExtension{Exception:", e2.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        byte[][] bArr = this.f14073a;
        if (bArr != null) {
            int iM11783k2 = AbstractC5932m.m11783k(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            AbstractC5932m.m11784l(parcel, iM11783k2);
        }
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
