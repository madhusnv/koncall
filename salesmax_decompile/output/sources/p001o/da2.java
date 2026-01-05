package p001o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p001o.c92;
import p001o.z92;

/* loaded from: classes2.dex */
public class da2 implements z92.InterfaceC18583b {

    /* renamed from: a */
    public final CameraManager f19451a;

    /* renamed from: b */
    public final Object f19452b;

    /* renamed from: o.da2$a */
    public static final class C12850a {

        /* renamed from: a */
        public final Map f19453a = new HashMap();

        /* renamed from: b */
        public final Handler f19454b;

        public C12850a(Handler handler) {
            this.f19454b = handler;
        }
    }

    public da2(Context context, Object obj) {
        this.f19451a = (CameraManager) context.getSystemService("camera");
        this.f19452b = obj;
    }

    /* renamed from: h */
    public static da2 m22645h(Context context, Handler handler) {
        return new da2(context, new C12850a(handler));
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: a */
    public void mo16711a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        z92.C18582a c18582a;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        C12850a c12850a = (C12850a) this.f19452b;
        if (availabilityCallback != null) {
            synchronized (c12850a.f19453a) {
                c18582a = (z92.C18582a) c12850a.f19453a.get(availabilityCallback);
                if (c18582a == null) {
                    c18582a = new z92.C18582a(executor, availabilityCallback);
                    c12850a.f19453a.put(availabilityCallback, c18582a);
                }
            }
        } else {
            c18582a = null;
        }
        this.f19451a.registerAvailabilityCallback(c18582a, c12850a.f19454b);
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: b */
    public CameraCharacteristics mo16712b(String str) throws h72 {
        try {
            return this.f19451a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: c */
    public Set mo20544c() {
        return Collections.emptySet();
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: d */
    public void mo16713d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws h72, CameraAccessException {
        fgd.m26663g(executor);
        fgd.m26663g(stateCallback);
        try {
            this.f19451a.openCamera(str, new c92.C12591b(executor, stateCallback), ((C12850a) this.f19452b).f19454b);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: e */
    public String[] mo22646e() throws h72 {
        try {
            return this.f19451a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        }
    }

    @Override // p001o.z92.InterfaceC18583b
    /* renamed from: f */
    public void mo16714f(CameraManager.AvailabilityCallback availabilityCallback) {
        z92.C18582a c18582a;
        if (availabilityCallback != null) {
            C12850a c12850a = (C12850a) this.f19452b;
            synchronized (c12850a.f19453a) {
                c18582a = (z92.C18582a) c12850a.f19453a.remove(availabilityCallback);
            }
        } else {
            c18582a = null;
        }
        if (c18582a != null) {
            c18582a.m58964g();
        }
        this.f19451a.unregisterAvailabilityCallback(c18582a);
    }
}
