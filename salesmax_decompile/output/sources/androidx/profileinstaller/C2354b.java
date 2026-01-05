package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.AbstractC2355c;
import com.google.api.Service;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import p001o.o76;
import p001o.or5;
import p001o.vmd;
import p001o.wmd;

/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes2.dex */
public class C2354b {

    /* renamed from: a */
    public final AssetManager f9706a;

    /* renamed from: b */
    public final Executor f9707b;

    /* renamed from: c */
    public final AbstractC2355c.c f9708c;

    /* renamed from: e */
    public final File f9710e;

    /* renamed from: f */
    public final String f9711f;

    /* renamed from: g */
    public final String f9712g;

    /* renamed from: h */
    public final String f9713h;

    /* renamed from: j */
    public or5[] f9715j;

    /* renamed from: k */
    public byte[] f9716k;

    /* renamed from: i */
    public boolean f9714i = false;

    /* renamed from: d */
    public final byte[] f9709d = m8978d();

    public C2354b(AssetManager assetManager, Executor executor, AbstractC2355c.c cVar, String str, String str2, String str3, File file) {
        this.f9706a = assetManager;
        this.f9707b = executor;
        this.f9708c = cVar;
        this.f9711f = str;
        this.f9712g = str2;
        this.f9713h = str3;
        this.f9710e = file;
    }

    /* renamed from: d */
    public static byte[] m8978d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return wmd.f52350a;
        }
        switch (i) {
            case 24:
            case 25:
                return wmd.f52354e;
            case 26:
                return wmd.f52353d;
            case 27:
                return wmd.f52352c;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
                return wmd.f52351b;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m8979g(int i, Object obj) {
        this.f9708c.mo8961a(i, obj);
    }

    /* renamed from: k */
    public static boolean m8980k() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || i == 24 || i == 25;
    }

    /* renamed from: b */
    public final C2354b m8981b(or5[] or5VarArr, byte[] bArr) throws IOException {
        InputStream inputStreamM8985h;
        try {
            inputStreamM8985h = m8985h(this.f9706a, this.f9713h);
        } catch (FileNotFoundException e) {
            this.f9708c.mo8961a(9, e);
        } catch (IOException e2) {
            this.f9708c.mo8961a(7, e2);
        } catch (IllegalStateException e3) {
            this.f9715j = null;
            this.f9708c.mo8961a(8, e3);
        }
        if (inputStreamM8985h == null) {
            if (inputStreamM8985h != null) {
                inputStreamM8985h.close();
            }
            return null;
        }
        try {
            this.f9715j = vmd.m53017r(inputStreamM8985h, vmd.m53015p(inputStreamM8985h, vmd.f50561b), bArr, or5VarArr);
            inputStreamM8985h.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamM8985h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void m8982c() {
        if (!this.f9714i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: e */
    public boolean m8983e() {
        if (this.f9709d == null) {
            m8988l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f9710e.exists()) {
            try {
                if (!this.f9710e.createNewFile()) {
                    m8988l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m8988l(4, null);
                return false;
            }
        } else if (!this.f9710e.canWrite()) {
            m8988l(4, null);
            return false;
        }
        this.f9714i = true;
        return true;
    }

    /* renamed from: f */
    public final InputStream m8984f(AssetManager assetManager) {
        try {
            return m8985h(assetManager, this.f9712g);
        } catch (FileNotFoundException e) {
            this.f9708c.mo8961a(6, e);
            return null;
        } catch (IOException e2) {
            this.f9708c.mo8961a(7, e2);
            return null;
        }
    }

    /* renamed from: h */
    public final InputStream m8985h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9708c.mo8962b(5, null);
            }
            return null;
        }
    }

    /* renamed from: i */
    public C2354b m8986i() {
        C2354b c2354bM8981b;
        m8982c();
        if (this.f9709d == null) {
            return this;
        }
        InputStream inputStreamM8984f = m8984f(this.f9706a);
        if (inputStreamM8984f != null) {
            this.f9715j = m8987j(inputStreamM8984f);
        }
        or5[] or5VarArr = this.f9715j;
        return (or5VarArr == null || !m8980k() || (c2354bM8981b = m8981b(or5VarArr, this.f9709d)) == null) ? this : c2354bM8981b;
    }

    /* renamed from: j */
    public final or5[] m8987j(InputStream inputStream) throws IOException {
        try {
        } catch (IOException e) {
            this.f9708c.mo8961a(7, e);
        }
        try {
            try {
                or5[] or5VarArrM53023x = vmd.m53023x(inputStream, vmd.m53015p(inputStream, vmd.f50560a), this.f9711f);
                try {
                    inputStream.close();
                    return or5VarArrM53023x;
                } catch (IOException e2) {
                    this.f9708c.mo8961a(7, e2);
                    return or5VarArrM53023x;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    this.f9708c.mo8961a(7, e3);
                }
                throw th;
            }
        } catch (IOException e4) {
            this.f9708c.mo8961a(7, e4);
            inputStream.close();
            return null;
        } catch (IllegalStateException e5) {
            this.f9708c.mo8961a(8, e5);
            inputStream.close();
            return null;
        }
    }

    /* renamed from: l */
    public final void m8988l(final int i, final Object obj) {
        this.f9707b.execute(new Runnable() { // from class: o.tq5
            @Override // java.lang.Runnable
            public final void run() {
                this.f47604a.m8979g(i, obj);
            }
        });
    }

    /* renamed from: m */
    public C2354b m8989m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        or5[] or5VarArr = this.f9715j;
        byte[] bArr = this.f9709d;
        if (or5VarArr != null && bArr != null) {
            m8982c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    vmd.m52988F(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f9708c.mo8961a(7, e);
            } catch (IllegalStateException e2) {
                this.f9708c.mo8961a(8, e2);
            }
            if (!vmd.m52985C(byteArrayOutputStream, bArr, or5VarArr)) {
                this.f9708c.mo8961a(5, null);
                this.f9715j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f9716k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f9715j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public boolean m8990n() {
        byte[] bArr = this.f9716k;
        if (bArr == null) {
            return false;
        }
        m8982c();
        try {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f9710e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                try {
                                    o76.m41671l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                    m8988l(1, null);
                                    if (fileLockTryLock != null) {
                                        fileLockTryLock.close();
                                    }
                                    channel.close();
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    return true;
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    m8988l(7, e);
                    return false;
                }
            } catch (FileNotFoundException e2) {
                m8988l(6, e2);
                return false;
            }
        } finally {
            this.f9716k = null;
            this.f9715j = null;
        }
    }
}
