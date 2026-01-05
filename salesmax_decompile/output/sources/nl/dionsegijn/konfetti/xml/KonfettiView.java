package nl.dionsegijn.konfetti.xml;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ay5;
import p001o.dh3;
import p001o.ge8;
import p001o.izc;
import p001o.j74;
import p001o.kzc;
import p001o.sq8;
import p001o.uyc;
import p001o.wkf;
import p001o.xbc;

/* loaded from: classes6.dex */
public class KonfettiView extends View {

    /* renamed from: a */
    public final List f13988a;

    /* renamed from: b */
    public C12071a f13989b;

    /* renamed from: c */
    public j74 f13990c;

    /* renamed from: d */
    public final ge8 f13991d;

    /* renamed from: e */
    public final Paint f13992e;

    /* renamed from: nl.dionsegijn.konfetti.xml.KonfettiView$a */
    public static final class C12071a {

        /* renamed from: a */
        public long f13993a = -1;

        /* renamed from: a */
        public final float m16281a() {
            if (this.f13993a == -1) {
                this.f13993a = System.nanoTime();
            }
            float f = (r0 - this.f13993a) / 1000000.0f;
            this.f13993a = System.nanoTime();
            return f / 1000;
        }

        /* renamed from: b */
        public final long m16282b(long j) {
            return System.currentTimeMillis() - j;
        }

        /* renamed from: c */
        public final void m16283c() {
            this.f13993a = -1L;
        }
    }

    public KonfettiView(Context context) {
        super(context);
        this.f13988a = new ArrayList();
        this.f13989b = new C12071a();
        this.f13990c = new j74(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f13991d = new ge8();
        this.f13992e = new Paint();
    }

    /* renamed from: a */
    public final void m16278a(uyc uycVar, Canvas canvas) {
        this.f13992e.setColor(uycVar.m52159a());
        float f = 2;
        float fM52161c = (uycVar.m52161c() * uycVar.m52163e()) / f;
        int iSave = canvas.save();
        canvas.translate(uycVar.m52164f() - fM52161c, uycVar.m52165g());
        canvas.rotate(uycVar.m52160b(), fM52161c, uycVar.m52163e() / f);
        canvas.scale(uycVar.m52161c(), 1.0f);
        ay5.m17967a(uycVar.m52162d(), canvas, this.f13992e, uycVar.m52163e(), this.f13991d);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: b */
    public final void m16279b(izc izcVar) {
        sq8.m48649h(izcVar, "party");
        this.f13988a.add(new kzc(m16280c(izcVar), 0L, Resources.getSystem().getDisplayMetrics().density, 2, null));
        invalidate();
    }

    /* renamed from: c */
    public final izc m16280c(izc izcVar) {
        List listM32945l = izcVar.m32945l();
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM32945l, 10));
        Iterator it = listM32945l.iterator();
        while (it.hasNext()) {
            arrayList.add((wkf) it.next());
        }
        return izcVar.m32935a((16255 & 1) != 0 ? izcVar.f29410a : 0, (16255 & 2) != 0 ? izcVar.f29411b : 0, (16255 & 4) != 0 ? izcVar.f29412c : 0.0f, (16255 & 8) != 0 ? izcVar.f29413d : 0.0f, (16255 & 16) != 0 ? izcVar.f29414e : 0.0f, (16255 & 32) != 0 ? izcVar.f29415f : null, (16255 & 64) != 0 ? izcVar.f29416g : null, (16255 & 128) != 0 ? izcVar.f29417h : arrayList, (16255 & 256) != 0 ? izcVar.f29418i : 0L, (16255 & 512) != 0 ? izcVar.f29419j : false, (16255 & 1024) != 0 ? izcVar.f29420k : null, (16255 & 2048) != 0 ? izcVar.f29421l : 0, (16255 & 4096) != 0 ? izcVar.f29422m : null, (16255 & 8192) != 0 ? izcVar.f29423n : null);
    }

    public final List<kzc> getActiveSystems() {
        return this.f13988a;
    }

    public final xbc getOnParticleSystemUpdateListener() {
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        super.onDraw(canvas);
        float fM16281a = this.f13989b.m16281a();
        int size = this.f13988a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            kzc kzcVar = (kzc) this.f13988a.get(size);
            if (this.f13989b.m16282b(kzcVar.m36371a()) >= kzcVar.m36372b().m32939f()) {
                Iterator it = kzcVar.m36374d(fM16281a, this.f13990c).iterator();
                while (it.hasNext()) {
                    m16278a((uyc) it.next(), canvas);
                }
            }
            if (kzcVar.m36373c()) {
                this.f13988a.remove(size);
            }
        }
        if (this.f13988a.size() != 0) {
            invalidate();
        } else {
            this.f13989b.m16283c();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13990c = new j74(0.0f, 0.0f, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        sq8.m48649h(view, "changedView");
        super.onVisibilityChanged(view, i);
        this.f13989b.m16283c();
    }

    public final void setOnParticleSystemUpdateListener(xbc xbcVar) {
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13988a = new ArrayList();
        this.f13989b = new C12071a();
        this.f13990c = new j74(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f13991d = new ge8();
        this.f13992e = new Paint();
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13988a = new ArrayList();
        this.f13989b = new C12071a();
        this.f13990c = new j74(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f13991d = new ge8();
        this.f13992e = new Paint();
    }
}
