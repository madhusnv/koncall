package cg;

import android.os.IBinder;
import android.os.IInterface;
import ig.AbstractBinderC3252h;
import java.lang.reflect.Field;
import mm.AbstractC4801l;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cg.b */
/* loaded from: classes.dex */
public final class BinderC0969b extends AbstractBinderC3252h implements InterfaceC0968a {

    /* renamed from: f */
    public final Object f5780f;

    public BinderC0969b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.f5780f = obj;
    }

    /* renamed from: R */
    public static InterfaceC0968a m2726R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0968a ? (InterfaceC0968a) iInterfaceQueryLocalInterface : new C0970c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    /* renamed from: S */
    public static Object m2727S(InterfaceC0968a interfaceC0968a) throws SecurityException {
        if (interfaceC0968a instanceof BinderC0969b) {
            return ((BinderC0969b) interfaceC0968a).f5780f;
        }
        IBinder iBinderAsBinder = interfaceC0968a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        AbstractC6840z.m13036g(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
