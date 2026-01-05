package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.List;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: an.t */
/* loaded from: classes3.dex */
public final class C0213t extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1363a;

    /* renamed from: b */
    public int f1364b;

    /* renamed from: c */
    public final /* synthetic */ C0214u f1365c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f1366d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f1367e;

    /* renamed from: f */
    public final /* synthetic */ String f1368f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1369g;

    /* renamed from: h */
    public final /* synthetic */ List f1370h;

    /* renamed from: j */
    public final /* synthetic */ int f1371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0213t(C0214u c0214u, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, boolean z6, List list, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(1, interfaceC7559c);
        this.f1363a = i11;
        this.f1365c = c0214u;
        this.f1366d = localDateTime;
        this.f1367e = localDateTime2;
        this.f1368f = str;
        this.f1369g = z6;
        this.f1370h = list;
        this.f1371j = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f1363a) {
            case 0:
                return new C0213t(this.f1365c, this.f1366d, this.f1367e, this.f1368f, this.f1369g, this.f1370h, this.f1371j, interfaceC7559c, 0);
            default:
                return new C0213t(this.f1365c, this.f1366d, this.f1367e, this.f1368f, this.f1369g, this.f1370h, this.f1371j, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f1363a) {
        }
        return ((C0213t) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1363a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f1364b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1364b = 1;
                C0214u c0214u = this.f1365c;
                c0214u.getClass();
                Object objM514c = C0214u.m514c(c0214u, this.f1366d, this.f1367e, this.f1368f, this.f1369g, this.f1370h, this.f1371j, this);
                return objM514c == enumC7794a ? enumC7794a : objM514c;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f1364b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1364b = 1;
                C0214u c0214u2 = this.f1365c;
                c0214u2.getClass();
                Object objM515d = C0214u.m515d(c0214u2, this.f1366d, this.f1367e, this.f1368f, this.f1369g, this.f1370h, this.f1371j, this);
                return objM515d == enumC7794a2 ? enumC7794a2 : objM515d;
        }
    }
}
