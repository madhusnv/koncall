package p001o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class ota {
    /* renamed from: a */
    public static TypedValue m42657a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m42658b(Context context, int i, boolean z) {
        TypedValue typedValueM42657a = m42657a(context, i);
        return (typedValueM42657a == null || typedValueM42657a.type != 18) ? z : typedValueM42657a.data != 0;
    }

    /* renamed from: c */
    public static int m42659c(Context context, int i, int i2) {
        TypedValue typedValueM42657a = m42657a(context, i);
        return (typedValueM42657a == null || typedValueM42657a.type != 16) ? i2 : typedValueM42657a.data;
    }

    /* renamed from: d */
    public static int m42660d(Context context, int i, String str) {
        return m42661e(context, i, str).data;
    }

    /* renamed from: e */
    public static TypedValue m42661e(Context context, int i, String str) {
        TypedValue typedValueM42657a = m42657a(context, i);
        if (typedValueM42657a != null) {
            return typedValueM42657a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: f */
    public static TypedValue m42662f(View view, int i) {
        return m42661e(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
