package pf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import bg.C0658c;
import java.util.concurrent.atomic.AtomicBoolean;
import sf.l0;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.f */
/* loaded from: classes.dex */
public class C5906f {

    /* renamed from: a */
    public static final int f28747a;

    /* renamed from: b */
    public static final C5906f f28748b;

    static {
        AtomicBoolean atomicBoolean = AbstractC5907g.f28749a;
        f28747a = 12451000;
        f28748b = new C5906f();
    }

    /* renamed from: a */
    public static int m11514a(Context context) {
        AtomicBoolean atomicBoolean = AbstractC5907g.f28749a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public Intent m11515b(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = l0.f32468a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC8947b.m16430g(context)) {
            int i12 = l0.f32468a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f28747a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C0658c.m1928a(context).m1920c(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        int i13 = l0.f32468a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m11516c(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.C5906f.m11516c(android.content.Context, int):int");
    }
}
