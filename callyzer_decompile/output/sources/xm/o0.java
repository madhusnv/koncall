package xm;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40644a = 1;

    /* renamed from: b */
    public x1 f40645b;

    /* renamed from: c */
    public String f40646c;

    /* renamed from: d */
    public LocalDateTime f40647d;

    /* renamed from: e */
    public int f40648e;

    /* renamed from: f */
    public int f40649f;

    /* renamed from: g */
    public int f40650g;

    /* renamed from: h */
    public final /* synthetic */ x1 f40651h;

    /* renamed from: j */
    public final /* synthetic */ LocalDateTime f40652j;

    /* renamed from: k */
    public final /* synthetic */ int f40653k;

    /* renamed from: l */
    public final /* synthetic */ int f40654l;

    /* renamed from: m */
    public Object f40655m;

    /* renamed from: n */
    public final /* synthetic */ Object f40656n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, String str2, x1 x1Var, LocalDateTime localDateTime, int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f40655m = str;
        this.f40656n = str2;
        this.f40651h = x1Var;
        this.f40652j = localDateTime;
        this.f40653k = i10;
        this.f40654l = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40644a) {
            case 0:
                return new o0(this.f40646c, this.f40651h, (EnumC8994d) this.f40656n, this.f40652j, this.f40653k, this.f40654l, interfaceC7559c);
            default:
                return new o0((String) this.f40655m, (String) this.f40656n, this.f40651h, this.f40652j, this.f40653k, this.f40654l, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40644a) {
        }
        return ((o0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) throws com.websoptimization.callyzerbiz.common.exception.InValidDataPassException {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, x1 x1Var, EnumC8994d enumC8994d, LocalDateTime localDateTime, int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f40646c = str;
        this.f40651h = x1Var;
        this.f40656n = enumC8994d;
        this.f40652j = localDateTime;
        this.f40653k = i10;
        this.f40654l = i11;
    }
}
