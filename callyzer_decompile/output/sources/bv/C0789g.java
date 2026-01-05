package bv;

import ct.C1502a;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.g */
/* loaded from: classes3.dex */
public final class C0789g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C0790h f4978a;

    /* renamed from: b */
    public String f4979b;

    /* renamed from: c */
    public String f4980c;

    /* renamed from: d */
    public String f4981d;

    /* renamed from: e */
    public C1502a f4982e;

    /* renamed from: f */
    public int f4983f;

    /* renamed from: g */
    public boolean f4984g;

    /* renamed from: h */
    public boolean f4985h;

    /* renamed from: j */
    public int f4986j;

    /* renamed from: k */
    public final /* synthetic */ C0790h f4987k;

    /* renamed from: l */
    public final /* synthetic */ String f4988l;

    /* renamed from: m */
    public final /* synthetic */ String f4989m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789g(C0790h c0790h, String str, String str2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4987k = c0790h;
        this.f4988l = str;
        this.f4989m = str2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C0789g(this.f4987k, this.f4988l, this.f4989m, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0789g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x038e A[LOOP:1: B:47:0x028a->B:66:0x038e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fe A[EDGE_INSN: B:70:0x02fe->B:54:0x02fe BREAK  A[LOOP:1: B:47:0x028a->B:66:0x038e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [ct.a, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r66) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.C0789g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
