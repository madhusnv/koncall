package e1;

import ex.InterfaceC2141e;
import m2.C4642g;
import mx.C4912h;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.g */
/* loaded from: classes.dex */
public final class C1905g extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f8969b;

    /* renamed from: c */
    public long[] f8970c;

    /* renamed from: d */
    public int f8971d;

    /* renamed from: e */
    public int f8972e;

    /* renamed from: f */
    public int f8973f;

    /* renamed from: g */
    public int f8974g;

    /* renamed from: h */
    public long f8975h;

    /* renamed from: j */
    public int f8976j;

    /* renamed from: k */
    public /* synthetic */ Object f8977k;

    /* renamed from: l */
    public Object f8978l;

    /* renamed from: m */
    public final /* synthetic */ Object f8979m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1905g(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8969b = i10;
        this.f8979m = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8969b) {
            case 0:
                C1905g c1905g = new C1905g((C1906h) this.f8979m, interfaceC7559c, 0);
                c1905g.f8977k = obj;
                return c1905g;
            case 1:
                C1905g c1905g2 = new C1905g((C1906h) this.f8979m, interfaceC7559c, 1);
                c1905g2.f8977k = obj;
                return c1905g2;
            case 2:
                C1905g c1905g3 = new C1905g((y0) this.f8979m, interfaceC7559c, 2);
                c1905g3.f8977k = obj;
                return c1905g3;
            default:
                C1905g c1905g4 = new C1905g((C4642g) this.f8979m, interfaceC7559c, 3);
                c1905g4.f8977k = obj;
                return c1905g4;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C4912h c4912h = (C4912h) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8969b) {
        }
        return ((C1905g) create(c4912h, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0292 -> B:103:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:25:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fa -> B:50:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:41:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0116 -> B:47:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0133 -> B:47:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0199 -> B:75:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x019b -> B:66:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01b5 -> B:72:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01d2 -> B:72:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0237 -> B:91:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0252 -> B:97:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x027f -> B:98:0x0284). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1905g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
