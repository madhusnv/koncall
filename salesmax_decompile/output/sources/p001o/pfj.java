package p001o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.C1894d;
import androidx.camera.core.C1895e;
import androidx.camera.core.InterfaceC1893c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p001o.bhf;
import p001o.zd8;

/* loaded from: classes2.dex */
public final class pfj implements lfj {

    /* renamed from: a */
    public final s82 f40009a;

    /* renamed from: b */
    public final qfj f40010b;

    /* renamed from: c */
    public boolean f40011c = false;

    /* renamed from: d */
    public boolean f40012d = false;

    /* renamed from: e */
    public boolean f40013e;

    /* renamed from: f */
    public boolean f40014f;

    /* renamed from: g */
    public C1895e f40015g;

    /* renamed from: h */
    public j72 f40016h;

    /* renamed from: i */
    public yj5 f40017i;

    /* renamed from: j */
    public ImageWriter f40018j;

    /* renamed from: o.pfj$a */
    public class C16106a extends CameraCaptureSession.StateCallback {
        public C16106a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                pfj.this.f40018j = qe8.m45272a(inputSurface, 1);
            }
        }
    }

    public pfj(s82 s82Var) {
        this.f40013e = false;
        this.f40014f = false;
        this.f40009a = s82Var;
        this.f40013e = rfj.m46676a(s82Var, 4);
        this.f40014f = zq5.m59712b(ZslDisablerQuirk.class) != null;
        this.f40010b = new qfj(3, new cue() { // from class: o.ofj
            @Override // p001o.cue
            /* renamed from: a */
            public final void mo21835a(Object obj) {
                ((InterfaceC1893c) obj).close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m43594m(zd8 zd8Var) {
        try {
            InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
            if (interfaceC1893cMo4669c != null) {
                this.f40010b.m45368d(interfaceC1893cMo4669c);
            }
        } catch (IllegalStateException e) {
            wja.m54629c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // p001o.lfj
    /* renamed from: a */
    public void mo37131a(bhf.C12402b c12402b) {
        m43596j();
        if (this.f40011c) {
            c12402b.m19060x(1);
            return;
        }
        if (this.f40014f) {
            c12402b.m19060x(1);
            return;
        }
        Map mapM43597k = m43597k(this.f40009a);
        if (!this.f40013e || mapM43597k.isEmpty() || !mapM43597k.containsKey(34) || !m43598l(this.f40009a, 34)) {
            c12402b.m19060x(1);
            return;
        }
        Size size = (Size) mapM43597k.get(34);
        C1894d c1894d = new C1894d(size.getWidth(), size.getHeight(), 34, 9);
        this.f40016h = c1894d.m4677n();
        this.f40015g = new C1895e(c1894d);
        c1894d.mo4673g(new zd8.InterfaceC18614a() { // from class: o.mfj
            @Override // p001o.zd8.InterfaceC18614a
            /* renamed from: a */
            public final void mo27818a(zd8 zd8Var) {
                this.f35366a.m43594m(zd8Var);
            }
        }, gb2.m28294b());
        hf8 hf8Var = new hf8(this.f40015g.mo4668a(), new Size(this.f40015g.getWidth(), this.f40015g.getHeight()), 34);
        this.f40017i = hf8Var;
        C1895e c1895e = this.f40015g;
        zfa zfaVarM57873k = hf8Var.m57873k();
        Objects.requireNonNull(c1895e);
        zfaVarM57873k.addListener(new nfj(c1895e), gb2.m28295c());
        c12402b.m19049l(this.f40017i);
        c12402b.m19042e(this.f40016h);
        c12402b.m19048k(new C16106a());
        c12402b.m19057u(new InputConfiguration(this.f40015g.getWidth(), this.f40015g.getHeight(), this.f40015g.mo4670d()));
    }

    @Override // p001o.lfj
    /* renamed from: b */
    public boolean mo37132b() {
        return this.f40011c;
    }

    @Override // p001o.lfj
    /* renamed from: c */
    public void mo37133c(boolean z) {
        this.f40012d = z;
    }

    @Override // p001o.lfj
    /* renamed from: d */
    public void mo37134d(boolean z) {
        this.f40011c = z;
    }

    @Override // p001o.lfj
    /* renamed from: e */
    public InterfaceC1893c mo37135e() {
        try {
            return (InterfaceC1893c) this.f40010b.m58031a();
        } catch (NoSuchElementException unused) {
            wja.m54629c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // p001o.lfj
    /* renamed from: f */
    public boolean mo37136f(InterfaceC1893c interfaceC1893c) {
        Image imageJ2 = interfaceC1893c.J2();
        ImageWriter imageWriter = this.f40018j;
        if (imageWriter != null && imageJ2 != null) {
            try {
                qe8.m45273b(imageWriter, imageJ2);
                return true;
            } catch (IllegalStateException e) {
                wja.m54629c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
            }
        }
        return false;
    }

    @Override // p001o.lfj
    /* renamed from: g */
    public boolean mo37137g() {
        return this.f40012d;
    }

    /* renamed from: j */
    public final void m43596j() {
        qfj qfjVar = this.f40010b;
        while (!qfjVar.m58033c()) {
            ((InterfaceC1893c) qfjVar.m58031a()).close();
        }
        yj5 yj5Var = this.f40017i;
        if (yj5Var != null) {
            C1895e c1895e = this.f40015g;
            if (c1895e != null) {
                yj5Var.m57873k().addListener(new nfj(c1895e), gb2.m28295c());
                this.f40015g = null;
            }
            yj5Var.mo30396d();
            this.f40017i = null;
        }
        ImageWriter imageWriter = this.f40018j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f40018j = null;
        }
    }

    /* renamed from: k */
    public final Map m43597k(s82 s82Var) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) s82Var.m47965a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            wja.m54629c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new nk3(true));
                map.put(Integer.valueOf(i), inputSizes[0]);
            }
        }
        return map;
    }

    /* renamed from: l */
    public final boolean m43598l(s82 s82Var, int i) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) s82Var.m47965a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i)) == null) {
            return false;
        }
        for (int i2 : validOutputFormatsForInput) {
            if (i2 == 256) {
                return true;
            }
        }
        return false;
    }
}
