package tp;

import ex.InterfaceC2137a;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.a0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.c9;
import q7.C6138e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7188i implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f34477a;

    /* renamed from: b */
    public final /* synthetic */ a0 f34478b;

    public /* synthetic */ C7188i(a0 a0Var, int i10) {
        this.f34477a = i10;
        this.f34478b = a0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        AbstractC4422v abstractC4422v;
        switch (this.f34477a) {
            case 0:
                this.f34478b.m9188g();
                break;
            case 1:
                this.f34478b.m9188g();
                break;
            case 2:
                this.f34478b.m9188g();
                break;
            case 3:
                a0.m9181f(this.f34478b, "filter_screen/total_calls");
                break;
            case 4:
                a0.m9182h(this.f34478b, "analytics", true);
                break;
            case 5:
                this.f34478b.m9188g();
                break;
            case 6:
                this.f34478b.m9188g();
                break;
            case 7:
                this.f34478b.m9188g();
                break;
            case 8:
                this.f34478b.m9188g();
                break;
            case 9:
                this.f34478b.m9188g();
                break;
            case 10:
                this.f34478b.m9188g();
                break;
            case 11:
                this.f34478b.m9188g();
                break;
            case 12:
                this.f34478b.m9188g();
                break;
            case 13:
                a0.m9181f(this.f34478b, "filter_screen/top_caller");
                break;
            case 14:
                a0.m9181f(this.f34478b, "filter_screen/longest_call");
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                a0.m9181f(this.f34478b, "filter_screen/never_attend_calls_summary");
                break;
            case 16:
                a0.m9181f(this.f34478b, c9.m11573b(null, null, 19, "lead", true));
                break;
            case 17:
                a0 a0Var = this.f34478b;
                int i10 = a0Var.f21996b.m12174i().f22135b.f29939e;
                C6138e c6138e = a0Var.f21996b;
                return Boolean.valueOf(c6138e.m12181p(i10, true, false) && c6138e.m12168b());
            case 18:
                a0.m9181f(this.f34478b, "filter_screen/highest_call");
                break;
            case 19:
                this.f34478b.m9188g();
                break;
            case 20:
                this.f34478b.m9188g();
                break;
            case 21:
                this.f34478b.m9188g();
                break;
            case 22:
                this.f34478b.m9188g();
                break;
            case 23:
                this.f34478b.m9188g();
                break;
            case 24:
                this.f34478b.m9188g();
                break;
            case 25:
                a0 a0Var2 = this.f34478b;
                C4409i c4409iM9185c = a0Var2.m9185c();
                if (((c4409iM9185c == null || (abstractC4422v = c4409iM9185c.f22046b) == null) ? null : abstractC4422v.f22135b.f29940f) == null) {
                    a0.m9181f(a0Var2, "main_screen");
                } else {
                    a0Var2.m9188g();
                }
                return qw.a0.f30746a;
            case 26:
                a0.m9181f(this.f34478b, "filter_screen/not_pick_up_call_by_client");
                break;
            case 27:
                this.f34478b.m9188g();
                break;
            case 28:
                this.f34478b.m9188g();
                break;
            default:
                a0.m9181f(this.f34478b, "filter_screen/top_duration_call");
                break;
        }
        return qw.a0.f30746a;
    }
}
