package p001o;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import p001o.l77;
import p001o.zw7;

/* loaded from: classes2.dex */
public final class cq6 {

    /* renamed from: a */
    public static final cq6 f18499a = new cq6();

    /* renamed from: a */
    public final l77 m21582a(Activity activity, FoldingFeature foldingFeature) {
        zw7.C18722b c18722bM59995a;
        l77.C15011b c15011b;
        sq8.m48649h(activity, "activity");
        sq8.m48649h(foldingFeature, "oemFeature");
        int type2 = foldingFeature.getType();
        if (type2 == 1) {
            c18722bM59995a = zw7.C18722b.f57814b.m59995a();
        } else {
            if (type2 != 2) {
                return null;
            }
            c18722bM59995a = zw7.C18722b.f57814b.m59996b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c15011b = l77.C15011b.f33348c;
        } else {
            if (state != 2) {
                return null;
            }
            c15011b = l77.C15011b.f33349d;
        }
        Rect bounds = foldingFeature.getBounds();
        sq8.m48648g(bounds, "oemFeature.bounds");
        if (!m21584c(activity, new ll1(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        sq8.m48648g(bounds2, "oemFeature.bounds");
        return new zw7(new ll1(bounds2), c18722bM59995a, c15011b);
    }

    /* renamed from: b */
    public final taj m21583b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        l77 l77VarM21582a;
        sq8.m48649h(activity, "activity");
        sq8.m48649h(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        sq8.m48648g(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                cq6 cq6Var = f18499a;
                sq8.m48648g(foldingFeature, "feature");
                l77VarM21582a = cq6Var.m21582a(activity, foldingFeature);
            } else {
                l77VarM21582a = null;
            }
            if (l77VarM21582a != null) {
                arrayList.add(l77VarM21582a);
            }
        }
        return new taj(arrayList);
    }

    /* renamed from: c */
    public final boolean m21584c(Activity activity, ll1 ll1Var) {
        Rect rectM51318a = yaj.f55163a.m57427a(activity).m51318a();
        if (ll1Var.m37419e()) {
            return false;
        }
        if (ll1Var.m37418d() != rectM51318a.width() && ll1Var.m37415a() != rectM51318a.height()) {
            return false;
        }
        if (ll1Var.m37418d() >= rectM51318a.width() || ll1Var.m37415a() >= rectM51318a.height()) {
            return (ll1Var.m37418d() == rectM51318a.width() && ll1Var.m37415a() == rectM51318a.height()) ? false : true;
        }
        return false;
    }
}
