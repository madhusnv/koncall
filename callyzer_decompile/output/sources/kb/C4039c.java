package kb;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import gb.InterfaceC2556f;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import o6.C5321w;
import qw.a0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.c */
/* loaded from: classes.dex */
public final class C4039c extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f20866a = 0;

    /* renamed from: b */
    public int f20867b;

    /* renamed from: c */
    public Object f20868c;

    /* renamed from: d */
    public final /* synthetic */ Object f20869d;

    /* renamed from: e */
    public final /* synthetic */ Object f20870e;

    /* renamed from: f */
    public final /* synthetic */ Object f20871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4039c(C4040d c4040d, C4042f c4042f, InterfaceC2556f interfaceC2556f, C4043g c4043g, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f20868c = c4040d;
        this.f20869d = c4042f;
        this.f20870e = interfaceC2556f;
        this.f20871f = c4043g;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f20866a) {
            case 0:
                return new C4039c((C4040d) this.f20868c, (C4042f) this.f20869d, (InterfaceC2556f) this.f20870e, (C4043g) this.f20871f, interfaceC7559c);
            case 1:
                return new C4039c((C4168z) this.f20869d, (C5321w) this.f20870e, (C4166x) this.f20871f, interfaceC7559c);
            default:
                return new C4039c((C5321w) this.f20869d, (InterfaceC7564h) this.f20870e, (InterfaceC2141e) this.f20871f, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f20866a) {
        }
        return ((C4039c) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.C4039c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4039c(C4168z c4168z, C5321w c5321w, C4166x c4166x, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f20869d = c4168z;
        this.f20870e = c5321w;
        this.f20871f = c4166x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4039c(C5321w c5321w, InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f20869d = c5321w;
        this.f20870e = interfaceC7564h;
        this.f20871f = (AbstractC8199i) interfaceC2141e;
    }
}
