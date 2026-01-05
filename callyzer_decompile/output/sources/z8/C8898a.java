package z8;

import a9.AbstractC0067f;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import ex.InterfaceC2137a;
import g4.AbstractC2499o;
import g4.C2490f;
import g4.C2498n;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4155m;
import p020v.a1;
import qw.a0;
import w3.w0;
import x1.s1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z8.a */
/* loaded from: classes.dex */
public final class C8898a extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f42857a = 1;

    /* renamed from: b */
    public final /* synthetic */ Object f42858b;

    /* renamed from: c */
    public final /* synthetic */ Object f42859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8898a(s1 s1Var, C2490f c2490f, w0 w0Var) {
        super(0);
        this.f42858b = c2490f;
        this.f42859c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f42857a) {
            case 0:
                AbstractC0067f abstractC0067f = ((AbstractC8900c) this.f42858b).f42862a;
                C8899b c8899b = (C8899b) this.f42859c;
                abstractC0067f.getClass();
                synchronized (abstractC0067f.f253c) {
                    if (((LinkedHashSet) abstractC0067f.f255e).remove(c8899b) && ((LinkedHashSet) abstractC0067f.f255e).isEmpty()) {
                        abstractC0067f.mo184f();
                    }
                }
                return a0.f30746a;
            default:
                AbstractC2499o abstractC2499o = (AbstractC2499o) ((C2490f) this.f42858b).f13595a;
                w0 w0Var = (w0) this.f42859c;
                if (abstractC2499o instanceof C2498n) {
                    try {
                        String str = ((C2498n) abstractC2499o).f13682a;
                        w0Var.getClass();
                        try {
                            w0Var.f38045a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e2) {
                            throw new IllegalArgumentException(a1.m14328h('.', "Can't open ", str), e2);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8898a(AbstractC8900c abstractC8900c, C8899b c8899b) {
        super(0);
        this.f42858b = abstractC8900c;
        this.f42859c = c8899b;
    }
}
