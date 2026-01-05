package p001o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class gc1 {

    /* renamed from: c */
    public final InterfaceC13672d f24894c;

    /* renamed from: e */
    public qma f24896e;

    /* renamed from: a */
    public final List f24892a = new ArrayList(1);

    /* renamed from: b */
    public boolean f24893b = false;

    /* renamed from: d */
    public float f24895d = 0.0f;

    /* renamed from: f */
    public Object f24897f = null;

    /* renamed from: g */
    public float f24898g = -1.0f;

    /* renamed from: h */
    public float f24899h = -1.0f;

    /* renamed from: o.gc1$b */
    public interface InterfaceC13670b {
        /* renamed from: a */
        void mo19333a();
    }

    /* renamed from: o.gc1$c */
    public static final class C13671c implements InterfaceC13672d {
        public C13671c() {
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: a */
        public boolean mo28381a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: b */
        public sd9 mo28382b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: c */
        public boolean mo28383c(float f) {
            return false;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: d */
        public float mo28384d() {
            return 0.0f;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: e */
        public float mo28385e() {
            return 1.0f;
        }

        @Override // p001o.gc1.InterfaceC13672d
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: o.gc1$d */
    public interface InterfaceC13672d {
        /* renamed from: a */
        boolean mo28381a(float f);

        /* renamed from: b */
        sd9 mo28382b();

        /* renamed from: c */
        boolean mo28383c(float f);

        /* renamed from: d */
        float mo28384d();

        /* renamed from: e */
        float mo28385e();

        boolean isEmpty();
    }

    /* renamed from: o.gc1$e */
    public static final class C13673e implements InterfaceC13672d {

        /* renamed from: a */
        public final List f24900a;

        /* renamed from: c */
        public sd9 f24902c = null;

        /* renamed from: d */
        public float f24903d = -1.0f;

        /* renamed from: b */
        public sd9 f24901b = m28386f(0.0f);

        public C13673e(List list) {
            this.f24900a = list;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: a */
        public boolean mo28381a(float f) {
            sd9 sd9Var = this.f24902c;
            sd9 sd9Var2 = this.f24901b;
            if (sd9Var == sd9Var2 && this.f24903d == f) {
                return true;
            }
            this.f24902c = sd9Var2;
            this.f24903d = f;
            return false;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: b */
        public sd9 mo28382b() {
            return this.f24901b;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: c */
        public boolean mo28383c(float f) {
            if (this.f24901b.m48220a(f)) {
                return !this.f24901b.m48227h();
            }
            this.f24901b = m28386f(f);
            return true;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: d */
        public float mo28384d() {
            return ((sd9) this.f24900a.get(0)).m48224e();
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: e */
        public float mo28385e() {
            return ((sd9) this.f24900a.get(r0.size() - 1)).m48221b();
        }

        /* renamed from: f */
        public final sd9 m28386f(float f) {
            List list = this.f24900a;
            sd9 sd9Var = (sd9) list.get(list.size() - 1);
            if (f >= sd9Var.m48224e()) {
                return sd9Var;
            }
            for (int size = this.f24900a.size() - 2; size >= 1; size--) {
                sd9 sd9Var2 = (sd9) this.f24900a.get(size);
                if (this.f24901b != sd9Var2 && sd9Var2.m48220a(f)) {
                    return sd9Var2;
                }
            }
            return (sd9) this.f24900a.get(0);
        }

        @Override // p001o.gc1.InterfaceC13672d
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: o.gc1$f */
    public static final class C13674f implements InterfaceC13672d {

        /* renamed from: a */
        public final sd9 f24904a;

        /* renamed from: b */
        public float f24905b = -1.0f;

        public C13674f(List list) {
            this.f24904a = (sd9) list.get(0);
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: a */
        public boolean mo28381a(float f) {
            if (this.f24905b == f) {
                return true;
            }
            this.f24905b = f;
            return false;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: b */
        public sd9 mo28382b() {
            return this.f24904a;
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: c */
        public boolean mo28383c(float f) {
            return !this.f24904a.m48227h();
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: d */
        public float mo28384d() {
            return this.f24904a.m48224e();
        }

        @Override // p001o.gc1.InterfaceC13672d
        /* renamed from: e */
        public float mo28385e() {
            return this.f24904a.m48221b();
        }

        @Override // p001o.gc1.InterfaceC13672d
        public boolean isEmpty() {
            return false;
        }
    }

    public gc1(List list) {
        this.f24894c = m28368o(list);
    }

    /* renamed from: o */
    public static InterfaceC13672d m28368o(List list) {
        return list.isEmpty() ? new C13671c() : list.size() == 1 ? new C13674f(list) : new C13673e(list);
    }

    /* renamed from: a */
    public void m28369a(InterfaceC13670b interfaceC13670b) {
        this.f24892a.add(interfaceC13670b);
    }

    /* renamed from: b */
    public sd9 m28370b() {
        ve9.m52656a("BaseKeyframeAnimation#getCurrentKeyframe");
        sd9 sd9VarMo28382b = this.f24894c.mo28382b();
        ve9.m52657b("BaseKeyframeAnimation#getCurrentKeyframe");
        return sd9VarMo28382b;
    }

    /* renamed from: c */
    public float mo28371c() {
        if (this.f24899h == -1.0f) {
            this.f24899h = this.f24894c.mo28385e();
        }
        return this.f24899h;
    }

    /* renamed from: d */
    public float m28372d() {
        sd9 sd9VarM28370b = m28370b();
        if (sd9VarM28370b.m48227h()) {
            return 0.0f;
        }
        return sd9VarM28370b.f45245d.getInterpolation(m28373e());
    }

    /* renamed from: e */
    public float m28373e() {
        if (this.f24893b) {
            return 0.0f;
        }
        sd9 sd9VarM28370b = m28370b();
        if (sd9VarM28370b.m48227h()) {
            return 0.0f;
        }
        return (this.f24895d - sd9VarM28370b.m48224e()) / (sd9VarM28370b.m48221b() - sd9VarM28370b.m48224e());
    }

    /* renamed from: f */
    public float m28374f() {
        return this.f24895d;
    }

    /* renamed from: g */
    public final float m28375g() {
        if (this.f24898g == -1.0f) {
            this.f24898g = this.f24894c.mo28384d();
        }
        return this.f24898g;
    }

    /* renamed from: h */
    public Object mo28376h() {
        float fM28373e = m28373e();
        if (this.f24896e == null && this.f24894c.mo28381a(fM28373e)) {
            return this.f24897f;
        }
        sd9 sd9VarM28370b = m28370b();
        Interpolator interpolator = sd9VarM28370b.f45246e;
        Object objMo20015i = (interpolator == null || sd9VarM28370b.f45247f == null) ? mo20015i(sd9VarM28370b, m28372d()) : mo26455j(sd9VarM28370b, fM28373e, interpolator.getInterpolation(fM28373e), sd9VarM28370b.f45247f.getInterpolation(fM28373e));
        this.f24897f = objMo20015i;
        return objMo20015i;
    }

    /* renamed from: i */
    public abstract Object mo20015i(sd9 sd9Var, float f);

    /* renamed from: j */
    public Object mo26455j(sd9 sd9Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo28377k() {
        for (int i = 0; i < this.f24892a.size(); i++) {
            ((InterfaceC13670b) this.f24892a.get(i)).mo19333a();
        }
    }

    /* renamed from: l */
    public void m28378l() {
        this.f24893b = true;
    }

    /* renamed from: m */
    public void mo28379m(float f) {
        if (this.f24894c.isEmpty()) {
            return;
        }
        if (f < m28375g()) {
            f = m28375g();
        } else if (f > mo28371c()) {
            f = mo28371c();
        }
        if (f == this.f24895d) {
            return;
        }
        this.f24895d = f;
        if (this.f24894c.mo28383c(f)) {
            mo28377k();
        }
    }

    /* renamed from: n */
    public void m28380n(qma qmaVar) {
        qma qmaVar2 = this.f24896e;
        if (qmaVar2 != null) {
            qmaVar2.m45655c(null);
        }
        this.f24896e = qmaVar;
        if (qmaVar != null) {
            qmaVar.m45655c(this);
        }
    }
}
