package p001o;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class af0 implements ewc {

    /* renamed from: a */
    public Paint f14587a;

    /* renamed from: b */
    public int f14588b;

    public af0(Paint paint) {
        sq8.m48649h(paint, "internalPaint");
        this.f14587a = paint;
        this.f14588b = ti1.f47165a.m49904a();
    }

    @Override // p001o.ewc
    /* renamed from: a */
    public void mo16978a(long j) {
        bf0.m18811d(this.f14587a, j);
    }

    @Override // p001o.ewc
    /* renamed from: b */
    public Paint mo16979b() {
        return this.f14587a;
    }

    @Override // p001o.ewc
    /* renamed from: c */
    public void mo16980c(float f) {
        bf0.m18810c(this.f14587a, f);
    }

    @Override // p001o.ewc
    /* renamed from: d */
    public void mo16981d(int i) {
        bf0.m18813f(this.f14587a, i);
    }

    @Override // p001o.ewc
    /* renamed from: e */
    public void mo16982e(float f) {
        bf0.m18812e(this.f14587a, f);
    }

    public af0() {
        this(bf0.m18809b());
    }
}
