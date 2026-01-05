package p001o;

import android.graphics.PointF;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.ka9;

/* loaded from: classes3.dex */
public class dlf implements wri {

    /* renamed from: a */
    public static final dlf f20191a = new dlf();

    /* renamed from: b */
    public static final ka9.C14756a f20192b = ka9.C14756a.m35230a("c", "v", "i", NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST);

    @Override // p001o.wri
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public clf mo23422a(ka9 ka9Var, float f) {
        if (ka9Var.mo22723C() == ka9.EnumC14757b.BEGIN_ARRAY) {
            ka9Var.mo22731c();
        }
        ka9Var.mo22732d();
        List listM24699f = null;
        List listM24699f2 = null;
        List listM24699f3 = null;
        boolean zMo22736k = false;
        while (ka9Var.mo22735h()) {
            int iMo22724H = ka9Var.mo22724H(f20192b);
            if (iMo22724H == 0) {
                zMo22736k = ka9Var.mo22736k();
            } else if (iMo22724H == 1) {
                listM24699f = eb9.m24699f(ka9Var, f);
            } else if (iMo22724H == 2) {
                listM24699f2 = eb9.m24699f(ka9Var, f);
            } else if (iMo22724H != 3) {
                ka9Var.mo22725J();
                ka9Var.mo22726K();
            } else {
                listM24699f3 = eb9.m24699f(ka9Var, f);
            }
        }
        ka9Var.mo22734g();
        if (ka9Var.mo22723C() == ka9.EnumC14757b.END_ARRAY) {
            ka9Var.mo22733f();
        }
        if (listM24699f == null || listM24699f2 == null || listM24699f3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM24699f.isEmpty()) {
            return new clf(new PointF(), false, Collections.emptyList());
        }
        int size = listM24699f.size();
        PointF pointF = (PointF) listM24699f.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listM24699f.get(i);
            int i2 = i - 1;
            arrayList.add(new zc4(zeb.m59346a((PointF) listM24699f.get(i2), (PointF) listM24699f3.get(i2)), zeb.m59346a(pointF2, (PointF) listM24699f2.get(i)), pointF2));
        }
        if (zMo22736k) {
            PointF pointF3 = (PointF) listM24699f.get(0);
            int i3 = size - 1;
            arrayList.add(new zc4(zeb.m59346a((PointF) listM24699f.get(i3), (PointF) listM24699f3.get(i3)), zeb.m59346a(pointF3, (PointF) listM24699f2.get(0)), pointF3));
        }
        return new clf(pointF, zMo22736k, arrayList);
    }
}
