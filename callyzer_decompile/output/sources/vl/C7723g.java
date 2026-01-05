package vl;

import net.schmizz.sshj.common.InterfaceC5028h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.g */
/* loaded from: classes.dex */
public final class C7723g implements InterfaceC5028h {

    /* renamed from: a */
    public final int f37266a;

    /* renamed from: b */
    public final String f37267b;

    /* renamed from: c */
    public final String f37268c;

    public C7723g(int i10, String str, String str2) {
        this.f37268c = str;
        this.f37266a = i10;
        this.f37267b = str2;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        int i10 = this.f37266a / 8;
        String str = this.f37267b;
        return new C7722f(0, i10, 0, str, str.concat("/ECB/NoPadding"));
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f37268c;
    }

    public final String toString() {
        return this.f37268c;
    }
}
