package p001o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class js6 {

    /* renamed from: a */
    public static final js6 f31026a = new js6();

    /* renamed from: b */
    public static final HashSet f31027b = nif.m40665f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /* renamed from: a */
    public static final boolean m34454a(Context context, String str) throws PackageManager.NameNotFoundException {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        sq8.m48648g(str2, "brand");
        if (e9g.m24597K(str2, "generic", false, 2, null) && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            sq8.m48648g(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            sq8.m48648g(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet hashSet = f31027b;
                byte[] byteArray = signature.toByteArray();
                sq8.m48648g(byteArray, "it.toByteArray()");
                if (!kh3.m35708X(hashSet, cri.F0(byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
