package wj;

import android.text.TextUtils;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.q */
/* loaded from: classes.dex */
public final class C8091q {

    /* renamed from: d */
    public static final long f38727d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e */
    public static final /* synthetic */ int f38728e = 0;

    /* renamed from: a */
    public final String f38729a;

    /* renamed from: b */
    public final String f38730b;

    /* renamed from: c */
    public final long f38731c;

    public C8091q(String str, String str2, long j6) {
        this.f38729a = str;
        this.f38730b = str2;
        this.f38731c = j6;
    }

    /* renamed from: a */
    public static C8091q m15270a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C8091q(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C8091q(jSONObject.getString(AWSCognitoLegacyCredentialStore.TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}
