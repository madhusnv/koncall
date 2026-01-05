package p001o;

import ai.salesmax.model.FileData;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class vy8 extends ewi {
    public final MaterialButton n0;
    public final ShapeableImageView o0;
    public final MaterialCardView p0;
    public FileData q0;
    public Integer r0;
    public ck6 s0;

    public vy8(Object obj, View view, int i, MaterialButton materialButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = shapeableImageView;
        this.p0 = materialCardView;
    }

    public abstract void h0(FileData fileData);
}
