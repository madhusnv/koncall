package p001o;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes2.dex */
public final class wc2 {

    /* renamed from: g */
    public static final wc2 f51760g = new wc2(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f51761a;

    /* renamed from: b */
    public final int f51762b;

    /* renamed from: c */
    public final int f51763c;

    /* renamed from: d */
    public final int f51764d;

    /* renamed from: e */
    public final int f51765e;

    /* renamed from: f */
    public final Typeface f51766f;

    public wc2(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f51761a = i;
        this.f51762b = i2;
        this.f51763c = i3;
        this.f51764d = i4;
        this.f51765e = i5;
        this.f51766f = typeface;
    }

    /* renamed from: a */
    public static wc2 m54198a(CaptioningManager.CaptionStyle captionStyle) {
        return sqi.f45790a >= 21 ? m54199b(captionStyle) : new wc2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: b */
    public static wc2 m54199b(CaptioningManager.CaptionStyle captionStyle) {
        return new wc2(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f51760g.f51761a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f51760g.f51762b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f51760g.f51763c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f51760g.f51764d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f51760g.f51765e, captionStyle.getTypeface());
    }
}
