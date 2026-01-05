package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class iof extends ewi {
    public final ShapeableImageView n0;
    public final RecyclerView o0;
    public final MaterialTextView p0;

    public iof(Object obj, View view, int i, ShapeableImageView shapeableImageView, RecyclerView recyclerView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = recyclerView;
        this.p0 = materialTextView;
    }

    public static iof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static iof i0(LayoutInflater layoutInflater, Object obj) {
        return (iof) ewi.m25668F(layoutInflater, p9e.sheet_leads_send_template, null, false, obj);
    }
}
