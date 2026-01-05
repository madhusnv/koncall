package p001o;

import android.content.pm.SigningInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes2.dex */
public final class k32 {

    /* renamed from: d */
    public static final C14707a f31404d = new C14707a(null);

    /* renamed from: a */
    public final String f31405a;

    /* renamed from: b */
    public final SigningInfo f31406b;

    /* renamed from: c */
    public final String f31407c;

    /* renamed from: o.k32$a */
    public static final class C14707a {
        public C14707a() {
        }

        public /* synthetic */ C14707a(id5 id5Var) {
            this();
        }
    }

    public k32(String str, SigningInfo signingInfo, String str2) {
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        sq8.m48649h(signingInfo, "signingInfo");
        this.f31405a = str;
        this.f31406b = signingInfo;
        this.f31407c = str2;
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("packageName must not be empty".toString());
        }
    }
}
