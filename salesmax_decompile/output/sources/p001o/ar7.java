package p001o;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ar7 extends eb4 {

    /* renamed from: k */
    public static final C12236a f15154k = new C12236a(null);

    /* renamed from: i */
    public final String f15155i;

    /* renamed from: j */
    public final byte[] f15156j;

    /* renamed from: o.ar7$a */
    public static final class C12236a {
        public C12236a() {
        }

        public /* synthetic */ C12236a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Bundle m17703a(String str, byte[] bArr) {
            sq8.m48649h(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }

    public /* synthetic */ ar7(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i, int i2, id5 id5Var) {
        this(str, bArr, set, bundle, bundle2, (i2 & 32) != 0 ? 100 : i);
    }

    public ar7(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set, i);
        this.f15155i = str;
        this.f15156j = bArr;
        if (!xme.f53935a.m56484a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON".toString());
        }
    }

    public /* synthetic */ ar7(String str, byte[] bArr, Set set, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? nif.m40664e() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ar7(String str, byte[] bArr, Set set) {
        sq8.m48649h(str, "requestJson");
        sq8.m48649h(set, "allowedProviders");
        C12236a c12236a = f15154k;
        this(str, bArr, set, c12236a.m17703a(str, bArr), c12236a.m17703a(str, bArr), 0, 32, null);
    }
}
