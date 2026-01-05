package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class szf {

    /* renamed from: e */
    public static final kth f46163e;

    /* renamed from: f */
    public static final szf f46164f;

    /* renamed from: a */
    public final bth f46165a;

    /* renamed from: b */
    public final tzf f46166b;

    /* renamed from: c */
    public final cth f46167c;

    /* renamed from: d */
    public final kth f46168d;

    static {
        kth kthVarM36234b = kth.m36230b().m36234b();
        f46163e = kthVarM36234b;
        f46164f = new szf(bth.f16816c, tzf.f48121b, cth.f18634b, kthVarM36234b);
    }

    public szf(bth bthVar, tzf tzfVar, cth cthVar, kth kthVar) {
        this.f46165a = bthVar;
        this.f46166b = tzfVar;
        this.f46167c = cthVar;
        this.f46168d = kthVar;
    }

    /* renamed from: a */
    public tzf m49106a() {
        return this.f46166b;
    }

    /* renamed from: b */
    public bth m49107b() {
        return this.f46165a;
    }

    /* renamed from: c */
    public cth m49108c() {
        return this.f46167c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof szf)) {
            return false;
        }
        szf szfVar = (szf) obj;
        return this.f46165a.equals(szfVar.f46165a) && this.f46166b.equals(szfVar.f46166b) && this.f46167c.equals(szfVar.f46167c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46165a, this.f46166b, this.f46167c});
    }

    public String toString() {
        return "SpanContext{traceId=" + this.f46165a + ", spanId=" + this.f46166b + ", traceOptions=" + this.f46167c + "}";
    }
}
