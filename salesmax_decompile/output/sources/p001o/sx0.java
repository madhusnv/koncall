package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class sx0 implements tob {

    /* renamed from: a */
    public final Map f46059a;

    public sx0(qx0 qx0Var) {
        sq8.m48649h(qx0Var, "seed");
        this.f46059a = new LinkedHashMap();
        tx0.m50739d(this, qx0Var);
    }

    @Override // p001o.qx0
    /* renamed from: a */
    public Set mo18190a() {
        return this.f46059a.keySet();
    }

    @Override // p001o.qx0
    /* renamed from: b */
    public Object mo18191b(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return this.f46059a.get(kx0Var);
    }

    @Override // p001o.qx0
    /* renamed from: c */
    public boolean mo18192c(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return this.f46059a.containsKey(kx0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qx0)) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        if (mo18190a().size() != qx0Var.mo18190a().size()) {
            return false;
        }
        Set<kx0> setMo18190a = mo18190a();
        if ((setMo18190a instanceof Collection) && setMo18190a.isEmpty()) {
            return true;
        }
        for (kx0 kx0Var : setMo18190a) {
            if (mo18192c(kx0Var)) {
                sq8.m48647f(kx0Var, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.collections.AttributeKey<kotlin.Any>");
                z = sq8.m48644c(mo18191b(kx0Var), qx0Var.mo18191b(kx0Var));
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f46059a.hashCode();
    }

    @Override // p001o.qx0
    public boolean isEmpty() {
        return this.f46059a.isEmpty();
    }

    @Override // p001o.tob
    /* renamed from: p */
    public void mo34002p(kx0 kx0Var, Object obj) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        this.f46059a.put(kx0Var, obj);
    }

    @Override // p001o.tob
    /* renamed from: q */
    public void mo34003q(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        this.f46059a.remove(kx0Var);
    }

    @Override // p001o.tob
    /* renamed from: r */
    public Object mo34004r(kx0 kx0Var, uk7 uk7Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(uk7Var, "block");
        Object objMo18191b = mo18191b(kx0Var);
        if (objMo18191b != null) {
            return objMo18191b;
        }
        Object objInvoke = uk7Var.invoke();
        this.f46059a.put(kx0Var, objInvoke);
        return objInvoke;
    }

    public String toString() {
        return this.f46059a.toString();
    }

    public sx0() {
        this(tx0.m50736a());
    }
}
