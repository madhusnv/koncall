package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class nzc extends za4 {

    /* renamed from: f */
    public static final C15685a f37477f = new C15685a(null);

    /* renamed from: d */
    public final String f37478d;

    /* renamed from: e */
    public final String f37479e;

    /* renamed from: o.nzc$a */
    public static final class C15685a {
        public C15685a() {
        }

        public /* synthetic */ C15685a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final nzc m41323a(Bundle bundle) throws yj7 {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                sq8.m48646e(string);
                sq8.m48646e(string2);
                return new nzc(string, string2, bundle, null);
            } catch (Exception unused) {
                throw new yj7();
            }
        }
    }

    public /* synthetic */ nzc(String str, String str2, Bundle bundle, id5 id5Var) {
        this(str, str2, bundle);
    }

    public nzc(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f37478d = str;
        this.f37479e = str2;
        if (!(str2.length() > 0)) {
            throw new IllegalArgumentException("password should not be empty".toString());
        }
    }
}
