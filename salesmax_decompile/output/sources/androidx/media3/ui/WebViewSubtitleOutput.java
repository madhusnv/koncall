package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.AbstractC2297a;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p001o.cd4;
import p001o.d18;
import p001o.op0;
import p001o.sqi;
import p001o.uh2;
import p001o.wc2;
import p001o.xbg;

/* loaded from: classes2.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.InterfaceC2291a {

    /* renamed from: a */
    public final CanvasSubtitleOutput f8878a;

    /* renamed from: b */
    public final WebView f8879b;

    /* renamed from: c */
    public List f8880c;

    /* renamed from: d */
    public wc2 f8881d;

    /* renamed from: e */
    public float f8882e;

    /* renamed from: f */
    public int f8883f;

    /* renamed from: g */
    public float f8884g;

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$a */
    public class C2295a extends WebView {
        public C2295a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$b */
    public static /* synthetic */ class C2296b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8886a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f8886a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8886a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8886a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static int m7849b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    public static String m7850c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C2296b.f8886a[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    /* renamed from: d */
    public static String m7851d(wc2 wc2Var) {
        int i = wc2Var.f51764d;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unset" : sqi.m48702G("-0.05em -0.05em 0.15em %s", d18.m22222b(wc2Var.f51765e)) : sqi.m48702G("0.06em 0.08em 0.15em %s", d18.m22222b(wc2Var.f51765e)) : sqi.m48702G("0.1em 0.12em 0.15em %s", d18.m22222b(wc2Var.f51765e)) : sqi.m48702G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", d18.m22222b(wc2Var.f51765e));
    }

    /* renamed from: f */
    public static String m7852f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    public static String m7853h(cd4 cd4Var) {
        float f = cd4Var.f17913q;
        if (f == 0.0f) {
            return "";
        }
        int i = cd4Var.f17912p;
        return sqi.m48702G("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    @Override // androidx.media3.ui.SubtitleView.InterfaceC2291a
    /* renamed from: a */
    public void mo7613a(List list, wc2 wc2Var, float f, int i, float f2) {
        this.f8881d = wc2Var;
        this.f8882e = f;
        this.f8883f = i;
        this.f8884g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            cd4 cd4Var = (cd4) list.get(i2);
            if (cd4Var.f17900d != null) {
                arrayList.add(cd4Var);
            } else {
                arrayList2.add(cd4Var);
            }
        }
        if (!this.f8880c.isEmpty() || !arrayList2.isEmpty()) {
            this.f8880c = arrayList2;
            m7856i();
        }
        this.f8878a.mo7613a(arrayList, wc2Var, f, i, f2);
        invalidate();
    }

    /* renamed from: e */
    public final String m7854e(int i, float f) {
        float fM55961h = xbg.m55961h(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM55961h == -3.4028235E38f ? "unset" : sqi.m48702G("%.2fpx", Float.valueOf(fM55961h / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: g */
    public void m7855g() {
        this.f8879b.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7856i() {
        String strM48702G;
        int iM7849b;
        String strM48702G2;
        boolean z;
        int i;
        String str;
        Object obj;
        Object obj2;
        Layout.Alignment alignment;
        StringBuilder sb = new StringBuilder();
        float f = 1.2f;
        sb.append(sqi.m48702G("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", d18.m22222b(this.f8881d.f51761a), m7854e(this.f8883f, this.f8882e), Float.valueOf(1.2f), m7851d(this.f8881d)));
        HashMap map = new HashMap();
        map.put(d18.m22221a("default_bg"), sqi.m48702G("background-color:%s;", d18.m22222b(this.f8881d.f51762b)));
        int i2 = 0;
        while (i2 < this.f8880c.size()) {
            cd4 cd4Var = (cd4) this.f8880c.get(i2);
            float f2 = cd4Var.f17904h;
            float f3 = f2 != -3.4028235E38f ? f2 * 100.0f : 50.0f;
            int iM7849b2 = m7849b(cd4Var.f17905i);
            float f4 = cd4Var.f17901e;
            if (f4 == -3.4028235E38f) {
                strM48702G = sqi.m48702G("%.2f%%", Float.valueOf((1.0f - this.f8884g) * 100.0f));
                iM7849b = -100;
            } else if (cd4Var.f17902f != 1) {
                strM48702G = sqi.m48702G("%.2f%%", Float.valueOf(f4 * 100.0f));
                iM7849b = cd4Var.f17912p == 1 ? -m7849b(cd4Var.f17903g) : m7849b(cd4Var.f17903g);
            } else {
                if (f4 >= 0.0f) {
                    strM48702G2 = sqi.m48702G("%.2fem", Float.valueOf(f4 * f));
                    z = false;
                } else {
                    strM48702G2 = sqi.m48702G("%.2fem", Float.valueOf(((-f4) - 1.0f) * f));
                    z = true;
                }
                iM7849b = 0;
                float f5 = cd4Var.f17906j;
                String strM48702G3 = f5 == -3.4028235E38f ? sqi.m48702G("%.2f%%", Float.valueOf(f5 * 100.0f)) : "fit-content";
                String strM7850c = m7850c(cd4Var.f17898b);
                String strM7852f = m7852f(cd4Var.f17912p);
                String strM7854e = m7854e(cd4Var.f17910n, cd4Var.f17911o);
                String strM22222b = d18.m22222b(!cd4Var.f17908l ? cd4Var.f17909m : this.f8881d.f51763c);
                i = cd4Var.f17912p;
                String str2 = "right";
                if (i != 1) {
                    if (z) {
                    }
                    str = str2;
                    obj = "top";
                } else if (i != 2) {
                    obj = "left";
                    str = z ? "bottom" : "top";
                } else {
                    if (!z) {
                        str2 = "left";
                    }
                    str = str2;
                    obj = "top";
                }
                if (i != 2 || i == 1) {
                    obj2 = "height";
                    int i3 = iM7849b;
                    iM7849b = iM7849b2;
                    iM7849b2 = i3;
                } else {
                    obj2 = "width";
                }
                AbstractC2297a.b bVarM7857a = AbstractC2297a.m7857a(cd4Var.f17897a, getContext().getResources().getDisplayMetrics().density);
                for (String str3 : map.keySet()) {
                    String str4 = (String) map.put(str3, (String) map.get(str3));
                    op0.m42517g(str4 == null || str4.equals(map.get(str3)));
                }
                sb.append(sqi.m48702G("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f3), str, strM48702G2, obj2, strM48702G3, strM7850c, strM7852f, strM7854e, strM22222b, Integer.valueOf(iM7849b2), Integer.valueOf(iM7849b), m7853h(cd4Var)));
                sb.append(sqi.m48702G("<span class='%s'>", "default_bg"));
                alignment = cd4Var.f17899c;
                if (alignment == null) {
                    sb.append(sqi.m48702G("<span style='display:inline-block; text-align:%s;'>", m7850c(alignment)));
                    sb.append(bVarM7857a.f8888a);
                    sb.append("</span>");
                } else {
                    sb.append(bVarM7857a.f8888a);
                }
                sb.append("</span>");
                sb.append("</div>");
                i2++;
                f = 1.2f;
            }
            strM48702G2 = strM48702G;
            z = false;
            float f52 = cd4Var.f17906j;
            String strM48702G32 = f52 == -3.4028235E38f ? sqi.m48702G("%.2f%%", Float.valueOf(f52 * 100.0f)) : "fit-content";
            String strM7850c2 = m7850c(cd4Var.f17898b);
            String strM7852f2 = m7852f(cd4Var.f17912p);
            String strM7854e2 = m7854e(cd4Var.f17910n, cd4Var.f17911o);
            String strM22222b2 = d18.m22222b(!cd4Var.f17908l ? cd4Var.f17909m : this.f8881d.f51763c);
            i = cd4Var.f17912p;
            String str22 = "right";
            if (i != 1) {
            }
            if (i != 2) {
                obj2 = "height";
                int i32 = iM7849b;
                iM7849b = iM7849b2;
                iM7849b2 = i32;
            }
            AbstractC2297a.b bVarM7857a2 = AbstractC2297a.m7857a(cd4Var.f17897a, getContext().getResources().getDisplayMetrics().density);
            while (r5.hasNext()) {
            }
            sb.append(sqi.m48702G("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i2), obj, Float.valueOf(f3), str, strM48702G2, obj2, strM48702G32, strM7850c2, strM7852f2, strM7854e2, strM22222b2, Integer.valueOf(iM7849b2), Integer.valueOf(iM7849b), m7853h(cd4Var)));
            sb.append(sqi.m48702G("<span class='%s'>", "default_bg"));
            alignment = cd4Var.f17899c;
            if (alignment == null) {
            }
            sb.append("</span>");
            sb.append("</div>");
            i2++;
            f = 1.2f;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str5 : map.keySet()) {
            sb2.append(str5);
            sb2.append("{");
            sb2.append((String) map.get(str5));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.f8879b.loadData(Base64.encodeToString(sb.toString().getBytes(uh2.f48931c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f8880c.isEmpty()) {
            return;
        }
        m7856i();
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8880c = Collections.emptyList();
        this.f8881d = wc2.f51760g;
        this.f8882e = 0.0533f;
        this.f8883f = 0;
        this.f8884g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f8878a = canvasSubtitleOutput;
        C2295a c2295a = new C2295a(context, attributeSet);
        this.f8879b = c2295a;
        c2295a.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(c2295a);
    }
}
