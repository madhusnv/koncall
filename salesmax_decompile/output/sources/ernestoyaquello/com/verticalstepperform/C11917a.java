package ernestoyaquello.com.verticalstepperform;

import p001o.b6g;

/* renamed from: ernestoyaquello.com.verticalstepperform.a */
/* loaded from: classes6.dex */
public class C11917a {

    /* renamed from: a */
    public VerticalStepperFormView f13890a;

    /* renamed from: b */
    public b6g f13891b;

    /* renamed from: c */
    public C11919c[] f13892c;

    public C11917a(VerticalStepperFormView verticalStepperFormView, b6g b6gVar, AbstractC11918b[] abstractC11918bArr) {
        this.f13890a = verticalStepperFormView;
        this.f13891b = b6gVar;
        this.f13892c = new C11919c[abstractC11918bArr.length];
        for (int i = 0; i < abstractC11918bArr.length; i++) {
            this.f13892c[i] = new C11919c(verticalStepperFormView.f13831a, abstractC11918bArr[i]);
        }
    }

    /* renamed from: a */
    public final void m16152a() {
        if (this.f13890a.f13832b.f13853J) {
            C11919c[] c11919cArr = this.f13892c;
            C11919c[] c11919cArr2 = new C11919c[c11919cArr.length + 1];
            this.f13892c = c11919cArr2;
            System.arraycopy(c11919cArr, 0, c11919cArr2, 0, c11919cArr.length);
            this.f13892c[c11919cArr.length] = new C11919c(this.f13890a.f13831a, null, true);
        }
    }

    /* renamed from: b */
    public void m16153b() {
        m16152a();
        this.f13890a.m16114B(this.f13891b, this.f13892c);
    }

    /* renamed from: c */
    public C11917a m16154c(String str) {
        this.f13890a.f13832b.f13864b = str;
        return this;
    }
}
