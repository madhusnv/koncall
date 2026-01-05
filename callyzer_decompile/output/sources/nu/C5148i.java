package nu;

import ex.InterfaceC2141e;
import io.C3328c;
import java.util.ArrayList;
import java.util.List;
import pu.C6040h;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.i */
/* loaded from: classes3.dex */
public final class C5148i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public List f25204a;

    /* renamed from: b */
    public C6040h f25205b;

    /* renamed from: c */
    public int f25206c;

    /* renamed from: d */
    public int f25207d;

    /* renamed from: e */
    public int f25208e;

    /* renamed from: f */
    public /* synthetic */ Object f25209f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f25210g;

    /* renamed from: h */
    public final /* synthetic */ int f25211h;

    /* renamed from: j */
    public final /* synthetic */ C3328c f25212j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5148i(ArrayList arrayList, int i10, C3328c c3328c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f25210g = arrayList;
        this.f25211h = i10;
        this.f25212j = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C5148i c5148i = new C5148i(this.f25210g, this.f25211h, this.f25212j, interfaceC7559c);
        c5148i.f25209f = obj;
        return c5148i;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C5148i) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        if (r1.emit(r8, r17) == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e2 -> B:14:0x0033). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.C5148i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
