package wi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import c9.C0910e;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.a */
/* loaded from: classes.dex */
public final class C8051a {

    /* renamed from: a */
    public final String f38562a;

    /* renamed from: b */
    public final String f38563b;

    /* renamed from: c */
    public final ArrayList f38564c;

    /* renamed from: d */
    public final String f38565d;

    /* renamed from: e */
    public final String f38566e;

    /* renamed from: f */
    public final String f38567f;

    /* renamed from: g */
    public final String f38568g;

    /* renamed from: h */
    public final C0910e f38569h;

    public C8051a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, C0910e c0910e) {
        this.f38562a = str;
        this.f38563b = str2;
        this.f38564c = arrayList;
        this.f38565d = str3;
        this.f38566e = str4;
        this.f38567f = str5;
        this.f38568g = str6;
        this.f38569h = c0910e;
    }

    /* renamed from: a */
    public static C8051a m15185a(Context context, C8072v c8072v, String str, String str2, ArrayList arrayList, C0910e c0910e) {
        String packageName = context.getPackageName();
        String strM15213d = c8072v.m15213d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C8051a(str, str2, arrayList, strM15213d, packageName, string, str3, c0910e);
    }
}
