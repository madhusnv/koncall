package e5;

import d5.C1598b;
import d5.C1603g;
import d5.EnumC1606j;
import d5.EnumC1608l;
import java.util.ArrayList;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C1946a extends C1603g {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f44183n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f44184o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1946a(C8553n c8553n, EnumC1608l enumC1608l, int i10) {
        super(c8553n, enumC1608l);
        this.f44183n0 = i10;
    }

    @Override // d5.C1603g, d5.C1598b, d5.InterfaceC1604h
    public final void apply() {
        switch (this.f44183n0) {
            case 0:
                int i10 = 0;
                ArrayList arrayList = this.f44182m0;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C1598b c1598bM15821b = this.f44180k0.m15821b(obj);
                    c1598bM15821b.m5243g();
                    Object obj2 = this.f7962N;
                    if (obj2 != null) {
                        c1598bM15821b.m5251o(obj2);
                    } else {
                        Object obj3 = this.f7963O;
                        if (obj3 != null) {
                            c1598bM15821b.f44173d0 = EnumC1606j.START_TO_END;
                            c1598bM15821b.f7963O = obj3;
                        } else {
                            c1598bM15821b.m5251o(0);
                        }
                    }
                    Object obj4 = this.f7964P;
                    if (obj4 != null) {
                        c1598bM15821b.f44173d0 = EnumC1606j.END_TO_START;
                        c1598bM15821b.f7964P = obj4;
                    } else {
                        Object obj5 = this.f7965Q;
                        if (obj5 != null) {
                            c1598bM15821b.m5245i(obj5);
                        } else {
                            c1598bM15821b.m5245i(0);
                        }
                    }
                    float f6 = this.f44184o0;
                    if (f6 != 0.5f) {
                        c1598bM15821b.f7982h = f6;
                    }
                }
                break;
            default:
                int i11 = 0;
                ArrayList arrayList2 = this.f44182m0;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj6 = arrayList2.get(i11);
                    i11++;
                    C1598b c1598bM15821b2 = this.f44180k0.m15821b(obj6);
                    c1598bM15821b2.m5244h();
                    Object obj7 = this.f7966R;
                    if (obj7 != null) {
                        c1598bM15821b2.m5252p(obj7);
                    } else {
                        Object obj8 = this.f7967S;
                        if (obj8 != null) {
                            c1598bM15821b2.f44173d0 = EnumC1606j.TOP_TO_BOTTOM;
                            c1598bM15821b2.f7967S = obj8;
                        } else {
                            c1598bM15821b2.m5252p(0);
                        }
                    }
                    Object obj9 = this.f7969U;
                    if (obj9 != null) {
                        c1598bM15821b2.f44173d0 = EnumC1606j.BOTTOM_TO_TOP;
                        c1598bM15821b2.f7969U = obj9;
                    } else {
                        Object obj10 = this.f7970V;
                        if (obj10 != null) {
                            c1598bM15821b2.m5241e(obj10);
                        } else {
                            c1598bM15821b2.m5241e(0);
                        }
                    }
                    float f10 = this.f44184o0;
                    if (f10 != 0.5f) {
                        c1598bM15821b2.f7983i = f10;
                    }
                }
                break;
        }
    }
}
