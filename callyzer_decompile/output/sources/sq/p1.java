package sq;

import ar.C0412b;
import bs.C0752j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import mr.C4862d;
import mr.C4863e;
import org.bouncycastle.iana.AEADAlgorithm;
import tq.EnumC7204p;
import ws.C8166g;
import ws.C8171l;
import yr.C8750i;
import yr.C8759r;
import yr.C8762u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f33129a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f33130b;

    public /* synthetic */ p1(int i10, InterfaceC2139c interfaceC2139c) {
        this.f33129a = i10;
        this.f33130b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f33129a) {
            case 0:
                this.f33130b.invoke("");
                break;
            case 1:
                this.f33130b.invoke(EnumC7204p.ALL);
                break;
            case 2:
                this.f33130b.invoke(EnumC7204p.SIM1);
                break;
            case 3:
                this.f33130b.invoke(EnumC7204p.SIM2);
                break;
            case 4:
                this.f33130b.invoke("filter_screen/top_frequent_call");
                break;
            case 5:
                this.f33130b.invoke(C8171l.f39094a);
                break;
            case 6:
                this.f33130b.invoke(C8166g.f39089a);
                break;
            case 7:
                this.f33130b.invoke(C4862d.f24371a);
                break;
            case 8:
                this.f33130b.invoke(C8750i.f42366a);
                break;
            case 9:
                this.f33130b.invoke(C8750i.f42366a);
                break;
            case 10:
                this.f33130b.invoke(new C4863e(C0752j.f4764a));
                break;
            case 11:
                this.f33130b.invoke(C8759r.f42378a);
                break;
            case 12:
                this.f33130b.invoke(new C4863e(C0752j.f4764a));
                break;
            case 13:
                this.f33130b.invoke(C8762u.f42380a);
                break;
            case 14:
                this.f33130b.invoke(yr.e0.f42359a);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f33130b.invoke(Boolean.FALSE);
                break;
            case 16:
                this.f33130b.invoke(Boolean.FALSE);
                break;
            case 17:
                this.f33130b.invoke(Boolean.TRUE);
                break;
            default:
                this.f33130b.invoke(C0412b.f3129a);
                break;
        }
        return qw.a0.f30746a;
    }
}
