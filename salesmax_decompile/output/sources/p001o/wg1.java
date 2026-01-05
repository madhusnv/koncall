package p001o;

import android.os.Bundle;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes2.dex */
public class wg1 extends ng1 {

    /* renamed from: e */
    public static final C17843a f51929e = new C17843a(null);

    /* renamed from: o.wg1$a */
    public static final class C17843a {
        public C17843a() {
        }

        public /* synthetic */ C17843a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(String str, String str2, Bundle bundle) {
        super(str, str2, bundle);
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "type");
        sq8.m48649h(bundle, "candidateQueryData");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("id should not be empty".toString());
        }
        if (!(str2.length() > 0)) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
