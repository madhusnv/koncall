package rf;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h0;
import e1.C1904f;
import java.util.concurrent.atomic.AtomicReference;
import pf.C5902b;
import pf.C5905e;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC6508m implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final Object f31245a;

    /* renamed from: b */
    public volatile boolean f31246b;

    /* renamed from: c */
    public final AtomicReference f31247c;

    /* renamed from: d */
    public final h0 f31248d;

    /* renamed from: e */
    public final C5905e f31249e;

    /* renamed from: f */
    public final C1904f f31250f;

    /* renamed from: g */
    public final C6500e f31251g;

    public DialogInterfaceOnCancelListenerC6508m(InterfaceC6502g interfaceC6502g, C6500e c6500e) {
        C5905e c5905e = C5905e.f28746d;
        this.f31245a = interfaceC6502g;
        this.f31247c = new AtomicReference(null);
        this.f31248d = new h0(Looper.getMainLooper(), 1);
        this.f31249e = c5905e;
        this.f31250f = new C1904f(0);
        this.f31251g = c6500e;
        interfaceC6502g.mo12521a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rf.g] */
    /* renamed from: a */
    public final Activity m12525a() {
        Activity activityMo12523c = this.f31245a.mo12523c();
        AbstractC6840z.m13036g(activityMo12523c);
        return activityMo12523c;
    }

    /* renamed from: b */
    public final void m12526b(Bundle bundle) {
        if (bundle != null) {
            this.f31247c.set(bundle.getBoolean("resolving_error", false) ? new d0(new C5902b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: c */
    public final void m12527c() {
        this.f31246b = false;
        C6500e c6500e = this.f31251g;
        c6500e.getClass();
        synchronized (C6500e.f31221t) {
            try {
                if (c6500e.f31233l == this) {
                    c6500e.f31233l = null;
                    c6500e.f31234m.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m12528d() {
        if (this.f31250f.isEmpty()) {
            return;
        }
        this.f31251g.m12516b(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C5902b c5902b = new C5902b(13, null);
        AtomicReference atomicReference = this.f31247c;
        d0 d0Var = (d0) atomicReference.get();
        int i10 = d0Var == null ? -1 : d0Var.f31217a;
        atomicReference.set(null);
        this.f31251g.m12520h(c5902b, i10);
    }
}
