package ji;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import oj.C5396h;
import p020v.x0;
import qi.C6219b;
import qi.C6225h;
import qj.InterfaceC6237b;
import vj.C7714a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C3769c implements InterfaceC6237b {

    /* renamed from: a */
    public final /* synthetic */ int f19653a;

    /* renamed from: b */
    public final /* synthetic */ Object f19654b;

    /* renamed from: c */
    public final /* synthetic */ Object f19655c;

    public /* synthetic */ C3769c(int i10, Object obj, Object obj2) {
        this.f19653a = i10;
        this.f19655c = obj;
        this.f19654b = obj2;
    }

    @Override // qj.InterfaceC6237b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f19653a) {
            case 0:
                C3773g c3773g = (C3773g) this.f19655c;
                Context context = (Context) this.f19654b;
                String strM8295d = c3773g.m8295d();
                C7714a c7714a = new C7714a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strM8295d, 0);
                boolean z6 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z6 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z6 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c7714a.f37242a = z6;
                return c7714a;
            case 1:
                return new C5396h((Context) this.f19654b, (String) this.f19655c);
            default:
                C6225h c6225h = (C6225h) this.f19655c;
                C6219b c6219b = (C6219b) this.f19654b;
                return c6219b.f30218f.mo21h(new x0(c6219b, c6225h));
        }
    }

    public /* synthetic */ C3769c(Context context, String str) {
        this.f19653a = 1;
        this.f19654b = context;
        this.f19655c = str;
    }
}
