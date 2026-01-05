package og;

import android.view.View;
import android.view.ViewGroup;
import fd.AbstractC2268f;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6363m;
import td.C7124a;
import td.C7126c;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ef {
    /* renamed from: a */
    public static View m10631a(int i10, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final Object m10632b(Serializable serializable) {
        if (serializable instanceof C6363m) {
            return serializable;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) serializable));
        } catch (Throwable th2) {
            return od.m10796a(th2);
        }
    }

    /* renamed from: c */
    public static final Object m10633c(Serializable serializable, EnumC7143t fmt) {
        AbstractC4154l.m8923f(fmt, "fmt");
        if (serializable instanceof C6363m) {
            return serializable;
        }
        try {
            String str = (String) serializable;
            switch (AbstractC2268f.f10277a[fmt.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
                    return C7124a.m13405c(str);
                case 5:
                    DateTimeFormatter dateTimeFormatter2 = C7126c.f34342b;
                    return C7124a.m13406d(str);
                case 6:
                    DateTimeFormatter dateTimeFormatter3 = C7126c.f34342b;
                    return C7124a.m13404b(str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th2) {
            return od.m10796a(th2);
        }
    }
}
