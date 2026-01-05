package p001o;

import com.google.android.gms.common.Scopes;

/* loaded from: classes2.dex */
public final class r71 {

    /* renamed from: a */
    public final String f43101a;

    /* renamed from: b */
    public final String f43102b;

    /* renamed from: c */
    public final String f43103c;

    public r71(String str, String str2, String str3) {
        sq8.m48649h(str, Scopes.PROFILE);
        sq8.m48649h(str2, "configPath");
        sq8.m48649h(str3, "credentialsPath");
        this.f43101a = str;
        this.f43102b = str2;
        this.f43103c = str3;
    }

    /* renamed from: a */
    public final String m46303a() {
        return this.f43102b;
    }

    /* renamed from: b */
    public final String m46304b() {
        return this.f43103c;
    }

    /* renamed from: c */
    public final String m46305c() {
        return this.f43101a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r71)) {
            return false;
        }
        r71 r71Var = (r71) obj;
        return sq8.m48644c(this.f43101a, r71Var.f43101a) && sq8.m48644c(this.f43102b, r71Var.f43102b) && sq8.m48644c(this.f43103c, r71Var.f43103c);
    }

    public int hashCode() {
        return (((this.f43101a.hashCode() * 31) + this.f43102b.hashCode()) * 31) + this.f43103c.hashCode();
    }

    public String toString() {
        return "AwsConfigurationSource(profile=" + this.f43101a + ", configPath=" + this.f43102b + ", credentialsPath=" + this.f43103c + ')';
    }
}
