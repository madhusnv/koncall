package p001o;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zbg {

    /* renamed from: a */
    public static final zbg f56916a = new zbg();

    /* renamed from: b */
    public static final List f56917b = ch3.m21249n(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* renamed from: a */
    public static final List m59165a(View view) {
        if (a94.m16694d(zbg.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f56917b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = owi.m42733b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m59165a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, zbg.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONObject m59166b(View view, View view2) {
        if (a94.m16694d(zbg.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            sq8.m48649h(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m59168e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = owi.m42733b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m59166b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            a94.m16692b(th, zbg.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m59167d(View view) {
        if (a94.m16694d(zbg.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "hostView");
            String strM42740k = owi.m42740k(view);
            if (strM42740k.length() > 0) {
                return strM42740k;
            }
            String strJoin = TextUtils.join(" ", f56916a.m59169c(view));
            sq8.m48648g(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th) {
            a94.m16692b(th, zbg.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m59168e(View view, JSONObject jSONObject) {
        if (a94.m16694d(zbg.class)) {
            return;
        }
        try {
            sq8.m48649h(view, "view");
            sq8.m48649h(jSONObject, "json");
            try {
                String strM42740k = owi.m42740k(view);
                String strM42738i = owi.m42738i(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", owi.m42734c(view));
                boolean z = true;
                if (strM42740k.length() > 0) {
                    jSONObject.put("text", strM42740k);
                }
                if (strM42738i.length() <= 0) {
                    z = false;
                }
                if (z) {
                    jSONObject.put("hint", strM42738i);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, zbg.class);
        }
    }

    /* renamed from: c */
    public final List m59169c(View view) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : owi.m42733b(view)) {
                String strM42740k = owi.m42740k(view2);
                if (strM42740k.length() > 0) {
                    arrayList.add(strM42740k);
                }
                arrayList.addAll(m59169c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
