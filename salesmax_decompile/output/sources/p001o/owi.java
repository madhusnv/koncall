package p001o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class owi {

    /* renamed from: a */
    public static final owi f39014a = new owi();

    /* renamed from: b */
    public static final String f39015b = owi.class.getCanonicalName();

    /* renamed from: c */
    public static WeakReference f39016c = new WeakReference(null);

    /* renamed from: d */
    public static Method f39017d;

    /* renamed from: a */
    public static final View m42732a(View view) {
        if (a94.m16694d(owi.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f39014a.m42750q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                a94.m16692b(th, owi.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final List m42733b(View view) {
        if (a94.m16694d(owi.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final int m42734c(View view) {
        if (a94.m16694d(owi.class)) {
            return 0;
        }
        try {
            sq8.m48649h(view, "view");
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            if (m42741o(view)) {
                i |= 512;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i | 65536 : view instanceof RadioGroup ? i | Opcodes.ACC_ENUM : ((view instanceof ViewGroup) && f39014a.m42749p(view, (View) f39016c.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1024 | 1;
            if (view instanceof Button) {
                i2 |= 4;
                if (view instanceof Switch) {
                    i2 |= 8192;
                } else if (view instanceof CheckBox) {
                    i2 |= 32768;
                }
            }
            return view instanceof EditText ? i2 | 2048 : i2;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static final JSONObject m42735d(View view) {
        if (a94.m16694d(owi.class)) {
            return null;
        }
        try {
            sq8.m48649h(view, "view");
            if (sq8.m48644c(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f39016c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m42743s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List listM42733b = m42733b(view);
                int size = listM42733b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(m42735d((View) listM42733b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: g */
    public static final View.OnClickListener m42736g(View view) {
        Field declaredField;
        if (a94.m16694d(owi.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            sq8.m48647f(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final View.OnTouchListener m42737h(View view) {
        Field declaredField;
        try {
            if (a94.m16694d(owi.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    sq8.m48647f(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                    return (View.OnTouchListener) obj2;
                } catch (ClassNotFoundException e) {
                    cri.j0(f39015b, e);
                    return null;
                }
            } catch (IllegalAccessException e2) {
                cri.j0(f39015b, e2);
                return null;
            } catch (NoSuchFieldException e3) {
                cri.j0(f39015b, e3);
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final String m42738i(View view) {
        if (a94.m16694d(owi.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint != null) {
                String string = hint.toString();
                if (string != null) {
                    return string;
                }
            }
            return "";
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final ViewGroup m42739j(View view) {
        if (a94.m16694d(owi.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m42740k(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        if (a94.m16694d(owi.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                charSequenceValueOf = (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) ? null : selectedItem.toString();
            } else {
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    h8g h8gVar = h8g.f26398a;
                    charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    sq8.m48648g(charSequenceValueOf, "format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    sq8.m48648g(currentHour, "view.currentHour");
                    int iIntValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    sq8.m48648g(currentMinute, "view.currentMinute");
                    int iIntValue2 = currentMinute.intValue();
                    h8g h8gVar2 = h8g.f26398a;
                    charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                    sq8.m48648g(charSequenceValueOf, "format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = ((RadioGroup) view).getChildAt(i);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            charSequenceValueOf = ((RadioButton) childAt).getText();
                            break;
                        }
                    }
                } else if (view instanceof RatingBar) {
                    charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                }
            }
            if (charSequenceValueOf != null) {
                String string = charSequenceValueOf.toString();
                if (string != null) {
                    return string;
                }
            }
            return "";
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return null;
        }
    }

    /* renamed from: o */
    public static final boolean m42741o(View view) {
        if (a94.m16694d(owi.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            owi owiVar = f39014a;
            Class clsM42745f = owiVar.m42745f("android.support.v4.view.NestedScrollingChild");
            if (clsM42745f != null && clsM42745f.isInstance(parent)) {
                return true;
            }
            Class clsM42745f2 = owiVar.m42745f("androidx.core.view.NestedScrollingChild");
            if (clsM42745f2 != null) {
                return clsM42745f2.isInstance(parent);
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
            return false;
        }
    }

    /* renamed from: r */
    public static final void m42742r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (a94.m16694d(owi.class)) {
            return;
        }
        try {
            sq8.m48649h(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                        if (declaredField != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField != null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
        }
    }

    /* renamed from: s */
    public static final void m42743s(View view, JSONObject jSONObject) {
        if (a94.m16694d(owi.class)) {
            return;
        }
        try {
            sq8.m48649h(view, "view");
            sq8.m48649h(jSONObject, "json");
            try {
                String strM42740k = m42740k(view);
                String strM42738i = m42738i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m42734c(view));
                jSONObject.put(OutcomeConstants.OUTCOME_ID, view.getId());
                if (cef.m21087g(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", cri.m21665k(cri.G0(strM42740k), ""));
                }
                jSONObject.put("hint", cri.m21665k(cri.G0(strM42738i), ""));
                if (tag != null) {
                    jSONObject.put("tag", cri.m21665k(cri.G0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put(MediaTrack.ROLE_DESCRIPTION, cri.m21665k(cri.G0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", f39014a.m42744e(view));
            } catch (JSONException e) {
                cri.j0(f39015b, e);
            }
        } catch (Throwable th) {
            a94.m16692b(th, owi.class);
        }
    }

    /* renamed from: e */
    public final JSONObject m42744e(View view) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final Class m42745f(String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: l */
    public final View m42746l(float[] fArr, View view) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            m42748n();
            Method method = f39017d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    sq8.m48647f(objInvoke, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        sq8.m48647f(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } catch (IllegalAccessException e) {
                    cri.j0(f39015b, e);
                } catch (InvocationTargetException e2) {
                    cri.j0(f39015b, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: m */
    public final float[] m42747m(View view) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r2[0], r2[1]};
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: n */
    public final void m42748n() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f39017d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f39017d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                cri.j0(f39015b, e);
            } catch (NoSuchMethodException e2) {
                cri.j0(f39015b, e2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: p */
    public final boolean m42749p(View view, View view2) {
        View viewM42746l;
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            sq8.m48649h(view, "view");
            if (!sq8.m48644c(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (viewM42746l = m42746l(m42747m(view), view2)) == null) {
                return false;
            }
            return viewM42746l.getId() == view.getId();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m42750q(View view) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return sq8.m48644c(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
