package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p001o.mbe;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes2.dex */
public class C2004a {

    /* renamed from: a */
    public boolean f6948a;

    /* renamed from: b */
    public String f6949b;

    /* renamed from: c */
    public a f6950c;

    /* renamed from: d */
    public int f6951d;

    /* renamed from: e */
    public float f6952e;

    /* renamed from: f */
    public String f6953f;

    /* renamed from: g */
    public boolean f6954g;

    /* renamed from: h */
    public int f6955h;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C2004a(String str, a aVar, Object obj, boolean z) {
        this.f6949b = str;
        this.f6950c = aVar;
        this.f6948a = z;
        m5646k(obj);
    }

    /* renamed from: b */
    public static HashMap m5636b(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C2004a c2004a = (C2004a) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C2004a(c2004a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C2004a(c2004a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str);
            } catch (InvocationTargetException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
            }
        }
        return map2;
    }

    /* renamed from: i */
    public static void m5637i(Context context, XmlPullParser xmlPullParser, HashMap map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == mbe.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == mbe.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == mbe.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == mbe.CustomAttribute_customColorValue) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == mbe.CustomAttribute_customColorDrawableValue) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == mbe.CustomAttribute_customPixelDimension) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == mbe.CustomAttribute_customDimension) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == mbe.CustomAttribute_customFloatValue) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == mbe.CustomAttribute_customIntegerValue) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == mbe.CustomAttribute_customStringValue) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.CustomAttribute_customReference) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new C2004a(string, aVar2, objValueOf2, z));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public static void m5638j(View view, HashMap map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C2004a c2004a = (C2004a) map.get(str);
            String str2 = c2004a.f6948a ? str : "set" + str;
            try {
                switch (c2004a.f6950c) {
                    case INT_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c2004a.f6951d));
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c2004a.f6952e));
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c2004a.f6955h));
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c2004a.f6955h);
                        method.invoke(view, colorDrawable);
                        break;
                    case STRING_TYPE:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c2004a.f6953f);
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c2004a.f6954g));
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c2004a.f6952e));
                        break;
                    case REFERENCE_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c2004a.f6951d));
                        break;
                }
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
            } catch (InvocationTargetException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
            }
        }
    }

    /* renamed from: a */
    public void m5639a(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f6949b;
        if (this.f6948a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (this.f6950c) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f6951d));
                    break;
                case FLOAT_TYPE:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f6952e));
                    break;
                case COLOR_TYPE:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f6955h));
                    break;
                case COLOR_DRAWABLE_TYPE:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f6955h);
                    method.invoke(view, colorDrawable);
                    break;
                case STRING_TYPE:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f6953f);
                    break;
                case BOOLEAN_TYPE:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f6954g));
                    break;
                case DIMENSION_TYPE:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f6952e));
                    break;
            }
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(" Custom Attribute \"");
            sb.append(str2);
            sb.append("\" not found on ");
            sb.append(cls.getName());
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" must have a method ");
            sb2.append(str);
        } catch (InvocationTargetException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" Custom Attribute \"");
            sb3.append(str2);
            sb3.append("\" not found on ");
            sb3.append(cls.getName());
        }
    }

    /* renamed from: c */
    public String m5640c() {
        return this.f6949b;
    }

    /* renamed from: d */
    public a m5641d() {
        return this.f6950c;
    }

    /* renamed from: e */
    public float m5642e() {
        switch (this.f6950c) {
            case INT_TYPE:
                return this.f6951d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f6952e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f6954g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: f */
    public void m5643f(float[] fArr) {
        switch (this.f6950c) {
            case INT_TYPE:
                fArr[0] = this.f6951d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f6952e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.f6955h;
                int i2 = (i >> 24) & Constants.MAX_HOST_LENGTH;
                int i3 = (i >> 16) & Constants.MAX_HOST_LENGTH;
                int i4 = (i >> 8) & Constants.MAX_HOST_LENGTH;
                int i5 = i & Constants.MAX_HOST_LENGTH;
                float fPow = (float) Math.pow(i3 / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(i4 / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow(i5 / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f6954g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f6952e;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public boolean m5644g() {
        int iOrdinal = this.f6950c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    /* renamed from: h */
    public int m5645h() {
        int iOrdinal = this.f6950c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    /* renamed from: k */
    public void m5646k(Object obj) {
        switch (this.f6950c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f6951d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f6952e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f6955h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f6953f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f6954g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f6952e = ((Float) obj).floatValue();
                break;
        }
    }

    public C2004a(C2004a c2004a, Object obj) {
        this.f6948a = false;
        this.f6949b = c2004a.f6949b;
        this.f6950c = c2004a.f6950c;
        m5646k(obj);
    }
}
