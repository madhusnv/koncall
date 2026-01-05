package com.skydoves.balloon.compose;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kp.AbstractC4169a;
import mp.AbstractC4832a;
import qp.C6268e;
import qp.C6269f;
import qw.a0;
import rp.AbstractC6598a;
import w2.InterfaceC7879r;
import yu.AbstractC8775a;
import zp.C9011k;
import zp.C9012l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.skydoves.balloon.compose.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1423d implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7228a;

    /* renamed from: b */
    public final /* synthetic */ int f7229b;

    /* renamed from: c */
    public final /* synthetic */ int f7230c;

    /* renamed from: d */
    public final /* synthetic */ Object f7231d;

    /* renamed from: e */
    public final /* synthetic */ Object f7232e;

    public /* synthetic */ C1423d(int i10, int i11, InterfaceC2139c interfaceC2139c, String str) {
        this.f7228a = 4;
        this.f7231d = str;
        this.f7229b = i10;
        this.f7232e = interfaceC2139c;
        this.f7230c = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7228a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iM8496A = C3953b.m8496A(this.f7230c | 1);
                AbstractC4169a.m8931b(this.f7229b, (C6268e) this.f7231d, (C9011k) this.f7232e, (InterfaceC3962k) obj, iM8496A);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iM8496A2 = C3953b.m8496A(this.f7230c | 1);
                AbstractC4832a.m9786b(this.f7229b, (C6269f) this.f7231d, (C9011k) this.f7232e, (InterfaceC3962k) obj, iM8496A2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iM8496A3 = C3953b.m8496A(this.f7230c | 1);
                AbstractC6598a.m12654a(this.f7229b, (C9012l) this.f7231d, (C9011k) this.f7232e, (InterfaceC3962k) obj, iM8496A3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A4 = C3953b.m8496A(this.f7230c | 1);
                AbstractC8775a.m16140k((String) this.f7231d, this.f7229b, (InterfaceC2139c) this.f7232e, (InterfaceC3962k) obj, iM8496A4);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C1423d(int i10, Object obj, C9011k c9011k, int i11, int i12) {
        this.f7228a = i12;
        this.f7229b = i10;
        this.f7231d = obj;
        this.f7232e = c9011k;
        this.f7230c = i11;
    }

    public /* synthetic */ C1423d(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, int i10, int i11) {
        this.f7228a = 0;
        this.f7231d = interfaceC7879r;
        this.f7232e = interfaceC2141e;
        this.f7229b = i10;
        this.f7230c = i11;
    }
}
