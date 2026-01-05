package p001o;

import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p001o.y0j;

/* loaded from: classes5.dex */
public class zg5 extends r6f {

    /* renamed from: d */
    public View f57163d;

    /* renamed from: e */
    public View f57164e;

    @Override // p001o.r6f
    /* renamed from: b */
    public int mo46261b() {
        float width;
        int width2;
        if (m46264e().m13626l()) {
            width = this.f57164e.getHeight() / 2.0f;
            width2 = this.f57163d.getHeight();
        } else {
            width = this.f57164e.getWidth() / 2.0f;
            width2 = this.f57163d.getWidth();
        }
        return (int) (width - width2);
    }

    @Override // p001o.r6f
    /* renamed from: j */
    public svi mo46269j() {
        return new fc5(new y0j.C18296c(this.f57163d).m57099b(1.0f).m57100c(1.0f).mo57098a());
    }

    @Override // p001o.r6f
    /* renamed from: k */
    public TextView mo46270k() {
        return (TextView) this.f57163d;
    }

    @Override // p001o.r6f
    /* renamed from: l */
    public View mo46271l(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(m46262c()).inflate(o9e.fastscroll__default_bubble, viewGroup, false);
        this.f57163d = viewInflate;
        return viewInflate;
    }

    @Override // p001o.r6f
    /* renamed from: m */
    public svi mo46272m() {
        return null;
    }

    @Override // p001o.r6f
    /* renamed from: n */
    public View mo46273n(ViewGroup viewGroup) {
        this.f57164e = new View(m46262c());
        int dimensionPixelSize = m46264e().m13626l() ? 0 : m46262c().getResources().getDimensionPixelSize(y6e.fastscroll__handle_inset);
        int dimensionPixelSize2 = m46264e().m13626l() ? m46262c().getResources().getDimensionPixelSize(y6e.fastscroll__handle_inset) : 0;
        jri.m34416d(this.f57164e, new InsetDrawable(c64.getDrawable(m46262c(), v7e.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        this.f57164e.setLayoutParams(new ViewGroup.LayoutParams(m46262c().getResources().getDimensionPixelSize(m46264e().m13626l() ? y6e.fastscroll__handle_clickable_width : y6e.fastscroll__handle_height), m46262c().getResources().getDimensionPixelSize(m46264e().m13626l() ? y6e.fastscroll__handle_height : y6e.fastscroll__handle_clickable_width)));
        return this.f57164e;
    }
}
