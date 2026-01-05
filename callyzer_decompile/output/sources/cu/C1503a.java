package cu;

import d7.w0;
import ex.InterfaceC2141e;
import hu.C3035a;
import j$.time.LocalDateTime;
import ku.C4246d;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cu.a */
/* loaded from: classes3.dex */
public final class C1503a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7596a;

    /* renamed from: b */
    public Object f7597b;

    /* renamed from: c */
    public Object f7598c;

    /* renamed from: d */
    public int f7599d;

    /* renamed from: e */
    public int f7600e;

    /* renamed from: f */
    public int f7601f;

    /* renamed from: g */
    public int f7602g;

    /* renamed from: h */
    public int f7603h;

    /* renamed from: j */
    public Object f7604j;

    /* renamed from: k */
    public Object f7605k;

    /* renamed from: l */
    public Object f7606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503a(int i10, int i11, String str, LocalDateTime localDateTime, InterfaceC7559c interfaceC7559c, x1 x1Var) {
        super(2, interfaceC7559c);
        this.f7596a = 3;
        this.f7605k = str;
        this.f7598c = x1Var;
        this.f7606l = localDateTime;
        this.f7602g = i10;
        this.f7603h = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f7596a) {
            case 0:
                return new C1503a((C1504b) this.f7605k, interfaceC7559c, 0);
            case 1:
                return new C1503a((C3035a) this.f7606l, interfaceC7559c);
            case 2:
                return new C1503a((C4246d) this.f7605k, interfaceC7559c, 2);
            default:
                String str = (String) this.f7605k;
                x1 x1Var = (x1) this.f7598c;
                return new C1503a(this.f7602g, this.f7603h, str, (LocalDateTime) this.f7606l, interfaceC7559c, x1Var);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f7596a) {
        }
        return ((C1503a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e4, code lost:
    
        if (r5 == r2) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0438 -> B:107:0x0443). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0251 -> B:44:0x0258). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0330 -> B:70:0x0337). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.C1503a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1503a(w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f7596a = i10;
        this.f7605k = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503a(C3035a c3035a, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f7596a = 1;
        this.f7606l = c3035a;
    }
}
