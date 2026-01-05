package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class t94 {

    /* renamed from: c */
    public static final C17033a f46654c = new C17033a(null);

    /* renamed from: a */
    public final String f46655a;

    /* renamed from: b */
    public final Bundle f46656b;

    /* renamed from: o.t94$a */
    public static final class C17033a {
        public C17033a() {
        }

        public /* synthetic */ C17033a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final t94 m49575a(String str, Bundle bundle) throws yj7 {
            sq8.m48649h(str, "type");
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            try {
                if (sq8.m48644c(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return ea4.f21249d.m24655a(bundle);
                }
                if (sq8.m48644c(str, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return ia4.f28321e.m31787a(bundle);
                }
                throw new yj7();
            } catch (yj7 unused) {
                return new w94(str, bundle);
            }
        }
    }

    public t94(String str, Bundle bundle) {
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f46655a = str;
        this.f46656b = bundle;
    }
}
