package p001o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.mq3;
import p001o.rd2;

/* loaded from: classes2.dex */
public abstract class x62 {

    /* renamed from: o.x62$a */
    public static class C18062a {
        /* renamed from: a */
        public static CaptureRequest.Builder m55688a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    /* renamed from: a */
    public static void m55681a(cd2 cd2Var, CaptureRequest.Builder builder) {
        if (cd2Var.m20883e().equals(k7g.f31605a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, cd2Var.m20883e());
    }

    /* renamed from: b */
    public static void m55682b(CaptureRequest.Builder builder, mq3 mq3Var) {
        rd2 rd2VarM46540d = rd2.C16591a.m46538e(mq3Var).m46540d();
        for (mq3.AbstractC15402a abstractC15402a : rd2VarM46540d.mo36956b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) abstractC15402a.mo28032d();
            try {
                builder.set(key, rd2VarM46540d.mo36960f(abstractC15402a));
            } catch (IllegalArgumentException unused) {
                wja.m54629c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: c */
    public static void m55683c(CaptureRequest.Builder builder, int i, meh mehVar) {
        for (Map.Entry entry : mehVar.m38863a(i).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: d */
    public static void m55684d(cd2 cd2Var, CaptureRequest.Builder builder) {
        if (cd2Var.m20886h() == 1 || cd2Var.m20890l() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (cd2Var.m20886h() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (cd2Var.m20890l() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    /* renamed from: e */
    public static CaptureRequest m55685e(cd2 cd2Var, CameraDevice cameraDevice, Map map, boolean z, meh mehVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List listM55687g = m55687g(cd2Var.m20887i(), map);
        if (listM55687g.isEmpty()) {
            return null;
        }
        u72 u72VarM20882d = cd2Var.m20882d();
        if (cd2Var.m20889k() == 5 && u72VarM20882d != null && (u72VarM20882d.mo46192e() instanceof TotalCaptureResult)) {
            wja.m54627a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = C18062a.m55688a(cameraDevice, (TotalCaptureResult) u72VarM20882d.mo46192e());
        } else {
            wja.m54627a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (cd2Var.m20889k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(cd2Var.m20889k());
            }
        }
        m55683c(builderCreateCaptureRequest, cd2Var.m20889k(), mehVar);
        m55681a(cd2Var, builderCreateCaptureRequest);
        m55684d(cd2Var, builderCreateCaptureRequest);
        mq3 mq3VarM20885g = cd2Var.m20885g();
        mq3.AbstractC15402a abstractC15402a = cd2.f17857i;
        if (mq3VarM20885g.mo36957c(abstractC15402a)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) cd2Var.m20885g().mo36960f(abstractC15402a));
        }
        mq3 mq3VarM20885g2 = cd2Var.m20885g();
        mq3.AbstractC15402a abstractC15402a2 = cd2.f17858j;
        if (mq3VarM20885g2.mo36957c(abstractC15402a2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) cd2Var.m20885g().mo36960f(abstractC15402a2)).byteValue()));
        }
        m55682b(builderCreateCaptureRequest, cd2Var.m20885g());
        Iterator it = listM55687g.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(cd2Var.m20888j());
        return builderCreateCaptureRequest.build();
    }

    /* renamed from: f */
    public static CaptureRequest m55686f(cd2 cd2Var, CameraDevice cameraDevice, meh mehVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        wja.m54627a("Camera2CaptureRequestBuilder", "template type = " + cd2Var.m20889k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(cd2Var.m20889k());
        m55683c(builderCreateCaptureRequest, cd2Var.m20889k(), mehVar);
        m55682b(builderCreateCaptureRequest, cd2Var.m20885g());
        return builderCreateCaptureRequest.build();
    }

    /* renamed from: g */
    public static List m55687g(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((yj5) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
