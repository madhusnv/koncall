package u5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import e1.u0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import pg.AbstractC5942w;
import pg.AbstractC5943x;
import t5.C7047e;
import t5.C7048f;
import y5.C8561g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.e */
/* loaded from: classes.dex */
public final class C7343e extends AbstractC5942w {

    /* renamed from: b */
    public static final Class f34968b;

    /* renamed from: c */
    public static final Constructor f34969c;

    /* renamed from: d */
    public static final Method f34970d;

    /* renamed from: e */
    public static final Method f34971e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f34969c = constructor;
        f34968b = cls;
        f34970d = method2;
        f34971e = method;
    }

    /* renamed from: g */
    public static boolean m13743g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z6) {
        try {
            return ((Boolean) f34970d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static Typeface m13744h(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f34968b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f34971e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: a */
    public final Typeface mo11899a(Context context, C7047e c7047e, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f34969c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C7048f c7048f : c7047e.f34071a) {
                int i11 = c7048f.f34077f;
                File fileM11924e = AbstractC5943x.m11924e(context);
                if (fileM11924e != null) {
                    try {
                        if (AbstractC5943x.m11921b(fileM11924e, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(fileM11924e);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && m13743g(objNewInstance, map, c7048f.f34076e, c7048f.f34073b, c7048f.f34074c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileM11924e.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return m13744h(objNewInstance);
        }
        return null;
    }

    @Override // pg.AbstractC5942w
    /* renamed from: b */
    public final Typeface mo11900b(Context context, C8561g[] c8561gArr, int i10) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f34969c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i11 = 0;
            u0 u0Var = new u0(0);
            int length = c8561gArr.length;
            while (true) {
                if (i11 < length) {
                    C8561g c8561g = c8561gArr[i11];
                    Uri uri = c8561g.f41554a;
                    ByteBuffer byteBufferM11925f = (ByteBuffer) u0Var.get(uri);
                    if (byteBufferM11925f == null) {
                        byteBufferM11925f = AbstractC5943x.m11925f(context, uri);
                        u0Var.put(uri, byteBufferM11925f);
                    }
                    if (byteBufferM11925f == null || !m13743g(objNewInstance, byteBufferM11925f, c8561g.f41555b, c8561g.f41556c, c8561g.f41557d)) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface typefaceM13744h = m13744h(objNewInstance);
                    if (typefaceM13744h != null) {
                        return Typeface.create(typefaceM13744h, i10);
                    }
                }
            }
        }
        return null;
    }
}
