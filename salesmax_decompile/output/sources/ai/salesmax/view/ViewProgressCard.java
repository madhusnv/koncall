package ai.salesmax.view;

import ai.salesmax.view.ViewProgressCard;
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
import p001o.uyi;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewProgressCard extends FrameLayout {

    /* renamed from: a */
    public String f5063a;

    /* renamed from: b */
    public String f5064b;

    /* renamed from: c */
    public int f5065c;

    /* renamed from: d */
    public int f5066d;

    /* renamed from: e */
    public int f5067e;

    /* renamed from: f */
    public boolean f5068f;

    /* renamed from: g */
    public uyi f5069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProgressCard(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5063a = "";
        this.f5064b = "";
        this.f5065c = -1;
        this.f5066d = -1;
        this.f5067e = -1;
        m3391b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgressBarPercent$lambda$0(ViewProgressCard viewProgressCard) {
        sq8.m48649h(viewProgressCard, "this$0");
        uyi uyiVar = viewProgressCard.f5069g;
        if (uyiVar == null) {
            sq8.m48667z("binding");
            uyiVar = null;
        }
        uyiVar.r0.setCurrentValues(viewProgressCard.f5065c);
    }

    /* renamed from: b */
    public final void m3391b() {
        uyi uyiVarH0 = uyi.h0(LayoutInflater.from(getContext()), this, true);
        sq8.m48648g(uyiVarH0, "inflate(...)");
        this.f5069g = uyiVarH0;
    }

    /* renamed from: c */
    public final void m3392c(Context context, AttributeSet attributeSet) {
        m3391b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProgressCard, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5063a = typedArrayObtainStyledAttributes.getString(sbe.ViewProgressCard_superfone_progress_card_title);
            this.f5064b = typedArrayObtainStyledAttributes.getString(sbe.ViewProgressCard_superfone_progress_card_subTitle);
            this.f5065c = typedArrayObtainStyledAttributes.getInteger(sbe.ViewProgressCard_superfone_progress_card_percent, -1);
            this.f5066d = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProgressCard_superfone_progress_card_icon, -1);
            this.f5067e = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProgressCard_superfone_progress_card_color, -1);
            m3397h();
            m3396g();
            m3394e();
            m3393d();
            m3395f();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public final void m3393d() {
        if (this.f5067e != -1) {
            uyi uyiVar = this.f5069g;
            uyi uyiVar2 = null;
            if (uyiVar == null) {
                sq8.m48667z("binding");
                uyiVar = null;
            }
            uyiVar.n0.setBackgroundColor(c64.getColor(getContext(), this.f5067e));
            uyi uyiVar3 = this.f5069g;
            if (uyiVar3 == null) {
                sq8.m48667z("binding");
            } else {
                uyiVar2 = uyiVar3;
            }
            uyiVar2.o0.setCardBackgroundColor(c64.getColor(getContext(), this.f5067e));
        }
    }

    /* renamed from: e */
    public final void m3394e() {
        if (this.f5066d != -1) {
            uyi uyiVar = this.f5069g;
            if (uyiVar == null) {
                sq8.m48667z("binding");
                uyiVar = null;
            }
            uyiVar.p0.setImageResource(this.f5066d);
        }
    }

    /* renamed from: f */
    public final void m3395f() {
        if (this.f5065c != -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.qyi
                @Override // java.lang.Runnable
                public final void run() {
                    ViewProgressCard.setProgressBarPercent$lambda$0(this.f42633a);
                }
            }, 1000L);
        }
    }

    /* renamed from: g */
    public final void m3396g() {
        uyi uyiVar = this.f5069g;
        if (uyiVar == null) {
            sq8.m48667z("binding");
            uyiVar = null;
        }
        uyiVar.s0.setText(this.f5064b);
    }

    /* renamed from: h */
    public final void m3397h() {
        uyi uyiVar = this.f5069g;
        if (uyiVar == null) {
            sq8.m48667z("binding");
            uyiVar = null;
        }
        uyiVar.q0.setText(this.f5063a);
    }

    public final void setCardColor(int i) {
        this.f5067e = i;
        m3393d();
    }

    public final void setHasNew(boolean z) {
        this.f5068f = z;
        uyi uyiVar = null;
        if (z) {
            uyi uyiVar2 = this.f5069g;
            if (uyiVar2 == null) {
                sq8.m48667z("binding");
            } else {
                uyiVar = uyiVar2;
            }
            uyiVar.t0.setVisibility(0);
            return;
        }
        uyi uyiVar3 = this.f5069g;
        if (uyiVar3 == null) {
            sq8.m48667z("binding");
        } else {
            uyiVar = uyiVar3;
        }
        uyiVar.t0.setVisibility(8);
    }

    public final void setIcon(int i) {
        this.f5066d = i;
        m3394e();
    }

    public final void setProgressBarPercent(int i) {
        this.f5065c = i;
        m3395f();
    }

    public final void setSubTitle(String str) {
        this.f5064b = str;
        m3396g();
    }

    public final void setTitle(String str) {
        this.f5063a = str;
        m3397h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProgressCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5063a = "";
        this.f5064b = "";
        this.f5065c = -1;
        this.f5066d = -1;
        this.f5067e = -1;
        m3392c(context, attributeSet);
    }
}
