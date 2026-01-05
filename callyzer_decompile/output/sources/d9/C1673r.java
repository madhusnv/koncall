package d9;

import androidx.work.impl.WorkDatabase;
import c9.C0914i;
import c9.C0925t;
import t8.C7077w;
import u8.C7356d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.r */
/* loaded from: classes.dex */
public final class C1673r {

    /* renamed from: a */
    public final C0914i f8203a;

    /* renamed from: b */
    public final C7356d f8204b;

    /* renamed from: c */
    public final C0925t f8205c;

    static {
        C7077w.m13372b("WMFgUpdater");
    }

    public C1673r(WorkDatabase workDatabase, C7356d c7356d, C0914i c0914i) {
        this.f8204b = c7356d;
        this.f8203a = c0914i;
        this.f8205c = workDatabase.mo1368C();
    }
}
