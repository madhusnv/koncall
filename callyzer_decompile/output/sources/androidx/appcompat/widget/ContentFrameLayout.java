package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p013o.p0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f1764a;

    /* renamed from: b */
    public TypedValue f1765b;

    /* renamed from: c */
    public TypedValue f1766c;

    /* renamed from: d */
    public TypedValue f1767d;

    /* renamed from: e */
    public TypedValue f1768e;

    /* renamed from: f */
    public TypedValue f1769f;

    /* renamed from: g */
    public final Rect f1770g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1770g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1768e == null) {
            this.f1768e = new TypedValue();
        }
        return this.f1768e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1769f == null) {
            this.f1769f = new TypedValue();
        }
        return this.f1769f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1766c == null) {
            this.f1766c = new TypedValue();
        }
        return this.f1766c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1767d == null) {
            this.f1767d = new TypedValue();
        }
        return this.f1767d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1764a == null) {
            this.f1764a = new TypedValue();
        }
        return this.f1764a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1765b == null) {
            this.f1765b = new TypedValue();
        }
        return this.f1765b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(p0 p0Var) {
    }
}
