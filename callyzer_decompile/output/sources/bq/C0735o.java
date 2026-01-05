package bq;

import dq.C1750l;
import ex.InterfaceC2142f;
import gp.C2703n;
import ip.C3342l;
import java.util.List;
import pp.C5995k;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import wx.j1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.o */
/* loaded from: classes3.dex */
public final class C0735o extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f4628a;

    /* renamed from: b */
    public int f4629b;

    /* renamed from: c */
    public /* synthetic */ Object f4630c;

    /* renamed from: d */
    public /* synthetic */ int f4631d;

    /* renamed from: e */
    public final /* synthetic */ Object f4632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0735o(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(3, interfaceC7559c);
        this.f4628a = i10;
        this.f4632e = obj;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4628a) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                C0735o c0735o = new C0735o((C0737q) this.f4632e, (InterfaceC7559c) obj3, 0);
                c0735o.f4630c = (List) obj;
                c0735o.f4631d = iIntValue;
                return c0735o.invokeSuspend(a0.f30746a);
            case 1:
                int iIntValue2 = ((Number) obj2).intValue();
                C0735o c0735o2 = new C0735o((C1750l) this.f4632e, (InterfaceC7559c) obj3, 1);
                c0735o2.f4630c = (List) obj;
                c0735o2.f4631d = iIntValue2;
                return c0735o2.invokeSuspend(a0.f30746a);
            case 2:
                int iIntValue3 = ((Number) obj2).intValue();
                C0735o c0735o3 = new C0735o((C2703n) this.f4632e, (InterfaceC7559c) obj3, 2);
                c0735o3.f4630c = (List) obj;
                c0735o3.f4631d = iIntValue3;
                return c0735o3.invokeSuspend(a0.f30746a);
            case 3:
                int iIntValue4 = ((Number) obj2).intValue();
                C0735o c0735o4 = new C0735o((C3342l) this.f4632e, (InterfaceC7559c) obj3, 3);
                c0735o4.f4630c = (List) obj;
                c0735o4.f4631d = iIntValue4;
                return c0735o4.invokeSuspend(a0.f30746a);
            case 4:
                int iIntValue5 = ((Number) obj2).intValue();
                C0735o c0735o5 = new C0735o((C5995k) this.f4632e, (InterfaceC7559c) obj3, 4);
                c0735o5.f4630c = (List) obj;
                c0735o5.f4631d = iIntValue5;
                return c0735o5.invokeSuspend(a0.f30746a);
            default:
                int iIntValue6 = ((Number) obj2).intValue();
                C0735o c0735o6 = new C0735o((j1) this.f4632e, (InterfaceC7559c) obj3, 5);
                c0735o6.f4630c = (InterfaceC8210k) obj;
                c0735o6.f4631d = iIntValue6;
                return c0735o6.invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[PHI: r2
      0x008a: PHI (r2v31 wx.k) = (r2v30 wx.k), (r2v38 wx.k) binds: [B:30:0x0087, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.C0735o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
