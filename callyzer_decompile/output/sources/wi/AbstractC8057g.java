package wi;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.g */
/* loaded from: classes.dex */
public abstract class AbstractC8057g {

    /* renamed from: a */
    public static final char[] f38582a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static synchronized long m15187a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: b */
    public static void m15188b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: c */
    public static int m15189c() {
        boolean zM15192f = m15192f();
        ?? r02 = zM15192f;
        if (m15193g()) {
            r02 = (zM15192f ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r02 | 4 : r02;
    }

    /* renamed from: d */
    public static int m15190d(Context context, String str, String str2) throws Resources.NotFoundException {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* renamed from: e */
    public static String m15191e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f38582a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static boolean m15192f() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    /* renamed from: g */
    public static boolean m15193g() {
        boolean zM15192f = m15192f();
        String str = Build.TAGS;
        if ((zM15192f || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM15192f && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: h */
    public static String m15194h(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(bytes);
            return m15191e(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static String m15195i(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th2) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
