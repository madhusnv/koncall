package jt;

import android.content.Context;
import ex.InterfaceC2141e;
import java.io.IOException;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jt.c */
/* loaded from: classes3.dex */
public final class C3854c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f19841a;

    /* renamed from: b */
    public final /* synthetic */ C3856e f19842b;

    /* renamed from: c */
    public final /* synthetic */ Context f19843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3854c(Context context, C3856e c3856e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f19841a = 0;
        this.f19843c = context;
        this.f19842b = c3856e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f19841a) {
            case 0:
                return new C3854c(this.f19843c, this.f19842b, interfaceC7559c);
            case 1:
                return new C3854c(this.f19842b, this.f19843c, interfaceC7559c, 1);
            default:
                return new C3854c(this.f19842b, this.f19843c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f19841a) {
            case 0:
                C3854c c3854c = (C3854c) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c3854c.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C3854c c3854c2 = (C3854c) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c3854c2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C3854c c3854c3 = (C3854c) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var3 = a0.f30746a;
                c3854c3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[LOOP:0: B:5:0x0026->B:31:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078 A[SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.C3854c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3854c(C3856e c3856e, Context context, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f19841a = i10;
        this.f19842b = c3856e;
        this.f19843c = context;
    }
}
