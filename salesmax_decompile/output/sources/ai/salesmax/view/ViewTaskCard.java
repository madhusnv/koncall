package ai.salesmax.view;

import ai.salesmax.view.ViewTaskCard;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import p001o.c64;
import p001o.mzi;
import p001o.sbe;
import p001o.sq8;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewTaskCard extends FrameLayout {

    /* renamed from: a */
    public String f5077a;

    /* renamed from: b */
    public int f5078b;

    /* renamed from: c */
    public int f5079c;

    /* renamed from: d */
    public int f5080d;

    /* renamed from: e */
    public boolean f5081e;

    /* renamed from: f */
    public mzi f5082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTaskCard(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5077a = "";
        this.f5078b = -1;
        this.f5079c = -1;
        this.f5080d = -1;
        m3407b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setItemCount$lambda$0(ViewTaskCard viewTaskCard) {
        sq8.m48649h(viewTaskCard, "this$0");
        mzi mziVar = viewTaskCard.f5082f;
        if (mziVar == null) {
            sq8.m48667z("binding");
            mziVar = null;
        }
        mziVar.p0.setText(String.valueOf(viewTaskCard.f5078b));
    }

    /* renamed from: b */
    public final void m3407b() {
        mzi mziVarH0 = mzi.h0(LayoutInflater.from(getContext()), this, true);
        sq8.m48648g(mziVarH0, "inflate(...)");
        this.f5082f = mziVarH0;
    }

    /* renamed from: c */
    public final void m3408c(Context context, AttributeSet attributeSet) {
        m3407b();
        sq8.m48648g(context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProgressCard, 0, 0), "obtainStyledAttributes(...)");
    }

    /* renamed from: d */
    public final void m3409d() {
        try {
            if (this.f5080d != -1) {
                mzi mziVar = this.f5082f;
                mzi mziVar2 = null;
                if (mziVar == null) {
                    sq8.m48667z("binding");
                    mziVar = null;
                }
                mziVar.n0.setBackgroundColor(c64.getColor(getContext(), this.f5080d));
                mzi mziVar3 = this.f5082f;
                if (mziVar3 == null) {
                    sq8.m48667z("binding");
                } else {
                    mziVar2 = mziVar3;
                }
                mziVar2.o0.setCardBackgroundColor(c64.getColor(getContext(), this.f5080d));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void m3410e() {
        if (this.f5079c != -1) {
            mzi mziVar = this.f5082f;
            if (mziVar == null) {
                sq8.m48667z("binding");
                mziVar = null;
            }
            mziVar.q0.setImageResource(this.f5079c);
        }
    }

    /* renamed from: f */
    public final void m3411f() {
        if (this.f5078b != -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.lzi
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTaskCard.setItemCount$lambda$0(this.f34571a);
                }
            }, 1000L);
        }
    }

    /* renamed from: g */
    public final void m3412g() {
        mzi mziVar = this.f5082f;
        if (mziVar == null) {
            sq8.m48667z("binding");
            mziVar = null;
        }
        mziVar.r0.setText(this.f5077a);
    }

    public final void setCardColor(int i) {
        this.f5080d = i;
        m3409d();
    }

    public final void setHasNew(boolean z) {
        this.f5081e = z;
        mzi mziVar = null;
        if (z) {
            mzi mziVar2 = this.f5082f;
            if (mziVar2 == null) {
                sq8.m48667z("binding");
            } else {
                mziVar = mziVar2;
            }
            mziVar.s0.setVisibility(0);
            return;
        }
        mzi mziVar3 = this.f5082f;
        if (mziVar3 == null) {
            sq8.m48667z("binding");
        } else {
            mziVar = mziVar3;
        }
        mziVar.s0.setVisibility(8);
    }

    public final void setIcon(int i) {
        this.f5079c = i;
        m3410e();
    }

    public final void setItemCount(int i) {
        this.f5078b = i;
        m3411f();
    }

    public final void setTitle(String str) {
        this.f5077a = str;
        m3412g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTaskCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5077a = "";
        this.f5078b = -1;
        this.f5079c = -1;
        this.f5080d = -1;
        m3408c(context, attributeSet);
    }
}
