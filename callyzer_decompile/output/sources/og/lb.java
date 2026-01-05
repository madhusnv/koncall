package og;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Field;
import jn.InterfaceC3804c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class lb {

    /* renamed from: a */
    public static Field f26619a;

    /* renamed from: b */
    public static boolean f26620b;

    /* renamed from: a */
    public static final Object m10745a(Activity activity) {
        AbstractC4154l.m8923f(activity, "activity");
        return o1.m10790b(InterfaceC3804c.class, activity);
    }

    /* renamed from: b */
    public void mo10746b(int i10, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f26620b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f26619a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f26620b = true;
        }
        Field field = f26619a;
        if (field != null) {
            try {
                f26619a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
