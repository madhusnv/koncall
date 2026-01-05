package p001o;

import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public final class c85 {

    /* renamed from: a */
    public final String f17496a;

    /* renamed from: b */
    public final C2181a f17497b;

    /* renamed from: c */
    public final C2181a f17498c;

    /* renamed from: d */
    public final int f17499d;

    /* renamed from: e */
    public final int f17500e;

    public c85(String str, C2181a c2181a, C2181a c2181a2, int i, int i2) {
        op0.m42511a(i == 0 || i2 == 0);
        this.f17496a = op0.m42514d(str);
        this.f17497b = (C2181a) op0.m42515e(c2181a);
        this.f17498c = (C2181a) op0.m42515e(c2181a2);
        this.f17499d = i;
        this.f17500e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c85.class != obj.getClass()) {
            return false;
        }
        c85 c85Var = (c85) obj;
        return this.f17499d == c85Var.f17499d && this.f17500e == c85Var.f17500e && this.f17496a.equals(c85Var.f17496a) && this.f17497b.equals(c85Var.f17497b) && this.f17498c.equals(c85Var.f17498c);
    }

    public int hashCode() {
        return ((((((((527 + this.f17499d) * 31) + this.f17500e) * 31) + this.f17496a.hashCode()) * 31) + this.f17497b.hashCode()) * 31) + this.f17498c.hashCode();
    }
}
