package p001o;

import android.os.Bundle;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes2.dex */
public abstract class ng1 {

    /* renamed from: d */
    public static final C15578a f36805d = new C15578a(null);

    /* renamed from: a */
    public final String f36806a;

    /* renamed from: b */
    public final String f36807b;

    /* renamed from: c */
    public final Bundle f36808c;

    /* renamed from: o.ng1$a */
    public static final class C15578a {
        public C15578a() {
        }

        public /* synthetic */ C15578a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ng1 m40527a(String str, String str2, Bundle bundle) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(str2, "type");
            sq8.m48649h(bundle, "candidateQueryData");
            return sq8.m48644c(str2, "android.credentials.TYPE_PASSWORD_CREDENTIAL") ? xg1.f53718f.m56230a(bundle, str) : sq8.m48644c(str2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") ? yg1.f55476g.m57771a(bundle, str) : new wg1(str, str2, bundle);
        }
    }

    public ng1(String str, String str2, Bundle bundle) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "type");
        sq8.m48649h(bundle, "candidateQueryData");
        this.f36806a = str;
        this.f36807b = str2;
        this.f36808c = bundle;
    }
}
