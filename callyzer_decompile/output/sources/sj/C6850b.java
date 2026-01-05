package sj;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sj.b */
/* loaded from: classes.dex */
public final class C6850b {

    /* renamed from: h */
    public static final /* synthetic */ int f32521h = 0;

    /* renamed from: a */
    public final String f32522a;

    /* renamed from: b */
    public final EnumC6852d f32523b;

    /* renamed from: c */
    public final String f32524c;

    /* renamed from: d */
    public final String f32525d;

    /* renamed from: e */
    public final long f32526e;

    /* renamed from: f */
    public final long f32527f;

    /* renamed from: g */
    public final String f32528g;

    static {
        C6849a c6849a = new C6849a();
        c6849a.f32518f = 0L;
        c6849a.f32520h = (byte) (c6849a.f32520h | 2);
        c6849a.m13048b(EnumC6852d.ATTEMPT_MIGRATION);
        c6849a.f32517e = 0L;
        c6849a.f32520h = (byte) (c6849a.f32520h | 1);
        c6849a.m13047a();
    }

    public C6850b(String str, EnumC6852d enumC6852d, String str2, String str3, long j6, long j10, String str4) {
        this.f32522a = str;
        this.f32523b = enumC6852d;
        this.f32524c = str2;
        this.f32525d = str3;
        this.f32526e = j6;
        this.f32527f = j10;
        this.f32528g = str4;
    }

    /* renamed from: a */
    public final C6849a m13049a() {
        C6849a c6849a = new C6849a();
        c6849a.f32513a = this.f32522a;
        c6849a.f32514b = this.f32523b;
        c6849a.f32515c = this.f32524c;
        c6849a.f32516d = this.f32525d;
        c6849a.f32517e = this.f32526e;
        c6849a.f32518f = this.f32527f;
        c6849a.f32519g = this.f32528g;
        c6849a.f32520h = (byte) 3;
        return c6849a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6850b) {
            C6850b c6850b = (C6850b) obj;
            String str4 = c6850b.f32528g;
            String str5 = c6850b.f32525d;
            String str6 = c6850b.f32524c;
            String str7 = c6850b.f32522a;
            String str8 = this.f32522a;
            if (str8 != null ? str8.equals(str7) : str7 == null) {
                if (this.f32523b.equals(c6850b.f32523b) && ((str = this.f32524c) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f32525d) != null ? str2.equals(str5) : str5 == null) && this.f32526e == c6850b.f32526e && this.f32527f == c6850b.f32527f && ((str3 = this.f32528g) != null ? str3.equals(str4) : str4 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f32522a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f32523b.hashCode()) * 1000003;
        String str2 = this.f32524c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f32525d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f32526e;
        int i10 = (iHashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f32527f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f32528g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f32522a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f32523b);
        sb2.append(", authToken=");
        sb2.append(this.f32524c);
        sb2.append(", refreshToken=");
        sb2.append(this.f32525d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f32526e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f32527f);
        sb2.append(", fisError=");
        return AbstractC1452a.m4564k(sb2, this.f32528g, "}");
    }
}
