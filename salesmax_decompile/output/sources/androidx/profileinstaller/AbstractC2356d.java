package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import org.objectweb.asm.Opcodes;
import p001o.qne;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2356d {

    /* renamed from: a */
    public static final qne f9719a = qne.m45706n();

    /* renamed from: b */
    public static final Object f9720b = new Object();

    /* renamed from: c */
    public static c f9721c = null;

    /* renamed from: androidx.profileinstaller.d$a */
    public static class a {
        /* renamed from: a */
        public static PackageInfo m9006a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.d$b */
    public static class b {

        /* renamed from: a */
        public final int f9722a;

        /* renamed from: b */
        public final int f9723b;

        /* renamed from: c */
        public final long f9724c;

        /* renamed from: d */
        public final long f9725d;

        public b(int i, int i2, long j, long j2) {
            this.f9722a = i;
            this.f9723b = i2;
            this.f9724c = j;
            this.f9725d = j2;
        }

        /* renamed from: a */
        public static b m9007a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public void m9008b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f9722a);
                dataOutputStream.writeInt(this.f9723b);
                dataOutputStream.writeLong(this.f9724c);
                dataOutputStream.writeLong(this.f9725d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9723b == bVar.f9723b && this.f9724c == bVar.f9724c && this.f9722a == bVar.f9722a && this.f9725d == bVar.f9725d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f9723b), Long.valueOf(this.f9724c), Integer.valueOf(this.f9722a), Long.valueOf(this.f9725d));
        }
    }

    /* renamed from: androidx.profileinstaller.d$c */
    public static class c {

        /* renamed from: a */
        public final int f9726a;

        /* renamed from: b */
        public final boolean f9727b;

        /* renamed from: c */
        public final boolean f9728c;

        /* renamed from: d */
        public final boolean f9729d;

        public c(int i, boolean z, boolean z2, boolean z3) {
            this.f9726a = i;
            this.f9728c = z2;
            this.f9727b = z;
            this.f9729d = z3;
        }
    }

    /* renamed from: a */
    public static long m9003a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m9006a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static c m9004b(int i, boolean z, boolean z2, boolean z3) {
        c cVar = new c(i, z, z2, z3);
        f9721c = cVar;
        f9719a.set(cVar);
        return f9721c;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c m9005c(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        long length;
        boolean z4;
        File file;
        b bVarM9007a;
        b bVar;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z && (cVar = f9721c) != null) {
            return cVar;
        }
        synchronized (f9720b) {
            if (z) {
                i = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() <= 0) {
                }
                assetFileDescriptorOpenFd.close();
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists()) {
                        File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file3.length();
                        if (file3.exists()) {
                            long jM9003a = m9003a(context);
                            file = new File(context.getFilesDir(), "profileInstalled");
                            if (file.exists()) {
                            }
                            if (bVarM9007a == null) {
                                if (z2) {
                                }
                            }
                            if (z) {
                                i = 2;
                            }
                            if (bVarM9007a != null) {
                                i = 3;
                            }
                            bVar = new b(1, i, jM9003a, length);
                            if (bVarM9007a != null) {
                                bVar.m9008b(file);
                            }
                            return m9004b(i, z3, z4, z2);
                        }
                    }
                }
                return m9004b(262144, false, false, z2);
            }
            c cVar2 = f9721c;
            if (cVar2 != null) {
                return cVar2;
            }
            i = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
            } catch (IOException unused) {
                z2 = false;
            }
            try {
                z2 = assetFileDescriptorOpenFd.getLength() <= 0;
                assetFileDescriptorOpenFd.close();
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    z3 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    z4 = !file32.exists() && length > 0;
                    try {
                        long jM9003a2 = m9003a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            bVarM9007a = null;
                        } else {
                            try {
                                bVarM9007a = b.m9007a(file);
                            } catch (IOException unused2) {
                                return m9004b(Opcodes.ACC_DEPRECATED, z3, z4, z2);
                            }
                        }
                        if (bVarM9007a == null && bVarM9007a.f9724c == jM9003a2 && (i3 = bVarM9007a.f9723b) != 2) {
                            i = i3;
                        } else if (z2) {
                            i = Opcodes.ASM5;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z && z4 && i != 1) {
                            i = 2;
                        }
                        if (bVarM9007a != null && bVarM9007a.f9723b == 2 && i == 1 && length22 < bVarM9007a.f9725d) {
                            i = 3;
                        }
                        bVar = new b(1, i, jM9003a2, length);
                        if (bVarM9007a != null || !bVarM9007a.equals(bVar)) {
                            try {
                                bVar.m9008b(file);
                            } catch (IOException unused3) {
                                i = 196608;
                            }
                        }
                        return m9004b(i, z3, z4, z2);
                    } catch (PackageManager.NameNotFoundException unused4) {
                        return m9004b(65536, z3, z4, z2);
                    }
                }
                return m9004b(262144, false, false, z2);
            } finally {
            }
        }
    }
}
