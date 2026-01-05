package p001o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kizitonwose.calendar.view.internal.C11562a;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class nri {
    /* renamed from: a */
    public static final int m41012a(LocalDate localDate) {
        sq8.m48649h(localDate, "date");
        return localDate.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sx8 m41013b(msa msaVar, e05 e05Var, Context context, int i, int i2, int i3, int i4, String str, uh1 uh1Var) {
        View viewM17653b;
        View view;
        Object objM53351b;
        sq8.m48649h(msaVar, "itemMargins");
        sq8.m48649h(e05Var, "daySize");
        sq8.m48649h(context, "context");
        sq8.m48649h(uh1Var, "dayBinder");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = null;
        if (i2 != 0) {
            viewM17653b = aq6.m17653b(linearLayout, i2, false, 2, null);
            linearLayout.addView(viewM17653b);
        } else {
            viewM17653b = null;
        }
        a05 a05Var = new a05(e05Var, i, uh1Var);
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            e05 e05VarM16287b = a05Var.m16287b();
            ArrayList arrayList2 = new ArrayList(7);
            int i6 = 0;
            for (int i7 = 7; i6 < i7; i7 = 7) {
                arrayList2.add(new b05(a05Var));
                i6++;
            }
            arrayList.add(new C11562a(e05VarM16287b, arrayList2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((C11562a) it.next()).m15883b(linearLayout));
        }
        if (i3 != 0) {
            View viewM17653b2 = aq6.m17653b(linearLayout, i3, false, 2, null);
            linearLayout.addView(viewM17653b2);
            view = viewM17653b2;
        } else {
            view = null;
        }
        if (str != null) {
            try {
                vre.C17665a c17665a = vre.f50797b;
                Object objNewInstance = Class.forName(str).getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                sq8.m48647f(objNewInstance, "null cannot be cast to non-null type android.view.ViewGroup");
                objM53351b = vre.m53351b((ViewGroup) objNewInstance);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            vre.m53354e(objM53351b);
            if (vre.m53356g(objM53351b)) {
                objM53351b = null;
            }
            ViewGroup viewGroup = (ViewGroup) objM53351b;
            if (viewGroup != 0) {
                m41014c(e05Var, msaVar, viewGroup);
                viewGroup.addView(linearLayout);
                linearLayout2 = viewGroup;
            }
            if (linearLayout2 == null) {
                m41014c(e05Var, msaVar, linearLayout);
            } else {
                linearLayout = linearLayout2;
            }
        }
        return new sx8(linearLayout, viewM17653b, view, arrayList);
    }

    /* renamed from: c */
    public static final void m41014c(e05 e05Var, msa msaVar, ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(e05Var.getParentDecidesWidth$view_release() ? -1 : -2, e05Var.getParentDecidesHeight$view_release() ? -1 : -2);
        marginLayoutParams.bottomMargin = msaVar.m39613a();
        marginLayoutParams.topMargin = msaVar.m39616d();
        marginLayoutParams.setMarginStart(msaVar.m39615c());
        marginLayoutParams.setMarginEnd(msaVar.m39614b());
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
