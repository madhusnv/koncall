package p001o;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class ak7 {

    /* renamed from: a */
    public static final C12212a f14898a = new C12212a(null);

    /* renamed from: o.ak7$a */
    public static final class C12212a {
        public C12212a() {
        }

        public /* synthetic */ C12212a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Bundle m17329a(s94 s94Var, Context context) {
            sq8.m48649h(s94Var, "request");
            sq8.m48649h(context, "context");
            Bundle bundleM48033b = s94Var.m48033b();
            Bundle bundleM48038a = s94Var.m48034c().m48038a();
            bundleM48038a.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, s94Var instanceof ha4 ? p7e.ic_passkey : p7e.ic_other_sign_in));
            bundleM48033b.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundleM48038a);
            return bundleM48033b;
        }
    }
}
