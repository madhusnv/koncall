package g8;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import og.fg;
import pg.n7;
import qw.C6361k;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g8.a */
/* loaded from: classes.dex */
public final class C2541a implements InterfaceC2544d {

    /* renamed from: a */
    public final LinkedHashSet f13871a = new LinkedHashSet();

    public C2541a(C2545e c2545e) {
        c2545e.m6565c("androidx.savedstate.Restarter", this);
    }

    @Override // g8.InterfaceC2544d
    /* renamed from: a */
    public final Bundle mo1205a() {
        Bundle bundleM11799a = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        fg.m10660f(bundleM11799a, "classes_to_restore", AbstractC6663m.c0(this.f13871a));
        return bundleM11799a;
    }
}
