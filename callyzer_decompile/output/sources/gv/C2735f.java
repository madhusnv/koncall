package gv;

import ex.InterfaceC2139c;
import iz.InterfaceC3372e;
import iz.k0;
import java.io.IOException;
import nz.C5205p;
import og.od;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.f */
/* loaded from: classes3.dex */
public final class C2735f implements InterfaceC2139c, InterfaceC3372e {

    /* renamed from: a */
    public final /* synthetic */ int f15270a;

    /* renamed from: b */
    public final Object f15271b;

    /* renamed from: c */
    public final Object f15272c;

    public /* synthetic */ C2735f(int i10, InterfaceC2139c interfaceC2139c, Object obj) {
        this.f15270a = i10;
        this.f15272c = interfaceC2139c;
        this.f15271b = obj;
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: d */
    public void mo2561d(C5205p c5205p, IOException iOException) {
        if (c5205p.f25373q) {
            return;
        }
        ((C7251k) this.f15272c).resumeWith(od.m10796a(iOException));
    }

    @Override // iz.InterfaceC3372e
    /* renamed from: e */
    public void mo2562e(C5205p c5205p, k0 k0Var) {
        ((C7251k) this.f15272c).resumeWith(k0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0198, code lost:
    
        r41 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019a, code lost:
    
        r40 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv.C2735f.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C2735f(int i10, Object obj, Object obj2) {
        this.f15270a = i10;
        this.f15271b = obj;
        this.f15272c = obj2;
    }
}
