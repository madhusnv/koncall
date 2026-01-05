package mn;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import ss.z0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f23985a = 1;

    /* renamed from: b */
    public int f23986b;

    /* renamed from: c */
    public String f23987c;

    /* renamed from: d */
    public Object f23988d;

    /* renamed from: e */
    public Object f23989e;

    /* renamed from: f */
    public final /* synthetic */ Object f23990f;

    /* renamed from: g */
    public boolean f23991g;

    /* renamed from: h */
    public Object f23992h;

    /* renamed from: j */
    public /* synthetic */ Object f23993j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, g0 g0Var, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f23987c = str;
        this.f23988d = g0Var;
        this.f23989e = localDateTime;
        this.f23990f = localDateTime2;
        this.f23991g = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f23985a) {
            case 0:
                return new e0((g0) this.f23992h, (LocalDateTime) this.f23989e, (LocalDateTime) this.f23990f, (ArrayList) this.f23993j, this.f23991g, this.f23987c, interfaceC7559c);
            case 1:
                e0 e0Var = new e0(this.f23987c, (LocalDateTime) this.f23989e, (LocalDateTime) this.f23990f, (g0) this.f23988d, interfaceC7559c, this.f23991g);
                e0Var.f23993j = obj;
                return e0Var;
            default:
                return new e0((ss.a0) this.f23990f, (z0) this.f23993j, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f23985a) {
        }
        return ((e0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x029a A[LOOP:1: B:112:0x0294->B:114:0x029a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cc A[LOOP:2: B:116:0x02c6->B:118:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z6, String str, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f23992h = g0Var;
        this.f23989e = localDateTime;
        this.f23990f = localDateTime2;
        this.f23993j = arrayList;
        this.f23991g = z6;
        this.f23987c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ss.a0 a0Var, z0 z0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f23990f = a0Var;
        this.f23993j = z0Var;
    }
}
