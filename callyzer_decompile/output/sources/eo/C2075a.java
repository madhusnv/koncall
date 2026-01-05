package eo;

import ep.C2088f;
import ex.InterfaceC2141e;
import lp.C4505g;
import np.C5128f;
import pp.C5995k;
import qw.a0;
import sp.C6883f;
import tx.InterfaceC7266z;
import up.C7494g;
import ur.AbstractC7524q;
import uw.InterfaceC7559c;
import wp.C8141g;
import ww.AbstractC8199i;
import yp.C8735o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eo.a */
/* loaded from: classes3.dex */
public final class C2075a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9698a;

    /* renamed from: b */
    public Object f9699b;

    /* renamed from: c */
    public int f9700c;

    /* renamed from: d */
    public int f9701d;

    /* renamed from: e */
    public int f9702e;

    /* renamed from: f */
    public int f9703f;

    /* renamed from: g */
    public Object f9704g;

    /* renamed from: h */
    public Object f9705h;

    /* renamed from: j */
    public Object f9706j;

    /* renamed from: k */
    public Object f9707k;

    /* renamed from: l */
    public Object f9708l;

    /* renamed from: m */
    public Object f9709m;

    /* renamed from: n */
    public Object f9710n;

    /* renamed from: p */
    public Object f9711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2075a(C2082h c2082h, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9698a = 0;
        this.f9706j = c2082h;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9698a) {
            case 0:
                return new C2075a((C2082h) this.f9706j, interfaceC7559c);
            case 1:
                return new C2075a((C2088f) this.f9711p, interfaceC7559c, 1);
            case 2:
                return new C2075a((C4505g) this.f9711p, interfaceC7559c, 2);
            case 3:
                return new C2075a((C5128f) this.f9711p, interfaceC7559c, 3);
            case 4:
                return new C2075a((C5995k) this.f9711p, interfaceC7559c, 4);
            case 5:
                return new C2075a((C6883f) this.f9711p, interfaceC7559c, 5);
            case 6:
                return new C2075a((C7494g) this.f9711p, interfaceC7559c, 6);
            case 7:
                return new C2075a((C8141g) this.f9711p, interfaceC7559c, 7);
            default:
                return new C2075a((C8735o) this.f9711p, interfaceC7559c, 8);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9698a) {
        }
        return ((C2075a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02df  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v79, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v88, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v110, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v72, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v85, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0449 -> B:139:0x044e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0578 -> B:179:0x057d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x06a7 -> B:219:0x06ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d4 -> B:25:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x07d6 -> B:259:0x07db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:298:0x0905 -> B:299:0x090a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:334:0x0a59 -> B:335:0x0a61). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01dc -> B:58:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0310 -> B:98:0x0315). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.C2075a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2075a(AbstractC7524q abstractC7524q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9698a = i10;
        this.f9711p = abstractC7524q;
    }
}
