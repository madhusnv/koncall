package k1;

import c3.C0847b;
import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20186a;

    /* renamed from: b */
    public int f20187b;

    /* renamed from: c */
    public final /* synthetic */ p1 f20188c;

    /* renamed from: d */
    public /* synthetic */ long f20189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(p1 p1Var, long j6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20186a = i10;
        this.f20188c = p1Var;
        this.f20189d = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20186a) {
            case 0:
                return new m1(this.f20188c, this.f20189d, interfaceC7559c, 0);
            case 1:
                return new m1(this.f20188c, this.f20189d, interfaceC7559c, 1);
            case 2:
                return new m1(this.f20188c, this.f20189d, interfaceC7559c, 2);
            default:
                m1 m1Var = new m1(this.f20188c, interfaceC7559c);
                m1Var.f20189d = ((C0847b) obj).f5352a;
                return m1Var;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20186a) {
            case 0:
                return ((m1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((m1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((m1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                long j6 = ((C0847b) obj).f5352a;
                m1 m1Var = new m1(this.f20188c, (InterfaceC7559c) obj2);
                m1Var.f20189d = j6;
                return m1Var.invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00da A[PHI: r8
      0x00da: PHI (r8v5 java.lang.Object) = (r8v22 java.lang.Object), (r8v23 java.lang.Object) binds: [B:57:0x00eb, B:54:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p1 p1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20186a = 3;
        this.f20188c = p1Var;
    }
}
