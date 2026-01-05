package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class za4 {

    /* renamed from: c */
    public static final C18598a f56830c = new C18598a(null);

    /* renamed from: a */
    public final String f56831a;

    /* renamed from: b */
    public final Bundle f56832b;

    /* renamed from: o.za4$a */
    public static final class C18598a {
        public C18598a() {
        }

        public /* synthetic */ C18598a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final za4 m59080a(String str, Bundle bundle) throws yj7 {
            sq8.m48649h(str, "type");
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                if (sq8.m48644c(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return nzc.f37477f.m41323a(bundle);
                }
                if (sq8.m48644c(str, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return e3e.f20934e.m24257a(bundle);
                }
                throw new yj7();
            } catch (yj7 unused) {
                return new sd4(str, bundle);
            }
        }
    }

    public za4(String str, Bundle bundle) {
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f56831a = str;
        this.f56832b = bundle;
    }
}
