package p001o;

/* loaded from: classes6.dex */
public class f6f extends h7 implements k84 {

    /* renamed from: d */
    public final n64 f22801d;

    public f6f(q74 q74Var, n64 n64Var) {
        super(q74Var, true, true);
        this.f22801d = n64Var;
    }

    @Override // p001o.h7
    public void S0(Object obj) {
        n64 n64Var = this.f22801d;
        n64Var.resumeWith(rm3.m46954a(obj, n64Var));
    }

    @Override // p001o.k84
    public final k84 getCallerFrame() {
        n64 n64Var = this.f22801d;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.d79
    public final boolean r0() {
        return true;
    }

    @Override // p001o.d79
    /* renamed from: z */
    public void mo17837z(Object obj) {
        zt5.m59877b(tq8.m50336c(this.f22801d), rm3.m46954a(obj, this.f22801d));
    }
}
