package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import p001o.anh;
import p001o.b7e;
import p001o.bbe;
import p001o.brf;
import p001o.cc;
import p001o.g9e;
import p001o.kn;
import p001o.of7;
import p001o.r8e;
import p001o.wm;
import p001o.wvi;
import p001o.y9e;

/* loaded from: classes2.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: H */
    public ListPopupWindow f5758H;

    /* renamed from: L */
    public PopupWindow.OnDismissListener f5759L;

    /* renamed from: M */
    public boolean f5760M;

    /* renamed from: Q */
    public int f5761Q;

    /* renamed from: a */
    public final C1823f f5762a;

    /* renamed from: b */
    public final ViewOnClickListenerC1824g f5763b;

    /* renamed from: c */
    public final View f5764c;

    /* renamed from: d */
    public final Drawable f5765d;

    /* renamed from: e */
    public final FrameLayout f5766e;

    /* renamed from: f */
    public final ImageView f5767f;

    /* renamed from: g */
    public final FrameLayout f5768g;

    /* renamed from: h */
    public final ImageView f5769h;
    public boolean h0;
    public int i0;

    /* renamed from: q */
    public final int f5770q;

    /* renamed from: s */
    public wm f5771s;

    /* renamed from: x */
    public final DataSetObserver f5772x;

    /* renamed from: y */
    public final ViewTreeObserver.OnGlobalLayoutListener f5773y;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f5774a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            anh anhVarM17524u = anh.m17524u(context, attributeSet, f5774a);
            setBackgroundDrawable(anhVarM17524u.m17532g(0));
            anhVarM17524u.m17546x();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C1818a extends DataSetObserver {
        public C1818a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f5762a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f5762a.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC1819b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1819b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (ActivityChooserView.this.m4189b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                wm wmVar = ActivityChooserView.this.f5771s;
                if (wmVar != null) {
                    wmVar.m54702m(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C1820c extends View.AccessibilityDelegate {
        public C1820c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            cc.d1(accessibilityNodeInfo).l0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C1821d extends of7 {
        public C1821d(View view) {
            super(view);
        }

        @Override // p001o.of7
        /* renamed from: b */
        public brf mo3953b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // p001o.of7
        /* renamed from: c */
        public boolean mo3954c() {
            ActivityChooserView.this.m4190c();
            return true;
        }

        @Override // p001o.of7
        /* renamed from: d */
        public boolean mo4170d() {
            ActivityChooserView.this.m4188a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C1822e extends DataSetObserver {
        public C1822e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m4192e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C1823f extends BaseAdapter {

        /* renamed from: a */
        public int f5780a = 4;

        /* renamed from: b */
        public boolean f5781b;

        /* renamed from: c */
        public boolean f5782c;

        /* renamed from: d */
        public boolean f5783d;

        public C1823f() {
        }

        /* renamed from: a */
        public int m4193a() {
            throw null;
        }

        /* renamed from: b */
        public kn m4194b() {
            return null;
        }

        /* renamed from: c */
        public ResolveInfo m4195c() {
            throw null;
        }

        /* renamed from: d */
        public int m4196d() {
            throw null;
        }

        /* renamed from: e */
        public boolean m4197e() {
            return this.f5781b;
        }

        /* renamed from: f */
        public void m4198f(kn knVar) {
            ActivityChooserView.this.f5762a.m4194b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (this.f5781b) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f5783d && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(g9e.abc_activity_chooser_view_list_item, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(r8e.title)).setText(ActivityChooserView.this.getContext().getString(y9e.abc_activity_chooser_view_see_all));
                return viewInflate;
            }
            if (view == null || view.getId() != r8e.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(g9e.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(r8e.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(r8e.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f5781b && i == 0 && this.f5782c) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class ViewOnClickListenerC1824g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC1824g() {
        }

        /* renamed from: a */
        public final void m4199a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f5759L;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f5768g) {
                activityChooserView.m4188a();
                ActivityChooserView.this.f5762a.m4195c();
                ActivityChooserView.this.f5762a.m4194b();
                throw null;
            }
            if (view != activityChooserView.f5766e) {
                throw new IllegalArgumentException();
            }
            activityChooserView.f5760M = false;
            activityChooserView.m4191d(activityChooserView.f5761Q);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m4199a();
            wm wmVar = ActivityChooserView.this.f5771s;
            if (wmVar != null) {
                wmVar.m54702m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            int itemViewType = ((C1823f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m4191d(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            ActivityChooserView.this.m4188a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.f5760M) {
                activityChooserView.f5762a.m4197e();
                ActivityChooserView.this.f5762a.m4194b();
                throw null;
            }
            if (i <= 0) {
                return;
            }
            activityChooserView.f5762a.m4194b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f5768g) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f5762a.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f5760M = true;
                activityChooserView2.m4191d(activityChooserView2.f5761Q);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public boolean m4188a() {
        if (!m4189b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f5773y);
        return true;
    }

    /* renamed from: b */
    public boolean m4189b() {
        return getListPopupWindow().mo3986a();
    }

    /* renamed from: c */
    public boolean m4190c() {
        if (m4189b() || !this.h0) {
            return false;
        }
        this.f5760M = false;
        m4191d(this.f5761Q);
        return true;
    }

    /* renamed from: d */
    public void m4191d(int i) {
        this.f5762a.m4194b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    public void m4192e() {
        if (this.f5762a.getCount() > 0) {
            this.f5766e.setEnabled(true);
        } else {
            this.f5766e.setEnabled(false);
        }
        int iM4193a = this.f5762a.m4193a();
        int iM4196d = this.f5762a.m4196d();
        if (iM4193a == 1 || (iM4193a > 1 && iM4196d > 0)) {
            this.f5768g.setVisibility(0);
            ResolveInfo resolveInfoM4195c = this.f5762a.m4195c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f5769h.setImageDrawable(resolveInfoM4195c.loadIcon(packageManager));
            if (this.i0 != 0) {
                this.f5768g.setContentDescription(getContext().getString(this.i0, resolveInfoM4195c.loadLabel(packageManager)));
            }
        } else {
            this.f5768g.setVisibility(8);
        }
        if (this.f5768g.getVisibility() == 0) {
            this.f5764c.setBackgroundDrawable(this.f5765d);
        } else {
            this.f5764c.setBackgroundDrawable(null);
        }
    }

    public kn getDataModel() {
        this.f5762a.m4194b();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f5758H == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f5758H = listPopupWindow;
            listPopupWindow.mo4230m(this.f5762a);
            this.f5758H.m4284C(this);
            this.f5758H.m4290I(true);
            this.f5758H.m4292K(this.f5763b);
            this.f5758H.m4291J(this.f5763b);
        }
        return this.f5758H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5762a.m4194b();
        this.h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5762a.m4194b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5773y);
        }
        if (m4189b()) {
            m4188a();
        }
        this.h0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5764c.layout(0, 0, i3 - i, i4 - i2);
        if (m4189b()) {
            return;
        }
        m4188a();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f5764c;
        if (this.f5768g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(kn knVar) {
        this.f5762a.m4198f(knVar);
        if (m4189b()) {
            m4188a();
            m4190c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.i0 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f5767f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f5767f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f5761Q = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f5759L = onDismissListener;
    }

    public void setProvider(wm wmVar) {
        this.f5771s = wmVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5772x = new C1818a();
        this.f5773y = new ViewTreeObserverOnGlobalLayoutListenerC1819b();
        this.f5761Q = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ActivityChooserView, i, 0);
        wvi.k0(this, context, bbe.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.f5761Q = typedArrayObtainStyledAttributes.getInt(bbe.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(bbe.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(g9e.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC1824g viewOnClickListenerC1824g = new ViewOnClickListenerC1824g();
        this.f5763b = viewOnClickListenerC1824g;
        View viewFindViewById = findViewById(r8e.activity_chooser_view_content);
        this.f5764c = viewFindViewById;
        this.f5765d = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(r8e.default_activity_button);
        this.f5768g = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC1824g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC1824g);
        this.f5769h = (ImageView) frameLayout.findViewById(r8e.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(r8e.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC1824g);
        frameLayout2.setAccessibilityDelegate(new C1820c());
        frameLayout2.setOnTouchListener(new C1821d(frameLayout2));
        this.f5766e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(r8e.image);
        this.f5767f = imageView;
        imageView.setImageDrawable(drawable);
        C1823f c1823f = new C1823f();
        this.f5762a = c1823f;
        c1823f.registerDataSetObserver(new C1822e());
        Resources resources = context.getResources();
        this.f5770q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b7e.abc_config_prefDialogWidth));
    }
}
