package p001o;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import p001o.d72;
import p001o.g32;
import p001o.m42;
import p001o.mq3;

/* loaded from: classes2.dex */
public class fp6 {

    /* renamed from: a */
    public final m42 f23892a;

    /* renamed from: b */
    public final gp6 f23893b;

    /* renamed from: c */
    public final Executor f23894c;

    /* renamed from: d */
    public boolean f23895d = false;

    /* renamed from: e */
    public g32.C13614a f23896e;

    /* renamed from: f */
    public m42.InterfaceC15217c f23897f;

    public fp6(m42 m42Var, s82 s82Var, Executor executor) {
        this.f23892a = m42Var;
        this.f23893b = new gp6(s82Var, 0);
        this.f23894c = executor;
    }

    /* renamed from: a */
    public final void m27316a() {
        g32.C13614a c13614a = this.f23896e;
        if (c13614a != null) {
            c13614a.m28008f(new y82("Cancelled by another setExposureCompensationIndex()"));
            this.f23896e = null;
        }
        m42.InterfaceC15217c interfaceC15217c = this.f23897f;
        if (interfaceC15217c != null) {
            this.f23892a.a0(interfaceC15217c);
            this.f23897f = null;
        }
    }

    /* renamed from: b */
    public void m27317b(boolean z) {
        if (z == this.f23895d) {
            return;
        }
        this.f23895d = z;
        if (z) {
            return;
        }
        this.f23893b.m29270b(0);
        m27316a();
    }

    /* renamed from: c */
    public void m27318c(d72.C12801a c12801a) {
        c12801a.m22396g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f23893b.m29269a()), mq3.EnumC15404c.REQUIRED);
    }
}
