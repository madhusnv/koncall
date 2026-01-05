package of;

import android.util.Log;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.f */
/* loaded from: classes.dex */
public final class C5351f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z6) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z6);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return C5352g.class;
    }
}
