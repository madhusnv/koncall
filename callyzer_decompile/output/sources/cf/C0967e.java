package cf;

import a1.C0005d;
import android.content.Context;
import df.C1703b;
import df.C1710i;
import df.C1711j;
import ef.InterfaceC2044d;
import io.C3328c;
import ph.C5950e;
import pw.InterfaceC6043a;
import wj.C8090p;
import xe.C8365q;
import yk.C8687a;
import ze.InterfaceC8945b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cf.e */
/* loaded from: classes.dex */
public final class C0967e implements InterfaceC8945b {

    /* renamed from: a */
    public final /* synthetic */ int f5776a;

    /* renamed from: b */
    public final InterfaceC6043a f5777b;

    /* renamed from: c */
    public final InterfaceC6043a f5778c;

    /* renamed from: d */
    public final InterfaceC8945b f5779d;

    public /* synthetic */ C0967e(InterfaceC6043a interfaceC6043a, InterfaceC6043a interfaceC6043a2, InterfaceC8945b interfaceC8945b, int i10) {
        this.f5776a = i10;
        this.f5777b = interfaceC6043a;
        this.f5778c = interfaceC6043a2;
        this.f5779d = interfaceC8945b;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f5776a) {
            case 0:
                return new C0005d(8, (Context) this.f5777b.get(), (InterfaceC2044d) this.f5778c.get(), (C1703b) ((C0966d) this.f5779d).get(), false);
            default:
                return new C8365q(new C8687a(14), new C5950e(14), (InterfaceC0965c) ((C0964b) this.f5777b).get(), (C3328c) ((C1710i) this.f5778c).get(), (C8090p) ((C1711j) this.f5779d).get());
        }
    }
}
