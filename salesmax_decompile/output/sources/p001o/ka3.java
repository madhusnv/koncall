package p001o;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;

/* loaded from: classes2.dex */
public abstract class ka3 {

    /* renamed from: a */
    public static final C14755a f31725a = new C14755a(null);

    /* renamed from: o.ka3$a */
    public static final class C14755a {
        public C14755a() {
        }

        public /* synthetic */ C14755a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final m2e m35220a(ClearCredentialStateRequest clearCredentialStateRequest) {
            sq8.m48649h(clearCredentialStateRequest, "request");
            String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
            sq8.m48648g(packageName, "request.callingAppInfo.packageName");
            SigningInfo signingInfo = clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
            sq8.m48648g(signingInfo, "request.callingAppInfo.signingInfo");
            return new m2e(new k32(packageName, signingInfo, clearCredentialStateRequest.getCallingAppInfo().getOrigin()));
        }
    }
}
