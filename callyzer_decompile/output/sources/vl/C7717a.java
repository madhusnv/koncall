package vl;

import com.sun.mail.util.AbstractC1452a;
import net.schmizz.sshj.common.InterfaceC5028h;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.a */
/* loaded from: classes.dex */
public final class C7717a implements InterfaceC5028h {

    /* renamed from: a */
    public final int f37245a;

    /* renamed from: b */
    public final String f37246b;

    /* renamed from: c */
    public final String f37247c;

    /* renamed from: d */
    public final String f37248d;

    /* renamed from: e */
    public final int f37249e;

    public C7717a(int i10, int i11, String str, String str2, String str3) {
        this.f37248d = str;
        this.f37245a = i11;
        this.f37246b = str2;
        this.f37247c = str3;
        this.f37249e = i10;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        int i10 = this.f37245a / 8;
        String str = this.f37246b;
        return new C7722f(this.f37249e, i10, 1, str, AbstractC1452a.m4564k(AbstractC5601a.m11245p(str, "/"), this.f37247c, "/NoPadding"));
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        return this.f37248d;
    }

    public final String toString() {
        return this.f37248d;
    }
}
