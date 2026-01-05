package cv;

import a1.C0005d;
import com.websoptimization.callyzerbiz.domain.model.WhatsNewDescription;
import ds.AbstractC1777a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kr.AbstractC4189d;
import lu.AbstractC4527m;
import og.f1;
import om.C5414p;
import pu.C6040h;
import qr.AbstractC6297u;
import qr.C6294r;
import qw.C6361k;
import qw.a0;
import rr.AbstractC6601a;
import s2.C6734c;
import sq.g2;
import ur.AbstractC7524q;
import ur.C7514g;
import ur.C7530w;
import ur.C7533z;
import vq.EnumC7729a;
import vs.AbstractC7766h;
import w2.InterfaceC7879r;
import ws.C8176q;
import xq.AbstractC8436j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1513i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7640a;

    /* renamed from: b */
    public final /* synthetic */ int f7641b;

    /* renamed from: c */
    public final /* synthetic */ Object f7642c;

    /* renamed from: d */
    public final /* synthetic */ Object f7643d;

    public /* synthetic */ C1513i(int i10, int i11, List list, InterfaceC7879r interfaceC7879r) {
        this.f7640a = 13;
        this.f7643d = list;
        this.f7642c = interfaceC7879r;
        this.f7641b = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7640a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                AbstractC1505a.m5068h((C5414p) this.f7642c, (List) this.f7643d, this.f7641b, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5463c((String) this.f7642c, (String) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4189d.m8941i((ArrayList) this.f7642c, (InterfaceC2139c) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C0005d) this.f7642c).m36C((ArrayList) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4527m.m9373d((InterfaceC7879r) this.f7642c, (C6040h) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                f1.m10637a((InterfaceC7879r) this.f7642c, (C6734c) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 6:
                AbstractC6297u abstractC6297u = (AbstractC6297u) this.f7642c;
                AbstractC7524q abstractC7524q = (AbstractC7524q) this.f7643d;
                LocalDateTime dialogStartDate = (LocalDateTime) obj;
                LocalDateTime dialogEndDate = (LocalDateTime) obj2;
                AbstractC4154l.m8923f(dialogStartDate, "dialogStartDate");
                AbstractC4154l.m8923f(dialogEndDate, "dialogEndDate");
                C6294r c6294r = (C6294r) abstractC6297u;
                List list = ((C7530w) c6294r.f30597j.f39340a.getValue()).f36269a;
                C7533z c7533z = new C7533z(dialogStartDate, dialogEndDate);
                int i10 = this.f7641b;
                list.set(i10, c7533z);
                abstractC7524q.mo2033e(new C7514g(i10, c6294r.f30598k));
                break;
            case 7:
                ((Integer) obj2).intValue();
                AbstractC6601a.m12663f((C6361k) this.f7642c, (InterfaceC2139c) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                g2.m13160l((WhatsNewDescription) this.f7642c, (InterfaceC2137a) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                g2.m13144V((InterfaceC7879r) this.f7642c, (WhatsNewDescription) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                g2.m13165q((InterfaceC2137a) this.f7642c, (InterfaceC2137a) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC7766h.m14745d((C8176q) this.f7642c, (InterfaceC2137a) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC8436j.m15742k((EnumC7729a) this.f7642c, (InterfaceC2137a) this.f7643d, (InterfaceC3962k) obj, C3953b.m8496A(this.f7641b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8436j.m15744m((List) this.f7643d, (InterfaceC7879r) this.f7642c, (InterfaceC3962k) obj, C3953b.m8496A(1), this.f7641b);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C1513i(int i10, AbstractC6297u abstractC6297u, AbstractC7524q abstractC7524q) {
        this.f7640a = 6;
        this.f7642c = abstractC6297u;
        this.f7641b = i10;
        this.f7643d = abstractC7524q;
    }

    public /* synthetic */ C1513i(Object obj, Object obj2, int i10, int i11) {
        this.f7640a = i11;
        this.f7642c = obj;
        this.f7643d = obj2;
        this.f7641b = i10;
    }

    public /* synthetic */ C1513i(C5414p c5414p, List list, int i10, int i11) {
        this.f7640a = 0;
        this.f7642c = c5414p;
        this.f7643d = list;
        this.f7641b = i10;
    }
}
