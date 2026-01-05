package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.lifecycle.AbstractC2145n;
import java.util.concurrent.Executor;
import p001o.d72;
import p001o.m42;

/* loaded from: classes2.dex */
public final class gfj {

    /* renamed from: a */
    public final m42 f25081a;

    /* renamed from: b */
    public final Executor f25082b;

    /* renamed from: c */
    public final jfj f25083c;

    /* renamed from: d */
    public final hpb f25084d;

    /* renamed from: e */
    public final InterfaceC13704b f25085e;

    /* renamed from: f */
    public boolean f25086f = false;

    /* renamed from: g */
    public m42.InterfaceC15217c f25087g = new C13703a();

    /* renamed from: o.gfj$a */
    public class C13703a implements m42.InterfaceC15217c {
        public C13703a() {
        }

        @Override // p001o.m42.InterfaceC15217c
        /* renamed from: a */
        public boolean mo16542a(TotalCaptureResult totalCaptureResult) {
            gfj.this.f25085e.mo28562a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: o.gfj$b */
    public interface InterfaceC13704b {
        /* renamed from: a */
        void mo28562a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        float mo28563b();

        /* renamed from: c */
        void mo28564c();

        /* renamed from: d */
        float mo28565d();

        /* renamed from: e */
        void mo28566e(d72.C12801a c12801a);
    }

    public gfj(m42 m42Var, s82 s82Var, Executor executor) {
        this.f25081a = m42Var;
        this.f25082b = executor;
        InterfaceC13704b interfaceC13704bM28555b = m28555b(s82Var);
        this.f25085e = interfaceC13704bM28555b;
        jfj jfjVar = new jfj(interfaceC13704bM28555b.mo28565d(), interfaceC13704bM28555b.mo28563b());
        this.f25083c = jfjVar;
        jfjVar.m33772f(1.0f);
        this.f25084d = new hpb(rf8.m46655e(jfjVar));
        m42Var.m38320t(this.f25087g);
    }

    /* renamed from: b */
    public static InterfaceC13704b m28555b(s82 s82Var) {
        return m28557e(s82Var) ? new kf0(s82Var) : new uc4(s82Var);
    }

    /* renamed from: c */
    public static Range m28556c(s82 s82Var) {
        try {
            return (Range) s82Var.m47965a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e) {
            wja.m54639m("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m28557e(s82 s82Var) {
        return Build.VERSION.SDK_INT >= 30 && m28556c(s82Var) != null;
    }

    /* renamed from: a */
    public void m28558a(d72.C12801a c12801a) {
        this.f25085e.mo28566e(c12801a);
    }

    /* renamed from: d */
    public AbstractC2145n m28559d() {
        return this.f25084d;
    }

    /* renamed from: f */
    public void m28560f(boolean z) {
        ifj ifjVarM46655e;
        if (this.f25086f == z) {
            return;
        }
        this.f25086f = z;
        if (z) {
            return;
        }
        synchronized (this.f25083c) {
            this.f25083c.m33772f(1.0f);
            ifjVarM46655e = rf8.m46655e(this.f25083c);
        }
        m28561g(ifjVarM46655e);
        this.f25085e.mo28564c();
        this.f25081a.j0();
    }

    /* renamed from: g */
    public final void m28561g(ifj ifjVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f25084d.setValue(ifjVar);
        } else {
            this.f25084d.postValue(ifjVar);
        }
    }
}
