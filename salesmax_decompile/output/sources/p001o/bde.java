package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public final class bde implements y38 {

    /* renamed from: a */
    public final o38 f15974a;

    /* renamed from: b */
    public final l8i f15975b;

    /* renamed from: c */
    public final ux7 f15976c;

    /* renamed from: d */
    public final m18 f15977d;

    /* renamed from: e */
    public final ek5 f15978e;

    public bde(o38 o38Var, l8i l8iVar, ux7 ux7Var, m18 m18Var, ek5 ek5Var) {
        sq8.m48649h(o38Var, FirebaseAnalytics.Param.METHOD);
        sq8.m48649h(l8iVar, ImagesContract.URL);
        sq8.m48649h(ux7Var, "headers");
        sq8.m48649h(m18Var, "body");
        sq8.m48649h(ek5Var, "trailingHeaders");
        this.f15974a = o38Var;
        this.f15975b = l8iVar;
        this.f15976c = ux7Var;
        this.f15977d = m18Var;
        this.f15978e = ek5Var;
    }

    /* renamed from: a */
    public ek5 m18665a() {
        return this.f15978e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bde)) {
            return false;
        }
        bde bdeVar = (bde) obj;
        return this.f15974a == bdeVar.f15974a && sq8.m48644c(this.f15975b, bdeVar.f15975b) && sq8.m48644c(this.f15976c, bdeVar.f15976c) && sq8.m48644c(this.f15977d, bdeVar.f15977d) && sq8.m48644c(this.f15978e, bdeVar.f15978e);
    }

    @Override // p001o.y38
    public m18 getBody() {
        return this.f15977d;
    }

    @Override // p001o.y38
    public ux7 getHeaders() {
        return this.f15976c;
    }

    @Override // p001o.y38
    public o38 getMethod() {
        return this.f15974a;
    }

    @Override // p001o.y38
    public l8i getUrl() {
        return this.f15975b;
    }

    public int hashCode() {
        return (((((((this.f15974a.hashCode() * 31) + this.f15975b.hashCode()) * 31) + this.f15976c.hashCode()) * 31) + this.f15977d.hashCode()) * 31) + this.f15978e.hashCode();
    }

    public String toString() {
        return "RealHttpRequest(method=" + this.f15974a + ", url=" + this.f15975b + ", headers=" + this.f15976c + ", body=" + this.f15977d + ", trailingHeaders=" + this.f15978e + ')';
    }
}
