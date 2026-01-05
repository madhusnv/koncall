package p001o;

import java.util.List;
import p001o.p9g;
import p001o.uef;

/* loaded from: classes6.dex */
public abstract class wra implements uef {

    /* renamed from: a */
    public final String f52595a;

    /* renamed from: b */
    public final uef f52596b;

    /* renamed from: c */
    public final uef f52597c;

    /* renamed from: d */
    public final int f52598d;

    public /* synthetic */ wra(String str, uef uefVar, uef uefVar2, id5 id5Var) {
        this(str, uefVar, uefVar2);
    }

    @Override // p001o.uef
    /* renamed from: b */
    public boolean mo16760b() {
        return uef.C17369a.m51455c(this);
    }

    @Override // p001o.uef
    /* renamed from: c */
    public int mo16761c(String str) {
        sq8.m48649h(str, "name");
        Integer numM22638l = d9g.m22638l(str);
        if (numM22638l != null) {
            return numM22638l.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return this.f52598d;
    }

    @Override // p001o.uef
    /* renamed from: e */
    public String mo16763e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wra)) {
            return false;
        }
        wra wraVar = (wra) obj;
        return sq8.m48644c(mo16766h(), wraVar.mo16766h()) && sq8.m48644c(this.f52596b, wraVar.f52596b) && sq8.m48644c(this.f52597c, wraVar.f52597c);
    }

    @Override // p001o.uef
    /* renamed from: f */
    public List mo16764f(int i) {
        if (i >= 0) {
            return ch3.m21246k();
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo16766h() + " expects only non-negative indices").toString());
    }

    @Override // p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.f52596b;
            }
            if (i2 == 1) {
                return this.f52597c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo16766h() + " expects only non-negative indices").toString());
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return uef.C17369a.m51453a(this);
    }

    @Override // p001o.uef
    public bff getKind() {
        return p9g.C16039c.f39683a;
    }

    @Override // p001o.uef
    /* renamed from: h */
    public String mo16766h() {
        return this.f52595a;
    }

    public int hashCode() {
        return (((mo16766h().hashCode() * 31) + this.f52596b.hashCode()) * 31) + this.f52597c.hashCode();
    }

    @Override // p001o.uef
    /* renamed from: i */
    public boolean mo16767i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo16766h() + " expects only non-negative indices").toString());
    }

    @Override // p001o.uef
    public boolean isInline() {
        return uef.C17369a.m51454b(this);
    }

    public String toString() {
        return mo16766h() + '(' + this.f52596b + ", " + this.f52597c + ')';
    }

    public wra(String str, uef uefVar, uef uefVar2) {
        this.f52595a = str;
        this.f52596b = uefVar;
        this.f52597c = uefVar2;
        this.f52598d = 2;
    }
}
