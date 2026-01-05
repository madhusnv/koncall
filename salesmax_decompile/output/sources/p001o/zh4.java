package p001o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.C2004a;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class zh4 {

    /* renamed from: o.zh4$a */
    public static /* synthetic */ class C18635a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57189a;

        static {
            int[] iArr = new int[C2004a.a.values().length];
            f57189a = iArr;
            try {
                iArr[C2004a.a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57189a[C2004a.a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57189a[C2004a.a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57189a[C2004a.a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57189a[C2004a.a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57189a[C2004a.a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57189a[C2004a.a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static int m59401a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + Constants.MAX_HOST_LENGTH;
    }

    /* renamed from: b */
    public static void m59402b(C2004a c2004a, View view, float[] fArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        String str = "set" + c2004a.m5640c();
        try {
            boolean z = true;
            switch (C18635a.f57189a[c2004a.m5641d().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM59401a = (m59401a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m59401a((int) (fArr[3] * 255.0f)) << 24) | (m59401a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m59401a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM59401a);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m59401a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m59401a((int) (fArr[3] * 255.0f)) << 24) | (m59401a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m59401a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + c2004a.m5640c());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot access method ");
            sb.append(str);
            sb.append(" on View \"");
            sb.append(k75.m35105d(view));
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No method ");
            sb2.append(str);
            sb2.append(" on View \"");
            sb2.append(k75.m35105d(view));
            sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        } catch (InvocationTargetException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot invoke method ");
            sb3.append(str);
            sb3.append(" on View \"");
            sb3.append(k75.m35105d(view));
            sb3.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
    }
}
