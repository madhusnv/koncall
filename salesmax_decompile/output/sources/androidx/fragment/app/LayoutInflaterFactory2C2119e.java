package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p001o.hi7;
import p001o.qbe;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes2.dex */
public class LayoutInflaterFactory2C2119e implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final FragmentManager f7552a;

    /* renamed from: androidx.fragment.app.e$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C2122h f7553a;

        public a(C2122h c2122h) {
            this.f7553a = c2122h;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM6378k = this.f7553a.m6378k();
            this.f7553a.m6380m();
            AbstractC2126l.m6441u((ViewGroup) fragmentM6378k.mView.getParent(), LayoutInflaterFactory2C2119e.this.f7552a).m6458q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C2119e(FragmentManager fragmentManager) {
        this.f7552a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2122h c2122hM6213y;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f7552a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qbe.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(qbe.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(qbe.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(qbe.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC2118d.m6332b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentL0 = resourceId != -1 ? this.f7552a.l0(resourceId) : null;
        if (fragmentL0 == null && string != null) {
            fragmentL0 = this.f7552a.m0(string);
        }
        if (fragmentL0 == null && id != -1) {
            fragmentL0 = this.f7552a.l0(id);
        }
        if (fragmentL0 == null) {
            fragmentL0 = this.f7552a.z0().mo6226a(context.getClassLoader(), attributeValue);
            fragmentL0.mFromLayout = true;
            fragmentL0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentL0.mContainerId = id;
            fragmentL0.mTag = string;
            fragmentL0.mInLayout = true;
            FragmentManager fragmentManager = this.f7552a;
            fragmentL0.mFragmentManager = fragmentManager;
            fragmentL0.mHost = fragmentManager.C0();
            fragmentL0.onInflate(this.f7552a.C0().m18966f(), attributeSet, fragmentL0.mSavedFragmentState);
            c2122hM6213y = this.f7552a.m6198j(fragmentL0);
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentL0);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentL0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentL0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f7552a;
            fragmentL0.mFragmentManager = fragmentManager2;
            fragmentL0.mHost = fragmentManager2.C0();
            fragmentL0.onInflate(this.f7552a.C0().m18966f(), attributeSet, fragmentL0.mSavedFragmentState);
            c2122hM6213y = this.f7552a.m6213y(fragmentL0);
            if (FragmentManager.P0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragmentL0);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        hi7.m30613g(fragmentL0, viewGroup);
        fragmentL0.mContainer = viewGroup;
        c2122hM6213y.m6380m();
        c2122hM6213y.m6377j();
        View view2 = fragmentL0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentL0.mView.getTag() == null) {
            fragmentL0.mView.setTag(string);
        }
        fragmentL0.mView.addOnAttachStateChangeListener(new a(c2122hM6213y));
        return fragmentL0.mView;
    }
}
