package p001o;

/* loaded from: classes2.dex */
public final class kwc {

    /* renamed from: a */
    public final long f32766a;

    /* renamed from: b */
    public final jhh f32767b;

    /* renamed from: c */
    public final int f32768c;

    /* renamed from: d */
    public final int f32769d;

    /* renamed from: e */
    public final int f32770e;

    public /* synthetic */ kwc(kgh kghVar, ugh ughVar, long j, jhh jhhVar, q9d q9dVar, mda mdaVar, kda kdaVar, d68 d68Var, iih iihVar, id5 id5Var) {
        this(kghVar, ughVar, j, jhhVar, q9dVar, mdaVar, kdaVar, d68Var, iihVar);
    }

    /* renamed from: a */
    public final long m36265a() {
        return this.f32766a;
    }

    /* renamed from: b */
    public final kgh m36266b() {
        return null;
    }

    /* renamed from: c */
    public final ugh m36267c() {
        return null;
    }

    /* renamed from: d */
    public final jhh m36268d() {
        return this.f32767b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc)) {
            return false;
        }
        kwc kwcVar = (kwc) obj;
        kwcVar.getClass();
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        kwcVar.getClass();
        if (!sq8.m48644c(null, null) || !bjh.m19254e(this.f32766a, kwcVar.f32766a) || !sq8.m48644c(this.f32767b, kwcVar.f32767b)) {
            return false;
        }
        kwcVar.getClass();
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        kwcVar.getClass();
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        kwcVar.getClass();
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        kwcVar.getClass();
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        kwcVar.getClass();
        return sq8.m48644c(null, null);
    }

    public int hashCode() {
        int iM19258i = (bjh.m19258i(this.f32766a) + 0) * 31;
        jhh jhhVar = this.f32767b;
        return ((((((((((iM19258i + (jhhVar != null ? jhhVar.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) null) + ", textDirection=" + ((Object) null) + ", lineHeight=" + ((Object) bjh.m19259j(this.f32766a)) + ", textIndent=" + this.f32767b + ", platformStyle=" + ((Object) null) + ", lineHeightStyle=" + ((Object) null) + ", lineBreak=" + ((Object) null) + ", hyphens=" + ((Object) null) + ", textMotion=" + ((Object) null) + ')';
    }

    public kwc(kgh kghVar, ugh ughVar, long j, jhh jhhVar, q9d q9dVar, mda mdaVar, kda kdaVar, d68 d68Var, iih iihVar) {
        this.f32766a = j;
        this.f32767b = jhhVar;
        this.f32768c = kgh.f32234a.m35700a();
        this.f32769d = kda.f31966a.m35446a();
        this.f32770e = d68.f19144a.m22363a();
        if (bjh.m19254e(j, bjh.f16444b.m19261a())) {
            return;
        }
        if (bjh.m19257h(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + bjh.m19257h(j) + ')').toString());
    }

    public /* synthetic */ kwc(kgh kghVar, ugh ughVar, long j, jhh jhhVar, q9d q9dVar, mda mdaVar, kda kdaVar, d68 d68Var, iih iihVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : kghVar, (i & 2) != 0 ? null : ughVar, (i & 4) != 0 ? bjh.f16444b.m19261a() : j, (i & 8) != 0 ? null : jhhVar, (i & 16) != 0 ? null : q9dVar, (i & 32) != 0 ? null : mdaVar, (i & 64) != 0 ? null : kdaVar, (i & 128) != 0 ? null : d68Var, (i & 256) == 0 ? iihVar : null, null);
    }
}
