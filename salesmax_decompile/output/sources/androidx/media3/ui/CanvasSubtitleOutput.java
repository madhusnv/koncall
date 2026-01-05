package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.cd4;
import p001o.obg;
import p001o.wc2;
import p001o.xbg;

/* loaded from: classes2.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.InterfaceC2291a {

    /* renamed from: a */
    public final List f8755a;

    /* renamed from: b */
    public List f8756b;

    /* renamed from: c */
    public int f8757c;

    /* renamed from: d */
    public float f8758d;

    /* renamed from: e */
    public wc2 f8759e;

    /* renamed from: f */
    public float f8760f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static cd4 m7612b(cd4 cd4Var) {
        cd4.C12641b c12641bM20934p = cd4Var.m20916a().m20929k(-3.4028235E38f).m20930l(Integer.MIN_VALUE).m20934p(null);
        if (cd4Var.f17902f == 0) {
            c12641bM20934p.m20926h(1.0f - cd4Var.f17901e, 0);
        } else {
            c12641bM20934p.m20926h((-cd4Var.f17901e) - 1.0f, 1);
        }
        int i = cd4Var.f17903g;
        if (i == 0) {
            c12641bM20934p.m20927i(2);
        } else if (i == 2) {
            c12641bM20934p.m20927i(0);
        }
        return c12641bM20934p.m20919a();
    }

    @Override // androidx.media3.ui.SubtitleView.InterfaceC2291a
    /* renamed from: a */
    public void mo7613a(List list, wc2 wc2Var, float f, int i, float f2) {
        this.f8756b = list;
        this.f8759e = wc2Var;
        this.f8758d = f;
        this.f8757c = i;
        this.f8760f = f2;
        while (this.f8755a.size() < list.size()) {
            this.f8755a.add(new obg(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f8756b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fM55961h = xbg.m55961h(this.f8757c, this.f8758d, height, i);
        if (fM55961h <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            cd4 cd4VarM7612b = (cd4) list.get(i2);
            if (cd4VarM7612b.f17912p != Integer.MIN_VALUE) {
                cd4VarM7612b = m7612b(cd4VarM7612b);
            }
            cd4 cd4Var = cd4VarM7612b;
            int i3 = paddingBottom;
            ((obg) this.f8755a.get(i2)).m41926b(cd4Var, this.f8759e, fM55961h, xbg.m55961h(cd4Var.f17910n, cd4Var.f17911o, height, i), this.f8760f, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8755a = new ArrayList();
        this.f8756b = Collections.emptyList();
        this.f8757c = 0;
        this.f8758d = 0.0533f;
        this.f8759e = wc2.f51760g;
        this.f8760f = 0.08f;
    }
}
