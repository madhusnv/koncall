package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfRenderer;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a3d {

    /* renamed from: f */
    public static final C12078a f14096f = new C12078a(null);

    /* renamed from: g */
    public static final int f14097g = 8;

    /* renamed from: h */
    public static final int f14098h = 72;

    /* renamed from: a */
    public final PdfRenderer f14099a;

    /* renamed from: b */
    public final Bitmap.Config f14100b;

    /* renamed from: c */
    public final int f14101c;

    /* renamed from: d */
    public final SparseArray f14102d;

    /* renamed from: e */
    public int f14103e;

    /* renamed from: o.a3d$a */
    public static final class C12078a {
        public C12078a() {
        }

        public /* synthetic */ C12078a(id5 id5Var) {
            this();
        }
    }

    public a3d(PdfRenderer pdfRenderer, Bitmap.Config config, int i) {
        sq8.m48649h(pdfRenderer, "pdfRenderer");
        sq8.m48649h(config, "config");
        this.f14099a = pdfRenderer;
        this.f14100b = config;
        this.f14101c = i;
        this.f14102d = new SparseArray();
        int pageCount = pdfRenderer.getPageCount() < 5 ? pdfRenderer.getPageCount() : 5;
        for (int i2 = 0; i2 < pageCount; i2++) {
            this.f14102d.append(i2, m16382e(i2));
        }
    }

    /* renamed from: i */
    public static /* synthetic */ int m16377i(a3d a3dVar, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.4f;
        }
        return a3dVar.m16385h(i, f);
    }

    /* renamed from: a */
    public final SparseArray m16378a() {
        return this.f14102d;
    }

    /* renamed from: b */
    public final il8 m16379b(int i) {
        return new kl8(i - 2, i + 2);
    }

    /* renamed from: c */
    public final Bitmap m16380c(int i) {
        Object objM16382e = this.f14102d.get(i);
        if (objM16382e == null) {
            objM16382e = m16382e(i);
        }
        return (Bitmap) objM16382e;
    }

    /* renamed from: d */
    public final void m16381d(int i) {
        il8 il8VarM16379b = m16379b(i);
        m16384g(il8VarM16379b);
        int iM32260e = il8VarM16379b.m32260e();
        int iM32261j = il8VarM16379b.m32261j();
        int iM32262n = il8VarM16379b.m32262n();
        if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
            while (true) {
                if (iM32260e != i) {
                    boolean z = false;
                    if (iM32260e >= 0 && iM32260e < this.f14102d.size()) {
                        z = true;
                    }
                    if (z && this.f14102d.indexOfKey(iM32260e) < 0) {
                        this.f14102d.append(iM32260e, m16382e(iM32260e));
                    }
                }
                if (iM32260e == iM32261j) {
                    break;
                } else {
                    iM32260e += iM32262n;
                }
            }
        }
        this.f14103e = i;
    }

    /* renamed from: e */
    public final Bitmap m16382e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading page at index ");
        sb.append(i);
        PdfRenderer.Page pageOpenPage = this.f14099a.openPage(i);
        Bitmap bitmapM16383f = m16383f(m16377i(this, pageOpenPage.getWidth(), 0.0f, 1, null), m16377i(this, pageOpenPage.getHeight(), 0.0f, 1, null));
        pageOpenPage.render(bitmapM16383f, null, null, 1);
        pageOpenPage.close();
        return bitmapM16383f;
    }

    /* renamed from: f */
    public final Bitmap m16383f(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.f14100b);
        sq8.m48648g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* renamed from: g */
    public final void m16384g(il8 il8Var) {
        sq8.m48649h(il8Var, "newRange");
        il8 il8VarM16379b = m16379b(this.f14103e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : il8VarM16379b) {
            if (!kh3.m35708X(il8Var, Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Bitmap bitmap = (Bitmap) this.f14102d.get(iIntValue);
            if (bitmap != null) {
                sq8.m48646e(bitmap);
                this.f14102d.remove(iIntValue);
            }
        }
    }

    /* renamed from: h */
    public final int m16385h(int i, float f) {
        return (int) (((this.f14101c * i) / f14098h) * f);
    }
}
