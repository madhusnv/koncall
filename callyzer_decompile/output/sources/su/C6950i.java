package su;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.i */
/* loaded from: classes3.dex */
public final class C6950i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f33603a;

    /* renamed from: b */
    public C6952k f33604b;

    /* renamed from: c */
    public Throwable f33605c;

    /* renamed from: d */
    public int f33606d;

    /* renamed from: e */
    public int f33607e;

    /* renamed from: f */
    public final /* synthetic */ C6952k f33608f;

    /* renamed from: g */
    public final /* synthetic */ LocalDateTime f33609g;

    /* renamed from: h */
    public final /* synthetic */ LocalDateTime f33610h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6950i(C6952k c6952k, LocalDateTime localDateTime, LocalDateTime localDateTime2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33608f = c6952k;
        this.f33609g = localDateTime;
        this.f33610h = localDateTime2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6950i(this.f33608f, this.f33609g, this.f33610h, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6950i) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r8.mo14775g(r10, r14) == r9) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[PHI: r1
      0x00be: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v14 java.lang.Object) binds: [B:26:0x009d, B:31:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su.C6950i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
