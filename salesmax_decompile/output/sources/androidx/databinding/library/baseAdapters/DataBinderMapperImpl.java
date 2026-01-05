package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p001o.ewi;
import p001o.xt4;
import p001o.yt4;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends xt4 {

    /* renamed from: a */
    public static final SparseIntArray f7214a = new SparseIntArray(0);

    /* renamed from: androidx.databinding.library.baseAdapters.DataBinderMapperImpl$a */
    public static class C2051a {

        /* renamed from: a */
        public static final HashMap f7215a = new HashMap(0);
    }

    @Override // p001o.xt4
    /* renamed from: a */
    public List mo3a() {
        return new ArrayList(0);
    }

    @Override // p001o.xt4
    /* renamed from: b */
    public ewi mo4b(yt4 yt4Var, View view, int i) {
        if (f7214a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p001o.xt4
    /* renamed from: c */
    public ewi mo5c(yt4 yt4Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f7214a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p001o.xt4
    /* renamed from: d */
    public int mo6d(String str) {
        Integer num;
        if (str == null || (num = (Integer) C2051a.f7215a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
