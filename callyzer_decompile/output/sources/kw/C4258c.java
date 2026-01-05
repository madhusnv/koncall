package kw;

import a1.C0005d;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kw.c */
/* loaded from: classes3.dex */
public final class C4258c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object[] f21630a;

    /* renamed from: b */
    public C0005d f21631b;

    /* renamed from: c */
    public int f21632c;

    /* renamed from: d */
    public int f21633d;

    /* renamed from: e */
    public int f21634e;

    /* renamed from: f */
    public int f21635f;

    /* renamed from: g */
    public final /* synthetic */ C0005d f21636g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4258c(C0005d c0005d, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21636g = c0005d;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C4258c(this.f21636g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C4258c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:14:0x0064). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r10.f21635f
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            int r1 = r10.f21634e
            int r3 = r10.f21633d
            int r4 = r10.f21632c
            a1.d r5 = r10.f21631b
            java.lang.Object[] r6 = r10.f21630a
            h1.j[] r6 = (h1.InterfaceC2779j[]) r6
            og.od.m10798c(r11)
            r11 = r4
            goto L64
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            og.od.m10798c(r11)
            a1.d r11 = r10.f21636g
            java.lang.Object r1 = r11.f25c
            h1.j[] r1 = (h1.InterfaceC2779j[]) r1
            r3 = 0
            r4 = 2
            r5 = r11
            r6 = r1
            r11 = r3
            r1 = r4
        L31:
            if (r3 >= r1) goto L66
            r4 = r6[r3]
            int r7 = r11 + 1
            java.lang.Object r8 = r5.f26d
            qw.p r8 = (qw.C6366p) r8
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r11 = r8.get(r11)
            h1.c r11 = (h1.C2772c) r11
            java.lang.Float r8 = new java.lang.Float
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9)
            r10.f21630a = r6
            r10.f21631b = r5
            r10.f21632c = r7
            r10.f21633d = r3
            r10.f21634e = r1
            r10.f21635f = r2
            r9 = 12
            java.lang.Object r11 = h1.C2772c.m6774c(r11, r8, r4, r10, r9)
            if (r11 != r0) goto L63
            return r0
        L63:
            r11 = r7
        L64:
            int r3 = r3 + r2
            goto L31
        L66:
            qw.a0 r11 = qw.a0.f30746a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.C4258c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
