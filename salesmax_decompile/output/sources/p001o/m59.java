package p001o;

import ai.salesmax.model.VisitOutcome;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class m59 extends ewi {
    public final AppCompatImageView n0;
    public final MaterialButton o0;
    public final MaterialCardView p0;
    public final Chip q0;
    public final MaterialTextView r0;
    public final MaterialTextView s0;
    public VisitOutcome t0;
    public Integer u0;
    public ck6 v0;
    public rog w0;

    public m59(Object obj, View view, int i, AppCompatImageView appCompatImageView, MaterialButton materialButton, MaterialCardView materialCardView, Chip chip, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = appCompatImageView;
        this.o0 = materialButton;
        this.p0 = materialCardView;
        this.q0 = chip;
        this.r0 = materialTextView;
        this.s0 = materialTextView2;
    }
}
