package nf;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import i0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import mf.C4720c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.b */
/* loaded from: classes.dex */
public final class C5040b {

    /* renamed from: c */
    public static final ReentrantLock f24799c = new ReentrantLock();

    /* renamed from: d */
    public static C5040b f24800d;

    /* renamed from: a */
    public final ReentrantLock f24801a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f24802b;

    public C5040b(Context context) {
        this.f24802b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C5040b m9956a(Context context) {
        AbstractC6840z.m13036g(context);
        ReentrantLock reentrantLock = f24799c;
        reentrantLock.lock();
        try {
            if (f24800d == null) {
                f24800d = new C5040b(context.getApplicationContext());
            }
            C5040b c5040b = f24800d;
            reentrantLock.unlock();
            return c5040b;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: f */
    public static final String m9957f(String str, String str2) {
        return m0.m7379l(str, ":", str2);
    }

    /* renamed from: b */
    public final GoogleSignInAccount m9958b() {
        String strM9960d;
        String strM9960d2 = m9960d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM9960d2) && (strM9960d = m9960d(m9957f("googleSignInAccount", strM9960d2))) != null) {
            try {
                return GoogleSignInAccount.m3086b(strM9960d);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m9959c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) throws JSONException {
        AbstractC6840z.m13036g(googleSignInAccount);
        AbstractC6840z.m13036g(googleSignInOptions);
        String str = googleSignInAccount.f5966j;
        m9961e("defaultGoogleSignInAccount", str);
        String strM9957f = m9957f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f5959b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f5960c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f5961d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f5962e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f5968l;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f5969m;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f5963f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f5964g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f5965h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f5967k;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C4720c.f23621b);
            int i10 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f6001b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m9961e(strM9957f, jSONObject.toString());
            String strM9957f2 = m9957f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f5983h;
            String str10 = googleSignInOptions.f5982g;
            ArrayList arrayList = googleSignInOptions.f5977b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.f5975q);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jSONArray2.put(((Scope) obj).f6001b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f5978c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f5979d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f5981f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f5980e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m9961e(strM9957f2, jSONObject2.toString());
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public final String m9960d(String str) {
        ReentrantLock reentrantLock = this.f24801a;
        reentrantLock.lock();
        try {
            return this.f24802b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final void m9961e(String str, String str2) {
        ReentrantLock reentrantLock = this.f24801a;
        reentrantLock.lock();
        try {
            this.f24802b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
