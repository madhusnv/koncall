package rl;

import net.schmizz.sshj.common.EnumC5031k;
import net.schmizz.sshj.common.InterfaceC5028h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rl.b */
/* loaded from: classes.dex */
public final class C6568b implements InterfaceC5028h {

    /* renamed from: a */
    public final String f31454a;

    /* renamed from: b */
    public final InterfaceC5028h f31455b;

    public C6568b(String str, InterfaceC5028h interfaceC5028h, EnumC5031k enumC5031k) {
        this.f31454a = str;
        this.f31455b = interfaceC5028h;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        return new C6567a(this.f31455b);
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f31454a;
    }

    public final String toString() {
        return this.f31454a;
    }
}
