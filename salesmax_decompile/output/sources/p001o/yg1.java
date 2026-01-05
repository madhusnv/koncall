package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes2.dex */
public final class yg1 extends ng1 {

    /* renamed from: g */
    public static final C18401a f55476g = new C18401a(null);

    /* renamed from: e */
    public final String f55477e;

    /* renamed from: f */
    public final byte[] f55478f;

    /* renamed from: o.yg1$a */
    public static final class C18401a {
        public C18401a() {
        }

        public /* synthetic */ C18401a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yg1 m57771a(Bundle bundle, String str) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                sq8.m48646e(string);
                return new yg1(bundle, str, string, byteArray);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg1(Bundle bundle, String str, String str2, byte[] bArr) {
        super(str, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        sq8.m48649h(bundle, "candidateQueryData");
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "requestJson");
        this.f55477e = str2;
        this.f55478f = bArr;
        if (!yme.f55707a.m58001a(str2)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }
}
