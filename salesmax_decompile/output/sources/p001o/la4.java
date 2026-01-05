package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import p001o.l8i;
import p001o.m48;

/* loaded from: classes3.dex */
public final class la4 implements m48.InterfaceC15219a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @Override // p001o.m48.InterfaceC15219a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z38 mo16700b(jl6 jl6Var, ma4 ma4Var) {
        boolean z;
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(ma4Var, "input");
        z38 z38Var = new z38();
        z38Var.m58673j(o38.GET);
        l8i.C15036a c15036aM58671h = z38Var.m58671h();
        boolean z2 = true;
        c15036aM58671h.m36767h().m48017n(true);
        c15036aM58671h.m36766g().m20280o().mo20265E(OutcomeEventsTable.COLUMN_NAME_SESSION, "");
        xx7 xx7VarM58668e = z38Var.m58668e();
        if (ma4Var.m38615b() != null) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-bucket-key-enabled", ma4Var.m38615b().toString());
        }
        String strM38618e = ma4Var.m38618e();
        if (strM38618e == null) {
            z = false;
        } else {
            if (strM38618e.length() > 0) {
                z = true;
            }
        }
        if (z) {
            xx7VarM58668e.m59796c("x-amz-server-side-encryption-context", ma4Var.m38618e());
        }
        String strM38619f = ma4Var.m38619f();
        if (strM38619f == null) {
            z2 = false;
        } else {
            if (!(strM38619f.length() > 0)) {
            }
        }
        if (z2) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID, ma4Var.m38619f());
        }
        if (ma4Var.m38616c() != null) {
            xx7VarM58668e.m59796c(ObjectMetadata.SERVER_SIDE_ENCRYPTION, ma4Var.m38616c().mo23074a());
        }
        ma4Var.m38617d();
        return z38Var;
    }
}
