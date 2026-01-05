package yx;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import mx.AbstractC4913i;
import ux.AbstractC7570d;
import ux.C7567a;
import ux.C7569c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.m */
/* loaded from: classes3.dex */
public abstract class AbstractC8819m {

    /* renamed from: a */
    public static final C7569c f42514a;

    static {
        String property;
        int i10 = AbstractC8825s.f42520a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC4913i.m9813i(AbstractC4913i.m9806b(Arrays.asList(new C7567a()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((C7567a) next).getClass();
                    do {
                        ((C7567a) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((C7567a) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            f42514a = new C7569c(AbstractC7570d.m14304a(mainLooper));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
