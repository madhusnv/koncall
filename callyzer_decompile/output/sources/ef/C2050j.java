package ef;

import android.content.Context;
import ph.C5950e;
import pw.InterfaceC6043a;
import ug.C7439j;
import ye.C8640e;
import ye.C8641f;
import yk.C8687a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.j */
/* loaded from: classes.dex */
public final class C2050j implements InterfaceC8945b {

    /* renamed from: a */
    public final /* synthetic */ int f9628a;

    /* renamed from: b */
    public final InterfaceC6043a f9629b;

    /* renamed from: c */
    public final InterfaceC6043a f9630c;

    public /* synthetic */ C2050j(InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, int i10) {
        this.f9628a = i10;
        this.f9629b = interfaceC6043a;
        this.f9630c = interfaceC6043a2;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f9628a) {
            case 0:
                return new C2049i(new C8687a(14), new C5950e(14), C2041a.f9607f, (C2052l) this.f9629b.get(), this.f9630c);
            default:
                return new C8641f((Context) ((C8640e) this.f9629b).f41923b, (C7439j) ((C8640e) this.f9630c).get());
        }
    }
}
