package p001o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import p001o.sc8;

/* loaded from: classes2.dex */
public class j79 implements pdc {

    /* renamed from: o.j79$a */
    public static abstract class AbstractC14469a {
        /* renamed from: c */
        public static AbstractC14469a m33376c(lic licVar, sc8.C16803g c16803g) {
            return new u41(licVar, c16803g);
        }

        /* renamed from: a */
        public abstract sc8.C16803g mo33377a();

        /* renamed from: b */
        public abstract lic mo33378b();
    }

    /* renamed from: b */
    public static Uri m33361b(File file, File file2) throws vc8 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new vc8(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: c */
    public static Uri m33362c(File file, sc8.C16803g c16803g) throws Throwable {
        Uri uriInsert;
        ContentResolver contentResolverM48177a = c16803g.m48177a();
        Objects.requireNonNull(contentResolverM48177a);
        ContentValues contentValues = c16803g.m48178b() != null ? new ContentValues(c16803g.m48178b()) : new ContentValues();
        m33371l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                uriInsert = contentResolverM48177a.insert(c16803g.m48182f(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (SecurityException e2) {
            e = e2;
        }
        try {
            if (uriInsert == null) {
                throw new vc8(1, "Failed to insert a MediaStore URI.", null);
            }
            m33364e(file, uriInsert, contentResolverM48177a);
            m33373n(uriInsert, contentResolverM48177a, 0);
            return uriInsert;
        } catch (IOException e3) {
            e = e3;
            uri = uriInsert;
            throw new vc8(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e4) {
            e = e4;
            uri = uriInsert;
            throw new vc8(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = uriInsert;
            if (uri != null) {
                m33373n(uri, contentResolverM48177a, 0);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static void m33363d(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static void m33364e(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                m33363d(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static File m33365f(sc8.C16803g c16803g) throws vc8 {
        try {
            File fileM48179c = c16803g.m48179c();
            if (fileM48179c == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(fileM48179c.getParent(), "CameraX" + UUID.randomUUID().toString() + m33366g(fileM48179c));
        } catch (IOException e) {
            throw new vc8(1, "Failed to create temp file.", e);
        }
    }

    /* renamed from: g */
    public static String m33366g(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    /* renamed from: h */
    public static boolean m33367h(sc8.C16803g c16803g) {
        return c16803g.m48179c() != null;
    }

    /* renamed from: i */
    public static boolean m33368i(sc8.C16803g c16803g) {
        return (c16803g.m48182f() == null || c16803g.m48177a() == null || c16803g.m48178b() == null) ? false : true;
    }

    /* renamed from: j */
    public static boolean m33369j(sc8.C16803g c16803g) {
        return c16803g.m48181e() != null;
    }

    /* renamed from: k */
    public static Uri m33370k(File file, sc8.C16803g c16803g) {
        Uri uriM33361b = null;
        try {
            try {
                if (m33368i(c16803g)) {
                    uriM33361b = m33362c(file, c16803g);
                } else if (m33369j(c16803g)) {
                    OutputStream outputStreamM48181e = c16803g.m48181e();
                    Objects.requireNonNull(outputStreamM48181e);
                    m33363d(file, outputStreamM48181e);
                } else if (m33367h(c16803g)) {
                    File fileM48179c = c16803g.m48179c();
                    Objects.requireNonNull(fileM48179c);
                    uriM33361b = m33361b(file, fileM48179c);
                }
                return uriM33361b;
            } catch (IOException unused) {
                throw new vc8(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: l */
    public static void m33371l(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    /* renamed from: m */
    public static void m33372m(File file, fm6 fm6Var, sc8.C16803g c16803g, int i) throws Throwable {
        try {
            fm6 fm6VarM27047h = fm6.m27047h(file);
            fm6Var.m27055g(fm6VarM27047h);
            if (fm6VarM27047h.m27062s() == 0 && i != 0) {
                fm6VarM27047h.m27069z(i);
            }
            sc8.C16800d c16800dM48180d = c16803g.m48180d();
            if (c16800dM48180d.m48172b()) {
                fm6VarM27047h.m27056l();
            }
            if (c16800dM48180d.m48173c()) {
                fm6VarM27047h.m27057m();
            }
            if (c16800dM48180d.m48171a() != null) {
                fm6VarM27047h.m27054b(c16800dM48180d.m48171a());
            }
            fm6VarM27047h.m27052A();
        } catch (IOException e) {
            throw new vc8(1, "Failed to update Exif data", e);
        }
    }

    /* renamed from: n */
    public static void m33373n(Uri uri, ContentResolver contentResolver, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m33371l(contentValues, i);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    /* renamed from: o */
    public static void m33374o(File file, byte[] bArr) throws IOException, vc8 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new wr8().m54931b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new vc8(1, "Failed to write to temp file", e);
        }
    }

    @Override // p001o.pdc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public sc8.C16804h apply(AbstractC14469a abstractC14469a) throws Throwable {
        lic licVarMo33378b = abstractC14469a.mo33378b();
        sc8.C16803g c16803gMo33377a = abstractC14469a.mo33377a();
        File fileM33365f = m33365f(c16803gMo33377a);
        m33374o(fileM33365f, (byte[]) licVarMo33378b.mo22323c());
        fm6 fm6VarMo22324d = licVarMo33378b.mo22324d();
        Objects.requireNonNull(fm6VarMo22324d);
        m33372m(fileM33365f, fm6VarMo22324d, c16803gMo33377a, licVarMo33378b.mo22326f());
        return new sc8.C16804h(m33370k(fileM33365f, c16803gMo33377a));
    }
}
