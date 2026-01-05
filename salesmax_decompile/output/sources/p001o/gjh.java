package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.protocol.HTTP;
import p001o.agd;

/* loaded from: classes2.dex */
public abstract class gjh {

    /* renamed from: o.gjh$a */
    public static class C13761a {
        /* renamed from: a */
        public static int m28918a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m28919b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m28920c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m28921d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m28922e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        public static void m28923f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m28924g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m28925h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: o.gjh$b */
    public static class C13762b {
        /* renamed from: a */
        public static DecimalFormatSymbols m28926a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: o.gjh$c */
    public static class C13763c {
        /* renamed from: a */
        public static CharSequence m28927a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        /* renamed from: b */
        public static String[] m28928b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: c */
        public static PrecomputedText.Params m28929c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: d */
        public static void m28930d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: o.gjh$d */
    public static class C13764d {
        /* renamed from: a */
        public static void m28931a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* renamed from: o.gjh$e */
    public static class ActionModeCallbackC13765e implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f25360a;

        /* renamed from: b */
        public final TextView f25361b;

        /* renamed from: c */
        public Class f25362c;

        /* renamed from: d */
        public Method f25363d;

        /* renamed from: e */
        public boolean f25364e;

        /* renamed from: f */
        public boolean f25365f = false;

        public ActionModeCallbackC13765e(ActionMode.Callback callback, TextView textView) {
            this.f25360a = callback;
            this.f25361b = textView;
        }

        /* renamed from: a */
        public final Intent m28932a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(HTTP.PLAIN_TEXT_TYPE);
        }

        /* renamed from: b */
        public final Intent m28933b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m28932a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m28936e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List m28934c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m28932a(), 0)) {
                if (m28937f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public ActionMode.Callback m28935d() {
            return this.f25360a;
        }

        /* renamed from: e */
        public final boolean m28936e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        public final boolean m28937f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        public final void m28938g(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Context context = this.f25361b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f25365f) {
                this.f25365f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f25362c = cls;
                    this.f25363d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f25364e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f25362c = null;
                    this.f25363d = null;
                    this.f25364e = false;
                }
            }
            try {
                Method declaredMethod = (this.f25364e && this.f25362c.isInstance(menu)) ? this.f25363d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listM28934c = m28934c(context, packageManager);
                for (int i = 0; i < listM28934c.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listM28934c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m28933b(resolveInfo, this.f25361b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f25360a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f25360a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f25360a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            m28938g(menu);
            return this.f25360a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m28902a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m28903b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    public static int m28904c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: d */
    public static TextDirectionHeuristic m28905d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C13763c.m28928b(C13762b.m28926a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: e */
    public static agd.C12167a m28906e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new agd.C12167a(C13763c.m28929c(textView));
        }
        agd.C12167a.a aVar = new agd.C12167a.a(new TextPaint(textView.getPaint()));
        aVar.m17031b(C13761a.m28918a(textView));
        aVar.m17032c(C13761a.m28921d(textView));
        aVar.m17033d(m28905d(textView));
        return aVar.m17030a();
    }

    /* renamed from: f */
    public static void m28907f(TextView textView, ColorStateList colorStateList) {
        fgd.m26663g(textView);
        C13761a.m28923f(textView, colorStateList);
    }

    /* renamed from: g */
    public static void m28908g(TextView textView, PorterDuff.Mode mode) {
        fgd.m26663g(textView);
        C13761a.m28924g(textView, mode);
    }

    /* renamed from: h */
    public static void m28909h(TextView textView, int i) {
        fgd.m26660d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C13763c.m28930d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m28910i(TextView textView, int i) {
        fgd.m26660d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: j */
    public static void m28911j(TextView textView, int i) {
        fgd.m26660d(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: k */
    public static void m28912k(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13764d.m28931a(textView, i, f);
        } else {
            m28911j(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* renamed from: l */
    public static void m28913l(TextView textView, agd agdVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m28906e(textView);
        throw null;
    }

    /* renamed from: m */
    public static void m28914m(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: n */
    public static void m28915n(TextView textView, agd.C12167a c12167a) {
        textView.setTextDirection(m28904c(c12167a.m17028d()));
        textView.getPaint().set(c12167a.m17029e());
        C13761a.m28922e(textView, c12167a.m17026b());
        C13761a.m28925h(textView, c12167a.m17027c());
    }

    /* renamed from: o */
    public static ActionMode.Callback m28916o(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC13765e) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC13765e) callback).m28935d();
    }

    /* renamed from: p */
    public static ActionMode.Callback m28917p(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC13765e) || callback == null) ? callback : new ActionModeCallbackC13765e(callback, textView);
    }
}
