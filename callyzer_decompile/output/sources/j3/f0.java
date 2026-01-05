package j3;

import c3.C0850e;
import d3.C1559m;
import f3.InterfaceC2198d;
import k2.C3953b;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends d0 {

    /* renamed from: b */
    public final C3549c f18999b;

    /* renamed from: c */
    public String f19000c;

    /* renamed from: d */
    public boolean f19001d;

    /* renamed from: e */
    public final C3547a f19002e;

    /* renamed from: f */
    public AbstractC4155m f19003f;

    /* renamed from: g */
    public final e1 f19004g;

    /* renamed from: h */
    public C1559m f19005h;

    /* renamed from: i */
    public final e1 f19006i;

    /* renamed from: j */
    public long f19007j;

    /* renamed from: k */
    public float f19008k;

    /* renamed from: l */
    public float f19009l;

    /* renamed from: m */
    public final e0 f19010m;

    public f0(C3549c c3549c) {
        this.f18999b = c3549c;
        c3549c.f18950i = new e0(this, 0);
        this.f19000c = "";
        this.f19001d = true;
        this.f19002e = new C3547a();
        this.f19003f = C3554h.f19023c;
        this.f19004g = C3953b.m8517t(null);
        this.f19006i = C3953b.m8517t(new C0850e(0L));
        this.f19007j = 9205357640488583168L;
        this.f19008k = 1.0f;
        this.f19009l = 1.0f;
        this.f19010m = new e0(this, 1);
    }

    @Override // j3.d0
    /* renamed from: a */
    public final void mo8083a(InterfaceC2198d interfaceC2198d) {
        m8092e(interfaceC2198d, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8092e(f3.InterfaceC2198d r34, float r35, d3.C1559m r36) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f0.m8092e(f3.d, float, d3.m):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f19000c);
        sb2.append("\n\tviewportWidth: ");
        e1 e1Var = this.f19006i;
        sb2.append(Float.intBitsToFloat((int) (((C0850e) e1Var.getValue()).f5366a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((C0850e) e1Var.getValue()).f5366a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
