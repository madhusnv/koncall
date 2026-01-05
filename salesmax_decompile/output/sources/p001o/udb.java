package p001o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class udb {

    /* renamed from: a */
    public static final udb f48743a = new udb();

    /* renamed from: a */
    public static final List m51383a(View view) {
        if (a94.m16694d(udb.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM42739j = owi.m42739j(view);
            if (viewGroupM42739j != null) {
                for (View view2 : owi.m42733b(viewGroupM42739j)) {
                    if (view != view2) {
                        arrayList.addAll(f48743a.m51387c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, udb.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final List m51384b(View view) {
        if (a94.m16694d(udb.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(owi.m42738i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    sq8.m48648g(resourceName, "resourceName");
                    String[] strArr = (String[]) new mge("/").m38998j(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            a94.m16692b(th, udb.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final boolean m51385e(List list, List list2) {
        if (a94.m16694d(udb.class)) {
            return false;
        }
        try {
            sq8.m48649h(list, "indicators");
            sq8.m48649h(list2, UserMetadata.KEYDATA_FILENAME);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f48743a.m51388d((String) it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, udb.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m51386f(String str, String str2) {
        if (a94.m16694d(udb.class)) {
            return false;
        }
        try {
            sq8.m48649h(str, "text");
            sq8.m48649h(str2, "rule");
            return new mge(str2).m38995g(str);
        } catch (Throwable th) {
            a94.m16692b(th, udb.class);
            return false;
        }
    }

    /* renamed from: c */
    public final List m51387c(View view) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it = owi.m42733b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m51387c((View) it.next()));
                }
                return arrayList;
            }
            String string = ((TextView) view).getText().toString();
            if ((string.length() > 0) && string.length() < 100) {
                String lowerCase = string.toLowerCase();
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m51388d(String str, List list) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f9g.m26306P(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
