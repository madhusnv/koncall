package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class ig0 implements tg0 {

    /* renamed from: a */
    public final List f28625a;

    public ig0(List list) {
        this.f28625a = list;
    }

    @Override // p001o.tg0
    /* renamed from: a */
    public gc1 mo24960a() {
        return ((sd9) this.f28625a.get(0)).m48227h() ? new fcd(this.f28625a) : new c0d(this.f28625a);
    }

    @Override // p001o.tg0
    /* renamed from: b */
    public List mo24961b() {
        return this.f28625a;
    }

    @Override // p001o.tg0
    /* renamed from: c */
    public boolean mo24962c() {
        return this.f28625a.size() == 1 && ((sd9) this.f28625a.get(0)).m48227h();
    }
}
