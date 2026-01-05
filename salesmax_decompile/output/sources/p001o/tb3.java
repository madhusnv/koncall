package p001o;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public abstract class tb3 {
    /* renamed from: a */
    public static final void m49666a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                cl6.m21376a(th, th2);
            }
        }
    }
}
