package p001o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p001o.bc7;
import p001o.xb7;

/* loaded from: classes2.dex */
public class izh extends gzh {

    /* renamed from: g */
    public final Class f29447g;

    /* renamed from: h */
    public final Constructor f29448h;

    /* renamed from: i */
    public final Method f29449i;

    /* renamed from: j */
    public final Method f29450j;

    /* renamed from: k */
    public final Method f29451k;

    /* renamed from: l */
    public final Method f29452l;

    /* renamed from: m */
    public final Method f29453m;

    public izh() {
        Class clsM32969v;
        Constructor constructorM32970w;
        Method methodM32966s;
        Method methodM32967t;
        Method methodM32971x;
        Method methodM32965r;
        Method methodMo32968u;
        try {
            clsM32969v = m32969v();
            constructorM32970w = m32970w(clsM32969v);
            methodM32966s = m32966s(clsM32969v);
            methodM32967t = m32967t(clsM32969v);
            methodM32971x = m32971x(clsM32969v);
            methodM32965r = m32965r(clsM32969v);
            methodMo32968u = mo32968u(clsM32969v);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            clsM32969v = null;
            constructorM32970w = null;
            methodM32966s = null;
            methodM32967t = null;
            methodM32971x = null;
            methodM32965r = null;
            methodMo32968u = null;
        }
        this.f29447g = clsM32969v;
        this.f29448h = constructorM32970w;
        this.f29449i = methodM32966s;
        this.f29450j = methodM32967t;
        this.f29451k = methodM32971x;
        this.f29452l = methodM32965r;
        this.f29453m = methodMo32968u;
    }

    /* renamed from: l */
    private Object m32957l() {
        try {
            return this.f29448h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p001o.gzh, p001o.lzh
    /* renamed from: a */
    public Typeface mo29710a(Context context, xb7.C18100c c18100c, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m32964q()) {
            return super.mo29710a(context, c18100c, resources, i);
        }
        Object objM32957l = m32957l();
        if (objM32957l == null) {
            return null;
        }
        for (xb7.C18101d c18101d : c18100c.m55931a()) {
            if (!m32961n(context, objM32957l, c18101d.m55932a(), c18101d.m55934c(), c18101d.m55936e(), c18101d.m55937f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c18101d.m55935d()))) {
                m32960m(objM32957l);
                return null;
            }
        }
        if (m32963p(objM32957l)) {
            return mo32959i(objM32957l);
        }
        return null;
    }

    @Override // p001o.gzh, p001o.lzh
    /* renamed from: b */
    public Typeface mo29711b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo32959i;
        if (c12352bArr.length < 1) {
            return null;
        }
        if (!m32964q()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c12352bMo36378g.m18593e()).setItalic(c12352bMo36378g.m18594f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapM39929h = mzh.m39929h(context, c12352bArr, cancellationSignal);
        Object objM32957l = m32957l();
        if (objM32957l == null) {
            return null;
        }
        boolean z = false;
        for (bc7.C12352b c12352b : c12352bArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapM39929h.get(c12352b.m18592d());
            if (byteBuffer != null) {
                if (!m32962o(objM32957l, byteBuffer, c12352b.m18591c(), c12352b.m18593e(), c12352b.m18594f() ? 1 : 0)) {
                    m32960m(objM32957l);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m32960m(objM32957l);
            return null;
        }
        if (m32963p(objM32957l) && (typefaceMo32959i = mo32959i(objM32957l)) != null) {
            return Typeface.create(typefaceMo32959i, i);
        }
        return null;
    }

    @Override // p001o.lzh
    /* renamed from: d */
    public Typeface mo32958d(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m32964q()) {
            return super.mo32958d(context, resources, i, str, i2);
        }
        Object objM32957l = m32957l();
        if (objM32957l == null) {
            return null;
        }
        if (!m32961n(context, objM32957l, str, 0, -1, -1, null)) {
            m32960m(objM32957l);
            return null;
        }
        if (m32963p(objM32957l)) {
            return mo32959i(objM32957l);
        }
        return null;
    }

    /* renamed from: i */
    public Typeface mo32959i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f29447g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f29453m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final void m32960m(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f29452l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    public final boolean m32961n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f29449i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final boolean m32962o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f29450j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m32963p(Object obj) {
        try {
            return ((Boolean) this.f29451k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m32964q() {
        return this.f29449i != null;
    }

    /* renamed from: r */
    public Method m32965r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    public Method m32966s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: t */
    public Method m32967t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: u */
    public Method mo32968u(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    public Class m32969v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    public Constructor m32970w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    public Method m32971x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
