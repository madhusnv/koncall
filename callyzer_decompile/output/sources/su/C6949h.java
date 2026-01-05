package su;

import ex.InterfaceC2141e;
import java.util.List;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.h */
/* loaded from: classes3.dex */
public final class C6949h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f33592a;

    /* renamed from: b */
    public Object f33593b;

    /* renamed from: c */
    public List f33594c;

    /* renamed from: d */
    public String f33595d;

    /* renamed from: e */
    public List f33596e;

    /* renamed from: f */
    public int f33597f;

    /* renamed from: g */
    public int f33598g;

    /* renamed from: h */
    public int f33599h;

    /* renamed from: j */
    public int f33600j;

    /* renamed from: k */
    public int f33601k;

    /* renamed from: l */
    public final /* synthetic */ C6952k f33602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6949h(C6952k c6952k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33602l = c6952k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6949h(this.f33602l, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6949h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x02b5, code lost:
    
        if (r4 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0292 A[PHI: r8
      0x0292: PHI (r8v34 java.util.List) = (r8v25 java.util.List), (r8v37 java.util.List) binds: [B:36:0x021b, B:55:0x0282] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.C6949h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
