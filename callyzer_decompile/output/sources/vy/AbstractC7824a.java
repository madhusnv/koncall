package vy;

import az.C0505a;
import wy.C8229d;
import wy.InterfaceC8228c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7824a {

    /* renamed from: a */
    public InterfaceC8228c f37532a = new C8229d();

    /* renamed from: b */
    public C0505a f37533b = null;

    /* renamed from: c */
    public int f37534c = 8;

    /* renamed from: d */
    public long f37535d = -1;

    /* renamed from: e */
    public boolean f37536e;

    /* renamed from: f */
    public boolean f37537f;

    /* renamed from: a */
    public void mo14801a(InterfaceC8228c interfaceC8228c, C0505a c0505a) {
        this.f37532a = interfaceC8228c;
        this.f37533b = c0505a;
        this.f37534c = interfaceC8228c.mo15402f();
        this.f37536e = this.f37533b != null && c0505a.f3562e;
        if (interfaceC8228c.mo14711d() > 0) {
            this.f37534c = interfaceC8228c.mo14711d();
            this.f37537f = true;
        }
    }
}
