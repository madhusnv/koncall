package p011m;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m.b */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC4604b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f22775c = {MenuItem.class};

    /* renamed from: a */
    public Object f22776a;

    /* renamed from: b */
    public Method f22777b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f22776a;
        Method method = this.f22777b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
