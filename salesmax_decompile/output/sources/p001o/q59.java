package p001o;

import ai.salesmax.services.model.WabaPhoneNumberInfo;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class q59 extends ewi {
    public final CardView n0;
    public final LinearLayout o0;
    public final MaterialButton p0;
    public final Chip q0;
    public final MaterialTextView r0;
    public WabaPhoneNumberInfo s0;
    public Integer t0;
    public ck6 u0;

    public q59(Object obj, View view, int i, CardView cardView, LinearLayout linearLayout, MaterialButton materialButton, Chip chip, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = cardView;
        this.o0 = linearLayout;
        this.p0 = materialButton;
        this.q0 = chip;
        this.r0 = materialTextView;
    }
}
