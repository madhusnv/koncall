package p001o;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.github.dhaval2404.colorpicker.model.ColorShape;

/* loaded from: classes5.dex */
public final class oi3 {

    /* renamed from: a */
    public static final oi3 f38397a = new oi3();

    /* renamed from: a */
    public final View m42259a(ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(m9e.adapter_material_color_picker, viewGroup, false);
        sq8.m48648g(viewInflate, "inflater.inflate(\n            R.layout.adapter_material_color_picker,\n            parent,\n            false\n        )");
        return viewInflate;
    }

    /* renamed from: b */
    public final void m42260b(CardView cardView, String str) {
        sq8.m48649h(cardView, "cardView");
        sq8.m48649h(str, "hexColor");
        cardView.setCardBackgroundColor(Color.parseColor(str));
    }

    /* renamed from: c */
    public final void m42261c(CardView cardView, ColorShape colorShape) {
        sq8.m48649h(cardView, "cardView");
        sq8.m48649h(colorShape, "colorShape");
        if (colorShape == ColorShape.SQAURE) {
            cardView.setRadius(cardView.getContext().getResources().getDimension(w6e.color_card_square_radius));
        }
    }
}
