package p001o;

import java.io.Serializable;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public class cg5 implements ugd, Serializable {

    /* renamed from: h */
    public static final rff f18129h = new rff(" ");

    /* renamed from: a */
    public InterfaceC12678b f18130a;

    /* renamed from: b */
    public InterfaceC12678b f18131b;

    /* renamed from: c */
    public final eff f18132c;

    /* renamed from: d */
    public boolean f18133d;

    /* renamed from: e */
    public transient int f18134e;

    /* renamed from: f */
    public hef f18135f;

    /* renamed from: g */
    public String f18136g;

    /* renamed from: o.cg5$a */
    public static class C12677a extends C12679c {

        /* renamed from: b */
        public static final C12677a f18137b = new C12677a();

        @Override // p001o.cg5.C12679c, p001o.cg5.InterfaceC12678b
        /* renamed from: a */
        public void mo21182a(b99 b99Var, int i) {
            b99Var.mo18442O(TokenParser.SP);
        }

        @Override // p001o.cg5.C12679c, p001o.cg5.InterfaceC12678b
        public boolean isInline() {
            return true;
        }
    }

    /* renamed from: o.cg5$b */
    public interface InterfaceC12678b {
        /* renamed from: a */
        void mo21182a(b99 b99Var, int i);

        boolean isInline();
    }

    /* renamed from: o.cg5$c */
    public static class C12679c implements InterfaceC12678b, Serializable {

        /* renamed from: a */
        public static final C12679c f18138a = new C12679c();

        @Override // p001o.cg5.InterfaceC12678b
        /* renamed from: a */
        public void mo21182a(b99 b99Var, int i) {
        }

        @Override // p001o.cg5.InterfaceC12678b
        public boolean isInline() {
            return true;
        }
    }

    public cg5() {
        this(f18129h);
    }

    @Override // p001o.ugd
    /* renamed from: a */
    public void mo21171a(b99 b99Var) {
        eff effVar = this.f18132c;
        if (effVar != null) {
            b99Var.mo18444S(effVar);
        }
    }

    @Override // p001o.ugd
    /* renamed from: b */
    public void mo21172b(b99 b99Var, int i) {
        if (!this.f18131b.isInline()) {
            this.f18134e--;
        }
        if (i > 0) {
            this.f18131b.mo21182a(b99Var, this.f18134e);
        } else {
            b99Var.mo18442O(TokenParser.SP);
        }
        b99Var.mo18442O('}');
    }

    @Override // p001o.ugd
    /* renamed from: c */
    public void mo21173c(b99 b99Var) {
        this.f18131b.mo21182a(b99Var, this.f18134e);
    }

    @Override // p001o.ugd
    /* renamed from: d */
    public void mo21174d(b99 b99Var) {
        b99Var.mo18442O(this.f18135f.m30312b());
        this.f18130a.mo21182a(b99Var, this.f18134e);
    }

    @Override // p001o.ugd
    /* renamed from: e */
    public void mo21175e(b99 b99Var) {
        b99Var.mo18442O('{');
        if (this.f18131b.isInline()) {
            return;
        }
        this.f18134e++;
    }

    @Override // p001o.ugd
    /* renamed from: f */
    public void mo21176f(b99 b99Var, int i) {
        if (!this.f18130a.isInline()) {
            this.f18134e--;
        }
        if (i > 0) {
            this.f18130a.mo21182a(b99Var, this.f18134e);
        } else {
            b99Var.mo18442O(TokenParser.SP);
        }
        b99Var.mo18442O(']');
    }

    @Override // p001o.ugd
    /* renamed from: g */
    public void mo21177g(b99 b99Var) {
        if (this.f18133d) {
            b99Var.mo18443Q(this.f18136g);
        } else {
            b99Var.mo18442O(this.f18135f.m30314d());
        }
    }

    @Override // p001o.ugd
    /* renamed from: h */
    public void mo21178h(b99 b99Var) {
        if (!this.f18130a.isInline()) {
            this.f18134e++;
        }
        b99Var.mo18442O('[');
    }

    @Override // p001o.ugd
    /* renamed from: i */
    public void mo21179i(b99 b99Var) {
        b99Var.mo18442O(this.f18135f.m30313c());
        this.f18131b.mo21182a(b99Var, this.f18134e);
    }

    @Override // p001o.ugd
    /* renamed from: j */
    public void mo21180j(b99 b99Var) {
        this.f18130a.mo21182a(b99Var, this.f18134e);
    }

    /* renamed from: k */
    public cg5 m21181k(hef hefVar) {
        this.f18135f = hefVar;
        this.f18136g = " " + hefVar.m30314d() + " ";
        return this;
    }

    public cg5(eff effVar) {
        this.f18130a = C12677a.f18137b;
        this.f18131b = re5.f43434f;
        this.f18133d = true;
        this.f18132c = effVar;
        m21181k(ugd.f48910S);
    }
}
