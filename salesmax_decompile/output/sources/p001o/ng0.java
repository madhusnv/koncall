package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class ng0 implements tg0 {

    /* renamed from: a */
    public final fg0 f36803a;

    /* renamed from: b */
    public final fg0 f36804b;

    public ng0(fg0 fg0Var, fg0 fg0Var2) {
        this.f36803a = fg0Var;
        this.f36804b = fg0Var2;
    }

    @Override // p001o.tg0
    /* renamed from: a */
    public gc1 mo24960a() {
        return new w0g(this.f36803a.mo24960a(), this.f36804b.mo24960a());
    }

    @Override // p001o.tg0
    /* renamed from: b */
    public List mo24961b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p001o.tg0
    /* renamed from: c */
    public boolean mo24962c() {
        return this.f36803a.mo24962c() && this.f36804b.mo24962c();
    }
}
