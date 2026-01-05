package ec;

import ex.InterfaceC2141e;
import java.util.Iterator;
import mx.C4912h;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.r */
/* loaded from: classes.dex */
public final class C2020r extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f9569b;

    /* renamed from: c */
    public Iterator f9570c;

    /* renamed from: d */
    public Object f9571d;

    /* renamed from: e */
    public Iterator f9572e;

    /* renamed from: f */
    public int f9573f;

    /* renamed from: g */
    public int f9574g;

    /* renamed from: h */
    public int f9575h;

    /* renamed from: j */
    public int f9576j;

    /* renamed from: k */
    public /* synthetic */ Object f9577k;

    /* renamed from: l */
    public final /* synthetic */ Object f9578l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2020r(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9569b = i10;
        this.f9578l = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9569b) {
            case 0:
                C2020r c2020r = new C2020r((C2021s) this.f9578l, interfaceC7559c, 0);
                c2020r.f9577k = obj;
                return c2020r;
            default:
                C2020r c2020r2 = new C2020r((C2022t) this.f9578l, interfaceC7559c, 1);
                c2020r2.f9577k = obj;
                return c2020r2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C4912h c4912h = (C4912h) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9569b) {
        }
        return ((C2020r) create(c4912h, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d0 -> B:31:0x00e8). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.C2020r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
