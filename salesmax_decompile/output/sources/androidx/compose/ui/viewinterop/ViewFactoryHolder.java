package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import p001o.btb;
import p001o.czi;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;
import p001o.v0f;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements czi {
    public final View k0;
    public xk7 l0;
    public xk7 m0;
    public xk7 n0;

    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$a */
    public static final class C1971a extends kf9 implements uk7 {
        public C1971a() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68694invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68694invoke() {
            ViewFactoryHolder.this.getReleaseBlock().invoke(ViewFactoryHolder.this.k0);
            ViewFactoryHolder.this.m5288f();
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$b */
    public static final class C1972b extends kf9 implements uk7 {
        public C1972b() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68695invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68695invoke() {
            ViewFactoryHolder.this.getResetBlock().invoke(ViewFactoryHolder.this.k0);
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$c */
    public static final class C1973c extends kf9 implements uk7 {
        public C1973c() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68696invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68696invoke() {
            ViewFactoryHolder.this.getUpdateBlock().invoke(ViewFactoryHolder.this.k0);
        }
    }

    private final void setSavableRegistryEntry(v0f.InterfaceC17489a interfaceC17489a) {
    }

    /* renamed from: f */
    public final void m5288f() {
        setSavableRegistryEntry(null);
    }

    public final btb getDispatcher() {
        return null;
    }

    public final xk7 getReleaseBlock() {
        return this.n0;
    }

    public final xk7 getResetBlock() {
        return this.m0;
    }

    @Override // p001o.czi
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final xk7 getUpdateBlock() {
        return this.l0;
    }

    @Override // p001o.czi
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "value");
        this.n0 = xk7Var;
        setRelease(new C1971a());
    }

    public final void setResetBlock(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "value");
        this.m0 = xk7Var;
        setReset(new C1972b());
    }

    public final void setUpdateBlock(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "value");
        this.l0 = xk7Var;
        setUpdate(new C1973c());
    }
}
