package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001o.bc7;
import p001o.xb7;

/* loaded from: classes2.dex */
public class gzh extends lzh {

    /* renamed from: b */
    public static Class f26023b = null;

    /* renamed from: c */
    public static Constructor f26024c = null;

    /* renamed from: d */
    public static Method f26025d = null;

    /* renamed from: e */
    public static Method f26026e = null;

    /* renamed from: f */
    public static boolean f26027f = false;

    /* renamed from: h */
    public static boolean m29706h(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m29708k();
        try {
            return ((Boolean) f26025d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public static Typeface m29707i(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        m29708k();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f26023b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f26026e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public static void m29708k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f26027f) {
            return;
        }
        f26027f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f26024c = constructor;
        f26023b = cls;
        f26025d = method2;
        f26026e = method;
    }

    /* renamed from: l */
    public static Object m29709l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m29708k();
        try {
            return f26024c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p001o.lzh
    /* renamed from: a */
    public Typeface mo29710a(Context context, xb7.C18100c c18100c, Resources resources, int i) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objM29709l = m29709l();
        for (xb7.C18101d c18101d : c18100c.m55931a()) {
            File fileM39926e = mzh.m39926e(context);
            if (fileM39926e == null) {
                return null;
            }
            try {
                if (!mzh.m39924c(fileM39926e, resources, c18101d.m55933b())) {
                    return null;
                }
                if (!m29706h(objM29709l, fileM39926e.getPath(), c18101d.m55936e(), c18101d.m55937f())) {
                    return null;
                }
                fileM39926e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM39926e.delete();
            }
        }
        return m29707i(objM29709l);
    }

    @Override // p001o.lzh
    /* renamed from: b */
    public Typeface mo29711b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i) throws IOException {
        if (c12352bArr.length < 1) {
            return null;
        }
        bc7.C12352b c12352bMo36378g = mo36378g(c12352bArr, i);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c12352bMo36378g.m18592d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileM29712j = m29712j(parcelFileDescriptorOpenFileDescriptor);
                if (fileM29712j != null && fileM29712j.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM29712j);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceM38128c = super.m38128c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceM38128c;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final File m29712j(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
