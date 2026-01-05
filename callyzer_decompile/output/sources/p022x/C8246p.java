package p022x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import k0.ExecutorC3900j;
import p020v.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.p */
/* loaded from: classes.dex */
public final class C8246p implements InterfaceC8248r {

    /* renamed from: a */
    public final SessionConfiguration f39388a;

    /* renamed from: b */
    public final List f39389b;

    public C8246p(int i10, ArrayList arrayList, ExecutorC3900j executorC3900j, f0 f0Var) {
        C8238h c8238h;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i10, C8249s.m15429a(arrayList), executorC3900j, f0Var);
        this.f39388a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                c8238h = null;
            } else {
                int i11 = Build.VERSION.SDK_INT;
                c8238h = new C8238h(i11 >= 33 ? new C8245o(outputConfiguration) : i11 >= 28 ? new C8244n(new C8243m(outputConfiguration)) : i11 >= 26 ? new C8242l(new C8241k(outputConfiguration)) : new C8240j(new C8239i(outputConfiguration)));
            }
            arrayList2.add(c8238h);
        }
        this.f39389b = Collections.unmodifiableList(arrayList2);
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: a */
    public final Object mo15421a() {
        return this.f39388a;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: b */
    public final C8237g mo15422b() {
        return C8237g.m15410a(this.f39388a.getInputConfiguration());
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: c */
    public final Executor mo15423c() {
        return this.f39388a.getExecutor();
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: d */
    public final int mo15424d() {
        return this.f39388a.getSessionType();
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: e */
    public final CameraCaptureSession.StateCallback mo15425e() {
        return this.f39388a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8246p) {
            return Objects.equals(this.f39388a, ((C8246p) obj).f39388a);
        }
        return false;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: f */
    public final List mo15426f() {
        return this.f39389b;
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: g */
    public final void mo15427g(CaptureRequest captureRequest) {
        this.f39388a.setSessionParameters(captureRequest);
    }

    @Override // p022x.InterfaceC8248r
    /* renamed from: h */
    public final void mo15428h(C8237g c8237g) {
        this.f39388a.setInputConfiguration(c8237g.f39376a.f39375a);
    }

    public final int hashCode() {
        return this.f39388a.hashCode();
    }
}
