package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class m0i extends rhd {

    /* renamed from: a */
    public int[] f34611a;

    /* renamed from: b */
    public int f34612b;

    public /* synthetic */ m0i(int[] iArr, id5 id5Var) {
        this(iArr);
    }

    @Override // p001o.rhd
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo17041a() {
        return l0i.m36429d(m38142f());
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        if (l0i.m36436y(this.f34611a) < i) {
            int[] iArr = this.f34611a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, bce.m18601d(i, l0i.m36436y(iArr) * 2));
            sq8.m48648g(iArrCopyOf, "copyOf(...)");
            this.f34611a = l0i.m36431j(iArrCopyOf);
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f34612b;
    }

    /* renamed from: e */
    public final void m38141e(int i) {
        rhd.m46778c(this, 0, 1, null);
        int[] iArr = this.f34611a;
        int iMo17043d = mo17043d();
        this.f34612b = iMo17043d + 1;
        l0i.m36427G(iArr, iMo17043d, i);
    }

    /* renamed from: f */
    public int[] m38142f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f34611a, mo17043d());
        sq8.m48648g(iArrCopyOf, "copyOf(...)");
        return l0i.m36431j(iArrCopyOf);
    }

    public m0i(int[] iArr) {
        sq8.m48649h(iArr, "bufferWithData");
        this.f34611a = iArr;
        this.f34612b = l0i.m36436y(iArr);
        mo17042b(10);
    }
}
