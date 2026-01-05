package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.objectweb.asm.Opcodes;
import p001o.anh;
import p001o.b7e;
import p001o.bbe;
import p001o.ccg;
import p001o.g9e;
import p001o.jsh;
import p001o.pd4;
import p001o.pg3;
import p001o.r8e;
import p001o.wvi;
import p001o.y9e;
import p001o.yzi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements pg3 {
    public static final C1871o b1;
    public final CharSequence A0;
    public View.OnFocusChangeListener B0;
    public View.OnClickListener C0;
    public boolean D0;
    public boolean E0;
    public pd4 F0;
    public boolean G0;
    public CharSequence H0;
    public boolean I0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public CharSequence M0;
    public CharSequence N0;
    public boolean O0;
    public int P0;

    /* renamed from: Q */
    public final SearchAutoComplete f5941Q;
    public SearchableInfo Q0;
    public Bundle R0;
    public final Runnable S0;
    public Runnable T0;
    public final WeakHashMap U0;
    public final View.OnClickListener V0;
    public View.OnKeyListener W0;
    public final TextView.OnEditorActionListener X0;
    public final AdapterView.OnItemClickListener Y0;
    public final AdapterView.OnItemSelectedListener Z0;
    public TextWatcher a1;
    public final View h0;
    public final View i0;
    public final View j0;
    public final ImageView k0;
    public final ImageView l0;
    public final ImageView m0;
    public final ImageView n0;
    public final View o0;
    public C1872p p0;
    public Rect q0;
    public Rect r0;
    public int[] s0;
    public int[] t0;
    public final ImageView u0;
    public final Drawable v0;
    public final int w0;
    public final int x0;
    public final Intent y0;
    public final Intent z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1855a();

        /* renamed from: c */
        public boolean f5942c;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public class C1855a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f5942c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f5942c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5942c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e */
        public int f5943e;

        /* renamed from: f */
        public SearchView f5944f;

        /* renamed from: g */
        public boolean f5945g;

        /* renamed from: h */
        public final Runnable f5946h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC1856a implements Runnable {
            public RunnableC1856a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m4370d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return i < 600 ? (i < 640 || i2 < 480) ? Opcodes.IF_ICMPNE : Opcodes.CHECKCAST : Opcodes.CHECKCAST;
            }
            return 256;
        }

        /* renamed from: b */
        public void m4368b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.b1.m4376c(this);
                return;
            }
            C1867k.m4372b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: c */
        public boolean m4369c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: d */
        public void m4370d() {
            if (this.f5945g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f5945g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f5943e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5945g) {
                removeCallbacks(this.f5946h);
                post(this.f5946h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i, rect);
            this.f5944f.m4362Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5944f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.f5944f.hasFocus() && getVisibility() == 0) {
                this.f5945g = true;
                if (SearchView.m4338M(getContext())) {
                    m4368b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f5945g = false;
                removeCallbacks(this.f5946h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f5945g = true;
                    return;
                }
                this.f5945g = false;
                removeCallbacks(this.f5946h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f5944f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f5943e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, z5e.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f5946h = new RunnableC1856a();
            this.f5943e = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C1857a implements TextWatcher {
        public C1857a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m4361Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC1858b implements Runnable {
        public RunnableC1858b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.e0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC1859c implements Runnable {
        public RunnableC1859c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pd4 pd4Var = SearchView.this.F0;
            if (pd4Var instanceof ccg) {
                pd4Var.mo20857a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC1860d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC1860d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.B0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC1861e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC1861e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m4339B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC1862f implements View.OnClickListener {
        public ViewOnClickListenerC1862f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.k0) {
                searchView.m4358V();
                return;
            }
            if (view == searchView.m0) {
                searchView.m4354R();
                return;
            }
            if (view == searchView.l0) {
                searchView.m4359W();
            } else if (view == searchView.n0) {
                searchView.a0();
            } else if (view == searchView.f5941Q) {
                searchView.m4345H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC1863g implements View.OnKeyListener {
        public ViewOnKeyListenerC1863g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.Q0 == null) {
                return false;
            }
            if (searchView.f5941Q.isPopupShowing() && SearchView.this.f5941Q.getListSelection() != -1) {
                return SearchView.this.m4360X(view, i, keyEvent);
            }
            if (SearchView.this.f5941Q.m4369c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m4352P(0, null, searchView2.f5941Q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C1864h implements TextView.OnEditorActionListener {
        public C1864h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m4359W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C1865i implements AdapterView.OnItemClickListener {
        public C1865i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.m4355S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C1866j implements AdapterView.OnItemSelectedListener {
        public C1866j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.m4356T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C1867k {
        /* renamed from: a */
        public static void m4371a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        public static void m4372b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC1868l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC1869m {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface InterfaceC1870n {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C1871o {

        /* renamed from: a */
        public Method f5958a;

        /* renamed from: b */
        public Method f5959b;

        /* renamed from: c */
        public Method f5960c;

        public C1871o() throws NoSuchMethodException, SecurityException {
            this.f5958a = null;
            this.f5959b = null;
            this.f5960c = null;
            m4373d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f5958a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f5959b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f5960c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m4373d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void m4374a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m4373d();
            Method method = this.f5959b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void m4375b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m4373d();
            Method method = this.f5958a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void m4376c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m4373d();
            Method method = this.f5960c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C1872p extends TouchDelegate {

        /* renamed from: a */
        public final View f5961a;

        /* renamed from: b */
        public final Rect f5962b;

        /* renamed from: c */
        public final Rect f5963c;

        /* renamed from: d */
        public final Rect f5964d;

        /* renamed from: e */
        public final int f5965e;

        /* renamed from: f */
        public boolean f5966f;

        public C1872p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5965e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f5962b = new Rect();
            this.f5964d = new Rect();
            this.f5963c = new Rect();
            m4377a(rect, rect2);
            this.f5961a = view;
        }

        /* renamed from: a */
        public void m4377a(Rect rect, Rect rect2) {
            this.f5962b.set(rect);
            this.f5964d.set(rect);
            Rect rect3 = this.f5964d;
            int i = this.f5965e;
            rect3.inset(-i, -i);
            this.f5963c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f5966f;
                    if (z2 && !this.f5964d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f5966f;
                        this.f5966f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f5962b.contains(x, y)) {
                this.f5966f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f5963c.contains(x, y)) {
                Rect rect = this.f5963c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f5961a.getWidth() / 2, this.f5961a.getHeight() / 2);
            }
            return this.f5961a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        b1 = Build.VERSION.SDK_INT < 29 ? new C1871o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: M */
    public static boolean m4338M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(b7e.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(b7e.abc_search_view_preferred_width);
    }

    /* renamed from: B */
    public void m4339B() {
        if (this.o0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.i0.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM58585b = yzi.m58585b(this);
            int dimensionPixelSize = this.D0 ? resources.getDimensionPixelSize(b7e.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(b7e.abc_dropdownitem_text_padding_left) : 0;
            this.f5941Q.getDropDownBackground().getPadding(rect);
            this.f5941Q.setDropDownHorizontalOffset(zM58585b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f5941Q.setDropDownWidth((((this.o0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: C */
    public final Intent m4340C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.N0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.R0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.Q0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    public final Intent m4341D(Cursor cursor, int i, String str) {
        int position;
        String strM20853o;
        try {
            try {
                String strM20853o2 = ccg.m20853o(cursor, "suggest_intent_action");
                if (strM20853o2 == null) {
                    strM20853o2 = this.Q0.getSuggestIntentAction();
                }
                if (strM20853o2 == null) {
                    strM20853o2 = "android.intent.action.SEARCH";
                }
                String str2 = strM20853o2;
                String strM20853o3 = ccg.m20853o(cursor, "suggest_intent_data");
                if (strM20853o3 == null) {
                    strM20853o3 = this.Q0.getSuggestIntentData();
                }
                if (strM20853o3 != null && (strM20853o = ccg.m20853o(cursor, "suggest_intent_data_id")) != null) {
                    strM20853o3 = strM20853o3 + "/" + Uri.encode(strM20853o);
                }
                return m4340C(str2, strM20853o3 == null ? null : Uri.parse(strM20853o3), ccg.m20853o(cursor, "suggest_intent_extra_data"), ccg.m20853o(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                position = -1;
                StringBuilder sb = new StringBuilder();
                sb.append("Search suggestions cursor at row ");
                sb.append(position);
                sb.append(" returned exception.");
                return null;
            }
        } catch (RuntimeException unused2) {
            position = cursor.getPosition();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(position);
            sb2.append(" returned exception.");
            return null;
        }
    }

    /* renamed from: E */
    public final Intent m4342E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.R0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    public final Intent m4343F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    public final void m4344G() {
        this.f5941Q.dismissDropDown();
    }

    /* renamed from: H */
    public void m4345H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            C1867k.m4371a(this.f5941Q);
            return;
        }
        C1871o c1871o = b1;
        c1871o.m4375b(this.f5941Q);
        c1871o.m4374a(this.f5941Q);
    }

    /* renamed from: I */
    public final void m4346I(View view, Rect rect) {
        view.getLocationInWindow(this.s0);
        getLocationInWindow(this.t0);
        int[] iArr = this.s0;
        int i = iArr[1];
        int[] iArr2 = this.t0;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    public final CharSequence m4347J(CharSequence charSequence) {
        if (!this.D0 || this.v0 == null) {
            return charSequence;
        }
        int textSize = (int) (this.f5941Q.getTextSize() * 1.25d);
        this.v0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.v0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    public final boolean m4348K() {
        SearchableInfo searchableInfo = this.Q0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.Q0.getVoiceSearchLaunchWebSearch() ? this.y0 : this.Q0.getVoiceSearchLaunchRecognizer() ? this.z0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: L */
    public boolean m4349L() {
        return this.E0;
    }

    /* renamed from: N */
    public final boolean m4350N() {
        return (this.G0 || this.L0) && !m4349L();
    }

    /* renamed from: O */
    public final void m4351O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(intent);
        }
    }

    /* renamed from: P */
    public void m4352P(int i, String str, String str2) {
        getContext().startActivity(m4340C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: Q */
    public final boolean m4353Q(int i, int i2, String str) {
        Cursor cursorMo43414d = this.F0.mo43414d();
        if (cursorMo43414d == null || !cursorMo43414d.moveToPosition(i)) {
            return false;
        }
        m4351O(m4341D(cursorMo43414d, i2, str));
        return true;
    }

    /* renamed from: R */
    public void m4354R() {
        if (!TextUtils.isEmpty(this.f5941Q.getText())) {
            this.f5941Q.setText("");
            this.f5941Q.requestFocus();
            this.f5941Q.setImeVisibility(true);
        } else if (this.D0) {
            clearFocus();
            j0(true);
        }
    }

    /* renamed from: S */
    public boolean m4355S(int i, int i2, String str) {
        m4353Q(i, 0, null);
        this.f5941Q.setImeVisibility(false);
        m4344G();
        return true;
    }

    /* renamed from: T */
    public boolean m4356T(int i) {
        c0(i);
        return true;
    }

    /* renamed from: U */
    public void m4357U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    public void m4358V() {
        j0(false);
        this.f5941Q.requestFocus();
        this.f5941Q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.C0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    public void m4359W() {
        Editable text = this.f5941Q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.Q0 != null) {
            m4352P(0, null, text.toString());
        }
        this.f5941Q.setImeVisibility(false);
        m4344G();
    }

    /* renamed from: X */
    public boolean m4360X(View view, int i, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.Q0 != null && this.F0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m4355S(this.f5941Q.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f5941Q.setSelection(i == 21 ? 0 : this.f5941Q.length());
                this.f5941Q.setListSelection(0);
                this.f5941Q.clearListSelection();
                this.f5941Q.m4368b();
                return true;
            }
            if (i == 19) {
                this.f5941Q.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public void m4361Y(CharSequence charSequence) {
        Editable text = this.f5941Q.getText();
        this.N0 = text;
        boolean z = !TextUtils.isEmpty(text);
        i0(z);
        k0(!z);
        d0();
        h0();
        this.M0 = charSequence.toString();
    }

    /* renamed from: Z */
    public void m4362Z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j0(m4349L());
        b0();
        if (this.f5941Q.hasFocus()) {
            m4345H();
        }
    }

    public void a0() {
        SearchableInfo searchableInfo = this.Q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m4343F(this.y0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m4342E(this.z0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // p001o.pg3
    /* renamed from: b */
    public void mo4363b() {
        if (this.O0) {
            return;
        }
        this.O0 = true;
        int imeOptions = this.f5941Q.getImeOptions();
        this.P0 = imeOptions;
        this.f5941Q.setImeOptions(imeOptions | MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
        this.f5941Q.setText("");
        setIconified(false);
    }

    public final void b0() {
        post(this.S0);
    }

    public final void c0(int i) {
        Editable text = this.f5941Q.getText();
        Cursor cursorMo43414d = this.F0.mo43414d();
        if (cursorMo43414d == null) {
            return;
        }
        if (!cursorMo43414d.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceMo20858b = this.F0.mo20858b(cursorMo43414d);
        if (charSequenceMo20858b != null) {
            setQuery(charSequenceMo20858b);
        } else {
            setQuery(text);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.J0 = true;
        super.clearFocus();
        this.f5941Q.clearFocus();
        this.f5941Q.setImeVisibility(false);
        this.J0 = false;
    }

    public final void d0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f5941Q.getText());
        if (!z2 && (!this.D0 || this.O0)) {
            z = false;
        }
        this.m0.setVisibility(z ? 0 : 8);
        Drawable drawable = this.m0.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void e0() {
        int[] iArr = this.f5941Q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.i0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.j0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // p001o.pg3
    /* renamed from: f */
    public void mo4364f() {
        setQuery("", false);
        clearFocus();
        j0(true);
        this.f5941Q.setImeOptions(this.P0);
        this.O0 = false;
    }

    public final void f0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5941Q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m4347J(queryHint));
    }

    public final void g0() {
        this.f5941Q.setThreshold(this.Q0.getSuggestThreshold());
        this.f5941Q.setImeOptions(this.Q0.getImeOptions());
        int inputType = this.Q0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.Q0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | Opcodes.ASM8;
            }
        }
        this.f5941Q.setInputType(inputType);
        pd4 pd4Var = this.F0;
        if (pd4Var != null) {
            pd4Var.mo20857a(null);
        }
        if (this.Q0.getSuggestAuthority() != null) {
            ccg ccgVar = new ccg(getContext(), this, this.Q0, this.U0);
            this.F0 = ccgVar;
            this.f5941Q.setAdapter(ccgVar);
            ((ccg) this.F0).m20873x(this.I0 ? 2 : 1);
        }
    }

    public int getImeOptions() {
        return this.f5941Q.getImeOptions();
    }

    public int getInputType() {
        return this.f5941Q.getInputType();
    }

    public int getMaxWidth() {
        return this.K0;
    }

    public CharSequence getQuery() {
        return this.f5941Q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.H0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.Q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.A0 : getContext().getText(this.Q0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.x0;
    }

    public int getSuggestionRowLayout() {
        return this.w0;
    }

    public pd4 getSuggestionsAdapter() {
        return this.F0;
    }

    public final void h0() {
        this.j0.setVisibility((m4350N() && (this.l0.getVisibility() == 0 || this.n0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void i0(boolean z) {
        this.l0.setVisibility((this.G0 && m4350N() && hasFocus() && (z || !this.L0)) ? 0 : 8);
    }

    public final void j0(boolean z) {
        this.E0 = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f5941Q.getText());
        this.k0.setVisibility(i);
        i0(z2);
        this.h0.setVisibility(z ? 8 : 0);
        this.u0.setVisibility((this.u0.getDrawable() == null || this.D0) ? 8 : 0);
        d0();
        k0(!z2);
        h0();
    }

    public final void k0(boolean z) {
        int i = 8;
        if (this.L0 && !m4349L() && z) {
            this.l0.setVisibility(8);
            i = 0;
        }
        this.n0.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.S0);
        post(this.T0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4346I(this.f5941Q, this.q0);
            Rect rect = this.r0;
            Rect rect2 = this.q0;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C1872p c1872p = this.p0;
            if (c1872p != null) {
                c1872p.m4377a(this.r0, this.q0);
                return;
            }
            C1872p c1872p2 = new C1872p(this.r0, this.q0, this.f5941Q);
            this.p0 = c1872p2;
            setTouchDelegate(c1872p2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m4349L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.K0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.K0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.K0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        j0(savedState.f5942c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5942c = m4349L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.J0 || !isFocusable()) {
            return false;
        }
        if (m4349L()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f5941Q.requestFocus(i, rect);
        if (zRequestFocus) {
            j0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.R0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m4354R();
        } else {
            m4358V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.D0 == z) {
            return;
        }
        this.D0 = z;
        j0(z);
        f0();
    }

    public void setImeOptions(int i) {
        this.f5941Q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f5941Q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.K0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC1868l interfaceC1868l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.B0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC1869m interfaceC1869m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.C0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC1870n interfaceC1870n) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f5941Q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f5941Q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.N0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m4359W();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.H0 = charSequence;
        f0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.I0 = z;
        pd4 pd4Var = this.F0;
        if (pd4Var instanceof ccg) {
            ((ccg) pd4Var).m20873x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.Q0 = searchableInfo;
        if (searchableInfo != null) {
            g0();
            f0();
        }
        boolean zM4348K = m4348K();
        this.L0 = zM4348K;
        if (zM4348K) {
            this.f5941Q.setPrivateImeOptions("nm");
        }
        j0(m4349L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.G0 = z;
        j0(m4349L());
    }

    public void setSuggestionsAdapter(pd4 pd4Var) {
        this.F0 = pd4Var;
        this.f5941Q.setAdapter(pd4Var);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q0 = new Rect();
        this.r0 = new Rect();
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.S0 = new RunnableC1858b();
        this.T0 = new RunnableC1859c();
        this.U0 = new WeakHashMap();
        ViewOnClickListenerC1862f viewOnClickListenerC1862f = new ViewOnClickListenerC1862f();
        this.V0 = viewOnClickListenerC1862f;
        this.W0 = new ViewOnKeyListenerC1863g();
        C1864h c1864h = new C1864h();
        this.X0 = c1864h;
        C1865i c1865i = new C1865i();
        this.Y0 = c1865i;
        C1866j c1866j = new C1866j();
        this.Z0 = c1866j;
        this.a1 = new C1857a();
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.SearchView, i, 0);
        wvi.k0(this, context, bbe.SearchView, attributeSet, anhVarM17525v.m17543r(), i, 0);
        LayoutInflater.from(context).inflate(anhVarM17525v.m17539n(bbe.SearchView_layout, g9e.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(r8e.search_src_text);
        this.f5941Q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.h0 = findViewById(r8e.search_edit_frame);
        View viewFindViewById = findViewById(r8e.search_plate);
        this.i0 = viewFindViewById;
        View viewFindViewById2 = findViewById(r8e.submit_area);
        this.j0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(r8e.search_button);
        this.k0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(r8e.search_go_btn);
        this.l0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(r8e.search_close_btn);
        this.m0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(r8e.search_voice_btn);
        this.n0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(r8e.search_mag_icon);
        this.u0 = imageView5;
        wvi.p0(viewFindViewById, anhVarM17525v.m17532g(bbe.SearchView_queryBackground));
        wvi.p0(viewFindViewById2, anhVarM17525v.m17532g(bbe.SearchView_submitBackground));
        imageView.setImageDrawable(anhVarM17525v.m17532g(bbe.SearchView_searchIcon));
        imageView2.setImageDrawable(anhVarM17525v.m17532g(bbe.SearchView_goIcon));
        imageView3.setImageDrawable(anhVarM17525v.m17532g(bbe.SearchView_closeIcon));
        imageView4.setImageDrawable(anhVarM17525v.m17532g(bbe.SearchView_voiceIcon));
        imageView5.setImageDrawable(anhVarM17525v.m17532g(bbe.SearchView_searchIcon));
        this.v0 = anhVarM17525v.m17532g(bbe.SearchView_searchHintIcon);
        jsh.m34483a(imageView, getResources().getString(y9e.abc_searchview_description_search));
        this.w0 = anhVarM17525v.m17539n(bbe.SearchView_suggestionRowLayout, g9e.abc_search_dropdown_item_icons_2line);
        this.x0 = anhVarM17525v.m17539n(bbe.SearchView_commitIcon, 0);
        imageView.setOnClickListener(viewOnClickListenerC1862f);
        imageView3.setOnClickListener(viewOnClickListenerC1862f);
        imageView2.setOnClickListener(viewOnClickListenerC1862f);
        imageView4.setOnClickListener(viewOnClickListenerC1862f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC1862f);
        searchAutoComplete.addTextChangedListener(this.a1);
        searchAutoComplete.setOnEditorActionListener(c1864h);
        searchAutoComplete.setOnItemClickListener(c1865i);
        searchAutoComplete.setOnItemSelectedListener(c1866j);
        searchAutoComplete.setOnKeyListener(this.W0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1860d());
        setIconifiedByDefault(anhVarM17525v.m17526a(bbe.SearchView_iconifiedByDefault, true));
        int iM17531f = anhVarM17525v.m17531f(bbe.SearchView_android_maxWidth, -1);
        if (iM17531f != -1) {
            setMaxWidth(iM17531f);
        }
        this.A0 = anhVarM17525v.m17541p(bbe.SearchView_defaultQueryHint);
        this.H0 = anhVarM17525v.m17541p(bbe.SearchView_queryHint);
        int iM17536k = anhVarM17525v.m17536k(bbe.SearchView_android_imeOptions, -1);
        if (iM17536k != -1) {
            setImeOptions(iM17536k);
        }
        int iM17536k2 = anhVarM17525v.m17536k(bbe.SearchView_android_inputType, -1);
        if (iM17536k2 != -1) {
            setInputType(iM17536k2);
        }
        setFocusable(anhVarM17525v.m17526a(bbe.SearchView_android_focusable, true));
        anhVarM17525v.m17546x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.y0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.z0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.o0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1861e());
        }
        j0(this.D0);
        f0();
    }

    private void setQuery(CharSequence charSequence) {
        this.f5941Q.setText(charSequence);
        this.f5941Q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
