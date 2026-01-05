package dr;

import ex.InterfaceC2141e;
import java.io.Serializable;
import java.util.ArrayList;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.l */
/* loaded from: classes3.dex */
public final class C1762l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8551a = 0;

    /* renamed from: b */
    public int f8552b;

    /* renamed from: c */
    public int f8553c;

    /* renamed from: d */
    public int f8554d;

    /* renamed from: e */
    public Object f8555e;

    /* renamed from: f */
    public Object f8556f;

    /* renamed from: g */
    public Object f8557g;

    /* renamed from: h */
    public Serializable f8558h;

    /* renamed from: j */
    public Serializable f8559j;

    /* renamed from: k */
    public Object f8560k;

    /* renamed from: l */
    public final /* synthetic */ Object f8561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1762l(C1775y c1775y, ArrayList arrayList, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8561l = c1775y;
        this.f8556f = arrayList;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8551a) {
            case 0:
                return new C1762l((C1775y) this.f8561l, (ArrayList) this.f8556f, interfaceC7559c);
            default:
                C1762l c1762l = new C1762l((InterfaceC8209j[]) this.f8558h, (o6.b0) this.f8559j, (C1769s) this.f8560k, (InterfaceC8210k) this.f8561l, interfaceC7559c);
                c1762l.f8557g = obj;
                return c1762l;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8551a) {
        }
        return ((C1762l) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0094, code lost:
    
        if (r9 != 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4 A[LOOP:0: B:28:0x00b4->B:61:?, LOOP_START, PHI: r9 r13
      0x00b4: PHI (r9v9 int) = (r9v8 int), (r9v10 int) binds: [B:26:0x00af, B:61:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r13v4 rw.u) = (r13v3 rw.u), (r13v10 rw.u) binds: [B:26:0x00af, B:61:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f5 -> B:22:0x0094). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1762l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1762l(InterfaceC8209j[] interfaceC8209jArr, o6.b0 b0Var, C1769s c1769s, InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8558h = interfaceC8209jArr;
        this.f8559j = b0Var;
        this.f8560k = c1769s;
        this.f8561l = interfaceC8210k;
    }
}
