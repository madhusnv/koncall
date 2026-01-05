package p001o;

/* loaded from: classes2.dex */
public final class gm5 {

    /* renamed from: a */
    public final fm5 f25441a;

    /* renamed from: b */
    public final fm5 f25442b;

    public gm5(boolean z) {
        this.f25441a = new fm5(z);
        this.f25442b = new fm5(z);
    }

    /* renamed from: c */
    public final void m29035c(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "node");
        if (z) {
            this.f25441a.m27036a(zh9Var);
        } else {
            if (this.f25441a.m27037b(zh9Var)) {
                return;
            }
            this.f25442b.m27036a(zh9Var);
        }
    }

    /* renamed from: d */
    public final boolean m29036d(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        return this.f25441a.m27037b(zh9Var) || this.f25442b.m27037b(zh9Var);
    }

    /* renamed from: e */
    public final boolean m29037e(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "node");
        boolean zM27037b = this.f25441a.m27037b(zh9Var);
        return z ? zM27037b : zM27037b || this.f25442b.m27037b(zh9Var);
    }

    /* renamed from: f */
    public final boolean m29038f() {
        return this.f25442b.m27039d() && this.f25441a.m27039d();
    }

    /* renamed from: g */
    public final boolean m29039g() {
        return !m29038f();
    }

    /* renamed from: h */
    public final boolean m29040h(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        return this.f25442b.m27041f(zh9Var) || this.f25441a.m27041f(zh9Var);
    }

    /* renamed from: i */
    public final boolean m29041i(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "node");
        return z ? this.f25441a.m27041f(zh9Var) : this.f25442b.m27041f(zh9Var);
    }
}
