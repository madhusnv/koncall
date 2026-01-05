package i9;

import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4419s;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17171a;

    /* renamed from: b */
    public final /* synthetic */ String f17172b;

    public /* synthetic */ g0(String str, int i10) {
        this.f17171a = i10;
        this.f17172b = str;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17171a) {
            case 0:
                return i0.m0.m7378k("failed to write refreshed token back to disk at ", this.f17172b);
            case 1:
                return UserContextDataProvider.getEncodedContextData$lambda$0(this.f17172b);
            case 2:
                String uriPattern = this.f17172b;
                AbstractC4154l.m8923f(uriPattern, "uriPattern");
                return new C4419s(uriPattern, null, null);
            case 3:
                return i0.m0.m7378k("Validating checksum before deserialization from ", this.f17172b);
            case 4:
                return i0.m0.m7378k("Validating checksum after deserialization from ", this.f17172b);
            case 5:
                return i0.m0.m7378k("HttpRequest:\n", this.f17172b);
            case 6:
                return i0.m0.m7378k("HttpResponse:\n", this.f17172b);
            case 7:
                return i0.m0.m7378k("Chunk trailer string to sign:\n", this.f17172b);
            case 8:
                return i0.m0.m7378k("Calculated chunk signature: ", this.f17172b);
            case 9:
                return i0.m0.m7378k("String to sign:\n", this.f17172b);
            case 10:
                return i0.m0.m7378k("Calculated signature: ", this.f17172b);
            case 11:
                return i0.m0.m7378k("Chunk string to sign:\n", this.f17172b);
            case 12:
                return i0.m0.m7378k("Calculated chunk signature: ", this.f17172b);
            default:
                return AbstractC5601a.m11238i("Service returned malformed \"Date\" header value \"", this.f17172b, "\", skipping skew calculation");
        }
    }
}
