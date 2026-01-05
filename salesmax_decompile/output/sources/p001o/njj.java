package p001o;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes6.dex */
public final class njj extends GoogleApi {

    /* renamed from: a */
    public static final Api.ClientKey f36962a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f36963b;

    /* renamed from: c */
    public static final Api f36964c;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f36962a = clientKey;
        jjj jjjVar = new jjj();
        f36963b = jjjVar;
        f36964c = new Api("MlKitDocScanUI.API", jjjVar, clientKey);
    }

    public njj(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f36964c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
