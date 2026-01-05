package mn;

import an.C0208o;
import an.C0209p;
import an.C0210q;
import an.C0211r;
import an.t4;
import ex.InterfaceC2141e;
import gn.x2;
import j$.time.LocalDateTime;
import java.util.List;
import og.od;
import og.pe;
import p020v.a1;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;
import xm.C8418z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.z */
/* loaded from: classes3.dex */
public final class C4829z extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C8090p f24107a;

    /* renamed from: b */
    public LocalDateTime f24108b;

    /* renamed from: c */
    public LocalDateTime f24109c;

    /* renamed from: d */
    public String f24110d;

    /* renamed from: e */
    public List f24111e;

    /* renamed from: f */
    public boolean f24112f;

    /* renamed from: g */
    public int f24113g;

    /* renamed from: h */
    public final /* synthetic */ g0 f24114h;

    /* renamed from: j */
    public final /* synthetic */ LocalDateTime f24115j;

    /* renamed from: k */
    public final /* synthetic */ LocalDateTime f24116k;

    /* renamed from: l */
    public final /* synthetic */ boolean f24117l;

    /* renamed from: m */
    public final /* synthetic */ String f24118m;

    /* renamed from: n */
    public final /* synthetic */ List f24119n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4829z(g0 g0Var, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, String str, List list, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f24114h = g0Var;
        this.f24115j = localDateTime;
        this.f24116k = localDateTime2;
        this.f24117l = z6;
        this.f24118m = str;
        this.f24119n = list;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C4829z(this.f24114h, this.f24115j, this.f24116k, this.f24117l, this.f24118m, this.f24119n, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C4829z) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C8090p c8090p;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        String str;
        List list;
        boolean z6;
        Object objM15711a;
        Object objM10839n;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f24113g;
        if (i10 == 0) {
            od.m10798c(obj);
            g0 g0Var = this.f24114h;
            c8090p = g0Var.f24007b;
            C8418z c8418z = g0Var.f24011f;
            this.f24107a = c8090p;
            localDateTime = this.f24115j;
            this.f24108b = localDateTime;
            localDateTime2 = this.f24116k;
            this.f24109c = localDateTime2;
            str = this.f24118m;
            this.f24110d = str;
            list = this.f24119n;
            this.f24111e = list;
            z6 = this.f24117l;
            this.f24112f = z6;
            this.f24113g = 1;
            objM15711a = c8418z.m15711a(this);
            if (objM15711a != enumC7794a) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        boolean z10 = this.f24112f;
        list = this.f24111e;
        str = this.f24110d;
        localDateTime2 = this.f24109c;
        localDateTime = this.f24108b;
        c8090p = this.f24107a;
        od.m10798c(obj);
        z6 = z10;
        objM15711a = obj;
        List list2 = list;
        String str2 = str;
        LocalDateTime localDateTime3 = localDateTime2;
        LocalDateTime localDateTime4 = localDateTime;
        int iIntValue = ((Number) objM15711a).intValue();
        this.f24107a = null;
        this.f24108b = null;
        this.f24109c = null;
        this.f24110d = null;
        this.f24111e = null;
        this.f24113g = 2;
        t4 t4Var = ((x2) c8090p.f38723a).f14946f;
        if (z6 && str2.length() > 0) {
            t4Var.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SELECT COUNT(DISTINCT phone_number) as count FROM ViewCallLogUserSim WHERE phone_number IS NOT NULL AND sim_number = ? AND phone_number NOT IN (");
            objM10839n = pe.m10839n(this, t4Var.f1410a, true, false, new C0208o(a1.m14336p(sb2, "?", " AND ", "?", "toString(...)"), str2, list2, a1.m14323c(list2, sb2, ") AND duration > ", "?", " AND date_time BETWEEN "), iIntValue, localDateTime4, localDateTime3, 6));
        } else if (z6 && str2.length() == 0) {
            t4Var.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SELECT COUNT(DISTINCT phone_number) as count FROM ViewCallLogUserSim WHERE phone_number IS NOT NULL AND phone_number NOT IN (");
            objM10839n = pe.m10839n(this, t4Var.f1410a, true, false, new C0210q(a1.m14336p(sb3, "?", " AND ", "?", "toString(...)"), list2, a1.m14323c(list2, sb3, ") AND duration > ", "?", " AND date_time BETWEEN "), iIntValue, localDateTime4, localDateTime3, 2));
        } else {
            objM10839n = str2.length() > 0 ? pe.m10839n(this, t4Var.f1410a, true, false, new C0209p(iIntValue, str2, localDateTime4, localDateTime3)) : pe.m10839n(this, t4Var.f1410a, true, false, new C0211r(iIntValue, localDateTime4, localDateTime3, 2));
        }
        return objM10839n == enumC7794a ? enumC7794a : objM10839n;
    }
}
