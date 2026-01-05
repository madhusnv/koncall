package p001o;

import ai.salesmax.model.ContactNumberSummary;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class r49 extends ewi {
    public final CheckBox n0;
    public final Chip o0;
    public final MaterialCardView p0;
    public final MaterialTextView q0;
    public ContactNumberSummary r0;
    public Integer s0;
    public ck6 t0;

    public r49(Object obj, View view, int i, CheckBox checkBox, Chip chip, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = checkBox;
        this.o0 = chip;
        this.p0 = materialCardView;
        this.q0 = materialTextView;
    }
}
