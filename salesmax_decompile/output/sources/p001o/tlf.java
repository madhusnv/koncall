package p001o;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public class tlf extends slf {

    /* renamed from: f */
    public boolean f47388f = false;

    /* renamed from: g */
    public float f47389g = 0.0f;

    /* renamed from: o.tlf$a */
    public class C17154a extends ViewOutlineProvider {
        public C17154a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            tlf tlfVar = tlf.this;
            if (tlfVar.f45622c == null || tlfVar.f45623d.isEmpty()) {
                return;
            }
            tlf tlfVar2 = tlf.this;
            RectF rectF = tlfVar2.f45623d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, tlfVar2.f47389g);
        }
    }

    public tlf(View view) {
        m50170n(view);
    }

    /* renamed from: n */
    private void m50170n(View view) {
        view.setOutlineProvider(new C17154a());
    }

    /* renamed from: q */
    public static boolean m50171q(ykf ykfVar) {
        return (ykfVar.m57937q() instanceof yue) && (ykfVar.m57939s() instanceof yue) && (ykfVar.m57930i() instanceof yue) && (ykfVar.m57932k() instanceof yue);
    }

    @Override // p001o.slf
    /* renamed from: b */
    public void mo48490b(View view) {
        this.f47389g = m50172m();
        this.f47388f = m50173o() || m50174p();
        view.setClipToOutline(!mo48498j());
        if (mo48498j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // p001o.slf
    /* renamed from: j */
    public boolean mo48498j() {
        return !this.f47388f || this.f45620a;
    }

    /* renamed from: m */
    public final float m50172m() {
        RectF rectF;
        ykf ykfVar = this.f45622c;
        if (ykfVar == null || (rectF = this.f45623d) == null) {
            return 0.0f;
        }
        return ykfVar.f55646f.mo20547a(rectF);
    }

    /* renamed from: o */
    public final boolean m50173o() {
        ykf ykfVar;
        if (this.f45623d.isEmpty() || (ykfVar = this.f45622c) == null) {
            return false;
        }
        return ykfVar.m57942v(this.f45623d);
    }

    /* renamed from: p */
    public final boolean m50174p() {
        ykf ykfVar;
        if (!this.f45623d.isEmpty() && (ykfVar = this.f45622c) != null && this.f45621b && !ykfVar.m57942v(this.f45623d) && m50171q(this.f45622c)) {
            float fMo20547a = this.f45622c.m57938r().mo20547a(this.f45623d);
            float fMo20547a2 = this.f45622c.m57940t().mo20547a(this.f45623d);
            float fMo20547a3 = this.f45622c.m57931j().mo20547a(this.f45623d);
            float fMo20547a4 = this.f45622c.m57933l().mo20547a(this.f45623d);
            if (fMo20547a == 0.0f && fMo20547a3 == 0.0f && fMo20547a2 == fMo20547a4) {
                RectF rectF = this.f45623d;
                rectF.set(rectF.left - fMo20547a2, rectF.top, rectF.right, rectF.bottom);
                this.f47389g = fMo20547a2;
                return true;
            }
            if (fMo20547a == 0.0f && fMo20547a2 == 0.0f && fMo20547a3 == fMo20547a4) {
                RectF rectF2 = this.f45623d;
                rectF2.set(rectF2.left, rectF2.top - fMo20547a3, rectF2.right, rectF2.bottom);
                this.f47389g = fMo20547a3;
                return true;
            }
            if (fMo20547a2 == 0.0f && fMo20547a4 == 0.0f && fMo20547a == fMo20547a3) {
                RectF rectF3 = this.f45623d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fMo20547a, rectF3.bottom);
                this.f47389g = fMo20547a;
                return true;
            }
            if (fMo20547a3 == 0.0f && fMo20547a4 == 0.0f && fMo20547a == fMo20547a2) {
                RectF rectF4 = this.f45623d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fMo20547a);
                this.f47389g = fMo20547a;
                return true;
            }
        }
        return false;
    }
}
