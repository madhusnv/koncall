package p001o;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class eb4 {

    /* renamed from: h */
    public static final C13140a f21283h = new C13140a(null);

    /* renamed from: a */
    public final String f21284a;

    /* renamed from: b */
    public final Bundle f21285b;

    /* renamed from: c */
    public final Bundle f21286c;

    /* renamed from: d */
    public final boolean f21287d;

    /* renamed from: e */
    public final boolean f21288e;

    /* renamed from: f */
    public final Set f21289f;

    /* renamed from: g */
    public final int f21290g;

    /* renamed from: o.eb4$a */
    public static final class C13140a {
        public C13140a() {
        }

        public /* synthetic */ C13140a(id5 id5Var) {
            this();
        }
    }

    public eb4(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i) {
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, "requestData");
        sq8.m48649h(bundle2, "candidateQueryData");
        sq8.m48649h(set, "allowedProviders");
        this.f21284a = str;
        this.f21285b = bundle;
        this.f21286c = bundle2;
        this.f21287d = z;
        this.f21288e = z2;
        this.f21289f = set;
        this.f21290g = i;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }

    /* renamed from: a */
    public final Set m24688a() {
        return this.f21289f;
    }

    /* renamed from: b */
    public final Bundle m24689b() {
        return this.f21286c;
    }

    /* renamed from: c */
    public final Bundle m24690c() {
        return this.f21285b;
    }

    /* renamed from: d */
    public final String m24691d() {
        return this.f21284a;
    }

    /* renamed from: e */
    public final boolean m24692e() {
        return this.f21287d;
    }
}
