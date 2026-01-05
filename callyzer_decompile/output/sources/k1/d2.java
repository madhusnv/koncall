package k1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4155m;
import mw.C4903k;
import qw.InterfaceC6355e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8198h;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d2 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f20058b = 0;

    /* renamed from: c */
    public int f20059c;

    /* renamed from: d */
    public /* synthetic */ Object f20060d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC7266z f20061e;

    /* renamed from: f */
    public InterfaceC7564h f20062f;

    /* renamed from: g */
    public final /* synthetic */ Object f20063g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6355e f20064h;

    /* renamed from: j */
    public final /* synthetic */ Object f20065j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d2(InterfaceC7266z interfaceC7266z, InterfaceC2142f interfaceC2142f, InterfaceC2139c interfaceC2139c, a1 a1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20061e = interfaceC7266z;
        this.f20063g = (AbstractC8199i) interfaceC2142f;
        this.f20064h = (AbstractC4155m) interfaceC2139c;
        this.f20065j = a1Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20058b) {
            case 0:
                d2 d2Var = new d2(this.f20061e, (AbstractC8199i) this.f20063g, (AbstractC4155m) this.f20064h, (a1) this.f20065j, interfaceC7559c);
                d2Var.f20060d = obj;
                return d2Var;
            default:
                d2 d2Var2 = new d2(this.f20062f, this.f20061e, (C4903k) this.f20063g, (InterfaceC2141e) this.f20064h, (k2.w0) this.f20065j, interfaceC7559c);
                d2Var2.f20060d = obj;
                return d2Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        p3.f0 f0Var = (p3.f0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20058b) {
        }
        return ((d2) create(f0Var, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Type inference failed for: r3v1, types: [ex.f, ww.i] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:16:0x004f). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(InterfaceC7564h interfaceC7564h, InterfaceC7266z interfaceC7266z, C4903k c4903k, InterfaceC2141e interfaceC2141e, k2.w0 w0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20062f = interfaceC7564h;
        this.f20061e = interfaceC7266z;
        this.f20063g = c4903k;
        this.f20064h = interfaceC2141e;
        this.f20065j = w0Var;
    }
}
