package xe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.h */
/* loaded from: classes.dex */
public final class C8356h {

    /* renamed from: a */
    public final String f39988a;

    /* renamed from: b */
    public final Integer f39989b;

    /* renamed from: c */
    public final C8360l f39990c;

    /* renamed from: d */
    public final long f39991d;

    /* renamed from: e */
    public final long f39992e;

    /* renamed from: f */
    public final Map f39993f;

    /* renamed from: g */
    public final Integer f39994g;

    /* renamed from: h */
    public final String f39995h;

    /* renamed from: i */
    public final byte[] f39996i;

    /* renamed from: j */
    public final byte[] f39997j;

    public C8356h(String str, Integer num, C8360l c8360l, long j6, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f39988a = str;
        this.f39989b = num;
        this.f39990c = c8360l;
        this.f39991d = j6;
        this.f39992e = j10;
        this.f39993f = map;
        this.f39994g = num2;
        this.f39995h = str2;
        this.f39996i = bArr;
        this.f39997j = bArr2;
    }

    /* renamed from: a */
    public final String m15529a(String str) {
        String str2 = (String) this.f39993f.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public final int m15530b(String str) {
        String str2 = (String) this.f39993f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: c */
    public final C6739h m15531c() {
        C6739h c6739h = new C6739h();
        String str = this.f39988a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c6739h.f32180a = str;
        c6739h.f32181b = this.f39989b;
        c6739h.f32186g = this.f39994g;
        c6739h.f32187h = this.f39995h;
        c6739h.f32188i = this.f39996i;
        c6739h.f32189j = this.f39997j;
        C8360l c8360l = this.f39990c;
        if (c8360l == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c6739h.f32182c = c8360l;
        c6739h.f32183d = Long.valueOf(this.f39991d);
        c6739h.f32184e = Long.valueOf(this.f39992e);
        c6739h.f32185f = new HashMap(this.f39993f);
        return c6739h;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8356h) {
            C8356h c8356h = (C8356h) obj;
            String str2 = c8356h.f39995h;
            Integer num3 = c8356h.f39994g;
            Integer num4 = c8356h.f39989b;
            if (this.f39988a.equals(c8356h.f39988a) && ((num = this.f39989b) != null ? num.equals(num4) : num4 == null) && this.f39990c.equals(c8356h.f39990c) && this.f39991d == c8356h.f39991d && this.f39992e == c8356h.f39992e && this.f39993f.equals(c8356h.f39993f) && ((num2 = this.f39994g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f39995h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f39996i, c8356h.f39996i) && Arrays.equals(this.f39997j, c8356h.f39997j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f39988a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f39989b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f39990c.hashCode()) * 1000003;
        long j6 = this.f39991d;
        int i10 = (iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f39992e;
        int iHashCode3 = (((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f39993f.hashCode()) * 1000003;
        Integer num2 = this.f39994g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f39995h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f39996i)) * 1000003) ^ Arrays.hashCode(this.f39997j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f39988a + ", code=" + this.f39989b + ", encodedPayload=" + this.f39990c + ", eventMillis=" + this.f39991d + ", uptimeMillis=" + this.f39992e + ", autoMetadata=" + this.f39993f + ", productId=" + this.f39994g + ", pseudonymousId=" + this.f39995h + ", experimentIdsClear=" + Arrays.toString(this.f39996i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f39997j) + "}";
    }
}
