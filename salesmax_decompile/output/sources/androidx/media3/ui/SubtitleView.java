package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.cd4;
import p001o.wc2;
import p001o.xbg;

/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a */
    public List f8852a;

    /* renamed from: b */
    public wc2 f8853b;

    /* renamed from: c */
    public int f8854c;

    /* renamed from: d */
    public float f8855d;

    /* renamed from: e */
    public float f8856e;

    /* renamed from: f */
    public boolean f8857f;

    /* renamed from: g */
    public boolean f8858g;

    /* renamed from: h */
    public int f8859h;

    /* renamed from: q */
    public InterfaceC2291a f8860q;

    /* renamed from: s */
    public View f8861s;

    /* renamed from: androidx.media3.ui.SubtitleView$a */
    public interface InterfaceC2291a {
        /* renamed from: a */
        void mo7613a(List list, wc2 wc2Var, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<cd4> getCuesWithStylingPreferencesApplied() {
        if (this.f8857f && this.f8858g) {
            return this.f8852a;
        }
        ArrayList arrayList = new ArrayList(this.f8852a.size());
        for (int i = 0; i < this.f8852a.size(); i++) {
            arrayList.add(m7835a((cd4) this.f8852a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private wc2 getUserCaptionStyle() {
        if (isInEditMode()) {
            return wc2.f51760g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? wc2.f51760g : wc2.m54198a(captioningManager.getUserStyle());
    }

    private <T extends View & InterfaceC2291a> void setView(T t) {
        removeView(this.f8861s);
        View view = this.f8861s;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).m7855g();
        }
        this.f8861s = t;
        this.f8860q = t;
        addView(t);
    }

    /* renamed from: a */
    public final cd4 m7835a(cd4 cd4Var) {
        cd4.C12641b c12641bM20916a = cd4Var.m20916a();
        if (!this.f8857f) {
            xbg.m55958e(c12641bM20916a);
        } else if (!this.f8858g) {
            xbg.m55959f(c12641bM20916a);
        }
        return c12641bM20916a.m20919a();
    }

    /* renamed from: b */
    public final void m7836b(int i, float f) {
        this.f8854c = i;
        this.f8855d = f;
        m7837c();
    }

    /* renamed from: c */
    public final void m7837c() {
        this.f8860q.mo7613a(getCuesWithStylingPreferencesApplied(), this.f8853b, this.f8855d, this.f8854c, this.f8856e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f8858g = z;
        m7837c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f8857f = z;
        m7837c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f8856e = f;
        m7837c();
    }

    public void setCues(List<cd4> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8852a = list;
        m7837c();
    }

    public void setFixedTextSize(int i, float f) {
        Context context = getContext();
        m7836b(2, TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setStyle(wc2 wc2Var) {
        this.f8853b = wc2Var;
        m7837c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i) {
        if (this.f8859h == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f8859h = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8852a = Collections.emptyList();
        this.f8853b = wc2.f51760g;
        this.f8854c = 0;
        this.f8855d = 0.0533f;
        this.f8856e = 0.08f;
        this.f8857f = true;
        this.f8858g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f8860q = canvasSubtitleOutput;
        this.f8861s = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f8859h = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        m7836b(z ? 1 : 0, f);
    }
}
