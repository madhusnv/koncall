package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class xg1 extends ng1 {

    /* renamed from: f */
    public static final C18148a f53718f = new C18148a(null);

    /* renamed from: e */
    public final Set f53719e;

    /* renamed from: o.xg1$a */
    public static final class C18148a {
        public C18148a() {
        }

        public /* synthetic */ C18148a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xg1 m56230a(Bundle bundle, String str) {
            Set setM40664e;
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
            if (stringArrayList == null || (setM40664e = kh3.V0(stringArrayList)) == null) {
                setM40664e = nif.m40664e();
            }
            return new xg1(setM40664e, bundle, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg1(Set set, Bundle bundle, String str) {
        super(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        sq8.m48649h(set, "allowedUserIds");
        sq8.m48649h(bundle, "candidateQueryData");
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.f53719e = set;
    }
}
