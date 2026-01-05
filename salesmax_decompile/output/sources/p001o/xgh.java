package p001o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;

/* loaded from: classes5.dex */
public class xgh extends ShapeDrawable {

    /* renamed from: a */
    public final Paint f53756a;

    /* renamed from: b */
    public final Paint f53757b;

    /* renamed from: c */
    public final String f53758c;

    /* renamed from: d */
    public final int f53759d;

    /* renamed from: e */
    public final RectShape f53760e;

    /* renamed from: f */
    public final int f53761f;

    /* renamed from: g */
    public final int f53762g;

    /* renamed from: h */
    public final int f53763h;

    /* renamed from: i */
    public final float f53764i;

    /* renamed from: j */
    public final int f53765j;

    /* renamed from: o.xgh$b */
    public static class C18158b implements InterfaceC18160d, InterfaceC18159c {

        /* renamed from: a */
        public String f53766a;

        /* renamed from: b */
        public int f53767b;

        /* renamed from: c */
        public int f53768c;

        /* renamed from: d */
        public int f53769d;

        /* renamed from: e */
        public int f53770e;

        /* renamed from: f */
        public Typeface f53771f;

        /* renamed from: g */
        public RectShape f53772g;

        /* renamed from: h */
        public int f53773h;

        /* renamed from: i */
        public int f53774i;

        /* renamed from: j */
        public boolean f53775j;

        /* renamed from: k */
        public boolean f53776k;

        /* renamed from: l */
        public float f53777l;

        @Override // p001o.xgh.InterfaceC18160d
        /* renamed from: a */
        public xgh mo56294a(String str, int i, int i2) {
            m56298o(i2);
            return m56296m(str, i);
        }

        @Override // p001o.xgh.InterfaceC18160d
        /* renamed from: b */
        public xgh mo56295b(String str, int i) {
            m56297n();
            return m56296m(str, i);
        }

        /* renamed from: m */
        public xgh m56296m(String str, int i) {
            this.f53767b = i;
            this.f53766a = str;
            return new xgh(this);
        }

        /* renamed from: n */
        public InterfaceC18159c m56297n() {
            this.f53772g = new OvalShape();
            return this;
        }

        /* renamed from: o */
        public InterfaceC18159c m56298o(int i) {
            float f = i;
            this.f53777l = f;
            this.f53772g = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null);
            return this;
        }

        public C18158b() {
            this.f53766a = "";
            this.f53767b = -7829368;
            this.f53773h = -1;
            this.f53768c = 0;
            this.f53769d = -1;
            this.f53770e = -1;
            this.f53772g = new RectShape();
            this.f53771f = Typeface.create("sans-serif-light", 0);
            this.f53774i = -1;
            this.f53775j = false;
            this.f53776k = false;
        }
    }

    /* renamed from: o.xgh$c */
    public interface InterfaceC18159c {
    }

    /* renamed from: o.xgh$d */
    public interface InterfaceC18160d {
        /* renamed from: a */
        xgh mo56294a(String str, int i, int i2);

        /* renamed from: b */
        xgh mo56295b(String str, int i);
    }

    /* renamed from: a */
    public static InterfaceC18160d m56281a() {
        return new C18158b();
    }

    /* renamed from: b */
    public final void m56282b(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        int i = this.f53765j;
        rectF.inset(i / 2, i / 2);
        RectShape rectShape = this.f53760e;
        if (rectShape instanceof OvalShape) {
            canvas.drawOval(rectF, this.f53757b);
        } else if (!(rectShape instanceof RoundRectShape)) {
            canvas.drawRect(rectF, this.f53757b);
        } else {
            float f = this.f53764i;
            canvas.drawRoundRect(rectF, f, f, this.f53757b);
        }
    }

    /* renamed from: c */
    public final int m56283c(int i) {
        return Color.rgb((int) (Color.red(i) * 0.9f), (int) (Color.green(i) * 0.9f), (int) (Color.blue(i) * 0.9f));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        if (this.f53765j > 0) {
            m56282b(canvas);
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = this.f53762g;
        if (iWidth < 0) {
            iWidth = bounds.width();
        }
        int iHeight = this.f53761f;
        if (iHeight < 0) {
            iHeight = bounds.height();
        }
        int iMin = this.f53763h;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        this.f53756a.setTextSize(iMin);
        canvas.drawText(this.f53758c, iWidth / 2, (iHeight / 2) - ((this.f53756a.descent() + this.f53756a.ascent()) / 2.0f), this.f53756a);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53761f;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53762g;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f53756a.setAlpha(i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53756a.setColorFilter(colorFilter);
    }

    public xgh(C18158b c18158b) {
        super(c18158b.f53772g);
        this.f53760e = c18158b.f53772g;
        this.f53761f = c18158b.f53770e;
        this.f53762g = c18158b.f53769d;
        this.f53764i = c18158b.f53777l;
        this.f53758c = c18158b.f53776k ? c18158b.f53766a.toUpperCase() : c18158b.f53766a;
        int i = c18158b.f53767b;
        this.f53759d = i;
        this.f53763h = c18158b.f53774i;
        Paint paint = new Paint();
        this.f53756a = paint;
        paint.setColor(c18158b.f53773h);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(c18158b.f53775j);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(c18158b.f53771f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(c18158b.f53768c);
        int i2 = c18158b.f53768c;
        this.f53765j = i2;
        Paint paint2 = new Paint();
        this.f53757b = paint2;
        paint2.setColor(m56283c(i));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(i2);
        getPaint().setColor(i);
    }
}
