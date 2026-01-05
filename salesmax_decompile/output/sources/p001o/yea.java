package p001o;

import java.util.List;
import p001o.p9g;
import p001o.uef;

/* loaded from: classes6.dex */
public abstract class yea implements uef {

    /* renamed from: a */
    public final uef f55357a;

    /* renamed from: b */
    public final int f55358b;

    public /* synthetic */ yea(uef uefVar, id5 id5Var) {
        this(uefVar);
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
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // p001o.uef
    /* renamed from: d */
    public int mo16762d() {
        return this.f55358b;
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
        if (!(obj instanceof yea)) {
            return false;
        }
        yea yeaVar = (yea) obj;
        return sq8.m48644c(this.f55357a, yeaVar.f55357a) && sq8.m48644c(mo16766h(), yeaVar.mo16766h());
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
            return this.f55357a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo16766h() + " expects only non-negative indices").toString());
    }

    @Override // p001o.uef
    public List getAnnotations() {
        return uef.C17369a.m51453a(this);
    }

    @Override // p001o.uef
    public bff getKind() {
        return p9g.C16038b.f39682a;
    }

    public int hashCode() {
        return (this.f55357a.hashCode() * 31) + mo16766h().hashCode();
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
        return mo16766h() + '(' + this.f55357a + ')';
    }

    public yea(uef uefVar) {
        this.f55357a = uefVar;
        this.f55358b = 1;
    }
}
