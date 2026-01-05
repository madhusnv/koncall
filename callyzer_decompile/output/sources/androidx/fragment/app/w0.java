package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import x6.AbstractC8310a;
import y6.AbstractC8565c;
import y6.C8564b;
import y6.EnumC8563a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final j1 f2742a;

    public w0(j1 j1Var) {
        this.f2742a = j1Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        s1 s1VarM1182g;
        boolean zEquals = s0.class.getName().equals(str);
        j1 j1Var = this.f2742a;
        if (zEquals) {
            return new s0(context, attributeSet, j1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8310a.f39858a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = j0.class.isAssignableFrom(b1.m1117b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    j0 j0VarM1157C = resourceId != -1 ? j1Var.m1157C(resourceId) : null;
                    if (j0VarM1157C == null && string != null) {
                        j0VarM1157C = j1Var.m1158D(string);
                    }
                    if (j0VarM1157C == null && id2 != -1) {
                        j0VarM1157C = j1Var.m1157C(id2);
                    }
                    if (j0VarM1157C == null) {
                        b1 b1VarM1161I = j1Var.m1161I();
                        context.getClassLoader();
                        j0VarM1157C = b1VarM1161I.m1119a(attributeValue);
                        j0VarM1157C.mFromLayout = true;
                        j0VarM1157C.mFragmentId = resourceId != 0 ? resourceId : id2;
                        j0VarM1157C.mContainerId = id2;
                        j0VarM1157C.mTag = string;
                        j0VarM1157C.mInLayout = true;
                        j0VarM1157C.mFragmentManager = j1Var;
                        u0 u0Var = j1Var.f2601w;
                        j0VarM1157C.mHost = u0Var;
                        j0VarM1157C.onInflate((Context) u0Var.f2708b, attributeSet, j0VarM1157C.mSavedFragmentState);
                        s1VarM1182g = j1Var.m1176a(j0VarM1157C);
                        if (j1.m1152K(2)) {
                            j0VarM1157C.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (j0VarM1157C.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        j0VarM1157C.mInLayout = true;
                        j0VarM1157C.mFragmentManager = j1Var;
                        u0 u0Var2 = j1Var.f2601w;
                        j0VarM1157C.mHost = u0Var2;
                        j0VarM1157C.onInflate((Context) u0Var2.f2708b, attributeSet, j0VarM1157C.mSavedFragmentState);
                        s1VarM1182g = j1Var.m1182g(j0VarM1157C);
                        if (j1.m1152K(2)) {
                            j0VarM1157C.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C8564b c8564b = AbstractC8565c.f41561a;
                    AbstractC8565c.m15832b(new FragmentTagUsageViolation(j0VarM1157C, "Attempting to use <fragment> tag to add fragment " + j0VarM1157C + " to container " + viewGroup));
                    AbstractC8565c.m15831a(j0VarM1157C).getClass();
                    EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
                    j0VarM1157C.mContainer = viewGroup;
                    s1VarM1182g.m1254i();
                    s1VarM1182g.m1253h();
                    View view2 = j0VarM1157C.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC5601a.m11238i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (j0VarM1157C.mView.getTag() == null) {
                        j0VarM1157C.mView.setTag(string);
                    }
                    j0VarM1157C.mView.addOnAttachStateChangeListener(new v0(this, s1VarM1182g));
                    return j0VarM1157C.mView;
                }
            }
        }
        return null;
    }
}
