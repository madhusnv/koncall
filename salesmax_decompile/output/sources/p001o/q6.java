package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class q6 implements ao0 {

    /* renamed from: a */
    public final Object f41333a;

    /* renamed from: b */
    public final List f41334b = new ArrayList();

    /* renamed from: c */
    public Object f41335c;

    public q6(Object obj) {
        this.f41333a = obj;
        this.f41335c = obj;
    }

    @Override // p001o.ao0
    public final void clear() {
        this.f41334b.clear();
        m44833l(this.f41333a);
        mo44832k();
    }

    @Override // p001o.ao0
    /* renamed from: f */
    public void mo17552f(Object obj) {
        this.f41334b.add(m44830i());
        m44833l(obj);
    }

    @Override // p001o.ao0
    /* renamed from: h */
    public void mo17554h() {
        if (!(!this.f41334b.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m44833l(this.f41334b.remove(r0.size() - 1));
    }

    /* renamed from: i */
    public Object m44830i() {
        return this.f41335c;
    }

    /* renamed from: j */
    public final Object m44831j() {
        return this.f41333a;
    }

    /* renamed from: k */
    public abstract void mo44832k();

    /* renamed from: l */
    public void m44833l(Object obj) {
        this.f41335c = obj;
    }
}
