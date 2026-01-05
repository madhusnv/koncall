package ad;

import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.y9;
import sd.C6808b;
import zc.AbstractC8927d;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.p */
/* loaded from: classes.dex */
public final class C0109p {

    /* renamed from: i */
    public static final C0108o f374i = new C0108o();

    /* renamed from: a */
    public final C8935l f375a;

    /* renamed from: b */
    public final AbstractC8927d f376b;

    /* renamed from: c */
    public final int f377c;

    /* renamed from: d */
    public final C0118y f378d;

    /* renamed from: e */
    public final C0103j f379e;

    /* renamed from: f */
    public final C0119z f380f;

    /* renamed from: g */
    public final C6808b f381g;

    /* renamed from: h */
    public final String f382h;

    public C0109p(C8935l c8935l, AbstractC8927d abstractC8927d, int i10, C0118y c0118y, C0103j c0103j, C0119z c0119z, C6808b c6808b) {
        this.f375a = c8935l;
        this.f376b = abstractC8927d;
        this.f377c = i10;
        this.f378d = c0118y;
        this.f379e = c0103j;
        this.f380f = c0119z;
        this.f381g = c6808b;
        Objects.toString(abstractC8927d);
        int i11 = c8935l.f42912b;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Given port ", " is not in required range [1, 65535]").toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c8935l.f42911a);
        sb2.append("://");
        sb2.append(c0119z);
        sb2.append(y9.m11955b(abstractC8927d));
        if (i10 != c8935l.f42912b) {
            sb2.append(":");
            sb2.append(i10);
        }
        int length = sb2.length();
        sb2.append(c0118y);
        sb2.append(c0103j);
        if (c6808b != null) {
            sb2.append('#');
            sb2.append(c6808b.f32349b);
        }
        String string = sb2.toString();
        String strSubstring = string.substring(length);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        if (!AbstractC5185w.m10138t(strSubstring, "/", false)) {
            "/".concat(strSubstring);
        }
        this.f382h = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0109p.class != obj.getClass()) {
            return false;
        }
        C0109p c0109p = (C0109p) obj;
        return AbstractC4154l.m8918a(this.f375a, c0109p.f375a) && AbstractC4154l.m8918a(this.f376b, c0109p.f376b) && this.f377c == c0109p.f377c && AbstractC4154l.m8918a(this.f378d, c0109p.f378d) && AbstractC4154l.m8918a(this.f379e, c0109p.f379e) && AbstractC4154l.m8918a(this.f380f, c0109p.f380f) && AbstractC4154l.m8918a(this.f381g, c0109p.f381g);
    }

    public final int hashCode() {
        int iHashCode = (this.f380f.hashCode() + ((this.f379e.hashCode() + ((this.f378d.hashCode() + ((((this.f376b.hashCode() + (this.f375a.hashCode() * 31)) * 31) + this.f377c) * 31)) * 31)) * 31)) * 31;
        C6808b c6808b = this.f381g;
        return iHashCode + (c6808b != null ? c6808b.hashCode() : 0);
    }

    public final String toString() {
        return this.f382h;
    }
}
