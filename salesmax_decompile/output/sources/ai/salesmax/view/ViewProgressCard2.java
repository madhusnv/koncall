package ai.salesmax.view;

import ai.salesmax.view.ViewProgressCard2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import p001o.c64;
import p001o.sbe;
import p001o.sq8;
import p001o.syi;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewProgressCard2 extends FrameLayout {

    /* renamed from: a */
    public String f5070a;

    /* renamed from: b */
    public String f5071b;

    /* renamed from: c */
    public int f5072c;

    /* renamed from: d */
    public int f5073d;

    /* renamed from: e */
    public int f5074e;

    /* renamed from: f */
    public boolean f5075f;

    /* renamed from: g */
    public syi f5076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProgressCard2(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5070a = "";
        this.f5071b = "";
        this.f5072c = -1;
        this.f5073d = -1;
        this.f5074e = -1;
        m3399b();
    }

    private final syi getBinding() {
        syi syiVar = this.f5076g;
        sq8.m48646e(syiVar);
        return syiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgressBarPercent$lambda$0(ViewProgressCard2 viewProgressCard2) {
        sq8.m48649h(viewProgressCard2, "this$0");
        viewProgressCard2.getBinding().r0.setCurrentValues(viewProgressCard2.f5072c);
    }

    /* renamed from: b */
    public final void m3399b() {
        if (this.f5076g == null) {
            this.f5076g = syi.h0(LayoutInflater.from(getContext()), this, true);
        }
    }

    /* renamed from: c */
    public final void m3400c(Context context, AttributeSet attributeSet) {
        m3399b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProgressCard, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5070a = typedArrayObtainStyledAttributes.getString(sbe.ViewProgressCard_superfone_progress_card_title);
            this.f5071b = typedArrayObtainStyledAttributes.getString(sbe.ViewProgressCard_superfone_progress_card_subTitle);
            this.f5072c = typedArrayObtainStyledAttributes.getInteger(sbe.ViewProgressCard_superfone_progress_card_percent, -1);
            this.f5073d = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProgressCard_superfone_progress_card_icon, -1);
            this.f5074e = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProgressCard_superfone_progress_card_color, -1);
            m3405h();
            m3404g();
            m3402e();
            m3401d();
            m3403f();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public final void m3401d() {
        if (this.f5074e != -1) {
            getBinding().n0.setBackgroundColor(c64.getColor(getContext(), this.f5074e));
            getBinding().o0.setCardBackgroundColor(c64.getColor(getContext(), this.f5074e));
        }
    }

    /* renamed from: e */
    public final void m3402e() {
        if (this.f5073d != -1) {
            getBinding().p0.setImageResource(this.f5073d);
        }
    }

    /* renamed from: f */
    public final void m3403f() {
        if (this.f5072c != -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.ryi
                @Override // java.lang.Runnable
                public final void run() {
                    ViewProgressCard2.setProgressBarPercent$lambda$0(this.f44267a);
                }
            }, 1000L);
        }
    }

    /* renamed from: g */
    public final void m3404g() {
        getBinding().s0.setText(this.f5071b);
    }

    /* renamed from: h */
    public final void m3405h() {
        getBinding().q0.setText(this.f5070a);
    }

    public final void setCardColor(int i) {
        this.f5074e = i;
        m3401d();
    }

    public final void setHasNew(boolean z) {
        this.f5075f = z;
        if (z) {
            getBinding().t0.setVisibility(0);
        } else {
            getBinding().t0.setVisibility(4);
        }
    }

    public final void setIcon(int i) {
        this.f5073d = i;
        m3402e();
    }

    public final void setProgressBarPercent(int i) {
        this.f5072c = i;
        m3403f();
    }

    public final void setSubTitle(String str) {
        this.f5071b = str;
        m3404g();
    }

    public final void setTitle(String str) {
        this.f5070a = str;
        m3405h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProgressCard2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5070a = "";
        this.f5071b = "";
        this.f5072c = -1;
        this.f5073d = -1;
        this.f5074e = -1;
        m3400c(context, attributeSet);
    }
}
