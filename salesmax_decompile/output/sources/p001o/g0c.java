package p001o;

import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes3.dex */
public final class g0c {

    /* renamed from: a */
    public final String f24330a;

    /* renamed from: b */
    public final Integer f24331b;

    public g0c(String str, Integer num) {
        sq8.m48649h(str, "hostMatch");
        this.f24330a = str;
        this.f24331b = num;
    }

    /* renamed from: a */
    public final boolean m27847a(l8i l8iVar) {
        sq8.m48649h(l8iVar, ImagesContract.URL);
        if (sq8.m48644c(this.f24330a, "*")) {
            return true;
        }
        if (this.f24331b != null) {
            int iM36758e = l8iVar.m36758e();
            Integer num = this.f24331b;
            if (num == null || iM36758e != num.intValue()) {
                return false;
            }
        }
        String string = l8iVar.m36755b().toString();
        if (e9g.m24605w(this.f24330a, "*", false, 2, null)) {
            return e9g.m24597K(string, f9g.v0(this.f24330a, "*"), false, 2, null);
        }
        if (e9g.m24597K(this.f24330a, "*", false, 2, null)) {
            return e9g.m24605w(string, f9g.u0(this.f24330a, "*"), false, 2, null);
        }
        if (this.f24330a.length() > string.length()) {
            return false;
        }
        boolean zM24605w = e9g.m24605w(string, this.f24330a, false, 2, null);
        int length = (string.length() - this.f24330a.length()) - 1;
        return zM24605w && (length < 0 || string.charAt(length) == '.');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0c)) {
            return false;
        }
        g0c g0cVar = (g0c) obj;
        return sq8.m48644c(this.f24330a, g0cVar.f24330a) && sq8.m48644c(this.f24331b, g0cVar.f24331b);
    }

    public int hashCode() {
        int iHashCode = this.f24330a.hashCode() * 31;
        Integer num = this.f24331b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "NonProxyHost(hostMatch=" + this.f24330a + ", port=" + this.f24331b + ')';
    }

    public /* synthetic */ g0c(String str, Integer num, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
