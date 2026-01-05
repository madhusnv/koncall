package u5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
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
import pg.AbstractC5942w;
import pg.AbstractC5943x;
import t5.C7047e;
import t5.C7048f;
import y5.C8561g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.d */
/* loaded from: classes.dex */
public class C7342d extends AbstractC5942w {

    /* renamed from: b */
    public static Class f34963b = null;

    /* renamed from: c */
    public static Constructor f34964c = null;

    /* renamed from: d */
    public static Method f34965d = null;

    /* renamed from: e */
    public static Method f34966e = null;

    /* renamed from: f */
    public static boolean f34967f = false;

    /* renamed from: g */
    public static boolean m13741g(Object obj, String str, int i10, boolean z6) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m13742h();
        try {
            return ((Boolean) f34965d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: h */
    public static void m13742h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f34967f) {
            return;
        }
        f34967f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f34964c = constructor;
        f34963b = cls;
        f34965d = method2;
        f34966e = method;
    }

    @Override // pg.AbstractC5942w
    /* renamed from: a */
    public Typeface mo11899a(Context context, C7047e c7047e, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m13742h();
        try {
            Object objNewInstance = f34964c.newInstance(null);
            for (C7048f c7048f : c7047e.f34071a) {
                File fileM11924e = AbstractC5943x.m11924e(context);
                if (fileM11924e == null) {
                    return null;
                }
                try {
                    if (!AbstractC5943x.m11921b(fileM11924e, resources, c7048f.f34077f)) {
                        return null;
                    }
                    if (!m13741g(objNewInstance, fileM11924e.getPath(), c7048f.f34073b, c7048f.f34074c)) {
                        return null;
                    }
                    fileM11924e.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM11924e.delete();
                }
            }
            m13742h();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f34963b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f34966e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: b */
    public Typeface mo11900b(Context context, C8561g[] c8561gArr, int i10) throws IOException {
        String str;
        if (c8561gArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo11904f(c8561gArr, i10).f41554a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo11902d = mo11902d(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo11902d;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
