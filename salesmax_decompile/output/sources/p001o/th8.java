package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.ez5;

/* loaded from: classes3.dex */
public abstract class th8 {

    /* renamed from: a */
    public uh8 f47131a;

    /* renamed from: b */
    public final List f47132b = new ArrayList();

    public th8(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f47132b.add(new ez5.C13289a());
        }
    }

    /* renamed from: a */
    public abstract void mo43471a();

    /* renamed from: b */
    public float m49881b(int i, int i2, int i3) {
        return pza.m44555a((i - i2) / i3, 0.0f, 1.0f);
    }

    /* renamed from: c */
    public abstract void mo43472c();

    /* renamed from: d */
    public abstract void mo43473d(dg0 dg0Var);

    /* renamed from: e */
    public void m49882e(uh8 uh8Var) {
        this.f47131a = uh8Var;
    }

    /* renamed from: f */
    public abstract void mo43474f();

    /* renamed from: g */
    public abstract void mo43475g();

    /* renamed from: h */
    public abstract void mo43476h();
}
