package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.wv5;

/* loaded from: classes3.dex */
public class dih extends hc1 {

    /* renamed from: B */
    public final StringBuilder f20039B;

    /* renamed from: C */
    public final RectF f20040C;

    /* renamed from: D */
    public final Matrix f20041D;

    /* renamed from: E */
    public final Paint f20042E;

    /* renamed from: F */
    public final Paint f20043F;

    /* renamed from: G */
    public final Map f20044G;

    /* renamed from: H */
    public final rla f20045H;

    /* renamed from: I */
    public final zhh f20046I;

    /* renamed from: J */
    public final ema f20047J;

    /* renamed from: K */
    public final ama f20048K;

    /* renamed from: L */
    public gc1 f20049L;

    /* renamed from: M */
    public gc1 f20050M;

    /* renamed from: N */
    public gc1 f20051N;

    /* renamed from: O */
    public gc1 f20052O;

    /* renamed from: P */
    public gc1 f20053P;

    /* renamed from: Q */
    public gc1 f20054Q;

    /* renamed from: R */
    public gc1 f20055R;

    /* renamed from: S */
    public gc1 f20056S;

    /* renamed from: T */
    public gc1 f20057T;

    /* renamed from: U */
    public gc1 f20058U;

    /* renamed from: V */
    public gc1 f20059V;

    /* renamed from: o.dih$a */
    public class C12947a extends Paint {
        public C12947a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: o.dih$b */
    public class C12948b extends Paint {
        public C12948b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: o.dih$c */
    public static /* synthetic */ class C12949c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20062a;

        static {
            int[] iArr = new int[wv5.EnumC17969a.values().length];
            f20062a = iArr;
            try {
                iArr[wv5.EnumC17969a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20062a[wv5.EnumC17969a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20062a[wv5.EnumC17969a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public dih(ema emaVar, gh9 gh9Var) {
        fg0 fg0Var;
        fg0 fg0Var2;
        eg0 eg0Var;
        eg0 eg0Var2;
        super(emaVar, gh9Var);
        this.f20039B = new StringBuilder(2);
        this.f20040C = new RectF();
        this.f20041D = new Matrix();
        this.f20042E = new C12947a(1);
        this.f20043F = new C12948b(1);
        this.f20044G = new HashMap();
        this.f20045H = new rla();
        this.f20047J = emaVar;
        this.f20048K = gh9Var.m28676b();
        zhh zhhVarMo24960a = gh9Var.m28693s().mo24960a();
        this.f20046I = zhhVarMo24960a;
        zhhVarMo24960a.m28369a(this);
        m30184i(zhhVarMo24960a);
        pg0 pg0VarM28694t = gh9Var.m28694t();
        if (pg0VarM28694t != null && (eg0Var2 = pg0VarM28694t.f40020a) != null) {
            gc1 gc1VarMo24960a = eg0Var2.mo24960a();
            this.f20049L = gc1VarMo24960a;
            gc1VarMo24960a.m28369a(this);
            m30184i(this.f20049L);
        }
        if (pg0VarM28694t != null && (eg0Var = pg0VarM28694t.f40021b) != null) {
            gc1 gc1VarMo24960a2 = eg0Var.mo24960a();
            this.f20051N = gc1VarMo24960a2;
            gc1VarMo24960a2.m28369a(this);
            m30184i(this.f20051N);
        }
        if (pg0VarM28694t != null && (fg0Var2 = pg0VarM28694t.f40022c) != null) {
            gc1 gc1VarMo24960a3 = fg0Var2.mo24960a();
            this.f20053P = gc1VarMo24960a3;
            gc1VarMo24960a3.m28369a(this);
            m30184i(this.f20053P);
        }
        if (pg0VarM28694t == null || (fg0Var = pg0VarM28694t.f40023d) == null) {
            return;
        }
        gc1 gc1VarMo24960a4 = fg0Var.mo24960a();
        this.f20055R = gc1VarMo24960a4;
        gc1VarMo24960a4.m28369a(this);
        m30184i(this.f20055R);
    }

    /* renamed from: N */
    public final void m23307N(wv5.EnumC17969a enumC17969a, Canvas canvas, float f) {
        int i = C12949c.f20062a[enumC17969a.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: O */
    public final String m23308O(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!b0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.f20045H.m46931b(j)) {
            return (String) this.f20045H.m46932c(j);
        }
        this.f20039B.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.f20039B.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.f20039B.toString();
        this.f20045H.m46936i(j, string);
        return string;
    }

    /* renamed from: P */
    public final void m23309P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: Q */
    public final void m23310Q(jb7 jb7Var, Matrix matrix, float f, wv5 wv5Var, Canvas canvas) {
        List listM23317X = m23317X(jb7Var);
        for (int i = 0; i < listM23317X.size(); i++) {
            Path path = ((x14) listM23317X.get(i)).getPath();
            path.computeBounds(this.f20040C, false);
            this.f20041D.set(matrix);
            this.f20041D.preTranslate(0.0f, (-wv5Var.f52729g) * hri.m31025e());
            this.f20041D.preScale(f, f);
            path.transform(this.f20041D);
            if (wv5Var.f52733k) {
                m23313T(path, this.f20042E, canvas);
                m23313T(path, this.f20043F, canvas);
            } else {
                m23313T(path, this.f20043F, canvas);
                m23313T(path, this.f20042E, canvas);
            }
        }
    }

    /* renamed from: R */
    public final void m23311R(String str, wv5 wv5Var, Canvas canvas) {
        if (wv5Var.f52733k) {
            m23309P(str, this.f20042E, canvas);
            m23309P(str, this.f20043F, canvas);
        } else {
            m23309P(str, this.f20043F, canvas);
            m23309P(str, this.f20042E, canvas);
        }
    }

    /* renamed from: S */
    public final void m23312S(String str, wv5 wv5Var, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strM23308O = m23308O(str, length);
            length += strM23308O.length();
            m23311R(strM23308O, wv5Var, canvas);
            canvas.translate(this.f20042E.measureText(strM23308O) + f, 0.0f);
        }
    }

    /* renamed from: T */
    public final void m23313T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: U */
    public final void m23314U(String str, wv5 wv5Var, Matrix matrix, gb7 gb7Var, Canvas canvas, float f, float f2) {
        float fFloatValue;
        for (int i = 0; i < str.length(); i++) {
            jb7 jb7Var = (jb7) this.f20048K.m17439c().m22184f(jb7.m33463c(str.charAt(i), gb7Var.m28306a(), gb7Var.m28308c()));
            if (jb7Var != null) {
                m23310Q(jb7Var, matrix, f2, wv5Var, canvas);
                float fM33465b = ((float) jb7Var.m33465b()) * f2 * hri.m31025e() * f;
                float f3 = wv5Var.f52727e / 10.0f;
                gc1 gc1Var = this.f20056S;
                if (gc1Var != null) {
                    fFloatValue = ((Float) gc1Var.mo28376h()).floatValue();
                } else {
                    gc1 gc1Var2 = this.f20055R;
                    if (gc1Var2 != null) {
                        fFloatValue = ((Float) gc1Var2.mo28376h()).floatValue();
                    }
                    canvas.translate(fM33465b + (f3 * f), 0.0f);
                }
                f3 += fFloatValue;
                canvas.translate(fM33465b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: V */
    public final void m23315V(wv5 wv5Var, Matrix matrix, gb7 gb7Var, Canvas canvas) {
        float fFloatValue;
        gc1 gc1Var = this.f20058U;
        if (gc1Var != null) {
            fFloatValue = ((Float) gc1Var.mo28376h()).floatValue();
        } else {
            gc1 gc1Var2 = this.f20057T;
            fFloatValue = gc1Var2 != null ? ((Float) gc1Var2.mo28376h()).floatValue() : wv5Var.f52725c;
        }
        float f = fFloatValue / 100.0f;
        float fM31027g = hri.m31027g(matrix);
        String str = wv5Var.f52723a;
        float fM31025e = wv5Var.f52728f * hri.m31025e();
        List listM23319Z = m23319Z(str);
        int size = listM23319Z.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) listM23319Z.get(i);
            float fM23318Y = m23318Y(str2, gb7Var, f, fM31027g);
            canvas.save();
            m23307N(wv5Var.f52726d, canvas, fM23318Y);
            canvas.translate(0.0f, (i * fM31025e) - (((size - 1) * fM31025e) / 2.0f));
            m23314U(str2, wv5Var, matrix, gb7Var, canvas, fM31027g, f);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[LOOP:0: B:20:0x0091->B:21:0x0093, LOOP_END] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23316W(wv5 wv5Var, gb7 gb7Var, Matrix matrix, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        int size;
        int i;
        Typeface typefaceA0 = a0(gb7Var);
        if (typefaceA0 == null) {
            return;
        }
        String str = wv5Var.f52723a;
        this.f20047J.m25293F();
        this.f20042E.setTypeface(typefaceA0);
        gc1 gc1Var = this.f20058U;
        if (gc1Var != null) {
            fFloatValue = ((Float) gc1Var.mo28376h()).floatValue();
        } else {
            gc1 gc1Var2 = this.f20057T;
            fFloatValue = gc1Var2 != null ? ((Float) gc1Var2.mo28376h()).floatValue() : wv5Var.f52725c;
        }
        this.f20042E.setTextSize(hri.m31025e() * fFloatValue);
        this.f20043F.setTypeface(this.f20042E.getTypeface());
        this.f20043F.setTextSize(this.f20042E.getTextSize());
        float fM31025e = wv5Var.f52728f * hri.m31025e();
        float f = wv5Var.f52727e / 10.0f;
        gc1 gc1Var3 = this.f20056S;
        if (gc1Var3 == null) {
            gc1 gc1Var4 = this.f20055R;
            if (gc1Var4 != null) {
                fFloatValue2 = ((Float) gc1Var4.mo28376h()).floatValue();
            }
            float fM31025e2 = ((f * hri.m31025e()) * fFloatValue) / 100.0f;
            List listM23319Z = m23319Z(str);
            size = listM23319Z.size();
            for (i = 0; i < size; i++) {
                String str2 = (String) listM23319Z.get(i);
                float fMeasureText = this.f20043F.measureText(str2) + ((str2.length() - 1) * fM31025e2);
                canvas.save();
                m23307N(wv5Var.f52726d, canvas, fMeasureText);
                canvas.translate(0.0f, (i * fM31025e) - (((size - 1) * fM31025e) / 2.0f));
                m23312S(str2, wv5Var, canvas, fM31025e2);
                canvas.restore();
            }
        }
        fFloatValue2 = ((Float) gc1Var3.mo28376h()).floatValue();
        f += fFloatValue2;
        float fM31025e22 = ((f * hri.m31025e()) * fFloatValue) / 100.0f;
        List listM23319Z2 = m23319Z(str);
        size = listM23319Z2.size();
        while (i < size) {
        }
    }

    /* renamed from: X */
    public final List m23317X(jb7 jb7Var) {
        if (this.f20044G.containsKey(jb7Var)) {
            return (List) this.f20044G.get(jb7Var);
        }
        List listM33464a = jb7Var.m33464a();
        int size = listM33464a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new x14(this.f20047J, this, (glf) listM33464a.get(i)));
        }
        this.f20044G.put(jb7Var, arrayList);
        return arrayList;
    }

    /* renamed from: Y */
    public final float m23318Y(String str, gb7 gb7Var, float f, float f2) {
        float fM33465b = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            jb7 jb7Var = (jb7) this.f20048K.m17439c().m22184f(jb7.m33463c(str.charAt(i), gb7Var.m28306a(), gb7Var.m28308c()));
            if (jb7Var != null) {
                fM33465b = (float) (fM33465b + (jb7Var.m33465b() * f * hri.m31025e() * f2));
            }
        }
        return fM33465b;
    }

    /* renamed from: Z */
    public final List m23319Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final Typeface a0(gb7 gb7Var) {
        Typeface typeface;
        gc1 gc1Var = this.f20059V;
        if (gc1Var != null && (typeface = (Typeface) gc1Var.mo28376h()) != null) {
            return typeface;
        }
        Typeface typefaceM25294G = this.f20047J.m25294G(gb7Var.m28306a(), gb7Var.m28308c());
        return typefaceM25294G != null ? typefaceM25294G : gb7Var.m28309d();
    }

    public final boolean b0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // p001o.hc1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35710a) {
            gc1 gc1Var = this.f20050M;
            if (gc1Var != null) {
                m30176F(gc1Var);
            }
            if (qmaVar == null) {
                this.f20050M = null;
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f20050M = vriVar;
            vriVar.m28369a(this);
            m30184i(this.f20050M);
            return;
        }
        if (obj == mma.f35711b) {
            gc1 gc1Var2 = this.f20052O;
            if (gc1Var2 != null) {
                m30176F(gc1Var2);
            }
            if (qmaVar == null) {
                this.f20052O = null;
                return;
            }
            vri vriVar2 = new vri(qmaVar);
            this.f20052O = vriVar2;
            vriVar2.m28369a(this);
            m30184i(this.f20052O);
            return;
        }
        if (obj == mma.f35728s) {
            gc1 gc1Var3 = this.f20054Q;
            if (gc1Var3 != null) {
                m30176F(gc1Var3);
            }
            if (qmaVar == null) {
                this.f20054Q = null;
                return;
            }
            vri vriVar3 = new vri(qmaVar);
            this.f20054Q = vriVar3;
            vriVar3.m28369a(this);
            m30184i(this.f20054Q);
            return;
        }
        if (obj == mma.f35729t) {
            gc1 gc1Var4 = this.f20056S;
            if (gc1Var4 != null) {
                m30176F(gc1Var4);
            }
            if (qmaVar == null) {
                this.f20056S = null;
                return;
            }
            vri vriVar4 = new vri(qmaVar);
            this.f20056S = vriVar4;
            vriVar4.m28369a(this);
            m30184i(this.f20056S);
            return;
        }
        if (obj == mma.f35701F) {
            gc1 gc1Var5 = this.f20058U;
            if (gc1Var5 != null) {
                m30176F(gc1Var5);
            }
            if (qmaVar == null) {
                this.f20058U = null;
                return;
            }
            vri vriVar5 = new vri(qmaVar);
            this.f20058U = vriVar5;
            vriVar5.m28369a(this);
            m30184i(this.f20058U);
            return;
        }
        if (obj == mma.f35708M) {
            gc1 gc1Var6 = this.f20059V;
            if (gc1Var6 != null) {
                m30176F(gc1Var6);
            }
            if (qmaVar == null) {
                this.f20059V = null;
                return;
            }
            vri vriVar6 = new vri(qmaVar);
            this.f20059V = vriVar6;
            vriVar6.m28369a(this);
            m30184i(this.f20059V);
        }
    }

    @Override // p001o.hc1, p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        super.mo20001e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f20048K.m17438b().width(), this.f20048K.m17438b().height());
    }

    @Override // p001o.hc1
    /* renamed from: t */
    public void mo23320t(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f20047J.o0()) {
            canvas.concat(matrix);
        }
        wv5 wv5Var = (wv5) this.f20046I.mo28376h();
        gb7 gb7Var = (gb7) this.f20048K.m17443g().get(wv5Var.f52724b);
        if (gb7Var == null) {
            canvas.restore();
            return;
        }
        gc1 gc1Var = this.f20050M;
        if (gc1Var != null) {
            this.f20042E.setColor(((Integer) gc1Var.mo28376h()).intValue());
        } else {
            gc1 gc1Var2 = this.f20049L;
            if (gc1Var2 != null) {
                this.f20042E.setColor(((Integer) gc1Var2.mo28376h()).intValue());
            } else {
                this.f20042E.setColor(wv5Var.f52730h);
            }
        }
        gc1 gc1Var3 = this.f20052O;
        if (gc1Var3 != null) {
            this.f20043F.setColor(((Integer) gc1Var3.mo28376h()).intValue());
        } else {
            gc1 gc1Var4 = this.f20051N;
            if (gc1Var4 != null) {
                this.f20043F.setColor(((Integer) gc1Var4.mo28376h()).intValue());
            } else {
                this.f20043F.setColor(wv5Var.f52731i);
            }
        }
        int iIntValue = ((this.f26628v.m50701h() == null ? 100 : ((Integer) this.f26628v.m50701h().mo28376h()).intValue()) * Constants.MAX_HOST_LENGTH) / 100;
        this.f20042E.setAlpha(iIntValue);
        this.f20043F.setAlpha(iIntValue);
        gc1 gc1Var5 = this.f20054Q;
        if (gc1Var5 != null) {
            this.f20043F.setStrokeWidth(((Float) gc1Var5.mo28376h()).floatValue());
        } else {
            gc1 gc1Var6 = this.f20053P;
            if (gc1Var6 != null) {
                this.f20043F.setStrokeWidth(((Float) gc1Var6.mo28376h()).floatValue());
            } else {
                this.f20043F.setStrokeWidth(wv5Var.f52732j * hri.m31025e() * hri.m31027g(matrix));
            }
        }
        if (this.f20047J.o0()) {
            m23315V(wv5Var, matrix, gb7Var, canvas);
        } else {
            m23316W(wv5Var, gb7Var, matrix, canvas);
        }
        canvas.restore();
    }
}
