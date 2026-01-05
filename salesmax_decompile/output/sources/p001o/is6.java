package p001o;

import com.facebook.FacebookRequestError;

/* loaded from: classes5.dex */
public final class is6 extends ur6 {

    /* renamed from: c */
    public static final C14362a f29190c = new C14362a(null);

    /* renamed from: b */
    public final FacebookRequestError f29191b;

    /* renamed from: o.is6$a */
    public static final class C14362a {
        public C14362a() {
        }

        public /* synthetic */ C14362a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is6(FacebookRequestError facebookRequestError, String str) {
        super(str);
        sq8.m48649h(facebookRequestError, "requestError");
        this.f29191b = facebookRequestError;
    }

    /* renamed from: c */
    public final FacebookRequestError m32672c() {
        return this.f29191b;
    }

    @Override // p001o.ur6, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f29191b.m12824f() + ", facebookErrorCode: " + this.f29191b.m12820b() + ", facebookErrorType: " + this.f29191b.m12822d() + ", message: " + this.f29191b.m12821c() + "}";
        sq8.m48648g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
