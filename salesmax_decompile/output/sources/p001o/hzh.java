package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p001o.bc7;
import p001o.xb7;

/* loaded from: classes2.dex */
public class hzh extends lzh {

    /* renamed from: b */
    public static final Class f27857b;

    /* renamed from: c */
    public static final Constructor f27858c;

    /* renamed from: d */
    public static final Method f27859d;

    /* renamed from: e */
    public static final Method f27860e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f27858c = constructor;
        f27857b = cls;
        f27859d = method2;
        f27860e = method;
    }

    /* renamed from: h */
    public static boolean m31324h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f27859d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static Typeface m31325i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f27857b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f27860e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m31326j() {
        return f27859d != null;
    }

    /* renamed from: k */
    public static Object m31327k() {
        try {
            return f27858c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p001o.lzh
    /* renamed from: a */
    public Typeface mo29710a(Context context, xb7.C18100c c18100c, Resources resources, int i) {
        Object objM31327k = m31327k();
        if (objM31327k == null) {
            return null;
        }
        for (xb7.C18101d c18101d : c18100c.m55931a()) {
            ByteBuffer byteBufferM39923b = mzh.m39923b(context, resources, c18101d.m55933b());
            if (byteBufferM39923b == null || !m31324h(objM31327k, byteBufferM39923b, c18101d.m55934c(), c18101d.m55936e(), c18101d.m55937f())) {
                return null;
            }
        }
        return m31325i(objM31327k);
    }

    @Override // p001o.lzh
    /* renamed from: b */
    public Typeface mo29711b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objM31327k = m31327k();
        if (objM31327k == null) {
            return null;
        }
        ktf ktfVar = new ktf();
        for (bc7.C12352b c12352b : c12352bArr) {
            Uri uriM18592d = c12352b.m18592d();
            ByteBuffer byteBufferM39927f = (ByteBuffer) ktfVar.get(uriM18592d);
            if (byteBufferM39927f == null) {
                byteBufferM39927f = mzh.m39927f(context, cancellationSignal, uriM18592d);
                ktfVar.put(uriM18592d, byteBufferM39927f);
            }
            if (byteBufferM39927f == null || !m31324h(objM31327k, byteBufferM39927f, c12352b.m18591c(), c12352b.m18593e(), c12352b.m18594f())) {
                return null;
            }
        }
        Typeface typefaceM31325i = m31325i(objM31327k);
        if (typefaceM31325i == null) {
            return null;
        }
        return Typeface.create(typefaceM31325i, i);
    }
}
