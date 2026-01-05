package ma;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ma.c */
/* loaded from: classes.dex */
public final class C4684c {

    /* renamed from: a */
    public final String f23151a;

    /* renamed from: b */
    public final String f23152b;

    /* renamed from: c */
    public final String f23153c;

    /* renamed from: d */
    public final Boolean f23154d;

    /* renamed from: e */
    public final Boolean f23155e;

    /* renamed from: f */
    public final String f23156f;

    public /* synthetic */ C4684c() {
        this(null, null, null, null, null, null);
    }

    /* renamed from: a */
    public final String m9577a() {
        return this.f23152b;
    }

    /* renamed from: b */
    public final String m9578b() {
        return this.f23151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4684c)) {
            return false;
        }
        C4684c c4684c = (C4684c) obj;
        return AbstractC4154l.m8918a(this.f23151a, c4684c.f23151a) && AbstractC4154l.m8918a(this.f23152b, c4684c.f23152b) && AbstractC4154l.m8918a(this.f23153c, c4684c.f23153c) && AbstractC4154l.m8918a(this.f23154d, c4684c.f23154d) && AbstractC4154l.m8918a(this.f23155e, c4684c.f23155e) && AbstractC4154l.m8918a(this.f23156f, c4684c.f23156f);
    }

    public final int hashCode() {
        String str = this.f23151a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23152b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23153c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f23154d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f23155e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f23156f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PartitionConfig(name=");
        sb2.append(this.f23151a);
        sb2.append(", dnsSuffix=");
        sb2.append(this.f23152b);
        sb2.append(", dualStackDnsSuffix=");
        sb2.append(this.f23153c);
        sb2.append(", supportsFIPS=");
        sb2.append(this.f23154d);
        sb2.append(", supportsDualStack=");
        sb2.append(this.f23155e);
        sb2.append(", implicitGlobalRegion=");
        return AbstractC0030c.m123n(sb2, this.f23156f, ')');
    }

    public C4684c(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4) {
        this.f23151a = str;
        this.f23152b = str2;
        this.f23153c = str3;
        this.f23154d = bool;
        this.f23155e = bool2;
        this.f23156f = str4;
    }
}
