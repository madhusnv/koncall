package p001o;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.c92;

/* loaded from: classes2.dex */
public abstract class k92 implements c92.InterfaceC12590a {

    /* renamed from: a */
    public final CameraDevice f31656a;

    /* renamed from: b */
    public final Object f31657b;

    /* renamed from: o.k92$a */
    public static class C14738a {

        /* renamed from: a */
        public final Handler f31658a;

        public C14738a(Handler handler) {
            this.f31658a = handler;
        }
    }

    public k92(CameraDevice cameraDevice, Object obj) {
        this.f31656a = (CameraDevice) fgd.m26663g(cameraDevice);
        this.f31657b = obj;
    }

    /* renamed from: b */
    public static void m35182b(CameraDevice cameraDevice, List list) {
        String id = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM23032c = ((dgc) it.next()).m23032c();
            if (strM23032c != null && !strM23032c.isEmpty()) {
                wja.m54638l("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + strM23032c + ". Ignoring.");
            }
        }
    }

    /* renamed from: c */
    public static void m35183c(CameraDevice cameraDevice, dhf dhfVar) {
        fgd.m26663g(cameraDevice);
        fgd.m26663g(dhfVar);
        fgd.m26663g(dhfVar.m23142e());
        List listM23140c = dhfVar.m23140c();
        if (listM23140c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (dhfVar.m23138a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        m35182b(cameraDevice, listM23140c);
    }

    /* renamed from: d */
    public static List m35184d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dgc) it.next()).m23033d());
        }
        return arrayList;
    }
}
