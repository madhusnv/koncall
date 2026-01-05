package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import p001o.tq;

@Deprecated
/* loaded from: classes2.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    public final ArrayList f7485a;

    /* renamed from: b */
    public FrameLayout f7486b;

    /* renamed from: c */
    public Context f7487c;

    /* renamed from: d */
    public FragmentManager f7488d;

    /* renamed from: e */
    public int f7489e;

    /* renamed from: f */
    public TabHost.OnTabChangeListener f7490f;

    /* renamed from: g */
    public boolean f7491g;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2113a();

        /* renamed from: a */
        public String f7492a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C2113a implements Parcelable.Creator {
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

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f7492a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f7492a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7492a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C2114a {
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f7485a = new ArrayList();
        m6249e(context, null);
    }

    /* renamed from: a */
    public final AbstractC2124j m6245a(String str, AbstractC2124j abstractC2124j) {
        m6248d(str);
        return abstractC2124j;
    }

    /* renamed from: b */
    public final void m6246b() {
        if (this.f7486b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f7489e);
            this.f7486b = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f7489e);
        }
    }

    /* renamed from: c */
    public final void m6247c(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f7486b = frameLayout2;
            frameLayout2.setId(this.f7489e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final C2114a m6248d(String str) {
        if (this.f7485a.size() <= 0) {
            return null;
        }
        tq.m50332a(this.f7485a.get(0));
        throw null;
    }

    /* renamed from: e */
    public final void m6249e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f7489e = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f7485a.size() > 0) {
            tq.m50332a(this.f7485a.get(0));
            throw null;
        }
        this.f7491g = true;
        AbstractC2124j abstractC2124jM6245a = m6245a(currentTabTag, null);
        if (abstractC2124jM6245a != null) {
            abstractC2124jM6245a.mo6260h();
            this.f7488d.h0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7491g = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f7492a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7492a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        AbstractC2124j abstractC2124jM6245a;
        if (this.f7491g && (abstractC2124jM6245a = m6245a(str, null)) != null) {
            abstractC2124jM6245a.mo6260h();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f7490f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f7490f = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        m6247c(context);
        super.setup();
        this.f7487c = context;
        this.f7488d = fragmentManager;
        m6246b();
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7485a = new ArrayList();
        m6249e(context, attributeSet);
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        m6247c(context);
        super.setup();
        this.f7487c = context;
        this.f7488d = fragmentManager;
        this.f7489e = i;
        m6246b();
        this.f7486b.setId(i);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }
}
