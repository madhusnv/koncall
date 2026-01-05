package og;

import a6.C0055c;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import c6.AbstractC0879i;
import g6.ActionModeCallbackC2534i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class bg {
    /* JADX WARN: Removed duplicated region for block: B:232:0x0359 A[PHI: r9
      0x0359: PHI (r9v35 l1.o) = (r9v23 l1.o), (r9v36 l1.o) binds: [B:231:0x0357, B:227:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x037a A[PHI: r15
      0x037a: PHI (r15v41 int) = (r15v27 int), (r15v42 int) binds: [B:241:0x0378, B:237:0x0371] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04c2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10559a(w2.InterfaceC7879r r42, t1.AbstractC7000y r43, o1.h1 r44, k1.x0 r45, l1.C4319h r46, boolean r47, i1.C3128g r48, int r49, float r50, t1.C6983h r51, o3.InterfaceC5278a r52, ex.InterfaceC2139c r53, w2.C7870i r54, l1.InterfaceC4326o r55, s2.C6734c r56, k2.InterfaceC3962k r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.bg.m10559a(w2.r, t1.y, o1.h1, k1.x0, l1.h, boolean, i1.g, int, float, t1.h, o3.a, ex.c, w2.i, l1.o, s2.c, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static C0055c m10560b(p013o.j0 j0Var) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new C0055c(AbstractC0879i.m2402n(j0Var));
        }
        TextPaint textPaint = new TextPaint(j0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = j0Var.getBreakStrategy();
        int hyphenationFrequency = j0Var.getHyphenationFrequency();
        if (j0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i10 < 28 || (j0Var.getInputType() & 15) != 3) {
                boolean z6 = j0Var.getLayoutDirection() == 1;
                switch (j0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z6) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0879i.m2392d(DecimalFormatSymbols.getInstance(j0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0055c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* renamed from: c */
    public static void m10561c(TextView textView, int i10) {
        y0.m11054d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0879i.m2408t(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public static void m10562d(TextView textView, int i10) {
        y0.m11054d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: e */
    public static void m10563e(TextView textView, int i10) {
        y0.m11054d(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: f */
    public static ActionMode.Callback m10564f(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC2534i) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC2534i) callback).f13861a;
    }

    /* renamed from: g */
    public static ActionMode.Callback m10565g(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof ActionModeCallbackC2534i) || callback == null) ? callback : new ActionModeCallbackC2534i(callback, textView);
    }
}
