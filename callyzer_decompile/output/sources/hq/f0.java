package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import kr.AbstractC4189d;
import mm.C4791b;
import mm.C4802m;
import nq.AbstractC5133e;
import og.jd;
import q1.C6097y;
import qv.AbstractC6327b;
import qw.InterfaceC6355e;
import sq.b1;
import sv.C6954b;
import sv.C6955c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16182a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16183b;

    /* renamed from: c */
    public final /* synthetic */ Object f16184c;

    /* renamed from: d */
    public final /* synthetic */ int f16185d;

    /* renamed from: e */
    public final /* synthetic */ Object f16186e;

    public /* synthetic */ f0(int i10, int i11, InterfaceC2137a interfaceC2137a, String str, boolean z6) {
        this.f16182a = 7;
        this.f16183b = z6;
        this.f16185d = i10;
        this.f16186e = str;
        this.f16184c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16182a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(this.f16185d | 1);
                a0.m7267m((C6097y) this.f16186e, this.f16183b, (InterfaceC2139c) this.f16184c, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iM8496A2 = C3953b.m8496A(this.f16185d | 1);
                AbstractC4189d.m8937e((List) this.f16186e, this.f16183b, (InterfaceC2139c) this.f16184c, (InterfaceC3962k) obj, iM8496A2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM8496A3 = C3953b.m8496A(this.f16185d | 1);
                AbstractC5133e.m10053a((C4791b) this.f16186e, this.f16183b, (InterfaceC2137a) this.f16184c, (InterfaceC3962k) obj, iM8496A3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM8496A4 = C3953b.m8496A(1);
                jd.m10716d(this.f16185d, this.f16183b, (InterfaceC2137a) this.f16186e, (InterfaceC7879r) this.f16184c, (InterfaceC3962k) obj, iM8496A4);
                break;
            case 4:
                ((Integer) obj2).intValue();
                int iM8496A5 = C3953b.m8496A(this.f16185d | 1);
                AbstractC6327b.m12356u((C6954b) this.f16186e, this.f16183b, (InterfaceC2139c) this.f16184c, (InterfaceC3962k) obj, iM8496A5);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iM8496A6 = C3953b.m8496A(this.f16185d | 1);
                AbstractC6327b.m12343h((C4802m) this.f16186e, this.f16183b, (InterfaceC2137a) this.f16184c, (InterfaceC3962k) obj, iM8496A6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iM8496A7 = C3953b.m8496A(1);
                AbstractC6327b.m12353r((C6955c) this.f16186e, (InterfaceC2139c) this.f16184c, this.f16183b, this.f16185d, (InterfaceC3962k) obj, iM8496A7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A8 = C3953b.m8496A(1);
                b1.m13090T(this.f16183b, this.f16185d, (String) this.f16186e, (InterfaceC2137a) this.f16184c, (InterfaceC3962k) obj, iM8496A8);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ f0(int i10, boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, int i11) {
        this.f16182a = 3;
        this.f16185d = i10;
        this.f16183b = z6;
        this.f16186e = interfaceC2137a;
        this.f16184c = interfaceC7879r;
    }

    public /* synthetic */ f0(Object obj, boolean z6, InterfaceC6355e interfaceC6355e, int i10, int i11) {
        this.f16182a = i11;
        this.f16186e = obj;
        this.f16183b = z6;
        this.f16184c = interfaceC6355e;
        this.f16185d = i10;
    }

    public /* synthetic */ f0(C6955c c6955c, InterfaceC2139c interfaceC2139c, boolean z6, int i10, int i11) {
        this.f16182a = 6;
        this.f16186e = c6955c;
        this.f16184c = interfaceC2139c;
        this.f16183b = z6;
        this.f16185d = i10;
    }
}
