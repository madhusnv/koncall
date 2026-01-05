package tj;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tj.b */
/* loaded from: classes.dex */
public final class C7166b {

    /* renamed from: a */
    public final String f34420a;

    /* renamed from: b */
    public final long f34421b;

    /* renamed from: c */
    public final EnumC7170f f34422c;

    public C7166b(String str, long j6, EnumC7170f enumC7170f) {
        this.f34420a = str;
        this.f34421b = j6;
        this.f34422c = enumC7170f;
    }

    public final boolean equals(Object obj) {
        EnumC7170f enumC7170f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7166b) {
            C7166b c7166b = (C7166b) obj;
            EnumC7170f enumC7170f2 = c7166b.f34422c;
            String str = c7166b.f34420a;
            String str2 = this.f34420a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f34421b == c7166b.f34421b && ((enumC7170f = this.f34422c) != null ? enumC7170f.equals(enumC7170f2) : enumC7170f2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f34420a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f34421b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        EnumC7170f enumC7170f = this.f34422c;
        return (enumC7170f != null ? enumC7170f.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f34420a + ", tokenExpirationTimestamp=" + this.f34421b + ", responseCode=" + this.f34422c + "}";
    }
}
