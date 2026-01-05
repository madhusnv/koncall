package k1;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4165w;
import kotlin.jvm.internal.C4168z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C4164v f20251a;

    /* renamed from: b */
    public C4164v f20252b;

    /* renamed from: c */
    public int f20253c;

    /* renamed from: d */
    public int f20254d;

    /* renamed from: e */
    public /* synthetic */ Object f20255e;

    /* renamed from: f */
    public final /* synthetic */ C4165w f20256f;

    /* renamed from: g */
    public final /* synthetic */ C4168z f20257g;

    /* renamed from: h */
    public final /* synthetic */ C4168z f20258h;

    /* renamed from: j */
    public final /* synthetic */ float f20259j;

    /* renamed from: k */
    public final /* synthetic */ c0.d1 f20260k;

    /* renamed from: l */
    public final /* synthetic */ float f20261l;

    /* renamed from: m */
    public final /* synthetic */ x1 f20262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(C4165w c4165w, C4168z c4168z, C4168z c4168z2, float f6, c0.d1 d1Var, float f10, x1 x1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20256f = c4165w;
        this.f20257g = c4168z;
        this.f20258h = c4168z2;
        this.f20259j = f6;
        this.f20260k = d1Var;
        this.f20261l = f10;
        this.f20262m = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        u0 u0Var = new u0(this.f20256f, this.f20257g, this.f20258h, this.f20259j, this.f20260k, this.f20261l, this.f20262m, interfaceC7559c);
        u0Var.f20255e = obj;
        return u0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((v1) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0183 -> B:37:0x0184). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
