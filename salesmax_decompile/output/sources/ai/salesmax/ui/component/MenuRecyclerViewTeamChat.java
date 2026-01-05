package ai.salesmax.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p001o.hv7;
import p001o.sab;
import p001o.sq8;

/* loaded from: classes.dex */
public final class MenuRecyclerViewTeamChat extends RecyclerView {
    public final int B1;
    public final GridLayoutManager C1;
    public final hv7 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerViewTeamChat(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        hv7 hv7Var = new hv7();
        this.D1 = hv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(hv7Var);
        m9086h(new sab());
    }

    public final void K1(hv7.InterfaceC14105a interfaceC14105a) {
        sq8.m48649h(interfaceC14105a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.D1.m31210g(interfaceC14105a);
    }

    public final void L1() {
        this.D1.m31207d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerViewTeamChat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        hv7 hv7Var = new hv7();
        this.D1 = hv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(hv7Var);
        m9086h(new sab());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerViewTeamChat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        hv7 hv7Var = new hv7();
        this.D1 = hv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(hv7Var);
        m9086h(new sab());
    }
}
