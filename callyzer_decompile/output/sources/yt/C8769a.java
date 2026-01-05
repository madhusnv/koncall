package yt;

import an.b3;
import android.content.Context;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import pg.l6;
import qw.a0;
import su.C6952k;
import tx.InterfaceC7266z;
import tx.e1;
import uw.InterfaceC7559c;
import vx.InterfaceC7819u;
import ww.AbstractC8199i;
import xm.s1;
import z1.C8843c;
import z1.C8847g;
import z1.C8849i;
import z1.C8850j;
import z7.n0;
import z8.AbstractC8900c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yt.a */
/* loaded from: classes3.dex */
public final class C8769a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42387a;

    /* renamed from: b */
    public int f42388b;

    /* renamed from: c */
    public /* synthetic */ Object f42389c;

    /* renamed from: d */
    public final /* synthetic */ Object f42390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8769a(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42387a = i10;
        this.f42389c = obj;
        this.f42390d = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42387a) {
            case 0:
                return new C8769a((C8770b) this.f42389c, (l6) this.f42390d, interfaceC7559c, 0);
            case 1:
                return new C8769a((C8843c) this.f42389c, (C8849i) this.f42390d, interfaceC7559c, 1);
            case 2:
                return new C8769a((e1) this.f42389c, (C8847g) this.f42390d, interfaceC7559c, 2);
            case 3:
                return new C8769a((C8850j) this.f42389c, (s1) this.f42390d, interfaceC7559c, 3);
            case 4:
                C8769a c8769a = new C8769a((b3) this.f42390d, interfaceC7559c, 4);
                c8769a.f42389c = obj;
                return c8769a;
            case 5:
                return new C8769a((n0) this.f42389c, (InterfaceC2137a) this.f42390d, interfaceC7559c, 5);
            case 6:
                C8769a c8769a2 = new C8769a((AbstractC8900c) this.f42390d, interfaceC7559c, 6);
                c8769a2.f42389c = obj;
                return c8769a2;
            default:
                return new C8769a((C6952k) this.f42389c, (Context) this.f42390d, interfaceC7559c, 7);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42387a) {
            case 0:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 3:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 4:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 5:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 6:
                return ((C8769a) create((InterfaceC7819u) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C8769a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f0, code lost:
    
        if (tx.c0.m13489l(500, r12) != r3) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5 A[Catch: all -> 0x019c, TryCatch #3 {all -> 0x019c, blocks: (B:102:0x0198, B:130:0x01f3, B:124:0x01dc, B:127:0x01e5, B:108:0x01a6, B:109:0x01aa, B:122:0x01d6, B:123:0x01db, B:117:0x01c4, B:119:0x01cd), top: B:174:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x01f0 -> B:130:0x01f3). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.C8769a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8769a(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42387a = i10;
        this.f42390d = obj;
    }
}
