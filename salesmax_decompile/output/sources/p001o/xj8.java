package p001o;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C10773c;

/* loaded from: classes5.dex */
public final class xj8 extends ai4 {

    /* renamed from: c */
    public static final C18172a f53848c = new C18172a(null);

    /* renamed from: o.xj8$a */
    public static final class C18172a {
        public C18172a() {
        }

        public /* synthetic */ C18172a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Uri m56381a(String str, Bundle bundle) {
            sq8.m48649h(str, "action");
            if (sq8.m48644c(str, "oauth")) {
                return cri.m21662g(cgf.m21210k(), "oauth/authorize", bundle);
            }
            return cri.m21662g(cgf.m21210k(), C10773c.m13031x() + "/dialog/" + str, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj8(String str, Bundle bundle) {
        super(str, bundle);
        sq8.m48649h(str, "action");
        m17140b(f53848c.m56381a(str, bundle == null ? new Bundle() : bundle));
    }
}
