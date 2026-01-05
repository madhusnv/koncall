package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class oj7 extends ewi {
    public final ShapeableImageView n0;
    public final TextView o0;
    public final RecyclerView p0;
    public String q0;

    public oj7(Object obj, View view, int i, ShapeableImageView shapeableImageView, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = textView;
        this.p0 = recyclerView;
    }

    public static oj7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static oj7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (oj7) ewi.m25668F(layoutInflater, p9e.fragment_workspace_selector, viewGroup, z, obj);
    }
}
