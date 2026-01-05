package androidx.camera.extensions;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import c0.InterfaceC0824q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.camera.extensions.a */
/* loaded from: classes.dex */
public final class C0225a {

    /* renamed from: a */
    public static final Object f1860a = new Object();

    /* renamed from: b */
    public static C0225a f1861b;

    /* renamed from: a */
    public static C0225a m614a(InterfaceC0824q interfaceC0824q, Context context) {
        synchronized (f1860a) {
            try {
                C0225a c0225a = f1861b;
                if (c0225a != null) {
                    return c0225a;
                }
                C0225a c0225a2 = new C0225a();
                if (Build.VERSION.SDK_INT >= 31) {
                    CameraManager cameraManager = (CameraManager) context.getSystemService(CameraManager.class);
                    AbstractC4154l.m8923f(cameraManager, "cameraManager");
                    new LinkedHashMap();
                    new LinkedHashMap();
                    new LinkedHashMap();
                }
                interfaceC0824q.mo2224a();
                f1861b = c0225a2;
                return c0225a2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
