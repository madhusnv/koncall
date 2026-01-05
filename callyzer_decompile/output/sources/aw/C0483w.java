package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingUploadManager;
import d7.w0;
import dt.C1804j;
import dt.C1813s;
import ex.InterfaceC2141e;
import h1.C2772c;
import h1.w1;
import om.C5415q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import xm.x1;
import zv.C9097a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.w */
/* loaded from: classes3.dex */
public final class C0483w extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3454a;

    /* renamed from: b */
    public boolean f3455b;

    /* renamed from: c */
    public int f3456c;

    /* renamed from: d */
    public Object f3457d;

    /* renamed from: e */
    public final /* synthetic */ Object f3458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0483w(int i10, Object obj, Object obj2, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f3454a = i10;
        this.f3457d = obj;
        this.f3458e = obj2;
        this.f3455b = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3454a) {
            case 0:
                return new C0483w(0, (RecordingUploadManager) this.f3457d, (C9097a) this.f3458e, interfaceC7559c, this.f3455b);
            case 1:
                return new C0483w((C1804j) this.f3458e, interfaceC7559c, 1);
            case 2:
                return new C0483w((C1813s) this.f3458e, interfaceC7559c, 2);
            case 3:
                return new C0483w((C2772c) this.f3457d, this.f3455b, (w1) this.f3458e, interfaceC7559c);
            default:
                return new C0483w(4, (x1) this.f3457d, (C5415q) this.f3458e, interfaceC7559c, this.f3455b);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3454a) {
        }
        return ((C0483w) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294 A[PHI: r2 r5
      0x0294: PHI (r2v5 tq.p) = (r2v4 tq.p), (r2v12 tq.p) binds: [B:95:0x0291, B:84:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r5v7 java.lang.Object) = (r5v6 java.lang.Object), (r5v10 java.lang.Object) binds: [B:95:0x0291, B:84:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.C0483w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0483w(w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3454a = i10;
        this.f3458e = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483w(C2772c c2772c, boolean z6, w1 w1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3454a = 3;
        this.f3457d = c2772c;
        this.f3455b = z6;
        this.f3458e = w1Var;
    }
}
