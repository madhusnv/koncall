package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2353a {

    /* renamed from: androidx.profileinstaller.a$a */
    public static class a {
        /* renamed from: a */
        public static File m8975a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* renamed from: androidx.profileinstaller.a$b */
    public static class b {
        /* renamed from: a */
        public static Context m8976a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* renamed from: a */
    public static boolean m8973a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m8973a(file2) && z;
        }
        return z;
    }

    /* renamed from: b */
    public static void m8974b(Context context, ProfileInstallReceiver.C2350a c2350a) {
        if (m8973a(Build.VERSION.SDK_INT >= 34 ? b.m8976a(context).getCacheDir() : a.m8975a(b.m8976a(context)))) {
            c2350a.mo8961a(14, null);
        } else {
            c2350a.mo8961a(15, null);
        }
    }
}
