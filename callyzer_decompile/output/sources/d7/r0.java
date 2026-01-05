package d7;

import android.os.Bundle;
import aw.C0465e;
import g8.C2545e;
import g8.InterfaceC2544d;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.fg;
import og.nd;
import p004e.C1870e;
import pg.n7;
import qw.C6361k;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 implements InterfaceC2544d {

    /* renamed from: a */
    public final C2545e f8128a;

    /* renamed from: b */
    public boolean f8129b;

    /* renamed from: c */
    public Bundle f8130c;

    /* renamed from: d */
    public final C6366p f8131d;

    public r0(C2545e savedStateRegistry, c1 c1Var) {
        AbstractC4154l.m8923f(savedStateRegistry, "savedStateRegistry");
        this.f8128a = savedStateRegistry;
        this.f8131d = nd.m10782c(new C0465e(6, c1Var));
    }

    @Override // g8.InterfaceC2544d
    /* renamed from: a */
    public final Bundle mo1205a() {
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        Bundle bundle = this.f8130c;
        if (bundle != null) {
            bundleM11799a.putAll(bundle);
        }
        for (Map.Entry entry : ((s0) this.f8131d.getValue()).f8132b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo1205a = ((C1870e) ((n0) entry.getValue()).f8119b.f268e).mo1205a();
            if (!bundleMo1205a.isEmpty()) {
                fg.m10658d(bundleM11799a, str, bundleMo1205a);
            }
        }
        this.f8129b = false;
        return bundleM11799a;
    }

    /* renamed from: b */
    public final void m5347b() {
        if (this.f8129b) {
            return;
        }
        Bundle bundleM6563a = this.f8128a.m6563a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        Bundle bundle = this.f8130c;
        if (bundle != null) {
            bundleM11799a.putAll(bundle);
        }
        if (bundleM6563a != null) {
            bundleM11799a.putAll(bundleM6563a);
        }
        this.f8130c = bundleM11799a;
        this.f8129b = true;
    }
}
