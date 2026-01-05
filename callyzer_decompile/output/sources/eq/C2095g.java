package eq;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.List;
import qw.a0;
import tx.InterfaceC7266z;
import ur.AbstractC7524q;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yp.C8735o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.g */
/* loaded from: classes3.dex */
public final class C2095g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9807a = 0;

    /* renamed from: b */
    public List f9808b;

    /* renamed from: c */
    public LocalDateTime f9809c;

    /* renamed from: d */
    public LocalDateTime f9810d;

    /* renamed from: e */
    public int f9811e;

    /* renamed from: f */
    public boolean f9812f;

    /* renamed from: g */
    public int f9813g;

    /* renamed from: h */
    public AbstractC7524q f9814h;

    /* renamed from: j */
    public Object f9815j;

    /* renamed from: k */
    public Object f9816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095g(C2100l c2100l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9815j = c2100l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9807a) {
            case 0:
                return new C2095g((C2100l) this.f9815j, interfaceC7559c);
            default:
                return new C2095g((C8735o) this.f9816k, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9807a) {
        }
        return ((C2095g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.C2095g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095g(C8735o c8735o, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9816k = c8735o;
    }
}
