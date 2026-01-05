package p001o;

import p001o.em5;

/* loaded from: classes2.dex */
public class gt5 extends em5 {

    /* renamed from: m */
    public int f25783m;

    public gt5(r8j r8jVar) {
        super(r8jVar);
        if (r8jVar instanceof x08) {
            this.f21864e = em5.EnumC13217a.HORIZONTAL_DIMENSION;
        } else {
            this.f21864e = em5.EnumC13217a.VERTICAL_DIMENSION;
        }
    }

    @Override // p001o.em5
    /* renamed from: d */
    public void mo25285d(int i) {
        if (this.f21869j) {
            return;
        }
        this.f21869j = true;
        this.f21866g = i;
        for (cm5 cm5Var : this.f21870k) {
            cm5Var.mo19843a(cm5Var);
        }
    }
}
