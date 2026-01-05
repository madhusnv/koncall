package dp;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import hv.C3036a;
import im.EnumC3310l;
import im.EnumC3312n;
import ms.C4870e;
import org.bouncycastle.iana.AEADAlgorithm;
import qv.C6346u;
import qw.a0;
import rv.C6629e;
import rv.C6640p;
import rv.C6646v;
import rv.C6647w;
import rv.C6649y;
import ss.C6915d;
import ss.C6917f;
import ss.C6935x;
import tv.C7235i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dp.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1736c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8405a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f8406b;

    public /* synthetic */ C1736c(int i10, InterfaceC2139c interfaceC2139c) {
        this.f8405a = i10;
        this.f8406b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f8405a) {
            case 0:
                this.f8406b.invoke("filter_screen/average_call_duration");
                break;
            case 1:
                this.f8406b.invoke(EnumC3312n.WHATSAPP);
                break;
            case 2:
                this.f8406b.invoke(EnumC3312n.CALL);
                break;
            case 3:
                this.f8406b.invoke(EnumC3312n.COPY);
                break;
            case 4:
                this.f8406b.invoke("filter_screen/call_types_summary");
                break;
            case 5:
                this.f8406b.invoke("synced_call_log_progress");
                break;
            case 6:
                this.f8406b.invoke("registration");
                break;
            case 7:
                this.f8406b.invoke("registration");
                break;
            case 8:
                this.f8406b.invoke(C3036a.f16367a);
                break;
            case 9:
                this.f8406b.invoke("exclude_number");
                break;
            case 10:
                this.f8406b.invoke(Boolean.FALSE);
                break;
            case 11:
                this.f8406b.invoke(Boolean.FALSE);
                break;
            case 12:
                this.f8406b.invoke(Boolean.FALSE);
                break;
            case 13:
                this.f8406b.invoke(Boolean.FALSE);
                break;
            case 14:
                this.f8406b.invoke(C4870e.f24382a);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f8406b.invoke(EnumC3310l.AtoZ);
                break;
            case 16:
                this.f8406b.invoke(C6917f.f33429a);
                break;
            case 17:
                this.f8406b.invoke(C6915d.f33418a);
                break;
            case 18:
                this.f8406b.invoke(new C6935x("+"));
                break;
            case 19:
                this.f8406b.invoke(new C6935x("0"));
                break;
            case 20:
                this.f8406b.invoke(C7235i.f34587a);
                break;
            case 21:
                this.f8406b.invoke(C6346u.f30740a);
                break;
            case 22:
                this.f8406b.invoke(C6346u.f30740a);
                break;
            case 23:
                this.f8406b.invoke(C6640p.f31862a);
                break;
            case 24:
                this.f8406b.invoke(C6646v.f31914a);
                break;
            case 25:
                this.f8406b.invoke(C6649y.f31931a);
                break;
            case 26:
                this.f8406b.invoke(C6649y.f31931a);
                break;
            case 27:
                this.f8406b.invoke(C6647w.f31929a);
                break;
            case 28:
                this.f8406b.invoke(C6629e.f31828a);
                break;
            default:
                System.out.println((Object) "clear search");
                this.f8406b.invoke("");
                break;
        }
        return a0.f30746a;
    }
}
