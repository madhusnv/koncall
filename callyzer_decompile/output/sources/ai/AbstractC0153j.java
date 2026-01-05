package ai;

import ei.C2055a;
import i0.m0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.j */
/* loaded from: classes.dex */
public abstract class AbstractC0153j {

    /* renamed from: a */
    public static final CopyOnWriteArrayList f486a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static C2055a m357a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        Iterator it = f486a.iterator();
        while (it.hasNext()) {
            C2055a c2055a = (C2055a) it.next();
            synchronized (c2055a) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return c2055a;
            }
        }
        throw new GeneralSecurityException(m0.m7378k("No KMS client does support: ", str));
    }
}
