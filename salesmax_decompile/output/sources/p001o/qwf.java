package p001o;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C2406l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class qwf extends LinearLayoutManager {

    /* renamed from: o.qwf$a */
    public class C16483a extends C2406l {
        public C16483a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: v */
        public float mo9613v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public qwf(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void V1(RecyclerView recyclerView, RecyclerView.C2389z c2389z, int i) {
        C16483a c16483a = new C16483a(recyclerView.getContext());
        c16483a.m9335p(i);
        W1(c16483a);
    }
}
