package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* loaded from: classes2.dex */
public abstract class zt4 {

    /* renamed from: a */
    public static xt4 f57668a = new DataBinderMapperImpl();

    /* renamed from: a */
    public static ewi m59867a(View view) {
        return m59868b(view, null);
    }

    /* renamed from: b */
    public static ewi m59868b(View view, yt4 yt4Var) {
        ewi ewiVarM59872f = m59872f(view);
        if (ewiVarM59872f != null) {
            return ewiVarM59872f;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int iMo6d = f57668a.mo6d((String) tag);
        if (iMo6d != 0) {
            return f57668a.mo4b(yt4Var, view, iMo6d);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    /* renamed from: c */
    public static ewi m59869c(yt4 yt4Var, View view, int i) {
        return f57668a.mo4b(yt4Var, view, i);
    }

    /* renamed from: d */
    public static ewi m59870d(yt4 yt4Var, View[] viewArr, int i) {
        return f57668a.mo5c(yt4Var, viewArr, i);
    }

    /* renamed from: e */
    public static ewi m59871e(yt4 yt4Var, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m59869c(yt4Var, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return m59870d(yt4Var, viewArr, i2);
    }

    /* renamed from: f */
    public static ewi m59872f(View view) {
        return ewi.m25686x(view);
    }

    /* renamed from: g */
    public static yt4 m59873g() {
        return null;
    }

    /* renamed from: h */
    public static ewi m59874h(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return m59875i(layoutInflater, i, viewGroup, z, null);
    }

    /* renamed from: i */
    public static ewi m59875i(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, yt4 yt4Var) {
        boolean z2 = viewGroup != null && z;
        return z2 ? m59871e(yt4Var, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : m59869c(yt4Var, layoutInflater.inflate(i, viewGroup, z), i);
    }
}
