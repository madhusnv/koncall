package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import h1.C2772c;
import io.C3330e;
import java.io.File;
import m1.InterfaceC4630l;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yn.C8716n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class pa extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12430a = 0;

    /* renamed from: b */
    public int f12431b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12432c;

    /* renamed from: d */
    public Object f12433d;

    /* renamed from: e */
    public Object f12434e;

    /* renamed from: f */
    public final /* synthetic */ Object f12435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(C2772c c2772c, boolean z6, h1.w1 w1Var, InterfaceC2137a interfaceC2137a, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f12433d = c2772c;
        this.f12432c = z6;
        this.f12434e = w1Var;
        this.f12435f = interfaceC2137a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12430a) {
            case 0:
                return new pa((C2772c) this.f12433d, this.f12432c, (h1.w1) this.f12434e, (InterfaceC2137a) this.f12435f, interfaceC7559c);
            case 1:
                return new pa((C3330e) this.f12433d, (File) this.f12434e, (String) this.f12435f, this.f12432c, interfaceC7559c);
            case 2:
                return new pa((k2.w0) this.f12434e, this.f12432c, (InterfaceC4630l) this.f12435f, interfaceC7559c);
            default:
                return new pa((C8716n) this.f12435f, this.f12432c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12430a) {
        }
        return ((pa) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.pa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(C3330e c3330e, File file, String str, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f12433d = c3330e;
        this.f12434e = file;
        this.f12435f = str;
        this.f12432c = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(k2.w0 w0Var, boolean z6, InterfaceC4630l interfaceC4630l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f12434e = w0Var;
        this.f12432c = z6;
        this.f12435f = interfaceC4630l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(C8716n c8716n, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f12435f = c8716n;
        this.f12432c = z6;
    }
}
