package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC1782a;
import java.lang.reflect.InvocationTargetException;
import p001o.anh;
import p001o.bbe;
import p001o.brf;
import p001o.dkh;
import p001o.g9e;
import p001o.i64;
import p001o.lk0;
import p001o.of7;
import p001o.oj0;
import p001o.s6c;
import p001o.yzi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: q */
    public static final int[] f5826q = {R.attr.spinnerMode};

    /* renamed from: a */
    public final oj0 f5827a;

    /* renamed from: b */
    public final Context f5828b;

    /* renamed from: c */
    public of7 f5829c;

    /* renamed from: d */
    public SpinnerAdapter f5830d;

    /* renamed from: e */
    public final boolean f5831e;

    /* renamed from: f */
    public InterfaceC1833g f5832f;

    /* renamed from: g */
    public int f5833g;

    /* renamed from: h */
    public final Rect f5834h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1826a();

        /* renamed from: a */
        public boolean f5835a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C1826a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f5835a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5835a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C1827a extends of7 {

        /* renamed from: s */
        public final /* synthetic */ C1832f f5836s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1827a(View view, C1832f c1832f) {
            super(view);
            this.f5836s = c1832f;
        }

        @Override // p001o.of7
        /* renamed from: b */
        public brf mo3953b() {
            return this.f5836s;
        }

        @Override // p001o.of7
        /* renamed from: c */
        public boolean mo3954c() {
            if (AppCompatSpinner.this.getInternalPopup().mo4219a()) {
                return true;
            }
            AppCompatSpinner.this.m4215b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC1828b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1828b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo4219a()) {
                AppCompatSpinner.this.m4215b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C1829c {
        /* renamed from: a */
        public static void m4218a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (s6c.m47909a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public class DialogInterfaceOnClickListenerC1830d implements InterfaceC1833g, DialogInterface.OnClickListener {

        /* renamed from: a */
        public DialogInterfaceC1782a f5839a;

        /* renamed from: b */
        public ListAdapter f5840b;

        /* renamed from: c */
        public CharSequence f5841c;

        public DialogInterfaceOnClickListenerC1830d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: a */
        public boolean mo4219a() {
            DialogInterfaceC1782a dialogInterfaceC1782a = this.f5839a;
            if (dialogInterfaceC1782a != null) {
                return dialogInterfaceC1782a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: b */
        public void mo4220b(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: c */
        public int mo4221c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        public void dismiss() {
            DialogInterfaceC1782a dialogInterfaceC1782a = this.f5839a;
            if (dialogInterfaceC1782a != null) {
                dialogInterfaceC1782a.dismiss();
                this.f5839a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: e */
        public void mo4222e(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: f */
        public CharSequence mo4223f() {
            return this.f5841c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: g */
        public Drawable mo4224g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: h */
        public void mo4225h(CharSequence charSequence) {
            this.f5841c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: i */
        public void mo4226i(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: j */
        public void mo4227j(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: k */
        public void mo4228k(int i, int i2) {
            if (this.f5840b == null) {
                return;
            }
            DialogInterfaceC1782a.a aVar = new DialogInterfaceC1782a.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f5841c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogInterfaceC1782a dialogInterfaceC1782aCreate = aVar.mo3879l(this.f5840b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f5839a = dialogInterfaceC1782aCreate;
            ListView listViewM3866g = dialogInterfaceC1782aCreate.m3866g();
            listViewM3866g.setTextDirection(i);
            listViewM3866g.setTextAlignment(i2);
            this.f5839a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: l */
        public int mo4229l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: m */
        public void mo4230m(ListAdapter listAdapter) {
            this.f5840b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f5840b.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public static class C1831e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f5843a;

        /* renamed from: b */
        public ListAdapter f5844b;

        public C1831e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f5843a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f5844b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            C1829c.m4218a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f5844b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f5844b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5843a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public class C1832f extends ListPopupWindow implements InterfaceC1833g {
        public CharSequence w0;
        public ListAdapter x0;
        public final Rect y0;
        public int z0;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f$a */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f5845a;

            public a(AppCompatSpinner appCompatSpinner) {
                this.f5845a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C1832f c1832f = C1832f.this;
                    AppCompatSpinner.this.performItemClick(view, i, c1832f.x0.getItemId(i));
                }
                C1832f.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                C1832f c1832f = C1832f.this;
                if (!c1832f.m4234U(AppCompatSpinner.this)) {
                    C1832f.this.dismiss();
                } else {
                    C1832f.this.m4232S();
                    C1832f.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5848a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f5848a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f5848a);
                }
            }
        }

        public C1832f(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.y0 = new Rect();
            m4284C(AppCompatSpinner.this);
            m4290I(true);
            m4296O(0);
            m4292K(new a(AppCompatSpinner.this));
        }

        /* renamed from: S */
        public void m4232S() {
            int i;
            Drawable drawableM4302g = m4302g();
            if (drawableM4302g != null) {
                drawableM4302g.getPadding(AppCompatSpinner.this.f5834h);
                i = yzi.m58585b(AppCompatSpinner.this) ? AppCompatSpinner.this.f5834h.right : -AppCompatSpinner.this.f5834h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f5834h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f5833g;
            if (i2 == -2) {
                int iM4214a = appCompatSpinner.m4214a((SpinnerAdapter) this.x0, m4302g());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f5834h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iM4214a > i4) {
                    iM4214a = i4;
                }
                m4286E(Math.max(iM4214a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m4286E((width - paddingLeft) - paddingRight);
            } else {
                m4286E(i2);
            }
            m4301e(yzi.m58585b(AppCompatSpinner.this) ? i + (((width - paddingRight) - m4314y()) - m4233T()) : i + paddingLeft + m4233T());
        }

        /* renamed from: T */
        public int m4233T() {
            return this.z0;
        }

        /* renamed from: U */
        public boolean m4234U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.y0);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: f */
        public CharSequence mo4223f() {
            return this.w0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: h */
        public void mo4225h(CharSequence charSequence) {
            this.w0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: j */
        public void mo4227j(int i) {
            this.z0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: k */
        public void mo4228k(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zMo3986a = mo3986a();
            m4232S();
            m4289H(2);
            super.show();
            ListView listViewMo3992o = mo3992o();
            listViewMo3992o.setChoiceMode(1);
            listViewMo3992o.setTextDirection(i);
            listViewMo3992o.setTextAlignment(i2);
            m4297P(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMo3986a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m4291J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC1833g
        /* renamed from: m */
        public void mo4230m(ListAdapter listAdapter) {
            super.mo4230m(listAdapter);
            this.x0 = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public interface InterfaceC1833g {
        /* renamed from: a */
        boolean mo4219a();

        /* renamed from: b */
        void mo4220b(Drawable drawable);

        /* renamed from: c */
        int mo4221c();

        void dismiss();

        /* renamed from: e */
        void mo4222e(int i);

        /* renamed from: f */
        CharSequence mo4223f();

        /* renamed from: g */
        Drawable mo4224g();

        /* renamed from: h */
        void mo4225h(CharSequence charSequence);

        /* renamed from: i */
        void mo4226i(int i);

        /* renamed from: j */
        void mo4227j(int i);

        /* renamed from: k */
        void mo4228k(int i, int i2);

        /* renamed from: l */
        int mo4229l();

        /* renamed from: m */
        void mo4230m(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public int m4214a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f5834h);
        Rect rect = this.f5834h;
        return iMax2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void m4215b() {
        this.f5832f.mo4228k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        return interfaceC1833g != null ? interfaceC1833g.mo4221c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        return interfaceC1833g != null ? interfaceC1833g.mo4229l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f5832f != null ? this.f5833g : super.getDropDownWidth();
    }

    public final InterfaceC1833g getInternalPopup() {
        return this.f5832f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        return interfaceC1833g != null ? interfaceC1833g.mo4224g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f5828b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        return interfaceC1833g != null ? interfaceC1833g.mo4223f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g == null || !interfaceC1833g.mo4219a()) {
            return;
        }
        this.f5832f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5832f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m4214a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f5835a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1828b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC1833g interfaceC1833g = this.f5832f;
        savedState.f5835a = interfaceC1833g != null && interfaceC1833g.mo4219a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        of7 of7Var = this.f5829c;
        if (of7Var == null || !of7Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g == null) {
            return super.performClick();
        }
        if (interfaceC1833g.mo4219a()) {
            return true;
        }
        m4215b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1833g.mo4227j(i);
            this.f5832f.mo4222e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g != null) {
            interfaceC1833g.mo4226i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f5832f != null) {
            this.f5833g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g != null) {
            interfaceC1833g.mo4220b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(lk0.m37353b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1833g interfaceC1833g = this.f5832f;
        if (interfaceC1833g != null) {
            interfaceC1833g.mo4225h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5827a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f5831e) {
            this.f5830d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f5832f != null) {
            Context context = this.f5828b;
            if (context == null) {
                context = getContext();
            }
            this.f5832f.mo4230m(new C1831e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM17542q;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f5834h = new Rect();
        dkh.m23377a(this, getContext());
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.Spinner, i, 0);
        this.f5827a = new oj0(this);
        if (theme != null) {
            this.f5828b = new i64(context, theme);
        } else {
            int iM17539n = anhVarM17525v.m17539n(bbe.Spinner_popupTheme, 0);
            if (iM17539n != 0) {
                this.f5828b = new i64(context, iM17539n);
            } else {
                this.f5828b = context;
            }
        }
        TypedArray typedArray = null;
        if (i2 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5826q, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i2 != 0) {
                    }
                    charSequenceArrM17542q = anhVarM17525v.m17542q(bbe.Spinner_android_entries);
                    if (charSequenceArrM17542q != null) {
                    }
                    anhVarM17525v.m17546x();
                    this.f5831e = true;
                    spinnerAdapter = this.f5830d;
                    if (spinnerAdapter != null) {
                    }
                    this.f5827a.m42286e(attributeSet, i);
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC1830d dialogInterfaceOnClickListenerC1830d = new DialogInterfaceOnClickListenerC1830d();
            this.f5832f = dialogInterfaceOnClickListenerC1830d;
            dialogInterfaceOnClickListenerC1830d.mo4225h(anhVarM17525v.m17540o(bbe.Spinner_android_prompt));
        } else if (i2 == 1) {
            C1832f c1832f = new C1832f(this.f5828b, attributeSet, i);
            anh anhVarM17525v2 = anh.m17525v(this.f5828b, attributeSet, bbe.Spinner, i, 0);
            this.f5833g = anhVarM17525v2.m17538m(bbe.Spinner_android_dropDownWidth, -2);
            c1832f.m4299b(anhVarM17525v2.m17532g(bbe.Spinner_android_popupBackground));
            c1832f.mo4225h(anhVarM17525v.m17540o(bbe.Spinner_android_prompt));
            anhVarM17525v2.m17546x();
            this.f5832f = c1832f;
            this.f5829c = new C1827a(this, c1832f);
        }
        charSequenceArrM17542q = anhVarM17525v.m17542q(bbe.Spinner_android_entries);
        if (charSequenceArrM17542q != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM17542q);
            arrayAdapter.setDropDownViewResource(g9e.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        anhVarM17525v.m17546x();
        this.f5831e = true;
        spinnerAdapter = this.f5830d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f5830d = null;
        }
        this.f5827a.m42286e(attributeSet, i);
    }
}
