package vl;

import net.schmizz.sshj.common.InterfaceC5028h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.e */
/* loaded from: classes.dex */
public final class C7721e implements InterfaceC5028h {

    /* renamed from: a */
    public final int f37263a;

    /* renamed from: b */
    public final String f37264b;

    public C7721e(int i10, String str) {
        this.f37264b = str;
        this.f37263a = i10;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        C7720d c7720d = new C7720d("AES", 12, this.f37263a / 8, "AES/GCM/NoPadding");
        c7720d.f37258f = 16;
        return c7720d;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f37264b;
    }

    public final String toString() {
        return this.f37264b;
    }
}
