package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import java.lang.reflect.InvocationTargetException;
import p001o.vti;

/* loaded from: classes2.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(vti vtiVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(vtiVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, vti vtiVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, vtiVar);
    }
}
