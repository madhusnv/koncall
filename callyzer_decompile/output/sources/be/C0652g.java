package be;

import ex.InterfaceC2141e;
import ge.C2577i;
import ge.C2580l;
import java.util.List;
import qw.a0;
import ss.z0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import wd.C7995c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: be.g */
/* loaded from: classes.dex */
public final class C0652g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4169a = 0;

    /* renamed from: b */
    public Object f4170b;

    /* renamed from: c */
    public int f4171c;

    /* renamed from: d */
    public int f4172d;

    /* renamed from: e */
    public int f4173e;

    /* renamed from: f */
    public Object f4174f;

    /* renamed from: g */
    public Object f4175g;

    /* renamed from: h */
    public Object f4176h;

    /* renamed from: j */
    public Object f4177j;

    /* renamed from: k */
    public Object f4178k;

    /* renamed from: l */
    public Object f4179l;

    /* renamed from: m */
    public final /* synthetic */ Object f4180m;

    /* renamed from: n */
    public final /* synthetic */ Object f4181n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652g(C0653h c0653h, C0646a c0646a, C2580l c2580l, List list, C7995c c7995c, C2577i c2577i, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4178k = c0653h;
        this.f4179l = c0646a;
        this.f4177j = c2580l;
        this.f4175g = list;
        this.f4180m = c7995c;
        this.f4181n = c2577i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4169a) {
            case 0:
                C0652g c0652g = new C0652g((C0653h) this.f4178k, (C0646a) this.f4179l, (C2580l) this.f4177j, (List) this.f4175g, (C7995c) this.f4180m, (C2577i) this.f4181n, interfaceC7559c);
                c0652g.f4170b = obj;
                return c0652g;
            default:
                return new C0652g((z0) this.f4180m, (EnumC7204p) this.f4181n, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4169a) {
        }
        return ((C0652g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0086 -> B:18:0x008a). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C0652g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652g(z0 z0Var, EnumC7204p enumC7204p, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4180m = z0Var;
        this.f4181n = enumC7204p;
    }
}
