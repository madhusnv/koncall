package we;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.s */
/* loaded from: classes.dex */
public final class C8017s extends e0 {

    /* renamed from: a */
    public final long f38523a;

    /* renamed from: b */
    public final Integer f38524b;

    /* renamed from: c */
    public final a0 f38525c;

    /* renamed from: d */
    public final long f38526d;

    /* renamed from: e */
    public final byte[] f38527e;

    /* renamed from: f */
    public final String f38528f;

    /* renamed from: g */
    public final long f38529g;

    /* renamed from: h */
    public final i0 f38530h;

    /* renamed from: i */
    public final b0 f38531i;

    public C8017s(long j6, Integer num, a0 a0Var, long j10, byte[] bArr, String str, long j11, i0 i0Var, b0 b0Var) {
        this.f38523a = j6;
        this.f38524b = num;
        this.f38525c = a0Var;
        this.f38526d = j10;
        this.f38527e = bArr;
        this.f38528f = str;
        this.f38529g = j11;
        this.f38530h = i0Var;
        this.f38531i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            C8017s c8017s = (C8017s) e0Var;
            b0 b0Var2 = c8017s.f38531i;
            i0 i0Var2 = c8017s.f38530h;
            String str2 = c8017s.f38528f;
            a0 a0Var2 = c8017s.f38525c;
            Integer num2 = c8017s.f38524b;
            if (this.f38523a == c8017s.f38523a && ((num = this.f38524b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f38525c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f38526d == c8017s.f38526d) {
                if (Arrays.equals(this.f38527e, e0Var instanceof C8017s ? ((C8017s) e0Var).f38527e : c8017s.f38527e) && ((str = this.f38528f) != null ? str.equals(str2) : str2 == null) && this.f38529g == c8017s.f38529g && ((i0Var = this.f38530h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f38531i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38523a;
        int i10 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f38524b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f38525c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j10 = this.f38526d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f38527e)) * 1000003;
        String str = this.f38528f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f38529g;
        int i11 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        i0 i0Var = this.f38530h;
        int iHashCode5 = (i11 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f38531i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f38523a + ", eventCode=" + this.f38524b + ", complianceData=" + this.f38525c + ", eventUptimeMs=" + this.f38526d + ", sourceExtension=" + Arrays.toString(this.f38527e) + ", sourceExtensionJsonProto3=" + this.f38528f + ", timezoneOffsetSeconds=" + this.f38529g + ", networkConnectionInfo=" + this.f38530h + ", experimentIds=" + this.f38531i + "}";
    }
}
