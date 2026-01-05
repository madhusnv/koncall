package eb;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import c9.C0910e;
import java.io.IOException;
import java.io.InputStream;
import wi.AbstractC8057g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.c */
/* loaded from: classes.dex */
public final class C1979c {

    /* renamed from: a */
    public String f9280a;

    /* renamed from: b */
    public String f9281b;

    public C1979c(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f9280a = str;
        this.f9281b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    /* renamed from: a */
    public void m5714a(String str) {
        String str2 = this.f9281b;
        if (str2 == null) {
            return;
        }
        str2.concat(str);
    }

    public C1979c(C0910e c0910e) throws Resources.NotFoundException, IOException {
        Context context = (Context) c0910e.f5579b;
        int iM15190d = AbstractC8057g.m15190d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iM15190d != 0) {
            this.f9280a = "Unity";
            this.f9281b = context.getResources().getString(iM15190d);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f9280a = "Flutter";
                this.f9281b = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.f9280a = null;
        this.f9281b = null;
    }
}
