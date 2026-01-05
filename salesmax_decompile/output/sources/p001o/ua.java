package p001o;

import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ua implements Serializable {

    /* renamed from: c */
    public static final C17343a f48625c = new C17343a(null);

    /* renamed from: a */
    public final String f48626a;

    /* renamed from: b */
    public final String f48627b;

    /* renamed from: o.ua$a */
    public static final class C17343a {
        public C17343a() {
        }

        public /* synthetic */ C17343a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.ua$b */
    public static final class C17344b implements Serializable {

        /* renamed from: c */
        public static final a f48628c = new a(null);

        /* renamed from: a */
        public final String f48629a;

        /* renamed from: b */
        public final String f48630b;

        /* renamed from: o.ua$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C17344b(String str, String str2) {
            sq8.m48649h(str2, RemoteConfigConstants.RequestFieldKey.APP_ID);
            this.f48629a = str;
            this.f48630b = str2;
        }

        private final Object readResolve() {
            return new ua(this.f48629a, this.f48630b);
        }
    }

    public ua(String str, String str2) {
        sq8.m48649h(str2, "applicationId");
        this.f48626a = str2;
        this.f48627b = cri.d0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C17344b(this.f48627b, this.f48626a);
    }

    /* renamed from: a */
    public final String m51265a() {
        return this.f48627b;
    }

    /* renamed from: b */
    public final String m51266b() {
        return this.f48626a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return cri.m21660e(uaVar.f48627b, this.f48627b) && cri.m21660e(uaVar.f48626a, this.f48626a);
    }

    public int hashCode() {
        String str = this.f48627b;
        return (str != null ? str.hashCode() : 0) ^ this.f48626a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ua(AccessToken accessToken) {
        this(accessToken.m12760l(), C10773c.m13020m());
        sq8.m48649h(accessToken, "accessToken");
    }
}
