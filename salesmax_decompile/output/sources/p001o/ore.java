package p001o;

/* loaded from: classes2.dex */
public class ore extends mf7 {

    /* renamed from: b */
    public final u92 f38796b;

    /* renamed from: c */
    public boolean f38797c;

    /* renamed from: d */
    public boolean f38798d;

    /* renamed from: e */
    public final u82 f38799e;

    public ore(u92 u92Var, u82 u82Var) {
        super(u92Var);
        this.f38797c = false;
        this.f38798d = false;
        this.f38796b = u92Var;
        this.f38799e = u82Var;
        u82Var.m51202u(null);
        m42602n(u82Var.m51197K());
        m42601m(u82Var.m51199R());
    }

    @Override // p001o.mf7, p001o.u92
    /* renamed from: h */
    public u92 mo38921h() {
        return this.f38796b;
    }

    /* renamed from: l */
    public u82 m42600l() {
        return this.f38799e;
    }

    /* renamed from: m */
    public void m42601m(boolean z) {
        this.f38798d = z;
    }

    /* renamed from: n */
    public void m42602n(boolean z) {
        this.f38797c = z;
    }
}
