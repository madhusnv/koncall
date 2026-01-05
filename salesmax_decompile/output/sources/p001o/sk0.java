package p001o;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class sk0 {

    /* renamed from: b */
    public static final Class[] f45497b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f45498c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f45499d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f45500e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f45501f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f45502g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final ktf f45503h = new ktf();

    /* renamed from: a */
    public final Object[] f45504a = new Object[2];

    /* renamed from: o.sk0$a */
    public static class ViewOnClickListenerC16852a implements View.OnClickListener {

        /* renamed from: a */
        public final View f45505a;

        /* renamed from: b */
        public final String f45506b;

        /* renamed from: c */
        public Method f45507c;

        /* renamed from: d */
        public Context f45508d;

        public ViewOnClickListenerC16852a(View view, String str) {
            this.f45505a = view;
            this.f45506b = str;
        }

        /* renamed from: a */
        public final void m48417a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f45506b, View.class)) != null) {
                        this.f45507c = method;
                        this.f45508d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f45505a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f45505a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f45506b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f45505a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f45507c == null) {
                m48417a(this.f45505a.getContext());
            }
            try {
                this.f45507c.invoke(this.f45508d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m48400u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(bbe.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(bbe.View_theme, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof i64) && ((i64) context).m31610c() == resourceId) ? context : new i64(context, resourceId) : context;
    }

    /* renamed from: a */
    public final void m48401a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45499d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            wvi.n0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f45500e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            wvi.o0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f45501f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            wvi.z0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    public final void m48402b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f45498c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new ViewOnClickListenerC16852a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo15451c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatButton mo15452d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: e */
    public AppCompatCheckBox mo15453e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: f */
    public AppCompatCheckedTextView m48403f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* renamed from: g */
    public AppCompatEditText m48404g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: h */
    public AppCompatImageButton m48405h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: i */
    public AppCompatImageView m48406i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: j */
    public AppCompatMultiAutoCompleteTextView m48407j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: k */
    public AppCompatRadioButton mo15454k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: l */
    public AppCompatRatingBar m48408l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: m */
    public AppCompatSeekBar m48409m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: n */
    public AppCompatSpinner m48410n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: o */
    public AppCompatTextView mo15455o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: p */
    public AppCompatToggleButton m48411p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: q */
    public View m48412q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: r */
    public final View m48413r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewM48408l;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m48400u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = xmh.m56486b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                viewM48408l = m48408l(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 1:
                viewM48408l = m48403f(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 2:
                viewM48408l = m48407j(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 3:
                viewM48408l = mo15455o(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 4:
                viewM48408l = m48405h(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 5:
                viewM48408l = m48409m(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 6:
                viewM48408l = m48410n(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 7:
                viewM48408l = mo15454k(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case '\b':
                viewM48408l = m48411p(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case '\t':
                viewM48408l = m48406i(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case '\n':
                viewM48408l = mo15451c(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case 11:
                viewM48408l = mo15453e(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case '\f':
                viewM48408l = m48404g(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            case '\r':
                viewM48408l = mo15452d(context2, attributeSet);
                m48416v(viewM48408l, str);
                break;
            default:
                viewM48408l = m48412q(context2, str, attributeSet);
                break;
        }
        if (viewM48408l == null && context != context2) {
            viewM48408l = m48415t(context2, str, attributeSet);
        }
        if (viewM48408l != null) {
            m48402b(viewM48408l, attributeSet);
            m48401a(context2, viewM48408l, attributeSet);
        }
        return viewM48408l;
    }

    /* renamed from: s */
    public final View m48414s(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        ktf ktfVar = f45503h;
        Constructor constructor = (Constructor) ktfVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f45497b);
            ktfVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f45504a);
    }

    /* renamed from: t */
    public final View m48415t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f45504a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m48414s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f45502g;
                if (i >= strArr.length) {
                    return null;
                }
                View viewM48414s = m48414s(context, str, strArr[i]);
                if (viewM48414s != null) {
                    return viewM48414s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f45504a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: v */
    public final void m48416v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
