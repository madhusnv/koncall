package p001o;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes3.dex */
public abstract class xz0 {
    /* renamed from: a */
    public static final vz0 m56984a(String str, qx0 qx0Var) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(qx0Var, "attributes");
        return new wz0(str, qx0Var, null);
    }

    /* renamed from: b */
    public static /* synthetic */ vz0 m56985b(String str, qx0 qx0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qx0Var = tx0.m50736a();
        }
        return m56984a(str, qx0Var);
    }
}
