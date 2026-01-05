package l5;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.g */
/* loaded from: classes.dex */
public class C4388g extends C4387f {

    /* renamed from: m */
    public int f21972m;

    public C4388g(AbstractC4398q abstractC4398q) {
        super(abstractC4398q);
        if (abstractC4398q instanceof C4392k) {
            this.f21964e = EnumC4386e.HORIZONTAL_DIMENSION;
        } else {
            this.f21964e = EnumC4386e.VERTICAL_DIMENSION;
        }
    }

    @Override // l5.C4387f
    /* renamed from: d */
    public final void mo9165d(int i10) {
        if (this.f21969j) {
            return;
        }
        this.f21969j = true;
        this.f21966g = i10;
        ArrayList arrayList = this.f21970k;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            InterfaceC4385d interfaceC4385d = (InterfaceC4385d) obj;
            interfaceC4385d.mo9155a(interfaceC4385d);
        }
    }
}
