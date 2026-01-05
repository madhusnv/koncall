package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rc4 extends ob8 implements qc4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc4(qc4... qc4VarArr) {
        super((nb8[]) Arrays.copyOf(qc4VarArr, qc4VarArr.length));
        sq8.m48649h(qc4VarArr, "providers");
    }

    @Override // p001o.ob8, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return super.resolve(qx0Var, n64Var);
    }

    public String toString() {
        return gp0.r0(m41911a(), " -> ", null, null, 0, null, null, 62, null);
    }
}
