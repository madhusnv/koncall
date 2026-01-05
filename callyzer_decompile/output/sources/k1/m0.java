package k1;

import a2.C0036i;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4168z;
import p3.EnumC5813k;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f20181b;

    /* renamed from: c */
    public Object f20182c;

    /* renamed from: d */
    public int f20183d;

    /* renamed from: e */
    public Object f20184e;

    /* renamed from: f */
    public final /* synthetic */ Object f20185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20181b = i10;
        this.f20184e = obj;
        this.f20185f = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ex.e, ww.h] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20181b) {
            case 0:
                m0 m0Var = new m0((InterfaceC7564h) this.f20184e, (InterfaceC2141e) this.f20185f, interfaceC7559c);
                m0Var.f20182c = obj;
                return m0Var;
            case 1:
                m0 m0Var2 = new m0((C0036i) this.f20185f, interfaceC7559c, 1);
                m0Var2.f20184e = obj;
                return m0Var2;
            case 2:
                m0 m0Var3 = new m0((EnumC5813k) this.f20184e, (C4168z) this.f20185f, interfaceC7559c, 2);
                m0Var3.f20182c = obj;
                return m0Var3;
            case 3:
                m0 m0Var4 = new m0((InterfaceC7564h) this.f20184e, (InterfaceC2139c) this.f20185f, interfaceC7559c, 3);
                m0Var4.f20182c = obj;
                return m0Var4;
            default:
                m0 m0Var5 = new m0((x1.d1) this.f20185f, interfaceC7559c, 4);
                m0Var5.f20182c = obj;
                return m0Var5;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20181b) {
        }
        return ((m0) create((p3.f0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0237 A[Catch: CancellationException -> 0x021e, TRY_ENTER, TryCatch #0 {CancellationException -> 0x021e, blocks: (B:121:0x0237, B:124:0x0246, B:110:0x021a, B:115:0x0225), top: B:135:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ex.e, ww.h] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0250 -> B:119:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0263 -> B:119:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c4 -> B:41:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x017e -> B:75:0x0181). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:98:0x01ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01eb -> B:98:0x01ec). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20181b = i10;
        this.f20185f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20181b = 0;
        this.f20184e = interfaceC7564h;
        this.f20185f = (AbstractC8198h) interfaceC2141e;
    }
}
