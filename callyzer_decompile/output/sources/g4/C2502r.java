package g4;

import a9.C0073l;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4155m;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.r */
/* loaded from: classes.dex */
public final class C2502r extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f13706a;

    /* renamed from: b */
    public final /* synthetic */ C0073l f13707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2502r(C0073l c0073l, int i10) {
        super(0);
        this.f13706a = i10;
        this.f13707b = c0073l;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f13706a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13707b.f268e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fM6958c = ((C2504t) obj3).f13716a.f25965j.m6958c();
                    int iM10832g = pe.m10832g(arrayList);
                    int i10 = 1;
                    if (1 <= iM10832g) {
                        while (true) {
                            Object obj4 = arrayList.get(i10);
                            float fM6958c2 = ((C2504t) obj4).f13716a.f25965j.m6958c();
                            if (Float.compare(fM6958c, fM6958c2) < 0) {
                                obj3 = obj4;
                                fM6958c = fM6958c2;
                            }
                            if (i10 != iM10832g) {
                                i10++;
                            }
                        }
                    }
                    obj = obj3;
                }
                C2504t c2504t = (C2504t) obj;
                return Float.valueOf(c2504t != null ? c2504t.f13716a.f25965j.m6958c() : DefinitionKt.NO_Float_VALUE);
            default:
                ArrayList arrayList2 = (ArrayList) this.f13707b.f268e;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fMo210b = ((C2504t) obj5).f13716a.mo210b();
                    int iM10832g2 = pe.m10832g(arrayList2);
                    int i11 = 1;
                    if (1 <= iM10832g2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i11);
                            float fMo210b2 = ((C2504t) obj6).f13716a.mo210b();
                            if (Float.compare(fMo210b, fMo210b2) < 0) {
                                obj5 = obj6;
                                fMo210b = fMo210b2;
                            }
                            if (i11 != iM10832g2) {
                                i11++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                C2504t c2504t2 = (C2504t) obj2;
                return Float.valueOf(c2504t2 != null ? c2504t2.f13716a.mo210b() : DefinitionKt.NO_Float_VALUE);
        }
    }
}
