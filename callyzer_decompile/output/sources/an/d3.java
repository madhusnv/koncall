package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.io.Serializable;
import kotlin.jvm.internal.C4166x;
import rc.C6493d;
import sc.C6802v;
import uw.InterfaceC7559c;
import wc.InterfaceC7971e;
import ww.AbstractC8199i;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d3 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f739a = 0;

    /* renamed from: b */
    public int f740b;

    /* renamed from: c */
    public Object f741c;

    /* renamed from: d */
    public final /* synthetic */ Serializable f742d;

    /* renamed from: e */
    public final /* synthetic */ Object f743e;

    /* renamed from: f */
    public final /* synthetic */ Object f744f;

    /* renamed from: g */
    public final /* synthetic */ Object f745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(h3 h3Var, String str, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f741c = h3Var;
        this.f742d = str;
        this.f743e = str2;
        this.f744f = enumC8994d;
        this.f745g = localDateTime;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f739a) {
            case 0:
                return new d3((h3) this.f741c, (String) this.f742d, (String) this.f743e, (EnumC8994d) this.f744f, (LocalDateTime) this.f745g, interfaceC7559c);
            default:
                return new d3((C4166x) this.f742d, (C6493d) this.f743e, (C6802v) this.f744f, (InterfaceC7971e) this.f745g, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f739a) {
        }
        return ((d3) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0018, B:45:0x00e7, B:47:0x00eb, B:49:0x00fb, B:48:0x00f3), top: B:64:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0018, B:45:0x00e7, B:47:0x00eb, B:49:0x00fb, B:48:0x00f3), top: B:64:0x000f }] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(C4166x c4166x, C6493d c6493d, C6802v c6802v, InterfaceC7971e interfaceC7971e, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f742d = c4166x;
        this.f743e = c6493d;
        this.f744f = c6802v;
        this.f745g = interfaceC7971e;
    }
}
