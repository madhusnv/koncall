package p001o;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes5.dex */
public class dg6 implements ic9 {

    /* renamed from: b */
    public final Object f19777b;

    /* renamed from: c */
    public final int f19778c;

    /* renamed from: d */
    public final int f19779d;

    /* renamed from: e */
    public final Class f19780e;

    /* renamed from: f */
    public final Class f19781f;

    /* renamed from: g */
    public final ic9 f19782g;

    /* renamed from: h */
    public final Map f19783h;

    /* renamed from: i */
    public final rec f19784i;

    /* renamed from: j */
    public int f19785j;

    public dg6(Object obj, ic9 ic9Var, int i, int i2, Map map, Class cls, Class cls2, rec recVar) {
        this.f19777b = bgd.m18886d(obj);
        this.f19782g = (ic9) bgd.m18887e(ic9Var, "Signature must not be null");
        this.f19778c = i;
        this.f19779d = i2;
        this.f19783h = (Map) bgd.m18886d(map);
        this.f19780e = (Class) bgd.m18887e(cls, "Resource class must not be null");
        this.f19781f = (Class) bgd.m18887e(cls2, "Transcode class must not be null");
        this.f19784i = (rec) bgd.m18886d(recVar);
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (!(obj instanceof dg6)) {
            return false;
        }
        dg6 dg6Var = (dg6) obj;
        return this.f19777b.equals(dg6Var.f19777b) && this.f19782g.equals(dg6Var.f19782g) && this.f19779d == dg6Var.f19779d && this.f19778c == dg6Var.f19778c && this.f19783h.equals(dg6Var.f19783h) && this.f19780e.equals(dg6Var.f19780e) && this.f19781f.equals(dg6Var.f19781f) && this.f19784i.equals(dg6Var.f19784i);
    }

    @Override // p001o.ic9
    public int hashCode() {
        if (this.f19785j == 0) {
            int iHashCode = this.f19777b.hashCode();
            this.f19785j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f19782g.hashCode()) * 31) + this.f19778c) * 31) + this.f19779d;
            this.f19785j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f19783h.hashCode();
            this.f19785j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f19780e.hashCode();
            this.f19785j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f19781f.hashCode();
            this.f19785j = iHashCode5;
            this.f19785j = (iHashCode5 * 31) + this.f19784i.hashCode();
        }
        return this.f19785j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19777b + ", width=" + this.f19778c + ", height=" + this.f19779d + ", resourceClass=" + this.f19780e + ", transcodeClass=" + this.f19781f + ", signature=" + this.f19782g + ", hashCode=" + this.f19785j + ", transformations=" + this.f19783h + ", options=" + this.f19784i + '}';
    }
}
