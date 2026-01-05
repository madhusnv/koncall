package u5;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pg.AbstractC5943x;
import t5.C7047e;
import t5.C7048f;
import y5.C8561g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.f */
/* loaded from: classes.dex */
public class C7344f extends C7342d {

    /* renamed from: g */
    public final Class f34972g;

    /* renamed from: h */
    public final Constructor f34973h;

    /* renamed from: i */
    public final Method f34974i;

    /* renamed from: j */
    public final Method f34975j;

    /* renamed from: k */
    public final Method f34976k;

    /* renamed from: l */
    public final Method f34977l;

    /* renamed from: m */
    public final Method f34978m;

    public C7344f() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo13749m;
        Constructor<?> constructor;
        Method methodM13745l;
        Method method;
        Method method2;
        Method method3;
        super(2);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM13745l = m13745l(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo13749m = mo13749m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo13749m = null;
            constructor = null;
            methodM13745l = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f34972g = cls;
        this.f34973h = constructor;
        this.f34974i = methodM13745l;
        this.f34975j = method;
        this.f34976k = method2;
        this.f34977l = method3;
        this.f34978m = methodMo13749m;
    }

    /* renamed from: l */
    public static Method m13745l(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // u5.C7342d, pg.AbstractC5942w
    /* renamed from: a */
    public final Typeface mo11899a(Context context, C7047e c7047e, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        if (this.f34974i == null) {
            return super.mo11899a(context, c7047e, resources, i10);
        }
        try {
            objNewInstance = this.f34973h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C7048f[] c7048fArr = c7047e.f34071a;
            int length = c7048fArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    C7048f c7048f = c7048fArr[i11];
                    Context context2 = context;
                    if (m13746i(context2, objNewInstance, c7048f.f34072a, c7048f.f34076e, c7048f.f34073b, c7048f.f34074c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c7048f.f34075d))) {
                        i11++;
                        context = context2;
                    } else {
                        try {
                            this.f34977l.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (m13748k(objNewInstance)) {
                    return mo13747j(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // u5.C7342d, pg.AbstractC5942w
    /* renamed from: b */
    public final Typeface mo11900b(Context context, C8561g[] c8561gArr, int i10) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceMo13747j;
        boolean zBooleanValue;
        if (c8561gArr.length >= 1) {
            try {
                if (this.f34974i != null) {
                    HashMap map = new HashMap();
                    for (C8561g c8561g : c8561gArr) {
                        if (c8561g.f41558e == 0) {
                            Uri uri = c8561g.f41554a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC5943x.m11925f(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f34973h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c8561gArr.length;
                        int i11 = 0;
                        boolean z6 = false;
                        while (true) {
                            Method method = this.f34977l;
                            if (i11 < length) {
                                C8561g c8561g2 = c8561gArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c8561g2.f41554a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f34975j.invoke(objNewInstance, byteBuffer, Integer.valueOf(c8561g2.f41555b), null, Integer.valueOf(c8561g2.f41556c), Integer.valueOf(c8561g2.f41557d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z6 = true;
                                }
                                i11++;
                                z6 = z6;
                            } else if (!z6) {
                                method.invoke(objNewInstance, null);
                            } else if (m13748k(objNewInstance) && (typefaceMo13747j = mo13747j(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo13747j, i10);
                            }
                        }
                    }
                } else {
                    C8561g c8561gMo11904f = mo11904f(c8561gArr, i10);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c8561gMo11904f.f41554a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c8561gMo11904f.f41556c).setItalic(c8561gMo11904f.f41557d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // pg.AbstractC5942w
    /* renamed from: e */
    public final Typeface mo11903e(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        if (this.f34974i == null) {
            return super.mo11903e(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f34973h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m13746i(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f34977l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m13748k(objNewInstance)) {
                return mo13747j(objNewInstance);
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m13746i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f34974i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo13747j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f34972g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f34978m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean m13748k(Object obj) {
        try {
            return ((Boolean) this.f34976k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public Method mo13749m(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
