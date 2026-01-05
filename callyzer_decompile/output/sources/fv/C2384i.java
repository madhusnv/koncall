package fv;

import ct.C1502a;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.i */
/* loaded from: classes3.dex */
public final class C2384i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C2386k f10839a;

    /* renamed from: b */
    public C1502a f10840b;

    /* renamed from: c */
    public boolean f10841c;

    /* renamed from: d */
    public int f10842d;

    /* renamed from: e */
    public int f10843e;

    /* renamed from: f */
    public final /* synthetic */ C2386k f10844f;

    /* renamed from: g */
    public final /* synthetic */ String f10845g;

    /* renamed from: h */
    public final /* synthetic */ String f10846h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384i(C2386k c2386k, String str, String str2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f10844f = c2386k;
        this.f10845g = str;
        this.f10846h = str2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C2384i(this.f10844f, this.f10845g, this.f10846h, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2384i) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x023b, code lost:
    
        if (tx.c0.m13489l(2000, r34) == r6) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022a  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2384i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
