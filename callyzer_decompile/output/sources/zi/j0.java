package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends m2 {

    /* renamed from: a */
    public final String f43137a;

    /* renamed from: b */
    public final String f43138b;

    /* renamed from: c */
    public final String f43139c;

    /* renamed from: d */
    public final long f43140d;

    /* renamed from: e */
    public final Long f43141e;

    /* renamed from: f */
    public final boolean f43142f;

    /* renamed from: g */
    public final u1 f43143g;

    /* renamed from: h */
    public final l2 f43144h;

    /* renamed from: i */
    public final k2 f43145i;

    /* renamed from: j */
    public final v1 f43146j;

    /* renamed from: k */
    public final List f43147k;

    /* renamed from: l */
    public final int f43148l;

    public j0(String str, String str2, String str3, long j6, Long l9, boolean z6, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i10) {
        this.f43137a = str;
        this.f43138b = str2;
        this.f43139c = str3;
        this.f43140d = j6;
        this.f43141e = l9;
        this.f43142f = z6;
        this.f43143g = u1Var;
        this.f43144h = l2Var;
        this.f43145i = k2Var;
        this.f43146j = v1Var;
        this.f43147k = list;
        this.f43148l = i10;
    }

    @Override // zi.m2
    /* renamed from: a */
    public final i0 mo16450a() {
        i0 i0Var = new i0();
        i0Var.f43107a = this.f43137a;
        i0Var.f43108b = this.f43138b;
        i0Var.f43109c = this.f43139c;
        i0Var.f43110d = this.f43140d;
        i0Var.f43111e = this.f43141e;
        i0Var.f43112f = this.f43142f;
        i0Var.f43113g = this.f43143g;
        i0Var.f43114h = this.f43144h;
        i0Var.f43115i = this.f43145i;
        i0Var.f43116j = this.f43146j;
        i0Var.f43117k = this.f43147k;
        i0Var.f43118l = this.f43148l;
        i0Var.f43119m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l9;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.f43147k;
            v1 v1Var2 = j0Var.f43146j;
            k2 k2Var2 = j0Var.f43145i;
            l2 l2Var2 = j0Var.f43144h;
            Long l10 = j0Var.f43141e;
            String str2 = j0Var.f43139c;
            if (this.f43137a.equals(j0Var.f43137a) && this.f43138b.equals(j0Var.f43138b) && ((str = this.f43139c) != null ? str.equals(str2) : str2 == null) && this.f43140d == j0Var.f43140d && ((l9 = this.f43141e) != null ? l9.equals(l10) : l10 == null) && this.f43142f == j0Var.f43142f && this.f43143g.equals(j0Var.f43143g) && ((l2Var = this.f43144h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.f43145i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.f43146j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.f43147k) != null ? list.equals(list2) : list2 == null) && this.f43148l == j0Var.f43148l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f43137a.hashCode() ^ 1000003) * 1000003) ^ this.f43138b.hashCode()) * 1000003;
        String str = this.f43139c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j6 = this.f43140d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        Long l9 = this.f43141e;
        int iHashCode3 = (((((i10 ^ (l9 == null ? 0 : l9.hashCode())) * 1000003) ^ (this.f43142f ? 1231 : 1237)) * 1000003) ^ this.f43143g.hashCode()) * 1000003;
        l2 l2Var = this.f43144h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.f43145i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.f43146j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f43147k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f43148l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f43137a);
        sb2.append(", identifier=");
        sb2.append(this.f43138b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f43139c);
        sb2.append(", startedAt=");
        sb2.append(this.f43140d);
        sb2.append(", endedAt=");
        sb2.append(this.f43141e);
        sb2.append(", crashed=");
        sb2.append(this.f43142f);
        sb2.append(", app=");
        sb2.append(this.f43143g);
        sb2.append(", user=");
        sb2.append(this.f43144h);
        sb2.append(", os=");
        sb2.append(this.f43145i);
        sb2.append(", device=");
        sb2.append(this.f43146j);
        sb2.append(", events=");
        sb2.append(this.f43147k);
        sb2.append(", generatorType=");
        return AbstractC5601a.m11233d(this.f43148l, "}", sb2);
    }
}
