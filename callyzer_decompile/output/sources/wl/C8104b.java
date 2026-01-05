package wl;

import java.math.BigInteger;
import net.schmizz.sshj.common.InterfaceC5028h;
import yy.C8830a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wl.b */
/* loaded from: classes.dex */
public final class C8104b implements InterfaceC5028h {

    /* renamed from: a */
    public final String f38770a;

    /* renamed from: b */
    public final BigInteger f38771b;

    /* renamed from: c */
    public final BigInteger f38772c;

    /* renamed from: d */
    public final InterfaceC5028h f38773d;

    public C8104b(String str, BigInteger bigInteger, BigInteger bigInteger2, InterfaceC5028h interfaceC5028h) {
        this.f38770a = str;
        this.f38771b = bigInteger;
        this.f38772c = bigInteger2;
        this.f38773d = interfaceC5028h;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        return new C8103a(this.f38771b, this.f38772c, (C8830a) this.f38773d.mo2133c());
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f38770a;
    }

    public final String toString() {
        return this.f38770a;
    }
}
