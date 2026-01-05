package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class bl3 extends xk3 {

    /* renamed from: a */
    public final idg f16472a;

    public bl3(idg idgVar) {
        this.f16472a = idgVar;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        try {
            Object obj = this.f16472a.get();
            Objects.requireNonNull(obj, "The completableSupplier returned a null CompletableSource");
            ((ql3) obj).mo45628a(ml3Var);
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, ml3Var);
        }
    }
}
