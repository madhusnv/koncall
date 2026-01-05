package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import com.google.firebase.analytics.FirebaseAnalytics;
import p001o.bqb;
import p001o.g6f;
import p001o.go3;
import p001o.id5;
import p001o.kf9;
import p001o.nl7;
import p001o.see;
import p001o.sq8;
import p001o.txf;
import p001o.un3;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: q */
    public final bqb f6360q;

    /* renamed from: s */
    public boolean f6361s;

    /* renamed from: androidx.compose.ui.platform.ComposeView$a */
    public static final class C1955a extends kf9 implements nl7 {

        /* renamed from: b */
        public final /* synthetic */ int f6363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1955a(int i) {
            super(2);
            this.f6363b = i;
        }

        /* renamed from: a */
        public final void m5091a(un3 un3Var, int i) {
            ComposeView.this.mo5019a(un3Var, see.m48284a(this.f6363b | 1));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5091a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
        sq8.m48649h(context, "context");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: a */
    public void mo5019a(un3 un3Var, int i) {
        un3 un3VarMo27200b = un3Var.mo27200b(420213850);
        if (go3.m29189I()) {
            go3.m29200T(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        nl7 nl7Var = (nl7) this.f6360q.getValue();
        if (nl7Var != null) {
            nl7Var.invoke(un3VarMo27200b, 0);
        }
        if (go3.m29189I()) {
            go3.m29199S();
        }
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d == null) {
            return;
        }
        g6fVarMo27202d.mo28099a(new C1955a(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        sq8.m48648g(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6361s;
    }

    public final void setContent(nl7 nl7Var) {
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        this.f6361s = true;
        this.f6360q.setValue(nl7Var);
        if (isAttachedToWindow()) {
            m5022d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        sq8.m48649h(context, "context");
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, id5 id5Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        this.f6360q = txf.m50750c(null, null, 2, null);
    }
}
