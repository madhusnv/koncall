package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class lg1 extends bg1 {

    /* renamed from: e */
    public static final C15069a f33742e = new C15069a(null);

    /* renamed from: o.lg1$a */
    public static final class C15069a {
        public C15069a() {
        }

        public /* synthetic */ C15069a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final lg1 m37138a(Bundle bundle, k32 k32Var) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                return new lg1(k32Var, bundle);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(k32 k32Var, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, k32Var);
        sq8.m48649h(bundle, "candidateQueryData");
    }
}
