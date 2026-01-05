package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class ea4 extends t94 {

    /* renamed from: d */
    public static final C13137a f21249d = new C13137a(null);

    /* renamed from: o.ea4$a */
    public static final class C13137a {
        public C13137a() {
        }

        public /* synthetic */ C13137a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ea4 m24655a(Bundle bundle) {
            sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return new ea4(bundle, null);
        }
    }

    public /* synthetic */ ea4(Bundle bundle, id5 id5Var) {
        this(bundle);
    }

    public ea4(Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
    }
}
