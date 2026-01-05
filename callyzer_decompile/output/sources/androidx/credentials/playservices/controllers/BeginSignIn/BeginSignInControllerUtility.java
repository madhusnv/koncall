package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import h6.AbstractC2857m;
import h6.C2863s;
import h6.C2865u;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4450a;
import lf.C4451b;
import lf.C4452c;
import lf.C4453d;
import lf.C4454e;
import org.json.JSONException;
import sf.AbstractC6840z;
import zg.AbstractC8952a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final C4450a convertToGoogleIdTokenOption(AbstractC8952a abstractC8952a) {
            throw null;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            AbstractC4154l.m8922e(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j6) {
            return j6 < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        /* renamed from: constructBeginSignInRequest$credentials_play_services_auth_release */
        public final C4454e m781x545fe152(C2863s request, Context context) throws JSONException {
            AbstractC4154l.m8923f(request, "request");
            AbstractC4154l.m8923f(context, "context");
            boolean z6 = false;
            C4453d c4453d = new C4453d(false);
            C4450a c4450a = new C4450a(false, null, null, true, null, null, false);
            C4452c c4452c = new C4452c(null, false, null);
            C4451b c4451b = new C4451b(false, null);
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            C4451b c4451b2 = c4451b;
            for (AbstractC2857m abstractC2857m : request.f15872a) {
                if ((abstractC2857m instanceof C2865u) && !z6) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        C4452c c4452cConvertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((C2865u) abstractC2857m);
                        AbstractC6840z.m13036g(c4452cConvertToPlayAuthPasskeyRequest);
                        c4452c = c4452cConvertToPlayAuthPasskeyRequest;
                    } else {
                        C4451b c4451bConvertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((C2865u) abstractC2857m);
                        AbstractC6840z.m13036g(c4451bConvertToPlayAuthPasskeyJsonRequest);
                        c4451b2 = c4451bConvertToPlayAuthPasskeyJsonRequest;
                    }
                    z6 = true;
                }
            }
            return new C4454e(c4453d, c4450a, null, false, 0, c4452c, c4451b2, false);
        }

        private Companion() {
        }
    }
}
