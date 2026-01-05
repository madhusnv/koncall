package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p001o.ab4;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2355c {

    /* renamed from: a */
    public static final c f9717a = new a();

    /* renamed from: b */
    public static final c f9718b = new b();

    /* renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: a */
        public void mo8961a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: b */
        public void mo8962b(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0000. Please report as an issue. */
        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: a */
        public void mo8961a(int i, Object obj) {
            switch (i) {
            }
            if (i == 6 || i == 7 || i == 8) {
            }
        }

        @Override // androidx.profileinstaller.AbstractC2355c.c
        /* renamed from: b */
        public void mo8962b(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* renamed from: a */
        void mo8961a(int i, Object obj);

        /* renamed from: b */
        void mo8962b(int i, Object obj);
    }

    /* renamed from: b */
    public static boolean m8992b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m8993c(Context context, Executor executor, c cVar) {
        m8992b(context.getFilesDir());
        m8997g(executor, cVar, 11, null);
    }

    /* renamed from: d */
    public static boolean m8994d(PackageInfo packageInfo, File file, c cVar) throws IOException {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    cVar.mo8961a(2, null);
                }
                return z;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m8996f(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    public static void m8997g(Executor executor, final c cVar, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: o.omd
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo8961a(i, obj);
            }
        });
    }

    /* renamed from: h */
    public static boolean m8998h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) throws IOException {
        C2354b c2354b = new C2354b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c2354b.m8983e()) {
            return false;
        }
        boolean zM8990n = c2354b.m8986i().m8989m().m8990n();
        if (zM8990n) {
            m8996f(packageInfo, file);
        }
        return zM8990n;
    }

    /* renamed from: i */
    public static void m8999i(Context context) throws PackageManager.NameNotFoundException {
        m9000j(context, new ab4(), f9717a);
    }

    /* renamed from: j */
    public static void m9000j(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException {
        m9001k(context, executor, cVar, false);
    }

    /* renamed from: k */
    public static void m9001k(Context context, Executor executor, c cVar, boolean z) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && m8994d(packageInfo, filesDir, cVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping profile installation for ");
                sb.append(context.getPackageName());
                AbstractC2356d.m9005c(context, false);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Installing profile for ");
            sb2.append(context.getPackageName());
            if (m8998h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z) {
                z2 = true;
            }
            AbstractC2356d.m9005c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            cVar.mo8961a(7, e);
            AbstractC2356d.m9005c(context, false);
        }
    }

    /* renamed from: l */
    public static void m9002l(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException, IOException {
        try {
            m8996f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m8997g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            m8997g(executor, cVar, 7, e);
        }
    }
}
