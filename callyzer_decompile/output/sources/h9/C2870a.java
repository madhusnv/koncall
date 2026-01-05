package h9;

import a2.AbstractC0030c;
import a9.C0073l;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h9.a */
/* loaded from: classes.dex */
public final class C2870a {

    /* renamed from: a */
    public final String f15878a;

    /* renamed from: b */
    public final String f15879b;

    /* renamed from: c */
    public final String f15880c;

    /* renamed from: d */
    public final String f15881d;

    /* renamed from: e */
    public final String f15882e;

    public C2870a(C0073l c0073l) {
        String str = (String) c0073l.f264a;
        AbstractC4154l.m8920c(str);
        String str2 = (String) c0073l.f265b;
        AbstractC4154l.m8920c(str2);
        String str3 = (String) c0073l.f266c;
        String str4 = (String) c0073l.f267d;
        String str5 = (String) c0073l.f268e;
        AbstractC4154l.m8920c(str5);
        this.f15878a = str;
        this.f15879b = str2;
        this.f15880c = str3;
        this.f15881d = str4;
        this.f15882e = str5;
        if (str3 != null && AbstractC5178p.m10101L(str3)) {
            throw new IllegalArgumentException("ARN region must not be blank");
        }
        if (str4 != null && AbstractC5178p.m10101L(str4)) {
            throw new IllegalArgumentException("ARN accountId must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2870a)) {
            return false;
        }
        C2870a c2870a = (C2870a) obj;
        if (AbstractC4154l.m8918a(this.f15878a, c2870a.f15878a) && AbstractC4154l.m8918a(this.f15879b, c2870a.f15879b) && AbstractC4154l.m8918a(this.f15880c, c2870a.f15880c) && AbstractC4154l.m8918a(this.f15881d, c2870a.f15881d)) {
            return AbstractC4154l.m8918a(this.f15882e, c2870a.f15882e);
        }
        return false;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.f15878a.hashCode() * 31, 31, this.f15879b);
        String str = this.f15880c;
        int iHashCode = (iM113d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15881d;
        return this.f15882e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("arn:" + this.f15878a + ':' + this.f15879b + ':');
        String str = this.f15880c;
        if (str != null) {
            sb2.append(str);
        }
        sb2.append(":");
        String str2 = this.f15881d;
        if (str2 != null) {
            sb2.append(str2);
        }
        sb2.append(":" + this.f15882e);
        return sb2.toString();
    }
}
