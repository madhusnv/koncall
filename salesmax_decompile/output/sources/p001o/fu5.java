package p001o;

import android.widget.TextView;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class fu5 {
    /* renamed from: a */
    public static final void m27486a(TextView textView, yfe yfeVar) {
        Integer position;
        if (textView == null || yfeVar == null) {
            return;
        }
        String.valueOf(yfeVar.getOldSortByValue());
        String.valueOf(yfeVar.getSortedByDataType());
        String strM27487b = m27487b(yfeVar.getOldSortByValue(), yfeVar.getSortedByDataType());
        String strM27487b2 = m27487b(yfeVar.getCurrentSortByValue(), yfeVar.getSortedByDataType());
        if (strM27487b2 != null) {
            String upperCase = strM27487b2.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            textView.setText(upperCase);
        }
        if (sq8.m48644c(strM27487b, strM27487b2) || ((position = yfeVar.getPosition()) != null && position.intValue() == 0)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static final String m27487b(Object obj, zfe zfeVar) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) && zfeVar == zfe.DATE_TIME_TYPE) {
            return jm7.m34025K(((Long) obj).longValue());
        }
        if (obj instanceof Date) {
            return jm7.m34025K(((Date) obj).getTime());
        }
        boolean z = obj instanceof String;
        if (z && zfeVar == zfe.DATE_TIME_TYPE) {
            String str = (String) obj;
            if (!f9g.d0(str)) {
                return jm7.m34025K(Long.parseLong(str));
            }
        }
        if (!z || zfeVar != zfe.INITIAL || !(!f9g.d0((CharSequence) obj))) {
            return obj.toString();
        }
        String upperCase = f9g.Z0((String) obj).toString().toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        return upperCase.subSequence(0, 1).toString();
    }
}
