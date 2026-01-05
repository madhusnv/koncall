package p001o;

import java.util.Arrays;
import p001o.wia;

/* loaded from: classes5.dex */
public final class w41 extends wia {

    /* renamed from: a */
    public final long f51390a;

    /* renamed from: b */
    public final Integer f51391b;

    /* renamed from: c */
    public final long f51392c;

    /* renamed from: d */
    public final byte[] f51393d;

    /* renamed from: e */
    public final String f51394e;

    /* renamed from: f */
    public final long f51395f;

    /* renamed from: g */
    public final ltb f51396g;

    /* renamed from: o.w41$b */
    public static final class C17772b extends wia.AbstractC17920a {

        /* renamed from: a */
        public Long f51397a;

        /* renamed from: b */
        public Integer f51398b;

        /* renamed from: c */
        public Long f51399c;

        /* renamed from: d */
        public byte[] f51400d;

        /* renamed from: e */
        public String f51401e;

        /* renamed from: f */
        public Long f51402f;

        /* renamed from: g */
        public ltb f51403g;

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: a */
        public wia mo53861a() {
            String str = "";
            if (this.f51397a == null) {
                str = " eventTimeMs";
            }
            if (this.f51399c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f51402f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new w41(this.f51397a.longValue(), this.f51398b, this.f51399c.longValue(), this.f51400d, this.f51401e, this.f51402f.longValue(), this.f51403g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: b */
        public wia.AbstractC17920a mo53862b(Integer num) {
            this.f51398b = num;
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: c */
        public wia.AbstractC17920a mo53863c(long j) {
            this.f51397a = Long.valueOf(j);
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: d */
        public wia.AbstractC17920a mo53864d(long j) {
            this.f51399c = Long.valueOf(j);
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: e */
        public wia.AbstractC17920a mo53865e(ltb ltbVar) {
            this.f51403g = ltbVar;
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: f */
        public wia.AbstractC17920a mo53866f(byte[] bArr) {
            this.f51400d = bArr;
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: g */
        public wia.AbstractC17920a mo53867g(String str) {
            this.f51401e = str;
            return this;
        }

        @Override // p001o.wia.AbstractC17920a
        /* renamed from: h */
        public wia.AbstractC17920a mo53868h(long j) {
            this.f51402f = Long.valueOf(j);
            return this;
        }
    }

    @Override // p001o.wia
    /* renamed from: b */
    public Integer mo53854b() {
        return this.f51391b;
    }

    @Override // p001o.wia
    /* renamed from: c */
    public long mo53855c() {
        return this.f51390a;
    }

    @Override // p001o.wia
    /* renamed from: d */
    public long mo53856d() {
        return this.f51392c;
    }

    @Override // p001o.wia
    /* renamed from: e */
    public ltb mo53857e() {
        return this.f51396g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wia)) {
            return false;
        }
        wia wiaVar = (wia) obj;
        if (this.f51390a == wiaVar.mo53855c() && ((num = this.f51391b) != null ? num.equals(wiaVar.mo53854b()) : wiaVar.mo53854b() == null) && this.f51392c == wiaVar.mo53856d()) {
            if (Arrays.equals(this.f51393d, wiaVar instanceof w41 ? ((w41) wiaVar).f51393d : wiaVar.mo53858f()) && ((str = this.f51394e) != null ? str.equals(wiaVar.mo53859g()) : wiaVar.mo53859g() == null) && this.f51395f == wiaVar.mo53860h()) {
                ltb ltbVar = this.f51396g;
                if (ltbVar == null) {
                    if (wiaVar.mo53857e() == null) {
                        return true;
                    }
                } else if (ltbVar.equals(wiaVar.mo53857e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p001o.wia
    /* renamed from: f */
    public byte[] mo53858f() {
        return this.f51393d;
    }

    @Override // p001o.wia
    /* renamed from: g */
    public String mo53859g() {
        return this.f51394e;
    }

    @Override // p001o.wia
    /* renamed from: h */
    public long mo53860h() {
        return this.f51395f;
    }

    public int hashCode() {
        long j = this.f51390a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f51391b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f51392c;
        int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f51393d)) * 1000003;
        String str = this.f51394e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f51395f;
        int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ltb ltbVar = this.f51396g;
        return i2 ^ (ltbVar != null ? ltbVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f51390a + ", eventCode=" + this.f51391b + ", eventUptimeMs=" + this.f51392c + ", sourceExtension=" + Arrays.toString(this.f51393d) + ", sourceExtensionJsonProto3=" + this.f51394e + ", timezoneOffsetSeconds=" + this.f51395f + ", networkConnectionInfo=" + this.f51396g + "}";
    }

    public w41(long j, Integer num, long j2, byte[] bArr, String str, long j3, ltb ltbVar) {
        this.f51390a = j;
        this.f51391b = num;
        this.f51392c = j2;
        this.f51393d = bArr;
        this.f51394e = str;
        this.f51395f = j3;
        this.f51396g = ltbVar;
    }
}
