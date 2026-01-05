package pg;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import b0.C0515g;
import i0.C3076g;
import i0.C3082m;
import i0.InterfaceC3093x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y5 {
    /* renamed from: a */
    public static void m11938a(i0.q0 q0Var, CaptureRequest.Builder builder) {
        Range rangeM7410a = q0Var.m7410a();
        if (!rangeM7410a.equals(C3082m.f16521h)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeM7410a);
        }
        rangeM7410a.toString();
        og.u1.m10942a("Camera2CaptureRequestBuilder");
    }

    /* renamed from: b */
    public static void m11939b(CaptureRequest.Builder builder, i0.o1 o1Var) {
        C8989c c8989cM1515c = C0515g.m1512d(o1Var).m1515c();
        for (C3076g c3076g : c8989cM1515c.mo7403h()) {
            CaptureRequest.Key key = (CaptureRequest.Key) c3076g.f16462c;
            try {
                builder.set(key, c8989cM1515c.mo7406k(c3076g));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                og.u1.m10943b("Camera2CaptureRequestBuilder");
            }
        }
    }

    /* renamed from: c */
    public static void m11940c(CaptureRequest.Builder builder, int i10, o1.g0 g0Var) {
        Map mapUnmodifiableMap;
        if (i10 == 3 && g0Var.f25733a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i10 != 4) {
                g0Var.getClass();
            } else if (g0Var.f25734b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: d */
    public static CaptureRequest m11941d(i0.q0 q0Var, CameraDevice cameraDevice, HashMap map, boolean z6, o1.g0 g0Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        Integer num = null;
        if (cameraDevice != null) {
            ArrayList arrayList = q0Var.f16565a;
            int i10 = q0Var.f16567c;
            i0.o1 o1Var = q0Var.f16566b;
            TreeMap treeMap = o1Var.f16550a;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((i0.v0) it.next());
                if (surface == null) {
                    throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC3093x interfaceC3093x = q0Var.f16571g;
                if (i10 == 5 && interfaceC3093x != null && (interfaceC3093x.mo7429n() instanceof TotalCaptureResult)) {
                    og.u1.m10942a("Camera2CaptureRequestBuilder");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC3093x.mo7429n());
                } else {
                    og.u1.m10942a("Camera2CaptureRequestBuilder");
                    if (i10 == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z6 ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i10);
                    }
                }
                m11940c(builderCreateCaptureRequest, i10, g0Var);
                m11938a(q0Var, builderCreateCaptureRequest);
                int i11 = 0;
                if (q0Var.m7411b() == 1 || q0Var.m7412c() == 1) {
                    num = 0;
                } else if (q0Var.m7411b() == 2) {
                    num = 2;
                } else if (q0Var.m7412c() == 2) {
                    num = 1;
                }
                if (num != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num);
                }
                og.u1.m10942a("Camera2CaptureRequestBuilder");
                C3076g c3076g = i0.q0.f16562h;
                if (treeMap.containsKey(c3076g)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) o1Var.mo7406k(c3076g));
                }
                C3076g c3076g2 = i0.q0.f16563i;
                if (treeMap.containsKey(c3076g2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) o1Var.mo7406k(c3076g2)).byteValue()));
                }
                m11939b(builderCreateCaptureRequest, o1Var);
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    builderCreateCaptureRequest.addTarget((Surface) obj);
                }
                builderCreateCaptureRequest.setTag(q0Var.f16570f);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static CaptureRequest m11942e(i0.q0 q0Var, CameraDevice cameraDevice, o1.g0 g0Var) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        int i10 = q0Var.f16567c;
        og.u1.m10942a("Camera2CaptureRequestBuilder");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i10);
        m11940c(builderCreateCaptureRequest, i10, g0Var);
        m11938a(q0Var, builderCreateCaptureRequest);
        m11939b(builderCreateCaptureRequest, q0Var.f16566b);
        return builderCreateCaptureRequest.build();
    }

    /* renamed from: f */
    public static boolean m11943f(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }
}
