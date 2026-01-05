package p001o;

import ai.salesmax.model.PhoneDetail;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final class s6d extends ArrayAdapter {

    /* renamed from: a */
    public final List f44876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6d(Context context, List list) {
        super(context, 0, list);
        sq8.m48649h(context, "context");
        sq8.m48649h(list, "phoneDetails");
        this.f44876a = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(p9e.item_select_number, viewGroup, false);
        }
        PhoneDetail phoneDetail = (PhoneDetail) this.f44876a.get(i);
        View viewFindViewById = view.findViewById(z8e.textViewPhoneNumber);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = view.findViewById(z8e.imageViewWhatsapp);
        sq8.m48648g(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(phoneDetail.getNumber());
        if (phoneDetail.isWhatsapp()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        sq8.m48646e(view);
        return view;
    }
}
