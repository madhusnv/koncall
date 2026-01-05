package mk;

import ad.C0109p;
import android.hardware.camera2.params.DynamicRangeProfiles;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import nc.AbstractC5005p;
import nc.C5003n;
import nc.InterfaceC5007r;
import p020v.x0;
import qi.C6230m;
import qi.InterfaceC6222e;
import qi.InterfaceC6223f;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import ri.EnumC6554l;
import x4.C8299i;
import x4.InterfaceC8300j;
import yg.InterfaceC8647d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C4764c implements InterfaceC4777p, InterfaceC5007r, InterfaceC6223f, InterfaceC6236a, InterfaceC6222e, InterfaceC8647d, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f23771a;

    public /* synthetic */ C4764c(int i10) {
        this.f23771a = i10;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles m9683c(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        c8299i.m15509d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @Override // nc.InterfaceC5007r
    /* renamed from: a */
    public AbstractC5005p mo9129a(C0109p c0109p) {
        return C5003n.f24757a;
    }

    @Override // qi.InterfaceC6223f
    /* renamed from: b */
    public List mo1987b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        switch (this.f23771a) {
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7134a.get();
            case 5:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7136c.get();
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7135b.get();
            case 7:
                C6230m c6230m = ExecutorsRegistrar.f7134a;
                return EnumC6554l.INSTANCE;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(x0Var);
        }
    }

    @Override // mk.InterfaceC4777p
    /* renamed from: i */
    public Object mo28i() {
        return new ArrayDeque();
    }

    @Override // qj.InterfaceC6236a
    /* renamed from: e */
    public void mo19e(InterfaceC6237b interfaceC6237b) {
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
    }
}
