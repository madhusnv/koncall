package p018t;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;
import p020v.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C6971b {
    /* renamed from: a */
    public static a0 m13249a(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new a0(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }
}
