package ai.salesmax.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p001o.fv7;
import p001o.sab;
import p001o.sq8;

/* loaded from: classes.dex */
public final class MenuRecyclerView extends RecyclerView {
    public final int B1;
    public final GridLayoutManager C1;
    public final fv7 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        fv7 fv7Var = new fv7();
        this.D1 = fv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(fv7Var);
        m9086h(new sab());
    }

    public final void K1(fv7.InterfaceC13576a interfaceC13576a) {
        sq8.m48649h(interfaceC13576a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.D1.m27554g(interfaceC13576a);
    }

    public final void L1() {
        this.D1.m27551d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        fv7 fv7Var = new fv7();
        this.D1 = fv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(fv7Var);
        m9086h(new sab());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        this.B1 = 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.C1 = gridLayoutManager;
        fv7 fv7Var = new fv7();
        this.D1 = fv7Var;
        setHasFixedSize(true);
        setLayoutManager(gridLayoutManager);
        setAdapter(fv7Var);
        m9086h(new sab());
    }
}
