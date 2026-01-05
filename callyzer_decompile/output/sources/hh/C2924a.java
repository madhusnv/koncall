package hh;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import lh.C4473i;
import lh.InterfaceC4472h;
import og.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.a */
/* loaded from: classes.dex */
public final class C2924a extends z0 {

    /* renamed from: a */
    public final /* synthetic */ int f15955a;

    /* renamed from: b */
    public final /* synthetic */ Object f15956b;

    public /* synthetic */ C2924a(int i10, Object obj) {
        this.f15955a = i10;
        this.f15956b = obj;
    }

    @Override // og.z0
    /* renamed from: b */
    public final void mo7029b(int i10) {
        switch (this.f15955a) {
            case 0:
                break;
            default:
                C4473i c4473i = (C4473i) this.f15956b;
                c4473i.f22295d = true;
                InterfaceC4472h interfaceC4472h = (InterfaceC4472h) c4473i.f22296e.get();
                if (interfaceC4472h != null) {
                    C2928e c2928e = (C2928e) interfaceC4472h;
                    c2928e.m7060t();
                    c2928e.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // og.z0
    /* renamed from: c */
    public final void mo7030c(Typeface typeface, boolean z6) {
        switch (this.f15955a) {
            case 0:
                Chip chip = (Chip) this.f15956b;
                C2928e c2928e = chip.f6811e;
                chip.setText(c2928e.I1 ? c2928e.f15966I : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z6) {
                    C4473i c4473i = (C4473i) this.f15956b;
                    c4473i.f22295d = true;
                    InterfaceC4472h interfaceC4472h = (InterfaceC4472h) c4473i.f22296e.get();
                    if (interfaceC4472h != null) {
                        C2928e c2928e2 = (C2928e) interfaceC4472h;
                        c2928e2.m7060t();
                        c2928e2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    /* renamed from: d */
    private final void m7028d(int i10) {
    }
}
