package xl;

import az.C0505a;
import net.schmizz.sshj.common.InterfaceC5028h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xl.a */
/* loaded from: classes.dex */
public final class C8392a implements InterfaceC5028h {

    /* renamed from: a */
    public final String f40081a;

    /* renamed from: b */
    public final String f40082b;

    /* renamed from: c */
    public final int f40083c;

    /* renamed from: d */
    public final int f40084d;

    /* renamed from: e */
    public final boolean f40085e;

    public C8392a(String str, String str2, int i10, int i11, boolean z6) {
        this.f40081a = str;
        this.f40082b = str2;
        this.f40083c = i10;
        this.f40084d = i11;
        this.f40085e = z6;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        return new C0505a(this.f40082b, this.f40083c, this.f40084d, this.f40085e);
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f40081a;
    }
}
