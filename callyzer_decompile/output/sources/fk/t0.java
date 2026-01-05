package fk;

import android.content.Context;
import b2.C0566x;
import cp.C1476g;
import ex.InterfaceC2141e;
import p004e.AbstractActivityC1878m;
import p3.InterfaceC5822t;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10483a;

    /* renamed from: b */
    public int f10484b;

    /* renamed from: c */
    public Object f10485c;

    /* renamed from: d */
    public Object f10486d;

    /* renamed from: e */
    public final /* synthetic */ Object f10487e;

    /* renamed from: f */
    public Object f10488f;

    /* renamed from: g */
    public Object f10489g;

    /* renamed from: h */
    public Object f10490h;

    /* renamed from: j */
    public final /* synthetic */ Object f10491j;

    /* renamed from: k */
    public Object f10492k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, p0 p0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10483a = 0;
        this.f10487e = v0Var;
        this.f10491j = p0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10483a) {
            case 0:
                return new t0((v0) this.f10487e, (p0) this.f10491j, interfaceC7559c);
            case 1:
                t0 t0Var = new t0((k1.f0) this.f10486d, (InterfaceC5822t) this.f10487e, (b2.j0) this.f10488f, (C0566x) this.f10489g, (k1.a0) this.f10490h, (k1.a0) this.f10491j, (C1476g) this.f10492k, interfaceC7559c, 1);
                t0Var.f10485c = obj;
                return t0Var;
            default:
                t0 t0Var2 = new t0((ss.z0) this.f10486d, (l7.a0) this.f10487e, (AbstractActivityC1878m) this.f10488f, (Context) this.f10489g, (l7.a0) this.f10490h, (k2.b1) this.f10491j, (k2.w0) this.f10492k, interfaceC7559c, 2);
                t0Var2.f10485c = obj;
                return t0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10483a) {
        }
        return ((t0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Type inference failed for: r2v14, types: [k1.f0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [k1.f0] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, tx.z] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [tx.z] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [tx.z] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10483a = i10;
        this.f10486d = obj;
        this.f10487e = obj2;
        this.f10488f = obj3;
        this.f10489g = obj4;
        this.f10490h = obj5;
        this.f10491j = obj6;
        this.f10492k = obj7;
    }
}
